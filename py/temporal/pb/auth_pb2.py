# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: auth.proto

import sys
_b=sys.version_info[0]<3 and (lambda x:x) or (lambda x:x.encode('latin1'))
from google.protobuf.internal import enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='auth.proto',
  package='auth',
  syntax='proto3',
  serialized_options=_b('\n\023cloud.temporal.auth'),
  serialized_pb=_b('\n\nauth.proto\x12\x04\x61uth\x1a\x1cgoogle/api/annotations.proto\"\x07\n\x05\x45mpty\"L\n\x0bRegisterReq\x12&\n\x0b\x63redentials\x18\x01 \x01(\x0b\x32\x11.auth.Credentials\x12\x15\n\remail_address\x18\x02 \x01(\t\"l\n\nRecoverReq\x12#\n\x04type\x18\x01 \x01(\x0e\x32\x15.auth.RecoverReq.Type\x12\x15\n\remail_address\x18\x02 \x01(\t\"\"\n\x04Type\x12\x0c\n\x08USERNAME\x10\x00\x12\x0c\n\x08PASSWORD\x10\x01\"\xdf\x01\n\tUpdateReq\x12\x33\n\x0fpassword_change\x18\x01 \x01(\x0b\x32\x18.auth.UpdateReq.PasswordH\x00\x12+\n\x0btier_change\x18\x02 \x01(\x0b\x32\x14.auth.UpdateReq.TierH\x00\x1a\x36\n\x08Password\x12\x14\n\x0cold_password\x18\x01 \x01(\t\x12\x14\n\x0cnew_password\x18\x02 \x01(\t\x1a.\n\x04Tier\x12&\n\x08new_tier\x18\x01 \x01(\x0b\x32\x14.auth.UpdateReq.TierB\x08\n\x06update\"1\n\x0b\x43redentials\x12\x10\n\x08username\x18\x01 \x01(\t\x12\x10\n\x08password\x18\x02 \x01(\t\"&\n\x05Token\x12\x0e\n\x06\x65xpire\x18\x01 \x01(\x03\x12\r\n\x05token\x18\x02 \x01(\t\"\x98\x02\n\x04User\x12\n\n\x02id\x18\x01 \x01(\x04\x12\x11\n\tuser_name\x18\x02 \x01(\t\x12\x15\n\remail_address\x18\x03 \x01(\t\x12\x10\n\x08verified\x18\x04 \x01(\x08\x12\x0f\n\x07\x63redits\x18\x05 \x01(\x01\x12+\n\tipfs_keys\x18\x06 \x03(\x0b\x32\x18.auth.User.IpfsKeysEntry\x12\x15\n\ripfs_networks\x18\x07 \x03(\t\x12\x18\n\x04tier\x18\x08 \x01(\x0e\x32\n.auth.Tier\x12\x12\n\napi_access\x18\t \x01(\x08\x12\x14\n\x0c\x61\x64min_access\x18\n \x01(\x08\x1a/\n\rIpfsKeysEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01*.\n\x04Tier\x12\x08\n\x04\x46REE\x10\x00\x12\t\n\x05LIGHT\x10\x01\x12\x0b\n\x07PARTNER\x10\t\"\x04\x08\x02\x10\x08\x32\x95\x03\n\x0cTemporalAuth\x12\x44\n\x08Register\x12\x11.auth.RegisterReq\x1a\n.auth.User\"\x19\x82\xd3\xe4\x93\x02\x13\"\x11/v3/auth/register\x12\x41\n\x07Recover\x12\x10.auth.RecoverReq\x1a\n.auth.User\"\x18\x82\xd3\xe4\x93\x02\x12\"\x10/v3/auth/recover\x12?\n\x05Login\x12\x11.auth.Credentials\x1a\x0b.auth.Token\"\x16\x82\xd3\xe4\x93\x02\x10\"\x0e/v3/auth/login\x12<\n\x07\x41\x63\x63ount\x12\x0b.auth.Empty\x1a\n.auth.User\"\x18\x82\xd3\xe4\x93\x02\x12\x12\x10/v3/auth/account\x12>\n\x06Update\x12\x0f.auth.UpdateReq\x1a\n.auth.User\"\x17\x82\xd3\xe4\x93\x02\x11\"\x0f/v3/auth/update\x12=\n\x07Refresh\x12\x0b.auth.Empty\x1a\x0b.auth.Token\"\x18\x82\xd3\xe4\x93\x02\x12\"\x10/v3/auth/refreshB\x15\n\x13\x63loud.temporal.authb\x06proto3')
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])

