// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/channelz/v1/channelz.proto

package io.grpc.channelz.v1;

public interface GetServersRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grpc.channelz.v1.GetServersRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * start_server_id indicates that only servers at or above this id should be
   * included in the results.
   * To request the first page, this must be set to 0. To request
   * subsequent pages, the client generates this value by adding 1 to
   * the highest seen result ID.
   * </pre>
   *
   * <code>int64 start_server_id = 1;</code>
   */
  long getStartServerId();

  /**
   * <pre>
   * If non-zero, the server will return a page of results containing
   * at most this many items. If zero, the server will choose a
   * reasonable page size.  Must never be negative.
   * </pre>
   *
   * <code>int64 max_results = 2;</code>
   */
  long getMaxResults();
}
