package com.example.root.ranvulhpuitu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jsibbold.zoomage.ZoomageView;

public class img_botulism extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_img_botulism);

        ZoomageView zoomageView = findViewById(R.id.zoom);

       // Intent intent = getIntent(); // gets the previously created intent

            zoomageView.setImageResource(R.drawable.botulism_big);
    }
}
