package com.alphania.budgetjet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ShoppingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.Shopping_Details);
        setContentView(R.layout.activity_shopping);
    }
}
