package main

import (
	"context"
	"log"

	"github.com/RTradeLtd/sdk/go/temporal"
	"github.com/RTradeLtd/sdk/go/temporal/auth"
	"github.com/RTradeLtd/sdk/go/temporal/ipfs"
)

func main() {
	// TODO
	a, err := temporal.NewUnauthenticatedAuthClient(temporal.ConnOpts{})
	if err != nil {
		log.Fatal(err)
	}
	_, conn, err := a.Login(context.Background(), &auth.Credentials{
		Username: "",
		Password: "",
	})
	if err != nil {
		log.Fatal(err)
	}
	c := temporal.NewIPFSClient(conn)
	_, err = c.NewKey(context.Background(), &ipfs.Key{
		Name: "mykey",
	})
	if err != nil {
		log.Fatal(err)
	}
	println("key successfully created!")
}
