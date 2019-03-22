/**
 * @fileoverview gRPC-Web generated client stub for ipfs
 * @enhanceable
 * @public
 */

// GENERATED CODE -- DO NOT EDIT!



const grpc = {};
grpc.web = require('grpc-web');


var google_api_annotations_pb = require('./google/api/annotations_pb.js')
const proto = {};
proto.ipfs = require('./ipfs_pb.js');

/**
 * @param {string} hostname
 * @param {?Object} credentials
 * @param {?Object} options
 * @constructor
 * @struct
 * @final
 */
proto.ipfs.TemporalIPFSClient =
    function(hostname, credentials, options) {
  if (!options) options = {};
  options['format'] = 'text';

  /**
   * @private @const {!grpc.web.GrpcWebClientBase} The client
   */
  this.client_ = new grpc.web.GrpcWebClientBase(options);

  /**
   * @private @const {string} The hostname
   */
  this.hostname_ = hostname;

  /**
   * @private @const {?Object} The credentials to be used to connect
   *    to the server
   */
  this.credentials_ = credentials;

  /**
   * @private @const {?Object} Options for the client
   */
  this.options_ = options;
};


/**
 * @param {string} hostname
 * @param {?Object} credentials
 * @param {?Object} options
 * @constructor
 * @struct
 * @final
 */
proto.ipfs.TemporalIPFSPromiseClient =
    function(hostname, credentials, options) {
  if (!options) options = {};
  options['format'] = 'text';

  /**
   * @private @const {!proto.ipfs.TemporalIPFSClient} The delegate callback based client
   */
  this.delegateClient_ = new proto.ipfs.TemporalIPFSClient(
      hostname, credentials, options);

};


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.ipfs.Empty,
 *   !proto.ipfs.KeysResp>}
 */
const methodInfo_TemporalIPFS_Keys = new grpc.web.AbstractClientBase.MethodInfo(
  proto.ipfs.KeysResp,
  /** @param {!proto.ipfs.Empty} request */
  function(request) {
    return request.serializeBinary();
  },
  proto.ipfs.KeysResp.deserializeBinary
);


/**
 * @param {!proto.ipfs.Empty} request The
 *     request proto
 * @param {!Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.ipfs.KeysResp)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.ipfs.KeysResp>|undefined}
 *     The XHR Node Readable Stream
 */
proto.ipfs.TemporalIPFSClient.prototype.keys =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/ipfs.TemporalIPFS/Keys',
      request,
      metadata,
      methodInfo_TemporalIPFS_Keys,
      callback);
};


/**
 * @param {!proto.ipfs.Empty} request The
 *     request proto
 * @param {!Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.ipfs.KeysResp>}
 *     The XHR Node Readable Stream
 */
proto.ipfs.TemporalIPFSPromiseClient.prototype.keys =
    function(request, metadata) {
  return new Promise((resolve, reject) => {
    this.delegateClient_.keys(
      request, metadata, (error, response) => {
        error ? reject(error) : resolve(response);
      });
  });
};


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.ipfs.Key,
 *   !proto.ipfs.Empty>}
 */
const methodInfo_TemporalIPFS_NewKey = new grpc.web.AbstractClientBase.MethodInfo(
  proto.ipfs.Empty,
  /** @param {!proto.ipfs.Key} request */
  function(request) {
    return request.serializeBinary();
  },
  proto.ipfs.Empty.deserializeBinary
);


/**
 * @param {!proto.ipfs.Key} request The
 *     request proto
 * @param {!Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.ipfs.Empty)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.ipfs.Empty>|undefined}
 *     The XHR Node Readable Stream
 */
proto.ipfs.TemporalIPFSClient.prototype.newKey =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/ipfs.TemporalIPFS/NewKey',
      request,
      metadata,
      methodInfo_TemporalIPFS_NewKey,
      callback);
};


/**
 * @param {!proto.ipfs.Key} request The
 *     request proto
 * @param {!Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.ipfs.Empty>}
 *     The XHR Node Readable Stream
 */
proto.ipfs.TemporalIPFSPromiseClient.prototype.newKey =
    function(request, metadata) {
  return new Promise((resolve, reject) => {
    this.delegateClient_.newKey(
      request, metadata, (error, response) => {
        error ? reject(error) : resolve(response);
      });
  });
};


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.ipfs.Event,
 *   !proto.ipfs.Empty>}
 */
const methodInfo_TemporalIPFS_Publish = new grpc.web.AbstractClientBase.MethodInfo(
  proto.ipfs.Empty,
  /** @param {!proto.ipfs.Event} request */
  function(request) {
    return request.serializeBinary();
  },
  proto.ipfs.Empty.deserializeBinary
);


/**
 * @param {!proto.ipfs.Event} request The
 *     request proto
 * @param {!Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.ipfs.Empty)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.ipfs.Empty>|undefined}
 *     The XHR Node Readable Stream
 */
proto.ipfs.TemporalIPFSClient.prototype.publish =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/ipfs.TemporalIPFS/Publish',
      request,
      metadata,
      methodInfo_TemporalIPFS_Publish,
      callback);
};


/**
 * @param {!proto.ipfs.Event} request The
 *     request proto
 * @param {!Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.ipfs.Empty>}
 *     The XHR Node Readable Stream
 */
proto.ipfs.TemporalIPFSPromiseClient.prototype.publish =
    function(request, metadata) {
  return new Promise((resolve, reject) => {
    this.delegateClient_.publish(
      request, metadata, (error, response) => {
        error ? reject(error) : resolve(response);
      });
  });
};


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.ipfs.Topic,
 *   !proto.ipfs.Event>}
 */
const methodInfo_TemporalIPFS_Subscribe = new grpc.web.AbstractClientBase.MethodInfo(
  proto.ipfs.Event,
  /** @param {!proto.ipfs.Topic} request */
  function(request) {
    return request.serializeBinary();
  },
  proto.ipfs.Event.deserializeBinary
);


/**
 * @param {!proto.ipfs.Topic} request The request proto
 * @param {!Object<string, string>} metadata User defined
 *     call metadata
 * @return {!grpc.web.ClientReadableStream<!proto.ipfs.Event>}
 *     The XHR Node Readable Stream
 */
proto.ipfs.TemporalIPFSClient.prototype.subscribe =
    function(request, metadata) {
  return this.client_.serverStreaming(this.hostname_ +
      '/ipfs.TemporalIPFS/Subscribe',
      request,
      metadata,
      methodInfo_TemporalIPFS_Subscribe);
};


/**
 * @param {!proto.ipfs.Topic} request The request proto
 * @param {!Object<string, string>} metadata User defined
 *     call metadata
 * @return {!grpc.web.ClientReadableStream<!proto.ipfs.Event>}
 *     The XHR Node Readable Stream
 */
proto.ipfs.TemporalIPFSPromiseClient.prototype.subscribe =
    function(request, metadata) {
  return this.delegateClient_.client_.serverStreaming(this.delegateClient_.hostname_ +
      '/ipfs.TemporalIPFS/Subscribe',
      request,
      metadata,
      methodInfo_TemporalIPFS_Subscribe);
};


module.exports = proto.ipfs;

