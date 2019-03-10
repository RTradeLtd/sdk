#! /bin/bash

PKG=$1

# GOLANG BINDINGS
protoc -I. \
  -I"$GOPATH"/src/github.com/grpc-ecosystem/grpc-gateway/third_party/googleapis \
  --go_out=plugins=grpc:"$GOPATH"/src \
  proto/"$PKG".proto
# strip out server stubs
sed -i '' '/is the server API for/,$d' ./go/temporal/"$PKG"/"$PKG".pb.go
