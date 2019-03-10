// Code generated by protoc-gen-go. DO NOT EDIT.
// source: proto/core.proto

package core // import "github.com/RTradeLtd/sdk/go/temporal/core"

import proto "github.com/golang/protobuf/proto"
import fmt "fmt"
import math "math"
import _ "google.golang.org/genproto/googleapis/api/annotations"

import (
	context "golang.org/x/net/context"
	grpc "google.golang.org/grpc"
)

// Reference imports to suppress errors if they are not otherwise used.
var _ = proto.Marshal
var _ = fmt.Errorf
var _ = math.Inf

// This is a compile-time assertion to ensure that this generated file
// is compatible with the proto package it is being compiled against.
// A compilation error at this line likely means your copy of the
// proto package needs to be updated.
const _ = proto.ProtoPackageIsVersion2 // please upgrade the proto package

type Empty struct {
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *Empty) Reset()         { *m = Empty{} }
func (m *Empty) String() string { return proto.CompactTextString(m) }
func (*Empty) ProtoMessage()    {}
func (*Empty) Descriptor() ([]byte, []int) {
	return fileDescriptor_core_4fd55c2cccef4b91, []int{0}
}
func (m *Empty) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_Empty.Unmarshal(m, b)
}
func (m *Empty) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_Empty.Marshal(b, m, deterministic)
}
func (dst *Empty) XXX_Merge(src proto.Message) {
	xxx_messageInfo_Empty.Merge(dst, src)
}
func (m *Empty) XXX_Size() int {
	return xxx_messageInfo_Empty.Size(m)
}
func (m *Empty) XXX_DiscardUnknown() {
	xxx_messageInfo_Empty.DiscardUnknown(m)
}

var xxx_messageInfo_Empty proto.InternalMessageInfo

type ServiceStatus struct {
	Version              string   `protobuf:"bytes,1,opt,name=version,proto3" json:"version,omitempty"`
	Message              string   `protobuf:"bytes,2,opt,name=message,proto3" json:"message,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *ServiceStatus) Reset()         { *m = ServiceStatus{} }
func (m *ServiceStatus) String() string { return proto.CompactTextString(m) }
func (*ServiceStatus) ProtoMessage()    {}
func (*ServiceStatus) Descriptor() ([]byte, []int) {
	return fileDescriptor_core_4fd55c2cccef4b91, []int{1}
}
func (m *ServiceStatus) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_ServiceStatus.Unmarshal(m, b)
}
func (m *ServiceStatus) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_ServiceStatus.Marshal(b, m, deterministic)
}
func (dst *ServiceStatus) XXX_Merge(src proto.Message) {
	xxx_messageInfo_ServiceStatus.Merge(dst, src)
}
func (m *ServiceStatus) XXX_Size() int {
	return xxx_messageInfo_ServiceStatus.Size(m)
}
func (m *ServiceStatus) XXX_DiscardUnknown() {
	xxx_messageInfo_ServiceStatus.DiscardUnknown(m)
}

var xxx_messageInfo_ServiceStatus proto.InternalMessageInfo

func (m *ServiceStatus) GetVersion() string {
	if m != nil {
		return m.Version
	}
	return ""
}

func (m *ServiceStatus) GetMessage() string {
	if m != nil {
		return m.Message
	}
	return ""
}

type ServiceStatistics struct {
	Metrics              []byte   `protobuf:"bytes,1,opt,name=metrics,proto3" json:"metrics,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *ServiceStatistics) Reset()         { *m = ServiceStatistics{} }
func (m *ServiceStatistics) String() string { return proto.CompactTextString(m) }
func (*ServiceStatistics) ProtoMessage()    {}
func (*ServiceStatistics) Descriptor() ([]byte, []int) {
	return fileDescriptor_core_4fd55c2cccef4b91, []int{2}
}
func (m *ServiceStatistics) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_ServiceStatistics.Unmarshal(m, b)
}
func (m *ServiceStatistics) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_ServiceStatistics.Marshal(b, m, deterministic)
}
func (dst *ServiceStatistics) XXX_Merge(src proto.Message) {
	xxx_messageInfo_ServiceStatistics.Merge(dst, src)
}
func (m *ServiceStatistics) XXX_Size() int {
	return xxx_messageInfo_ServiceStatistics.Size(m)
}
func (m *ServiceStatistics) XXX_DiscardUnknown() {
	xxx_messageInfo_ServiceStatistics.DiscardUnknown(m)
}

var xxx_messageInfo_ServiceStatistics proto.InternalMessageInfo

func (m *ServiceStatistics) GetMetrics() []byte {
	if m != nil {
		return m.Metrics
	}
	return nil
}

func init() {
	proto.RegisterType((*Empty)(nil), "core.Empty")
	proto.RegisterType((*ServiceStatus)(nil), "core.ServiceStatus")
	proto.RegisterType((*ServiceStatistics)(nil), "core.ServiceStatistics")
}

// Reference imports to suppress errors if they are not otherwise used.
var _ context.Context
var _ grpc.ClientConn

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
const _ = grpc.SupportPackageIsVersion4

// TemporalCoreClient is the client API for TemporalCore service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://godoc.org/google.golang.org/grpc#ClientConn.NewStream.
type TemporalCoreClient interface {
	Status(ctx context.Context, in *Empty, opts ...grpc.CallOption) (*ServiceStatus, error)
	Statistics(ctx context.Context, in *Empty, opts ...grpc.CallOption) (*ServiceStatistics, error)
}

type temporalCoreClient struct {
	cc *grpc.ClientConn
}

func NewTemporalCoreClient(cc *grpc.ClientConn) TemporalCoreClient {
	return &temporalCoreClient{cc}
}

func (c *temporalCoreClient) Status(ctx context.Context, in *Empty, opts ...grpc.CallOption) (*ServiceStatus, error) {
	out := new(ServiceStatus)
	err := c.cc.Invoke(ctx, "/core.TemporalCore/Status", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *temporalCoreClient) Statistics(ctx context.Context, in *Empty, opts ...grpc.CallOption) (*ServiceStatistics, error) {
	out := new(ServiceStatistics)
	err := c.cc.Invoke(ctx, "/core.TemporalCore/Statistics", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

