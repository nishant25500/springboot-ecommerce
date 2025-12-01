package com.mishri.ecommerceApp.dto;

import com.mishri.ecommerceApp.entity.Category;
import lombok.*;
import org.jetbrains.annotations.NotNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductDTO {
    @NotNull
    private Long id;
    @NotNull
    private String title;
    private String image;
    private String color;
    private Double price;
    private String description;
    private Integer discount;
    private String model;
    private String brand;
    private Boolean popular;
    @NotNull
    private Long categoryId;
}
