#! /bin/bash

PKG=$1

mkdir -p js/temporal/src
protoc -I=proto "$PKG".proto \
  -I"$GOPATH"/src/github.com/grpc-ecosystem/grpc-gateway/third_party/googleapis \
  --js_out=import_style=commonjs:js/temporal/src \
  --plugin=protoc-gen-grpc-web=build/protoc-gen-grpc-web \
  --grpc-web_out=import_style=commonjs,mode=grpcwebtext:js/temporal/src
