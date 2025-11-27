package com.mishri.ecommerceApp.services;

import com.mishri.ecommerceApp.dto.ProductsDTO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.List;

public interface IProductService {
    List<ProductsDTO> getAllProducts() throws IOException;
    ProductsDTO createProduct(ProductsDTO dto);
    ProductsDTO getProductById(long id) throws Exception;
}
