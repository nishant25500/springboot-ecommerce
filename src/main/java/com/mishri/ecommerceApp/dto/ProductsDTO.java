package com.mishri.ecommerceApp.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductsDTO {
    String id;
    String title;
    Double price;
    String category;
}
