# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: store.proto

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
  name='store.proto',
  package='store',
  syntax='proto3',
  serialized_options=_b('\n\024cloud.temporal.store'),
  serialized_pb=_b('\n\x0bstore.proto\x12\x05store\x1a\x1cgoogle/api/annotations.proto\"\x07\n\x05\x45mpty\"M\n\tUploadReq\x12\x19\n\x04\x62lob\x18\x01 \x01(\x0b\x32\x0b.store.Blob\x12%\n\x07options\x18\x02 \x01(\x0b\x32\x14.store.ObjectOptions\"S\n\x0b\x44ownloadReq\x12\x1d\n\x06object\x18\x01 \x01(\x0b\x32\r.store.Object\x12%\n\x07options\x18\x02 \x01(\x0b\x32\x14.store.ObjectOptions\"J\n\x0eListObjectsReq\x12\x10\n\x08networks\x18\x01 \x03(\t\x12\x0e\n\x06hashes\x18\x02 \x03(\t\x12\x16\n\x0e\x65ncrypted_only\x18\x03 \x01(\x08\"G\n\rObjectOptions\x12\x11\n\thold_time\x18\x01 \x01(\x03\x12\x12\n\npassphrase\x18\x02 \x01(\t\x12\x0f\n\x07network\x18\x03 \x01(\t\"#\n\x07KeyList\x12\x18\n\x04keys\x18\x01 \x03(\x0b\x32\n.store.Key\"0\n\nObjectList\x12\"\n\x07objects\x18\x02 \x03(\x0b\x32\x11.store.ObjectInfo\"*\n\x04\x42lob\x12\x0f\n\x07\x63ontent\x18\x01 \x01(\x0c\x12\x11\n\thold_time\x18\x02 \x01(\x03\"\x16\n\x06Object\x12\x0c\n\x04hash\x18\x01 \x01(\t\"u\n\x0bObjectStats\x12\x12\n\nblock_size\x18\x01 \x01(\x05\x12\x17\n\x0f\x63umulative_size\x18\x02 \x01(\x05\x12\x11\n\tdata_size\x18\x03 \x01(\x05\x12\x12\n\nlinks_size\x18\x04 \x01(\x05\x12\x12\n\nlink_count\x18\x05 \x01(\x05\"\xd3\x02\n\nObjectInfo\x12\x1d\n\x06object\x18\x01 \x01(\x0b\x32\r.store.Object\x12!\n\x05stats\x18\x02 \x01(\x0b\x32\x12.store.ObjectStats\x12*\n\x07\x64\x65tails\x18\x03 \x01(\x0b\x32\x19.store.ObjectInfo.Details\x12,\n\x05perms\x18\x04 \x01(\x0b\x32\x1d.store.ObjectInfo.Permissions\x1ay\n\x07\x44\x65tails\x12\x12\n\ncreated_at\x18\x01 \x01(\x03\x12\x12\n\ndeleted_at\x18\x02 \x01(\x03\x12\x12\n\nupdated_at\x18\x03 \x01(\x03\x12\x11\n\tencrypted\x18\x04 \x01(\x08\x12\x11\n\thold_time\x18\x05 \x01(\x05\x12\x0c\n\x04type\x18\x06 \x01(\t\x1a.\n\x0bPermissions\x12\x10\n\x08uploader\x18\x01 \x01(\t\x12\r\n\x05users\x18\x02 \x03(\t\"5\n\x05\x45vent\x12\x1b\n\x05topic\x18\x01 \x01(\x0b\x32\x0c.store.Topic\x12\x0f\n\x07message\x18\x02 \x01(\t\"\'\n\x05Topic\x12\r\n\x05topic\x18\x01 \x01(\t\x12\x0f\n\x07network\x18\x02 \x01(\t\"\x88\x02\n\x03Key\x12\x1d\n\x03rsa\x18\x01 \x01(\x0b\x32\x0e.store.Key.RSAH\x00\x12%\n\x07\x65\x64\x32\x35\x35\x31\x39\x18\x02 \x01(\x0b\x32\x12.store.Key.ED25519H\x00\x12\x0c\n\x04name\x18\x03 \x01(\t\x12\n\n\x02id\x18\x04 \x01(\t\x1aT\n\x03RSA\x12!\n\x04size\x18\x01 \x01(\x0e\x32\x13.store.Key.RSA.Size\"*\n\x04Size\x12\n\n\x06S_2048\x10\x00\x12\n\n\x06S_3072\x10\x01\x12\n\n\x06S_4096\x10\x02\x1a\x43\n\x07\x45\x44\x32\x35\x35\x31\x39\x12%\n\x04size\x18\x01 \x01(\x0e\x32\x17.store.Key.ED25519.Size\"\x11\n\x04Size\x12\t\n\x05S_256\x10\x00\x42\x06\n\x04type2\xde\x06\n\rTemporalStore\x12M\n\x06Upload\x12\x10.store.UploadReq\x1a\r.store.Object\" \x82\xd3\xe4\x93\x02\x1a\"\x18/v3/store/objects/upload(\x01\x12T\n\nUploadBlob\x12\x10.store.UploadReq\x1a\r.store.Object\"%\x82\xd3\xe4\x93\x02\x1f\"\x1d/v3/store/objects/upload/blob\x12Q\n\x08\x44ownload\x12\x12.store.DownloadReq\x1a\x0b.store.Blob\"\"\x82\xd3\xe4\x93\x02\x1c\"\x1a/v3/store/objects/download0\x01\x12X\n\x0c\x44ownloadBlob\x12\x12.store.DownloadReq\x1a\x0b.store.Blob\"\'\x82\xd3\xe4\x93\x02!\"\x1f/v3/store/objects/download/blob\x12\x41\n\x03Pin\x12\r.store.Object\x1a\x0c.store.Empty\"\x1d\x82\xd3\xe4\x93\x02\x17\"\x15/v3/store/objects/pin\x12I\n\x04Stat\x12\r.store.Object\x1a\x12.store.ObjectStats\"\x1e\x82\xd3\xe4\x93\x02\x18\x12\x16/v3/store/objects/stat\x12W\n\x0bListObjects\x12\x15.store.ListObjectsReq\x1a\x11.store.ObjectList\"\x1e\x82\xd3\xe4\x93\x02\x18\"\x16/v3/store/objects/list\x12G\n\x07Publish\x12\x0c.store.Event\x1a\x0c.store.Empty\" \x82\xd3\xe4\x93\x02\x1a\"\x18/v3/store/pubsub/publish\x12M\n\tSubscribe\x12\x0c.store.Topic\x1a\x0c.store.Event\"\"\x82\xd3\xe4\x93\x02\x1c\x12\x1a/v3/store/pubsub/subscribe0\x01\x12<\n\x04Keys\x12\x0c.store.Empty\x1a\x0e.store.KeyList\"\x16\x82\xd3\xe4\x93\x02\x10\x12\x0e/v3/store/keys\x12>\n\x06NewKey\x12\n.store.Key\x1a\x0c.store.Empty\"\x1a\x82\xd3\xe4\x93\x02\x14\"\x12/v3/store/keys/newB\x16\n\x14\x63loud.temporal.storeb\x06proto3')
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_KEY_RSA_SIZE = _descriptor.EnumDescriptor(
  name='Size',
  full_name='store.Key.RSA.Size',
  filename=None,
  file=DESCRIPTOR,
  values=[
    _descriptor.EnumValueDescriptor(
      name='S_2048', index=0, number=0,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='S_3072', index=1, number=1,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='S_4096', index=2, number=2,
      serialized_options=None,
      type=None),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=1232,
  serialized_end=1274,
)
_sym_db.RegisterEnumDescriptor(_KEY_RSA_SIZE)

_KEY_ED25519_SIZE = _descriptor.EnumDescriptor(
  name='Size',
  full_name='store.Key.ED25519.Size',
  filename=None,
  file=DESCRIPTOR,
  values=[
    _descriptor.EnumValueDescriptor(
      name='S_256', index=0, number=0,
      serialized_options=None,
      type=None),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=1326,
  serialized_end=1343,
)
_sym_db.RegisterEnumDescriptor(_KEY_ED25519_SIZE)


_EMPTY = _descriptor.Descriptor(
  name='Empty',
  full_name='store.Empty',
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
  serialized_start=52,
  serialized_end=59,
)


_UPLOADREQ = _descriptor.Descriptor(
  name='UploadReq',
  full_name='store.UploadReq',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='blob', full_name='store.UploadReq.blob', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='options', full_name='store.UploadReq.options', index=1,
      number=2, type=11, cpp_type=10, label=1,
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
  serialized_start=61,
  serialized_end=138,
)


_DOWNLOADREQ = _descriptor.Descriptor(
  name='DownloadReq',
  full_name='store.DownloadReq',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='object', full_name='store.DownloadReq.object', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='options', full_name='store.DownloadReq.options', index=1,
      number=2, type=11, cpp_type=10, label=1,
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
  serialized_start=140,
  serialized_end=223,
)


_LISTOBJECTSREQ = _descriptor.Descriptor(
  name='ListObjectsReq',
  full_name='store.ListObjectsReq',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='networks', full_name='store.ListObjectsReq.networks', index=0,
      number=1, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='hashes', full_name='store.ListObjectsReq.hashes', index=1,
      number=2, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='encrypted_only', full_name='store.ListObjectsReq.encrypted_only', index=2,
      number=3, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
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
  serialized_start=225,
  serialized_end=299,
)


_OBJECTOPTIONS = _descriptor.Descriptor(
  name='ObjectOptions',
  full_name='store.ObjectOptions',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='hold_time', full_name='store.ObjectOptions.hold_time', index=0,
      number=1, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='passphrase', full_name='store.ObjectOptions.passphrase', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='network', full_name='store.ObjectOptions.network', index=2,
      number=3, type=9, cpp_type=9, label=1,
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
  serialized_start=301,
  serialized_end=372,
)


_KEYLIST = _descriptor.Descriptor(
  name='KeyList',
  full_name='store.KeyList',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='keys', full_name='store.KeyList.keys', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
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
  serialized_start=374,
  serialized_end=409,
)


_OBJECTLIST = _descriptor.Descriptor(
  name='ObjectList',
  full_name='store.ObjectList',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='objects', full_name='store.ObjectList.objects', index=0,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
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
  serialized_start=411,
  serialized_end=459,
)


_BLOB = _descriptor.Descriptor(
  name='Blob',
  full_name='store.Blob',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='content', full_name='store.Blob.content', index=0,
      number=1, type=12, cpp_type=9, label=1,
      has_default_value=False, default_value=_b(""),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='hold_time', full_name='store.Blob.hold_time', index=1,
      number=2, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
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
  serialized_start=461,
  serialized_end=503,
)


_OBJECT = _descriptor.Descriptor(
  name='Object',
  full_name='store.Object',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='hash', full_name='store.Object.hash', index=0,
      number=1, type=9, cpp_type=9, label=1,
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
  serialized_start=505,
  serialized_end=527,
)


_OBJECTSTATS = _descriptor.Descriptor(
  name='ObjectStats',
  full_name='store.ObjectStats',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='block_size', full_name='store.ObjectStats.block_size', index=0,
      number=1, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='cumulative_size', full_name='store.ObjectStats.cumulative_size', index=1,
      number=2, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='data_size', full_name='store.ObjectStats.data_size', index=2,
      number=3, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='links_size', full_name='store.ObjectStats.links_size', index=3,
      number=4, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='link_count', full_name='store.ObjectStats.link_count', index=4,
      number=5, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
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
  serialized_start=529,
  serialized_end=646,
)


_OBJECTINFO_DETAILS = _descriptor.Descriptor(
  name='Details',
  full_name='store.ObjectInfo.Details',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='created_at', full_name='store.ObjectInfo.Details.created_at', index=0,
      number=1, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='deleted_at', full_name='store.ObjectInfo.Details.deleted_at', index=1,
      number=2, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='updated_at', full_name='store.ObjectInfo.Details.updated_at', index=2,
      number=3, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='encrypted', full_name='store.ObjectInfo.Details.encrypted', index=3,
      number=4, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='hold_time', full_name='store.ObjectInfo.Details.hold_time', index=4,
      number=5, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='type', full_name='store.ObjectInfo.Details.type', index=5,
      number=6, type=9, cpp_type=9, label=1,
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
  serialized_start=819,
  serialized_end=940,
)

_OBJECTINFO_PERMISSIONS = _descriptor.Descriptor(
  name='Permissions',
  full_name='store.ObjectInfo.Permissions',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='uploader', full_name='store.ObjectInfo.Permissions.uploader', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='users', full_name='store.ObjectInfo.Permissions.users', index=1,
      number=2, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
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
  serialized_start=942,
  serialized_end=988,
)

_OBJECTINFO = _descriptor.Descriptor(
  name='ObjectInfo',
  full_name='store.ObjectInfo',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='object', full_name='store.ObjectInfo.object', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='stats', full_name='store.ObjectInfo.stats', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='details', full_name='store.ObjectInfo.details', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='perms', full_name='store.ObjectInfo.perms', index=3,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[_OBJECTINFO_DETAILS, _OBJECTINFO_PERMISSIONS, ],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=649,
  serialized_end=988,
)


_EVENT = _descriptor.Descriptor(
  name='Event',
  full_name='store.Event',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='topic', full_name='store.Event.topic', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='message', full_name='store.Event.message', index=1,
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
  serialized_start=990,
  serialized_end=1043,
)


_TOPIC = _descriptor.Descriptor(
  name='Topic',
  full_name='store.Topic',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='topic', full_name='store.Topic.topic', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='network', full_name='store.Topic.network', index=1,
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
  serialized_start=1045,
  serialized_end=1084,
)


_KEY_RSA = _descriptor.Descriptor(
  name='RSA',
  full_name='store.Key.RSA',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='size', full_name='store.Key.RSA.size', index=0,
      number=1, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
    _KEY_RSA_SIZE,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1190,
  serialized_end=1274,
)

_KEY_ED25519 = _descriptor.Descriptor(
  name='ED25519',
  full_name='store.Key.ED25519',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='size', full_name='store.Key.ED25519.size', index=0,
      number=1, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
    _KEY_ED25519_SIZE,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1276,
  serialized_end=1343,
)

_KEY = _descriptor.Descriptor(
  name='Key',
  full_name='store.Key',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='rsa', full_name='store.Key.rsa', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='ed25519', full_name='store.Key.ed25519', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='name', full_name='store.Key.name', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='id', full_name='store.Key.id', index=3,
      number=4, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[_KEY_RSA, _KEY_ED25519, ],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='type', full_name='store.Key.type',
      index=0, containing_type=None, fields=[]),
  ],
  serialized_start=1087,
  serialized_end=1351,
)

