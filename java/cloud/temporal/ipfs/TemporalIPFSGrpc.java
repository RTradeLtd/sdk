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
 * TemporalIPFS implements Temporal's IPFS management APIs, most notably private
 * networks.
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
      cloud.temporal.ipfs.Ipfs.Empty> getStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Status",
      requestType = cloud.temporal.ipfs.Ipfs.Empty.class,
      responseType = cloud.temporal.ipfs.Ipfs.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloud.temporal.ipfs.Ipfs.Empty,
      cloud.temporal.ipfs.Ipfs.Empty> getStatusMethod() {
    io.grpc.MethodDescriptor<cloud.temporal.ipfs.Ipfs.Empty, cloud.temporal.ipfs.Ipfs.Empty> getStatusMethod;
    if ((getStatusMethod = TemporalIPFSGrpc.getStatusMethod) == null) {
      synchronized (TemporalIPFSGrpc.class) {
        if ((getStatusMethod = TemporalIPFSGrpc.getStatusMethod) == null) {
          TemporalIPFSGrpc.getStatusMethod = getStatusMethod = 
              io.grpc.MethodDescriptor.<cloud.temporal.ipfs.Ipfs.Empty, cloud.temporal.ipfs.Ipfs.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ipfs.TemporalIPFS", "Status"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.temporal.ipfs.Ipfs.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.temporal.ipfs.Ipfs.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new TemporalIPFSMethodDescriptorSupplier("Status"))
                  .build();
          }
        }
     }
     return getStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloud.temporal.ipfs.Ipfs.CreateNetworkReq,
      cloud.temporal.ipfs.Ipfs.NetworkDetails> getCreateNetworkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateNetwork",
      requestType = cloud.temporal.ipfs.Ipfs.CreateNetworkReq.class,
      responseType = cloud.temporal.ipfs.Ipfs.NetworkDetails.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloud.temporal.ipfs.Ipfs.CreateNetworkReq,
      cloud.temporal.ipfs.Ipfs.NetworkDetails> getCreateNetworkMethod() {
    io.grpc.MethodDescriptor<cloud.temporal.ipfs.Ipfs.CreateNetworkReq, cloud.temporal.ipfs.Ipfs.NetworkDetails> getCreateNetworkMethod;
    if ((getCreateNetworkMethod = TemporalIPFSGrpc.getCreateNetworkMethod) == null) {
      synchronized (TemporalIPFSGrpc.class) {
        if ((getCreateNetworkMethod = TemporalIPFSGrpc.getCreateNetworkMethod) == null) {
          TemporalIPFSGrpc.getCreateNetworkMethod = getCreateNetworkMethod = 
              io.grpc.MethodDescriptor.<cloud.temporal.ipfs.Ipfs.CreateNetworkReq, cloud.temporal.ipfs.Ipfs.NetworkDetails>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ipfs.TemporalIPFS", "CreateNetwork"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.temporal.ipfs.Ipfs.CreateNetworkReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.temporal.ipfs.Ipfs.NetworkDetails.getDefaultInstance()))
                  .setSchemaDescriptor(new TemporalIPFSMethodDescriptorSupplier("CreateNetwork"))
                  .build();
          }
        }
     }
     return getCreateNetworkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloud.temporal.ipfs.Ipfs.Network,
      cloud.temporal.ipfs.Ipfs.Empty> getStartNetworkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartNetwork",
      requestType = cloud.temporal.ipfs.Ipfs.Network.class,
      responseType = cloud.temporal.ipfs.Ipfs.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloud.temporal.ipfs.Ipfs.Network,
      cloud.temporal.ipfs.Ipfs.Empty> getStartNetworkMethod() {
    io.grpc.MethodDescriptor<cloud.temporal.ipfs.Ipfs.Network, cloud.temporal.ipfs.Ipfs.Empty> getStartNetworkMethod;
    if ((getStartNetworkMethod = TemporalIPFSGrpc.getStartNetworkMethod) == null) {
      synchronized (TemporalIPFSGrpc.class) {
        if ((getStartNetworkMethod = TemporalIPFSGrpc.getStartNetworkMethod) == null) {
          TemporalIPFSGrpc.getStartNetworkMethod = getStartNetworkMethod = 
              io.grpc.MethodDescriptor.<cloud.temporal.ipfs.Ipfs.Network, cloud.temporal.ipfs.Ipfs.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ipfs.TemporalIPFS", "StartNetwork"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.temporal.ipfs.Ipfs.Network.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.temporal.ipfs.Ipfs.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new TemporalIPFSMethodDescriptorSupplier("StartNetwork"))
                  .build();
          }
        }
     }
     return getStartNetworkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloud.temporal.ipfs.Ipfs.Network,
      cloud.temporal.ipfs.Ipfs.Empty> getStopNetworkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StopNetwork",
      requestType = cloud.temporal.ipfs.Ipfs.Network.class,
      responseType = cloud.temporal.ipfs.Ipfs.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloud.temporal.ipfs.Ipfs.Network,
      cloud.temporal.ipfs.Ipfs.Empty> getStopNetworkMethod() {
    io.grpc.MethodDescriptor<cloud.temporal.ipfs.Ipfs.Network, cloud.temporal.ipfs.Ipfs.Empty> getStopNetworkMethod;
    if ((getStopNetworkMethod = TemporalIPFSGrpc.getStopNetworkMethod) == null) {
      synchronized (TemporalIPFSGrpc.class) {
        if ((getStopNetworkMethod = TemporalIPFSGrpc.getStopNetworkMethod) == null) {
          TemporalIPFSGrpc.getStopNetworkMethod = getStopNetworkMethod = 
              io.grpc.MethodDescriptor.<cloud.temporal.ipfs.Ipfs.Network, cloud.temporal.ipfs.Ipfs.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ipfs.TemporalIPFS", "StopNetwork"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.temporal.ipfs.Ipfs.Network.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.temporal.ipfs.Ipfs.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new TemporalIPFSMethodDescriptorSupplier("StopNetwork"))
                  .build();
          }
        }
     }
     return getStopNetworkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloud.temporal.ipfs.Ipfs.Network,
      cloud.temporal.ipfs.Ipfs.Empty> getRemoveNetworkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveNetwork",
      requestType = cloud.temporal.ipfs.Ipfs.Network.class,
      responseType = cloud.temporal.ipfs.Ipfs.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloud.temporal.ipfs.Ipfs.Network,
      cloud.temporal.ipfs.Ipfs.Empty> getRemoveNetworkMethod() {
    io.grpc.MethodDescriptor<cloud.temporal.ipfs.Ipfs.Network, cloud.temporal.ipfs.Ipfs.Empty> getRemoveNetworkMethod;
    if ((getRemoveNetworkMethod = TemporalIPFSGrpc.getRemoveNetworkMethod) == null) {
      synchronized (TemporalIPFSGrpc.class) {
        if ((getRemoveNetworkMethod = TemporalIPFSGrpc.getRemoveNetworkMethod) == null) {
          TemporalIPFSGrpc.getRemoveNetworkMethod = getRemoveNetworkMethod = 
              io.grpc.MethodDescriptor.<cloud.temporal.ipfs.Ipfs.Network, cloud.temporal.ipfs.Ipfs.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ipfs.TemporalIPFS", "RemoveNetwork"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.temporal.ipfs.Ipfs.Network.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.temporal.ipfs.Ipfs.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new TemporalIPFSMethodDescriptorSupplier("RemoveNetwork"))
                  .build();
          }
        }
     }
     return getRemoveNetworkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloud.temporal.ipfs.Ipfs.Network,
      cloud.temporal.ipfs.Ipfs.NetworkDetails> getNetworkInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NetworkInfo",
      requestType = cloud.temporal.ipfs.Ipfs.Network.class,
      responseType = cloud.temporal.ipfs.Ipfs.NetworkDetails.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloud.temporal.ipfs.Ipfs.Network,
      cloud.temporal.ipfs.Ipfs.NetworkDetails> getNetworkInfoMethod() {
    io.grpc.MethodDescriptor<cloud.temporal.ipfs.Ipfs.Network, cloud.temporal.ipfs.Ipfs.NetworkDetails> getNetworkInfoMethod;
    if ((getNetworkInfoMethod = TemporalIPFSGrpc.getNetworkInfoMethod) == null) {
      synchronized (TemporalIPFSGrpc.class) {
        if ((getNetworkInfoMethod = TemporalIPFSGrpc.getNetworkInfoMethod) == null) {
          TemporalIPFSGrpc.getNetworkInfoMethod = getNetworkInfoMethod = 
              io.grpc.MethodDescriptor.<cloud.temporal.ipfs.Ipfs.Network, cloud.temporal.ipfs.Ipfs.NetworkDetails>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ipfs.TemporalIPFS", "NetworkInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.temporal.ipfs.Ipfs.Network.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.temporal.ipfs.Ipfs.NetworkDetails.getDefaultInstance()))
                  .setSchemaDescriptor(new TemporalIPFSMethodDescriptorSupplier("NetworkInfo"))
                  .build();
          }
        }
     }
     return getNetworkInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloud.temporal.ipfs.Ipfs.Empty,
      cloud.temporal.ipfs.Ipfs.NetworkList> getListNetworksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListNetworks",
      requestType = cloud.temporal.ipfs.Ipfs.Empty.class,
      responseType = cloud.temporal.ipfs.Ipfs.NetworkList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloud.temporal.ipfs.Ipfs.Empty,
      cloud.temporal.ipfs.Ipfs.NetworkList> getListNetworksMethod() {
    io.grpc.MethodDescriptor<cloud.temporal.ipfs.Ipfs.Empty, cloud.temporal.ipfs.Ipfs.NetworkList> getListNetworksMethod;
    if ((getListNetworksMethod = TemporalIPFSGrpc.getListNetworksMethod) == null) {
      synchronized (TemporalIPFSGrpc.class) {
        if ((getListNetworksMethod = TemporalIPFSGrpc.getListNetworksMethod) == null) {
          TemporalIPFSGrpc.getListNetworksMethod = getListNetworksMethod = 
              io.grpc.MethodDescriptor.<cloud.temporal.ipfs.Ipfs.Empty, cloud.temporal.ipfs.Ipfs.NetworkList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ipfs.TemporalIPFS", "ListNetworks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.temporal.ipfs.Ipfs.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.temporal.ipfs.Ipfs.NetworkList.getDefaultInstance()))
                  .setSchemaDescriptor(new TemporalIPFSMethodDescriptorSupplier("ListNetworks"))
                  .build();
          }
        }
     }
     return getListNetworksMethod;
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
   * TemporalIPFS implements Temporal's IPFS management APIs, most notably private
   * networks.
   * </pre>
   */
  public static abstract class TemporalIPFSImplBase implements io.grpc.BindableService {

    /**
     */
    public void status(cloud.temporal.ipfs.Ipfs.Empty request,
        io.grpc.stub.StreamObserver<cloud.temporal.ipfs.Ipfs.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getStatusMethod(), responseObserver);
    }

    /**
     */
    public void createNetwork(cloud.temporal.ipfs.Ipfs.CreateNetworkReq request,
        io.grpc.stub.StreamObserver<cloud.temporal.ipfs.Ipfs.NetworkDetails> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateNetworkMethod(), responseObserver);
    }

    /**
     */
    public void startNetwork(cloud.temporal.ipfs.Ipfs.Network request,
        io.grpc.stub.StreamObserver<cloud.temporal.ipfs.Ipfs.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getStartNetworkMethod(), responseObserver);
    }

    /**
     */
    public void stopNetwork(cloud.temporal.ipfs.Ipfs.Network request,
        io.grpc.stub.StreamObserver<cloud.temporal.ipfs.Ipfs.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getStopNetworkMethod(), responseObserver);
    }

    /**
     */
    public void removeNetwork(cloud.temporal.ipfs.Ipfs.Network request,
        io.grpc.stub.StreamObserver<cloud.temporal.ipfs.Ipfs.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveNetworkMethod(), responseObserver);
    }

    /**
     */
    public void networkInfo(cloud.temporal.ipfs.Ipfs.Network request,
        io.grpc.stub.StreamObserver<cloud.temporal.ipfs.Ipfs.NetworkDetails> responseObserver) {
      asyncUnimplementedUnaryCall(getNetworkInfoMethod(), responseObserver);
    }

    /**
     */
    public void listNetworks(cloud.temporal.ipfs.Ipfs.Empty request,
        io.grpc.stub.StreamObserver<cloud.temporal.ipfs.Ipfs.NetworkList> responseObserver) {
      asyncUnimplementedUnaryCall(getListNetworksMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cloud.temporal.ipfs.Ipfs.Empty,
                cloud.temporal.ipfs.Ipfs.Empty>(
                  this, METHODID_STATUS)))
          .addMethod(
            getCreateNetworkMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cloud.temporal.ipfs.Ipfs.CreateNetworkReq,
                cloud.temporal.ipfs.Ipfs.NetworkDetails>(
                  this, METHODID_CREATE_NETWORK)))
          .addMethod(
            getStartNetworkMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cloud.temporal.ipfs.Ipfs.Network,
                cloud.temporal.ipfs.Ipfs.Empty>(
                  this, METHODID_START_NETWORK)))
          .addMethod(
            getStopNetworkMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cloud.temporal.ipfs.Ipfs.Network,
                cloud.temporal.ipfs.Ipfs.Empty>(
                  this, METHODID_STOP_NETWORK)))
          .addMethod(
            getRemoveNetworkMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cloud.temporal.ipfs.Ipfs.Network,
                cloud.temporal.ipfs.Ipfs.Empty>(
                  this, METHODID_REMOVE_NETWORK)))
          .addMethod(
            getNetworkInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cloud.temporal.ipfs.Ipfs.Network,
                cloud.temporal.ipfs.Ipfs.NetworkDetails>(
                  this, METHODID_NETWORK_INFO)))
          .addMethod(
            getListNetworksMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cloud.temporal.ipfs.Ipfs.Empty,
                cloud.temporal.ipfs.Ipfs.NetworkList>(
                  this, METHODID_LIST_NETWORKS)))
          .build();
    }
  }

  /**
   * <pre>
   * TemporalIPFS implements Temporal's IPFS management APIs, most notably private
   * networks.
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
     */
    public void status(cloud.temporal.ipfs.Ipfs.Empty request,
        io.grpc.stub.StreamObserver<cloud.temporal.ipfs.Ipfs.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createNetwork(cloud.temporal.ipfs.Ipfs.CreateNetworkReq request,
        io.grpc.stub.StreamObserver<cloud.temporal.ipfs.Ipfs.NetworkDetails> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateNetworkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void startNetwork(cloud.temporal.ipfs.Ipfs.Network request,
        io.grpc.stub.StreamObserver<cloud.temporal.ipfs.Ipfs.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStartNetworkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void stopNetwork(cloud.temporal.ipfs.Ipfs.Network request,
        io.grpc.stub.StreamObserver<cloud.temporal.ipfs.Ipfs.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStopNetworkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeNetwork(cloud.temporal.ipfs.Ipfs.Network request,
        io.grpc.stub.StreamObserver<cloud.temporal.ipfs.Ipfs.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveNetworkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void networkInfo(cloud.temporal.ipfs.Ipfs.Network request,
        io.grpc.stub.StreamObserver<cloud.temporal.ipfs.Ipfs.NetworkDetails> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getNetworkInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listNetworks(cloud.temporal.ipfs.Ipfs.Empty request,
        io.grpc.stub.StreamObserver<cloud.temporal.ipfs.Ipfs.NetworkList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListNetworksMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * TemporalIPFS implements Temporal's IPFS management APIs, most notably private
   * networks.
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
     */
    public cloud.temporal.ipfs.Ipfs.Empty status(cloud.temporal.ipfs.Ipfs.Empty request) {
      return blockingUnaryCall(
          getChannel(), getStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public cloud.temporal.ipfs.Ipfs.NetworkDetails createNetwork(cloud.temporal.ipfs.Ipfs.CreateNetworkReq request) {
      return blockingUnaryCall(
          getChannel(), getCreateNetworkMethod(), getCallOptions(), request);
    }

    /**
     */
    public cloud.temporal.ipfs.Ipfs.Empty startNetwork(cloud.temporal.ipfs.Ipfs.Network request) {
      return blockingUnaryCall(
          getChannel(), getStartNetworkMethod(), getCallOptions(), request);
    }

    /**
     */
    public cloud.temporal.ipfs.Ipfs.Empty stopNetwork(cloud.temporal.ipfs.Ipfs.Network request) {
      return blockingUnaryCall(
          getChannel(), getStopNetworkMethod(), getCallOptions(), request);
    }

    /**
     */
    public cloud.temporal.ipfs.Ipfs.Empty removeNetwork(cloud.temporal.ipfs.Ipfs.Network request) {
      return blockingUnaryCall(
          getChannel(), getRemoveNetworkMethod(), getCallOptions(), request);
    }

    /**
     */
    public cloud.temporal.ipfs.Ipfs.NetworkDetails networkInfo(cloud.temporal.ipfs.Ipfs.Network request) {
      return blockingUnaryCall(
          getChannel(), getNetworkInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public cloud.temporal.ipfs.Ipfs.NetworkList listNetworks(cloud.temporal.ipfs.Ipfs.Empty request) {
      return blockingUnaryCall(
          getChannel(), getListNetworksMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * TemporalIPFS implements Temporal's IPFS management APIs, most notably private
   * networks.
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
     */
    public com.google.common.util.concurrent.ListenableFuture<cloud.temporal.ipfs.Ipfs.Empty> status(
        cloud.temporal.ipfs.Ipfs.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getStatusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cloud.temporal.ipfs.Ipfs.NetworkDetails> createNetwork(
        cloud.temporal.ipfs.Ipfs.CreateNetworkReq request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateNetworkMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cloud.temporal.ipfs.Ipfs.Empty> startNetwork(
        cloud.temporal.ipfs.Ipfs.Network request) {
      return futureUnaryCall(
          getChannel().newCall(getStartNetworkMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cloud.temporal.ipfs.Ipfs.Empty> stopNetwork(
        cloud.temporal.ipfs.Ipfs.Network request) {
      return futureUnaryCall(
          getChannel().newCall(getStopNetworkMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cloud.temporal.ipfs.Ipfs.Empty> removeNetwork(
        cloud.temporal.ipfs.Ipfs.Network request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveNetworkMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cloud.temporal.ipfs.Ipfs.NetworkDetails> networkInfo(
        cloud.temporal.ipfs.Ipfs.Network request) {
      return futureUnaryCall(
          getChannel().newCall(getNetworkInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cloud.temporal.ipfs.Ipfs.NetworkList> listNetworks(
        cloud.temporal.ipfs.Ipfs.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getListNetworksMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_STATUS = 0;
  private static final int METHODID_CREATE_NETWORK = 1;
  private static final int METHODID_START_NETWORK = 2;
  private static final int METHODID_STOP_NETWORK = 3;
  private static final int METHODID_REMOVE_NETWORK = 4;
  private static final int METHODID_NETWORK_INFO = 5;
  private static final int METHODID_LIST_NETWORKS = 6;

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
        case METHODID_STATUS:
          serviceImpl.status((cloud.temporal.ipfs.Ipfs.Empty) request,
              (io.grpc.stub.StreamObserver<cloud.temporal.ipfs.Ipfs.Empty>) responseObserver);
          break;
        case METHODID_CREATE_NETWORK:
          serviceImpl.createNetwork((cloud.temporal.ipfs.Ipfs.CreateNetworkReq) request,
              (io.grpc.stub.StreamObserver<cloud.temporal.ipfs.Ipfs.NetworkDetails>) responseObserver);
          break;
        case METHODID_START_NETWORK:
          serviceImpl.startNetwork((cloud.temporal.ipfs.Ipfs.Network) request,
              (io.grpc.stub.StreamObserver<cloud.temporal.ipfs.Ipfs.Empty>) responseObserver);
          break;
        case METHODID_STOP_NETWORK:
          serviceImpl.stopNetwork((cloud.temporal.ipfs.Ipfs.Network) request,
              (io.grpc.stub.StreamObserver<cloud.temporal.ipfs.Ipfs.Empty>) responseObserver);
          break;
        case METHODID_REMOVE_NETWORK:
          serviceImpl.removeNetwork((cloud.temporal.ipfs.Ipfs.Network) request,
              (io.grpc.stub.StreamObserver<cloud.temporal.ipfs.Ipfs.Empty>) responseObserver);
          break;
        case METHODID_NETWORK_INFO:
          serviceImpl.networkInfo((cloud.temporal.ipfs.Ipfs.Network) request,
              (io.grpc.stub.StreamObserver<cloud.temporal.ipfs.Ipfs.NetworkDetails>) responseObserver);
          break;
        case METHODID_LIST_NETWORKS:
          serviceImpl.listNetworks((cloud.temporal.ipfs.Ipfs.Empty) request,
              (io.grpc.stub.StreamObserver<cloud.temporal.ipfs.Ipfs.NetworkList>) responseObserver);
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
              .addMethod(getStatusMethod())
              .addMethod(getCreateNetworkMethod())
              .addMethod(getStartNetworkMethod())
              .addMethod(getStopNetworkMethod())
              .addMethod(getRemoveNetworkMethod())
              .addMethod(getNetworkInfoMethod())
              .addMethod(getListNetworksMethod())
              .build();
        }
      }
    }
    return result;
  }
}
