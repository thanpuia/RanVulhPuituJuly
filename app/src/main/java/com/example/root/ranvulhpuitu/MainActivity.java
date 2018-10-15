package com.example.root.ranvulhpuitu;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Handler;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

import spencerstudios.com.bungeelib.Bungee;

public class MainActivity extends AppCompatActivity {

    public static MediaPlayer mediaPlayer;
    public static MediaPlayer mediaPlayerSent;
    public static MediaPlayer mediaPlayerBack;

    public static boolean sound = false;
    public static SharedPreferences sharedPreferences;

    LinearLayout banner;
    int i=0;

    public void bannerClick(View view) {

        i++;
        if ((i%2)==0)
            banner.animate().scaleY(2f).scaleX(2f).setDuration(250);
        else
            banner.animate().rotation(340f).setDuration(455);

        //  banner.animate().scaleX(2f).scaleY(2f).setDuration(250);
       // banner.animate().scaleX(2f).scaleY(2f).setDuration(250);

    }

    public void arButtonClick(View view) {
       if(sound)
        mediaPlayer.start();

        //  Intent intent = new Intent(this,ar.class);
      //  startActivity(intent);
        startActivity(new Intent(this, ar.class));
        Bungee.zoom(this);  //fire the zoom animation+
    }

    public void vawkButtonClick(View view) {
        if(sound)
            mediaPlayer.start();

        startActivity(new Intent(this, Vawk.class));
        Bungee.zoom(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater =getMenuInflater();
        menuInflater.inflate(R.menu.main_menu,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);

        switch (item.getItemId()) {
            case R.id.soundOn:
                sound = true;
                mediaPlayer.start();
                soundMode(sound);
                return true;
            case R.id.soundOff:
                sound = false;
                soundMode(sound);
                return true;
            default:
                return  false;
        }

    }

    public void soundMode(Boolean mode){
        sharedPreferences.edit().putBoolean("soundMode", mode).apply();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer = MediaPlayer.create(this,R.raw.sound1);
        mediaPlayerSent = MediaPlayer.create(this,R.raw.sent);
        mediaPlayerBack = MediaPlayer.create(this,R.raw.backward);

        banner = findViewById(R.id.banner);

        sharedPreferences = this.getSharedPreferences("com.example.root.ranvulhpuitu",Context.MODE_PRIVATE);
        Boolean mode = sharedPreferences.getBoolean("soundMode", false);

        if(mode)
            sound = true;
        else if (!mode)
            sound = false;


    }
}