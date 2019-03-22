package cloud.temporal.ipfs;

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
 * TemporalIPFS implements Temporal's IPFS services
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.19.0)",
    comments = "Source: proto/ipfs.proto")
public final class TemporalIPFSGrpc {

  private TemporalIPFSGrpc() {}

  public static final String SERVICE_NAME = "ipfs.TemporalIPFS";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<cloud.temporal.ipfs.Ipfs.Empty,
      cloud.temporal.ipfs.Ipfs.KeysResp> getKeysMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Keys",
      requestType = cloud.temporal.ipfs.Ipfs.Empty.class,
      responseType = cloud.temporal.ipfs.Ipfs.KeysResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloud.temporal.ipfs.Ipfs.Empty,
      cloud.temporal.ipfs.Ipfs.KeysResp> getKeysMethod() {
    io.grpc.MethodDescriptor<cloud.temporal.ipfs.Ipfs.Empty, cloud.temporal.ipfs.Ipfs.KeysResp> getKeysMethod;
    if ((getKeysMethod = TemporalIPFSGrpc.getKeysMethod) == null) {
      synchronized (TemporalIPFSGrpc.class) {
        if ((getKeysMethod = TemporalIPFSGrpc.getKeysMethod) == null) {
          TemporalIPFSGrpc.getKeysMethod = getKeysMethod = 
              io.grpc.MethodDescriptor.<cloud.temporal.ipfs.Ipfs.Empty, cloud.temporal.ipfs.Ipfs.KeysResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ipfs.TemporalIPFS", "Keys"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.temporal.ipfs.Ipfs.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.temporal.ipfs.Ipfs.KeysResp.getDefaultInstance()))
                  .setSchemaDescriptor(new TemporalIPFSMethodDescriptorSupplier("Keys"))
                  .build();
          }
        }
     }
     return getKeysMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloud.temporal.ipfs.Ipfs.Key,
      cloud.temporal.ipfs.Ipfs.Empty> getNewKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NewKey",
      requestType = cloud.temporal.ipfs.Ipfs.Key.class,
      responseType = cloud.temporal.ipfs.Ipfs.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloud.temporal.ipfs.Ipfs.Key,
      cloud.temporal.ipfs.Ipfs.Empty> getNewKeyMethod() {
    io.grpc.MethodDescriptor<cloud.temporal.ipfs.Ipfs.Key, cloud.temporal.ipfs.Ipfs.Empty> getNewKeyMethod;
    if ((getNewKeyMethod = TemporalIPFSGrpc.getNewKeyMethod) == null) {
      synchronized (TemporalIPFSGrpc.class) {
        if ((getNewKeyMethod = TemporalIPFSGrpc.getNewKeyMethod) == null) {
          TemporalIPFSGrpc.getNewKeyMethod = getNewKeyMethod = 
              io.grpc.MethodDescriptor.<cloud.temporal.ipfs.Ipfs.Key, cloud.temporal.ipfs.Ipfs.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ipfs.TemporalIPFS", "NewKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.temporal.ipfs.Ipfs.Key.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.temporal.ipfs.Ipfs.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new TemporalIPFSMethodDescriptorSupplier("NewKey"))
                  .build();
          }
        }
     }
     return getNewKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloud.temporal.ipfs.Ipfs.Event,
      cloud.temporal.ipfs.Ipfs.Empty> getPublishMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Publish",
      requestType = cloud.temporal.ipfs.Ipfs.Event.class,
      responseType = cloud.temporal.ipfs.Ipfs.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloud.temporal.ipfs.Ipfs.Event,
      cloud.temporal.ipfs.Ipfs.Empty> getPublishMethod() {
    io.grpc.MethodDescriptor<cloud.temporal.ipfs.Ipfs.Event, cloud.temporal.ipfs.Ipfs.Empty> getPublishMethod;
    if ((getPublishMethod = TemporalIPFSGrpc.getPublishMethod) == null) {
      synchronized (TemporalIPFSGrpc.class) {
        if ((getPublishMethod = TemporalIPFSGrpc.getPublishMethod) == null) {
          TemporalIPFSGrpc.getPublishMethod = getPublishMethod = 
              io.grpc.MethodDescriptor.<cloud.temporal.ipfs.Ipfs.Event, cloud.temporal.ipfs.Ipfs.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ipfs.TemporalIPFS", "Publish"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.temporal.ipfs.Ipfs.Event.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.temporal.ipfs.Ipfs.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new TemporalIPFSMethodDescriptorSupplier("Publish"))
                  .build();
          }
        }
     }
     return getPublishMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloud.temporal.ipfs.Ipfs.Topic,
      cloud.temporal.ipfs.Ipfs.Event> getSubscribeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Subscribe",
      requestType = cloud.temporal.ipfs.Ipfs.Topic.class,
      responseType = cloud.temporal.ipfs.Ipfs.Event.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<cloud.temporal.ipfs.Ipfs.Topic,
      cloud.temporal.ipfs.Ipfs.Event> getSubscribeMethod() {
    io.grpc.MethodDescriptor<cloud.temporal.ipfs.Ipfs.Topic, cloud.temporal.ipfs.Ipfs.Event> getSubscribeMethod;
    if ((getSubscribeMethod = TemporalIPFSGrpc.getSubscribeMethod) == null) {
      synchronized (TemporalIPFSGrpc.class) {
        if ((getSubscribeMethod = TemporalIPFSGrpc.getSubscribeMethod) == null) {
          TemporalIPFSGrpc.getSubscribeMethod = getSubscribeMethod = 
              io.grpc.MethodDescriptor.<cloud.temporal.ipfs.Ipfs.Topic, cloud.temporal.ipfs.Ipfs.Event>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "ipfs.TemporalIPFS", "Subscribe"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.temporal.ipfs.Ipfs.Topic.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.temporal.ipfs.Ipfs.Event.getDefaultInstance()))
                  .setSchemaDescriptor(new TemporalIPFSMethodDescriptorSupplier("Subscribe"))
                  .build();
          }
        }
     }
     return getSubscribeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TemporalIPFSStub newStub(io.grpc.Channel channel) {
    return new TemporalIPFSStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TemporalIPFSBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TemporalIPFSBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TemporalIPFSFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TemporalIPFSFutureStub(channel);
  }

  /**
   * <pre>
   * TemporalIPFS implements Temporal's IPFS services
   * </pre>
   */
  public static abstract class TemporalIPFSImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Keys returns the IPFS keys associated with an authenticated request.
     * </pre>
     */
    public void keys(cloud.temporal.ipfs.Ipfs.Empty request,
        io.grpc.stub.StreamObserver<cloud.temporal.ipfs.Ipfs.KeysResp> responseObserver) {
      asyncUnimplementedUnaryCall(getKeysMethod(), responseObserver);
    }

    /**
     * <pre>
     * NewKey generates a new IPFS key associated with an authenticated request.
     * </pre>
     */
    public void newKey(cloud.temporal.ipfs.Ipfs.Key request,
        io.grpc.stub.StreamObserver<cloud.temporal.ipfs.Ipfs.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getNewKeyMethod(), responseObserver);
    }

