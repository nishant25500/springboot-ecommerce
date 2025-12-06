package com.mishri.ecommerceApp.controllers;

import com.mishri.ecommerceApp.dto.ProductDTO;
import com.mishri.ecommerceApp.dto.ProductWithCategoryDTO;
import com.mishri.ecommerceApp.services.IProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/ecommerce/product")
public class ProductController {

    //constructor injection
    private final IProductService productService;

    public ProductController(IProductService _productService){
        this.productService = _productService;
    }


    //uska wala
//    @GetMapping("/products")
//    public List<ProductDTO> getAllProducts() throws IOException {
//        return this.productService.getAllProducts();
//    }

//    deprecated not needed now as we are using concept of @Qualifier
//    @GetMapping("/productsFromRestTemplate")
//    public List<ProductDTO> getAllProductsFromRestTemplate() throws IOException {
//        return this.productService.getAllProductsFromRestTemplate();
//    }

    @PostMapping("/create")
    public ResponseEntity<ProductDTO> createProduct(@RequestBody ProductDTO request){
        return ResponseEntity.ok(this.productService.createProduct(request));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDTO> getProductById(@PathVariable long id){
        return ResponseEntity.ok(this.productService.getProductById(id));
    }

    @GetMapping
    public ResponseEntity<List<ProductDTO>> getAllProducts(){
        return ResponseEntity.ok(this.productService.getAllProducts());
    }

    @GetMapping("/{id}/details")
    public ResponseEntity<ProductWithCategoryDTO> getProductWithCategory(@PathVariable Long id){
        return ResponseEntity.ok(this.productService.getProductWithCategory(id));
    }


}
