package com.example.root.ranvulhpuitu;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.Toolbar;

import java.util.Random;

import spencerstudios.com.bungeelib.Bungee;

public class MainActivity extends AppCompatActivity {

    public static MediaPlayer mediaPlayer;
    public static MediaPlayer mediaPlayerSent;
    public static MediaPlayer mediaPlayerBack;

    public static boolean sound = false;
    public static SharedPreferences sharedPreferences;

    //Toolbar myToolbar=null;
    LinearLayout banner;
    int i=0;
    Random rand = new Random();
    public void bannerClick(View view) {
        if(sound)
            mediaPlayer.start();

        int [] anim = new int[]{R.anim.diagonal_right_enter,R.anim.zoom_enter,R.anim.card_enter,R.anim.fade_enter,R.anim.shrink_enter,
                R.anim.windmill_enter,R.anim.slide_up_enter,
                R.anim.fade_enter,R.anim.spin_enter,R.anim.slide_in_left,R.anim.swipe_left_enter,R.anim.split_enter,
                R.anim.zoom_enter,R.anim.in_out_enter};

        int newRand = rand.nextInt(14);
        Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),anim[newRand]);
        banner.startAnimation(animation);
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

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);

        switch (item.getItemId()) {
            case R.id.soundOn:
           //     myToolbar.setOverflowIcon(ContextCompat.getDrawable(getApplicationContext(),R.mipmap.volume_on));
                sound = true;
                mediaPlayer.start();
                soundMode(sound);
                return true;
            case R.id.soundOff:
            //    myToolbar.setOverflowIcon(ContextCompat.getDrawable(getApplicationContext(),R.mipmap.volume_off));
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

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer = MediaPlayer.create(this,R.raw.sound1);
        mediaPlayerSent = MediaPlayer.create(this,R.raw.sent);
        mediaPlayerBack = MediaPlayer.create(this,R.raw.backward);

     //   myToolbar = new Toolbar(getApplicationContext());
        banner = findViewById(R.id.banner);
      //  myToolbar.setOverflowIcon(ContextCompat.getDrawable(getApplicationContext(),R.mipmap.volume_off));
      //  Drawable drawable = ContextCompat.getDrawable(getApplicationContext(),R.mipmap.volume_off);
       // myToolbar.setOverflowIcon(drawable);
        sharedPreferences = this.getSharedPreferences("com.example.root.ranvulhpuitu",Context.MODE_PRIVATE);
        Boolean mode = sharedPreferences.getBoolean("soundMode", false);

        if(mode){
            //myToolbar.setOverflowIcon(ContextCompat.getDrawable(getApplicationContext(),R.mipmap.volume_on));
            sound = true;
        }

        else if (!mode) {
           // myToolbar.setOverflowIcon(ContextCompat.getDrawable(getApplicationContext(),R.mipmap.volume_off));
            sound = false;
        }



    }
}
