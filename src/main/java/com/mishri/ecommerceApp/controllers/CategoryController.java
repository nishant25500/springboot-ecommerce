package com.mishri.ecommerceApp.controllers;

import com.mishri.ecommerceApp.dto.CategoryDTO;
import com.mishri.ecommerceApp.dto.CategoryWithAllProductsDTO;
import com.mishri.ecommerceApp.services.ICategoryService;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/ecommerce/category")
public class CategoryController {
    ICategoryService categoryService;

    CategoryController(ICategoryService _categoryService){
        this.categoryService = _categoryService;
    }

    //note here we are utilizing this api for two purpose
    @GetMapping
    public ResponseEntity<?> getAllCategory(@Param("name") String name){
        if(name != null && !name.isBlank()){
            return ResponseEntity.ok(this.categoryService.findCategoryByName(name));
        }else{
            return ResponseEntity.ok(this.categoryService.getAllCategory());
        }

    }

    @PostMapping("/create")
    public ResponseEntity<CategoryDTO> create(@RequestBody CategoryDTO request){
        return ResponseEntity.ok(this.categoryService.create(request));
    }

    @GetMapping("/{id}/products")
    public ResponseEntity<CategoryWithAllProductsDTO> getAllProductOfCategoryWithId(@PathVariable Long id)  {
        return ResponseEntity.ok(this.categoryService.getAllProductOfCategoryWithId(id));
    }

}
