// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CacheElasticProcessQueueIdProto.proto

package org.grpc.proto;

public final class CacheElasticProcessQueueIdProtoOuterClass {
  private CacheElasticProcessQueueIdProtoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CacheElasticProcessQueueIdProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CacheElasticProcessQueueIdProto)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int64 id = 1;</code>
     */
    long getId();
  }
  /**
   * Protobuf type {@code CacheElasticProcessQueueIdProto}
   */
  public  static final class CacheElasticProcessQueueIdProto extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CacheElasticProcessQueueIdProto)
      CacheElasticProcessQueueIdProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CacheElasticProcessQueueIdProto.newBuilder() to construct.
    private CacheElasticProcessQueueIdProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CacheElasticProcessQueueIdProto() {
      id_ = 0L;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CacheElasticProcessQueueIdProto(
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
            case 8: {

              id_ = input.readInt64();
              break;
            }
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
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
      return org.grpc.proto.CacheElasticProcessQueueIdProtoOuterClass.internal_static_CacheElasticProcessQueueIdProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.grpc.proto.CacheElasticProcessQueueIdProtoOuterClass.internal_static_CacheElasticProcessQueueIdProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.grpc.proto.CacheElasticProcessQueueIdProtoOuterClass.CacheElasticProcessQueueIdProto.class, org.grpc.proto.CacheElasticProcessQueueIdProtoOuterClass.CacheElasticProcessQueueIdProto.Builder.class);
    }

    public static final int ID_FIELD_NUMBER = 1;
    private long id_;
    /**
     * <code>int64 id = 1;</code>
     */
    public long getId() {
      return id_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (id_ != 0L) {
        output.writeInt64(1, id_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (id_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, id_);
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
      if (!(obj instanceof org.grpc.proto.CacheElasticProcessQueueIdProtoOuterClass.CacheElasticProcessQueueIdProto)) {
        return super.equals(obj);
      }
      org.grpc.proto.CacheElasticProcessQueueIdProtoOuterClass.CacheElasticProcessQueueIdProto other = (org.grpc.proto.CacheElasticProcessQueueIdProtoOuterClass.CacheElasticProcessQueueIdProto) obj;

      boolean result = true;
      result = result && (getId()
          == other.getId());
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
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getId());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.grpc.proto.CacheElasticProcessQueueIdProtoOuterClass.CacheElasticProcessQueueIdProto parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.grpc.proto.CacheElasticProcessQueueIdProtoOuterClass.CacheElasticProcessQueueIdProto parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.grpc.proto.CacheElasticProcessQueueIdProtoOuterClass.CacheElasticProcessQueueIdProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.grpc.proto.CacheElasticProcessQueueIdProtoOuterClass.CacheElasticProcessQueueIdProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.grpc.proto.CacheElasticProcessQueueIdProtoOuterClass.CacheElasticProcessQueueIdProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.grpc.proto.CacheElasticProcessQueueIdProtoOuterClass.CacheElasticProcessQueueIdProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.grpc.proto.CacheElasticProcessQueueIdProtoOuterClass.CacheElasticProcessQueueIdProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.grpc.proto.CacheElasticProcessQueueIdProtoOuterClass.CacheElasticProcessQueueIdProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.grpc.proto.CacheElasticProcessQueueIdProtoOuterClass.CacheElasticProcessQueueIdProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.grpc.proto.CacheElasticProcessQueueIdProtoOuterClass.CacheElasticProcessQueueIdProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.grpc.proto.CacheElasticProcessQueueIdProtoOuterClass.CacheElasticProcessQueueIdProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.grpc.proto.CacheElasticProcessQueueIdProtoOuterClass.CacheElasticProcessQueueIdProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(org.grpc.proto.CacheElasticProcessQueueIdProtoOuterClass.CacheElasticProcessQueueIdProto prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
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
     * Protobuf type {@code CacheElasticProcessQueueIdProto}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CacheElasticProcessQueueIdProto)
        org.grpc.proto.CacheElasticProcessQueueIdProtoOuterClass.CacheElasticProcessQueueIdProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.grpc.proto.CacheElasticProcessQueueIdProtoOuterClass.internal_static_CacheElasticProcessQueueIdProto_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.grpc.proto.CacheElasticProcessQueueIdProtoOuterClass.internal_static_CacheElasticProcessQueueIdProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.grpc.proto.CacheElasticProcessQueueIdProtoOuterClass.CacheElasticProcessQueueIdProto.class, org.grpc.proto.CacheElasticProcessQueueIdProtoOuterClass.CacheElasticProcessQueueIdProto.Builder.class);
      }

      // Construct using org.grpc.proto.CacheElasticProcessQueueIdProtoOuterClass.CacheElasticProcessQueueIdProto.newBuilder()
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
      @java.lang.Override
      public Builder clear() {
        super.clear();
        id_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.grpc.proto.CacheElasticProcessQueueIdProtoOuterClass.internal_static_CacheElasticProcessQueueIdProto_descriptor;
      }

      @java.lang.Override
      public org.grpc.proto.CacheElasticProcessQueueIdProtoOuterClass.CacheElasticProcessQueueIdProto getDefaultInstanceForType() {
        return org.grpc.proto.CacheElasticProcessQueueIdProtoOuterClass.CacheElasticProcessQueueIdProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.grpc.proto.CacheElasticProcessQueueIdProtoOuterClass.CacheElasticProcessQueueIdProto build() {
        org.grpc.proto.CacheElasticProcessQueueIdProtoOuterClass.CacheElasticProcessQueueIdProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.grpc.proto.CacheElasticProcessQueueIdProtoOuterClass.CacheElasticProcessQueueIdProto buildPartial() {
        org.grpc.proto.CacheElasticProcessQueueIdProtoOuterClass.CacheElasticProcessQueueIdProto result = new org.grpc.proto.CacheElasticProcessQueueIdProtoOuterClass.CacheElasticProcessQueueIdProto(this);
        result.id_ = id_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.grpc.proto.CacheElasticProcessQueueIdProtoOuterClass.CacheElasticProcessQueueIdProto) {
          return mergeFrom((org.grpc.proto.CacheElasticProcessQueueIdProtoOuterClass.CacheElasticProcessQueueIdProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.grpc.proto.CacheElasticProcessQueueIdProtoOuterClass.CacheElasticProcessQueueIdProto other) {
        if (other == org.grpc.proto.CacheElasticProcessQueueIdProtoOuterClass.CacheElasticProcessQueueIdProto.getDefaultInstance()) return this;
        if (other.getId() != 0L) {
          setId(other.getId());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.grpc.proto.CacheElasticProcessQueueIdProtoOuterClass.CacheElasticProcessQueueIdProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.grpc.proto.CacheElasticProcessQueueIdProtoOuterClass.CacheElasticProcessQueueIdProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long id_ ;
      /**
       * <code>int64 id = 1;</code>
       */
      public long getId() {
        return id_;
      }
      /**
       * <code>int64 id = 1;</code>
       */
      public Builder setId(long value) {
        
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 id = 1;</code>
       */
      public Builder clearId() {
        
        id_ = 0L;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:CacheElasticProcessQueueIdProto)
    }

    // @@protoc_insertion_point(class_scope:CacheElasticProcessQueueIdProto)
    private static final org.grpc.proto.CacheElasticProcessQueueIdProtoOuterClass.CacheElasticProcessQueueIdProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.grpc.proto.CacheElasticProcessQueueIdProtoOuterClass.CacheElasticProcessQueueIdProto();
    }

    public static org.grpc.proto.CacheElasticProcessQueueIdProtoOuterClass.CacheElasticProcessQueueIdProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CacheElasticProcessQueueIdProto>
        PARSER = new com.google.protobuf.AbstractParser<CacheElasticProcessQueueIdProto>() {
      @java.lang.Override
      public CacheElasticProcessQueueIdProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CacheElasticProcessQueueIdProto(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CacheElasticProcessQueueIdProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CacheElasticProcessQueueIdProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.grpc.proto.CacheElasticProcessQueueIdProtoOuterClass.CacheElasticProcessQueueIdProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CacheElasticProcessQueueIdProto_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CacheElasticProcessQueueIdProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%CacheElasticProcessQueueIdProto.proto\"" +
      "-\n\037CacheElasticProcessQueueIdProto\022\n\n\002id" +
      "\030\001 \001(\003B\020\n\016org.grpc.protob\006proto3"
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
        }, assigner);
    internal_static_CacheElasticProcessQueueIdProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CacheElasticProcessQueueIdProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CacheElasticProcessQueueIdProto_descriptor,
        new java.lang.String[] { "Id", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
