// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: order_service.proto

package com.example.order.orders.grpc.generated;

public final class OrderServiceOuterClass {
  private OrderServiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_order_orders_grpc_generated_GetOrderRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_order_orders_grpc_generated_GetOrderRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_order_orders_grpc_generated_CreateOrderRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_order_orders_grpc_generated_CreateOrderRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_order_orders_grpc_generated_OrderItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_order_orders_grpc_generated_OrderItem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_order_orders_grpc_generated_OrderResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_order_orders_grpc_generated_OrderResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023order_service.proto\022\'com.example.order" +
      ".orders.grpc.generated\"#\n\017GetOrderReques" +
      "t\022\020\n\010order_id\030\001 \001(\t\"h\n\022CreateOrderReques" +
      "t\022\017\n\007user_id\030\001 \001(\t\022A\n\005items\030\002 \003(\01322.com." +
      "example.order.orders.grpc.generated.Orde" +
      "rItem\"@\n\tOrderItem\022\022\n\nproduct_id\030\001 \001(\t\022\020" +
      "\n\010quantity\030\002 \001(\005\022\r\n\005price\030\003 \001(\001\"\233\001\n\rOrde" +
      "rResponse\022\020\n\010order_id\030\001 \001(\t\022\017\n\007user_id\030\002" +
      " \001(\t\022A\n\005items\030\003 \003(\01322.com.example.order." +
      "orders.grpc.generated.OrderItem\022\024\n\014total" +
      "_amount\030\004 \001(\001\022\016\n\006status\030\005 \001(\t2\221\002\n\014OrderS" +
      "ervice\022|\n\010GetOrder\0228.com.example.order.o" +
      "rders.grpc.generated.GetOrderRequest\0326.c" +
      "om.example.order.orders.grpc.generated.O" +
      "rderResponse\022\202\001\n\013CreateOrder\022;.com.examp" +
      "le.order.orders.grpc.generated.CreateOrd" +
      "erRequest\0326.com.example.order.orders.grp" +
      "c.generated.OrderResponseB+\n\'com.example" +
      ".order.orders.grpc.generatedP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_example_order_orders_grpc_generated_GetOrderRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_example_order_orders_grpc_generated_GetOrderRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_order_orders_grpc_generated_GetOrderRequest_descriptor,
        new java.lang.String[] { "OrderId", });
    internal_static_com_example_order_orders_grpc_generated_CreateOrderRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_example_order_orders_grpc_generated_CreateOrderRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_order_orders_grpc_generated_CreateOrderRequest_descriptor,
        new java.lang.String[] { "UserId", "Items", });
    internal_static_com_example_order_orders_grpc_generated_OrderItem_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_example_order_orders_grpc_generated_OrderItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_order_orders_grpc_generated_OrderItem_descriptor,
        new java.lang.String[] { "ProductId", "Quantity", "Price", });
    internal_static_com_example_order_orders_grpc_generated_OrderResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_example_order_orders_grpc_generated_OrderResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_order_orders_grpc_generated_OrderResponse_descriptor,
        new java.lang.String[] { "OrderId", "UserId", "Items", "TotalAmount", "Status", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
