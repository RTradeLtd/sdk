package temporal

import (
	context "context"
	"io"
	"log"
	"os"

	grpc "google.golang.org/grpc"

	"github.com/RTradeLtd/sdk/go/temporal/store"
)

// UploadFile is a convenience function for uploading a single file
func UploadFile(
	ctx context.Context,
	client store.TemporalStoreClient,
	file *os.File,
	holdTime int32,
	fileOpts *store.ObjectOptions,
	grpcOpts ...grpc.CallOption,
) (*store.Object, error) {
	stream, err := client.Upload(ctx)
	if err != nil {
		log.Fatal(err)
	}

	// declare file options
	stream.Send(&store.UploadReq{HoldTime: holdTime, Options: fileOpts})

	// upload file
	buf := make([]byte, 10)
	for {
		n, err := file.Read(buf)
		if err == io.EOF {
			break
		} else if err != nil {
			return nil, err
		}
		stream.Send(&store.UploadReq{Blob: &store.Blob{Content: buf[:n]}})
	}

	// done
	return stream.CloseAndRecv()
}
