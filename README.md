# Software Development Kits

This repository hosts software development kits for
[RTrade's](https://www.rtradetechnologies.com/) services.

## ☄️ Temporal

[Temporal](https://temporal.cloud/) is an easy-to-use, enterprise-grade interface
into distributed and decentralized storage. The open-source version is available
on [GitHub](https://github.com/RTradeLtd/Temporal). The SDK offers support for
the Temporal V3 API.

**⚠️ The Temporal V3 API is still under active development.**

| Language                     | Status                                                                    | Usage                                            | Examples                      |
|------------------------------|---------------------------------------------------------------------------|--------------------------------------------------|-------------------------------|
| [Golang](/go/temporal)       | ![preview](https://img.shields.io/badge/status-preview-orange.svg) | `go get github.com/RTradeLtd/sdk/go/temporal...` | [`examples/go`](/examples/go) |
| [Javascript](/js/temporal)   | ![experimental](https://img.shields.io/badge/status-experimental-red.svg) |                                                  |                               |
| [Java](/java/cloud/temporal) | ![experimental](https://img.shields.io/badge/status-experimental-red.svg) |                                                  |                               |
| [Python](/py/temporal)   | ![experimental](https://img.shields.io/badge/status-experimental-red.svg) |                                                  |                               |

## Gateway

The Temporal V3 API also offers a traditional REST API gateway - see the
[gateway documentation](https://rtradeltd.github.io/sdk/gateway).

## Building

Refer to [`CONTRIBUTING.md`](/CONTRIBUTING.md).
