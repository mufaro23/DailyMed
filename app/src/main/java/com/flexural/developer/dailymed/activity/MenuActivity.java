package com.flexural.developer.dailymed.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;

import com.flexural.developer.dailymed.R;

public class MenuActivity extends AppCompatActivity {
    
    private CardView mButtonOrder, mButtonPost, mButtonWallet, mButtonTracking, mButtonProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        
        mButtonOrder = findViewById(R.id.button_orders);
        mButtonPost = findViewById(R.id.button_medicine);
        mButtonProfile = findViewById(R.id.button_profile);
        mButtonWallet = findViewById(R.id.button_wallet);
        mButtonTracking = findViewById(R.id.button_tracking);
        
        init();
        
    }

    private void init() {
        mButtonOrder.setOnClickListener(v -> {
            Intent intent = new Intent(this, OrdersActivity.class);
            startActivity(intent);

        });

        mButtonTracking.setOnClickListener(v -> {
            Intent intent = new Intent(this, TrackingActivity.class);
            startActivity(intent);
        });

        mButtonWallet.setOnClickListener(v -> {
            Intent intent = new Intent(this, WalletActivity.class);
            startActivity(intent);
        });

        mButtonProfile.setOnClickListener(v -> {
            Intent intent = new Intent(this, ProfileActivity.class);
            startActivity(intent);
        });

        mButtonPost.setOnClickListener(v -> {
            Intent intent = new Intent(this, PostActivity.class);
            startActivity(intent);
        });
    }
}
