package com.example.android_proje;

import android.content.Context;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class haberlerView extends AppCompatActivity {

    Context con = this;
    @Override
    protected void onCreate (Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        WebView vw = new WebView(con);
        WebSettings vs = vw.getSettings();
        vs.setBuiltInZoomControls(true);
        vs.getJavaScriptEnabled();
        vw.loadUrl("https://otohaberler.somee.com/Haber/Index/");
        setContentView(vw);
    }

}
