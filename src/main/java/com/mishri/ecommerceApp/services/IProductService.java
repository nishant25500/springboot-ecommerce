package com.mishri.ecommerceApp.services;

import com.mishri.ecommerceApp.dto.ListProductDTO;
import com.mishri.ecommerceApp.dto.ProductsDTO;

import java.io.IOException;
import java.util.List;

public interface IProductService {
    List<ProductsDTO> getAllProducts() throws IOException;
    ListProductDTO getAllProductsFromRestTemplate() throws IOException;
}
