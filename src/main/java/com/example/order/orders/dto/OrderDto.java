package com.example.order.orders.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

import java.time.LocalDateTime;
import java.util.List;

@Schema(description = "Orders entity representing a user in the system")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {

    @Nullable
    private Long id;

    @Nullable
    private Double subTotal;

    @Nullable
    private LocalDateTime date;

    @Nullable
    private Long userId;

    @Nullable
    private List<OrderItemDto> orderItemDtoList;
}
