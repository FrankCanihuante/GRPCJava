// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/reflection/v1alpha/reflection.proto

package io.grpc.reflection.v1alpha;

/**
 * <pre>
 * A list of ServiceResponse sent by the server answering list_services request.
 * </pre>
 *
 * Protobuf type {@code grpc.reflection.v1alpha.ListServiceResponse}
 */
public  final class ListServiceResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:grpc.reflection.v1alpha.ListServiceResponse)
    ListServiceResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListServiceResponse.newBuilder() to construct.
  private ListServiceResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListServiceResponse() {
    service_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListServiceResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              service_ = new java.util.ArrayList<io.grpc.reflection.v1alpha.ServiceResponse>();
              mutable_bitField0_ |= 0x00000001;
            }
            service_.add(
                input.readMessage(io.grpc.reflection.v1alpha.ServiceResponse.parser(), extensionRegistry));
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        service_ = java.util.Collections.unmodifiableList(service_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grpc.reflection.v1alpha.ServerReflectionProto.internal_static_grpc_reflection_v1alpha_ListServiceResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.reflection.v1alpha.ServerReflectionProto.internal_static_grpc_reflection_v1alpha_ListServiceResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.reflection.v1alpha.ListServiceResponse.class, io.grpc.reflection.v1alpha.ListServiceResponse.Builder.class);
  }

  public static final int SERVICE_FIELD_NUMBER = 1;
  private java.util.List<io.grpc.reflection.v1alpha.ServiceResponse> service_;
  /**
   * <pre>
   * The information of each service may be expanded in the future, so we use
   * ServiceResponse message to encapsulate it.
   * </pre>
   *
   * <code>repeated .grpc.reflection.v1alpha.ServiceResponse service = 1;</code>
   */
  public java.util.List<io.grpc.reflection.v1alpha.ServiceResponse> getServiceList() {
    return service_;
  }
  /**
   * <pre>
   * The information of each service may be expanded in the future, so we use
   * ServiceResponse message to encapsulate it.
   * </pre>
   *
   * <code>repeated .grpc.reflection.v1alpha.ServiceResponse service = 1;</code>
   */
  public java.util.List<? extends io.grpc.reflection.v1alpha.ServiceResponseOrBuilder> 
      getServiceOrBuilderList() {
    return service_;
  }
  /**
   * <pre>
   * The information of each service may be expanded in the future, so we use
   * ServiceResponse message to encapsulate it.
   * </pre>
   *
   * <code>repeated .grpc.reflection.v1alpha.ServiceResponse service = 1;</code>
   */
  public int getServiceCount() {
    return service_.size();
  }
  /**
   * <pre>
   * The information of each service may be expanded in the future, so we use
   * ServiceResponse message to encapsulate it.
   * </pre>
   *
   * <code>repeated .grpc.reflection.v1alpha.ServiceResponse service = 1;</code>
   */
  public io.grpc.reflection.v1alpha.ServiceResponse getService(int index) {
    return service_.get(index);
  }
  /**
   * <pre>
   * The information of each service may be expanded in the future, so we use
   * ServiceResponse message to encapsulate it.
   * </pre>
   *
   * <code>repeated .grpc.reflection.v1alpha.ServiceResponse service = 1;</code>
   */
  public io.grpc.reflection.v1alpha.ServiceResponseOrBuilder getServiceOrBuilder(
      int index) {
    return service_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < service_.size(); i++) {
      output.writeMessage(1, service_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < service_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, service_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.grpc.reflection.v1alpha.ListServiceResponse)) {
      return super.equals(obj);
    }
    io.grpc.reflection.v1alpha.ListServiceResponse other = (io.grpc.reflection.v1alpha.ListServiceResponse) obj;

    boolean result = true;
    result = result && getServiceList()
        .equals(other.getServiceList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getServiceCount() > 0) {
      hash = (37 * hash) + SERVICE_FIELD_NUMBER;
      hash = (53 * hash) + getServiceList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.reflection.v1alpha.ListServiceResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.reflection.v1alpha.ListServiceResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.reflection.v1alpha.ListServiceResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.reflection.v1alpha.ListServiceResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.reflection.v1alpha.ListServiceResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.reflection.v1alpha.ListServiceResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.reflection.v1alpha.ListServiceResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.reflection.v1alpha.ListServiceResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.reflection.v1alpha.ListServiceResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grpc.reflection.v1alpha.ListServiceResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.reflection.v1alpha.ListServiceResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.reflection.v1alpha.ListServiceResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.grpc.reflection.v1alpha.ListServiceResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * A list of ServiceResponse sent by the server answering list_services request.
   * </pre>
   *
   * Protobuf type {@code grpc.reflection.v1alpha.ListServiceResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grpc.reflection.v1alpha.ListServiceResponse)
      io.grpc.reflection.v1alpha.ListServiceResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.reflection.v1alpha.ServerReflectionProto.internal_static_grpc_reflection_v1alpha_ListServiceResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.reflection.v1alpha.ServerReflectionProto.internal_static_grpc_reflection_v1alpha_ListServiceResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.reflection.v1alpha.ListServiceResponse.class, io.grpc.reflection.v1alpha.ListServiceResponse.Builder.class);
    }

    // Construct using io.grpc.reflection.v1alpha.ListServiceResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getServiceFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (serviceBuilder_ == null) {
        service_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        serviceBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.reflection.v1alpha.ServerReflectionProto.internal_static_grpc_reflection_v1alpha_ListServiceResponse_descriptor;
    }

    public io.grpc.reflection.v1alpha.ListServiceResponse getDefaultInstanceForType() {
      return io.grpc.reflection.v1alpha.ListServiceResponse.getDefaultInstance();
    }

    public io.grpc.reflection.v1alpha.ListServiceResponse build() {
      io.grpc.reflection.v1alpha.ListServiceResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.grpc.reflection.v1alpha.ListServiceResponse buildPartial() {
      io.grpc.reflection.v1alpha.ListServiceResponse result = new io.grpc.reflection.v1alpha.ListServiceResponse(this);
      int from_bitField0_ = bitField0_;
      if (serviceBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          service_ = java.util.Collections.unmodifiableList(service_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.service_ = service_;
      } else {
        result.service_ = serviceBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.grpc.reflection.v1alpha.ListServiceResponse) {
        return mergeFrom((io.grpc.reflection.v1alpha.ListServiceResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.reflection.v1alpha.ListServiceResponse other) {
      if (other == io.grpc.reflection.v1alpha.ListServiceResponse.getDefaultInstance()) return this;
      if (serviceBuilder_ == null) {
        if (!other.service_.isEmpty()) {
          if (service_.isEmpty()) {
            service_ = other.service_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureServiceIsMutable();
            service_.addAll(other.service_);
          }
          onChanged();
        }
      } else {
        if (!other.service_.isEmpty()) {
          if (serviceBuilder_.isEmpty()) {
            serviceBuilder_.dispose();
            serviceBuilder_ = null;
            service_ = other.service_;
            bitField0_ = (bitField0_ & ~0x00000001);
            serviceBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getServiceFieldBuilder() : null;
          } else {
            serviceBuilder_.addAllMessages(other.service_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.grpc.reflection.v1alpha.ListServiceResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grpc.reflection.v1alpha.ListServiceResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<io.grpc.reflection.v1alpha.ServiceResponse> service_ =
      java.util.Collections.emptyList();
    private void ensureServiceIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        service_ = new java.util.ArrayList<io.grpc.reflection.v1alpha.ServiceResponse>(service_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grpc.reflection.v1alpha.ServiceResponse, io.grpc.reflection.v1alpha.ServiceResponse.Builder, io.grpc.reflection.v1alpha.ServiceResponseOrBuilder> serviceBuilder_;

    /**
     * <pre>
     * The information of each service may be expanded in the future, so we use
     * ServiceResponse message to encapsulate it.
     * </pre>
     *
     * <code>repeated .grpc.reflection.v1alpha.ServiceResponse service = 1;</code>
     */
    public java.util.List<io.grpc.reflection.v1alpha.ServiceResponse> getServiceList() {
      if (serviceBuilder_ == null) {
        return java.util.Collections.unmodifiableList(service_);
      } else {
        return serviceBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The information of each service may be expanded in the future, so we use
     * ServiceResponse message to encapsulate it.
     * </pre>
     *
     * <code>repeated .grpc.reflection.v1alpha.ServiceResponse service = 1;</code>
     */
    public int getServiceCount() {
      if (serviceBuilder_ == null) {
        return service_.size();
      } else {
        return serviceBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The information of each service may be expanded in the future, so we use
     * ServiceResponse message to encapsulate it.
     * </pre>
     *
     * <code>repeated .grpc.reflection.v1alpha.ServiceResponse service = 1;</code>
     */
    public io.grpc.reflection.v1alpha.ServiceResponse getService(int index) {
      if (serviceBuilder_ == null) {
        return service_.get(index);
      } else {
        return serviceBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The information of each service may be expanded in the future, so we use
     * ServiceResponse message to encapsulate it.
     * </pre>
     *
     * <code>repeated .grpc.reflection.v1alpha.ServiceResponse service = 1;</code>
     */
    public Builder setService(
        int index, io.grpc.reflection.v1alpha.ServiceResponse value) {
      if (serviceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureServiceIsMutable();
        service_.set(index, value);
        onChanged();
      } else {
        serviceBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The information of each service may be expanded in the future, so we use
     * ServiceResponse message to encapsulate it.
     * </pre>
     *
     * <code>repeated .grpc.reflection.v1alpha.ServiceResponse service = 1;</code>
     */
    public Builder setService(
        int index, io.grpc.reflection.v1alpha.ServiceResponse.Builder builderForValue) {
      if (serviceBuilder_ == null) {
        ensureServiceIsMutable();
        service_.set(index, builderForValue.build());
        onChanged();
      } else {
        serviceBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The information of each service may be expanded in the future, so we use
     * ServiceResponse message to encapsulate it.
     * </pre>
     *
     * <code>repeated .grpc.reflection.v1alpha.ServiceResponse service = 1;</code>
     */
    public Builder addService(io.grpc.reflection.v1alpha.ServiceResponse value) {
      if (serviceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureServiceIsMutable();
        service_.add(value);
        onChanged();
      } else {
        serviceBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The information of each service may be expanded in the future, so we use
     * ServiceResponse message to encapsulate it.
     * </pre>
     *
     * <code>repeated .grpc.reflection.v1alpha.ServiceResponse service = 1;</code>
     */
    public Builder addService(
        int index, io.grpc.reflection.v1alpha.ServiceResponse value) {
      if (serviceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureServiceIsMutable();
        service_.add(index, value);
        onChanged();
      } else {
        serviceBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The information of each service may be expanded in the future, so we use
     * ServiceResponse message to encapsulate it.
     * </pre>
     *
     * <code>repeated .grpc.reflection.v1alpha.ServiceResponse service = 1;</code>
     */
    public Builder addService(
        io.grpc.reflection.v1alpha.ServiceResponse.Builder builderForValue) {
      if (serviceBuilder_ == null) {
        ensureServiceIsMutable();
        service_.add(builderForValue.build());
        onChanged();
      } else {
        serviceBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The information of each service may be expanded in the future, so we use
     * ServiceResponse message to encapsulate it.
     * </pre>
     *
     * <code>repeated .grpc.reflection.v1alpha.ServiceResponse service = 1;</code>
     */
    public Builder addService(
        int index, io.grpc.reflection.v1alpha.ServiceResponse.Builder builderForValue) {
      if (serviceBuilder_ == null) {
        ensureServiceIsMutable();
        service_.add(index, builderForValue.build());
        onChanged();
      } else {
        serviceBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The information of each service may be expanded in the future, so we use
     * ServiceResponse message to encapsulate it.
     * </pre>
     *
     * <code>repeated .grpc.reflection.v1alpha.ServiceResponse service = 1;</code>
     */
    public Builder addAllService(
        java.lang.Iterable<? extends io.grpc.reflection.v1alpha.ServiceResponse> values) {
      if (serviceBuilder_ == null) {
        ensureServiceIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, service_);
        onChanged();
      } else {
        serviceBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The information of each service may be expanded in the future, so we use
     * ServiceResponse message to encapsulate it.
     * </pre>
     *
     * <code>repeated .grpc.reflection.v1alpha.ServiceResponse service = 1;</code>
     */
    public Builder clearService() {
      if (serviceBuilder_ == null) {
        service_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        serviceBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The information of each service may be expanded in the future, so we use
     * ServiceResponse message to encapsulate it.
     * </pre>
     *
     * <code>repeated .grpc.reflection.v1alpha.ServiceResponse service = 1;</code>
     */
    public Builder removeService(int index) {
      if (serviceBuilder_ == null) {
        ensureServiceIsMutable();
        service_.remove(index);
        onChanged();
      } else {
        serviceBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The information of each service may be expanded in the future, so we use
     * ServiceResponse message to encapsulate it.
     * </pre>
     *
     * <code>repeated .grpc.reflection.v1alpha.ServiceResponse service = 1;</code>
     */
    public io.grpc.reflection.v1alpha.ServiceResponse.Builder getServiceBuilder(
        int index) {
      return getServiceFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The information of each service may be expanded in the future, so we use
     * ServiceResponse message to encapsulate it.
     * </pre>
     *
     * <code>repeated .grpc.reflection.v1alpha.ServiceResponse service = 1;</code>
     */
    public io.grpc.reflection.v1alpha.ServiceResponseOrBuilder getServiceOrBuilder(
        int index) {
      if (serviceBuilder_ == null) {
        return service_.get(index);  } else {
        return serviceBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The information of each service may be expanded in the future, so we use
     * ServiceResponse message to encapsulate it.
     * </pre>
     *
     * <code>repeated .grpc.reflection.v1alpha.ServiceResponse service = 1;</code>
     */
    public java.util.List<? extends io.grpc.reflection.v1alpha.ServiceResponseOrBuilder> 
         getServiceOrBuilderList() {
      if (serviceBuilder_ != null) {
        return serviceBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(service_);
      }
    }
    /**
     * <pre>
     * The information of each service may be expanded in the future, so we use
     * ServiceResponse message to encapsulate it.
     * </pre>
     *
     * <code>repeated .grpc.reflection.v1alpha.ServiceResponse service = 1;</code>
     */
    public io.grpc.reflection.v1alpha.ServiceResponse.Builder addServiceBuilder() {
      return getServiceFieldBuilder().addBuilder(
          io.grpc.reflection.v1alpha.ServiceResponse.getDefaultInstance());
    }
    /**
     * <pre>
     * The information of each service may be expanded in the future, so we use
     * ServiceResponse message to encapsulate it.
     * </pre>
     *
     * <code>repeated .grpc.reflection.v1alpha.ServiceResponse service = 1;</code>
     */
    public io.grpc.reflection.v1alpha.ServiceResponse.Builder addServiceBuilder(
        int index) {
      return getServiceFieldBuilder().addBuilder(
          index, io.grpc.reflection.v1alpha.ServiceResponse.getDefaultInstance());
    }
    /**
     * <pre>
     * The information of each service may be expanded in the future, so we use
     * ServiceResponse message to encapsulate it.
     * </pre>
     *
     * <code>repeated .grpc.reflection.v1alpha.ServiceResponse service = 1;</code>
     */
    public java.util.List<io.grpc.reflection.v1alpha.ServiceResponse.Builder> 
         getServiceBuilderList() {
      return getServiceFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grpc.reflection.v1alpha.ServiceResponse, io.grpc.reflection.v1alpha.ServiceResponse.Builder, io.grpc.reflection.v1alpha.ServiceResponseOrBuilder> 
        getServiceFieldBuilder() {
      if (serviceBuilder_ == null) {
        serviceBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.grpc.reflection.v1alpha.ServiceResponse, io.grpc.reflection.v1alpha.ServiceResponse.Builder, io.grpc.reflection.v1alpha.ServiceResponseOrBuilder>(
                service_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        service_ = null;
      }
      return serviceBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:grpc.reflection.v1alpha.ListServiceResponse)
  }

  // @@protoc_insertion_point(class_scope:grpc.reflection.v1alpha.ListServiceResponse)
  private static final io.grpc.reflection.v1alpha.ListServiceResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.reflection.v1alpha.ListServiceResponse();
  }

  public static io.grpc.reflection.v1alpha.ListServiceResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListServiceResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListServiceResponse>() {
    public ListServiceResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListServiceResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListServiceResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListServiceResponse> getParserForType() {
    return PARSER;
  }

  public io.grpc.reflection.v1alpha.ListServiceResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

