package com.example.android_proje;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class kayitol extends AppCompatActivity {
    EditText username, password, repassword;
    Button signup, signin;

    DBHelper DB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kayitol);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        repassword = findViewById(R.id.repassword);
        signin = findViewById(R.id.btnsignin);
        signup = findViewById(R.id.btnsignup);
        DB = new DBHelper(this);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = username.getText().toString();
                String pass = password.getText().toString();
                String repass = repassword.getText().toString();

                if (user.equals("") || pass.equals("") || repass.equals("")){
                    Toast.makeText(kayitol.this, "Lütfen Boş Alanları Doldurun", Toast.LENGTH_SHORT).show();
//                    Intent intent = new Intent(getApplicationContext(), haberlerView.class);
//                    startActivity(intent);
                }
                else{
                    if (pass.equals(repass)){
                        Boolean checkuser = DB.checkusername(user);
                        if (checkuser == false){
                            Boolean insert = DB.insertData(user, pass);
                            if (insert == true){
                                Toast.makeText(kayitol.this, "Kayıt Başarılı", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
                                startActivity(intent);
                            }
                            else{
                                Toast.makeText(kayitol.this, "Kayıt Başarısız", Toast.LENGTH_SHORT).show();
                            }
                        }
                        else{
                            Toast.makeText(kayitol.this, "Bu Kullanıcı Adı Kullanılmaktadır Lütfen Başka Bir Tane Seçiniz", Toast.LENGTH_SHORT).show();
                        }
                    }
                    else {
                        Toast.makeText(kayitol.this, "Şifreler Uyuşmuyor Lütfen Kontrol Edin", Toast.LENGTH_SHORT).show();
                    }

                }
            }

        });

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

    }

}