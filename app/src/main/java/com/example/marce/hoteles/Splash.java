package com.example.marce.hoteles;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by marce on 25/10/2017.
 */

public class Splash extends AppCompatActivity {
    private static int TIME = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        new Handler().postDelayed(new Runnable() {
            public void run() {
                // Cuando pasen los 2 segundos, pasamos a la actividad principal de la aplicación
                Intent intent = new Intent(Splash.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, TIME);
    }
}
