package com.example.order.orders.repository;

import com.example.order.orders.entities.OrderItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderItemRepository extends JpaRepository<OrderItemEntity, Long> {
}
