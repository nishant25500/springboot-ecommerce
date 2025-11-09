package com.mishri.ecommerceApp.controllers;

import com.mishri.ecommerceApp.dto.ProductsDTO;
import com.mishri.ecommerceApp.services.IProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/v1/ecommerce")
public class FakeStoreController {

    //constructor injection
    private final IProductService productService;

    public FakeStoreController(IProductService _productService){
        this.productService = _productService;
    }


//    //mera wala
//    @GetMapping("/categories")
//    public List<ProductsDTO> getAllCategories() throws IOException {
//        return this.categoryService.getAllCategory();
//    }

    //uska wala
    @GetMapping("/products")
    public List<ProductsDTO> getAllProducts() throws IOException {
        return this.productService.getAllProducts();
    }

}
