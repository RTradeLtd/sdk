/**
 * @fileoverview gRPC-Web generated client stub for store
 * @enhanceable
 * @public
 */

// GENERATED CODE -- DO NOT EDIT!



const grpc = {};
grpc.web = require('grpc-web');


var google_api_annotations_pb = require('./google/api/annotations_pb.js')
const proto = {};
proto.store = require('./store_pb.js');

/**
 * @param {string} hostname
 * @param {?Object} credentials
 * @param {?Object} options
 * @constructor
 * @struct
 * @final
 */
proto.store.TemporalStoreClient =
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
proto.store.TemporalStorePromiseClient =
    function(hostname, credentials, options) {
  if (!options) options = {};
  options['format'] = 'text';

  /**
   * @private @const {!proto.store.TemporalStoreClient} The delegate callback based client
   */
  this.delegateClient_ = new proto.store.TemporalStoreClient(
      hostname, credentials, options);

};


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.store.Message,
 *   !proto.store.Message>}
 */
const methodInfo_TemporalStore_Status = new grpc.web.AbstractClientBase.MethodInfo(
  proto.store.Message,
  /** @param {!proto.store.Message} request */
  function(request) {
    return request.serializeBinary();
  },
  proto.store.Message.deserializeBinary
);


/**
 * @param {!proto.store.Message} request The
 *     request proto
 * @param {!Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.store.Message)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.store.Message>|undefined}
 *     The XHR Node Readable Stream
 */
proto.store.TemporalStoreClient.prototype.status =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/store.TemporalStore/Status',
      request,
      metadata,
      methodInfo_TemporalStore_Status,
      callback);
};


/**
 * @param {!proto.store.Message} request The
 *     request proto
 * @param {!Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.store.Message>}
 *     The XHR Node Readable Stream
 */
proto.store.TemporalStorePromiseClient.prototype.status =
    function(request, metadata) {
  return new Promise((resolve, reject) => {
    this.delegateClient_.status(
      request, metadata, (error, response) => {
        error ? reject(error) : resolve(response);
      });
  });
};


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.store.Object,
 *   !proto.store.Message>}
 */
const methodInfo_TemporalStore_Pin = new grpc.web.AbstractClientBase.MethodInfo(
  proto.store.Message,
  /** @param {!proto.store.Object} request */
  function(request) {
    return request.serializeBinary();
  },
  proto.store.Message.deserializeBinary
);


/**
 * @param {!proto.store.Object} request The
 *     request proto
 * @param {!Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.store.Message)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.store.Message>|undefined}
 *     The XHR Node Readable Stream
 */
proto.store.TemporalStoreClient.prototype.pin =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/store.TemporalStore/Pin',
      request,
      metadata,
      methodInfo_TemporalStore_Pin,
      callback);
};


/**
 * @param {!proto.store.Object} request The
 *     request proto
 * @param {!Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.store.Message>}
 *     The XHR Node Readable Stream
 */
proto.store.TemporalStorePromiseClient.prototype.pin =
    function(request, metadata) {
  return new Promise((resolve, reject) => {
    this.delegateClient_.pin(
      request, metadata, (error, response) => {
        error ? reject(error) : resolve(response);
      });
  });
};


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.store.Object,
 *   !proto.store.ObjectStats>}
 */
const methodInfo_TemporalStore_Stat = new grpc.web.AbstractClientBase.MethodInfo(
  proto.store.ObjectStats,
  /** @param {!proto.store.Object} request */
  function(request) {
    return request.serializeBinary();
  },
  proto.store.ObjectStats.deserializeBinary
);


/**
 * @param {!proto.store.Object} request The
 *     request proto
 * @param {!Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.store.ObjectStats)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.store.ObjectStats>|undefined}
 *     The XHR Node Readable Stream
 */
proto.store.TemporalStoreClient.prototype.stat =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/store.TemporalStore/Stat',
      request,
      metadata,
      methodInfo_TemporalStore_Stat,
      callback);
};


/**
 * @param {!proto.store.Object} request The
 *     request proto
 * @param {!Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.store.ObjectStats>}
 *     The XHR Node Readable Stream
 */
proto.store.TemporalStorePromiseClient.prototype.stat =
    function(request, metadata) {
  return new Promise((resolve, reject) => {
    this.delegateClient_.stat(
      request, metadata, (error, response) => {
        error ? reject(error) : resolve(response);
      });
  });
};


module.exports = proto.store;

