package com.rishav.instaclone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class Veterinarian extends AppCompatActivity {
    Button searchPatBtn;
    Button myDoctors;
    Button BtnRequst;
    Button profile;
    Button appointment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veterinarian);
        appointment = findViewById(R.id.appointement2);
        appointment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k = new Intent(Veterinarian.this, PatientAppointementsActivity.class);
                startActivity(k);
            }
        });

        searchPatBtn = (Button)findViewById(R.id.searchBtn);
        searchPatBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Veterinarian.this, SearchPatActivity.class);
                startActivity(k);
            }
        });


        myDoctors = (Button)findViewById(R.id.myDoctors);
        myDoctors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Veterinarian.this, MyDoctorsAvtivity.class);
                startActivity(k);
            }
        });
        BtnRequst = findViewById(R.id.btnRequst);
        BtnRequst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), DossierMedical.class);
                intent.putExtra("patient_email",FirebaseAuth.getInstance().getCurrentUser().getEmail().toString());
                startActivity(intent);
            }
        });

        profile = findViewById(R.id.profile);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Veterinarian.this, ProfilePatientActivity.class);
                startActivity(k);
            }
        });
    }
}