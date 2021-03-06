# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
import grpc

import auth_pb2 as auth__pb2


class TemporalAuthStub(object):
  """TemporalAuth implements Temporal's authentication and account management APIs
  """

  def __init__(self, channel):
    """Constructor.

    Args:
      channel: A grpc.Channel.
    """
    self.Register = channel.unary_unary(
        '/auth.TemporalAuth/Register',
        request_serializer=auth__pb2.RegisterReq.SerializeToString,
        response_deserializer=auth__pb2.User.FromString,
        )
    self.Recover = channel.unary_unary(
        '/auth.TemporalAuth/Recover',
        request_serializer=auth__pb2.RecoverReq.SerializeToString,
        response_deserializer=auth__pb2.Empty.FromString,
        )
    self.Login = channel.unary_unary(
        '/auth.TemporalAuth/Login',
        request_serializer=auth__pb2.Credentials.SerializeToString,
        response_deserializer=auth__pb2.Token.FromString,
        )
    self.Account = channel.unary_unary(
        '/auth.TemporalAuth/Account',
        request_serializer=auth__pb2.Empty.SerializeToString,
        response_deserializer=auth__pb2.User.FromString,
        )
    self.Update = channel.unary_unary(
        '/auth.TemporalAuth/Update',
        request_serializer=auth__pb2.UpdateReq.SerializeToString,
        response_deserializer=auth__pb2.User.FromString,
        )
    self.Refresh = channel.unary_unary(
        '/auth.TemporalAuth/Refresh',
        request_serializer=auth__pb2.Empty.SerializeToString,
        response_deserializer=auth__pb2.Token.FromString,
        )


class TemporalAuthServicer(object):
  """TemporalAuth implements Temporal's authentication and account management APIs
  """

  def Register(self, request, context):
    """Register facilitates user creation.
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def Recover(self, request, context):
    """Recover facilitates account recovery.
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def Login(self, request, context):
    """Login accepts credentials and returns a token for use with further requests.
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def Account(self, request, context):
    """Account returns the account associated with an authenticated request.
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def Update(self, request, context):
    """Update facilitates modification of the account associated with an
    authenticated request.
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def Refresh(self, request, context):
    """Refresh provides a refreshed token associated with an authenticated request.
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')


def add_TemporalAuthServicer_to_server(servicer, server):
  rpc_method_handlers = {
      'Register': grpc.unary_unary_rpc_method_handler(
          servicer.Register,
          request_deserializer=auth__pb2.RegisterReq.FromString,
          response_serializer=auth__pb2.User.SerializeToString,
      ),
      'Recover': grpc.unary_unary_rpc_method_handler(
          servicer.Recover,
          request_deserializer=auth__pb2.RecoverReq.FromString,
          response_serializer=auth__pb2.Empty.SerializeToString,
      ),
      'Login': grpc.unary_unary_rpc_method_handler(
          servicer.Login,
          request_deserializer=auth__pb2.Credentials.FromString,
          response_serializer=auth__pb2.Token.SerializeToString,
      ),
      'Account': grpc.unary_unary_rpc_method_handler(
          servicer.Account,
          request_deserializer=auth__pb2.Empty.FromString,
          response_serializer=auth__pb2.User.SerializeToString,
      ),
      'Update': grpc.unary_unary_rpc_method_handler(
          servicer.Update,
          request_deserializer=auth__pb2.UpdateReq.FromString,
          response_serializer=auth__pb2.User.SerializeToString,
      ),
      'Refresh': grpc.unary_unary_rpc_method_handler(
          servicer.Refresh,
          request_deserializer=auth__pb2.Empty.FromString,
          response_serializer=auth__pb2.Token.SerializeToString,
      ),
  }
  generic_handler = grpc.method_handlers_generic_handler(
      'auth.TemporalAuth', rpc_method_handlers)
  server.add_generic_rpc_handlers((generic_handler,))
