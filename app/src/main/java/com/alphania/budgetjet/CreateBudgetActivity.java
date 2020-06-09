package com.alphania.budgetjet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;

import static java.lang.Integer.parseInt;

public class CreateBudgetActivity extends AppCompatActivity implements View.OnClickListener {
    @BindView(R.id.price) EditText mPrice;
    @BindView(R.id.number) EditText mNumber;
    @BindView(R.id.item) EditText mItem;
    @BindView(R.id.createBudget) Button mCreateBudget;
    @BindView(R.id.floatingActionButton) FloatingActionButton mFloatingActionButton;

    private DatabaseReference mItemsReference;
    private DatabaseReference mNumbersReference;
    private DatabaseReference mPricesReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mItemsReference = FirebaseDatabase
                .getInstance()
                .getReference()
                .child(Constants.FIREBASE_CHILD_ITEM);
        super.onCreate(savedInstanceState);
        setTitle(R.string.Create_Budget);
        setContentView(R.layout.activity_create_budget);
        ButterKnife.bind(this);

        mCreateBudget.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == mCreateBudget){
            String item = mItem.getText().toString();
            int number = parseInt(mNumber.getText().toString());
            int price = parseInt(mPrice.getText().toString());
            saveItemToFirebase(item, number, price);
            Intent intent = new Intent(CreateBudgetActivity.this, ViewBudgetAction.class);
            intent.putExtra("item", item);
            startActivity(intent);
       }
    }
    public void saveItemToFirebase(String item, int number, int price) {
        Map<String, Object> mHashmap = new HashMap<>();
        mHashmap.put("Item Name", item);
        mHashmap.put("Number of Items", number);
        mHashmap.put("Price", price);
        mItemsReference.push().setValue(mHashmap);
    }

}
