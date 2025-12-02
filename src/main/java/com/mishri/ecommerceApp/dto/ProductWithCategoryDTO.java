package com.mishri.ecommerceApp.dto;


import org.jetbrains.annotations.NotNull;

import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductWithCategoryDTO {
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
    private CategoryDTO category;
}
