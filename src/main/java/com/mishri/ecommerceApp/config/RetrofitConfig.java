package com.mishri.ecommerceApp.config;

import com.mishri.ecommerceApp.gateway.api.IFakeStoreApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Configuration
public class RetrofitConfig {

    @Value("${RETROFIT_BASE_URL}")
    private String RETROFIT_BASE_URL;

    @Bean
    public Retrofit retrofit(){
        return new Retrofit.Builder()
                .baseUrl(RETROFIT_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    @Bean
    public IFakeStoreApi iFakeStoreApi(Retrofit retrofit) {
        return retrofit.create(IFakeStoreApi.class);
    }
}
