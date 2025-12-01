package com.mishri.ecommerceApp.services;

import com.mishri.ecommerceApp.dto.CategoryDTO;
import com.mishri.ecommerceApp.entity.Category;
import com.mishri.ecommerceApp.mappers.CategoryMapper;
import com.mishri.ecommerceApp.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements ICategoryService{
    CategoryRepository categoryRepo;

    CategoryServiceImpl(CategoryRepository _categoryRepo){
        this.categoryRepo = _categoryRepo;
    }

    @Override
    public CategoryDTO create(CategoryDTO dto){
        Category saved = categoryRepo.save(CategoryMapper.toEntity(dto));
        return CategoryMapper.toDto(saved);
    }

    @Override
    public List<CategoryDTO> getAllCategory(){
        List<Category> allCategories = categoryRepo.findAll();
        return CategoryMapper.toListCategoryDTO(allCategories);
    }
}
