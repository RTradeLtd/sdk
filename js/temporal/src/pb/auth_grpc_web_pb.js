/**
 * @fileoverview gRPC-Web generated client stub for auth
 * @enhanceable
 * @public
 */

// GENERATED CODE -- DO NOT EDIT!



const grpc = {};
grpc.web = require('grpc-web');


var google_api_annotations_pb = require('./google/api/annotations_pb.js')
const proto = {};
proto.auth = require('./auth_pb.js');

/**
 * @param {string} hostname
 * @param {?Object} credentials
 * @param {?Object} options
 * @constructor
 * @struct
 * @final
 */
proto.auth.TemporalAuthClient =
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
proto.auth.TemporalAuthPromiseClient =
    function(hostname, credentials, options) {
  if (!options) options = {};
  options['format'] = 'text';

  /**
   * @private @const {!proto.auth.TemporalAuthClient} The delegate callback based client
   */
  this.delegateClient_ = new proto.auth.TemporalAuthClient(
      hostname, credentials, options);

};


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.auth.RegisterReq,
 *   !proto.auth.User>}
 */
const methodInfo_TemporalAuth_Register = new grpc.web.AbstractClientBase.MethodInfo(
  proto.auth.User,
  /** @param {!proto.auth.RegisterReq} request */
  function(request) {
    return request.serializeBinary();
  },
  proto.auth.User.deserializeBinary
);


/**
 * @param {!proto.auth.RegisterReq} request The
 *     request proto
 * @param {!Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.auth.User)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.auth.User>|undefined}
 *     The XHR Node Readable Stream
 */
proto.auth.TemporalAuthClient.prototype.register =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/auth.TemporalAuth/Register',
      request,
      metadata,
      methodInfo_TemporalAuth_Register,
      callback);
};


/**
 * @param {!proto.auth.RegisterReq} request The
 *     request proto
 * @param {!Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.auth.User>}
 *     The XHR Node Readable Stream
 */
proto.auth.TemporalAuthPromiseClient.prototype.register =
    function(request, metadata) {
  return new Promise((resolve, reject) => {
    this.delegateClient_.register(
      request, metadata, (error, response) => {
        error ? reject(error) : resolve(response);
      });
  });
};


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.auth.RecoverReq,
 *   !proto.auth.Empty>}
 */
const methodInfo_TemporalAuth_Recover = new grpc.web.AbstractClientBase.MethodInfo(
  proto.auth.Empty,
  /** @param {!proto.auth.RecoverReq} request */
  function(request) {
    return request.serializeBinary();
  },
  proto.auth.Empty.deserializeBinary
);


/**
 * @param {!proto.auth.RecoverReq} request The
 *     request proto
 * @param {!Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.auth.Empty)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.auth.Empty>|undefined}
 *     The XHR Node Readable Stream
 */
proto.auth.TemporalAuthClient.prototype.recover =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/auth.TemporalAuth/Recover',
      request,
      metadata,
      methodInfo_TemporalAuth_Recover,
      callback);
};


/**
 * @param {!proto.auth.RecoverReq} request The
 *     request proto
 * @param {!Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.auth.Empty>}
 *     The XHR Node Readable Stream
 */
proto.auth.TemporalAuthPromiseClient.prototype.recover =
    function(request, metadata) {
  return new Promise((resolve, reject) => {
    this.delegateClient_.recover(
      request, metadata, (error, response) => {
        error ? reject(error) : resolve(response);
      });
  });
};


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.auth.Credentials,
 *   !proto.auth.Token>}
 */
const methodInfo_TemporalAuth_Login = new grpc.web.AbstractClientBase.MethodInfo(
  proto.auth.Token,
  /** @param {!proto.auth.Credentials} request */
  function(request) {
    return request.serializeBinary();
  },
  proto.auth.Token.deserializeBinary
);


/**
 * @param {!proto.auth.Credentials} request The
 *     request proto
 * @param {!Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.auth.Token)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.auth.Token>|undefined}
 *     The XHR Node Readable Stream
 */
proto.auth.TemporalAuthClient.prototype.login =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/auth.TemporalAuth/Login',
      request,
      metadata,
      methodInfo_TemporalAuth_Login,
      callback);
};