_UPLOADREQ.fields_by_name['blob'].message_type = _BLOB
_UPLOADREQ.fields_by_name['options'].message_type = _OBJECTOPTIONS
_DOWNLOADREQ.fields_by_name['object'].message_type = _OBJECT
_DOWNLOADREQ.fields_by_name['options'].message_type = _OBJECTOPTIONS
_KEYLIST.fields_by_name['keys'].message_type = _KEY
_OBJECTLIST.fields_by_name['objects'].message_type = _OBJECTINFO
_OBJECTINFO_DETAILS.containing_type = _OBJECTINFO
_OBJECTINFO_PERMISSIONS.containing_type = _OBJECTINFO
_OBJECTINFO.fields_by_name['object'].message_type = _OBJECT
_OBJECTINFO.fields_by_name['stats'].message_type = _OBJECTSTATS
_OBJECTINFO.fields_by_name['details'].message_type = _OBJECTINFO_DETAILS
_OBJECTINFO.fields_by_name['perms'].message_type = _OBJECTINFO_PERMISSIONS
_EVENT.fields_by_name['topic'].message_type = _TOPIC
_KEY_RSA.fields_by_name['size'].enum_type = _KEY_RSA_SIZE
_KEY_RSA.containing_type = _KEY
_KEY_RSA_SIZE.containing_type = _KEY_RSA
_KEY_ED25519.fields_by_name['size'].enum_type = _KEY_ED25519_SIZE
_KEY_ED25519.containing_type = _KEY
_KEY_ED25519_SIZE.containing_type = _KEY_ED25519
_KEY.fields_by_name['rsa'].message_type = _KEY_RSA
_KEY.fields_by_name['ed25519'].message_type = _KEY_ED25519
_KEY.oneofs_by_name['type'].fields.append(
  _KEY.fields_by_name['rsa'])
