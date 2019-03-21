package temporal

import (
	"crypto/tls"

	"google.golang.org/grpc/credentials"

	"github.com/RTradeLtd/grpc/dialer"
	"github.com/RTradeLtd/sdk/go/temporal/auth"
	"github.com/RTradeLtd/sdk/go/temporal/ipfs"
	"github.com/RTradeLtd/sdk/go/temporal/store"
	"google.golang.org/grpc"
)

// MetaKey denotes context metadata keys used by the Temporal gRPC API
type MetaKey string

const (
	// MetaKeyAuthorization is the key for authorization tokens
	MetaKeyAuthorization MetaKey = "authorization"

	apiAddress = "api.temporal.cloud"
)

type ConnOpts struct {
	Advanced *AdvancedConnOpts
}

type AdvancedConnOpts struct {
	API string      // leave blank for default
	TLS *tls.Config // leave nil to disable
}

func NewConn(key string, opts ConnOpts) (*grpc.ClientConn, error) {
	dialOpts := make([]grpc.DialOption, 0)
	if key != "" {
		dialOpts = []grpc.DialOption{
			grpc.WithPerRPCCredentials(dialer.NewCredentials(key, true)),
		}
	}

	var addr = apiAddress
	if opts.Advanced != nil {
		if opts.Advanced.API != "" {
			addr = opts.Advanced.API
		}
		if opts.Advanced.TLS == nil {
			dialOpts = append(dialOpts, grpc.WithInsecure())
		} else {
			dialOpts = append(dialOpts, grpc.WithTransportCredentials(
				credentials.NewTLS(opts.Advanced.TLS),
			))
		}
	}

	return grpc.Dial(addr, dialOpts...)
}

func NewAuthClient(conn *grpc.ClientConn) auth.TemporalAuthClient {
	return auth.NewTemporalAuthClient(conn)
}

func NewStoreClient(conn *grpc.ClientConn) store.TemporalStoreClient {
	return store.NewTemporalStoreClient(conn)
}

func NewIPFSClient(conn *grpc.ClientConn) ipfs.TemporalIPFSClient {
	return ipfs.NewTemporalIPFSClient(conn)
}
