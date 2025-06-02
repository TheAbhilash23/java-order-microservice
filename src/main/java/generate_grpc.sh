#!/usr/bin/env bash

protoc   -I=com/example/order/orders/grpc/protos   --java_out=. --grpc-java_out=.  com/example/order/orders/grpc/protos/order_service.proto
protoc   -I=com/example/order/orders/grpc/protos   --java_out=.  com/example/order/orders/grpc/protos/user_service.proto
