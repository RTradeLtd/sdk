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
 *   !proto.ipfs.Empty>}
 */
const methodInfo_TemporalIPFS_Status = new grpc.web.AbstractClientBase.MethodInfo(
  proto.ipfs.Empty,
  /** @param {!proto.ipfs.Empty} request */
  function(request) {
    return request.serializeBinary();
  },
  proto.ipfs.Empty.deserializeBinary
);


/**
 * @param {!proto.ipfs.Empty} request The
 *     request proto
 * @param {!Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.ipfs.Empty)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.ipfs.Empty>|undefined}
 *     The XHR Node Readable Stream
 */
proto.ipfs.TemporalIPFSClient.prototype.status =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/ipfs.TemporalIPFS/Status',
      request,
      metadata,
      methodInfo_TemporalIPFS_Status,
      callback);
};


/**
 * @param {!proto.ipfs.Empty} request The
 *     request proto
 * @param {!Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.ipfs.Empty>}
 *     The XHR Node Readable Stream
 */
proto.ipfs.TemporalIPFSPromiseClient.prototype.status =
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
 *   !proto.ipfs.CreateNetworkReq,
 *   !proto.ipfs.NetworkDetails>}
 */
const methodInfo_TemporalIPFS_CreateNetwork = new grpc.web.AbstractClientBase.MethodInfo(
  proto.ipfs.NetworkDetails,
  /** @param {!proto.ipfs.CreateNetworkReq} request */
  function(request) {
    return request.serializeBinary();
  },
  proto.ipfs.NetworkDetails.deserializeBinary
);


/**
 * @param {!proto.ipfs.CreateNetworkReq} request The
 *     request proto
 * @param {!Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.ipfs.NetworkDetails)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.ipfs.NetworkDetails>|undefined}
 *     The XHR Node Readable Stream
 */
proto.ipfs.TemporalIPFSClient.prototype.createNetwork =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/ipfs.TemporalIPFS/CreateNetwork',
      request,
      metadata,
      methodInfo_TemporalIPFS_CreateNetwork,
      callback);
};


/**
 * @param {!proto.ipfs.CreateNetworkReq} request The
 *     request proto
 * @param {!Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.ipfs.NetworkDetails>}
 *     The XHR Node Readable Stream
 */
proto.ipfs.TemporalIPFSPromiseClient.prototype.createNetwork =
    function(request, metadata) {
  return new Promise((resolve, reject) => {
    this.delegateClient_.createNetwork(
      request, metadata, (error, response) => {
        error ? reject(error) : resolve(response);
      });
  });
};


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.ipfs.Network,
 *   !proto.ipfs.Empty>}
 */
const methodInfo_TemporalIPFS_StartNetwork = new grpc.web.AbstractClientBase.MethodInfo(
  proto.ipfs.Empty,
  /** @param {!proto.ipfs.Network} request */
  function(request) {
    return request.serializeBinary();
  },
  proto.ipfs.Empty.deserializeBinary
);


/**
 * @param {!proto.ipfs.Network} request The
 *     request proto
 * @param {!Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.ipfs.Empty)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.ipfs.Empty>|undefined}
 *     The XHR Node Readable Stream
 */
proto.ipfs.TemporalIPFSClient.prototype.startNetwork =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/ipfs.TemporalIPFS/StartNetwork',
      request,
      metadata,
      methodInfo_TemporalIPFS_StartNetwork,
      callback);
};


/**
 * @param {!proto.ipfs.Network} request The
 *     request proto
 * @param {!Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.ipfs.Empty>}
 *     The XHR Node Readable Stream
 */
proto.ipfs.TemporalIPFSPromiseClient.prototype.startNetwork =
    function(request, metadata) {
  return new Promise((resolve, reject) => {
    this.delegateClient_.startNetwork(
      request, metadata, (error, response) => {
        error ? reject(error) : resolve(response);
      });
  });
};


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.ipfs.Network,
 *   !proto.ipfs.Empty>}
 */
const methodInfo_TemporalIPFS_StopNetwork = new grpc.web.AbstractClientBase.MethodInfo(
  proto.ipfs.Empty,
  /** @param {!proto.ipfs.Network} request */
  function(request) {
    return request.serializeBinary();
  },
  proto.ipfs.Empty.deserializeBinary
);


/**
 * @param {!proto.ipfs.Network} request The
 *     request proto
 * @param {!Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.ipfs.Empty)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.ipfs.Empty>|undefined}
 *     The XHR Node Readable Stream
 */
proto.ipfs.TemporalIPFSClient.prototype.stopNetwork =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/ipfs.TemporalIPFS/StopNetwork',
      request,
      metadata,
      methodInfo_TemporalIPFS_StopNetwork,
      callback);
};


