package com.example.marce.hoteles;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.support.v7.app.AppCompatActivity;


/**
 * Created by marce on 25/10/2017.
 */

public class Acercade extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acercade);
    }

    protected void regresar(View view){
        Intent i = new Intent(this, MainActivity.class );
        startActivity(i);
        finish();
    }

}


