package cloud.temporal.core;

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
 * TemporalCore implements non-specific Temporal APIs such systems checks,
 * statistics, etc.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.19.0)",
    comments = "Source: proto/core.proto")
public final class TemporalCoreGrpc {

  private TemporalCoreGrpc() {}

  public static final String SERVICE_NAME = "core.TemporalCore";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<cloud.temporal.core.Core.Empty,
      cloud.temporal.core.Core.ServiceStatus> getStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Status",
      requestType = cloud.temporal.core.Core.Empty.class,
      responseType = cloud.temporal.core.Core.ServiceStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloud.temporal.core.Core.Empty,
      cloud.temporal.core.Core.ServiceStatus> getStatusMethod() {
    io.grpc.MethodDescriptor<cloud.temporal.core.Core.Empty, cloud.temporal.core.Core.ServiceStatus> getStatusMethod;
    if ((getStatusMethod = TemporalCoreGrpc.getStatusMethod) == null) {
      synchronized (TemporalCoreGrpc.class) {
        if ((getStatusMethod = TemporalCoreGrpc.getStatusMethod) == null) {
          TemporalCoreGrpc.getStatusMethod = getStatusMethod = 
              io.grpc.MethodDescriptor.<cloud.temporal.core.Core.Empty, cloud.temporal.core.Core.ServiceStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "core.TemporalCore", "Status"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.temporal.core.Core.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.temporal.core.Core.ServiceStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new TemporalCoreMethodDescriptorSupplier("Status"))
                  .build();
          }
        }
     }
     return getStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloud.temporal.core.Core.Empty,
      cloud.temporal.core.Core.ServiceStatistics> getStatisticsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Statistics",
      requestType = cloud.temporal.core.Core.Empty.class,
      responseType = cloud.temporal.core.Core.ServiceStatistics.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloud.temporal.core.Core.Empty,
      cloud.temporal.core.Core.ServiceStatistics> getStatisticsMethod() {
    io.grpc.MethodDescriptor<cloud.temporal.core.Core.Empty, cloud.temporal.core.Core.ServiceStatistics> getStatisticsMethod;
    if ((getStatisticsMethod = TemporalCoreGrpc.getStatisticsMethod) == null) {
      synchronized (TemporalCoreGrpc.class) {
        if ((getStatisticsMethod = TemporalCoreGrpc.getStatisticsMethod) == null) {
          TemporalCoreGrpc.getStatisticsMethod = getStatisticsMethod = 
              io.grpc.MethodDescriptor.<cloud.temporal.core.Core.Empty, cloud.temporal.core.Core.ServiceStatistics>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "core.TemporalCore", "Statistics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.temporal.core.Core.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.temporal.core.Core.ServiceStatistics.getDefaultInstance()))
                  .setSchemaDescriptor(new TemporalCoreMethodDescriptorSupplier("Statistics"))
                  .build();
          }
        }
     }
     return getStatisticsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TemporalCoreStub newStub(io.grpc.Channel channel) {
    return new TemporalCoreStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TemporalCoreBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TemporalCoreBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TemporalCoreFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TemporalCoreFutureStub(channel);
  }

  /**
   * <pre>
   * TemporalCore implements non-specific Temporal APIs such systems checks,
   * statistics, etc.
   * </pre>
   */
  public static abstract class TemporalCoreImplBase implements io.grpc.BindableService {

    /**
     */
    public void status(cloud.temporal.core.Core.Empty request,
        io.grpc.stub.StreamObserver<cloud.temporal.core.Core.ServiceStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getStatusMethod(), responseObserver);
    }

    /**
     */
    public void statistics(cloud.temporal.core.Core.Empty request,
        io.grpc.stub.StreamObserver<cloud.temporal.core.Core.ServiceStatistics> responseObserver) {
      asyncUnimplementedUnaryCall(getStatisticsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cloud.temporal.core.Core.Empty,
                cloud.temporal.core.Core.ServiceStatus>(
                  this, METHODID_STATUS)))
          .addMethod(
            getStatisticsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cloud.temporal.core.Core.Empty,
                cloud.temporal.core.Core.ServiceStatistics>(
                  this, METHODID_STATISTICS)))
          .build();
    }
  }

  /**
   * <pre>
   * TemporalCore implements non-specific Temporal APIs such systems checks,
   * statistics, etc.
   * </pre>
   */
  public static final class TemporalCoreStub extends io.grpc.stub.AbstractStub<TemporalCoreStub> {
    private TemporalCoreStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TemporalCoreStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TemporalCoreStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TemporalCoreStub(channel, callOptions);
    }

    /**
     */
    public void status(cloud.temporal.core.Core.Empty request,
        io.grpc.stub.StreamObserver<cloud.temporal.core.Core.ServiceStatus> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void statistics(cloud.temporal.core.Core.Empty request,
        io.grpc.stub.StreamObserver<cloud.temporal.core.Core.ServiceStatistics> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStatisticsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * TemporalCore implements non-specific Temporal APIs such systems checks,
   * statistics, etc.
   * </pre>
   */
  public static final class TemporalCoreBlockingStub extends io.grpc.stub.AbstractStub<TemporalCoreBlockingStub> {
    private TemporalCoreBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TemporalCoreBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TemporalCoreBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TemporalCoreBlockingStub(channel, callOptions);
    }

    /**
     */
    public cloud.temporal.core.Core.ServiceStatus status(cloud.temporal.core.Core.Empty request) {
      return blockingUnaryCall(
          getChannel(), getStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public cloud.temporal.core.Core.ServiceStatistics statistics(cloud.temporal.core.Core.Empty request) {
      return blockingUnaryCall(
          getChannel(), getStatisticsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * TemporalCore implements non-specific Temporal APIs such systems checks,
   * statistics, etc.
   * </pre>
   */
  public static final class TemporalCoreFutureStub extends io.grpc.stub.AbstractStub<TemporalCoreFutureStub> {
    private TemporalCoreFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TemporalCoreFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TemporalCoreFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TemporalCoreFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cloud.temporal.core.Core.ServiceStatus> status(
        cloud.temporal.core.Core.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getStatusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cloud.temporal.core.Core.ServiceStatistics> statistics(
        cloud.temporal.core.Core.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getStatisticsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_STATUS = 0;
  private static final int METHODID_STATISTICS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TemporalCoreImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TemporalCoreImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_STATUS:
          serviceImpl.status((cloud.temporal.core.Core.Empty) request,
              (io.grpc.stub.StreamObserver<cloud.temporal.core.Core.ServiceStatus>) responseObserver);
          break;
        case METHODID_STATISTICS:
          serviceImpl.statistics((cloud.temporal.core.Core.Empty) request,
              (io.grpc.stub.StreamObserver<cloud.temporal.core.Core.ServiceStatistics>) responseObserver);
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

  private static abstract class TemporalCoreBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TemporalCoreBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return cloud.temporal.core.Core.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TemporalCore");
    }
  }

  private static final class TemporalCoreFileDescriptorSupplier
      extends TemporalCoreBaseDescriptorSupplier {
    TemporalCoreFileDescriptorSupplier() {}
  }

  private static final class TemporalCoreMethodDescriptorSupplier
      extends TemporalCoreBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TemporalCoreMethodDescriptorSupplier(String methodName) {
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
      synchronized (TemporalCoreGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TemporalCoreFileDescriptorSupplier())
              .addMethod(getStatusMethod())
              .addMethod(getStatisticsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
