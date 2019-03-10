// Code generated by protoc-gen-go. DO NOT EDIT.
// source: proto/auth.proto

package auth // import "github.com/RTradeLtd/sdk/go/temporal/auth"

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

type Tier int32

const (
	Tier_FREE    Tier = 0
	Tier_LIGHT   Tier = 1
	Tier_PARTNER Tier = 9
)

var Tier_name = map[int32]string{
	0: "FREE",
	1: "LIGHT",
	9: "PARTNER",
}
var Tier_value = map[string]int32{
	"FREE":    0,
	"LIGHT":   1,
	"PARTNER": 9,
}

func (x Tier) String() string {
	return proto.EnumName(Tier_name, int32(x))
}
func (Tier) EnumDescriptor() ([]byte, []int) {
	return fileDescriptor_auth_ba84088ce96b94a8, []int{0}
}

type RecoverReq_Type int32

const (
	RecoverReq_USERNAME RecoverReq_Type = 0
	RecoverReq_PASSWORD RecoverReq_Type = 1
)

var RecoverReq_Type_name = map[int32]string{
	0: "USERNAME",
	1: "PASSWORD",
}
var RecoverReq_Type_value = map[string]int32{
	"USERNAME": 0,
	"PASSWORD": 1,
}

func (x RecoverReq_Type) String() string {
	return proto.EnumName(RecoverReq_Type_name, int32(x))
}
func (RecoverReq_Type) EnumDescriptor() ([]byte, []int) {
	return fileDescriptor_auth_ba84088ce96b94a8, []int{2, 0}
}

type Empty struct {
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *Empty) Reset()         { *m = Empty{} }
func (m *Empty) String() string { return proto.CompactTextString(m) }
func (*Empty) ProtoMessage()    {}
func (*Empty) Descriptor() ([]byte, []int) {
	return fileDescriptor_auth_ba84088ce96b94a8, []int{0}
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

type RegisterReq struct {
	Credentials          *Credentials `protobuf:"bytes,1,opt,name=credentials,proto3" json:"credentials,omitempty"`
	EmailAddress         string       `protobuf:"bytes,2,opt,name=email_address,json=emailAddress,proto3" json:"email_address,omitempty"`
	XXX_NoUnkeyedLiteral struct{}     `json:"-"`
	XXX_unrecognized     []byte       `json:"-"`
	XXX_sizecache        int32        `json:"-"`
}

func (m *RegisterReq) Reset()         { *m = RegisterReq{} }
func (m *RegisterReq) String() string { return proto.CompactTextString(m) }
func (*RegisterReq) ProtoMessage()    {}
func (*RegisterReq) Descriptor() ([]byte, []int) {
	return fileDescriptor_auth_ba84088ce96b94a8, []int{1}
}
func (m *RegisterReq) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_RegisterReq.Unmarshal(m, b)
}
func (m *RegisterReq) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_RegisterReq.Marshal(b, m, deterministic)
}
func (dst *RegisterReq) XXX_Merge(src proto.Message) {
	xxx_messageInfo_RegisterReq.Merge(dst, src)
}
func (m *RegisterReq) XXX_Size() int {
	return xxx_messageInfo_RegisterReq.Size(m)
}
func (m *RegisterReq) XXX_DiscardUnknown() {
	xxx_messageInfo_RegisterReq.DiscardUnknown(m)
}

var xxx_messageInfo_RegisterReq proto.InternalMessageInfo

func (m *RegisterReq) GetCredentials() *Credentials {
	if m != nil {
		return m.Credentials
	}
	return nil
}

func (m *RegisterReq) GetEmailAddress() string {
	if m != nil {
		return m.EmailAddress
	}
	return ""
}

type RecoverReq struct {
	Type                 RecoverReq_Type `protobuf:"varint,1,opt,name=type,proto3,enum=auth.RecoverReq_Type" json:"type,omitempty"`
	EmailAddress         string          `protobuf:"bytes,2,opt,name=email_address,json=emailAddress,proto3" json:"email_address,omitempty"`
	XXX_NoUnkeyedLiteral struct{}        `json:"-"`
	XXX_unrecognized     []byte          `json:"-"`
	XXX_sizecache        int32           `json:"-"`
}

