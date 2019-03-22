package main

import (
	"context"
	"log"

	"github.com/RTradeLtd/sdk/go/temporal"
	"github.com/RTradeLtd/sdk/go/temporal/auth"
	"github.com/RTradeLtd/sdk/go/temporal/ipfs"
)

func main() {
	// Authenticate against the TemporalV3 API. A bare connection can also be
	// created using temporal.Connect(). When authenticated, the connection will
	// handle token refreshes for you.
	conn, err := temporal.Authenticate(context.Background(), &auth.Credentials{
		Username: "",
		Password: "",
	}, temporal.ConnOpts{})
	if err != nil {
		log.Fatal(err)
	}

	ipfsClient := temporal.NewIPFSClient(conn)
	if _, err = ipfsClient.NewKey(context.Background(), &ipfs.Key{
		Name: "mykey",
	}); err != nil {
		log.Fatal(err)
	}

	println("key successfully created!")
}