_TIER = _descriptor.EnumDescriptor(
  name='Tier',
  full_name='auth.Tier',
  filename=None,
  file=DESCRIPTOR,
  values=[
    _descriptor.EnumValueDescriptor(
      name='FREE', index=0, number=0,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='LIGHT', index=1, number=1,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='PARTNER', index=2, number=9,
      serialized_options=None,
      type=None),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=847,
  serialized_end=893,
)
_sym_db.RegisterEnumDescriptor(_TIER)

Tier = enum_type_wrapper.EnumTypeWrapper(_TIER)
FREE = 0
LIGHT = 1
PARTNER = 9


_RECOVERREQ_TYPE = _descriptor.EnumDescriptor(
  name='Type',
  full_name='auth.RecoverReq.Type',
  filename=None,
  file=DESCRIPTOR,
  values=[
    _descriptor.EnumValueDescriptor(
      name='USERNAME', index=0, number=0,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='PASSWORD', index=1, number=1,
      serialized_options=None,
      type=None),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=211,
  serialized_end=245,
)
_sym_db.RegisterEnumDescriptor(_RECOVERREQ_TYPE)


_EMPTY = _descriptor.Descriptor(
  name='Empty',
  full_name='auth.Empty',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=50,
  serialized_end=57,
)


_REGISTERREQ = _descriptor.Descriptor(
  name='RegisterReq',
  full_name='auth.RegisterReq',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='credentials', full_name='auth.RegisterReq.credentials', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='email_address', full_name='auth.RegisterReq.email_address', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=59,
  serialized_end=135,
)


_RECOVERREQ = _descriptor.Descriptor(
  name='RecoverReq',
  full_name='auth.RecoverReq',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='type', full_name='auth.RecoverReq.type', index=0,
      number=1, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='email_address', full_name='auth.RecoverReq.email_address', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
    _RECOVERREQ_TYPE,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=137,
  serialized_end=245,
)


_UPDATEREQ_PASSWORD = _descriptor.Descriptor(
  name='Password',
  full_name='auth.UpdateReq.Password',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='old_password', full_name='auth.UpdateReq.Password.old_password', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='new_password', full_name='auth.UpdateReq.Password.new_password', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=359,
  serialized_end=413,
)

_UPDATEREQ_TIER = _descriptor.Descriptor(
  name='Tier',
  full_name='auth.UpdateReq.Tier',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='new_tier', full_name='auth.UpdateReq.Tier.new_tier', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=415,
  serialized_end=461,
)

_UPDATEREQ = _descriptor.Descriptor(
  name='UpdateReq',
  full_name='auth.UpdateReq',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='password_change', full_name='auth.UpdateReq.password_change', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='tier_change', full_name='auth.UpdateReq.tier_change', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[_UPDATEREQ_PASSWORD, _UPDATEREQ_TIER, ],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='update', full_name='auth.UpdateReq.update',
      index=0, containing_type=None, fields=[]),
  ],
  serialized_start=248,
  serialized_end=471,
)


_CREDENTIALS = _descriptor.Descriptor(
  name='Credentials',
  full_name='auth.Credentials',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='username', full_name='auth.Credentials.username', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='password', full_name='auth.Credentials.password', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=473,
  serialized_end=522,
)


_TOKEN = _descriptor.Descriptor(
  name='Token',
  full_name='auth.Token',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='expire', full_name='auth.Token.expire', index=0,
      number=1, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='token', full_name='auth.Token.token', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=524,
  serialized_end=562,
)


_USER_IPFSKEYSENTRY = _descriptor.Descriptor(
  name='IpfsKeysEntry',
  full_name='auth.User.IpfsKeysEntry',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='key', full_name='auth.User.IpfsKeysEntry.key', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='value', full_name='auth.User.IpfsKeysEntry.value', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=_b('8\001'),
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=798,
  serialized_end=845,
)

