package org.grpc.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: CacheElasticProcessService.proto")
public final class CacheElasticProcessQueueServiceGrpc {

  private CacheElasticProcessQueueServiceGrpc() {}

  public static final String SERVICE_NAME = "CacheElasticProcessQueueService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.grpc.proto.CacheElasticProcessQueueOuterClass.CacheElasticProcessQueue,
      org.grpc.proto.CacheElasticProcessQueueIdProtoOuterClass.CacheElasticProcessQueueIdProto> getAddCacheElasticProcessQueueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addCacheElasticProcessQueue",
      requestType = org.grpc.proto.CacheElasticProcessQueueOuterClass.CacheElasticProcessQueue.class,
      responseType = org.grpc.proto.CacheElasticProcessQueueIdProtoOuterClass.CacheElasticProcessQueueIdProto.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.grpc.proto.CacheElasticProcessQueueOuterClass.CacheElasticProcessQueue,
      org.grpc.proto.CacheElasticProcessQueueIdProtoOuterClass.CacheElasticProcessQueueIdProto> getAddCacheElasticProcessQueueMethod() {
    io.grpc.MethodDescriptor<org.grpc.proto.CacheElasticProcessQueueOuterClass.CacheElasticProcessQueue, org.grpc.proto.CacheElasticProcessQueueIdProtoOuterClass.CacheElasticProcessQueueIdProto> getAddCacheElasticProcessQueueMethod;
    if ((getAddCacheElasticProcessQueueMethod = CacheElasticProcessQueueServiceGrpc.getAddCacheElasticProcessQueueMethod) == null) {
      synchronized (CacheElasticProcessQueueServiceGrpc.class) {
        if ((getAddCacheElasticProcessQueueMethod = CacheElasticProcessQueueServiceGrpc.getAddCacheElasticProcessQueueMethod) == null) {
          CacheElasticProcessQueueServiceGrpc.getAddCacheElasticProcessQueueMethod = getAddCacheElasticProcessQueueMethod = 
              io.grpc.MethodDescriptor.<org.grpc.proto.CacheElasticProcessQueueOuterClass.CacheElasticProcessQueue, org.grpc.proto.CacheElasticProcessQueueIdProtoOuterClass.CacheElasticProcessQueueIdProto>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CacheElasticProcessQueueService", "addCacheElasticProcessQueue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.grpc.proto.CacheElasticProcessQueueOuterClass.CacheElasticProcessQueue.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.grpc.proto.CacheElasticProcessQueueIdProtoOuterClass.CacheElasticProcessQueueIdProto.getDefaultInstance()))
                  .setSchemaDescriptor(new CacheElasticProcessQueueServiceMethodDescriptorSupplier("addCacheElasticProcessQueue"))
                  .build();
          }
        }
     }
     return getAddCacheElasticProcessQueueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.grpc.proto.EmptyOuterClass.Empty,
      org.grpc.proto.IdListProtoOuterClass.IdListProto> getFindQueuedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findQueued",
      requestType = org.grpc.proto.EmptyOuterClass.Empty.class,
      responseType = org.grpc.proto.IdListProtoOuterClass.IdListProto.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.grpc.proto.EmptyOuterClass.Empty,
      org.grpc.proto.IdListProtoOuterClass.IdListProto> getFindQueuedMethod() {
    io.grpc.MethodDescriptor<org.grpc.proto.EmptyOuterClass.Empty, org.grpc.proto.IdListProtoOuterClass.IdListProto> getFindQueuedMethod;
    if ((getFindQueuedMethod = CacheElasticProcessQueueServiceGrpc.getFindQueuedMethod) == null) {
      synchronized (CacheElasticProcessQueueServiceGrpc.class) {
        if ((getFindQueuedMethod = CacheElasticProcessQueueServiceGrpc.getFindQueuedMethod) == null) {
          CacheElasticProcessQueueServiceGrpc.getFindQueuedMethod = getFindQueuedMethod = 
              io.grpc.MethodDescriptor.<org.grpc.proto.EmptyOuterClass.Empty, org.grpc.proto.IdListProtoOuterClass.IdListProto>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CacheElasticProcessQueueService", "findQueued"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.grpc.proto.EmptyOuterClass.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.grpc.proto.IdListProtoOuterClass.IdListProto.getDefaultInstance()))
                  .setSchemaDescriptor(new CacheElasticProcessQueueServiceMethodDescriptorSupplier("findQueued"))
                  .build();
          }
        }
     }
     return getFindQueuedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.grpc.proto.IdProtoOuterClass.IdProto,
      org.grpc.proto.CacheElasticProcessQueueOuterClass.CacheElasticProcessQueue> getGetCacheElasticProcessQueueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCacheElasticProcessQueue",
      requestType = org.grpc.proto.IdProtoOuterClass.IdProto.class,
      responseType = org.grpc.proto.CacheElasticProcessQueueOuterClass.CacheElasticProcessQueue.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.grpc.proto.IdProtoOuterClass.IdProto,
      org.grpc.proto.CacheElasticProcessQueueOuterClass.CacheElasticProcessQueue> getGetCacheElasticProcessQueueMethod() {
    io.grpc.MethodDescriptor<org.grpc.proto.IdProtoOuterClass.IdProto, org.grpc.proto.CacheElasticProcessQueueOuterClass.CacheElasticProcessQueue> getGetCacheElasticProcessQueueMethod;
    if ((getGetCacheElasticProcessQueueMethod = CacheElasticProcessQueueServiceGrpc.getGetCacheElasticProcessQueueMethod) == null) {
      synchronized (CacheElasticProcessQueueServiceGrpc.class) {
        if ((getGetCacheElasticProcessQueueMethod = CacheElasticProcessQueueServiceGrpc.getGetCacheElasticProcessQueueMethod) == null) {
          CacheElasticProcessQueueServiceGrpc.getGetCacheElasticProcessQueueMethod = getGetCacheElasticProcessQueueMethod = 
              io.grpc.MethodDescriptor.<org.grpc.proto.IdProtoOuterClass.IdProto, org.grpc.proto.CacheElasticProcessQueueOuterClass.CacheElasticProcessQueue>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CacheElasticProcessQueueService", "getCacheElasticProcessQueue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.grpc.proto.IdProtoOuterClass.IdProto.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.grpc.proto.CacheElasticProcessQueueOuterClass.CacheElasticProcessQueue.getDefaultInstance()))
                  .setSchemaDescriptor(new CacheElasticProcessQueueServiceMethodDescriptorSupplier("getCacheElasticProcessQueue"))
                  .build();
          }
        }
     }
     return getGetCacheElasticProcessQueueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.grpc.proto.EmptyOuterClass.Empty,
      org.grpc.proto.IdListProtoOuterClass.IdListProto> getFindHangingIdsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findHangingIds",
      requestType = org.grpc.proto.EmptyOuterClass.Empty.class,
      responseType = org.grpc.proto.IdListProtoOuterClass.IdListProto.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.grpc.proto.EmptyOuterClass.Empty,
      org.grpc.proto.IdListProtoOuterClass.IdListProto> getFindHangingIdsMethod() {
    io.grpc.MethodDescriptor<org.grpc.proto.EmptyOuterClass.Empty, org.grpc.proto.IdListProtoOuterClass.IdListProto> getFindHangingIdsMethod;
    if ((getFindHangingIdsMethod = CacheElasticProcessQueueServiceGrpc.getFindHangingIdsMethod) == null) {
      synchronized (CacheElasticProcessQueueServiceGrpc.class) {
        if ((getFindHangingIdsMethod = CacheElasticProcessQueueServiceGrpc.getFindHangingIdsMethod) == null) {
          CacheElasticProcessQueueServiceGrpc.getFindHangingIdsMethod = getFindHangingIdsMethod = 
              io.grpc.MethodDescriptor.<org.grpc.proto.EmptyOuterClass.Empty, org.grpc.proto.IdListProtoOuterClass.IdListProto>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CacheElasticProcessQueueService", "findHangingIds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.grpc.proto.EmptyOuterClass.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.grpc.proto.IdListProtoOuterClass.IdListProto.getDefaultInstance()))
                  .setSchemaDescriptor(new CacheElasticProcessQueueServiceMethodDescriptorSupplier("findHangingIds"))
                  .build();
          }
        }
     }
     return getFindHangingIdsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.grpc.proto.IdProtoOuterClass.IdProto,
      org.grpc.proto.EmptyOuterClass.Empty> getQueuedHangingByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "queuedHangingById",
      requestType = org.grpc.proto.IdProtoOuterClass.IdProto.class,
      responseType = org.grpc.proto.EmptyOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.grpc.proto.IdProtoOuterClass.IdProto,
      org.grpc.proto.EmptyOuterClass.Empty> getQueuedHangingByIdMethod() {
    io.grpc.MethodDescriptor<org.grpc.proto.IdProtoOuterClass.IdProto, org.grpc.proto.EmptyOuterClass.Empty> getQueuedHangingByIdMethod;
    if ((getQueuedHangingByIdMethod = CacheElasticProcessQueueServiceGrpc.getQueuedHangingByIdMethod) == null) {
      synchronized (CacheElasticProcessQueueServiceGrpc.class) {
        if ((getQueuedHangingByIdMethod = CacheElasticProcessQueueServiceGrpc.getQueuedHangingByIdMethod) == null) {
          CacheElasticProcessQueueServiceGrpc.getQueuedHangingByIdMethod = getQueuedHangingByIdMethod = 
              io.grpc.MethodDescriptor.<org.grpc.proto.IdProtoOuterClass.IdProto, org.grpc.proto.EmptyOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CacheElasticProcessQueueService", "queuedHangingById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.grpc.proto.IdProtoOuterClass.IdProto.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.grpc.proto.EmptyOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new CacheElasticProcessQueueServiceMethodDescriptorSupplier("queuedHangingById"))
                  .build();
          }
        }
     }
     return getQueuedHangingByIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CacheElasticProcessQueueServiceStub newStub(io.grpc.Channel channel) {
    return new CacheElasticProcessQueueServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CacheElasticProcessQueueServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CacheElasticProcessQueueServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CacheElasticProcessQueueServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CacheElasticProcessQueueServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class CacheElasticProcessQueueServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void addCacheElasticProcessQueue(org.grpc.proto.CacheElasticProcessQueueOuterClass.CacheElasticProcessQueue request,
        io.grpc.stub.StreamObserver<org.grpc.proto.CacheElasticProcessQueueIdProtoOuterClass.CacheElasticProcessQueueIdProto> responseObserver) {
      asyncUnimplementedUnaryCall(getAddCacheElasticProcessQueueMethod(), responseObserver);
    }

    /**
     */
    public void findQueued(org.grpc.proto.EmptyOuterClass.Empty request,
        io.grpc.stub.StreamObserver<org.grpc.proto.IdListProtoOuterClass.IdListProto> responseObserver) {
      asyncUnimplementedUnaryCall(getFindQueuedMethod(), responseObserver);
    }

    /**
     */
    public void getCacheElasticProcessQueue(org.grpc.proto.IdProtoOuterClass.IdProto request,
        io.grpc.stub.StreamObserver<org.grpc.proto.CacheElasticProcessQueueOuterClass.CacheElasticProcessQueue> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCacheElasticProcessQueueMethod(), responseObserver);
    }

    /**
     */
    public void findHangingIds(org.grpc.proto.EmptyOuterClass.Empty request,
        io.grpc.stub.StreamObserver<org.grpc.proto.IdListProtoOuterClass.IdListProto> responseObserver) {
      asyncUnimplementedUnaryCall(getFindHangingIdsMethod(), responseObserver);
    }

    /**
     */
    public void queuedHangingById(org.grpc.proto.IdProtoOuterClass.IdProto request,
        io.grpc.stub.StreamObserver<org.grpc.proto.EmptyOuterClass.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getQueuedHangingByIdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddCacheElasticProcessQueueMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.grpc.proto.CacheElasticProcessQueueOuterClass.CacheElasticProcessQueue,
                org.grpc.proto.CacheElasticProcessQueueIdProtoOuterClass.CacheElasticProcessQueueIdProto>(
                  this, METHODID_ADD_CACHE_ELASTIC_PROCESS_QUEUE)))
          .addMethod(
            getFindQueuedMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.grpc.proto.EmptyOuterClass.Empty,
                org.grpc.proto.IdListProtoOuterClass.IdListProto>(
                  this, METHODID_FIND_QUEUED)))
          .addMethod(
            getGetCacheElasticProcessQueueMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.grpc.proto.IdProtoOuterClass.IdProto,
                org.grpc.proto.CacheElasticProcessQueueOuterClass.CacheElasticProcessQueue>(
                  this, METHODID_GET_CACHE_ELASTIC_PROCESS_QUEUE)))
          .addMethod(
            getFindHangingIdsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.grpc.proto.EmptyOuterClass.Empty,
                org.grpc.proto.IdListProtoOuterClass.IdListProto>(
                  this, METHODID_FIND_HANGING_IDS)))
          .addMethod(
            getQueuedHangingByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.grpc.proto.IdProtoOuterClass.IdProto,
                org.grpc.proto.EmptyOuterClass.Empty>(
                  this, METHODID_QUEUED_HANGING_BY_ID)))
          .build();
    }
  }

  /**
   */
  public static final class CacheElasticProcessQueueServiceStub extends io.grpc.stub.AbstractStub<CacheElasticProcessQueueServiceStub> {
    private CacheElasticProcessQueueServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CacheElasticProcessQueueServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CacheElasticProcessQueueServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CacheElasticProcessQueueServiceStub(channel, callOptions);
    }

    /**
     */
    public void addCacheElasticProcessQueue(org.grpc.proto.CacheElasticProcessQueueOuterClass.CacheElasticProcessQueue request,
        io.grpc.stub.StreamObserver<org.grpc.proto.CacheElasticProcessQueueIdProtoOuterClass.CacheElasticProcessQueueIdProto> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddCacheElasticProcessQueueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findQueued(org.grpc.proto.EmptyOuterClass.Empty request,
        io.grpc.stub.StreamObserver<org.grpc.proto.IdListProtoOuterClass.IdListProto> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindQueuedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCacheElasticProcessQueue(org.grpc.proto.IdProtoOuterClass.IdProto request,
        io.grpc.stub.StreamObserver<org.grpc.proto.CacheElasticProcessQueueOuterClass.CacheElasticProcessQueue> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCacheElasticProcessQueueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findHangingIds(org.grpc.proto.EmptyOuterClass.Empty request,
        io.grpc.stub.StreamObserver<org.grpc.proto.IdListProtoOuterClass.IdListProto> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindHangingIdsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queuedHangingById(org.grpc.proto.IdProtoOuterClass.IdProto request,
        io.grpc.stub.StreamObserver<org.grpc.proto.EmptyOuterClass.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQueuedHangingByIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CacheElasticProcessQueueServiceBlockingStub extends io.grpc.stub.AbstractStub<CacheElasticProcessQueueServiceBlockingStub> {
    private CacheElasticProcessQueueServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CacheElasticProcessQueueServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CacheElasticProcessQueueServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CacheElasticProcessQueueServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.grpc.proto.CacheElasticProcessQueueIdProtoOuterClass.CacheElasticProcessQueueIdProto addCacheElasticProcessQueue(org.grpc.proto.CacheElasticProcessQueueOuterClass.CacheElasticProcessQueue request) {
      return blockingUnaryCall(
          getChannel(), getAddCacheElasticProcessQueueMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.grpc.proto.IdListProtoOuterClass.IdListProto findQueued(org.grpc.proto.EmptyOuterClass.Empty request) {
      return blockingUnaryCall(
          getChannel(), getFindQueuedMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.grpc.proto.CacheElasticProcessQueueOuterClass.CacheElasticProcessQueue getCacheElasticProcessQueue(org.grpc.proto.IdProtoOuterClass.IdProto request) {
      return blockingUnaryCall(
          getChannel(), getGetCacheElasticProcessQueueMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.grpc.proto.IdListProtoOuterClass.IdListProto findHangingIds(org.grpc.proto.EmptyOuterClass.Empty request) {
      return blockingUnaryCall(
          getChannel(), getFindHangingIdsMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.grpc.proto.EmptyOuterClass.Empty queuedHangingById(org.grpc.proto.IdProtoOuterClass.IdProto request) {
      return blockingUnaryCall(
          getChannel(), getQueuedHangingByIdMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CacheElasticProcessQueueServiceFutureStub extends io.grpc.stub.AbstractStub<CacheElasticProcessQueueServiceFutureStub> {
    private CacheElasticProcessQueueServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CacheElasticProcessQueueServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CacheElasticProcessQueueServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CacheElasticProcessQueueServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.grpc.proto.CacheElasticProcessQueueIdProtoOuterClass.CacheElasticProcessQueueIdProto> addCacheElasticProcessQueue(
        org.grpc.proto.CacheElasticProcessQueueOuterClass.CacheElasticProcessQueue request) {
      return futureUnaryCall(
          getChannel().newCall(getAddCacheElasticProcessQueueMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.grpc.proto.IdListProtoOuterClass.IdListProto> findQueued(
        org.grpc.proto.EmptyOuterClass.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getFindQueuedMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.grpc.proto.CacheElasticProcessQueueOuterClass.CacheElasticProcessQueue> getCacheElasticProcessQueue(
        org.grpc.proto.IdProtoOuterClass.IdProto request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCacheElasticProcessQueueMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.grpc.proto.IdListProtoOuterClass.IdListProto> findHangingIds(
        org.grpc.proto.EmptyOuterClass.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getFindHangingIdsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.grpc.proto.EmptyOuterClass.Empty> queuedHangingById(
        org.grpc.proto.IdProtoOuterClass.IdProto request) {
      return futureUnaryCall(
          getChannel().newCall(getQueuedHangingByIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_CACHE_ELASTIC_PROCESS_QUEUE = 0;
  private static final int METHODID_FIND_QUEUED = 1;
  private static final int METHODID_GET_CACHE_ELASTIC_PROCESS_QUEUE = 2;
  private static final int METHODID_FIND_HANGING_IDS = 3;
  private static final int METHODID_QUEUED_HANGING_BY_ID = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CacheElasticProcessQueueServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CacheElasticProcessQueueServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_CACHE_ELASTIC_PROCESS_QUEUE:
          serviceImpl.addCacheElasticProcessQueue((org.grpc.proto.CacheElasticProcessQueueOuterClass.CacheElasticProcessQueue) request,
              (io.grpc.stub.StreamObserver<org.grpc.proto.CacheElasticProcessQueueIdProtoOuterClass.CacheElasticProcessQueueIdProto>) responseObserver);
          break;
        case METHODID_FIND_QUEUED:
          serviceImpl.findQueued((org.grpc.proto.EmptyOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<org.grpc.proto.IdListProtoOuterClass.IdListProto>) responseObserver);
          break;
        case METHODID_GET_CACHE_ELASTIC_PROCESS_QUEUE:
          serviceImpl.getCacheElasticProcessQueue((org.grpc.proto.IdProtoOuterClass.IdProto) request,
              (io.grpc.stub.StreamObserver<org.grpc.proto.CacheElasticProcessQueueOuterClass.CacheElasticProcessQueue>) responseObserver);
          break;
        case METHODID_FIND_HANGING_IDS:
          serviceImpl.findHangingIds((org.grpc.proto.EmptyOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<org.grpc.proto.IdListProtoOuterClass.IdListProto>) responseObserver);
          break;
        case METHODID_QUEUED_HANGING_BY_ID:
          serviceImpl.queuedHangingById((org.grpc.proto.IdProtoOuterClass.IdProto) request,
              (io.grpc.stub.StreamObserver<org.grpc.proto.EmptyOuterClass.Empty>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CacheElasticProcessQueueServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CacheElasticProcessQueueServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.grpc.proto.CacheElasticProcessService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CacheElasticProcessQueueService");
    }
  }

  private static final class CacheElasticProcessQueueServiceFileDescriptorSupplier
      extends CacheElasticProcessQueueServiceBaseDescriptorSupplier {
    CacheElasticProcessQueueServiceFileDescriptorSupplier() {}
  }

  private static final class CacheElasticProcessQueueServiceMethodDescriptorSupplier
      extends CacheElasticProcessQueueServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CacheElasticProcessQueueServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CacheElasticProcessQueueServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CacheElasticProcessQueueServiceFileDescriptorSupplier())
              .addMethod(getAddCacheElasticProcessQueueMethod())
              .addMethod(getFindQueuedMethod())
              .addMethod(getGetCacheElasticProcessQueueMethod())
              .addMethod(getFindHangingIdsMethod())
              .addMethod(getQueuedHangingByIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
