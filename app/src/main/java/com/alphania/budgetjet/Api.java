package com.alphania.budgetjet;

import retrofit2.http.GET;

public interface Api {
    @GET("/products")
    retrofit2.Call<ApiProductSearchResponse> getItems();

}
