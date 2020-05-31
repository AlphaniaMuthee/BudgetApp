package com.alphania.budgetjet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.io.IOException;

import okhttp3.*;

public class ItemsViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items_view);
    }
    private void getItems(){
        final ApiService apiService= new ApiService();
        apiService.showItems(new Callback){

            @Override
            public void onFaliure(Call call, IOException e){
                e.printStackTrace();
            }
            @Override
                    public void onResponse(Call call, Response response) throws IOException {
                try {
                    String jsonData = response.body().string();
                    Log.v(jsonData);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
