#! /bin/bash

PKG=$1

mkdir -p java
protoc -I. \
  -I"$GOPATH"/src/github.com/grpc-ecosystem/grpc-gateway/third_party/googleapis \
  --plugin=protoc-gen-grpc-java=build/protoc-gen-grpc-java \
  --grpc-java_out=java \
  proto/"$PKG".proto
