# Clients

## Temporal

The reference Temporal client library is the [Golang library](https://godoc.org/github.com/RTradeLtd/sdk/go/temporal).
All Temporal client libraries should implement the language-specific equivalents
of the following in a base `temporal` package or module separate from the
generated Protobuf code:

#### Plumbing

```go
func Connect(context.Context, *auth.Token, ConnOpts) (*grpc.ClientConn, error)
func Authenticate(context.Context, *auth.Credentials, ConnOpts) (*grpc.ClientConn, error)
```

#### Utilities

##### Store

```go
func DownloadFile(context.Context, store.TemporalStoreClient, io.Writer, *store.DownloadReq, ...grpc.CallOption) error
func UploadFile(context.Context, store.TemporalStoreClient, io.Reader, int32, *store.ObjectOptions, ...grpc.CallOption) (*store.Object, error)
```
