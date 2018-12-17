// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: validate/validate.proto

package io.grpc.xds.shaded.validate;

/**
 * <pre>
 * MessageRules describe the constraints applied to embedded message values.
 * For message-type fields, validation is performed recursively.
 * </pre>
 *
 * Protobuf type {@code validate.MessageRules}
 */
public  final class MessageRules extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:validate.MessageRules)
    MessageRulesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MessageRules.newBuilder() to construct.
  private MessageRules(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MessageRules() {
    skip_ = false;
    required_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MessageRules(
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
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {
            bitField0_ |= 0x00000001;
            skip_ = input.readBool();
            break;
          }
          case 16: {
            bitField0_ |= 0x00000002;
            required_ = input.readBool();
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grpc.xds.shaded.validate.Validate.internal_static_validate_MessageRules_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.xds.shaded.validate.Validate.internal_static_validate_MessageRules_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.xds.shaded.validate.MessageRules.class, io.grpc.xds.shaded.validate.MessageRules.Builder.class);
  }

  private int bitField0_;
  public static final int SKIP_FIELD_NUMBER = 1;
  private boolean skip_;
  /**
   * <pre>
   * Skip specifies that the validation rules of this field should not be
   * evaluated
   * </pre>
   *
   * <code>optional bool skip = 1;</code>
   */
  public boolean hasSkip() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <pre>
   * Skip specifies that the validation rules of this field should not be
   * evaluated
   * </pre>
   *
   * <code>optional bool skip = 1;</code>
   */
  public boolean getSkip() {
    return skip_;
  }

  public static final int REQUIRED_FIELD_NUMBER = 2;
  private boolean required_;
  /**
   * <pre>
   * Required specifies that this field must be set
   * </pre>
   *
   * <code>optional bool required = 2;</code>
   */
  public boolean hasRequired() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <pre>
   * Required specifies that this field must be set
   * </pre>
   *
   * <code>optional bool required = 2;</code>
   */
  public boolean getRequired() {
    return required_;
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
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeBool(1, skip_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeBool(2, required_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, skip_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, required_);
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
    if (!(obj instanceof io.grpc.xds.shaded.validate.MessageRules)) {
      return super.equals(obj);
    }
    io.grpc.xds.shaded.validate.MessageRules other = (io.grpc.xds.shaded.validate.MessageRules) obj;

    boolean result = true;
    result = result && (hasSkip() == other.hasSkip());
    if (hasSkip()) {
      result = result && (getSkip()
          == other.getSkip());
    }
    result = result && (hasRequired() == other.hasRequired());
    if (hasRequired()) {
      result = result && (getRequired()
          == other.getRequired());
    }
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
    if (hasSkip()) {
      hash = (37 * hash) + SKIP_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getSkip());
    }
    if (hasRequired()) {
      hash = (37 * hash) + REQUIRED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getRequired());
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.xds.shaded.validate.MessageRules parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.xds.shaded.validate.MessageRules parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.xds.shaded.validate.MessageRules parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.xds.shaded.validate.MessageRules parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.xds.shaded.validate.MessageRules parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.xds.shaded.validate.MessageRules parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.xds.shaded.validate.MessageRules parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.xds.shaded.validate.MessageRules parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.xds.shaded.validate.MessageRules parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grpc.xds.shaded.validate.MessageRules parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.xds.shaded.validate.MessageRules parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.xds.shaded.validate.MessageRules parseFrom(
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
  public static Builder newBuilder(io.grpc.xds.shaded.validate.MessageRules prototype) {
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
   * MessageRules describe the constraints applied to embedded message values.
   * For message-type fields, validation is performed recursively.
   * </pre>
   *
   * Protobuf type {@code validate.MessageRules}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:validate.MessageRules)
      io.grpc.xds.shaded.validate.MessageRulesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.xds.shaded.validate.Validate.internal_static_validate_MessageRules_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.xds.shaded.validate.Validate.internal_static_validate_MessageRules_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.xds.shaded.validate.MessageRules.class, io.grpc.xds.shaded.validate.MessageRules.Builder.class);
    }

    // Construct using io.grpc.xds.shaded.validate.MessageRules.newBuilder()
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
      }
    }
    public Builder clear() {
      super.clear();
      skip_ = false;
      bitField0_ = (bitField0_ & ~0x00000001);
      required_ = false;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.xds.shaded.validate.Validate.internal_static_validate_MessageRules_descriptor;
    }

    public io.grpc.xds.shaded.validate.MessageRules getDefaultInstanceForType() {
      return io.grpc.xds.shaded.validate.MessageRules.getDefaultInstance();
    }

    public io.grpc.xds.shaded.validate.MessageRules build() {
      io.grpc.xds.shaded.validate.MessageRules result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.grpc.xds.shaded.validate.MessageRules buildPartial() {
      io.grpc.xds.shaded.validate.MessageRules result = new io.grpc.xds.shaded.validate.MessageRules(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.skip_ = skip_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.required_ = required_;
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof io.grpc.xds.shaded.validate.MessageRules) {
        return mergeFrom((io.grpc.xds.shaded.validate.MessageRules)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.xds.shaded.validate.MessageRules other) {
      if (other == io.grpc.xds.shaded.validate.MessageRules.getDefaultInstance()) return this;
      if (other.hasSkip()) {
        setSkip(other.getSkip());
      }
      if (other.hasRequired()) {
        setRequired(other.getRequired());
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
      io.grpc.xds.shaded.validate.MessageRules parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grpc.xds.shaded.validate.MessageRules) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private boolean skip_ ;
    /**
     * <pre>
     * Skip specifies that the validation rules of this field should not be
     * evaluated
     * </pre>
     *
     * <code>optional bool skip = 1;</code>
     */
    public boolean hasSkip() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <pre>
     * Skip specifies that the validation rules of this field should not be
     * evaluated
     * </pre>
     *
     * <code>optional bool skip = 1;</code>
     */
    public boolean getSkip() {
      return skip_;
    }
    /**
     * <pre>
     * Skip specifies that the validation rules of this field should not be
     * evaluated
     * </pre>
     *
     * <code>optional bool skip = 1;</code>
     */
    public Builder setSkip(boolean value) {
      bitField0_ |= 0x00000001;
      skip_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Skip specifies that the validation rules of this field should not be
     * evaluated
     * </pre>
     *
     * <code>optional bool skip = 1;</code>
     */
    public Builder clearSkip() {
      bitField0_ = (bitField0_ & ~0x00000001);
      skip_ = false;
      onChanged();
      return this;
    }

    private boolean required_ ;
    /**
     * <pre>
     * Required specifies that this field must be set
     * </pre>
     *
     * <code>optional bool required = 2;</code>
     */
    public boolean hasRequired() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <pre>
     * Required specifies that this field must be set
     * </pre>
     *
     * <code>optional bool required = 2;</code>
     */
    public boolean getRequired() {
      return required_;
    }
    /**
     * <pre>
     * Required specifies that this field must be set
     * </pre>
     *
     * <code>optional bool required = 2;</code>
     */
    public Builder setRequired(boolean value) {
      bitField0_ |= 0x00000002;
      required_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required specifies that this field must be set
     * </pre>
     *
     * <code>optional bool required = 2;</code>
     */
    public Builder clearRequired() {
      bitField0_ = (bitField0_ & ~0x00000002);
      required_ = false;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:validate.MessageRules)
  }

  // @@protoc_insertion_point(class_scope:validate.MessageRules)
  private static final io.grpc.xds.shaded.validate.MessageRules DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.xds.shaded.validate.MessageRules();
  }

  public static io.grpc.xds.shaded.validate.MessageRules getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<MessageRules>
      PARSER = new com.google.protobuf.AbstractParser<MessageRules>() {
    public MessageRules parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MessageRules(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MessageRules> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MessageRules> getParserForType() {
    return PARSER;
  }

  public io.grpc.xds.shaded.validate.MessageRules getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

