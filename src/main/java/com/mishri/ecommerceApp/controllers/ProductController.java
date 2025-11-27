package com.mishri.ecommerceApp.controllers;

import com.mishri.ecommerceApp.dto.ProductsDTO;
import com.mishri.ecommerceApp.services.IProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/v1/ecommerce")
public class ProductController {

    //constructor injection
    private final IProductService productService;

    public ProductController(IProductService _productService){
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

//    deprecated not needed now as we are using concept of @Qualifier
//    @GetMapping("/productsFromRestTemplate")
//    public List<ProductsDTO> getAllProductsFromRestTemplate() throws IOException {
//        return this.productService.getAllProductsFromRestTemplate();
//    }

    @PostMapping("/products")
    public ResponseEntity<ProductsDTO> createProduct(@RequestBody ProductsDTO request){
        return ResponseEntity.ok(this.productService.createProduct(request));
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<ProductsDTO> getProductById(@PathVariable long id) throws Exception{
        return ResponseEntity.ok(this.productService.getProductById(id));
    }
}
