PKGS=core auth store ipfs

all: deps

.PHONY: deps
deps:
	go get github.com/grpc-ecosystem/grpc-gateway/protoc-gen-grpc-gateway
	go get github.com/grpc-ecosystem/grpc-gateway/protoc-gen-swagger
	go get github.com/golang/protobuf/protoc-gen-go
	npm install -g redoc-cli

.PHONY: proto
proto:
	$(foreach var,$(PKGS),$(MAKE) gen-pkg PKG=$(var);)

.PHONY: gen-pkg
gen-pkg:
	scripts/gen-go-pkg.sh ${PKG}

.PHONY: swagger
swagger:
	$(foreach var,$(PKGS),$(MAKE) swagger-pkg PKG=$(var);)

.PHONY: swagger-pkg
swagger-pkg:
	protoc -I/usr/local/include -I. \
		-I${GOPATH}/src/github.com/grpc-ecosystem/grpc-gateway/third_party/googleapis \
		--swagger_out=logtostderr=true:. \
		proto/${PKG}.proto

.PHONY: docs
docs-gateway: swagger
	$(foreach var,$(PKGS),$(MAKE) docs-gateway-pkg PKG=$(var);)

.PHONY: docs-pkg
docs-gateway-pkg:
	redoc-cli bundle proto/${PKG}.swagger.json -o docs/gateway/${PKG}/index.html
