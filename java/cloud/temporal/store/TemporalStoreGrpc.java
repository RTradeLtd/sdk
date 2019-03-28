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
    comments = "Source: store.proto")
public final class TemporalStoreGrpc {

  private TemporalStoreGrpc() {}

  public static final String SERVICE_NAME = "store.TemporalStore";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<cloud.temporal.store.Store.UploadReq,
      cloud.temporal.store.Store.Object> getUploadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Upload",
      requestType = cloud.temporal.store.Store.UploadReq.class,
      responseType = cloud.temporal.store.Store.Object.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<cloud.temporal.store.Store.UploadReq,
      cloud.temporal.store.Store.Object> getUploadMethod() {
    io.grpc.MethodDescriptor<cloud.temporal.store.Store.UploadReq, cloud.temporal.store.Store.Object> getUploadMethod;
    if ((getUploadMethod = TemporalStoreGrpc.getUploadMethod) == null) {
      synchronized (TemporalStoreGrpc.class) {
        if ((getUploadMethod = TemporalStoreGrpc.getUploadMethod) == null) {
          TemporalStoreGrpc.getUploadMethod = getUploadMethod = 
              io.grpc.MethodDescriptor.<cloud.temporal.store.Store.UploadReq, cloud.temporal.store.Store.Object>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "store.TemporalStore", "Upload"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.temporal.store.Store.UploadReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.temporal.store.Store.Object.getDefaultInstance()))
                  .setSchemaDescriptor(new TemporalStoreMethodDescriptorSupplier("Upload"))
                  .build();
          }
        }
     }
     return getUploadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloud.temporal.store.Store.UploadReq,
      cloud.temporal.store.Store.Object> getUploadBlobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadBlob",
      requestType = cloud.temporal.store.Store.UploadReq.class,
      responseType = cloud.temporal.store.Store.Object.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloud.temporal.store.Store.UploadReq,
      cloud.temporal.store.Store.Object> getUploadBlobMethod() {
    io.grpc.MethodDescriptor<cloud.temporal.store.Store.UploadReq, cloud.temporal.store.Store.Object> getUploadBlobMethod;
    if ((getUploadBlobMethod = TemporalStoreGrpc.getUploadBlobMethod) == null) {
      synchronized (TemporalStoreGrpc.class) {
        if ((getUploadBlobMethod = TemporalStoreGrpc.getUploadBlobMethod) == null) {
          TemporalStoreGrpc.getUploadBlobMethod = getUploadBlobMethod = 
              io.grpc.MethodDescriptor.<cloud.temporal.store.Store.UploadReq, cloud.temporal.store.Store.Object>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "store.TemporalStore", "UploadBlob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.temporal.store.Store.UploadReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.temporal.store.Store.Object.getDefaultInstance()))
                  .setSchemaDescriptor(new TemporalStoreMethodDescriptorSupplier("UploadBlob"))
                  .build();
          }
        }
     }
     return getUploadBlobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloud.temporal.store.Store.DownloadReq,
      cloud.temporal.store.Store.Blob> getDownloadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Download",
      requestType = cloud.temporal.store.Store.DownloadReq.class,
      responseType = cloud.temporal.store.Store.Blob.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<cloud.temporal.store.Store.DownloadReq,
      cloud.temporal.store.Store.Blob> getDownloadMethod() {
    io.grpc.MethodDescriptor<cloud.temporal.store.Store.DownloadReq, cloud.temporal.store.Store.Blob> getDownloadMethod;
    if ((getDownloadMethod = TemporalStoreGrpc.getDownloadMethod) == null) {
      synchronized (TemporalStoreGrpc.class) {
        if ((getDownloadMethod = TemporalStoreGrpc.getDownloadMethod) == null) {
          TemporalStoreGrpc.getDownloadMethod = getDownloadMethod = 
              io.grpc.MethodDescriptor.<cloud.temporal.store.Store.DownloadReq, cloud.temporal.store.Store.Blob>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "store.TemporalStore", "Download"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.temporal.store.Store.DownloadReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.temporal.store.Store.Blob.getDefaultInstance()))
                  .setSchemaDescriptor(new TemporalStoreMethodDescriptorSupplier("Download"))
                  .build();
          }
        }
     }
     return getDownloadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloud.temporal.store.Store.DownloadReq,
      cloud.temporal.store.Store.Blob> getDownloadBlobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DownloadBlob",
      requestType = cloud.temporal.store.Store.DownloadReq.class,
      responseType = cloud.temporal.store.Store.Blob.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloud.temporal.store.Store.DownloadReq,
      cloud.temporal.store.Store.Blob> getDownloadBlobMethod() {
    io.grpc.MethodDescriptor<cloud.temporal.store.Store.DownloadReq, cloud.temporal.store.Store.Blob> getDownloadBlobMethod;
    if ((getDownloadBlobMethod = TemporalStoreGrpc.getDownloadBlobMethod) == null) {
      synchronized (TemporalStoreGrpc.class) {
        if ((getDownloadBlobMethod = TemporalStoreGrpc.getDownloadBlobMethod) == null) {
          TemporalStoreGrpc.getDownloadBlobMethod = getDownloadBlobMethod = 
              io.grpc.MethodDescriptor.<cloud.temporal.store.Store.DownloadReq, cloud.temporal.store.Store.Blob>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "store.TemporalStore", "DownloadBlob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.temporal.store.Store.DownloadReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.temporal.store.Store.Blob.getDefaultInstance()))
                  .setSchemaDescriptor(new TemporalStoreMethodDescriptorSupplier("DownloadBlob"))
                  .build();
          }
        }
     }
     return getDownloadBlobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloud.temporal.store.Store.Object,
      cloud.temporal.store.Store.Empty> getPinMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Pin",
      requestType = cloud.temporal.store.Store.Object.class,
      responseType = cloud.temporal.store.Store.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloud.temporal.store.Store.Object,
      cloud.temporal.store.Store.Empty> getPinMethod() {
    io.grpc.MethodDescriptor<cloud.temporal.store.Store.Object, cloud.temporal.store.Store.Empty> getPinMethod;
    if ((getPinMethod = TemporalStoreGrpc.getPinMethod) == null) {
      synchronized (TemporalStoreGrpc.class) {
        if ((getPinMethod = TemporalStoreGrpc.getPinMethod) == null) {
          TemporalStoreGrpc.getPinMethod = getPinMethod = 
              io.grpc.MethodDescriptor.<cloud.temporal.store.Store.Object, cloud.temporal.store.Store.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "store.TemporalStore", "Pin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.temporal.store.Store.Object.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.temporal.store.Store.Empty.getDefaultInstance()))
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

  private static volatile io.grpc.MethodDescriptor<cloud.temporal.store.Store.ListObjectsReq,
      cloud.temporal.store.Store.ObjectList> getListObjectsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListObjects",
      requestType = cloud.temporal.store.Store.ListObjectsReq.class,
      responseType = cloud.temporal.store.Store.ObjectList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloud.temporal.store.Store.ListObjectsReq,
      cloud.temporal.store.Store.ObjectList> getListObjectsMethod() {
    io.grpc.MethodDescriptor<cloud.temporal.store.Store.ListObjectsReq, cloud.temporal.store.Store.ObjectList> getListObjectsMethod;
    if ((getListObjectsMethod = TemporalStoreGrpc.getListObjectsMethod) == null) {
      synchronized (TemporalStoreGrpc.class) {
        if ((getListObjectsMethod = TemporalStoreGrpc.getListObjectsMethod) == null) {
          TemporalStoreGrpc.getListObjectsMethod = getListObjectsMethod = 
              io.grpc.MethodDescriptor.<cloud.temporal.store.Store.ListObjectsReq, cloud.temporal.store.Store.ObjectList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "store.TemporalStore", "ListObjects"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.temporal.store.Store.ListObjectsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.temporal.store.Store.ObjectList.getDefaultInstance()))
                  .setSchemaDescriptor(new TemporalStoreMethodDescriptorSupplier("ListObjects"))
                  .build();
          }
        }
     }
     return getListObjectsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloud.temporal.store.Store.Event,
      cloud.temporal.store.Store.Empty> getPublishMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Publish",
      requestType = cloud.temporal.store.Store.Event.class,
      responseType = cloud.temporal.store.Store.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloud.temporal.store.Store.Event,
      cloud.temporal.store.Store.Empty> getPublishMethod() {
    io.grpc.MethodDescriptor<cloud.temporal.store.Store.Event, cloud.temporal.store.Store.Empty> getPublishMethod;
    if ((getPublishMethod = TemporalStoreGrpc.getPublishMethod) == null) {
      synchronized (TemporalStoreGrpc.class) {
        if ((getPublishMethod = TemporalStoreGrpc.getPublishMethod) == null) {
          TemporalStoreGrpc.getPublishMethod = getPublishMethod = 
              io.grpc.MethodDescriptor.<cloud.temporal.store.Store.Event, cloud.temporal.store.Store.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "store.TemporalStore", "Publish"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.temporal.store.Store.Event.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.temporal.store.Store.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new TemporalStoreMethodDescriptorSupplier("Publish"))
                  .build();
          }
        }
     }
     return getPublishMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloud.temporal.store.Store.Topic,
      cloud.temporal.store.Store.Event> getSubscribeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Subscribe",
      requestType = cloud.temporal.store.Store.Topic.class,
      responseType = cloud.temporal.store.Store.Event.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<cloud.temporal.store.Store.Topic,
      cloud.temporal.store.Store.Event> getSubscribeMethod() {
    io.grpc.MethodDescriptor<cloud.temporal.store.Store.Topic, cloud.temporal.store.Store.Event> getSubscribeMethod;
    if ((getSubscribeMethod = TemporalStoreGrpc.getSubscribeMethod) == null) {
      synchronized (TemporalStoreGrpc.class) {
        if ((getSubscribeMethod = TemporalStoreGrpc.getSubscribeMethod) == null) {
          TemporalStoreGrpc.getSubscribeMethod = getSubscribeMethod = 
              io.grpc.MethodDescriptor.<cloud.temporal.store.Store.Topic, cloud.temporal.store.Store.Event>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "store.TemporalStore", "Subscribe"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.temporal.store.Store.Topic.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.temporal.store.Store.Event.getDefaultInstance()))
                  .setSchemaDescriptor(new TemporalStoreMethodDescriptorSupplier("Subscribe"))
                  .build();
          }
        }
     }
     return getSubscribeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloud.temporal.store.Store.Empty,
      cloud.temporal.store.Store.KeyList> getKeysMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Keys",
      requestType = cloud.temporal.store.Store.Empty.class,
      responseType = cloud.temporal.store.Store.KeyList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloud.temporal.store.Store.Empty,
      cloud.temporal.store.Store.KeyList> getKeysMethod() {
    io.grpc.MethodDescriptor<cloud.temporal.store.Store.Empty, cloud.temporal.store.Store.KeyList> getKeysMethod;
    if ((getKeysMethod = TemporalStoreGrpc.getKeysMethod) == null) {
      synchronized (TemporalStoreGrpc.class) {
        if ((getKeysMethod = TemporalStoreGrpc.getKeysMethod) == null) {
          TemporalStoreGrpc.getKeysMethod = getKeysMethod = 
              io.grpc.MethodDescriptor.<cloud.temporal.store.Store.Empty, cloud.temporal.store.Store.KeyList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "store.TemporalStore", "Keys"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.temporal.store.Store.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.temporal.store.Store.KeyList.getDefaultInstance()))
                  .setSchemaDescriptor(new TemporalStoreMethodDescriptorSupplier("Keys"))
                  .build();
          }
        }
     }
     return getKeysMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloud.temporal.store.Store.Key,
      cloud.temporal.store.Store.Empty> getNewKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NewKey",
      requestType = cloud.temporal.store.Store.Key.class,
      responseType = cloud.temporal.store.Store.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloud.temporal.store.Store.Key,
      cloud.temporal.store.Store.Empty> getNewKeyMethod() {
    io.grpc.MethodDescriptor<cloud.temporal.store.Store.Key, cloud.temporal.store.Store.Empty> getNewKeyMethod;
    if ((getNewKeyMethod = TemporalStoreGrpc.getNewKeyMethod) == null) {
      synchronized (TemporalStoreGrpc.class) {
        if ((getNewKeyMethod = TemporalStoreGrpc.getNewKeyMethod) == null) {
          TemporalStoreGrpc.getNewKeyMethod = getNewKeyMethod = 
              io.grpc.MethodDescriptor.<cloud.temporal.store.Store.Key, cloud.temporal.store.Store.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "store.TemporalStore", "NewKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.temporal.store.Store.Key.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.temporal.store.Store.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new TemporalStoreMethodDescriptorSupplier("NewKey"))
                  .build();
          }
        }
     }
     return getNewKeyMethod;
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
     * <pre>
     * Upload uploads a stream of blobs - it accepts files and directories. Blobs
     * larger than 5mb should use this API
     * </pre>
     */
    public io.grpc.stub.StreamObserver<cloud.temporal.store.Store.UploadReq> upload(
        io.grpc.stub.StreamObserver<cloud.temporal.store.Store.Object> responseObserver) {
      return asyncUnimplementedStreamingCall(getUploadMethod(), responseObserver);
    }

    /**
     * <pre>
     * UploadBlob allows the upload of a single blob - if it is too large, an
     * error will be returned
     * </pre>
     */
    public void uploadBlob(cloud.temporal.store.Store.UploadReq request,
        io.grpc.stub.StreamObserver<cloud.temporal.store.Store.Object> responseObserver) {
      asyncUnimplementedUnaryCall(getUploadBlobMethod(), responseObserver);
    }

    /**
     * <pre>
     * Download retrieves an object as a stream of blobs. Blobs larger than 5mb
     * should use this API
     * </pre>
     */
    public void download(cloud.temporal.store.Store.DownloadReq request,
        io.grpc.stub.StreamObserver<cloud.temporal.store.Store.Blob> responseObserver) {
      asyncUnimplementedUnaryCall(getDownloadMethod(), responseObserver);
    }

    /**
     * <pre>
     * DownloadBlob allows the download of a single blob - if it is too large,
     * an error will be returned
     * </pre>
     */
    public void downloadBlob(cloud.temporal.store.Store.DownloadReq request,
        io.grpc.stub.StreamObserver<cloud.temporal.store.Store.Blob> responseObserver) {
      asyncUnimplementedUnaryCall(getDownloadBlobMethod(), responseObserver);
    }

    /**
     * <pre>
     * Pin handles new pins and pin extensions
     * </pre>
     */
    public void pin(cloud.temporal.store.Store.Object request,
        io.grpc.stub.StreamObserver<cloud.temporal.store.Store.Empty> responseObserver) {
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

    /**
     * <pre>
     * ListObjects retrieves a list of the authenticated user's objects
     * </pre>
     */
    public void listObjects(cloud.temporal.store.Store.ListObjectsReq request,
        io.grpc.stub.StreamObserver<cloud.temporal.store.Store.ObjectList> responseObserver) {
      asyncUnimplementedUnaryCall(getListObjectsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Publish publishes a message to the requested topic
     * </pre>
     */
    public void publish(cloud.temporal.store.Store.Event request,
        io.grpc.stub.StreamObserver<cloud.temporal.store.Store.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getPublishMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe subscribes to messages from the requested topic
     * </pre>
     */
    public void subscribe(cloud.temporal.store.Store.Topic request,
        io.grpc.stub.StreamObserver<cloud.temporal.store.Store.Event> responseObserver) {
      asyncUnimplementedUnaryCall(getSubscribeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Keys returns the IPFS keys associated with an authenticated request
     * </pre>
     */
    public void keys(cloud.temporal.store.Store.Empty request,
        io.grpc.stub.StreamObserver<cloud.temporal.store.Store.KeyList> responseObserver) {
      asyncUnimplementedUnaryCall(getKeysMethod(), responseObserver);
    }

    /**
     * <pre>
     * NewKey generates a new IPFS key associated with an authenticated request.
     * </pre>
     */
    public void newKey(cloud.temporal.store.Store.Key request,
        io.grpc.stub.StreamObserver<cloud.temporal.store.Store.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getNewKeyMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUploadMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                cloud.temporal.store.Store.UploadReq,
                cloud.temporal.store.Store.Object>(
                  this, METHODID_UPLOAD)))
          .addMethod(
            getUploadBlobMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cloud.temporal.store.Store.UploadReq,
                cloud.temporal.store.Store.Object>(
                  this, METHODID_UPLOAD_BLOB)))
          .addMethod(
            getDownloadMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                cloud.temporal.store.Store.DownloadReq,
                cloud.temporal.store.Store.Blob>(
                  this, METHODID_DOWNLOAD)))
          .addMethod(
            getDownloadBlobMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cloud.temporal.store.Store.DownloadReq,
                cloud.temporal.store.Store.Blob>(
                  this, METHODID_DOWNLOAD_BLOB)))
          .addMethod(
            getPinMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cloud.temporal.store.Store.Object,
                cloud.temporal.store.Store.Empty>(
                  this, METHODID_PIN)))
          .addMethod(
            getStatMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cloud.temporal.store.Store.Object,
                cloud.temporal.store.Store.ObjectStats>(
                  this, METHODID_STAT)))
          .addMethod(
            getListObjectsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cloud.temporal.store.Store.ListObjectsReq,
                cloud.temporal.store.Store.ObjectList>(
                  this, METHODID_LIST_OBJECTS)))
          .addMethod(
            getPublishMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cloud.temporal.store.Store.Event,
                cloud.temporal.store.Store.Empty>(
                  this, METHODID_PUBLISH)))
          .addMethod(
            getSubscribeMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                cloud.temporal.store.Store.Topic,
                cloud.temporal.store.Store.Event>(
                  this, METHODID_SUBSCRIBE)))
          .addMethod(
            getKeysMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cloud.temporal.store.Store.Empty,
                cloud.temporal.store.Store.KeyList>(
                  this, METHODID_KEYS)))
          .addMethod(
            getNewKeyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cloud.temporal.store.Store.Key,
                cloud.temporal.store.Store.Empty>(
                  this, METHODID_NEW_KEY)))
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
     * <pre>
     * Upload uploads a stream of blobs - it accepts files and directories. Blobs
     * larger than 5mb should use this API
     * </pre>
     */
    public io.grpc.stub.StreamObserver<cloud.temporal.store.Store.UploadReq> upload(
        io.grpc.stub.StreamObserver<cloud.temporal.store.Store.Object> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getUploadMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * UploadBlob allows the upload of a single blob - if it is too large, an
     * error will be returned
     * </pre>
     */
    public void uploadBlob(cloud.temporal.store.Store.UploadReq request,
        io.grpc.stub.StreamObserver<cloud.temporal.store.Store.Object> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUploadBlobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Download retrieves an object as a stream of blobs. Blobs larger than 5mb
     * should use this API
     * </pre>
     */
    public void download(cloud.temporal.store.Store.DownloadReq request,
        io.grpc.stub.StreamObserver<cloud.temporal.store.Store.Blob> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getDownloadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DownloadBlob allows the download of a single blob - if it is too large,
     * an error will be returned
     * </pre>
     */
    public void downloadBlob(cloud.temporal.store.Store.DownloadReq request,
        io.grpc.stub.StreamObserver<cloud.temporal.store.Store.Blob> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDownloadBlobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Pin handles new pins and pin extensions
     * </pre>
     */
    public void pin(cloud.temporal.store.Store.Object request,
        io.grpc.stub.StreamObserver<cloud.temporal.store.Store.Empty> responseObserver) {
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

    /**
     * <pre>
     * ListObjects retrieves a list of the authenticated user's objects
     * </pre>
     */
    public void listObjects(cloud.temporal.store.Store.ListObjectsReq request,
        io.grpc.stub.StreamObserver<cloud.temporal.store.Store.ObjectList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListObjectsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Publish publishes a message to the requested topic
     * </pre>
     */
    public void publish(cloud.temporal.store.Store.Event request,
        io.grpc.stub.StreamObserver<cloud.temporal.store.Store.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPublishMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe subscribes to messages from the requested topic
     * </pre>
     */
    public void subscribe(cloud.temporal.store.Store.Topic request,
        io.grpc.stub.StreamObserver<cloud.temporal.store.Store.Event> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getSubscribeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Keys returns the IPFS keys associated with an authenticated request
     * </pre>
     */
    public void keys(cloud.temporal.store.Store.Empty request,
        io.grpc.stub.StreamObserver<cloud.temporal.store.Store.KeyList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getKeysMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * NewKey generates a new IPFS key associated with an authenticated request.
     * </pre>
     */
    public void newKey(cloud.temporal.store.Store.Key request,
        io.grpc.stub.StreamObserver<cloud.temporal.store.Store.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getNewKeyMethod(), getCallOptions()), request, responseObserver);
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
     * <pre>
     * UploadBlob allows the upload of a single blob - if it is too large, an
     * error will be returned
     * </pre>
     */
    public cloud.temporal.store.Store.Object uploadBlob(cloud.temporal.store.Store.UploadReq request) {
      return blockingUnaryCall(
          getChannel(), getUploadBlobMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Download retrieves an object as a stream of blobs. Blobs larger than 5mb
     * should use this API
     * </pre>
     */
    public java.util.Iterator<cloud.temporal.store.Store.Blob> download(
        cloud.temporal.store.Store.DownloadReq request) {
      return blockingServerStreamingCall(
          getChannel(), getDownloadMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DownloadBlob allows the download of a single blob - if it is too large,
     * an error will be returned
     * </pre>
     */
    public cloud.temporal.store.Store.Blob downloadBlob(cloud.temporal.store.Store.DownloadReq request) {
      return blockingUnaryCall(
          getChannel(), getDownloadBlobMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Pin handles new pins and pin extensions
     * </pre>
     */
    public cloud.temporal.store.Store.Empty pin(cloud.temporal.store.Store.Object request) {
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

    /**
     * <pre>
     * ListObjects retrieves a list of the authenticated user's objects
     * </pre>
     */
    public cloud.temporal.store.Store.ObjectList listObjects(cloud.temporal.store.Store.ListObjectsReq request) {
      return blockingUnaryCall(
          getChannel(), getListObjectsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Publish publishes a message to the requested topic
     * </pre>
     */
    public cloud.temporal.store.Store.Empty publish(cloud.temporal.store.Store.Event request) {
      return blockingUnaryCall(
          getChannel(), getPublishMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe subscribes to messages from the requested topic
     * </pre>
     */
    public java.util.Iterator<cloud.temporal.store.Store.Event> subscribe(
        cloud.temporal.store.Store.Topic request) {
      return blockingServerStreamingCall(
          getChannel(), getSubscribeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Keys returns the IPFS keys associated with an authenticated request
     * </pre>
     */
    public cloud.temporal.store.Store.KeyList keys(cloud.temporal.store.Store.Empty request) {
      return blockingUnaryCall(
          getChannel(), getKeysMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * NewKey generates a new IPFS key associated with an authenticated request.
     * </pre>
     */
    public cloud.temporal.store.Store.Empty newKey(cloud.temporal.store.Store.Key request) {
      return blockingUnaryCall(
          getChannel(), getNewKeyMethod(), getCallOptions(), request);
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
     * <pre>
     * UploadBlob allows the upload of a single blob - if it is too large, an
     * error will be returned
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cloud.temporal.store.Store.Object> uploadBlob(
        cloud.temporal.store.Store.UploadReq request) {
      return futureUnaryCall(
          getChannel().newCall(getUploadBlobMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DownloadBlob allows the download of a single blob - if it is too large,
     * an error will be returned
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cloud.temporal.store.Store.Blob> downloadBlob(
        cloud.temporal.store.Store.DownloadReq request) {
      return futureUnaryCall(
          getChannel().newCall(getDownloadBlobMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Pin handles new pins and pin extensions
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cloud.temporal.store.Store.Empty> pin(
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

    /**
     * <pre>
     * ListObjects retrieves a list of the authenticated user's objects
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cloud.temporal.store.Store.ObjectList> listObjects(
        cloud.temporal.store.Store.ListObjectsReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListObjectsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Publish publishes a message to the requested topic
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cloud.temporal.store.Store.Empty> publish(
        cloud.temporal.store.Store.Event request) {
      return futureUnaryCall(
          getChannel().newCall(getPublishMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Keys returns the IPFS keys associated with an authenticated request
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cloud.temporal.store.Store.KeyList> keys(
        cloud.temporal.store.Store.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getKeysMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * NewKey generates a new IPFS key associated with an authenticated request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cloud.temporal.store.Store.Empty> newKey(
        cloud.temporal.store.Store.Key request) {
      return futureUnaryCall(
          getChannel().newCall(getNewKeyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UPLOAD_BLOB = 0;
  private static final int METHODID_DOWNLOAD = 1;
  private static final int METHODID_DOWNLOAD_BLOB = 2;
  private static final int METHODID_PIN = 3;
  private static final int METHODID_STAT = 4;
  private static final int METHODID_LIST_OBJECTS = 5;
  private static final int METHODID_PUBLISH = 6;
  private static final int METHODID_SUBSCRIBE = 7;
  private static final int METHODID_KEYS = 8;
  private static final int METHODID_NEW_KEY = 9;
  private static final int METHODID_UPLOAD = 10;

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
        case METHODID_UPLOAD_BLOB:
          serviceImpl.uploadBlob((cloud.temporal.store.Store.UploadReq) request,
              (io.grpc.stub.StreamObserver<cloud.temporal.store.Store.Object>) responseObserver);
          break;
        case METHODID_DOWNLOAD:
          serviceImpl.download((cloud.temporal.store.Store.DownloadReq) request,
              (io.grpc.stub.StreamObserver<cloud.temporal.store.Store.Blob>) responseObserver);
          break;
        case METHODID_DOWNLOAD_BLOB:
          serviceImpl.downloadBlob((cloud.temporal.store.Store.DownloadReq) request,
              (io.grpc.stub.StreamObserver<cloud.temporal.store.Store.Blob>) responseObserver);
          break;
        case METHODID_PIN:
          serviceImpl.pin((cloud.temporal.store.Store.Object) request,
              (io.grpc.stub.StreamObserver<cloud.temporal.store.Store.Empty>) responseObserver);
          break;
        case METHODID_STAT:
          serviceImpl.stat((cloud.temporal.store.Store.Object) request,
              (io.grpc.stub.StreamObserver<cloud.temporal.store.Store.ObjectStats>) responseObserver);
          break;
        case METHODID_LIST_OBJECTS:
          serviceImpl.listObjects((cloud.temporal.store.Store.ListObjectsReq) request,
              (io.grpc.stub.StreamObserver<cloud.temporal.store.Store.ObjectList>) responseObserver);
          break;
        case METHODID_PUBLISH:
          serviceImpl.publish((cloud.temporal.store.Store.Event) request,
              (io.grpc.stub.StreamObserver<cloud.temporal.store.Store.Empty>) responseObserver);
          break;
        case METHODID_SUBSCRIBE:
          serviceImpl.subscribe((cloud.temporal.store.Store.Topic) request,
              (io.grpc.stub.StreamObserver<cloud.temporal.store.Store.Event>) responseObserver);
          break;
        case METHODID_KEYS:
          serviceImpl.keys((cloud.temporal.store.Store.Empty) request,
              (io.grpc.stub.StreamObserver<cloud.temporal.store.Store.KeyList>) responseObserver);
          break;
        case METHODID_NEW_KEY:
          serviceImpl.newKey((cloud.temporal.store.Store.Key) request,
              (io.grpc.stub.StreamObserver<cloud.temporal.store.Store.Empty>) responseObserver);
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
              .addMethod(getUploadMethod())
              .addMethod(getUploadBlobMethod())
              .addMethod(getDownloadMethod())
              .addMethod(getDownloadBlobMethod())
              .addMethod(getPinMethod())
              .addMethod(getStatMethod())
              .addMethod(getListObjectsMethod())
              .addMethod(getPublishMethod())
              .addMethod(getSubscribeMethod())
              .addMethod(getKeysMethod())
              .addMethod(getNewKeyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
