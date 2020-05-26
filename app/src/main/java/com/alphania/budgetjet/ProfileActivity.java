package com.alphania.budgetjet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ProfileActivity extends AppCompatActivity {
    @BindView(R.id.profileTextView) TextView mProfileTextView;
    //@BindView(R.id.profileListView) ListView mProfileListView;
    //@BindView(R.id.nameListView) ListView mNameListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String email = intent.getStringExtra("email");
        //mProfileTextView.setText("Profile");
        mProfileTextView.setText(name);
        mProfileTextView.setText(email);
    }
}