/**
 * @param {!proto.ipfs.Network} request The
 *     request proto
 * @param {!Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.ipfs.Empty>}
 *     The XHR Node Readable Stream
 */
proto.ipfs.TemporalIPFSPromiseClient.prototype.stopNetwork =
    function(request, metadata) {
  return new Promise((resolve, reject) => {
    this.delegateClient_.stopNetwork(
      request, metadata, (error, response) => {
        error ? reject(error) : resolve(response);
      });
  });
};


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.ipfs.Network,
 *   !proto.ipfs.Empty>}
 */
const methodInfo_TemporalIPFS_RemoveNetwork = new grpc.web.AbstractClientBase.MethodInfo(
  proto.ipfs.Empty,
  /** @param {!proto.ipfs.Network} request */
  function(request) {
    return request.serializeBinary();
  },
  proto.ipfs.Empty.deserializeBinary
);


/**
 * @param {!proto.ipfs.Network} request The
 *     request proto
 * @param {!Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.ipfs.Empty)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.ipfs.Empty>|undefined}
 *     The XHR Node Readable Stream
 */
proto.ipfs.TemporalIPFSClient.prototype.removeNetwork =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/ipfs.TemporalIPFS/RemoveNetwork',
      request,
      metadata,
      methodInfo_TemporalIPFS_RemoveNetwork,
      callback);
};


/**
 * @param {!proto.ipfs.Network} request The
 *     request proto
 * @param {!Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.ipfs.Empty>}
 *     The XHR Node Readable Stream
 */
proto.ipfs.TemporalIPFSPromiseClient.prototype.removeNetwork =
    function(request, metadata) {
  return new Promise((resolve, reject) => {
    this.delegateClient_.removeNetwork(
      request, metadata, (error, response) => {
        error ? reject(error) : resolve(response);
      });
  });
};


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.ipfs.Network,
 *   !proto.ipfs.NetworkDetails>}
 */
const methodInfo_TemporalIPFS_NetworkInfo = new grpc.web.AbstractClientBase.MethodInfo(
  proto.ipfs.NetworkDetails,
  /** @param {!proto.ipfs.Network} request */
  function(request) {
    return request.serializeBinary();
  },
  proto.ipfs.NetworkDetails.deserializeBinary
);


/**
 * @param {!proto.ipfs.Network} request The
 *     request proto
 * @param {!Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.ipfs.NetworkDetails)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.ipfs.NetworkDetails>|undefined}
 *     The XHR Node Readable Stream
 */
proto.ipfs.TemporalIPFSClient.prototype.networkInfo =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/ipfs.TemporalIPFS/NetworkInfo',
      request,
      metadata,
      methodInfo_TemporalIPFS_NetworkInfo,
      callback);
};


/**
 * @param {!proto.ipfs.Network} request The
 *     request proto
 * @param {!Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.ipfs.NetworkDetails>}
 *     The XHR Node Readable Stream
 */
proto.ipfs.TemporalIPFSPromiseClient.prototype.networkInfo =
    function(request, metadata) {
  return new Promise((resolve, reject) => {
    this.delegateClient_.networkInfo(
      request, metadata, (error, response) => {
        error ? reject(error) : resolve(response);
      });
  });
};


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.ipfs.Empty,
 *   !proto.ipfs.NetworkList>}
 */
const methodInfo_TemporalIPFS_ListNetworks = new grpc.web.AbstractClientBase.MethodInfo(
  proto.ipfs.NetworkList,
  /** @param {!proto.ipfs.Empty} request */
  function(request) {
    return request.serializeBinary();
  },
  proto.ipfs.NetworkList.deserializeBinary
);


/**
 * @param {!proto.ipfs.Empty} request The
 *     request proto
 * @param {!Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.ipfs.NetworkList)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.ipfs.NetworkList>|undefined}
 *     The XHR Node Readable Stream
 */
proto.ipfs.TemporalIPFSClient.prototype.listNetworks =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/ipfs.TemporalIPFS/ListNetworks',
      request,
      metadata,
      methodInfo_TemporalIPFS_ListNetworks,
      callback);
};


/**
 * @param {!proto.ipfs.Empty} request The
 *     request proto
 * @param {!Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.ipfs.NetworkList>}
 *     The XHR Node Readable Stream
 */
proto.ipfs.TemporalIPFSPromiseClient.prototype.listNetworks =
    function(request, metadata) {
  return new Promise((resolve, reject) => {
    this.delegateClient_.listNetworks(
      request, metadata, (error, response) => {
        error ? reject(error) : resolve(response);
      });
  });
};


module.exports = proto.ipfs;

