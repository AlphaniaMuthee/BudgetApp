package com.alphania.budgetjet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SetupActivity extends AppCompatActivity implements View.OnClickListener{
    @BindView(R.id.setUpButton) Button mSetUpButton;
    @BindView(R.id.setUpTextView) TextView mSetUpTextView;
    @BindView(R.id.loginTextView) TextView mLoginTextView;
    @BindView(R.id.passwordEditText) EditText mPasswordEditText;
    @BindView(R.id.confirmPasswordEditText) EditText mConfirmPasswordEditText;
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
        String name = mNameEditText.getText().toString();
        String email = mEmailEditText.getText().toString();
        if (v == mSetUpButton) {
            if ( ( ( mNameEditText.getText().toString().trim().equals("")))|| ( ( mEmailEditText.getText().toString().trim().equals("")))){
                Toast.makeText(SetupActivity.this, "Input your name and email to proceed", Toast.LENGTH_LONG).show();
            } else {
                Intent intent = new Intent(SetupActivity.this, BudgetOptionsActivity.class);
                intent.putExtra("name", name);
                startActivity(intent);
            }
        }
    }
}
