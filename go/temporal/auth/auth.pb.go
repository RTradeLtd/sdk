// Code generated by protoc-gen-go. DO NOT EDIT.
// source: auth.proto

package auth

import (
	context "context"
	fmt "fmt"
	proto "github.com/golang/protobuf/proto"
	_ "google.golang.org/genproto/googleapis/api/annotations"
	grpc "google.golang.org/grpc"
	math "math"
)

// Reference imports to suppress errors if they are not otherwise used.
var _ = proto.Marshal
var _ = fmt.Errorf
var _ = math.Inf

// This is a compile-time assertion to ensure that this generated file
// is compatible with the proto package it is being compiled against.
// A compilation error at this line likely means your copy of the
// proto package needs to be updated.
const _ = proto.ProtoPackageIsVersion3 // please upgrade the proto package

type Tier int32

const (
	Tier_FREE    Tier = 0
	Tier_LIGHT   Tier = 1
	Tier_PLUS    Tier = 2
	Tier_PARTNER Tier = 9
)

var Tier_name = map[int32]string{
	0: "FREE",
	1: "LIGHT",
	2: "PLUS",
	9: "PARTNER",
}

var Tier_value = map[string]int32{
	"FREE":    0,
	"LIGHT":   1,
	"PLUS":    2,
	"PARTNER": 9,
}

func (x Tier) String() string {
	return proto.EnumName(Tier_name, int32(x))
}

func (Tier) EnumDescriptor() ([]byte, []int) {
	return fileDescriptor_8bbd6f3875b0e874, []int{0}
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
	return fileDescriptor_8bbd6f3875b0e874, []int{2, 0}
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
	return fileDescriptor_8bbd6f3875b0e874, []int{0}
}

func (m *Empty) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_Empty.Unmarshal(m, b)
}
func (m *Empty) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_Empty.Marshal(b, m, deterministic)
}
func (m *Empty) XXX_Merge(src proto.Message) {
	xxx_messageInfo_Empty.Merge(m, src)
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
	return fileDescriptor_8bbd6f3875b0e874, []int{1}
}

func (m *RegisterReq) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_RegisterReq.Unmarshal(m, b)
}
func (m *RegisterReq) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_RegisterReq.Marshal(b, m, deterministic)
}
func (m *RegisterReq) XXX_Merge(src proto.Message) {
	xxx_messageInfo_RegisterReq.Merge(m, src)
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
	return fileDescriptor_8bbd6f3875b0e874, []int{2}
}

func (m *RecoverReq) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_RecoverReq.Unmarshal(m, b)
}
func (m *RecoverReq) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_RecoverReq.Marshal(b, m, deterministic)
}
func (m *RecoverReq) XXX_Merge(src proto.Message) {
	xxx_messageInfo_RecoverReq.Merge(m, src)
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
	//	*UpdateReq_DataTierChange
	Update               isUpdateReq_Update `protobuf_oneof:"update"`
	XXX_NoUnkeyedLiteral struct{}           `json:"-"`
	XXX_unrecognized     []byte             `json:"-"`
	XXX_sizecache        int32              `json:"-"`
}

func (m *UpdateReq) Reset()         { *m = UpdateReq{} }
func (m *UpdateReq) String() string { return proto.CompactTextString(m) }
func (*UpdateReq) ProtoMessage()    {}
func (*UpdateReq) Descriptor() ([]byte, []int) {
	return fileDescriptor_8bbd6f3875b0e874, []int{3}
}

