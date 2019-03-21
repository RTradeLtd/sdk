package temporal

import (
	"context"

	"github.com/RTradeLtd/sdk/go/temporal/auth"
	"google.golang.org/grpc"
)

type UnauthenticatedAuthClient struct {
	c    auth.TemporalAuthClient
	conn *grpc.ClientConn
}

func NewUnauthenticatedAuthClient(opts ConnOpts) (*UnauthenticatedAuthClient, error) {
	conn, err := NewConn("", opts)
	if err != nil {
		return nil, err
	}
	return &UnauthenticatedAuthClient{
		c:    auth.NewTemporalAuthClient(conn),
		conn: conn,
	}, nil
}

func (u *UnauthenticatedAuthClient) Register(
	ctx context.Context, in *auth.RegisterReq, opts ...grpc.CallOption) (*auth.User, error) {
	return nil, nil
}

func (u *UnauthenticatedAuthClient) Recover(
	ctx context.Context, in *auth.RecoverReq, opts ...grpc.CallOption) (*auth.User, error) {
	return nil, nil
}

func (u *UnauthenticatedAuthClient) Login(
	ctx context.Context, in *auth.Credentials, opts ...grpc.CallOption) (auth.TemporalAuthClient, *grpc.ClientConn, error) {
	return nil, nil, nil
}
