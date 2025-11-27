package com.mishri.ecommerceApp.services;

import com.mishri.ecommerceApp.dto.ProductsDTO;
import com.mishri.ecommerceApp.entity.Product;
import com.mishri.ecommerceApp.gateway.IProductGateWay;
import com.mishri.ecommerceApp.mappers.ProductMapper;
import com.mishri.ecommerceApp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {
    IProductGateWay iProductGateWay;
    ProductRepository productRepo;

    @Autowired
    ProductServiceImpl(@Qualifier("fakeStoreRestTemplateGateway") IProductGateWay _iProductGateWay,ProductRepository repo){
        this.iProductGateWay = _iProductGateWay;
        this.productRepo = repo;
    }

    @Override
    public List<ProductsDTO> getAllProducts() throws IOException {
        return iProductGateWay.getAllProducts();
    }

    @Override
    public ProductsDTO createProduct(ProductsDTO dto){
        Product saved = productRepo.save(ProductMapper.toEntity(dto));
        return ProductMapper.toDto(saved);
    }

    @Override
    public ProductsDTO getProductById(long id) throws Exception{
        Product product = productRepo.findById(id)
                .orElseThrow(() -> new Exception("Product not found"));
        return ProductMapper.toDto(product);
    }

}
