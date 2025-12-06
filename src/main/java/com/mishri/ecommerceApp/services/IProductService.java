package com.mishri.ecommerceApp.services;

import com.mishri.ecommerceApp.dto.ProductDTO;
import com.mishri.ecommerceApp.dto.ProductWithCategoryDTO;

import java.io.IOException;
import java.util.List;

public interface IProductService {
//  List<ProductDTO> getAllProducts() throws IOException;
    ProductDTO createProduct(ProductDTO dto);

    //Note: if we are handling exception through global exception classes then it is not mandatory to throw Exception through methods
    ProductDTO getProductById(long id);

    ProductWithCategoryDTO getProductWithCategory(Long id);

    List<ProductDTO> getAllProducts();
}
