package com.mishri.ecommerceApp.gateway;

import com.mishri.ecommerceApp.dto.ListProductDTO;
import com.mishri.ecommerceApp.dto.ProductsDTO;

import java.io.IOException;
import java.util.List;

public interface IProductRestTemplateGateway {
    ListProductDTO getAllProducts() throws IOException;
}
