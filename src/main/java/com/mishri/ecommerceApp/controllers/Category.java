package com.mishri.ecommerceApp.controllers;

import com.mishri.ecommerceApp.dto.CategoryDTO;
import com.mishri.ecommerceApp.services.ICategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/ecommerce/category")
public class Category {
    ICategoryService categoryService;

    Category(ICategoryService _categoryService){
        this.categoryService = _categoryService;
    }

    @GetMapping
    public ResponseEntity<List<CategoryDTO>> getAllCategory(){
        return ResponseEntity.ok(this.categoryService.getAllCategory());
    }

    @PostMapping("/create")
    public ResponseEntity<CategoryDTO> create(@RequestBody CategoryDTO request){
        return ResponseEntity.ok(this.categoryService.create(request));
    }
}