func (m *RecoverReq) Reset()         { *m = RecoverReq{} }
func (m *RecoverReq) String() string { return proto.CompactTextString(m) }
func (*RecoverReq) ProtoMessage()    {}
func (*RecoverReq) Descriptor() ([]byte, []int) {
	return fileDescriptor_auth_ba84088ce96b94a8, []int{2}
}
func (m *RecoverReq) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_RecoverReq.Unmarshal(m, b)
}
func (m *RecoverReq) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_RecoverReq.Marshal(b, m, deterministic)
}
func (dst *RecoverReq) XXX_Merge(src proto.Message) {
	xxx_messageInfo_RecoverReq.Merge(dst, src)
}
func (m *RecoverReq) XXX_Size() int {
	return xxx_messageInfo_RecoverReq.Size(m)
}
func (m *RecoverReq) XXX_DiscardUnknown() {
	xxx_messageInfo_RecoverReq.DiscardUnknown(m)
}

var xxx_messageInfo_RecoverReq proto.InternalMessageInfo

func (m *RecoverReq) GetType() RecoverReq_Type {
	if m != nil {
		return m.Type
	}
	return RecoverReq_USERNAME
}

func (m *RecoverReq) GetEmailAddress() string {
	if m != nil {
		return m.EmailAddress
	}
	return ""
}

type UpdateReq struct {
	// Types that are valid to be assigned to Update:
	//	*UpdateReq_PasswordChange
	//	*UpdateReq_TierChange
	Update               isUpdateReq_Update `protobuf_oneof:"update"`
	XXX_NoUnkeyedLiteral struct{}           `json:"-"`
	XXX_unrecognized     []byte             `json:"-"`
	XXX_sizecache        int32              `json:"-"`
}

func (m *UpdateReq) Reset()         { *m = UpdateReq{} }
func (m *UpdateReq) String() string { return proto.CompactTextString(m) }
func (*UpdateReq) ProtoMessage()    {}
func (*UpdateReq) Descriptor() ([]byte, []int) {
	return fileDescriptor_auth_ba84088ce96b94a8, []int{3}
}
func (m *UpdateReq) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_UpdateReq.Unmarshal(m, b)
}
func (m *UpdateReq) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_UpdateReq.Marshal(b, m, deterministic)
}
func (dst *UpdateReq) XXX_Merge(src proto.Message) {
	xxx_messageInfo_UpdateReq.Merge(dst, src)
}
func (m *UpdateReq) XXX_Size() int {
	return xxx_messageInfo_UpdateReq.Size(m)
}
func (m *UpdateReq) XXX_DiscardUnknown() {
	xxx_messageInfo_UpdateReq.DiscardUnknown(m)
}

var xxx_messageInfo_UpdateReq proto.InternalMessageInfo

type isUpdateReq_Update interface {
	isUpdateReq_Update()
}

type UpdateReq_PasswordChange struct {
	PasswordChange *UpdateReq_Password `protobuf:"bytes,1,opt,name=password_change,json=passwordChange,proto3,oneof"`
}

type UpdateReq_TierChange struct {
	TierChange *UpdateReq_Tier `protobuf:"bytes,2,opt,name=tier_change,json=tierChange,proto3,oneof"`
}

func (*UpdateReq_PasswordChange) isUpdateReq_Update() {}

func (*UpdateReq_TierChange) isUpdateReq_Update() {}

func (m *UpdateReq) GetUpdate() isUpdateReq_Update {
	if m != nil {
		return m.Update
	}
	return nil
}

func (m *UpdateReq) GetPasswordChange() *UpdateReq_Password {
	if x, ok := m.GetUpdate().(*UpdateReq_PasswordChange); ok {
		return x.PasswordChange
	}
	return nil
}

func (m *UpdateReq) GetTierChange() *UpdateReq_Tier {
	if x, ok := m.GetUpdate().(*UpdateReq_TierChange); ok {
		return x.TierChange
	}
	return nil
}

