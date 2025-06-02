package com.example.order.orders.entities;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Schema(description = "Orders Item entity representing a user in the system")
@Builder
@Table(name = "order_items")
@Entity
public class OrderItemEntity {

    @Id
    @Schema(description = "Unique identifier of the order item", example = "1234567890")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_item_seq")
    @SequenceGenerator(name = "order_item_seq", sequenceName = "order_item_seq", allocationSize = 1)
    private Long id;

    @Schema(description = "Product Id of the order item.")
    private String productId;

    @Schema(description = "Quantity of the order item.")
    private Integer quantity;

    @Schema(description = "Price of the order item.")
    private Double price;

    @Schema(description = "Order that it relates to.")
    @ManyToOne
    @JoinColumn(name = "order_id")
    private OrderEntity orderEntity;

}

