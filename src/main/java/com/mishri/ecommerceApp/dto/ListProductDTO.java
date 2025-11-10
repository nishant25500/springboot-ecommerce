package com.mishri.ecommerceApp.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ListProductDTO {
    List<ProductsDTO> products;
}
