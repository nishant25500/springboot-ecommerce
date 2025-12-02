package com.mishri.ecommerceApp.mappers;

import com.mishri.ecommerceApp.dto.ProductDTO;
import com.mishri.ecommerceApp.dto.ProductWithCategoryDTO;
import com.mishri.ecommerceApp.entity.Category;
import com.mishri.ecommerceApp.entity.Product;

import java.util.List;

public class ProductMapper {

    public static ProductDTO toDto(Product product){
        return ProductDTO.builder()
                .id(product.getId())
                .title(product.getTitle())
                .image(product.getImage())
                .brand(product.getBrand())
                .color(product.getColor())
                .model(product.getModel())
                .description(product.getDescription())
                .popular(product.getPopular())
                .discount(product.getDiscount())
                .price(product.getPrice())
                .categoryId(product.getCategory().getId())
                .build();
    }

    public static Product toEntity(ProductDTO dto, Category category){
        return Product.builder()
                .title(dto.getTitle())
                .image(dto.getImage())
                .brand(dto.getBrand())
                .color(dto.getColor())
                .model(dto.getModel())
                .description(dto.getDescription())
                .popular(dto.getPopular())
                .discount(dto.getDiscount())
                .price(dto.getPrice())
                .category(category)
                .build();
    }

    public static ProductWithCategoryDTO toProductWithCategoryDTO(Product product){
        return ProductWithCategoryDTO.builder().id(product.getId())
                .title(product.getTitle())
                .image(product.getImage())
                .brand(product.getBrand())
                .color(product.getColor())
                .model(product.getModel())
                .description(product.getDescription())
                .popular(product.getPopular())
                .discount(product.getDiscount())
                .price(product.getPrice())
                .category(CategoryMapper.toDto(product.getCategory()))
                .build();
    }

    public static List<ProductDTO> toListProductDto(List<Product> products){
        return products.stream().map(product -> ProductDTO.builder()
                .id(product.getId())
                .title(product.getTitle())
                .image(product.getImage())
                .brand(product.getBrand())
                .color(product.getColor())
                .model(product.getModel())
                .description(product.getDescription())
                .popular(product.getPopular())
                .discount(product.getDiscount())
                .price(product.getPrice())
                .categoryId(product.getCategory().getId())
                .build())
                .toList();
    }
}
