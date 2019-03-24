#! /bin/bash

PKG=$1

echo "[INFO] generating java bindings for '$PKG'..."
mkdir -p java
protoc -I=proto \
  -I"$GOPATH"/src/github.com/grpc-ecosystem/grpc-gateway/third_party/googleapis \
  --plugin=protoc-gen-grpc-java=build/protoc-gen-grpc-java \
  --grpc-java_out=java \
  "$PKG.proto" 
