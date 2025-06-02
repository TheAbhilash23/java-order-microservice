package com.example.order.orders.services;

import com.example.order.orders.entities.OrderEntity;
import com.example.order.orders.repository.OrderRepository;
import jakarta.validation.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Component
public class OrderService {


    @Autowired
    private OrderRepository orderRepository;

    public boolean isUserExisting(Long userId){
        return orderRepository.existsByUserId(userId);
    };

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void createOrder(OrderEntity order) throws ValidationException {
        OrderEntity newOrder = new OrderEntity();
        System.out.println(orderRepository.existsByUserId(order.getUserId()));
        System.out.println(isUserExisting(order.getUserId()));
        newOrder.setUserId(order.getUserId());
        newOrder.setSubTotal(order.getSubTotal());
        newOrder.setDate(LocalDateTime.now());
        orderRepository.save(newOrder);
    }


    public List<OrderEntity> getAll() {
        return orderRepository.findAll();
    }

    public OrderEntity getOrderById(Long id) {
        return orderRepository.findById(id).orElse(null);
    }

    public OrderEntity updateOrderById(Long id, OrderEntity orderData) {
        OrderEntity old = orderRepository.findById(id).orElse(null);
        if (old != null) {
            // username and date can't change
            old.setUserId(orderData.getUserId() != null ? orderData.getUserId() : old.getUserId());
            old.setDate(orderData.getDate() != null && !orderData.getDate().toString().isBlank() ? orderData.getDate() : LocalDateTime.now());
            old.setSubTotal(orderData.getSubTotal() != null ? orderData.getSubTotal() : old.getSubTotal());
            orderRepository.save(old);
            return old;
        }
        return null;
    }

    public boolean deleteOrderById(Long id) {
        Optional<OrderEntity> order = orderRepository.findById(id);
        if (order.isPresent()) {
            orderRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
