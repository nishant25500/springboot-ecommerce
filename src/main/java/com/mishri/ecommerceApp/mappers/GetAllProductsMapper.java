package com.mishri.ecommerceApp.mappers;

import com.mishri.ecommerceApp.dto.FakeStoreProductsResponseDTO;
import com.mishri.ecommerceApp.dto.ProductsDTO;

import java.util.List;

public class GetAllProductsMapper {

    public static List<ProductsDTO> toProductDTO(List<FakeStoreProductsResponseDTO> dto){
        return dto.stream().map(
                fakeStoreProductsResponseDTO -> new ProductsDTO(
                        fakeStoreProductsResponseDTO.getId(),
                        fakeStoreProductsResponseDTO.getTitle(),
                        fakeStoreProductsResponseDTO.getPrice(),
                        fakeStoreProductsResponseDTO.getCategory()
                )
        ).toList();
    }


    //to be implemented
    public static List<FakeStoreProductsResponseDTO> toFakeStoreProductsResponseDTO(){
        return null;
    }
}
