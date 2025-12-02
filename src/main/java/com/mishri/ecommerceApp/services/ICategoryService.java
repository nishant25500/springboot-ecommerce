package com.mishri.ecommerceApp.services;


import com.mishri.ecommerceApp.dto.CategoryDTO;
import com.mishri.ecommerceApp.dto.CategoryWithAllProductsDTO;

import java.util.List;

public interface ICategoryService {

    List<CategoryDTO> getAllCategory();

    CategoryDTO create(CategoryDTO dto);

    CategoryDTO findCategoryByName(String name);

    CategoryWithAllProductsDTO getAllProductOfCategoryWithId(Long id) throws Exception;

}
