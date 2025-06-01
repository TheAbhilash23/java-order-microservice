package com.example.order.orders.services;

import com.example.order.orders.grpc.generated.*;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.stereotype.Service;

@Service
@GrpcService
public class OrderRpcService extends OrderServiceGrpc.OrderServiceImplBase {

    @Override
    public void getOrder(GetOrderRequest request, StreamObserver<OrderResponse> responseObserver) {
        // Mock implementation
        OrderResponse response = OrderResponse.newBuilder()
                .setOrderId(request.getOrderId())
                .setUserId("user-123")
                .addItems(OrderItem.newBuilder()
                        .setProductId("prod-1")
                        .setQuantity(2)
                        .setPrice(29.99)
                        .build())
                .setTotalAmount(59.98)
                .setStatus("COMPLETED")
                .build();
        
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void createOrder(CreateOrderRequest request, StreamObserver<OrderResponse> responseObserver) {
        // Mock implementation
        double totalAmount = request.getItemsList().stream()
                .mapToDouble(item -> item.getPrice() * item.getQuantity())
                .sum();

        OrderResponse response = OrderResponse.newBuilder()
                .setOrderId("order-" + System.currentTimeMillis())
                .setUserId(request.getUserId())
                .addAllItems(request.getItemsList())
                .setTotalAmount(totalAmount)
                .setStatus("CREATED")
                .build();
        
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
} 