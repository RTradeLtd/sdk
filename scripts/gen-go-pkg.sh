#! /bin/bash

PKG=$1
SERVER=$2
OUT=$3
if test -z "$OUT" 
then
  OUT=go/temporal/"$PKG"
fi

# GOLANG BINDINGS
echo "[INFO] generating golang bindings for '$PKG'..."
mkdir -p "$OUT"
protoc -Iproto \
  -I"$GOPATH"/src/github.com/grpc-ecosystem/grpc-gateway/third_party/googleapis \
  --go_out=plugins=grpc:"$OUT" \
  "$PKG.proto"

# strip out server stubs, unless prompted to otherwise
if test -z "$SERVER" 
then
  exit 0
else
  echo "[INFO] generating server gateways for '$PKG'..."
	protoc -Iproto \
    -I"$GOPATH"/src/github.com/grpc-ecosystem/grpc-gateway/third_party/googleapis \
		--grpc-gateway_out=logtostderr=true:"$OUT" \
    "$PKG".proto
fi
