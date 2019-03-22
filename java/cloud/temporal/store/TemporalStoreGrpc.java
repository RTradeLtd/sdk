package cloud.temporal.store;

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
 * <pre>
 * TemporalStore implements Temporal's storage APIs
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.19.0)",
    comments = "Source: proto/store.proto")
public final class TemporalStoreGrpc {

  private TemporalStoreGrpc() {}

  public static final String SERVICE_NAME = "store.TemporalStore";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<cloud.temporal.store.Store.Message,
      cloud.temporal.store.Store.Message> getStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Status",
      requestType = cloud.temporal.store.Store.Message.class,
      responseType = cloud.temporal.store.Store.Message.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloud.temporal.store.Store.Message,
      cloud.temporal.store.Store.Message> getStatusMethod() {
    io.grpc.MethodDescriptor<cloud.temporal.store.Store.Message, cloud.temporal.store.Store.Message> getStatusMethod;
    if ((getStatusMethod = TemporalStoreGrpc.getStatusMethod) == null) {
      synchronized (TemporalStoreGrpc.class) {
        if ((getStatusMethod = TemporalStoreGrpc.getStatusMethod) == null) {
          TemporalStoreGrpc.getStatusMethod = getStatusMethod = 
              io.grpc.MethodDescriptor.<cloud.temporal.store.Store.Message, cloud.temporal.store.Store.Message>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "store.TemporalStore", "Status"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.temporal.store.Store.Message.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.temporal.store.Store.Message.getDefaultInstance()))
                  .setSchemaDescriptor(new TemporalStoreMethodDescriptorSupplier("Status"))
                  .build();
          }
        }
     }
     return getStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloud.temporal.store.Store.Blob,
      cloud.temporal.store.Store.Object> getUploadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Upload",
      requestType = cloud.temporal.store.Store.Blob.class,
      responseType = cloud.temporal.store.Store.Object.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<cloud.temporal.store.Store.Blob,
      cloud.temporal.store.Store.Object> getUploadMethod() {
    io.grpc.MethodDescriptor<cloud.temporal.store.Store.Blob, cloud.temporal.store.Store.Object> getUploadMethod;
    if ((getUploadMethod = TemporalStoreGrpc.getUploadMethod) == null) {
      synchronized (TemporalStoreGrpc.class) {
        if ((getUploadMethod = TemporalStoreGrpc.getUploadMethod) == null) {
          TemporalStoreGrpc.getUploadMethod = getUploadMethod = 
              io.grpc.MethodDescriptor.<cloud.temporal.store.Store.Blob, cloud.temporal.store.Store.Object>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "store.TemporalStore", "Upload"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.temporal.store.Store.Blob.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.temporal.store.Store.Object.getDefaultInstance()))
                  .setSchemaDescriptor(new TemporalStoreMethodDescriptorSupplier("Upload"))
                  .build();
          }
        }
     }
     return getUploadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloud.temporal.store.Store.Object,
      cloud.temporal.store.Store.Message> getPinMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Pin",
      requestType = cloud.temporal.store.Store.Object.class,
      responseType = cloud.temporal.store.Store.Message.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloud.temporal.store.Store.Object,
      cloud.temporal.store.Store.Message> getPinMethod() {
    io.grpc.MethodDescriptor<cloud.temporal.store.Store.Object, cloud.temporal.store.Store.Message> getPinMethod;
    if ((getPinMethod = TemporalStoreGrpc.getPinMethod) == null) {
      synchronized (TemporalStoreGrpc.class) {
        if ((getPinMethod = TemporalStoreGrpc.getPinMethod) == null) {
          TemporalStoreGrpc.getPinMethod = getPinMethod = 
              io.grpc.MethodDescriptor.<cloud.temporal.store.Store.Object, cloud.temporal.store.Store.Message>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "store.TemporalStore", "Pin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.temporal.store.Store.Object.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.temporal.store.Store.Message.getDefaultInstance()))
                  .setSchemaDescriptor(new TemporalStoreMethodDescriptorSupplier("Pin"))
                  .build();
          }
        }
     }
     return getPinMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloud.temporal.store.Store.Object,
      cloud.temporal.store.Store.ObjectStats> getStatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Stat",
      requestType = cloud.temporal.store.Store.Object.class,
      responseType = cloud.temporal.store.Store.ObjectStats.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloud.temporal.store.Store.Object,
      cloud.temporal.store.Store.ObjectStats> getStatMethod() {
    io.grpc.MethodDescriptor<cloud.temporal.store.Store.Object, cloud.temporal.store.Store.ObjectStats> getStatMethod;
    if ((getStatMethod = TemporalStoreGrpc.getStatMethod) == null) {
      synchronized (TemporalStoreGrpc.class) {
        if ((getStatMethod = TemporalStoreGrpc.getStatMethod) == null) {
          TemporalStoreGrpc.getStatMethod = getStatMethod = 
              io.grpc.MethodDescriptor.<cloud.temporal.store.Store.Object, cloud.temporal.store.Store.ObjectStats>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "store.TemporalStore", "Stat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.temporal.store.Store.Object.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.temporal.store.Store.ObjectStats.getDefaultInstance()))
                  .setSchemaDescriptor(new TemporalStoreMethodDescriptorSupplier("Stat"))
                  .build();
          }
        }
     }
     return getStatMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TemporalStoreStub newStub(io.grpc.Channel channel) {
    return new TemporalStoreStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TemporalStoreBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TemporalStoreBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TemporalStoreFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TemporalStoreFutureStub(channel);
  }

  /**
   * <pre>
   * TemporalStore implements Temporal's storage APIs
   * </pre>
   */
  public static abstract class TemporalStoreImplBase implements io.grpc.BindableService {

    /**
     */
    public void status(cloud.temporal.store.Store.Message request,
        io.grpc.stub.StreamObserver<cloud.temporal.store.Store.Message> responseObserver) {
      asyncUnimplementedUnaryCall(getStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * Upload accepts files and directories
     * </pre>
     */
    public io.grpc.stub.StreamObserver<cloud.temporal.store.Store.Blob> upload(
        io.grpc.stub.StreamObserver<cloud.temporal.store.Store.Object> responseObserver) {
      return asyncUnimplementedStreamingCall(getUploadMethod(), responseObserver);
    }

    /**
     * <pre>
     * Pin handles new pins and pin extensions
     * </pre>
     */
    public void pin(cloud.temporal.store.Store.Object request,
        io.grpc.stub.StreamObserver<cloud.temporal.store.Store.Message> responseObserver) {
      asyncUnimplementedUnaryCall(getPinMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stat retrieves details about an object
     * </pre>
     */
    public void stat(cloud.temporal.store.Store.Object request,
        io.grpc.stub.StreamObserver<cloud.temporal.store.Store.ObjectStats> responseObserver) {
      asyncUnimplementedUnaryCall(getStatMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cloud.temporal.store.Store.Message,
                cloud.temporal.store.Store.Message>(
                  this, METHODID_STATUS)))
          .addMethod(
            getUploadMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                cloud.temporal.store.Store.Blob,
                cloud.temporal.store.Store.Object>(
                  this, METHODID_UPLOAD)))
          .addMethod(
            getPinMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cloud.temporal.store.Store.Object,
                cloud.temporal.store.Store.Message>(
                  this, METHODID_PIN)))
          .addMethod(
            getStatMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cloud.temporal.store.Store.Object,
                cloud.temporal.store.Store.ObjectStats>(
                  this, METHODID_STAT)))
          .build();
    }
  }

  /**
   * <pre>
   * TemporalStore implements Temporal's storage APIs
   * </pre>
   */
  public static final class TemporalStoreStub extends io.grpc.stub.AbstractStub<TemporalStoreStub> {
    private TemporalStoreStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TemporalStoreStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TemporalStoreStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TemporalStoreStub(channel, callOptions);
    }

    /**
     */
    public void status(cloud.temporal.store.Store.Message request,
        io.grpc.stub.StreamObserver<cloud.temporal.store.Store.Message> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Upload accepts files and directories
     * </pre>
     */
    public io.grpc.stub.StreamObserver<cloud.temporal.store.Store.Blob> upload(
        io.grpc.stub.StreamObserver<cloud.temporal.store.Store.Object> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getUploadMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Pin handles new pins and pin extensions
     * </pre>
     */
    public void pin(cloud.temporal.store.Store.Object request,
        io.grpc.stub.StreamObserver<cloud.temporal.store.Store.Message> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPinMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stat retrieves details about an object
     * </pre>
     */
    public void stat(cloud.temporal.store.Store.Object request,
        io.grpc.stub.StreamObserver<cloud.temporal.store.Store.ObjectStats> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStatMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * TemporalStore implements Temporal's storage APIs
   * </pre>
   */
  public static final class TemporalStoreBlockingStub extends io.grpc.stub.AbstractStub<TemporalStoreBlockingStub> {
    private TemporalStoreBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TemporalStoreBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TemporalStoreBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TemporalStoreBlockingStub(channel, callOptions);
    }

    /**
     */
    public cloud.temporal.store.Store.Message status(cloud.temporal.store.Store.Message request) {
      return blockingUnaryCall(
          getChannel(), getStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Pin handles new pins and pin extensions
     * </pre>
     */
    public cloud.temporal.store.Store.Message pin(cloud.temporal.store.Store.Object request) {
      return blockingUnaryCall(
          getChannel(), getPinMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Stat retrieves details about an object
     * </pre>
     */
    public cloud.temporal.store.Store.ObjectStats stat(cloud.temporal.store.Store.Object request) {
      return blockingUnaryCall(
          getChannel(), getStatMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * TemporalStore implements Temporal's storage APIs
   * </pre>
   */
  public static final class TemporalStoreFutureStub extends io.grpc.stub.AbstractStub<TemporalStoreFutureStub> {
    private TemporalStoreFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TemporalStoreFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TemporalStoreFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TemporalStoreFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cloud.temporal.store.Store.Message> status(
        cloud.temporal.store.Store.Message request) {
      return futureUnaryCall(
          getChannel().newCall(getStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Pin handles new pins and pin extensions
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cloud.temporal.store.Store.Message> pin(
        cloud.temporal.store.Store.Object request) {
      return futureUnaryCall(
          getChannel().newCall(getPinMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Stat retrieves details about an object
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cloud.temporal.store.Store.ObjectStats> stat(
        cloud.temporal.store.Store.Object request) {
      return futureUnaryCall(
          getChannel().newCall(getStatMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_STATUS = 0;
  private static final int METHODID_PIN = 1;
  private static final int METHODID_STAT = 2;
  private static final int METHODID_UPLOAD = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TemporalStoreImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TemporalStoreImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_STATUS:
          serviceImpl.status((cloud.temporal.store.Store.Message) request,
              (io.grpc.stub.StreamObserver<cloud.temporal.store.Store.Message>) responseObserver);
          break;
        case METHODID_PIN:
          serviceImpl.pin((cloud.temporal.store.Store.Object) request,
              (io.grpc.stub.StreamObserver<cloud.temporal.store.Store.Message>) responseObserver);
          break;
        case METHODID_STAT:
          serviceImpl.stat((cloud.temporal.store.Store.Object) request,
              (io.grpc.stub.StreamObserver<cloud.temporal.store.Store.ObjectStats>) responseObserver);
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
        case METHODID_UPLOAD:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.upload(
              (io.grpc.stub.StreamObserver<cloud.temporal.store.Store.Object>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class TemporalStoreBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TemporalStoreBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return cloud.temporal.store.Store.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TemporalStore");
    }
  }

  private static final class TemporalStoreFileDescriptorSupplier
      extends TemporalStoreBaseDescriptorSupplier {
    TemporalStoreFileDescriptorSupplier() {}
  }

  private static final class TemporalStoreMethodDescriptorSupplier
      extends TemporalStoreBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TemporalStoreMethodDescriptorSupplier(String methodName) {
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
      synchronized (TemporalStoreGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TemporalStoreFileDescriptorSupplier())
              .addMethod(getStatusMethod())
              .addMethod(getUploadMethod())
              .addMethod(getPinMethod())
              .addMethod(getStatMethod())
              .build();
        }
      }
    }
    return result;
  }
}
