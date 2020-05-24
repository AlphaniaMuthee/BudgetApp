package com.alphania.budgetjet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SetupActivity extends AppCompatActivity implements View.OnClickListener{
    @BindView(R.id.setUpButton) Button mSetUpButton;
    @BindView(R.id.setUpTextView) TextView mSetUpTextView;
    @BindView(R.id.nameEditText) EditText mNameEditText;
    @BindView(R.id.emailEditText) EditText mEmailEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup);
        ButterKnife.bind(this);

        mSetUpButton.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        if (v == mSetUpButton) {
            Intent intent = new Intent(SetupActivity.this, BudgetOptionsActivity.class);
            startActivity(intent);
        }
    }
}