// XXX_OneofFuncs is for the internal use of the proto package.
func (*UpdateReq) XXX_OneofFuncs() (func(msg proto.Message, b *proto.Buffer) error, func(msg proto.Message, tag, wire int, b *proto.Buffer) (bool, error), func(msg proto.Message) (n int), []interface{}) {
	return _UpdateReq_OneofMarshaler, _UpdateReq_OneofUnmarshaler, _UpdateReq_OneofSizer, []interface{}{
		(*UpdateReq_PasswordChange)(nil),
		(*UpdateReq_TierChange)(nil),
	}
}

func _UpdateReq_OneofMarshaler(msg proto.Message, b *proto.Buffer) error {
	m := msg.(*UpdateReq)
	// update
	switch x := m.Update.(type) {
	case *UpdateReq_PasswordChange:
		b.EncodeVarint(1<<3 | proto.WireBytes)
		if err := b.EncodeMessage(x.PasswordChange); err != nil {
			return err
		}
	case *UpdateReq_TierChange:
		b.EncodeVarint(2<<3 | proto.WireBytes)
		if err := b.EncodeMessage(x.TierChange); err != nil {
			return err
		}
	case nil:
	default:
		return fmt.Errorf("UpdateReq.Update has unexpected type %T", x)
	}
	return nil
}

func _UpdateReq_OneofUnmarshaler(msg proto.Message, tag, wire int, b *proto.Buffer) (bool, error) {
	m := msg.(*UpdateReq)
	switch tag {
	case 1: // update.password_change
		if wire != proto.WireBytes {
			return true, proto.ErrInternalBadWireType
		}
		msg := new(UpdateReq_Password)
		err := b.DecodeMessage(msg)
		m.Update = &UpdateReq_PasswordChange{msg}
		return true, err
	case 2: // update.tier_change
		if wire != proto.WireBytes {
			return true, proto.ErrInternalBadWireType
		}
		msg := new(UpdateReq_Tier)
		err := b.DecodeMessage(msg)
		m.Update = &UpdateReq_TierChange{msg}
		return true, err
	default:
		return false, nil
	}
}

func _UpdateReq_OneofSizer(msg proto.Message) (n int) {
	m := msg.(*UpdateReq)
	// update
	switch x := m.Update.(type) {
	case *UpdateReq_PasswordChange:
		s := proto.Size(x.PasswordChange)
		n += 1 // tag and wire
		n += proto.SizeVarint(uint64(s))
		n += s
	case *UpdateReq_TierChange:
		s := proto.Size(x.TierChange)
		n += 1 // tag and wire
		n += proto.SizeVarint(uint64(s))
		n += s
	case nil:
	default:
		panic(fmt.Sprintf("proto: unexpected type %T in oneof", x))
	}
	return n
}

