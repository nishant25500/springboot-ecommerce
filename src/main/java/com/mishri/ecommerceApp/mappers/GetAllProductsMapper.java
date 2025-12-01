//package com.mishri.ecommerceApp.mappers;
//
//import com.mishri.ecommerceApp.dto.FakeStoreProductsResponseDTO;
//import com.mishri.ecommerceApp.dto.ProductDTO;
//
//import java.util.List;
//
//public class GetAllProductsMapper {
//
//    public static List<ProductDTO> toProductDTO(List<FakeStoreProductsResponseDTO> dto){
//        return dto.stream().map(
//                fakeStoreProductsResponseDTO -> new ProductDTO(
//                        fakeStoreProductsResponseDTO.getId(),
//                        fakeStoreProductsResponseDTO.getTitle(),
//                        fakeStoreProductsResponseDTO.getImage(),
//                        fakeStoreProductsResponseDTO.getPrice(),
//
//                )
//        ).toList();
//    }
//
//
//    //to be implemented
//    public static List<FakeStoreProductsResponseDTO> toFakeStoreProductsResponseDTO(){
//        return null;
//    }
//}
