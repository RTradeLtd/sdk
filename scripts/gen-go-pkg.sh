#! /bin/bash

PKG=$1
SERVER=$2
OUT=$3
if test -z "$OUT" 
then
  OUT=go/temporal/"$PKG"
fi

# GOLANG BINDINGS
mkdir -p "$OUT"
protoc -Iproto \
  -I"$GOPATH"/src/github.com/grpc-ecosystem/grpc-gateway/third_party/googleapis \
  --go_out=plugins=grpc:"$OUT"\
  proto/"$PKG".proto

# strip out server stubs, unless prompted to otherwise
if test -z "$SERVER" 
then
  sed -i '' '/is the server API for/,/func init() { proto.RegisterFile/{//p;d;}' ./go/temporal/"$PKG"/"$PKG".pb.go
else
  echo "preserving server stubs and generating server gateways for '$PKG'..."
	protoc -Iproto \
    -I"$GOPATH"/src/github.com/grpc-ecosystem/grpc-gateway/third_party/googleapis \
		--grpc-gateway_out=logtostderr=true:"$OUT" \
    proto/"$PKG".proto
fi
