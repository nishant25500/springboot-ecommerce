package com.mishri.ecommerceApp.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FakeStoreProductsResponseDTO {
    private String id;
    private String title;
    private Double price;
    private String description;
    private String category;
    private String image;
}
