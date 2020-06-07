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

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{
//    @BindView(R.id.loginButton) Button mLoginButton;
    @BindView(R.id.setupTextView) TextView mSetupTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        mSetupTextView.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        if (v == mSetupTextView){
            Intent intent = new Intent(LoginActivity.this, SetupActivity.class);
            startActivity(intent);
            finish();
        }
    }
}