_KEY.fields_by_name['rsa'].containing_oneof = _KEY.oneofs_by_name['type']
_KEY.oneofs_by_name['type'].fields.append(
  _KEY.fields_by_name['ed25519'])
_KEY.fields_by_name['ed25519'].containing_oneof = _KEY.oneofs_by_name['type']
DESCRIPTOR.message_types_by_name['Empty'] = _EMPTY
DESCRIPTOR.message_types_by_name['UploadReq'] = _UPLOADREQ
DESCRIPTOR.message_types_by_name['DownloadReq'] = _DOWNLOADREQ
DESCRIPTOR.message_types_by_name['ListObjectsReq'] = _LISTOBJECTSREQ
DESCRIPTOR.message_types_by_name['ObjectOptions'] = _OBJECTOPTIONS
DESCRIPTOR.message_types_by_name['KeyList'] = _KEYLIST
DESCRIPTOR.message_types_by_name['ObjectList'] = _OBJECTLIST
DESCRIPTOR.message_types_by_name['Blob'] = _BLOB
DESCRIPTOR.message_types_by_name['Object'] = _OBJECT
DESCRIPTOR.message_types_by_name['ObjectStats'] = _OBJECTSTATS
DESCRIPTOR.message_types_by_name['ObjectInfo'] = _OBJECTINFO
DESCRIPTOR.message_types_by_name['Event'] = _EVENT
DESCRIPTOR.message_types_by_name['Topic'] = _TOPIC
DESCRIPTOR.message_types_by_name['Key'] = _KEY
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Empty = _reflection.GeneratedProtocolMessageType('Empty', (_message.Message,), dict(
  DESCRIPTOR = _EMPTY,
  __module__ = 'store_pb2'
  # @@protoc_insertion_point(class_scope:store.Empty)
  ))
