package com.alphania.budgetjet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ViewBudgetAction extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.View_Budgets);
        setContentView(R.layout.activity_view_budget_action);
    }
}
