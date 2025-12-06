package com.mishri.ecommerceApp.services;

import com.mishri.ecommerceApp.dto.CategoryDTO;
import com.mishri.ecommerceApp.dto.CategoryWithAllProductsDTO;
import com.mishri.ecommerceApp.entity.Category;
import com.mishri.ecommerceApp.entity.Product;
import com.mishri.ecommerceApp.exception.CategoryNotFoundException;
import com.mishri.ecommerceApp.mappers.CategoryMapper;
import com.mishri.ecommerceApp.repository.CategoryRepository;
import com.mishri.ecommerceApp.repository.ProductRepository;
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

    @Override
    public CategoryDTO findCategoryByName(String name) {
        Category category = categoryRepo.findByName(name);
        return CategoryMapper.toDto(category);
    }

    @Override
    public CategoryWithAllProductsDTO getAllProductOfCategoryWithId(Long id){
        Category category = categoryRepo.findById(id)
                .orElseThrow(() -> new CategoryNotFoundException("Category Not found"));

//        do not need to do this explicitly it is handled by jpa mapping
//        List<Product> products = productRepo.findByCategoryId(category.getId());

        return CategoryMapper.toCategoryWithAllProductsDTO(category);
    }
}
