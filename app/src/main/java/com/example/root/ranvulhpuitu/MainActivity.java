package com.example.root.ranvulhpuitu;

import android.content.ClipData;
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
import android.widget.Toast;
import android.widget.Toolbar;

import java.util.Random;

import spencerstudios.com.bungeelib.Bungee;

import static com.example.root.ranvulhpuitu.R.id.menu_item_add;

public class MainActivity extends AppCompatActivity {

    public static MediaPlayer mediaPlayer;
    public static MediaPlayer mediaPlayerSent;
    public static MediaPlayer mediaPlayerBack;

  //  Menu menu;
   // ClipData.Item item1;
    MenuItem menuItem;

    public static boolean sound = true;
    public static SharedPreferences sharedPreferences;

    //Toolbar myToolbar=null;
    LinearLayout banner;
    int i=0;
    Random rand = new Random();
    public void bannerClick(View view) {

        try{

            if(sound)
                mediaPlayer.start();

            int [] anim = new int[]{R.anim.diagonal_right_enter,R.anim.zoom_enter,R.anim.card_enter,R.anim.fade_enter,R.anim.shrink_enter,
                    R.anim.windmill_enter,R.anim.slide_up_enter,
                    R.anim.fade_enter,R.anim.spin_enter,R.anim.slide_in_left,R.anim.swipe_left_enter,R.anim.split_enter,
                    R.anim.zoom_enter,R.anim.in_out_enter};

            int newRand = rand.nextInt(14);
            Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),anim[newRand]);
            banner.startAnimation(animation);

        }catch (Exception e){}
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
        // item1 = findViewById(R.id.menu_item_add);
       // menuItem.setIcon(getResources().getDrawable(R.drawable.soundoff_last));

        return super.onCreateOptionsMenu(menu);
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);

                return  true;


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
        //  itemmm.setIcon(R.drawable.soundoff_last);

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

    public void soundClick(MenuItem item) {
        if(sound){
            sound = false;
            soundMode(sound);
            // menuItem.getItem((0).setIcon(ContextCompat.getDrawable(getApplicationContext(), R.drawable.soundoff_last)));
            Toast.makeText(this,"Sound Off",Toast.LENGTH_LONG).show();
            //
          //  menuItem.setIcon(R.drawable.soundoff_last);
        }else {
            sound = true;
            mediaPlayer.start();
            soundMode(sound);
            //menuItem=(MenuItem)findViewById(R.id.menu_item_add);
            Toast.makeText(this,"Sound On",Toast.LENGTH_LONG).show();
           // menuItem.setIcon(getResources().getDrawable(R.drawable.soundon_last));
            //  menuItem.setIcon(R.drawable.soundon_last);

        }


    }
}
