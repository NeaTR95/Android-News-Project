package com.example.android_proje;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class otopark extends AppCompatActivity {
Context con = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otopark);
        WebView vw = new WebView(con);
        WebSettings vs = vw.getSettings();
        vs.setBuiltInZoomControls(true);
        vs.getJavaScriptEnabled();
        vw.loadUrl("https://otopark.com/");
        setContentView(vw);
    }
}