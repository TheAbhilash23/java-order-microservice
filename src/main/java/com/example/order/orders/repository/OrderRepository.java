package com.example.order.orders.repository;

import com.example.order.orders.entities.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<OrderEntity, Long> {
    boolean existsByUserId(Long userId);
}
