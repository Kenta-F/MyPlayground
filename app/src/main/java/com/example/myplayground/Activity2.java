package com.example.myplayground;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity implements View.OnClickListener{

    private Button buttonUcsd, buttonGit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        buttonUcsd = (Button) findViewById(R.id.buttonUcsd);
        buttonUcsd.setOnClickListener(this);

        buttonGit = (Button) findViewById(R.id.buttonGit);
        buttonGit.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.buttonUcsd:
                Intent u;
                u = new Intent(this, UcsdActivity.class);
                startActivity(u);
                break;
            case R.id.buttonGit:
                Intent g;
                g = new Intent(this, GitActivity.class);
                startActivity(g);
                break;

        }

    }
}
