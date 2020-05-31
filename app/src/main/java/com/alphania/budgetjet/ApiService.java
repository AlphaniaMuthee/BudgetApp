package com.alphania.budgetjet;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

import java.io.IOException;
import java.util.ArrayList;

import okhttp3.*;

public class ApiService {
    public static void showItems(Callback callback) {
        OkHttpClient client = new OkHttpClient.Builder().build();

        HttpUrl.Builder urlBuilder = HttpUrl.parse(Constants.BASE_URL).newBuilder();
        String url = urlBuilder.build().toString();

        Request request = new Request.Builder()
                .url(url)
                .header("Authorization", Constants.API_KEY)
                .build();
        Call call = client.newCall(request);
        call.enqueue(callback);
    }

    public ArrayList<Item> processResults(Response response) {
        ArrayList<Item> items = new ArrayList<>();
        try {
            String xmlData = response.body().string();
            JSONObject ApiJSON = XML.toJSONObject(xmlData);
            JSONArray productsJSON = ApiJSON.getJSONArray("products");
            if (response.isSuccessful()) {
                for (int i = 0; i < productsJSON.length(); i++) {
                    JSONObject itemJSON = productsJSON.getJSONObject(i);
                    String brand = itemJSON.getString("brand");
                    String category = itemJSON.getString("category");
                    String priceRanges = itemJSON.getString("priceRanges");
                    String imageUrl = itemJSON.getString("image_url");
                    String caption = itemJSON.getString("caption");
                    String sellers = itemJSON.getString("sellers");

                    Item item = new Item(brand, category, priceRanges, imageUrl, caption, sellers);
                    items.add(item);
                }

            }
        } catch (
                IOException e) {
            e.printStackTrace();
        } catch (
                JSONException e) {
            e.printStackTrace();
        }
        return items;
    }
}
