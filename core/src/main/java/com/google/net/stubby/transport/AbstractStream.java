package com.google.net.stubby.transport;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.io.Closeables;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.net.stubby.Status;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

import javax.annotation.Nullable;

/**
 * Abstract base class for {@link Stream} implementations.
 */
public abstract class AbstractStream<IdT> implements Stream {
  /**
   * Global to enable gRPC v2 protocol support, which may be incomplete. This is a complete hack
   * and should please, please, please be temporary to ease migration.
   */
  // TODO(user): remove this once v1 support is dropped.
  public static boolean GRPC_V2_PROTOCOL = false;

  /**
   * Indicates the phase of the GRPC stream in one direction.
   */
  protected enum Phase {
    HEADERS, MESSAGE, STATUS
  }

  private volatile IdT id;
  private final Framer framer;
  private final FutureCallback<Object> deframerErrorCallback = new FutureCallback<Object>() {
    @Override
    public void onSuccess(Object result) {}

    @Override
    public void onFailure(Throwable t) {
      deframeFailed(t);
    }
  };

  final GrpcDeframer deframer;
  final MessageDeframer2 deframer2;

  /**
   * Inbound phase is exclusively written to by the transport thread.
   */
  private Phase inboundPhase = Phase.HEADERS;

  /**
   * Outbound phase is exclusively written to by the application thread.
   */
  private Phase outboundPhase = Phase.HEADERS;

  AbstractStream(@Nullable Decompressor decompressor,
                           Executor deframerExecutor) {
    GrpcDeframer.Sink inboundMessageHandler = new GrpcDeframer.Sink() {
      @Override
      public ListenableFuture<Void> messageRead(InputStream input, final int length) {
        ListenableFuture<Void> future = null;
        try {
          future = receiveMessage(input, length);
          return future;
        } finally {
          closeWhenDone(future, input);
        }
      }

      @Override
      public void statusRead(Status status) {
        receiveStatus(status);
      }

      @Override
      public void endOfStream() {
        remoteEndClosed();
      }
    };
    Framer.Sink<ByteBuffer> outboundFrameHandler = new Framer.Sink<ByteBuffer>() {
      @Override
      public void deliverFrame(ByteBuffer frame, boolean endOfStream) {
        internalSendFrame(frame, endOfStream);
      }
    };

    // When the deframer reads the required number of bytes for the next message,
    // immediately return those bytes to inbound flow control.
    DeframerListener listener = new DeframerListener() {
      @Override
      public void bytesRead(int numBytes) {
        returnProcessedBytes(numBytes);
      }
    };
    if (!GRPC_V2_PROTOCOL) {
      framer = new MessageFramer(outboundFrameHandler, 4096);
      this.deframer =
          new GrpcDeframer(decompressor, inboundMessageHandler, deframerExecutor, listener);
      this.deframer2 = null;
    } else {
      framer = new MessageFramer2(outboundFrameHandler, 4096);
      this.deframer = null;
      this.deframer2 = new MessageDeframer2(inboundMessageHandler, deframerExecutor, listener);
    }
  }

  /**
   * Returns the internal id for this stream. Note that Id can be {@code null} for client streams
   * as the transport may defer creating the stream to the remote side until is has payload or
   * metadata to send.
   */
  @Nullable
  public IdT id() {
    return id;
  }

  /**
   * Set the internal id for this stream
   */
  public void id(IdT id) {
    Preconditions.checkState(id != null, "Can only set id once");
    this.id = id;
  }

  @Override
  public void writeMessage(InputStream message, int length, @Nullable Runnable accepted) {
    Preconditions.checkNotNull(message, "message");
    Preconditions.checkArgument(length >= 0, "length must be >= 0");
    outboundPhase(Phase.MESSAGE);
    if (!framer.isClosed()) {
      framer.writePayload(message, length);
    }

    // TODO(user): add flow control.
    if (accepted != null) {
      accepted.run();
    }
  }

  @Override
  public final void flush() {
    if (!framer.isClosed()) {
      framer.flush();
    }
  }

  /**
   * Closes the underlying framer.
   *
   * <p>No-op if the framer has already been closed.
   *
   * @param status if not null, will write the status to the framer before closing it
   */
  final void closeFramer(@Nullable Status status) {
    if (!framer.isClosed()) {
      if (status != null) {
        framer.writeStatus(status);
      }
      framer.close();
    }
  }

  /**
   * Free any resources associated with this stream. Subclass implementations must call this
   * version.
   * <p>
   * NOTE. Can be called by both the transport thread and the application thread. Transport
   * threads need to dispose when the remote side has terminated the stream. Application threads
   * will dispose when the application decides to close the stream as part of normal processing.
   * </p>
   */
  public void dispose() {
    framer.dispose();
  }

