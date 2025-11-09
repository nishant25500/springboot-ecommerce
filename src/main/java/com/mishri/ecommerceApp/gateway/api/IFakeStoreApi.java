package com.mishri.ecommerceApp.gateway.api;

import com.mishri.ecommerceApp.dto.FakeStoreProductsResponseDTO;
import retrofit2.Call;
import retrofit2.http.GET;

import java.io.IOException;
import java.util.List;

public interface IFakeStoreApi {

    @GET("/products")
    Call<List<FakeStoreProductsResponseDTO>> getAllProducts() throws IOException;


}