_sym_db.RegisterMessage(Empty)

UploadReq = _reflection.GeneratedProtocolMessageType('UploadReq', (_message.Message,), dict(
  DESCRIPTOR = _UPLOADREQ,
  __module__ = 'store_pb2'
  # @@protoc_insertion_point(class_scope:store.UploadReq)
  ))
_sym_db.RegisterMessage(UploadReq)

DownloadReq = _reflection.GeneratedProtocolMessageType('DownloadReq', (_message.Message,), dict(
  DESCRIPTOR = _DOWNLOADREQ,
  __module__ = 'store_pb2'
  # @@protoc_insertion_point(class_scope:store.DownloadReq)
  ))
_sym_db.RegisterMessage(DownloadReq)

ListObjectsReq = _reflection.GeneratedProtocolMessageType('ListObjectsReq', (_message.Message,), dict(
  DESCRIPTOR = _LISTOBJECTSREQ,
  __module__ = 'store_pb2'
  # @@protoc_insertion_point(class_scope:store.ListObjectsReq)
  ))
_sym_db.RegisterMessage(ListObjectsReq)

ObjectOptions = _reflection.GeneratedProtocolMessageType('ObjectOptions', (_message.Message,), dict(
  DESCRIPTOR = _OBJECTOPTIONS,
  __module__ = 'store_pb2'
  # @@protoc_insertion_point(class_scope:store.ObjectOptions)
  ))
