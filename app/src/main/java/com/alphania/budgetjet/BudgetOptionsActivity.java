package com.alphania.budgetjet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class BudgetOptionsActivity extends AppCompatActivity {
    @BindView(R.id.optionsListView) ListView mOptionsListView;

    private String[] options = new String[] {"View Budgets", "Create Budget", "Shopping Details", "Items", "Profile"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_budget_options);

        ButterKnife.bind(this);

        OptionsArrayAdapter adapter = new OptionsArrayAdapter(this, android.R.layout.simple_list_item_1, options);
        mOptionsListView.setAdapter(adapter);

        mOptionsListView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String option = ((TextView)view).getText().toString();
                if (position == 0) {
                    Intent intent = new Intent(BudgetOptionsActivity.this, ViewBudgetAction.class);
                    startActivity(intent);
                } else if (position == 1) {
                    Intent intent = new Intent(BudgetOptionsActivity.this, CreateBudgetActivity.class);
                    startActivity(intent);
                } else if (position == 2) {
                    Intent intent = new Intent(BudgetOptionsActivity.this, ShoppingActivity.class);
                    startActivity(intent);
                } else if (position == 3) {
                    Intent intent = new Intent(BudgetOptionsActivity.this, ItemsViewActivity.class);
                    startActivity(intent);
                } else {
                    Intent intent = new Intent(BudgetOptionsActivity.this, ProfileActivity.class);
                    startActivity(intent);
                }
            }
        });

        //Intent intent= getIntent();

    }
}
