package com.alphania.budgetjet;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DeletionActivity extends AppCompatActivity implements View.OnClickListener{
    public static final String TAG = DeletionActivity.class.getSimpleName();
    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;
    @BindView(R.id.cancelButton) Button mCancelButton;
    @BindView(R.id.proceedButton) Button mProceedButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deletion);
        ButterKnife.bind(this);

        mAuth = FirebaseAuth.getInstance();
        createAuthStateListener();

        mProceedButton.setOnClickListener(this);
        mCancelButton.setOnClickListener(this);
    }

    private void createAuthStateListener() {
        mAuthListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                final FirebaseUser user = firebaseAuth.getCurrentUser();
                if (user != null){
                    Intent intent = new Intent(DeletionActivity.this, SetupActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(intent);
                    finish();
                }
            }
        };
    }
    private void deleteUser() {
    FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
    final FirebaseUser currentUser = firebaseAuth.getCurrentUser();
    currentUser.delete().addOnCompleteListener(new OnCompleteListener<Void>() {
        @Override
        public void onComplete(@NonNull Task<Void> task) {
            if (task.isSuccessful()) {
                Log.d(TAG,"OK! Works fine!");
                startActivity(new Intent(DeletionActivity.this, SetupActivity.class));
                finish();
            } else {
                Log.w(TAG,"Something is wrong!");
            }
        }
    });
}

    @Override
    public void onClick(View v) {
        if( v == mCancelButton){
            Intent intent = new Intent(DeletionActivity.this, ProfileActivity.class);
            startActivity(intent);
        }
        if (v == mProceedButton){
            deleteUser();
        }
    }
}