/**
 * @param {!proto.auth.Credentials} request The
 *     request proto
 * @param {!Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.auth.Token>}
 *     The XHR Node Readable Stream
 */
proto.auth.TemporalAuthPromiseClient.prototype.login =
    function(request, metadata) {
  return new Promise((resolve, reject) => {
    this.delegateClient_.login(
      request, metadata, (error, response) => {
        error ? reject(error) : resolve(response);
      });
  });
};


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.auth.Empty,
 *   !proto.auth.User>}
 */
const methodInfo_TemporalAuth_Account = new grpc.web.AbstractClientBase.MethodInfo(
  proto.auth.User,
  /** @param {!proto.auth.Empty} request */
  function(request) {
    return request.serializeBinary();
  },
  proto.auth.User.deserializeBinary
);


/**
 * @param {!proto.auth.Empty} request The
 *     request proto
 * @param {!Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.auth.User)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.auth.User>|undefined}
 *     The XHR Node Readable Stream
 */
proto.auth.TemporalAuthClient.prototype.account =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/auth.TemporalAuth/Account',
      request,
      metadata,
      methodInfo_TemporalAuth_Account,
      callback);
};


/**
 * @param {!proto.auth.Empty} request The
 *     request proto
 * @param {!Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.auth.User>}
 *     The XHR Node Readable Stream
 */
proto.auth.TemporalAuthPromiseClient.prototype.account =
    function(request, metadata) {
  return new Promise((resolve, reject) => {
    this.delegateClient_.account(
      request, metadata, (error, response) => {
        error ? reject(error) : resolve(response);
      });
  });
};


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.auth.UpdateReq,
 *   !proto.auth.User>}
 */
const methodInfo_TemporalAuth_Update = new grpc.web.AbstractClientBase.MethodInfo(
  proto.auth.User,
  /** @param {!proto.auth.UpdateReq} request */
  function(request) {
    return request.serializeBinary();
  },
  proto.auth.User.deserializeBinary
);


/**
 * @param {!proto.auth.UpdateReq} request The
 *     request proto
 * @param {!Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.auth.User)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.auth.User>|undefined}
 *     The XHR Node Readable Stream
 */
proto.auth.TemporalAuthClient.prototype.update =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/auth.TemporalAuth/Update',
      request,
      metadata,
      methodInfo_TemporalAuth_Update,
      callback);
};


/**
 * @param {!proto.auth.UpdateReq} request The
 *     request proto
 * @param {!Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.auth.User>}
 *     The XHR Node Readable Stream
 */
proto.auth.TemporalAuthPromiseClient.prototype.update =
    function(request, metadata) {
  return new Promise((resolve, reject) => {
    this.delegateClient_.update(
      request, metadata, (error, response) => {
        error ? reject(error) : resolve(response);
      });
  });
};


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.auth.Empty,
 *   !proto.auth.Token>}
 */
const methodInfo_TemporalAuth_Refresh = new grpc.web.AbstractClientBase.MethodInfo(
  proto.auth.Token,
  /** @param {!proto.auth.Empty} request */
  function(request) {
    return request.serializeBinary();
  },
  proto.auth.Token.deserializeBinary
);


/**
 * @param {!proto.auth.Empty} request The
 *     request proto
 * @param {!Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.auth.Token)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.auth.Token>|undefined}
 *     The XHR Node Readable Stream
 */
proto.auth.TemporalAuthClient.prototype.refresh =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/auth.TemporalAuth/Refresh',
      request,
      metadata,
      methodInfo_TemporalAuth_Refresh,
      callback);
};


/**
 * @param {!proto.auth.Empty} request The
 *     request proto
 * @param {!Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.auth.Token>}
 *     The XHR Node Readable Stream
 */
proto.auth.TemporalAuthPromiseClient.prototype.refresh =
    function(request, metadata) {
  return new Promise((resolve, reject) => {
    this.delegateClient_.refresh(
      request, metadata, (error, response) => {
        error ? reject(error) : resolve(response);
      });
  });
};


module.exports = proto.auth;

