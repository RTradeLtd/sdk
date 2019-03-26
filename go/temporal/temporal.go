package temporal

import (
	"github.com/RTradeLtd/sdk/go/temporal/auth"
	"github.com/RTradeLtd/sdk/go/temporal/store"
	"google.golang.org/grpc"
)

// MetaKey denotes context metadata keys used by the Temporal gRPC API
type MetaKey string

const (
	// MetaKeyAuthorization is the key for authorization tokens
	MetaKeyAuthorization MetaKey = "authorization"

	// BlobThreshold is the threshold in bytes before blobs are required to be broken up
	BlobThreshold = 5e+6

	apiAddress = "api.temporal.cloud"
)

func NewAuthClient(conn *grpc.ClientConn) auth.TemporalAuthClient {
	return auth.NewTemporalAuthClient(conn)
}

func NewStoreClient(conn *grpc.ClientConn) store.TemporalStoreClient {
	return store.NewTemporalStoreClient(conn)
}
