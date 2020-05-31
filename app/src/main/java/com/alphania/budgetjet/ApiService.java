package com.alphania.budgetjet;

import okhttp3.*;

public class ApiService {
    public static void showItems(Callback callback){
        OkHttpClient client = new OkHttpClient.Builder().build();

        HttpUrl.Builder urlBuilder = HttpUrl.parse(Constants.BASE_URL).newBuilder();
        String url = urlBuilder.build().toString();

        Request request = new Request.Builder()
                .url(url)
                .header("Authorization", Constants.API_KEY)
                .build();
        Call call =  client.newCall(request);
        call.enqueue(callback);
    }
}
