package com.example.root.ranvulhpuitu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.jsibbold.zoomage.ZoomageView;

public class img_ar_zoomGrouping extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_img_ar_zoom_grouping);

        Integer[] images = new Integer[]{R.drawable.markel,R.drawable.ibd,R.drawable.egg_drop,R.drawable.fowl_cholera1,
                R.drawable.fowl_pox1, R.drawable.newcastle,
                R.drawable.ib1,R.drawable.avian1,R.drawable.ic1,
                R.drawable.il1, R.drawable.pullorum1,R.drawable.botulism,
                R.drawable.staphy};

        ZoomageView zoomageView = findViewById(R.id.arZoom);
        Intent intent = getIntent();
        String position  = intent.getStringExtra("position");
        Log.i("TAGG",""+position);
        int newPos = Integer.parseInt(position);

        zoomageView.setImageResource(images[newPos]);
    }
}
