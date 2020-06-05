package com.alphania.budgetjet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.*;
import retrofit2.Retrofit;

public class ItemsViewActivity extends AppCompatActivity {
    public static final String TAG = ItemsViewActivity.class.getSimpleName();
    @BindView(R.id.itemListView) ListView mItemListView;
    @BindView(R.id.errorTextView) TextView mErrorTextView;
    @BindView(R.id.progressBar) ProgressBar mProgressBar;
    @BindView(R.id.recyclerView) RecyclerView mRecyclerView;

    private ItemsListAdapter mAdapter;
    public List<Product> items = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.Items);
        setContentView(R.layout.activity_items_view);
        ButterKnife.bind(this);

        Intent intent= getIntent();

        Api client = ApiClient.getClient();
        retrofit2.Call<ApiProductSearchResponse> call = client.getItems();
        call.enqueue(new retrofit2.Callback<ApiProductSearchResponse>(){

            @Override
            public void onResponse(retrofit2.Call<ApiProductSearchResponse> call, retrofit2.Response<ApiProductSearchResponse> response) {
                hideProgressBar();

                if (response.isSuccessful()) {
                    List<Product> itemsList = response.body().getProducts();
                    String [] items = new String[itemsList.size()];
                    for (int i = 0; i < items.length; i++){
                        items[i] = itemsList.get(i).getBrand();
                    }
                    ArrayAdapter adapter = new ArrayAdapter(ItemsViewActivity.this, android.R.layout.simple_list_item_1, items);
                    mItemListView.setAdapter(adapter);

                    showItems();
             } else {
                    showUnsuccessfulMessage();
                }
            }

            @Override
            public void onFailure(retrofit2.Call<ApiProductSearchResponse> call, Throwable t) {
                hideProgressBar();
                showFailureMessage();
            }
        });
    }

    private void showItems() {
        mRecyclerView.setVisibility(View.VISIBLE);
    }

    private void showFailureMessage() {
        mErrorTextView.setText("Check your internet connection!");
        mErrorTextView.setVisibility(View.VISIBLE);
    }

    private void hideProgressBar() {
        mProgressBar.setVisibility(View.GONE);
    }

    private void showUnsuccessfulMessage() {
        mErrorTextView.setText("Couldn't fetch results. Please try again later");
        mErrorTextView.setVisibility(View.VISIBLE);
    }
}
