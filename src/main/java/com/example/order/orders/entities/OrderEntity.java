package com.example.order.orders.entities;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Schema(description = "Orders entity representing a user in the system")
@Table(name = "orders")
@Entity
public class OrderEntity {

    @Id
    @Schema(description = "Unique identifier of the order", example = "1234567890")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_seq")
    @SequenceGenerator(name = "order_seq", sequenceName = "order_seq", allocationSize = 1)
    private Long id;

    @Schema(description = "Sub total (before taxes) (requires double)", example = "100.21")
    private Double subTotal;

    @Schema(description = "Date when the user was created")
    private LocalDateTime date;

    @Schema(description = "User for which subscription order is generated. (Long)", example = "3q34sdfsd456t5ydf634tgh59")
    private Long userId;


    @Schema(description = "List of all order items linked to this order.")
    @OneToMany(mappedBy = "orderEntity", cascade = CascadeType.ALL)
    private List<OrderItemEntity> orderItems = new ArrayList<>();
}