    /**
     */
    public void publish(cloud.temporal.ipfs.Ipfs.Event request,
        io.grpc.stub.StreamObserver<cloud.temporal.ipfs.Ipfs.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getPublishMethod(), responseObserver);
    }

    /**
     */
    public void subscribe(cloud.temporal.ipfs.Ipfs.Topic request,
        io.grpc.stub.StreamObserver<cloud.temporal.ipfs.Ipfs.Event> responseObserver) {
      asyncUnimplementedUnaryCall(getSubscribeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getKeysMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cloud.temporal.ipfs.Ipfs.Empty,
                cloud.temporal.ipfs.Ipfs.KeysResp>(
                  this, METHODID_KEYS)))
          .addMethod(
            getNewKeyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cloud.temporal.ipfs.Ipfs.Key,
                cloud.temporal.ipfs.Ipfs.Empty>(
                  this, METHODID_NEW_KEY)))
          .addMethod(
            getPublishMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cloud.temporal.ipfs.Ipfs.Event,
                cloud.temporal.ipfs.Ipfs.Empty>(
                  this, METHODID_PUBLISH)))
          .addMethod(
            getSubscribeMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                cloud.temporal.ipfs.Ipfs.Topic,
                cloud.temporal.ipfs.Ipfs.Event>(
                  this, METHODID_SUBSCRIBE)))
          .build();
    }
  }

  /**
   * <pre>
   * TemporalIPFS implements Temporal's IPFS services
   * </pre>
   */
  public static final class TemporalIPFSStub extends io.grpc.stub.AbstractStub<TemporalIPFSStub> {
    private TemporalIPFSStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TemporalIPFSStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TemporalIPFSStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TemporalIPFSStub(channel, callOptions);
    }

    /**
     * <pre>
     * Keys returns the IPFS keys associated with an authenticated request.
     * </pre>
     */
    public void keys(cloud.temporal.ipfs.Ipfs.Empty request,
        io.grpc.stub.StreamObserver<cloud.temporal.ipfs.Ipfs.KeysResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getKeysMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * NewKey generates a new IPFS key associated with an authenticated request.
     * </pre>
     */
    public void newKey(cloud.temporal.ipfs.Ipfs.Key request,
        io.grpc.stub.StreamObserver<cloud.temporal.ipfs.Ipfs.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getNewKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void publish(cloud.temporal.ipfs.Ipfs.Event request,
        io.grpc.stub.StreamObserver<cloud.temporal.ipfs.Ipfs.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPublishMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void subscribe(cloud.temporal.ipfs.Ipfs.Topic request,
        io.grpc.stub.StreamObserver<cloud.temporal.ipfs.Ipfs.Event> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getSubscribeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * TemporalIPFS implements Temporal's IPFS services
   * </pre>
   */
  public static final class TemporalIPFSBlockingStub extends io.grpc.stub.AbstractStub<TemporalIPFSBlockingStub> {
    private TemporalIPFSBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TemporalIPFSBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TemporalIPFSBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TemporalIPFSBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Keys returns the IPFS keys associated with an authenticated request.
     * </pre>
     */
    public cloud.temporal.ipfs.Ipfs.KeysResp keys(cloud.temporal.ipfs.Ipfs.Empty request) {
      return blockingUnaryCall(
          getChannel(), getKeysMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * NewKey generates a new IPFS key associated with an authenticated request.
     * </pre>
     */
    public cloud.temporal.ipfs.Ipfs.Empty newKey(cloud.temporal.ipfs.Ipfs.Key request) {
      return blockingUnaryCall(
          getChannel(), getNewKeyMethod(), getCallOptions(), request);
    }

    /**
     */
    public cloud.temporal.ipfs.Ipfs.Empty publish(cloud.temporal.ipfs.Ipfs.Event request) {
      return blockingUnaryCall(
          getChannel(), getPublishMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<cloud.temporal.ipfs.Ipfs.Event> subscribe(
        cloud.temporal.ipfs.Ipfs.Topic request) {
      return blockingServerStreamingCall(
          getChannel(), getSubscribeMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * TemporalIPFS implements Temporal's IPFS services
   * </pre>
   */
  public static final class TemporalIPFSFutureStub extends io.grpc.stub.AbstractStub<TemporalIPFSFutureStub> {
    private TemporalIPFSFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TemporalIPFSFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TemporalIPFSFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TemporalIPFSFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Keys returns the IPFS keys associated with an authenticated request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cloud.temporal.ipfs.Ipfs.KeysResp> keys(
        cloud.temporal.ipfs.Ipfs.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getKeysMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * NewKey generates a new IPFS key associated with an authenticated request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cloud.temporal.ipfs.Ipfs.Empty> newKey(
        cloud.temporal.ipfs.Ipfs.Key request) {
      return futureUnaryCall(
          getChannel().newCall(getNewKeyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cloud.temporal.ipfs.Ipfs.Empty> publish(
        cloud.temporal.ipfs.Ipfs.Event request) {
      return futureUnaryCall(
          getChannel().newCall(getPublishMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_KEYS = 0;
  private static final int METHODID_NEW_KEY = 1;
  private static final int METHODID_PUBLISH = 2;
  private static final int METHODID_SUBSCRIBE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TemporalIPFSImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TemporalIPFSImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_KEYS:
          serviceImpl.keys((cloud.temporal.ipfs.Ipfs.Empty) request,
              (io.grpc.stub.StreamObserver<cloud.temporal.ipfs.Ipfs.KeysResp>) responseObserver);
          break;
        case METHODID_NEW_KEY:
          serviceImpl.newKey((cloud.temporal.ipfs.Ipfs.Key) request,
              (io.grpc.stub.StreamObserver<cloud.temporal.ipfs.Ipfs.Empty>) responseObserver);
          break;
        case METHODID_PUBLISH:
          serviceImpl.publish((cloud.temporal.ipfs.Ipfs.Event) request,
              (io.grpc.stub.StreamObserver<cloud.temporal.ipfs.Ipfs.Empty>) responseObserver);
          break;
        case METHODID_SUBSCRIBE:
          serviceImpl.subscribe((cloud.temporal.ipfs.Ipfs.Topic) request,
              (io.grpc.stub.StreamObserver<cloud.temporal.ipfs.Ipfs.Event>) responseObserver);
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

  private static abstract class TemporalIPFSBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TemporalIPFSBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return cloud.temporal.ipfs.Ipfs.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TemporalIPFS");
    }
  }

  private static final class TemporalIPFSFileDescriptorSupplier
      extends TemporalIPFSBaseDescriptorSupplier {
    TemporalIPFSFileDescriptorSupplier() {}
  }

  private static final class TemporalIPFSMethodDescriptorSupplier
      extends TemporalIPFSBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TemporalIPFSMethodDescriptorSupplier(String methodName) {
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
      synchronized (TemporalIPFSGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TemporalIPFSFileDescriptorSupplier())
              .addMethod(getKeysMethod())
              .addMethod(getNewKeyMethod())
              .addMethod(getPublishMethod())
              .addMethod(getSubscribeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
