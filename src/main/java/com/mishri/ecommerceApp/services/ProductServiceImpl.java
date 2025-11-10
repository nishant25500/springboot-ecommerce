package com.mishri.ecommerceApp.services;

import com.mishri.ecommerceApp.dto.ListProductDTO;
import com.mishri.ecommerceApp.dto.ProductsDTO;
import com.mishri.ecommerceApp.gateway.IProductGateWay;
import com.mishri.ecommerceApp.gateway.IProductRestTemplateGateway;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {
    IProductGateWay iProductGateWay;
    IProductRestTemplateGateway iProductRestTemplateGateway;

    ProductServiceImpl(IProductGateWay _iProductGateWay, IProductRestTemplateGateway _iProductRestTemplateGateway){
        this.iProductGateWay = _iProductGateWay;
        this.iProductRestTemplateGateway = _iProductRestTemplateGateway;
    }

    @Override
    public List<ProductsDTO> getAllProducts() throws IOException {
        return iProductGateWay.getAllProducts();
    }

    @Override
    public ListProductDTO getAllProductsFromRestTemplate() throws IOException {
        return iProductRestTemplateGateway.getAllProducts();
    }
}
