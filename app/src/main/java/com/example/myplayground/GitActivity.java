package com.example.myplayground;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class GitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_git);

        WebView ucsdView = (WebView) findViewById(R.id.webViewGit);
        ucsdView.loadUrl("https://www.gatech.edu/");
    }
}
