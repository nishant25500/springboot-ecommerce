package com.mishri.ecommerceApp.mappers;

import com.mishri.ecommerceApp.dto.CategoryDTO;
import com.mishri.ecommerceApp.dto.ProductDTO;
import com.mishri.ecommerceApp.entity.Category;

import java.util.List;

public class CategoryMapper {

    public static CategoryDTO toDto(Category category){
        return CategoryDTO.builder()
                .id(category.getId())
                .name(category.getName())
                .build();
    }

    public static Category toEntity(CategoryDTO dto){
        return Category.builder()
                .name(dto.getName())
                .build();
    }

    public static List<CategoryDTO> toListCategoryDTO(List<Category> categories){
        return categories.stream().map(category -> CategoryDTO.builder()
                .id(category.getId())
                .name(category.getName())
                .build())
                .toList();
    }
}
