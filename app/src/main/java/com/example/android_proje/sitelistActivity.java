package com.example.android_proje;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class sitelistActivity extends AppCompatActivity {
Button btn1, btn2, btn3, btn4, btn5, btn6, btn7;
Context con = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sitelist);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel("bildirim", "OTO", NotificationManager.IMPORTANCE_DEFAULT);
            NotificationManager manager = getSystemService(NotificationManager.class);
            manager.createNotificationChannel(channel);
        }
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gecis = new Intent(con, otopark.class);
                startActivity(gecis);
                NotificationCompat.Builder builder = new NotificationCompat.Builder(con, "bildirim");
                builder.setContentTitle("otopark.com");
                builder.setContentText("Otopark.com Açılıyor");
                builder.setSmallIcon(R.drawable.ic_launcher_background);
                builder.setAutoCancel(true);

                NotificationManagerCompat managerCompat = NotificationManagerCompat.from(con);
                managerCompat.notify(1, builder.build());
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gecis = new Intent(con, otohaber.class);
                startActivity(gecis);
                NotificationCompat.Builder builder = new NotificationCompat.Builder(con, "bildirim");
                builder.setContentTitle("otohaber.com");
                builder.setContentText("Otohaber.com Açılıyor");
                builder.setSmallIcon(R.drawable.ic_launcher_background);
                builder.setAutoCancel(true);

                NotificationManagerCompat managerCompat = NotificationManagerCompat.from(con);
                managerCompat.notify(1, builder.build());
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gecis = new Intent(con, mobil1.class);
                startActivity(gecis);
                NotificationCompat.Builder builder = new NotificationCompat.Builder(con, "bildirim");
                builder.setContentTitle("mobil1.com");
                builder.setContentText("Mobil1.com Açılıyor");
                builder.setSmallIcon(R.drawable.ic_launcher_background);
                builder.setAutoCancel(true);

                NotificationManagerCompat managerCompat = NotificationManagerCompat.from(con);
                managerCompat.notify(1, builder.build());
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gecis = new Intent(con,otomobilcom.class);
                startActivity(gecis);
                NotificationCompat.Builder builder = new NotificationCompat.Builder(con, "bildirim");
                builder.setContentTitle("otomobilhaber.com");
                builder.setContentText("Otomobilhaber.com Açılıyor");
                builder.setSmallIcon(R.drawable.ic_launcher_background);
                builder.setAutoCancel(true);

                NotificationManagerCompat managerCompat = NotificationManagerCompat.from(con);
                managerCompat.notify(1, builder.build());
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gecis = new Intent(con, haberlerView.class);
                startActivity(gecis);
                NotificationCompat.Builder builder = new NotificationCompat.Builder(con, "bildirim");
                builder.setContentTitle("otohaberler.com");
                builder.setContentText("Otohaberler.com Açılıyor");
                builder.setSmallIcon(R.drawable.ic_launcher_background);
                builder.setAutoCancel(true);

                NotificationManagerCompat managerCompat = NotificationManagerCompat.from(con);
                managerCompat.notify(1, builder.build());
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gecis = new Intent(con, benzin.class);
                startActivity(gecis);
                NotificationCompat.Builder builder = new NotificationCompat.Builder(con, "bildirim");
                builder.setContentTitle("benzintv.com");
                builder.setContentText("Benzintv.com Açılıyor");
                builder.setSmallIcon(R.drawable.ic_launcher_background);
                builder.setAutoCancel(true);

                NotificationManagerCompat managerCompat = NotificationManagerCompat.from(con);
                managerCompat.notify(1, builder.build());
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gecis = new Intent(con, carviser.class);
                startActivity(gecis);
                NotificationCompat.Builder builder = new NotificationCompat.Builder(con, "bildirim");
                builder.setContentTitle("carviser.com");
                builder.setContentText("Carviser.com Açılıyor");
                builder.setSmallIcon(R.drawable.ic_launcher_background);
                builder.setAutoCancel(true);

                NotificationManagerCompat managerCompat = NotificationManagerCompat.from(con);
                managerCompat.notify(1, builder.build());
            }
        });
    }
}