#! /bin/bash

PKG=$1

python3 -m grpc_tools.protoc \
  -Iproto \
  -I"$GOPATH"/src/github.com/grpc-ecosystem/grpc-gateway/third_party/googleapis \
  --python_out=py/temporal/pb \
  --grpc_python_out=py/temporal/pb \
  "$PKG.proto"
