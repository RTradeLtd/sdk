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
	// Authenticate against the TemporalV3 API. A bare connection can also be
	// created using temporal.Connect(). When authenticated, the connection will
	// handle token refreshes for you.
	conn, err := temporal.Authenticate(context.Background(), &auth.Credentials{
		Username: os.Getenv("TEMPORAL_USER"),
		Password: os.Getenv("TEMPORAL_PW"),
	}, temporal.ConnOpts{})
	if err != nil {
		log.Fatal(err)
	}

	// Create a new IPFS key
	var temporalStore = temporal.NewStoreClient(conn)
	if _, err = temporalStore.NewKey(context.Background(), &store.Key{
		Name: "mykey",
	}); err != nil {
		log.Fatal(err)
	}
	println("key successfully created!")

	// Upload an object
	// TODO

	// Retrieve an object
	// TODO
}
