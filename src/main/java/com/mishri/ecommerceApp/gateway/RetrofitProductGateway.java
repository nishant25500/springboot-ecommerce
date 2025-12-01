//package com.mishri.ecommerceApp.gateway;
//
//import com.mishri.ecommerceApp.dto.FakeStoreProductsResponseDTO;
//import com.mishri.ecommerceApp.dto.ProductDTO;
//import com.mishri.ecommerceApp.gateway.api.IFakeStoreApi;
//import com.mishri.ecommerceApp.mappers.GetAllProductsMapper;
//import org.springframework.stereotype.Component;
//
//import java.io.IOException;
//import java.util.List;
//
//@Component("fakeStoreRetrofitGateway")
//public class RetrofitProductGateway implements IProductGateWay{
//    private final IFakeStoreApi fakeStoreApi;
//
//    public RetrofitProductGateway(IFakeStoreApi _fakeStoreApi){
//        this.fakeStoreApi = _fakeStoreApi;
//    }
//    @Override
//    public List<ProductDTO> getAllProducts() throws IOException {
//        List<FakeStoreProductsResponseDTO> response = this.fakeStoreApi.getAllProducts().execute().body();
//
//        if(response == null){
//            throw new IOException("Failed to fetch products");
//        }
//
//        return GetAllProductsMapper.toProductDTO(response);
//    }
//}