  /**
   * Sends an outbound frame to the remote end point.
   *
   * @param frame a buffer containing the chunk of data to be sent.
   * @param endOfStream if {@code true} indicates that no more data will be sent on the stream by
   *        this endpoint.
   */
  protected abstract void internalSendFrame(ByteBuffer frame, boolean endOfStream);

  /** A message was deframed. */
  protected abstract ListenableFuture<Void> receiveMessage(InputStream is, int length);

  /** A status was deframed. */
  protected abstract void receiveStatus(Status status);

  /** Deframer reached end of stream. */
  protected abstract void remoteEndClosed();

  /**
   * Returns the given number of processed bytes back to inbound flow control to enable receipt of
   * more data.
   */
  protected abstract void returnProcessedBytes(int processedBytes);

  /**
   * Called when a {@link #deframe(Buffer, boolean)} operation failed.
   */
  protected abstract void deframeFailed(Throwable cause);

  /**
   * Called to parse a received frame and attempt delivery of any completed
   * messages.
   */
  protected final void deframe(Buffer frame, boolean endOfStream) {
    ListenableFuture<?> future;
    if (GRPC_V2_PROTOCOL) {
      future = deframer2.deframe(frame, endOfStream);
    } else {
      future = deframer.deframe(frame, endOfStream);
    }
    if (future != null) {
      Futures.addCallback(future, deframerErrorCallback);
    }
  }

  /**
   * Delays delivery from the deframer until the given future completes.
   */
  protected final void delayDeframer(ListenableFuture<?> future) {
    if (GRPC_V2_PROTOCOL) {
      ListenableFuture<?> deliveryFuture = deframer2.delayProcessing(future);
      if (deliveryFuture != null) {
        Futures.addCallback(deliveryFuture, deframerErrorCallback);
      }
    } else {
      // V1 is a little broken as it doesn't strictly wait for the last payload handled
      // by the deframer to be processed by the application layer. Not worth fixing as will
      // be removed when the v1 deframer is removed.
    }
  }

  final Phase inboundPhase() {
    return inboundPhase;
  }

  /**
   * Transitions the inbound phase to the given phase and returns the previous phase.
   * If the transition is disallowed, throws an {@link IllegalStateException}.
   */
  final Phase inboundPhase(Phase nextPhase) {
    Phase tmp = inboundPhase;
    inboundPhase = verifyNextPhase(inboundPhase, nextPhase);
    return tmp;
  }

  final Phase outboundPhase() {
    return outboundPhase;
  }

  /**
   * Transitions the outbound phase to the given phase and returns the previous phase.
   * If the transition is disallowed, throws an {@link IllegalStateException}.
   */
  final Phase outboundPhase(Phase nextPhase) {
    Phase tmp = outboundPhase;
    outboundPhase = verifyNextPhase(outboundPhase, nextPhase);
    return tmp;
  }

  private Phase verifyNextPhase(Phase currentPhase, Phase nextPhase) {
    if (nextPhase.ordinal() < currentPhase.ordinal()) {
      throw new IllegalStateException(
          String.format("Cannot transition phase from %s to %s", currentPhase, nextPhase));
    }
    return nextPhase;
  }

  /**
   * If the given future is provided, closes the {@link InputStream} when it completes. Otherwise
   * the {@link InputStream} is closed immediately.
   */
  private static void closeWhenDone(@Nullable ListenableFuture<Void> future,
      final InputStream input) {
    if (future == null) {
      Closeables.closeQuietly(input);
      return;
    }

    // Close the buffer when the future completes.
    future.addListener(new Runnable() {
      @Override
      public void run() {
        Closeables.closeQuietly(input);
      }
    }, MoreExecutors.directExecutor());
  }

  /**
   * Can the stream receive data from its remote peer.
   */
  public boolean canReceive() {
    return inboundPhase() != Phase.STATUS;
  }

  /**
   * Can the stream send data to its remote peer.
   */
  public boolean canSend() {
    return outboundPhase() != Phase.STATUS;
  }

  /**
   * Is the stream fully closed. Note that this method is not thread-safe as inboundPhase and
   * outboundPhase are mutated in different threads. Tests must account for thread coordination
   * when calling.
   */
  @VisibleForTesting
  public boolean isClosed() {
    return inboundPhase() == Phase.STATUS && outboundPhase() == Phase.STATUS;
  }

  public String toString() {
    return toStringHelper().toString();
  }

  protected MoreObjects.ToStringHelper toStringHelper() {
    return MoreObjects.toStringHelper(this)
        .add("id", id())
        .add("inboundPhase", inboundPhase().name())
        .add("outboundPhase", outboundPhase().name());

  }
}
