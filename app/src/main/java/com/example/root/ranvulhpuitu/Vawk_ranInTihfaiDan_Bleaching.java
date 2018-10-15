package com.example.root.ranvulhpuitu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import static com.example.root.ranvulhpuitu.MainActivity.mediaPlayerBack;
import static com.example.root.ranvulhpuitu.MainActivity.sound;

public class Vawk_ranInTihfaiDan_Bleaching extends AppCompatActivity {

    @Override
    public void onBackPressed() {
        if(sound)
            mediaPlayerBack.start();
        super.onBackPressed();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vawk_ran_in_tihfai_dan__bleaching);
        getSupportActionBar().setTitle("Bleaching Powder");
        getSupportActionBar().setSubtitle(R.string.ranInTihFaiDan);
    }
}
