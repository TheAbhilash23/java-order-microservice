// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: order_service.proto

package com.example.order.orders.grpc.generated;

public interface OrderItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.example.order.orders.grpc.generated.OrderItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string product_id = 1;</code>
   * @return The productId.
   */
  java.lang.String getProductId();
  /**
   * <code>string product_id = 1;</code>
   * @return The bytes for productId.
   */
  com.google.protobuf.ByteString
      getProductIdBytes();

  /**
   * <code>int32 quantity = 2;</code>
   * @return The quantity.
   */
  int getQuantity();

  /**
   * <code>double price = 3;</code>
   * @return The price.
   */
  double getPrice();
}
