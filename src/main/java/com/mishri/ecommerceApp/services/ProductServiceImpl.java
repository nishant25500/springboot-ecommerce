package com.mishri.ecommerceApp.services;

import com.mishri.ecommerceApp.dto.ProductsDTO;
import com.mishri.ecommerceApp.gateway.IProductGateWay;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {
    IProductGateWay iProductGateWay;

    ProductServiceImpl(IProductGateWay _iProductGateWay){
        this.iProductGateWay = _iProductGateWay;
    }

    @Override
    public List<ProductsDTO> getAllProducts() throws IOException {
        return iProductGateWay.getAllProducts();
    }
}