func (m *UpdateReq) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_UpdateReq.Unmarshal(m, b)
}
func (m *UpdateReq) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_UpdateReq.Marshal(b, m, deterministic)
}
func (m *UpdateReq) XXX_Merge(src proto.Message) {
	xxx_messageInfo_UpdateReq.Merge(m, src)
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

type UpdateReq_DataTierChange struct {
	DataTierChange *UpdateReq_DataTier `protobuf:"bytes,2,opt,name=data_tier_change,json=dataTierChange,proto3,oneof"`
}

func (*UpdateReq_PasswordChange) isUpdateReq_Update() {}

func (*UpdateReq_DataTierChange) isUpdateReq_Update() {}

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

func (m *UpdateReq) GetDataTierChange() *UpdateReq_DataTier {
	if x, ok := m.GetUpdate().(*UpdateReq_DataTierChange); ok {
		return x.DataTierChange
	}
	return nil
}

// XXX_OneofWrappers is for the internal use of the proto package.
func (*UpdateReq) XXX_OneofWrappers() []interface{} {
	return []interface{}{
		(*UpdateReq_PasswordChange)(nil),
		(*UpdateReq_DataTierChange)(nil),
	}
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
	return fileDescriptor_8bbd6f3875b0e874, []int{3, 0}
}

func (m *UpdateReq_Password) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_UpdateReq_Password.Unmarshal(m, b)
}
func (m *UpdateReq_Password) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_UpdateReq_Password.Marshal(b, m, deterministic)
}
func (m *UpdateReq_Password) XXX_Merge(src proto.Message) {
	xxx_messageInfo_UpdateReq_Password.Merge(m, src)
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

type UpdateReq_DataTier struct {
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *UpdateReq_DataTier) Reset()         { *m = UpdateReq_DataTier{} }
func (m *UpdateReq_DataTier) String() string { return proto.CompactTextString(m) }
func (*UpdateReq_DataTier) ProtoMessage()    {}
func (*UpdateReq_DataTier) Descriptor() ([]byte, []int) {
	return fileDescriptor_8bbd6f3875b0e874, []int{3, 1}
}

func (m *UpdateReq_DataTier) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_UpdateReq_DataTier.Unmarshal(m, b)
}
func (m *UpdateReq_DataTier) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_UpdateReq_DataTier.Marshal(b, m, deterministic)
}
func (m *UpdateReq_DataTier) XXX_Merge(src proto.Message) {
	xxx_messageInfo_UpdateReq_DataTier.Merge(m, src)
}
func (m *UpdateReq_DataTier) XXX_Size() int {
	return xxx_messageInfo_UpdateReq_DataTier.Size(m)
}
func (m *UpdateReq_DataTier) XXX_DiscardUnknown() {
	xxx_messageInfo_UpdateReq_DataTier.DiscardUnknown(m)
}

var xxx_messageInfo_UpdateReq_DataTier proto.InternalMessageInfo

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
	return fileDescriptor_8bbd6f3875b0e874, []int{4}
}

func (m *Credentials) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_Credentials.Unmarshal(m, b)
}
func (m *Credentials) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_Credentials.Marshal(b, m, deterministic)
}
func (m *Credentials) XXX_Merge(src proto.Message) {
	xxx_messageInfo_Credentials.Merge(m, src)
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
	return fileDescriptor_8bbd6f3875b0e874, []int{5}
}

func (m *Token) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_Token.Unmarshal(m, b)
}
func (m *Token) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_Token.Marshal(b, m, deterministic)
}
func (m *Token) XXX_Merge(src proto.Message) {
	xxx_messageInfo_Token.Merge(m, src)
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
	Id           uint64 `protobuf:"varint,1,opt,name=id,proto3" json:"id,omitempty"`
	UserName     string `protobuf:"bytes,2,opt,name=user_name,json=userName,proto3" json:"user_name,omitempty"`
	EmailAddress string `protobuf:"bytes,3,opt,name=email_address,json=emailAddress,proto3" json:"email_address,omitempty"`
	// account properties
	Verified     bool              `protobuf:"varint,4,opt,name=verified,proto3" json:"verified,omitempty"`
	Credits      float64           `protobuf:"fixed64,5,opt,name=credits,proto3" json:"credits,omitempty"`
	IpfsKeys     map[string]string `protobuf:"bytes,6,rep,name=ipfs_keys,json=ipfsKeys,proto3" json:"ipfs_keys,omitempty" protobuf_key:"bytes,1,opt,name=key,proto3" protobuf_val:"bytes,2,opt,name=value,proto3"`
	IpfsNetworks []string          `protobuf:"bytes,7,rep,name=ipfs_networks,json=ipfsNetworks,proto3" json:"ipfs_networks,omitempty"`
	Usage        *User_Usage       `protobuf:"bytes,8,opt,name=usage,proto3" json:"usage,omitempty"`
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
	return fileDescriptor_8bbd6f3875b0e874, []int{6}
}

