// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/api/v2/core/config_source.proto

package io.grpc.xds.shaded.envoy.api.v2.core;

public final class ConfigSourceOuterClass {
  private ConfigSourceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_api_v2_core_ApiConfigSource_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_api_v2_core_ApiConfigSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_api_v2_core_AggregatedConfigSource_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_api_v2_core_AggregatedConfigSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_api_v2_core_RateLimitSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_api_v2_core_RateLimitSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_api_v2_core_ConfigSource_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_api_v2_core_ConfigSource_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%envoy/api/v2/core/config_source.proto\022" +
      "\021envoy.api.v2.core\032$envoy/api/v2/core/gr" +
      "pc_service.proto\032\036google/protobuf/durati" +
      "on.proto\032\036google/protobuf/wrappers.proto" +
      "\032\027validate/validate.proto\"\224\003\n\017ApiConfigS" +
      "ource\022H\n\010api_type\030\001 \001(\0162*.envoy.api.v2.c" +
      "ore.ApiConfigSource.ApiTypeB\n\272\351\300\003\005\202\001\002\020\001\022" +
      "\025\n\rcluster_names\030\002 \003(\t\0225\n\rgrpc_services\030" +
      "\004 \003(\0132\036.envoy.api.v2.core.GrpcService\0220\n" +
      "\rrefresh_delay\030\003 \001(\0132\031.google.protobuf.D" +
      "uration\022@\n\017request_timeout\030\005 \001(\0132\031.googl" +
      "e.protobuf.DurationB\014\272\351\300\003\007\252\001\004*\002\010\000\022A\n\023rat" +
      "e_limit_settings\030\006 \001(\0132$.envoy.api.v2.co" +
      "re.RateLimitSettings\"2\n\007ApiType\022\023\n\013REST_" +
      "LEGACY\020\000\032\002\010\001\022\010\n\004REST\020\001\022\010\n\004GRPC\020\002\"\030\n\026Aggr" +
      "egatedConfigSource\"\210\001\n\021RateLimitSettings" +
      "\0220\n\nmax_tokens\030\001 \001(\0132\034.google.protobuf.U" +
      "Int32Value\022A\n\tfill_rate\030\002 \001(\0132\034.google.p" +
      "rotobuf.DoubleValueB\020\272\351\300\003\013\022\t!\000\000\000\000\000\000\000\000\"\273\001" +
      "\n\014ConfigSource\022\016\n\004path\030\001 \001(\tH\000\022?\n\021api_co" +
      "nfig_source\030\002 \001(\0132\".envoy.api.v2.core.Ap" +
      "iConfigSourceH\000\0228\n\003ads\030\003 \001(\0132).envoy.api" +
      ".v2.core.AggregatedConfigSourceH\000B \n\027con" +
      "fig_source_specifier\022\005\270\351\300\003\001B(\n$io.grpc.x" +
      "ds.shaded.envoy.api.v2.coreP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.grpc.xds.shaded.envoy.api.v2.core.GrpcServiceOuterClass.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          io.grpc.xds.shaded.validate.Validate.getDescriptor(),
        }, assigner);
    internal_static_envoy_api_v2_core_ApiConfigSource_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_api_v2_core_ApiConfigSource_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_api_v2_core_ApiConfigSource_descriptor,
        new java.lang.String[] { "ApiType", "ClusterNames", "GrpcServices", "RefreshDelay", "RequestTimeout", "RateLimitSettings", });
    internal_static_envoy_api_v2_core_AggregatedConfigSource_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_envoy_api_v2_core_AggregatedConfigSource_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_api_v2_core_AggregatedConfigSource_descriptor,
        new java.lang.String[] { });
    internal_static_envoy_api_v2_core_RateLimitSettings_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_envoy_api_v2_core_RateLimitSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_api_v2_core_RateLimitSettings_descriptor,
        new java.lang.String[] { "MaxTokens", "FillRate", });
    internal_static_envoy_api_v2_core_ConfigSource_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_envoy_api_v2_core_ConfigSource_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_api_v2_core_ConfigSource_descriptor,
        new java.lang.String[] { "Path", "ApiConfigSource", "Ads", "ConfigSourceSpecifier", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(io.grpc.xds.shaded.validate.Validate.required);
    registry.add(io.grpc.xds.shaded.validate.Validate.rules);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    io.grpc.xds.shaded.envoy.api.v2.core.GrpcServiceOuterClass.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    io.grpc.xds.shaded.validate.Validate.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