_sym_db.RegisterMessage(ObjectOptions)

KeyList = _reflection.GeneratedProtocolMessageType('KeyList', (_message.Message,), dict(
  DESCRIPTOR = _KEYLIST,
  __module__ = 'store_pb2'
  # @@protoc_insertion_point(class_scope:store.KeyList)
  ))
_sym_db.RegisterMessage(KeyList)

ObjectList = _reflection.GeneratedProtocolMessageType('ObjectList', (_message.Message,), dict(
  DESCRIPTOR = _OBJECTLIST,
  __module__ = 'store_pb2'
  # @@protoc_insertion_point(class_scope:store.ObjectList)
  ))
_sym_db.RegisterMessage(ObjectList)

Blob = _reflection.GeneratedProtocolMessageType('Blob', (_message.Message,), dict(
  DESCRIPTOR = _BLOB,
  __module__ = 'store_pb2'
  # @@protoc_insertion_point(class_scope:store.Blob)
  ))
_sym_db.RegisterMessage(Blob)

Object = _reflection.GeneratedProtocolMessageType('Object', (_message.Message,), dict(
  DESCRIPTOR = _OBJECT,
  __module__ = 'store_pb2'
  # @@protoc_insertion_point(class_scope:store.Object)
  ))
_sym_db.RegisterMessage(Object)

