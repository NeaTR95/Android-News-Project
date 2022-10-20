package com.example.android_proje;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
Button aracbtn, sitebtn, btnrtn;
RatingBar rtn;
TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        aracbtn = findViewById(R.id.aracbtn);
        sitebtn = findViewById(R.id.sitebtn);
        btnrtn = findViewById(R.id.btnrtn);
        rtn = findViewById(R.id.rtn);
        txt = findViewById(R.id.txt);

        aracbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        sitebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), sitelistActivity.class);
                startActivity(intent);
            }
        });
        btnrtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(HomeActivity.this, String.valueOf(rtn.getRating()),Toast.LENGTH_LONG).show();
            }
        });

        rtn.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                txt.setText( "Puanınız: "+String.valueOf(v));
            }
        });
    }
}