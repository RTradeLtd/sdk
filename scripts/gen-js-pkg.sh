#! /bin/bash

PKG=$1

echo "[INFO] generating js bindings for '$PKG'..."
mkdir -p js/temporal/src
protoc -I=proto \
  -I"$GOPATH"/src/github.com/grpc-ecosystem/grpc-gateway/third_party/googleapis \
  --js_out=import_style=commonjs:js/temporal/src/pb \
  --plugin=protoc-gen-grpc-web=build/protoc-gen-grpc-web \
  --grpc-web_out=import_style=commonjs,mode=grpcwebtext:js/temporal/src/pb \
  "$PKG.proto"
