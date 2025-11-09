package com.mishri.ecommerceApp.gateway;

import com.mishri.ecommerceApp.dto.FakeStoreProductsResponseDTO;
import com.mishri.ecommerceApp.dto.ProductsDTO;
import com.mishri.ecommerceApp.gateway.api.IFakeStoreApi;
import org.springframework.stereotype.Service;
import retrofit2.Call;

import java.io.IOException;
import java.util.List;

@Service
public class FakeStoreProductGateway implements IProductGateWay{
    private final IFakeStoreApi fakeStoreApi;

    public FakeStoreProductGateway(IFakeStoreApi _fakeStoreApi){
        this.fakeStoreApi = _fakeStoreApi;
    }
    @Override
    public List<ProductsDTO> getAllProducts() throws IOException {
        List<FakeStoreProductsResponseDTO> response = this.fakeStoreApi.getAllProducts().execute().body();

        if(response == null){
            throw new IOException("Failed to fetch products");
        }

        return response.stream().map(
                fakeStoreProductsResponseDTO -> new ProductsDTO(
                        fakeStoreProductsResponseDTO.getId(),
                        fakeStoreProductsResponseDTO.getTitle(),
                        fakeStoreProductsResponseDTO.getPrice(),
                        fakeStoreProductsResponseDTO.getCategory()
                )
        ).toList();
    }
}