type UpdateReq_Password struct {
	OldPassword          string   `protobuf:"bytes,1,opt,name=old_password,json=oldPassword,proto3" json:"old_password,omitempty"`
	NewPassword          string   `protobuf:"bytes,2,opt,name=new_password,json=newPassword,proto3" json:"new_password,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *UpdateReq_Password) Reset()         { *m = UpdateReq_Password{} }
func (m *UpdateReq_Password) String() string { return proto.CompactTextString(m) }
func (*UpdateReq_Password) ProtoMessage()    {}
func (*UpdateReq_Password) Descriptor() ([]byte, []int) {
	return fileDescriptor_auth_ba84088ce96b94a8, []int{3, 0}
}
func (m *UpdateReq_Password) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_UpdateReq_Password.Unmarshal(m, b)
}
func (m *UpdateReq_Password) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_UpdateReq_Password.Marshal(b, m, deterministic)
}
func (dst *UpdateReq_Password) XXX_Merge(src proto.Message) {
	xxx_messageInfo_UpdateReq_Password.Merge(dst, src)
}
func (m *UpdateReq_Password) XXX_Size() int {
	return xxx_messageInfo_UpdateReq_Password.Size(m)
}
func (m *UpdateReq_Password) XXX_DiscardUnknown() {
	xxx_messageInfo_UpdateReq_Password.DiscardUnknown(m)
}

var xxx_messageInfo_UpdateReq_Password proto.InternalMessageInfo

func (m *UpdateReq_Password) GetOldPassword() string {
	if m != nil {
		return m.OldPassword
	}
	return ""
}

func (m *UpdateReq_Password) GetNewPassword() string {
	if m != nil {
		return m.NewPassword
	}
	return ""
}

type UpdateReq_Tier struct {
	NewTier              *UpdateReq_Tier `protobuf:"bytes,1,opt,name=new_tier,json=newTier,proto3" json:"new_tier,omitempty"`
	XXX_NoUnkeyedLiteral struct{}        `json:"-"`
	XXX_unrecognized     []byte          `json:"-"`
	XXX_sizecache        int32           `json:"-"`
}

func (m *UpdateReq_Tier) Reset()         { *m = UpdateReq_Tier{} }
func (m *UpdateReq_Tier) String() string { return proto.CompactTextString(m) }
func (*UpdateReq_Tier) ProtoMessage()    {}
func (*UpdateReq_Tier) Descriptor() ([]byte, []int) {
	return fileDescriptor_auth_ba84088ce96b94a8, []int{3, 1}
}
func (m *UpdateReq_Tier) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_UpdateReq_Tier.Unmarshal(m, b)
}
func (m *UpdateReq_Tier) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_UpdateReq_Tier.Marshal(b, m, deterministic)
}
func (dst *UpdateReq_Tier) XXX_Merge(src proto.Message) {
	xxx_messageInfo_UpdateReq_Tier.Merge(dst, src)
}
func (m *UpdateReq_Tier) XXX_Size() int {
	return xxx_messageInfo_UpdateReq_Tier.Size(m)
}
func (m *UpdateReq_Tier) XXX_DiscardUnknown() {
	xxx_messageInfo_UpdateReq_Tier.DiscardUnknown(m)
}

var xxx_messageInfo_UpdateReq_Tier proto.InternalMessageInfo

func (m *UpdateReq_Tier) GetNewTier() *UpdateReq_Tier {
	if m != nil {
		return m.NewTier
	}
	return nil
}

type Credentials struct {
	Username             string   `protobuf:"bytes,1,opt,name=username,proto3" json:"username,omitempty"`
	Password             string   `protobuf:"bytes,2,opt,name=password,proto3" json:"password,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *Credentials) Reset()         { *m = Credentials{} }
func (m *Credentials) String() string { return proto.CompactTextString(m) }
func (*Credentials) ProtoMessage()    {}
func (*Credentials) Descriptor() ([]byte, []int) {
	return fileDescriptor_auth_ba84088ce96b94a8, []int{4}
}
func (m *Credentials) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_Credentials.Unmarshal(m, b)
}
func (m *Credentials) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_Credentials.Marshal(b, m, deterministic)
}
func (dst *Credentials) XXX_Merge(src proto.Message) {
	xxx_messageInfo_Credentials.Merge(dst, src)
}
func (m *Credentials) XXX_Size() int {
	return xxx_messageInfo_Credentials.Size(m)
}
func (m *Credentials) XXX_DiscardUnknown() {
	xxx_messageInfo_Credentials.DiscardUnknown(m)
}

var xxx_messageInfo_Credentials proto.InternalMessageInfo

func (m *Credentials) GetUsername() string {
	if m != nil {
		return m.Username
	}
	return ""
}

func (m *Credentials) GetPassword() string {
	if m != nil {
		return m.Password
	}
	return ""
}

