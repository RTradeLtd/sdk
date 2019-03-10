/**
 * @fileoverview gRPC-Web generated client stub for core
 * @enhanceable
 * @public
 */

// GENERATED CODE -- DO NOT EDIT!



const grpc = {};
grpc.web = require('grpc-web');


var google_api_annotations_pb = require('./google/api/annotations_pb.js')
const proto = {};
proto.core = require('./core_pb.js');

/**
 * @param {string} hostname
 * @param {?Object} credentials
 * @param {?Object} options
 * @constructor
 * @struct
 * @final
 */
proto.core.TemporalCoreClient =
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
proto.core.TemporalCorePromiseClient =
    function(hostname, credentials, options) {
  if (!options) options = {};
  options['format'] = 'text';

  /**
   * @private @const {!proto.core.TemporalCoreClient} The delegate callback based client
   */
  this.delegateClient_ = new proto.core.TemporalCoreClient(
      hostname, credentials, options);

};


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.core.Empty,
 *   !proto.core.ServiceStatus>}
 */
const methodInfo_TemporalCore_Status = new grpc.web.AbstractClientBase.MethodInfo(
  proto.core.ServiceStatus,
  /** @param {!proto.core.Empty} request */
  function(request) {
    return request.serializeBinary();
  },
  proto.core.ServiceStatus.deserializeBinary
);


/**
 * @param {!proto.core.Empty} request The
 *     request proto
 * @param {!Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.core.ServiceStatus)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.core.ServiceStatus>|undefined}
 *     The XHR Node Readable Stream
 */
proto.core.TemporalCoreClient.prototype.status =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/core.TemporalCore/Status',
      request,
      metadata,
      methodInfo_TemporalCore_Status,
      callback);
};


/**
 * @param {!proto.core.Empty} request The
 *     request proto
 * @param {!Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.core.ServiceStatus>}
 *     The XHR Node Readable Stream
 */
proto.core.TemporalCorePromiseClient.prototype.status =
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
 *   !proto.core.Empty,
 *   !proto.core.ServiceStatistics>}
 */
const methodInfo_TemporalCore_Statistics = new grpc.web.AbstractClientBase.MethodInfo(
  proto.core.ServiceStatistics,
  /** @param {!proto.core.Empty} request */
  function(request) {
    return request.serializeBinary();
  },
  proto.core.ServiceStatistics.deserializeBinary
);


/**
 * @param {!proto.core.Empty} request The
 *     request proto
 * @param {!Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.core.ServiceStatistics)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.core.ServiceStatistics>|undefined}
 *     The XHR Node Readable Stream
 */
proto.core.TemporalCoreClient.prototype.statistics =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/core.TemporalCore/Statistics',
      request,
      metadata,
      methodInfo_TemporalCore_Statistics,
      callback);
};


/**
 * @param {!proto.core.Empty} request The
 *     request proto
 * @param {!Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.core.ServiceStatistics>}
 *     The XHR Node Readable Stream
 */
proto.core.TemporalCorePromiseClient.prototype.statistics =
    function(request, metadata) {
  return new Promise((resolve, reject) => {
    this.delegateClient_.statistics(
      request, metadata, (error, response) => {
        error ? reject(error) : resolve(response);
      });
  });
};


module.exports = proto.core;

