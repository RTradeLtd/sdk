#!/bin/bash

# This script installs protoc-gen-go.
# See: https://github.com/golang/protobuf/releases

VERSION=v1.3.1

echo Downloading protoc-gen-go...
go get -u github.com/golang/protobuf/protoc-gen-go

echo Checking out $VERSION...
git -C "$(go env GOPATH)"/src/github.com/golang/protobuf checkout "$VERSION"

echo Installing protoc-gen-go...
go install github.com/golang/protobuf/protoc-gen-go

echo Done!
