# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: core.proto

import sys
_b=sys.version_info[0]<3 and (lambda x:x) or (lambda x:x.encode('latin1'))
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='core.proto',
  package='core',
  syntax='proto3',
  serialized_options=_b('\n\023cloud.temporal.core'),
  serialized_pb=_b('\n\ncore.proto\x12\x04\x63ore\x1a\x1cgoogle/api/annotations.proto\"\x07\n\x05\x45mpty\"1\n\rServiceStatus\x12\x0f\n\x07version\x18\x01 \x01(\t\x12\x0f\n\x07message\x18\x02 \x01(\t\"$\n\x11ServiceStatistics\x12\x0f\n\x07metrics\x18\x01 \x01(\x0c\x32\xa4\x01\n\x0cTemporalCore\x12\x43\n\x06Status\x12\x0b.core.Empty\x1a\x13.core.ServiceStatus\"\x17\x82\xd3\xe4\x93\x02\x11\x12\x0f/v3/core/status\x12O\n\nStatistics\x12\x0b.core.Empty\x1a\x17.core.ServiceStatistics\"\x1b\x82\xd3\xe4\x93\x02\x15\x12\x13/v3/core/statisticsB\x15\n\x13\x63loud.temporal.coreb\x06proto3')
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_EMPTY = _descriptor.Descriptor(
  name='Empty',
  full_name='core.Empty',
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


_SERVICESTATUS = _descriptor.Descriptor(
  name='ServiceStatus',
  full_name='core.ServiceStatus',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='version', full_name='core.ServiceStatus.version', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='message', full_name='core.ServiceStatus.message', index=1,
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
  serialized_end=108,
)


_SERVICESTATISTICS = _descriptor.Descriptor(
  name='ServiceStatistics',
  full_name='core.ServiceStatistics',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='metrics', full_name='core.ServiceStatistics.metrics', index=0,
      number=1, type=12, cpp_type=9, label=1,
      has_default_value=False, default_value=_b(""),
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
  serialized_start=110,
  serialized_end=146,
)

DESCRIPTOR.message_types_by_name['Empty'] = _EMPTY
DESCRIPTOR.message_types_by_name['ServiceStatus'] = _SERVICESTATUS
DESCRIPTOR.message_types_by_name['ServiceStatistics'] = _SERVICESTATISTICS
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Empty = _reflection.GeneratedProtocolMessageType('Empty', (_message.Message,), dict(
  DESCRIPTOR = _EMPTY,
  __module__ = 'core_pb2'
  # @@protoc_insertion_point(class_scope:core.Empty)
  ))
_sym_db.RegisterMessage(Empty)

ServiceStatus = _reflection.GeneratedProtocolMessageType('ServiceStatus', (_message.Message,), dict(
  DESCRIPTOR = _SERVICESTATUS,
  __module__ = 'core_pb2'
  # @@protoc_insertion_point(class_scope:core.ServiceStatus)
  ))
_sym_db.RegisterMessage(ServiceStatus)

ServiceStatistics = _reflection.GeneratedProtocolMessageType('ServiceStatistics', (_message.Message,), dict(
  DESCRIPTOR = _SERVICESTATISTICS,
  __module__ = 'core_pb2'
  # @@protoc_insertion_point(class_scope:core.ServiceStatistics)
  ))
_sym_db.RegisterMessage(ServiceStatistics)


DESCRIPTOR._options = None

_TEMPORALCORE = _descriptor.ServiceDescriptor(
  name='TemporalCore',
  full_name='core.TemporalCore',
  file=DESCRIPTOR,
  index=0,
  serialized_options=None,
  serialized_start=149,
  serialized_end=313,
  methods=[
  _descriptor.MethodDescriptor(
    name='Status',
    full_name='core.TemporalCore.Status',
    index=0,
    containing_service=None,
    input_type=_EMPTY,
    output_type=_SERVICESTATUS,
    serialized_options=_b('\202\323\344\223\002\021\022\017/v3/core/status'),
  ),
  _descriptor.MethodDescriptor(
    name='Statistics',
    full_name='core.TemporalCore.Statistics',
    index=1,
    containing_service=None,
    input_type=_EMPTY,
    output_type=_SERVICESTATISTICS,
    serialized_options=_b('\202\323\344\223\002\025\022\023/v3/core/statistics'),
  ),
])
_sym_db.RegisterServiceDescriptor(_TEMPORALCORE)

DESCRIPTOR.services_by_name['TemporalCore'] = _TEMPORALCORE

# @@protoc_insertion_point(module_scope)