type Token struct {
	Expire               int64    `protobuf:"varint,1,opt,name=expire,proto3" json:"expire,omitempty"`
	Token                string   `protobuf:"bytes,2,opt,name=token,proto3" json:"token,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *Token) Reset()         { *m = Token{} }
func (m *Token) String() string { return proto.CompactTextString(m) }
func (*Token) ProtoMessage()    {}
func (*Token) Descriptor() ([]byte, []int) {
	return fileDescriptor_auth_ba84088ce96b94a8, []int{5}
}
func (m *Token) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_Token.Unmarshal(m, b)
}
func (m *Token) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_Token.Marshal(b, m, deterministic)
}
func (dst *Token) XXX_Merge(src proto.Message) {
	xxx_messageInfo_Token.Merge(dst, src)
}
func (m *Token) XXX_Size() int {
	return xxx_messageInfo_Token.Size(m)
}
func (m *Token) XXX_DiscardUnknown() {
	xxx_messageInfo_Token.DiscardUnknown(m)
}

var xxx_messageInfo_Token proto.InternalMessageInfo

func (m *Token) GetExpire() int64 {
	if m != nil {
		return m.Expire
	}
	return 0
}

func (m *Token) GetToken() string {
	if m != nil {
		return m.Token
	}
	return ""
}

type User struct {
	Id           int32  `protobuf:"varint,1,opt,name=id,proto3" json:"id,omitempty"`
	UserName     string `protobuf:"bytes,2,opt,name=user_name,json=userName,proto3" json:"user_name,omitempty"`
	EmailAddress string `protobuf:"bytes,3,opt,name=email_address,json=emailAddress,proto3" json:"email_address,omitempty"`
	// account properties
	Verified     bool              `protobuf:"varint,4,opt,name=verified,proto3" json:"verified,omitempty"`
	Credits      int32             `protobuf:"varint,5,opt,name=credits,proto3" json:"credits,omitempty"`
	IpfsKeys     map[string]string `protobuf:"bytes,6,rep,name=ipfs_keys,json=ipfsKeys,proto3" json:"ipfs_keys,omitempty" protobuf_key:"bytes,1,opt,name=key,proto3" protobuf_val:"bytes,2,opt,name=value,proto3"`
	IpfsNetworks []string          `protobuf:"bytes,7,rep,name=ipfs_networks,json=ipfsNetworks,proto3" json:"ipfs_networks,omitempty"`
	Tier         Tier              `protobuf:"varint,8,opt,name=tier,proto3,enum=auth.Tier" json:"tier,omitempty"`
	// account access
	ApiAccess            bool     `protobuf:"varint,9,opt,name=api_access,json=apiAccess,proto3" json:"api_access,omitempty"`
	AdminAccess          bool     `protobuf:"varint,10,opt,name=admin_access,json=adminAccess,proto3" json:"admin_access,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *User) Reset()         { *m = User{} }
func (m *User) String() string { return proto.CompactTextString(m) }
func (*User) ProtoMessage()    {}
func (*User) Descriptor() ([]byte, []int) {
	return fileDescriptor_auth_ba84088ce96b94a8, []int{6}
}
func (m *User) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_User.Unmarshal(m, b)
}
func (m *User) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_User.Marshal(b, m, deterministic)
}
func (dst *User) XXX_Merge(src proto.Message) {
	xxx_messageInfo_User.Merge(dst, src)
}
func (m *User) XXX_Size() int {
	return xxx_messageInfo_User.Size(m)
}
func (m *User) XXX_DiscardUnknown() {
	xxx_messageInfo_User.DiscardUnknown(m)
}

var xxx_messageInfo_User proto.InternalMessageInfo

func (m *User) GetId() int32 {
	if m != nil {
		return m.Id
	}
	return 0
}

func (m *User) GetUserName() string {
	if m != nil {
		return m.UserName
	}
	return ""
}

func (m *User) GetEmailAddress() string {
	if m != nil {
		return m.EmailAddress
	}
	return ""
}

func (m *User) GetVerified() bool {
	if m != nil {
		return m.Verified
	}
	return false
}

func (m *User) GetCredits() int32 {
	if m != nil {
		return m.Credits
	}
	return 0
}

func (m *User) GetIpfsKeys() map[string]string {
	if m != nil {
		return m.IpfsKeys
	}
	return nil
}

func (m *User) GetIpfsNetworks() []string {
	if m != nil {
		return m.IpfsNetworks
	}
	return nil
}

func (m *User) GetTier() Tier {
	if m != nil {
		return m.Tier
	}
	return Tier_FREE
}

func (m *User) GetApiAccess() bool {
	if m != nil {
		return m.ApiAccess
	}
	return false
}