_USER = _descriptor.Descriptor(
  name='User',
  full_name='auth.User',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='id', full_name='auth.User.id', index=0,
      number=1, type=4, cpp_type=4, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='user_name', full_name='auth.User.user_name', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='email_address', full_name='auth.User.email_address', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='verified', full_name='auth.User.verified', index=3,
      number=4, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='credits', full_name='auth.User.credits', index=4,
      number=5, type=1, cpp_type=5, label=1,
      has_default_value=False, default_value=float(0),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='ipfs_keys', full_name='auth.User.ipfs_keys', index=5,
      number=6, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='ipfs_networks', full_name='auth.User.ipfs_networks', index=6,
      number=7, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='tier', full_name='auth.User.tier', index=7,
      number=8, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='api_access', full_name='auth.User.api_access', index=8,
      number=9, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='admin_access', full_name='auth.User.admin_access', index=9,
      number=10, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[_USER_IPFSKEYSENTRY, ],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=565,
  serialized_end=845,
)

_REGISTERREQ.fields_by_name['credentials'].message_type = _CREDENTIALS
_RECOVERREQ.fields_by_name['type'].enum_type = _RECOVERREQ_TYPE
_RECOVERREQ_TYPE.containing_type = _RECOVERREQ
_UPDATEREQ_PASSWORD.containing_type = _UPDATEREQ
_UPDATEREQ_TIER.fields_by_name['new_tier'].message_type = _UPDATEREQ_TIER
_UPDATEREQ_TIER.containing_type = _UPDATEREQ
_UPDATEREQ.fields_by_name['password_change'].message_type = _UPDATEREQ_PASSWORD
_UPDATEREQ.fields_by_name['tier_change'].message_type = _UPDATEREQ_TIER
_UPDATEREQ.oneofs_by_name['update'].fields.append(
  _UPDATEREQ.fields_by_name['password_change'])
_UPDATEREQ.fields_by_name['password_change'].containing_oneof = _UPDATEREQ.oneofs_by_name['update']
_UPDATEREQ.oneofs_by_name['update'].fields.append(
  _UPDATEREQ.fields_by_name['tier_change'])
_UPDATEREQ.fields_by_name['tier_change'].containing_oneof = _UPDATEREQ.oneofs_by_name['update']
_USER_IPFSKEYSENTRY.containing_type = _USER
_USER.fields_by_name['ipfs_keys'].message_type = _USER_IPFSKEYSENTRY
_USER.fields_by_name['tier'].enum_type = _TIER
DESCRIPTOR.message_types_by_name['Empty'] = _EMPTY
DESCRIPTOR.message_types_by_name['RegisterReq'] = _REGISTERREQ
DESCRIPTOR.message_types_by_name['RecoverReq'] = _RECOVERREQ
DESCRIPTOR.message_types_by_name['UpdateReq'] = _UPDATEREQ
DESCRIPTOR.message_types_by_name['Credentials'] = _CREDENTIALS
DESCRIPTOR.message_types_by_name['Token'] = _TOKEN
DESCRIPTOR.message_types_by_name['User'] = _USER
DESCRIPTOR.enum_types_by_name['Tier'] = _TIER
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Empty = _reflection.GeneratedProtocolMessageType('Empty', (_message.Message,), dict(
  DESCRIPTOR = _EMPTY,
  __module__ = 'auth_pb2'
  # @@protoc_insertion_point(class_scope:auth.Empty)
  ))
_sym_db.RegisterMessage(Empty)

RegisterReq = _reflection.GeneratedProtocolMessageType('RegisterReq', (_message.Message,), dict(
  DESCRIPTOR = _REGISTERREQ,
  __module__ = 'auth_pb2'
  # @@protoc_insertion_point(class_scope:auth.RegisterReq)
  ))
_sym_db.RegisterMessage(RegisterReq)

RecoverReq = _reflection.GeneratedProtocolMessageType('RecoverReq', (_message.Message,), dict(
  DESCRIPTOR = _RECOVERREQ,
  __module__ = 'auth_pb2'
  # @@protoc_insertion_point(class_scope:auth.RecoverReq)
  ))
_sym_db.RegisterMessage(RecoverReq)

UpdateReq = _reflection.GeneratedProtocolMessageType('UpdateReq', (_message.Message,), dict(

  Password = _reflection.GeneratedProtocolMessageType('Password', (_message.Message,), dict(
    DESCRIPTOR = _UPDATEREQ_PASSWORD,
    __module__ = 'auth_pb2'
    # @@protoc_insertion_point(class_scope:auth.UpdateReq.Password)
    ))
  ,

  Tier = _reflection.GeneratedProtocolMessageType('Tier', (_message.Message,), dict(
    DESCRIPTOR = _UPDATEREQ_TIER,
    __module__ = 'auth_pb2'
    # @@protoc_insertion_point(class_scope:auth.UpdateReq.Tier)
    ))
  ,
  DESCRIPTOR = _UPDATEREQ,
  __module__ = 'auth_pb2'
  # @@protoc_insertion_point(class_scope:auth.UpdateReq)
  ))
