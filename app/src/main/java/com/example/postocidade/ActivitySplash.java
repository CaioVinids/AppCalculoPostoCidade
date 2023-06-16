package com.example.postocidade;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class ActivitySplash extends AppCompatActivity {

    private static final int TEMPO = 3000; // EM MILESEGUNDOS
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        inicializarMainActivity();
    }

    private void inicializarMainActivity(){
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                finish();
                Intent MainActivity = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(MainActivity);
            }
        },TEMPO);
    }



}
