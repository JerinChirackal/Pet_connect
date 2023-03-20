package com.rishav.instaclone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DonateDash extends AppCompatActivity {
    CardView cardDonate;
    CardView cardReceive;
    CardView cardMyPin;
    CardView cardHistory;
    CardView cardAboutUs;
    CardView cardContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donatedash);
        cardDonate = findViewById(R.id.cardDonate);
        cardReceive = findViewById(R.id.cardReceive);
        cardMyPin = findViewById(R.id.cardMyPin);
        cardHistory = findViewById(R.id.cardHistory);
        cardAboutUs = findViewById(R.id.cardAboutus);
        cardContact = findViewById(R.id.cardContact);
        cardDonate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DonateDash.this,Donate.class));
            }
        });

        cardReceive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DonateDash.this,Receive.class));
            }
        });

        cardMyPin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DonateDash.this,MyPin.class));
            }
        });

        cardHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DonateDash.this,History.class));
            }
        });

        cardAboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DonateDash.this,AboutUs.class));
            }
        });

        cardContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DonateDash.this,Contact.class));
            }
        });
    }
}