ObjectStats = _reflection.GeneratedProtocolMessageType('ObjectStats', (_message.Message,), dict(
  DESCRIPTOR = _OBJECTSTATS,
  __module__ = 'store_pb2'
  # @@protoc_insertion_point(class_scope:store.ObjectStats)
  ))
_sym_db.RegisterMessage(ObjectStats)

ObjectInfo = _reflection.GeneratedProtocolMessageType('ObjectInfo', (_message.Message,), dict(

  Details = _reflection.GeneratedProtocolMessageType('Details', (_message.Message,), dict(
    DESCRIPTOR = _OBJECTINFO_DETAILS,
    __module__ = 'store_pb2'
    # @@protoc_insertion_point(class_scope:store.ObjectInfo.Details)
    ))
  ,

  Permissions = _reflection.GeneratedProtocolMessageType('Permissions', (_message.Message,), dict(
    DESCRIPTOR = _OBJECTINFO_PERMISSIONS,
    __module__ = 'store_pb2'
    # @@protoc_insertion_point(class_scope:store.ObjectInfo.Permissions)
    ))
  ,
  DESCRIPTOR = _OBJECTINFO,
  __module__ = 'store_pb2'
  # @@protoc_insertion_point(class_scope:store.ObjectInfo)
  ))
_sym_db.RegisterMessage(ObjectInfo)
_sym_db.RegisterMessage(ObjectInfo.Details)
_sym_db.RegisterMessage(ObjectInfo.Permissions)

Event = _reflection.GeneratedProtocolMessageType('Event', (_message.Message,), dict(
  DESCRIPTOR = _EVENT,
  __module__ = 'store_pb2'
  # @@protoc_insertion_point(class_scope:store.Event)
  ))
_sym_db.RegisterMessage(Event)

Topic = _reflection.GeneratedProtocolMessageType('Topic', (_message.Message,), dict(
  DESCRIPTOR = _TOPIC,
  __module__ = 'store_pb2'
  # @@protoc_insertion_point(class_scope:store.Topic)
  ))
_sym_db.RegisterMessage(Topic)

Key = _reflection.GeneratedProtocolMessageType('Key', (_message.Message,), dict(

  RSA = _reflection.GeneratedProtocolMessageType('RSA', (_message.Message,), dict(
    DESCRIPTOR = _KEY_RSA,
    __module__ = 'store_pb2'
    # @@protoc_insertion_point(class_scope:store.Key.RSA)
    ))
  ,

  ED25519 = _reflection.GeneratedProtocolMessageType('ED25519', (_message.Message,), dict(
    DESCRIPTOR = _KEY_ED25519,
    __module__ = 'store_pb2'
    # @@protoc_insertion_point(class_scope:store.Key.ED25519)
    ))
  ,
  DESCRIPTOR = _KEY,
  __module__ = 'store_pb2'
  # @@protoc_insertion_point(class_scope:store.Key)
  ))
_sym_db.RegisterMessage(Key)
_sym_db.RegisterMessage(Key.RSA)
_sym_db.RegisterMessage(Key.ED25519)


DESCRIPTOR._options = None

