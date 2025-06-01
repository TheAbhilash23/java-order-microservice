package com.example.order.orders.controllers;

import com.example.order.core.controllers.BaseController;
import com.example.order.orders.entities.OrderEntity;
import com.example.order.orders.services.OrderService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

// Convention is : controller --> service --> repository

@RestController
@RequestMapping("/orders")
@Tag(name = "Order Management", description = "APIs for managing orders")
public class OrderController extends BaseController<OrderEntity> {

    @Autowired
    private OrderService orderService;

    @Override
    @GetMapping("")
    public ResponseEntity<List<OrderEntity>> list(){
        return new ResponseEntity<>(orderService.getAll(), HttpStatus.OK);
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<OrderEntity> retrieve(@PathVariable String id){
        OrderEntity order = orderService.getOrderById(id);
        if (order == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(order, HttpStatus.OK);
    }

    @Override
    @PostMapping("/")
    public ResponseEntity<?> create(@RequestBody OrderEntity newOrder){

        if (newOrder.getSubTotal() <= 0.0){
            return new ResponseEntity<>(
                    Map.of(
                            "error", "Sub total cant be zero",
                            "message", "Sub total cant be zero"
                    ),
                    HttpStatus.BAD_REQUEST
            );
        }
        try{
            orderService.createOrder(newOrder);
            return new ResponseEntity<>(true, HttpStatus.OK);
        } catch (ValidationException e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    @PatchMapping("/{id}/")
    public ResponseEntity<OrderEntity> partialUpdate(@PathVariable String id, @RequestBody OrderEntity updateOrder){
        OrderEntity order = orderService.getOrderById(id);
        if (order == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        order = orderService.updateOrderById(id, updateOrder);
        return new ResponseEntity<>(order, HttpStatus.OK);
    }

    @Override
    @DeleteMapping("/{id}/")
    public ResponseEntity<?> delete(@PathVariable String id){
        boolean isDeleted = orderService.deleteOrderById(id);
        if (isDeleted){
            return new ResponseEntity<>(HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
