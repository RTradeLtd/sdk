package main

import (
	"context"
	"log"
	"os"

	"github.com/RTradeLtd/sdk/go/temporal"
	"github.com/RTradeLtd/sdk/go/temporal/auth"
	"github.com/RTradeLtd/sdk/go/temporal/store"
)

func main() {
	ctx := context.Background()

	// Authenticate against the TemporalV3 API. A bare connection can also be
	// created using temporal.Connect(). When authenticated, the connection will
	// handle token refreshes for you.
	conn, err := temporal.Authenticate(ctx, &auth.Credentials{
		Username: os.Getenv("TEMPORAL_USER"),
		Password: os.Getenv("TEMPORAL_PW"),
	}, temporal.ConnOpts{})
	if err != nil {
		log.Fatal(err)
	}

	// Create a new IPFS key
	temporalStore := temporal.NewStoreClient(conn)
	if _, err = temporalStore.NewKey(ctx, &store.Key{
		Name: "mykey",
	}); err != nil {
		log.Fatal(err)
	}
	log.Println("key successfully created!")

	// Upload an object
	file, err := os.Open(os.Getenv("FILE"))
	if err != nil {
		log.Fatal(err)
	}
	object, err := temporal.UploadFile(ctx, temporalStore, file, 3, &store.ObjectOptions{
		Passphrase: os.Getenv("FILE_PW"),
	})
	if err != nil {
		log.Fatal(err)
	}
	log.Printf("successfully uploaded file '%s' as object '%s'!\n", os.Getenv("FILE"), object.GetHash())

	// Retrieve an object
	// TODO
}
