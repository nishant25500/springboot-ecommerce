package com.mishri.ecommerceApp.services;

import com.mishri.ecommerceApp.dto.ProductDTO;

import java.io.IOException;
import java.util.List;

public interface IProductService {
//    List<ProductDTO> getAllProducts() throws IOException;
    ProductDTO createProduct(ProductDTO dto) throws Exception;
    ProductDTO getProductById(long id) throws Exception;
}
