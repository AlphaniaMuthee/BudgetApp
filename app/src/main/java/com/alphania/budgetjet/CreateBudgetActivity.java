package com.alphania.budgetjet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class CreateBudgetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.Create_Budget);
        setContentView(R.layout.activity_create_budget);
    }
}
