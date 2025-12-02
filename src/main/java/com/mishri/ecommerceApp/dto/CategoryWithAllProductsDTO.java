package com.mishri.ecommerceApp.dto;

import lombok.*;
import org.jetbrains.annotations.NotNull;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CategoryWithAllProductsDTO {

    @NotNull
    private Long id;

    private String name;

    private List<ProductDTO> products;
}