_sym_db.RegisterMessage(UpdateReq)
_sym_db.RegisterMessage(UpdateReq.Password)
_sym_db.RegisterMessage(UpdateReq.Tier)

Credentials = _reflection.GeneratedProtocolMessageType('Credentials', (_message.Message,), dict(
  DESCRIPTOR = _CREDENTIALS,
  __module__ = 'auth_pb2'
  # @@protoc_insertion_point(class_scope:auth.Credentials)
  ))
_sym_db.RegisterMessage(Credentials)

Token = _reflection.GeneratedProtocolMessageType('Token', (_message.Message,), dict(
  DESCRIPTOR = _TOKEN,
  __module__ = 'auth_pb2'
  # @@protoc_insertion_point(class_scope:auth.Token)
  ))
_sym_db.RegisterMessage(Token)

User = _reflection.GeneratedProtocolMessageType('User', (_message.Message,), dict(

  IpfsKeysEntry = _reflection.GeneratedProtocolMessageType('IpfsKeysEntry', (_message.Message,), dict(
    DESCRIPTOR = _USER_IPFSKEYSENTRY,
    __module__ = 'auth_pb2'
    # @@protoc_insertion_point(class_scope:auth.User.IpfsKeysEntry)
    ))
  ,
  DESCRIPTOR = _USER,
  __module__ = 'auth_pb2'
  # @@protoc_insertion_point(class_scope:auth.User)
  ))
_sym_db.RegisterMessage(User)
_sym_db.RegisterMessage(User.IpfsKeysEntry)


DESCRIPTOR._options = None
_USER_IPFSKEYSENTRY._options = None

_TEMPORALAUTH = _descriptor.ServiceDescriptor(
  name='TemporalAuth',
  full_name='auth.TemporalAuth',
  file=DESCRIPTOR,
  index=0,
  serialized_options=None,
  serialized_start=896,
  serialized_end=1301,
  methods=[
  _descriptor.MethodDescriptor(
    name='Register',
    full_name='auth.TemporalAuth.Register',
    index=0,
    containing_service=None,
    input_type=_REGISTERREQ,
    output_type=_USER,
    serialized_options=_b('\202\323\344\223\002\023\"\021/v3/auth/register'),
  ),
  _descriptor.MethodDescriptor(
    name='Recover',
    full_name='auth.TemporalAuth.Recover',
    index=1,
    containing_service=None,
    input_type=_RECOVERREQ,
    output_type=_USER,
    serialized_options=_b('\202\323\344\223\002\022\"\020/v3/auth/recover'),
  ),
  _descriptor.MethodDescriptor(
    name='Login',
    full_name='auth.TemporalAuth.Login',
    index=2,
    containing_service=None,
    input_type=_CREDENTIALS,
    output_type=_TOKEN,
    serialized_options=_b('\202\323\344\223\002\020\"\016/v3/auth/login'),
  ),
  _descriptor.MethodDescriptor(
    name='Account',
    full_name='auth.TemporalAuth.Account',
    index=3,
    containing_service=None,
    input_type=_EMPTY,
    output_type=_USER,
    serialized_options=_b('\202\323\344\223\002\022\022\020/v3/auth/account'),
  ),
  _descriptor.MethodDescriptor(
    name='Update',
    full_name='auth.TemporalAuth.Update',
    index=4,
    containing_service=None,
    input_type=_UPDATEREQ,
    output_type=_USER,
    serialized_options=_b('\202\323\344\223\002\021\"\017/v3/auth/update'),
  ),
  _descriptor.MethodDescriptor(
    name='Refresh',
    full_name='auth.TemporalAuth.Refresh',
    index=5,
    containing_service=None,
    input_type=_EMPTY,
    output_type=_TOKEN,
    serialized_options=_b('\202\323\344\223\002\022\"\020/v3/auth/refresh'),
  ),
])
_sym_db.RegisterServiceDescriptor(_TEMPORALAUTH)

DESCRIPTOR.services_by_name['TemporalAuth'] = _TEMPORALAUTH

# @@protoc_insertion_point(module_scope)
