package com.example.root.ranvulhpuitu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jsibbold.zoomage.ZoomageView;

public class img_pullorum extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_img_pullorum);

        ZoomageView zoomageView = findViewById(R.id.zoom);

        Intent intent = getIntent(); // gets the previously created intent
        String value = intent.getStringExtra("value");

        if(value.equals("one"))
            zoomageView.setImageResource(R.drawable.pullorum1_big);
        else if(value.equals("two"))
            zoomageView.setImageResource(R.drawable.pullorum2_big);

    }
}
