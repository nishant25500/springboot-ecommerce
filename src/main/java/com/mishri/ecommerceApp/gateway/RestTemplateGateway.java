package com.mishri.ecommerceApp.gateway;

import com.mishri.ecommerceApp.dto.FakeStoreProductsResponseDTO;
import com.mishri.ecommerceApp.dto.ProductsDTO;
import com.mishri.ecommerceApp.mappers.GetAllProductsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@Component("fakeStoreRestTemplateGateway")
public class RestTemplateGateway implements IProductGateWay{
    @Autowired
    private RestTemplate restTemplate;

    @Value("${RETROFIT_BASE_URL}")
    private String RETROFIT_BASE_URL;

    public List<ProductsDTO> getAllProducts() throws IOException {
        String url = RETROFIT_BASE_URL;
        url += "/products";

        // API returns an array directly
        FakeStoreProductsResponseDTO[] productArray = restTemplate.getForObject(url, FakeStoreProductsResponseDTO[].class);

        List<FakeStoreProductsResponseDTO> response = Arrays.asList(productArray);

        return GetAllProductsMapper.toProductDTO(response);
    }
}
