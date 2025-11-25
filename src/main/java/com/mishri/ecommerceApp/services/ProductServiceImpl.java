package com.mishri.ecommerceApp.services;

import com.mishri.ecommerceApp.dto.ProductsDTO;
import com.mishri.ecommerceApp.gateway.IProductGateWay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {
    IProductGateWay iProductGateWay;

    @Autowired
    ProductServiceImpl(@Qualifier("fakeStoreRestTemplateGateway") IProductGateWay _iProductGateWay){
        this.iProductGateWay = _iProductGateWay;
    }

    @Override
    public List<ProductsDTO> getAllProducts() throws IOException {
        return iProductGateWay.getAllProducts();
    }

}
