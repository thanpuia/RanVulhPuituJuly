package com.example.root.ranvulhpuitu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Switch;

import com.jsibbold.zoomage.ZoomageView;

public class img_vawk_hnimhringTurNei_ extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_img_vawk_hnimhring_tur_nei_);
        int [] hnimHringTurNeiPic  = new int[]{R.drawable.sava_mit,R.drawable.katchat,R.drawable.mutih,
                R.drawable.tawtawrawt_var,R.drawable.tawtawrawt_pawl,R.drawable.shillong,
                R.drawable.kanaan_par};

        ZoomageView zoomageView = findViewById(R.id.ZoomvawkHnimHringTurNei);
        Intent intent = getIntent();
        String position  = intent.getStringExtra("position");
        Log.i("TAGG",""+position);
        int newPos = Integer.parseInt(position);

        zoomageView.setImageResource(hnimHringTurNeiPic[newPos]);

    }
}
