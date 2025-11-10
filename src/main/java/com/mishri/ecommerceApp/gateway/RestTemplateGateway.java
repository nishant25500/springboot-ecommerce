package com.mishri.ecommerceApp.gateway;

import com.mishri.ecommerceApp.dto.ListProductDTO;
import com.mishri.ecommerceApp.dto.ProductsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.List;

@Service
public class RestTemplateGateway implements IProductRestTemplateGateway {
    @Autowired
    private RestTemplate restTemplate;

    @Value("${RETROFIT_BASE_URL}")
    private String RETROFIT_BASE_URL;

    public ListProductDTO getAllProducts() throws IOException {
        String url = RETROFIT_BASE_URL;
        url += "/products";

        // API returns an array directly, not an object with a "products" field
        ProductsDTO[] productsArray = restTemplate.getForObject(url, ProductsDTO[].class);
        
        // Wrap the array in ListProductDTO
        ListProductDTO response = new ListProductDTO();
        response.setProducts(productsArray != null ? List.of(productsArray) : List.of());

        return response;
    }
}
