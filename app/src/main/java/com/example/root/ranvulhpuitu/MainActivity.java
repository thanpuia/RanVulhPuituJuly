package com.example.root.ranvulhpuitu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import spencerstudios.com.bungeelib.Bungee;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void arButtonClick(View view) {
      //  Intent intent = new Intent(this,ar.class);
      //  startActivity(intent);
        startActivity(new Intent(this, ar.class));
        Bungee.zoom(this);  //fire the zoom animation+
    }

    public void vawkButtonClick(View view) {
        startActivity(new Intent(this, Vawk.class));
        Bungee.zoom(this);
    }
}
