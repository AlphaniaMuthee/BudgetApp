package com.alphania.budgetjet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;

public class LoginActivity extends AppCompatActivity {
    @BindView(R.id.loginButton) Button mLoginButton;
    @BindView(R.id.setupTextView) TextView mSetupTextView;
    @BindView(R.id.loginTextView) TextView mLoginTextView;
    @BindView(R.id.passwordEditText) EditText mPasswordEditText;
    @BindView(R.id.nameEditText) EditText mNameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}