func (m *User) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_User.Unmarshal(m, b)
}
func (m *User) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_User.Marshal(b, m, deterministic)
}
func (m *User) XXX_Merge(src proto.Message) {
	xxx_messageInfo_User.Merge(m, src)
}
func (m *User) XXX_Size() int {
	return xxx_messageInfo_User.Size(m)
}
func (m *User) XXX_DiscardUnknown() {
	xxx_messageInfo_User.DiscardUnknown(m)
}

var xxx_messageInfo_User proto.InternalMessageInfo

func (m *User) GetId() uint64 {
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

func (m *User) GetCredits() float64 {
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

func (m *User) GetUsage() *User_Usage {
	if m != nil {
		return m.Usage
	}
	return nil
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

type User_Usage struct {
	Tier                 Tier               `protobuf:"varint,1,opt,name=tier,proto3,enum=auth.Tier" json:"tier,omitempty"`
	Data                 *User_Usage_Limits `protobuf:"bytes,2,opt,name=data,proto3" json:"data,omitempty"`
	IpnsRecords          *User_Usage_Limits `protobuf:"bytes,3,opt,name=ipns_records,json=ipnsRecords,proto3" json:"ipns_records,omitempty"`
	PubsubSent           *User_Usage_Limits `protobuf:"bytes,4,opt,name=pubsub_sent,json=pubsubSent,proto3" json:"pubsub_sent,omitempty"`
	Keys                 *User_Usage_Limits `protobuf:"bytes,5,opt,name=keys,proto3" json:"keys,omitempty"`
	XXX_NoUnkeyedLiteral struct{}           `json:"-"`
	XXX_unrecognized     []byte             `json:"-"`
	XXX_sizecache        int32              `json:"-"`
}

func (m *User_Usage) Reset()         { *m = User_Usage{} }
func (m *User_Usage) String() string { return proto.CompactTextString(m) }
func (*User_Usage) ProtoMessage()    {}
func (*User_Usage) Descriptor() ([]byte, []int) {
	return fileDescriptor_8bbd6f3875b0e874, []int{6, 1}
}

func (m *User_Usage) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_User_Usage.Unmarshal(m, b)
}
func (m *User_Usage) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_User_Usage.Marshal(b, m, deterministic)
}
func (m *User_Usage) XXX_Merge(src proto.Message) {
	xxx_messageInfo_User_Usage.Merge(m, src)
}
func (m *User_Usage) XXX_Size() int {
	return xxx_messageInfo_User_Usage.Size(m)
}
func (m *User_Usage) XXX_DiscardUnknown() {
	xxx_messageInfo_User_Usage.DiscardUnknown(m)
}

var xxx_messageInfo_User_Usage proto.InternalMessageInfo

func (m *User_Usage) GetTier() Tier {
	if m != nil {
		return m.Tier
	}
	return Tier_FREE
}

func (m *User_Usage) GetData() *User_Usage_Limits {
	if m != nil {
		return m.Data
	}
	return nil
}

func (m *User_Usage) GetIpnsRecords() *User_Usage_Limits {
	if m != nil {
		return m.IpnsRecords
	}
	return nil
}

func (m *User_Usage) GetPubsubSent() *User_Usage_Limits {
	if m != nil {
		return m.PubsubSent
	}
	return nil
}

func (m *User_Usage) GetKeys() *User_Usage_Limits {
	if m != nil {
		return m.Keys
	}
	return nil
}

type User_Usage_Limits struct {
	Limit                int64    `protobuf:"varint,1,opt,name=limit,proto3" json:"limit,omitempty"`
	Used                 int64    `protobuf:"varint,2,opt,name=used,proto3" json:"used,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *User_Usage_Limits) Reset()         { *m = User_Usage_Limits{} }
func (m *User_Usage_Limits) String() string { return proto.CompactTextString(m) }
func (*User_Usage_Limits) ProtoMessage()    {}
func (*User_Usage_Limits) Descriptor() ([]byte, []int) {
	return fileDescriptor_8bbd6f3875b0e874, []int{6, 1, 0}
}

func (m *User_Usage_Limits) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_User_Usage_Limits.Unmarshal(m, b)
}
func (m *User_Usage_Limits) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_User_Usage_Limits.Marshal(b, m, deterministic)
}
func (m *User_Usage_Limits) XXX_Merge(src proto.Message) {
	xxx_messageInfo_User_Usage_Limits.Merge(m, src)
}
func (m *User_Usage_Limits) XXX_Size() int {
	return xxx_messageInfo_User_Usage_Limits.Size(m)
}
func (m *User_Usage_Limits) XXX_DiscardUnknown() {
	xxx_messageInfo_User_Usage_Limits.DiscardUnknown(m)
}

var xxx_messageInfo_User_Usage_Limits proto.InternalMessageInfo

func (m *User_Usage_Limits) GetLimit() int64 {
	if m != nil {
		return m.Limit
	}
	return 0
}

func (m *User_Usage_Limits) GetUsed() int64 {
	if m != nil {
		return m.Used
	}
	return 0
}

func init() {
	proto.RegisterEnum("auth.Tier", Tier_name, Tier_value)
	proto.RegisterEnum("auth.RecoverReq_Type", RecoverReq_Type_name, RecoverReq_Type_value)
	proto.RegisterType((*Empty)(nil), "auth.Empty")
	proto.RegisterType((*RegisterReq)(nil), "auth.RegisterReq")
	proto.RegisterType((*RecoverReq)(nil), "auth.RecoverReq")
	proto.RegisterType((*UpdateReq)(nil), "auth.UpdateReq")
	proto.RegisterType((*UpdateReq_Password)(nil), "auth.UpdateReq.Password")
	proto.RegisterType((*UpdateReq_DataTier)(nil), "auth.UpdateReq.DataTier")
	proto.RegisterType((*Credentials)(nil), "auth.Credentials")
	proto.RegisterType((*Token)(nil), "auth.Token")
	proto.RegisterType((*User)(nil), "auth.User")
	proto.RegisterMapType((map[string]string)(nil), "auth.User.IpfsKeysEntry")
	proto.RegisterType((*User_Usage)(nil), "auth.User.Usage")
	proto.RegisterType((*User_Usage_Limits)(nil), "auth.User.Usage.Limits")
}

func init() { proto.RegisterFile("auth.proto", fileDescriptor_8bbd6f3875b0e874) }

var fileDescriptor_8bbd6f3875b0e874 = []byte{
	// 932 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0x8c, 0x55, 0xed, 0x6e, 0xe3, 0x44,
	0x14, 0x5d, 0x27, 0x76, 0xe2, 0x5c, 0x67, 0x5b, 0x77, 0x96, 0xdd, 0x35, 0xe1, 0x43, 0xc1, 0x48,
	0xa8, 0x80, 0x94, 0x48, 0xad, 0x56, 0xaa, 0x96, 0x2f, 0xa5, 0x6d, 0x60, 0x57, 0x94, 0x12, 0x4d,
	0x12, 0xf1, 0x33, 0x9a, 0xda, 0xd3, 0x74, 0x54, 0xc7, 0x36, 0x33, 0xe3, 0x96, 0xfc, 0x43, 0xbc,
	0x02, 0x12, 0x2f, 0xc1, 0x43, 0xf0, 0x10, 0xbc, 0x02, 0xcf, 0x81, 0xd0, 0xcc, 0xd8, 0xf9, 0x68,
	0x57, 0x65, 0xff, 0xcd, 0xbd, 0x3e, 0xe7, 0xdc, 0x33, 0x73, 0x6f, 0x6e, 0x00, 0x48, 0x21, 0xaf,
	0x7a, 0x39, 0xcf, 0x64, 0x86, 0x6c, 0x75, 0xee, 0xbc, 0x3f, 0xcf, 0xb2, 0x79, 0x42, 0xfb, 0x24,
	0x67, 0x7d, 0x92, 0xa6, 0x99, 0x24, 0x92, 0x65, 0xa9, 0x30, 0x98, 0xb0, 0x09, 0xce, 0x70, 0x91,
	0xcb, 0x65, 0x38, 0x07, 0x0f, 0xd3, 0x39, 0x13, 0x92, 0x72, 0x4c, 0x7f, 0x46, 0x87, 0xe0, 0x45,
	0x9c, 0xc6, 0x34, 0x95, 0x8c, 0x24, 0x22, 0xb0, 0xba, 0xd6, 0xbe, 0x77, 0xb0, 0xd7, 0xd3, 0xea,
	0x27, 0xeb, 0x0f, 0x78, 0x13, 0x85, 0x3e, 0x86, 0xc7, 0x74, 0x41, 0x58, 0x32, 0x23, 0x71, 0xcc,
	0xa9, 0x10, 0x41, 0xad, 0x6b, 0xed, 0xb7, 0x70, 0x5b, 0x27, 0x07, 0x26, 0x17, 0xfe, 0x6a, 0x01,
	0x60, 0x1a, 0x65, 0x37, 0xa6, 0xd0, 0xa7, 0x60, 0xcb, 0x65, 0x4e, 0x75, 0x85, 0x9d, 0x83, 0xa7,
	0xa6, 0xc2, 0xfa, 0x7b, 0x6f, 0xb2, 0xcc, 0x29, 0xd6, 0x90, 0xb7, 0x93, 0x0f, 0xc1, 0x56, 0x14,
	0xd4, 0x06, 0x77, 0x3a, 0x1e, 0xe2, 0xf3, 0xc1, 0x0f, 0x43, 0xff, 0x91, 0x8a, 0x46, 0x83, 0xf1,
	0xf8, 0xa7, 0x1f, 0xf1, 0xa9, 0x6f, 0x85, 0xff, 0x5a, 0xd0, 0x9a, 0xe6, 0x31, 0x91, 0x54, 0x39,
	0x38, 0x81, 0xdd, 0x9c, 0x08, 0x71, 0x9b, 0xf1, 0x78, 0x16, 0x5d, 0x91, 0x74, 0x4e, 0xcb, 0xeb,
	0x06, 0xc6, 0xcc, 0x0a, 0xd9, 0x1b, 0x95, 0xb0, 0x57, 0x8f, 0xf0, 0x4e, 0x45, 0x39, 0xd1, 0x0c,
	0x74, 0x0a, 0x7e, 0x4c, 0x24, 0x99, 0x49, 0x46, 0x79, 0xa5, 0x52, 0x7b, 0xb3, 0xca, 0x29, 0x91,
	0x64, 0xc2, 0x28, 0x57, 0x2a, 0x71, 0x79, 0x36, 0x2a, 0x9d, 0x11, 0xb8, 0x55, 0x0d, 0xf4, 0x11,
	0xb4, 0xb3, 0x24, 0x9e, 0x55, 0x75, 0xb4, 0xa7, 0x16, 0xf6, 0xb2, 0x24, 0xde, 0x84, 0xa4, 0xf4,
	0x76, 0x0d, 0x31, 0xef, 0xe1, 0xa5, 0xf4, 0xb6, 0x82, 0x74, 0x00, 0xdc, 0xaa, 0xde, 0xb1, 0x0b,
	0x8d, 0x42, 0xbb, 0x08, 0x87, 0xe0, 0x6d, 0x34, 0x11, 0x75, 0xc0, 0x2d, 0x04, 0xe5, 0x29, 0x59,
	0xd0, 0xb2, 0xcc, 0x2a, 0x56, 0xdf, 0xee, 0xe8, 0xaf, 0xe2, 0xf0, 0x05, 0x38, 0x93, 0xec, 0x9a,
	0xa6, 0xe8, 0x19, 0x34, 0xe8, 0x2f, 0x39, 0xe3, 0x86, 0x5e, 0xc7, 0x65, 0x84, 0xde, 0x01, 0x47,
	0x2a, 0x40, 0xc9, 0x34, 0x41, 0xf8, 0x97, 0x03, 0xf6, 0x54, 0x50, 0x8e, 0x76, 0xa0, 0xc6, 0xcc,
	0xc5, 0x6c, 0x5c, 0x63, 0x31, 0x7a, 0x0f, 0x5a, 0xaa, 0xee, 0x4c, 0x1b, 0xa9, 0xad, 0x8d, 0x9c,
	0x2b, 0x23, 0xf7, 0xba, 0x5f, 0xbf, 0xdf, 0x7d, 0xe5, 0xf6, 0x86, 0x72, 0x76, 0xc9, 0x68, 0x1c,
	0xd8, 0x5d, 0x6b, 0xdf, 0xc5, 0xab, 0x18, 0x05, 0xd0, 0x54, 0xc3, 0xca, 0xa4, 0x08, 0x9c, 0xae,
	0xb5, 0x6f, 0xe1, 0x2a, 0x44, 0x2f, 0xa0, 0xc5, 0xf2, 0x4b, 0x31, 0xbb, 0xa6, 0x4b, 0x11, 0x34,
	0xba, 0xf5, 0x8d, 0xae, 0x09, 0xca, 0x7b, 0xaf, 0xf3, 0x4b, 0xf1, 0x3d, 0x5d, 0x8a, 0x61, 0x2a,
	0xf9, 0x12, 0xbb, 0xac, 0x0c, 0x95, 0x23, 0x4d, 0x4b, 0xa9, 0xbc, 0xcd, 0xf8, 0xb5, 0x08, 0x9a,
	0xdd, 0xba, 0x72, 0xa4, 0x92, 0xe7, 0x65, 0x0e, 0x7d, 0x02, 0x4e, 0x21, 0xc8, 0x9c, 0x06, 0xae,
	0x9e, 0x06, 0x7f, 0x43, 0x77, 0xaa, 0xf2, 0xd8, 0x7c, 0x46, 0x1f, 0x00, 0x90, 0x9c, 0xcd, 0x48,
	0x14, 0xa9, 0xbb, 0xb5, 0xb4, 0xf7, 0x16, 0xc9, 0xd9, 0x40, 0x27, 0x54, 0xab, 0x49, 0xbc, 0x60,
	0x69, 0x05, 0x00, 0x0d, 0xf0, 0x74, 0xce, 0x40, 0x3a, 0x5f, 0xc0, 0xe3, 0x2d, 0xa7, 0xc8, 0x87,
	0xfa, 0x35, 0x5d, 0x96, 0x1d, 0x55, 0x47, 0xd5, 0x8f, 0x1b, 0x92, 0x14, 0xd5, 0xe3, 0x9a, 0xe0,
	0x65, 0xed, 0xc8, 0xea, 0xfc, 0x59, 0x03, 0x47, 0xfb, 0x41, 0x1f, 0x82, 0xad, 0x86, 0xb8, 0xfc,
	0x41, 0x82, 0xf1, 0xab, 0xe6, 0x07, 0xeb, 0x3c, 0xfa, 0x1c, 0x6c, 0x35, 0xb5, 0xe5, 0x74, 0x3f,
	0xbf, 0x7b, 0x9f, 0xde, 0x19, 0x5b, 0x30, 0x29, 0xb0, 0x06, 0xa1, 0x97, 0xd0, 0x66, 0x79, 0x2a,
	0x66, 0x9c, 0x46, 0x19, 0x8f, 0x4d, 0xcf, 0x1e, 0x20, 0x79, 0x0a, 0x8c, 0x0d, 0x16, 0x1d, 0x81,
	0x97, 0x17, 0x17, 0xa2, 0xb8, 0x98, 0x09, 0x9a, 0x4a, 0xdd, 0xce, 0x07, 0xa8, 0x60, 0xb0, 0x63,
	0x9a, 0x4a, 0x65, 0x51, 0xb7, 0xd2, 0xf9, 0x1f, 0x8b, 0x0a, 0xd4, 0x39, 0x80, 0x86, 0x89, 0xd5,
	0xeb, 0x24, 0xea, 0x54, 0x0e, 0xb1, 0x09, 0x10, 0x02, 0xbb, 0x10, 0xd4, 0x0c, 0x7f, 0x1d, 0xeb,
	0xf3, 0x67, 0x47, 0x60, 0xab, 0x17, 0x41, 0x2e, 0xd8, 0xdf, 0xe2, 0xa1, 0x5a, 0x30, 0x2d, 0x70,
	0xce, 0x5e, 0x7f, 0xf7, 0x6a, 0xe2, 0x5b, 0x2a, 0x39, 0x3a, 0x9b, 0x8e, 0xfd, 0x1a, 0xf2, 0xa0,
	0x39, 0x1a, 0xe0, 0xc9, 0xf9, 0x10, 0xfb, 0xad, 0xd0, 0x76, 0xeb, 0xbe, 0x7b, 0xf0, 0x47, 0x1d,
	0xda, 0x13, 0xba, 0xc8, 0x33, 0x4e, 0x92, 0x41, 0x21, 0xaf, 0xd0, 0x29, 0xb8, 0xd5, 0xde, 0x45,
	0x7b, 0xd5, 0xf6, 0x5b, 0xed, 0xe1, 0x0e, 0xac, 0xcd, 0x87, 0xef, 0xfe, 0xf6, 0xf7, 0x3f, 0xbf,
	0xd7, 0x9e, 0x84, 0x7b, 0xfd, 0x9b, 0xc3, 0xbe, 0x4a, 0xf7, 0x79, 0xc5, 0x3c, 0x86, 0x66, 0xb9,
	0x33, 0x91, 0x7f, 0x77, 0x85, 0x76, 0x3c, 0x93, 0x31, 0x7b, 0x3e, 0xd0, 0x22, 0x28, 0xf4, 0x37,
	0x44, 0x0c, 0xf1, 0x1b, 0x70, 0xce, 0xb2, 0x39, 0x4b, 0xd1, 0xfd, 0x35, 0x5f, 0x49, 0xe8, 0x5f,
	0x7b, 0xf8, 0x4c, 0x4b, 0xf8, 0xe1, 0xce, 0x4a, 0x22, 0xd1, 0xbc, 0x2f, 0xa1, 0x39, 0x88, 0xa2,
	0xac, 0x48, 0x25, 0xda, 0x2c, 0xb9, 0x75, 0x87, 0xb2, 0x3c, 0x5a, 0x97, 0x27, 0x25, 0xe5, 0x6b,
	0x68, 0x98, 0x1d, 0x89, 0x76, 0xef, 0x6c, 0xcc, 0x2d, 0x81, 0xe7, 0x5a, 0x60, 0x2f, 0xdc, 0x5d,
	0x09, 0x98, 0x9d, 0x86, 0xbe, 0x52, 0x4f, 0x70, 0xc9, 0xa9, 0xb8, 0xda, 0xae, 0xbe, 0x65, 0xfd,
	0x4d, 0xb7, 0xd7, 0x9c, 0xe3, 0xa7, 0xf0, 0x24, 0x4a, 0xb2, 0x22, 0xee, 0xc9, 0xb2, 0x3b, 0x9a,
	0x76, 0xd1, 0xd0, 0x7f, 0x93, 0x87, 0xff, 0x05, 0x00, 0x00, 0xff, 0xff, 0x02, 0x25, 0x93, 0xf5,
	0x58, 0x07, 0x00, 0x00,
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
	Recover(ctx context.Context, in *RecoverReq, opts ...grpc.CallOption) (*Empty, error)
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

func (c *temporalAuthClient) Recover(ctx context.Context, in *RecoverReq, opts ...grpc.CallOption) (*Empty, error) {
	out := new(Empty)
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

// TemporalAuthServer is the server API for TemporalAuth service.
type TemporalAuthServer interface {
	// Register facilitates user creation.
	Register(context.Context, *RegisterReq) (*User, error)
	// Recover facilitates account recovery.
	Recover(context.Context, *RecoverReq) (*Empty, error)
	// Login accepts credentials and returns a token for use with further requests.
	Login(context.Context, *Credentials) (*Token, error)
	// Account returns the account associated with an authenticated request.
	Account(context.Context, *Empty) (*User, error)
	// Update facilitates modification of the account associated with an
	// authenticated request.
	Update(context.Context, *UpdateReq) (*User, error)
	// Refresh provides a refreshed token associated with an authenticated request.
	Refresh(context.Context, *Empty) (*Token, error)
}

func RegisterTemporalAuthServer(s *grpc.Server, srv TemporalAuthServer) {
	s.RegisterService(&_TemporalAuth_serviceDesc, srv)
}

func _TemporalAuth_Register_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(RegisterReq)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(TemporalAuthServer).Register(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/auth.TemporalAuth/Register",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(TemporalAuthServer).Register(ctx, req.(*RegisterReq))
	}
	return interceptor(ctx, in, info, handler)
}

func _TemporalAuth_Recover_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(RecoverReq)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(TemporalAuthServer).Recover(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/auth.TemporalAuth/Recover",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(TemporalAuthServer).Recover(ctx, req.(*RecoverReq))
	}
	return interceptor(ctx, in, info, handler)
}

func _TemporalAuth_Login_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(Credentials)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(TemporalAuthServer).Login(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/auth.TemporalAuth/Login",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(TemporalAuthServer).Login(ctx, req.(*Credentials))
	}
	return interceptor(ctx, in, info, handler)
}

func _TemporalAuth_Account_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(Empty)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(TemporalAuthServer).Account(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/auth.TemporalAuth/Account",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(TemporalAuthServer).Account(ctx, req.(*Empty))
	}
	return interceptor(ctx, in, info, handler)
}

func _TemporalAuth_Update_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(UpdateReq)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(TemporalAuthServer).Update(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/auth.TemporalAuth/Update",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(TemporalAuthServer).Update(ctx, req.(*UpdateReq))
	}
	return interceptor(ctx, in, info, handler)
}

func _TemporalAuth_Refresh_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(Empty)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(TemporalAuthServer).Refresh(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/auth.TemporalAuth/Refresh",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(TemporalAuthServer).Refresh(ctx, req.(*Empty))
	}
	return interceptor(ctx, in, info, handler)
}

var _TemporalAuth_serviceDesc = grpc.ServiceDesc{
	ServiceName: "auth.TemporalAuth",
	HandlerType: (*TemporalAuthServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "Register",
			Handler:    _TemporalAuth_Register_Handler,
		},
		{
			MethodName: "Recover",
			Handler:    _TemporalAuth_Recover_Handler,
		},
		{
			MethodName: "Login",
			Handler:    _TemporalAuth_Login_Handler,
		},
		{
			MethodName: "Account",
			Handler:    _TemporalAuth_Account_Handler,
		},
		{
			MethodName: "Update",
			Handler:    _TemporalAuth_Update_Handler,
		},
		{
			MethodName: "Refresh",
			Handler:    _TemporalAuth_Refresh_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "auth.proto",
}
