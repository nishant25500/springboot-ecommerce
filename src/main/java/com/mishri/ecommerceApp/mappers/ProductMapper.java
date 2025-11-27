package com.mishri.ecommerceApp.mappers;

import com.mishri.ecommerceApp.dto.ProductsDTO;
import com.mishri.ecommerceApp.entity.Product;

public class ProductMapper {

    public static ProductsDTO toDto(Product product){
        return ProductsDTO.builder()
                .id(product.getId())
                .title(product.getTitle())
                .price(product.getPrice())
                .category(product.getCategory())
                .build();
    }

    public static Product toEntity(ProductsDTO dto){
        return Product.builder()
                .title(dto.getTitle())
                .price(dto.getPrice())
                .category(dto.getCategory())
                .build();
    }
}
