package com.google.net.stubby.newtransport;

import static com.google.net.stubby.newtransport.StreamState.CLOSED;
import static com.google.net.stubby.newtransport.StreamState.OPEN;
import static com.google.net.stubby.newtransport.StreamState.WRITE_ONLY;

import com.google.common.base.Preconditions;
import com.google.net.stubby.Metadata;
import com.google.net.stubby.Status;
import com.google.net.stubby.transport.Transport;

import javax.annotation.concurrent.GuardedBy;

/**
 * Abstract base class for {@link ServerStream} implementations.
 */
public abstract class AbstractServerStream extends AbstractStream implements ServerStream {

  private ServerStreamListener listener;

  private final Object stateLock = new Object();
  private volatile StreamState state = StreamState.OPEN;
  /** Whether listener.closed() has been called. */
  @GuardedBy("stateLock")
  private boolean listenerClosed;
  /** Saved application status for notifying when graceful stream termination completes. */
  @GuardedBy("stateLock")
  private Status gracefulStatus;
  @GuardedBy("stateLock")
  private Metadata.Trailers gracefulTrailers;

  @Override
  protected final StreamListener listener() {
    return listener;
  }

  public final void setListener(ServerStreamListener listener) {
    this.listener = Preconditions.checkNotNull(listener, "listener");
  }

  @Override
  public final void close(Status status, Metadata.Trailers trailers) {
    Preconditions.checkNotNull(status, "status");
    Preconditions.checkNotNull(trailers, "trailers");
    outboundPhase(Phase.STATUS);
    synchronized (stateLock) {
      Preconditions.checkState(!status.isOk() || state == WRITE_ONLY,
          "Cannot close with OK before client half-closes");
      state = CLOSED;
      if (!listenerClosed) {
        // Delay calling listener.closed() until the status has been flushed to the network (which
        // is notified via complete()). Since there may be large buffers involved, the actual
        // completion of the RPC could be much later than this call.
        gracefulStatus = status;
        gracefulTrailers = trailers;
      }
    }
    closeFramer(status);
    dispose();
  }

  /**
   * The Stream is considered completely closed and there is no further opportunity for error. It
   * calls the listener's {@code closed()} if it was not already done by {@link #abortStream}. Note
   * that it is expected that either {@code closed()} or {@code abortStream()} was previously
   * called, as otherwise there is no status to provide to the listener.
   */
  public void complete() {
    Status status;
    synchronized (stateLock) {
      if (listenerClosed) {
        return;
      }
      listenerClosed = true;
      status = gracefulStatus;
      gracefulStatus = null;
    }
    if (status == null) {
      listener.closed(new Status(Transport.Code.INTERNAL, "successful complete() without close()"),
          new Metadata.Trailers());
      throw new IllegalStateException("successful complete() without close()");
    }
    listener.closed(status, gracefulTrailers);
  }

  @Override
  public StreamState state() {
    return state;
  }

  /**
   * Called when the remote end half-closes the stream.
   */
  public final void remoteEndClosed() {
    synchronized (stateLock) {
      Preconditions.checkState(state == OPEN, "Stream not OPEN");
      state = WRITE_ONLY;
    }
    inboundPhase(Phase.STATUS);
    listener.halfClosed();
  }

  /**
   * Aborts the stream with an error status, cleans up resources and notifies the listener if
   * necessary.
   *
   * <p>Unlike {@link #close(Status, Metadata.Trailers)}, this method is only called from the
   * transport. The transport should use this method instead of {@code close(Status)} for internal
   * errors to prevent exposing unexpected states and exceptions to the application.
   *
   * @param status the error status. Must not be Status.OK.
   * @param notifyClient true if the stream is still writable and you want to notify the client
   *                     about stream closure and send the status
   */
  public final void abortStream(Status status, boolean notifyClient) {
    Preconditions.checkArgument(!status.isOk(), "status must not be OK");
    boolean closeListener;
    synchronized (stateLock) {
      if (state == CLOSED) {
        // Can't actually notify client.
        notifyClient = false;
      }
      state = CLOSED;
      closeListener = !listenerClosed;
      listenerClosed = true;
    }

    try {
      if (notifyClient) {
        closeFramer(status);
      }
      dispose();
    } finally {
      if (closeListener) {
        listener.closed(status, new Metadata.Trailers());
      }
    }
  }
}