_TEMPORALSTORE = _descriptor.ServiceDescriptor(
  name='TemporalStore',
  full_name='store.TemporalStore',
  file=DESCRIPTOR,
  index=0,
  serialized_options=None,
  serialized_start=1354,
  serialized_end=2216,
  methods=[
  _descriptor.MethodDescriptor(
    name='Upload',
    full_name='store.TemporalStore.Upload',
    index=0,
    containing_service=None,
    input_type=_UPLOADREQ,
    output_type=_OBJECT,
    serialized_options=_b('\202\323\344\223\002\032\"\030/v3/store/objects/upload'),
  ),
  _descriptor.MethodDescriptor(
    name='UploadBlob',
    full_name='store.TemporalStore.UploadBlob',
    index=1,
    containing_service=None,
    input_type=_UPLOADREQ,
    output_type=_OBJECT,
    serialized_options=_b('\202\323\344\223\002\037\"\035/v3/store/objects/upload/blob'),
  ),
  _descriptor.MethodDescriptor(
    name='Download',
    full_name='store.TemporalStore.Download',
    index=2,
    containing_service=None,
    input_type=_DOWNLOADREQ,
    output_type=_BLOB,
    serialized_options=_b('\202\323\344\223\002\034\"\032/v3/store/objects/download'),
  ),
  _descriptor.MethodDescriptor(
    name='DownloadBlob',
    full_name='store.TemporalStore.DownloadBlob',
    index=3,
    containing_service=None,
    input_type=_DOWNLOADREQ,
    output_type=_BLOB,
    serialized_options=_b('\202\323\344\223\002!\"\037/v3/store/objects/download/blob'),
  ),
  _descriptor.MethodDescriptor(
    name='Pin',
    full_name='store.TemporalStore.Pin',
    index=4,
    containing_service=None,
    input_type=_OBJECT,
    output_type=_EMPTY,
    serialized_options=_b('\202\323\344\223\002\027\"\025/v3/store/objects/pin'),
  ),
  _descriptor.MethodDescriptor(
    name='Stat',
    full_name='store.TemporalStore.Stat',
    index=5,
    containing_service=None,
    input_type=_OBJECT,
    output_type=_OBJECTSTATS,
    serialized_options=_b('\202\323\344\223\002\030\022\026/v3/store/objects/stat'),
  ),
  _descriptor.MethodDescriptor(
    name='ListObjects',
    full_name='store.TemporalStore.ListObjects',
    index=6,
    containing_service=None,
    input_type=_LISTOBJECTSREQ,
    output_type=_OBJECTLIST,
    serialized_options=_b('\202\323\344\223\002\030\"\026/v3/store/objects/list'),
  ),
  _descriptor.MethodDescriptor(
    name='Publish',
    full_name='store.TemporalStore.Publish',
    index=7,
    containing_service=None,
    input_type=_EVENT,
    output_type=_EMPTY,
    serialized_options=_b('\202\323\344\223\002\032\"\030/v3/store/pubsub/publish'),
  ),
  _descriptor.MethodDescriptor(
    name='Subscribe',
    full_name='store.TemporalStore.Subscribe',
    index=8,
    containing_service=None,
    input_type=_TOPIC,
    output_type=_EVENT,
    serialized_options=_b('\202\323\344\223\002\034\022\032/v3/store/pubsub/subscribe'),
  ),
  _descriptor.MethodDescriptor(
    name='Keys',
    full_name='store.TemporalStore.Keys',
    index=9,
    containing_service=None,
    input_type=_EMPTY,
    output_type=_KEYLIST,
    serialized_options=_b('\202\323\344\223\002\020\022\016/v3/store/keys'),
  ),
  _descriptor.MethodDescriptor(
    name='NewKey',
    full_name='store.TemporalStore.NewKey',
    index=10,
    containing_service=None,
    input_type=_KEY,
    output_type=_EMPTY,
    serialized_options=_b('\202\323\344\223\002\024\"\022/v3/store/keys/new'),
  ),
])
_sym_db.RegisterServiceDescriptor(_TEMPORALSTORE)

DESCRIPTOR.services_by_name['TemporalStore'] = _TEMPORALSTORE

# @@protoc_insertion_point(module_scope)
