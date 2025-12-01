package com.mishri.ecommerceApp.services;


import com.mishri.ecommerceApp.dto.CategoryDTO;

import java.util.List;

public interface ICategoryService {

    List<CategoryDTO> getAllCategory();
    CategoryDTO create(CategoryDTO dto);
}
