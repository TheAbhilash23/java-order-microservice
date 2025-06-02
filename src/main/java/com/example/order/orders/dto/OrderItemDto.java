package com.example.order.orders.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

@Schema
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class OrderItemDto {

    @Nullable
    private Long id;

    @Nullable
    private String productId;

    @Nullable
    private Integer quantity;

    @Nullable
    private Double price;

    @Nullable
    private Long orderId;
}
