package com.example.myplayground;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ProgressBar;

import java.util.Timer;
import java.util.TimerTask;

public class Activity4 extends AppCompatActivity {
    private ProgressBar progressBar;
    private int count=0;
    private Timer timer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        progressBar=findViewById(R.id.progressBar);
        timer=new Timer();
        TimerTask timerTask= new TimerTask() {
            @Override
            public void run() {
                count++;
                progressBar.setProgress(count);
                if(count==100){
                    timer.cancel();
                }
            }
        };
        timer.schedule(timerTask, 0, 10);

    }
}
