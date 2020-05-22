package com.alphania.budgetjet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class BudgetOptionsActivity extends AppCompatActivity {
    @BindView(R.id.optionsListView) ListView mOptionsListView;

    private String[] options = new String[] {"View Budgets", "Create Budget", "Shopping Details", "Items"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_budget_options);

        ButterKnife.bind(this);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, options);
        mOptionsListView.setAdapter(adapter);

        Intent intent= getIntent();

    }
}
