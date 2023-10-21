package com.uncledavecode.products_service.model.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductResponse {

    private Long id;
    private String sku; // código
    private String name; // nombre
    private String description; // descripción
    private Double price; // precio
    private Boolean status; //estado
}