func (m *User) GetAdminAccess() bool {
	if m != nil {
		return m.AdminAccess
	}
	return false
}

func init() {
	proto.RegisterType((*Empty)(nil), "auth.Empty")
	proto.RegisterType((*RegisterReq)(nil), "auth.RegisterReq")
	proto.RegisterType((*RecoverReq)(nil), "auth.RecoverReq")
	proto.RegisterType((*UpdateReq)(nil), "auth.UpdateReq")
	proto.RegisterType((*UpdateReq_Password)(nil), "auth.UpdateReq.Password")
	proto.RegisterType((*UpdateReq_Tier)(nil), "auth.UpdateReq.Tier")
	proto.RegisterType((*Credentials)(nil), "auth.Credentials")
	proto.RegisterType((*Token)(nil), "auth.Token")
	proto.RegisterType((*User)(nil), "auth.User")
	proto.RegisterMapType((map[string]string)(nil), "auth.User.IpfsKeysEntry")
	proto.RegisterEnum("auth.Tier", Tier_name, Tier_value)
	proto.RegisterEnum("auth.RecoverReq_Type", RecoverReq_Type_name, RecoverReq_Type_value)
}

// Reference imports to suppress errors if they are not otherwise used.
var _ context.Context
var _ grpc.ClientConn

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
const _ = grpc.SupportPackageIsVersion4

// TemporalAuthClient is the client API for TemporalAuth service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://godoc.org/google.golang.org/grpc#ClientConn.NewStream.
type TemporalAuthClient interface {
	// Register facilitates user creation.
	Register(ctx context.Context, in *RegisterReq, opts ...grpc.CallOption) (*User, error)
	// Recover facilitates account recovery.
	Recover(ctx context.Context, in *RecoverReq, opts ...grpc.CallOption) (*User, error)
	// Login accepts credentials and returns a token for use with further requests.
	Login(ctx context.Context, in *Credentials, opts ...grpc.CallOption) (*Token, error)
	// Account returns the account associated with an authenticated request.
	Account(ctx context.Context, in *Empty, opts ...grpc.CallOption) (*User, error)
	// Update facilitates modification of the account associated with an
	// authenticated request.
	Update(ctx context.Context, in *UpdateReq, opts ...grpc.CallOption) (*User, error)
	// Refresh provides a refreshed token associated with an authenticated request.
	Refresh(ctx context.Context, in *Empty, opts ...grpc.CallOption) (*Token, error)
}

type temporalAuthClient struct {
	cc *grpc.ClientConn
}

func NewTemporalAuthClient(cc *grpc.ClientConn) TemporalAuthClient {
	return &temporalAuthClient{cc}
}

func (c *temporalAuthClient) Register(ctx context.Context, in *RegisterReq, opts ...grpc.CallOption) (*User, error) {
	out := new(User)
	err := c.cc.Invoke(ctx, "/auth.TemporalAuth/Register", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *temporalAuthClient) Recover(ctx context.Context, in *RecoverReq, opts ...grpc.CallOption) (*User, error) {
	out := new(User)
	err := c.cc.Invoke(ctx, "/auth.TemporalAuth/Recover", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *temporalAuthClient) Login(ctx context.Context, in *Credentials, opts ...grpc.CallOption) (*Token, error) {
	out := new(Token)
	err := c.cc.Invoke(ctx, "/auth.TemporalAuth/Login", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *temporalAuthClient) Account(ctx context.Context, in *Empty, opts ...grpc.CallOption) (*User, error) {
	out := new(User)
	err := c.cc.Invoke(ctx, "/auth.TemporalAuth/Account", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *temporalAuthClient) Update(ctx context.Context, in *UpdateReq, opts ...grpc.CallOption) (*User, error) {
	out := new(User)
	err := c.cc.Invoke(ctx, "/auth.TemporalAuth/Update", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *temporalAuthClient) Refresh(ctx context.Context, in *Empty, opts ...grpc.CallOption) (*Token, error) {
	out := new(Token)
	err := c.cc.Invoke(ctx, "/auth.TemporalAuth/Refresh", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

