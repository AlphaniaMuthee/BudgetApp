package com.alphania.budgetjet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewAnimator;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @BindView(R.id.startBudgetingButton) Button mStartBudgetingButton;
    @BindView(R.id.appNameTextView) TextView mAppNameTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mStartBudgetingButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == mStartBudgetingButton) {
            Intent intent = new Intent(MainActivity.this, BudgetOptionsActivity.class);
            startActivity(intent);
            //Toast.makeText(MainActivity.this,"Hello!", Toast.LENGTH_SHORT).show();
        }
    }
}
