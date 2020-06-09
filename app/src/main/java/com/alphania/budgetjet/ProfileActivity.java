package com.alphania.budgetjet;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ProfileActivity extends AppCompatActivity  implements View.OnClickListener{
    @BindView(R.id.nameTextView) TextView mNameTextView;
    @BindView(R.id.emailTextView) TextView mEmailTextView;
    @BindView(R.id.idTextView) TextView mIdTextView;
    @BindView(R.id.deleteButton) Button mDeleteButton;

    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.profile);
        setContentView(R.layout.activity_profile);
        ButterKnife.bind(this);
        mDeleteButton.setOnClickListener(this);


        mAuth = FirebaseAuth.getInstance();
        mAuthListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();
                if (user != null) {
                    mNameTextView.setText(user.getDisplayName());
                    mEmailTextView.setText(user.getEmail());
                    mIdTextView.setText(user.getUid());

                } else {

                }
            }
        };
    }
    @Override
    public void onStart() {
        super.onStart();
        mAuth.addAuthStateListener(mAuthListener);
    }

    @Override
    public void onStop() {
        super.onStop();
        if (mAuthListener != null) {
            mAuth.removeAuthStateListener(mAuthListener);
        }
    }

    @Override
    public void onClick(View v) {
        if (v == mDeleteButton){
            Intent intent = new Intent(ProfileActivity.this, DeletionActivity.class);
            startActivity(intent);
        }
    }
}
