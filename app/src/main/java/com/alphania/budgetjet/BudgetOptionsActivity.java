package com.alphania.budgetjet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import butterknife.BindView;

public class BudgetOptionsActivity extends AppCompatActivity {
    @BindView(R.id.optionsTextView) TextView mOptionTextView;
    @BindView(R.id.optionsListView) ListView mOptionsListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_budget_options);
    }
}
