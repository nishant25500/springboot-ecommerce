package com.mishri.ecommerceApp.services;

import com.mishri.ecommerceApp.dto.ProductDTO;
import com.mishri.ecommerceApp.dto.ProductWithCategoryDTO;
import com.mishri.ecommerceApp.entity.Category;
import com.mishri.ecommerceApp.entity.Product;
//import com.mishri.ecommerceApp.gateway.IProductGateWay;
import com.mishri.ecommerceApp.exception.CategoryNotFoundException;
import com.mishri.ecommerceApp.exception.ProductNotFoundException;
import com.mishri.ecommerceApp.mappers.ProductMapper;
import com.mishri.ecommerceApp.repository.CategoryRepository;
import com.mishri.ecommerceApp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {
//    IProductGateWay iProductGateWay;
    ProductRepository productRepo;
    CategoryRepository categoryRepo;

    @Autowired
    ProductServiceImpl(ProductRepository _productRepo,CategoryRepository _categoryRepo){
//        this.iProductGateWay = _iProductGateWay;
        this.productRepo = _productRepo;
        this.categoryRepo = _categoryRepo;
    }

//    @Override
//    public List<ProductDTO> getAllProducts() throws IOException {
//        return iProductGateWay.getAllProducts();
//    }

    @Override
    public ProductDTO createProduct(ProductDTO dto){
        Category category = categoryRepo.findById(dto.getCategoryId())
                            .orElseThrow(() -> new CategoryNotFoundException("Category not found"));
        Product saved = productRepo.save(ProductMapper.toEntity(dto,category));
        return ProductMapper.toDto(saved);
    }

    @Override
    public ProductDTO getProductById(long id){
        Product product = productRepo.findById(id)
                .orElseThrow(() -> new ProductNotFoundException("Product with id: "+id+" not found"));
        return ProductMapper.toDto(product);
    }

    @Override
    public ProductWithCategoryDTO getProductWithCategory(Long id){

        Product product = productRepo.findById(id)
                .orElseThrow(() -> new ProductNotFoundException("Product with id: "+id+" not found"));

        return ProductMapper.toProductWithCategoryDTO(product);

    }

    @Override
    public List<ProductDTO> getAllProducts(){
        List<Product> products = productRepo.findAll();

        return ProductMapper.toListProductDto(products);
    }


}
