package com.example.android_proje;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.view.MotionEvent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button btnsignin1, btnsignup1;
EditText username, password;

Vibrator vb;
Context con = this;
DBHelper DB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username1);
        password = findViewById(R.id.password1);
        btnsignin1 = findViewById(R.id.btnsignin1);
        btnsignup1 = findViewById(R.id.btnsignup1);
        DB = new DBHelper(this);
        vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        btnsignin1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vb.vibrate(500);



                String user = username.getText().toString();
                String pass = password.getText().toString();
                if (user.equals("") || pass.equals("")){
                    Toast.makeText(MainActivity.this, "Lütfen Boş ALanları Doldurunuz", Toast.LENGTH_SHORT).show();
                }
                else{
                    Boolean checkuserpass = DB.checkusernamepassword(user, pass);
                    if(checkuserpass == true){
                        Toast.makeText(MainActivity.this, "Giriş Başarılı", Toast.LENGTH_SHORT).show();
                        Intent gecis = new Intent(con, HomeActivity.class);
                        startActivity(gecis);
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Giriş Bilgileri Hatalı", Toast.LENGTH_SHORT).show();
                    }
                }


            }
        });

        btnsignup1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), kayitol.class);
                startActivity(intent);
                vb.vibrate(1000);
            }
        });
    }

}