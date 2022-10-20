package com.example.android_proje;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class benzin extends AppCompatActivity {
Context con = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_benzin);
        WebView vw = new WebView(con);
        WebSettings vs = vw.getSettings();
        vs.setBuiltInZoomControls(true);
        vs.getJavaScriptEnabled();
        vw.loadUrl("https://benzinmagazin.com/");
        setContentView(vw);
    }
}