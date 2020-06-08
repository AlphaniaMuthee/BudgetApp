package com.alphania.budgetjet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CreateBudgetActivity extends AppCompatActivity {
    @BindView(R.id.prediction) EditText mPrediction;
    @BindView(R.id.item) EditText mItem;
    @BindView(R.id.floatingActionButton) FloatingActionButton mFloatingActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.Create_Budget);
        setContentView(R.layout.activity_create_budget);
        ButterKnife.bind(this);
    }
}
