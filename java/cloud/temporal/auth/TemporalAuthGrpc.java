package cloud.temporal.auth;

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
 * TemporalAuth implements Temporal's authentication and account management APIs
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.19.0)",
    comments = "Source: proto/auth.proto")
public final class TemporalAuthGrpc {

  private TemporalAuthGrpc() {}

  public static final String SERVICE_NAME = "auth.TemporalAuth";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<cloud.temporal.auth.Auth.RegisterReq,
      cloud.temporal.auth.Auth.User> getRegisterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Register",
      requestType = cloud.temporal.auth.Auth.RegisterReq.class,
      responseType = cloud.temporal.auth.Auth.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloud.temporal.auth.Auth.RegisterReq,
      cloud.temporal.auth.Auth.User> getRegisterMethod() {
    io.grpc.MethodDescriptor<cloud.temporal.auth.Auth.RegisterReq, cloud.temporal.auth.Auth.User> getRegisterMethod;
    if ((getRegisterMethod = TemporalAuthGrpc.getRegisterMethod) == null) {
      synchronized (TemporalAuthGrpc.class) {
        if ((getRegisterMethod = TemporalAuthGrpc.getRegisterMethod) == null) {
          TemporalAuthGrpc.getRegisterMethod = getRegisterMethod = 
              io.grpc.MethodDescriptor.<cloud.temporal.auth.Auth.RegisterReq, cloud.temporal.auth.Auth.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "auth.TemporalAuth", "Register"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.temporal.auth.Auth.RegisterReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.temporal.auth.Auth.User.getDefaultInstance()))
                  .setSchemaDescriptor(new TemporalAuthMethodDescriptorSupplier("Register"))
                  .build();
          }
        }
     }
     return getRegisterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloud.temporal.auth.Auth.RecoverReq,
      cloud.temporal.auth.Auth.User> getRecoverMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Recover",
      requestType = cloud.temporal.auth.Auth.RecoverReq.class,
      responseType = cloud.temporal.auth.Auth.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloud.temporal.auth.Auth.RecoverReq,
      cloud.temporal.auth.Auth.User> getRecoverMethod() {
    io.grpc.MethodDescriptor<cloud.temporal.auth.Auth.RecoverReq, cloud.temporal.auth.Auth.User> getRecoverMethod;
    if ((getRecoverMethod = TemporalAuthGrpc.getRecoverMethod) == null) {
      synchronized (TemporalAuthGrpc.class) {
        if ((getRecoverMethod = TemporalAuthGrpc.getRecoverMethod) == null) {
          TemporalAuthGrpc.getRecoverMethod = getRecoverMethod = 
              io.grpc.MethodDescriptor.<cloud.temporal.auth.Auth.RecoverReq, cloud.temporal.auth.Auth.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "auth.TemporalAuth", "Recover"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.temporal.auth.Auth.RecoverReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.temporal.auth.Auth.User.getDefaultInstance()))
                  .setSchemaDescriptor(new TemporalAuthMethodDescriptorSupplier("Recover"))
                  .build();
          }
        }
     }
     return getRecoverMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloud.temporal.auth.Auth.Credentials,
      cloud.temporal.auth.Auth.Token> getLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Login",
      requestType = cloud.temporal.auth.Auth.Credentials.class,
      responseType = cloud.temporal.auth.Auth.Token.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloud.temporal.auth.Auth.Credentials,
      cloud.temporal.auth.Auth.Token> getLoginMethod() {
    io.grpc.MethodDescriptor<cloud.temporal.auth.Auth.Credentials, cloud.temporal.auth.Auth.Token> getLoginMethod;
    if ((getLoginMethod = TemporalAuthGrpc.getLoginMethod) == null) {
      synchronized (TemporalAuthGrpc.class) {
        if ((getLoginMethod = TemporalAuthGrpc.getLoginMethod) == null) {
          TemporalAuthGrpc.getLoginMethod = getLoginMethod = 
              io.grpc.MethodDescriptor.<cloud.temporal.auth.Auth.Credentials, cloud.temporal.auth.Auth.Token>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "auth.TemporalAuth", "Login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.temporal.auth.Auth.Credentials.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.temporal.auth.Auth.Token.getDefaultInstance()))
                  .setSchemaDescriptor(new TemporalAuthMethodDescriptorSupplier("Login"))
                  .build();
          }
        }
     }
     return getLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloud.temporal.auth.Auth.Empty,
      cloud.temporal.auth.Auth.User> getAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Account",
      requestType = cloud.temporal.auth.Auth.Empty.class,
      responseType = cloud.temporal.auth.Auth.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloud.temporal.auth.Auth.Empty,
      cloud.temporal.auth.Auth.User> getAccountMethod() {
    io.grpc.MethodDescriptor<cloud.temporal.auth.Auth.Empty, cloud.temporal.auth.Auth.User> getAccountMethod;
    if ((getAccountMethod = TemporalAuthGrpc.getAccountMethod) == null) {
      synchronized (TemporalAuthGrpc.class) {
        if ((getAccountMethod = TemporalAuthGrpc.getAccountMethod) == null) {
          TemporalAuthGrpc.getAccountMethod = getAccountMethod = 
              io.grpc.MethodDescriptor.<cloud.temporal.auth.Auth.Empty, cloud.temporal.auth.Auth.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "auth.TemporalAuth", "Account"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.temporal.auth.Auth.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.temporal.auth.Auth.User.getDefaultInstance()))
                  .setSchemaDescriptor(new TemporalAuthMethodDescriptorSupplier("Account"))
                  .build();
          }
        }
     }
     return getAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloud.temporal.auth.Auth.UpdateReq,
      cloud.temporal.auth.Auth.User> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = cloud.temporal.auth.Auth.UpdateReq.class,
      responseType = cloud.temporal.auth.Auth.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloud.temporal.auth.Auth.UpdateReq,
      cloud.temporal.auth.Auth.User> getUpdateMethod() {
    io.grpc.MethodDescriptor<cloud.temporal.auth.Auth.UpdateReq, cloud.temporal.auth.Auth.User> getUpdateMethod;
    if ((getUpdateMethod = TemporalAuthGrpc.getUpdateMethod) == null) {
      synchronized (TemporalAuthGrpc.class) {
        if ((getUpdateMethod = TemporalAuthGrpc.getUpdateMethod) == null) {
          TemporalAuthGrpc.getUpdateMethod = getUpdateMethod = 
              io.grpc.MethodDescriptor.<cloud.temporal.auth.Auth.UpdateReq, cloud.temporal.auth.Auth.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "auth.TemporalAuth", "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.temporal.auth.Auth.UpdateReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.temporal.auth.Auth.User.getDefaultInstance()))
                  .setSchemaDescriptor(new TemporalAuthMethodDescriptorSupplier("Update"))
                  .build();
          }
        }
     }
     return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloud.temporal.auth.Auth.Empty,
      cloud.temporal.auth.Auth.Token> getRefreshMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Refresh",
      requestType = cloud.temporal.auth.Auth.Empty.class,
      responseType = cloud.temporal.auth.Auth.Token.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloud.temporal.auth.Auth.Empty,
      cloud.temporal.auth.Auth.Token> getRefreshMethod() {
    io.grpc.MethodDescriptor<cloud.temporal.auth.Auth.Empty, cloud.temporal.auth.Auth.Token> getRefreshMethod;
    if ((getRefreshMethod = TemporalAuthGrpc.getRefreshMethod) == null) {
      synchronized (TemporalAuthGrpc.class) {
        if ((getRefreshMethod = TemporalAuthGrpc.getRefreshMethod) == null) {
          TemporalAuthGrpc.getRefreshMethod = getRefreshMethod = 
              io.grpc.MethodDescriptor.<cloud.temporal.auth.Auth.Empty, cloud.temporal.auth.Auth.Token>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "auth.TemporalAuth", "Refresh"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.temporal.auth.Auth.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.temporal.auth.Auth.Token.getDefaultInstance()))
                  .setSchemaDescriptor(new TemporalAuthMethodDescriptorSupplier("Refresh"))
                  .build();
          }
        }
     }
     return getRefreshMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TemporalAuthStub newStub(io.grpc.Channel channel) {
    return new TemporalAuthStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TemporalAuthBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TemporalAuthBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TemporalAuthFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TemporalAuthFutureStub(channel);
  }

  /**
   * <pre>
   * TemporalAuth implements Temporal's authentication and account management APIs
   * </pre>
   */
  public static abstract class TemporalAuthImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Register facilitates user creation.
     * </pre>
     */
    public void register(cloud.temporal.auth.Auth.RegisterReq request,
        io.grpc.stub.StreamObserver<cloud.temporal.auth.Auth.User> responseObserver) {
      asyncUnimplementedUnaryCall(getRegisterMethod(), responseObserver);
    }

    /**
     * <pre>
     * Recover facilitates account recovery.
     * </pre>
     */
    public void recover(cloud.temporal.auth.Auth.RecoverReq request,
        io.grpc.stub.StreamObserver<cloud.temporal.auth.Auth.User> responseObserver) {
      asyncUnimplementedUnaryCall(getRecoverMethod(), responseObserver);
    }

    /**
     * <pre>
     * Login accepts credentials and returns a token for use with further requests.
     * </pre>
     */
    public void login(cloud.temporal.auth.Auth.Credentials request,
        io.grpc.stub.StreamObserver<cloud.temporal.auth.Auth.Token> responseObserver) {
      asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    /**
     * <pre>
     * Account returns the account associated with an authenticated request.
     * </pre>
     */
    public void account(cloud.temporal.auth.Auth.Empty request,
        io.grpc.stub.StreamObserver<cloud.temporal.auth.Auth.User> responseObserver) {
      asyncUnimplementedUnaryCall(getAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update facilitates modification of the account associated with an
     * authenticated request.
     * </pre>
     */
    public void update(cloud.temporal.auth.Auth.UpdateReq request,
        io.grpc.stub.StreamObserver<cloud.temporal.auth.Auth.User> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Refresh provides a refreshed token associated with an authenticated request.
     * </pre>
     */
    public void refresh(cloud.temporal.auth.Auth.Empty request,
        io.grpc.stub.StreamObserver<cloud.temporal.auth.Auth.Token> responseObserver) {
      asyncUnimplementedUnaryCall(getRefreshMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegisterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cloud.temporal.auth.Auth.RegisterReq,
                cloud.temporal.auth.Auth.User>(
                  this, METHODID_REGISTER)))
          .addMethod(
            getRecoverMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cloud.temporal.auth.Auth.RecoverReq,
                cloud.temporal.auth.Auth.User>(
                  this, METHODID_RECOVER)))
          .addMethod(
            getLoginMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cloud.temporal.auth.Auth.Credentials,
                cloud.temporal.auth.Auth.Token>(
                  this, METHODID_LOGIN)))
          .addMethod(
            getAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cloud.temporal.auth.Auth.Empty,
                cloud.temporal.auth.Auth.User>(
                  this, METHODID_ACCOUNT)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cloud.temporal.auth.Auth.UpdateReq,
                cloud.temporal.auth.Auth.User>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getRefreshMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cloud.temporal.auth.Auth.Empty,
                cloud.temporal.auth.Auth.Token>(
                  this, METHODID_REFRESH)))
          .build();
    }
  }

  /**
   * <pre>
   * TemporalAuth implements Temporal's authentication and account management APIs
   * </pre>
   */
  public static final class TemporalAuthStub extends io.grpc.stub.AbstractStub<TemporalAuthStub> {
    private TemporalAuthStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TemporalAuthStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TemporalAuthStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TemporalAuthStub(channel, callOptions);
    }

    /**
     * <pre>
     * Register facilitates user creation.
     * </pre>
     */
    public void register(cloud.temporal.auth.Auth.RegisterReq request,
        io.grpc.stub.StreamObserver<cloud.temporal.auth.Auth.User> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Recover facilitates account recovery.
     * </pre>
     */
    public void recover(cloud.temporal.auth.Auth.RecoverReq request,
        io.grpc.stub.StreamObserver<cloud.temporal.auth.Auth.User> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRecoverMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Login accepts credentials and returns a token for use with further requests.
     * </pre>
     */
    public void login(cloud.temporal.auth.Auth.Credentials request,
        io.grpc.stub.StreamObserver<cloud.temporal.auth.Auth.Token> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Account returns the account associated with an authenticated request.
     * </pre>
     */
    public void account(cloud.temporal.auth.Auth.Empty request,
        io.grpc.stub.StreamObserver<cloud.temporal.auth.Auth.User> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update facilitates modification of the account associated with an
     * authenticated request.
     * </pre>
     */
    public void update(cloud.temporal.auth.Auth.UpdateReq request,
        io.grpc.stub.StreamObserver<cloud.temporal.auth.Auth.User> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Refresh provides a refreshed token associated with an authenticated request.
     * </pre>
     */
    public void refresh(cloud.temporal.auth.Auth.Empty request,
        io.grpc.stub.StreamObserver<cloud.temporal.auth.Auth.Token> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRefreshMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * TemporalAuth implements Temporal's authentication and account management APIs
   * </pre>
   */
  public static final class TemporalAuthBlockingStub extends io.grpc.stub.AbstractStub<TemporalAuthBlockingStub> {
    private TemporalAuthBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TemporalAuthBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TemporalAuthBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TemporalAuthBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Register facilitates user creation.
     * </pre>
     */
    public cloud.temporal.auth.Auth.User register(cloud.temporal.auth.Auth.RegisterReq request) {
      return blockingUnaryCall(
          getChannel(), getRegisterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Recover facilitates account recovery.
     * </pre>
     */
    public cloud.temporal.auth.Auth.User recover(cloud.temporal.auth.Auth.RecoverReq request) {
      return blockingUnaryCall(
          getChannel(), getRecoverMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Login accepts credentials and returns a token for use with further requests.
     * </pre>
     */
    public cloud.temporal.auth.Auth.Token login(cloud.temporal.auth.Auth.Credentials request) {
      return blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Account returns the account associated with an authenticated request.
     * </pre>
     */
    public cloud.temporal.auth.Auth.User account(cloud.temporal.auth.Auth.Empty request) {
      return blockingUnaryCall(
          getChannel(), getAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update facilitates modification of the account associated with an
     * authenticated request.
     * </pre>
     */
    public cloud.temporal.auth.Auth.User update(cloud.temporal.auth.Auth.UpdateReq request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Refresh provides a refreshed token associated with an authenticated request.
     * </pre>
     */
    public cloud.temporal.auth.Auth.Token refresh(cloud.temporal.auth.Auth.Empty request) {
      return blockingUnaryCall(
          getChannel(), getRefreshMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * TemporalAuth implements Temporal's authentication and account management APIs
   * </pre>
   */
  public static final class TemporalAuthFutureStub extends io.grpc.stub.AbstractStub<TemporalAuthFutureStub> {
    private TemporalAuthFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TemporalAuthFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TemporalAuthFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TemporalAuthFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Register facilitates user creation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cloud.temporal.auth.Auth.User> register(
        cloud.temporal.auth.Auth.RegisterReq request) {
      return futureUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Recover facilitates account recovery.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cloud.temporal.auth.Auth.User> recover(
        cloud.temporal.auth.Auth.RecoverReq request) {
      return futureUnaryCall(
          getChannel().newCall(getRecoverMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Login accepts credentials and returns a token for use with further requests.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cloud.temporal.auth.Auth.Token> login(
        cloud.temporal.auth.Auth.Credentials request) {
      return futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Account returns the account associated with an authenticated request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cloud.temporal.auth.Auth.User> account(
        cloud.temporal.auth.Auth.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update facilitates modification of the account associated with an
     * authenticated request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cloud.temporal.auth.Auth.User> update(
        cloud.temporal.auth.Auth.UpdateReq request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Refresh provides a refreshed token associated with an authenticated request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cloud.temporal.auth.Auth.Token> refresh(
        cloud.temporal.auth.Auth.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getRefreshMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER = 0;
  private static final int METHODID_RECOVER = 1;
  private static final int METHODID_LOGIN = 2;
  private static final int METHODID_ACCOUNT = 3;
  private static final int METHODID_UPDATE = 4;
  private static final int METHODID_REFRESH = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TemporalAuthImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TemporalAuthImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER:
          serviceImpl.register((cloud.temporal.auth.Auth.RegisterReq) request,
              (io.grpc.stub.StreamObserver<cloud.temporal.auth.Auth.User>) responseObserver);
          break;
        case METHODID_RECOVER:
          serviceImpl.recover((cloud.temporal.auth.Auth.RecoverReq) request,
              (io.grpc.stub.StreamObserver<cloud.temporal.auth.Auth.User>) responseObserver);
          break;
        case METHODID_LOGIN:
          serviceImpl.login((cloud.temporal.auth.Auth.Credentials) request,
              (io.grpc.stub.StreamObserver<cloud.temporal.auth.Auth.Token>) responseObserver);
          break;
        case METHODID_ACCOUNT:
          serviceImpl.account((cloud.temporal.auth.Auth.Empty) request,
              (io.grpc.stub.StreamObserver<cloud.temporal.auth.Auth.User>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((cloud.temporal.auth.Auth.UpdateReq) request,
              (io.grpc.stub.StreamObserver<cloud.temporal.auth.Auth.User>) responseObserver);
          break;
        case METHODID_REFRESH:
          serviceImpl.refresh((cloud.temporal.auth.Auth.Empty) request,
              (io.grpc.stub.StreamObserver<cloud.temporal.auth.Auth.Token>) responseObserver);
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

  private static abstract class TemporalAuthBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TemporalAuthBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return cloud.temporal.auth.Auth.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TemporalAuth");
    }
  }

  private static final class TemporalAuthFileDescriptorSupplier
      extends TemporalAuthBaseDescriptorSupplier {
    TemporalAuthFileDescriptorSupplier() {}
  }

  private static final class TemporalAuthMethodDescriptorSupplier
      extends TemporalAuthBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TemporalAuthMethodDescriptorSupplier(String methodName) {
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
      synchronized (TemporalAuthGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TemporalAuthFileDescriptorSupplier())
              .addMethod(getRegisterMethod())
              .addMethod(getRecoverMethod())
              .addMethod(getLoginMethod())
              .addMethod(getAccountMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getRefreshMethod())
              .build();
        }
      }
    }
    return result;
  }
}
