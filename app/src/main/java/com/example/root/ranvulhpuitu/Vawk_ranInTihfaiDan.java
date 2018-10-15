package com.example.root.ranvulhpuitu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.mikhaellopez.circularimageview.CircularImageView;

import spencerstudios.com.bungeelib.Bungee;

import static com.example.root.ranvulhpuitu.MainActivity.mediaPlayerBack;
import static com.example.root.ranvulhpuitu.MainActivity.sound;

public class Vawk_ranInTihfaiDan extends AppCompatActivity {

    ListView listView;
    //ArrayAdapter arrayAdapter;
    CustomAdapter customAdapter;
    String[] vawkRanInList;
    int[] vawkRanInPic;

    @Override
    public void onBackPressed() {
        if(sound)
            mediaPlayerBack.start();
        super.onBackPressed();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vawk_ran_in_tihfai_dan);
        getSupportActionBar().setTitle(R.string.ranInTihFaiDan);

        vawkRanInList = new String[]{"Soda","Chinai","Tuisen","Phenol","Sodium Hydroxide","Bleaching Powder"};
        vawkRanInPic = new int[]{R.drawable.soda2,R.drawable.chinai2,R.drawable.tuisen,
                                 R.drawable.phenol1,R.drawable.sodium1,R.drawable.bleaching_powder};

        listView = findViewById(R.id.vawkRanInListView);
      //  arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,vawkRanInList);
        customAdapter = new CustomAdapter();

        listView.setAdapter(customAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //
                switch(position){
                    case 0:startActivity(new Intent(Vawk_ranInTihfaiDan.this, Vawk_ranInTihfaiDan_Soda.class));
                        if(sound)
                            MainActivity.mediaPlayer.start();
                        Bungee.zoom(Vawk_ranInTihfaiDan.this);  //fire the zoom animation
                        break;
                    case 1:startActivity(new Intent(Vawk_ranInTihfaiDan.this, Vawk_ranInTihfaiDan_Chinai.class));
                        if(sound)
                            MainActivity.mediaPlayer.start();
                        Bungee.zoom(Vawk_ranInTihfaiDan.this);  //fire the zoom animation
                        break;
                    case 2:startActivity(new Intent(Vawk_ranInTihfaiDan.this, Vawk_ranInTihfaiDan_Tuisen.class));
                        if(sound)
                            MainActivity.mediaPlayer.start();
                        Bungee.zoom(Vawk_ranInTihfaiDan.this);  //fire the zoom animation
                        break;
                    case 3:startActivity(new Intent(Vawk_ranInTihfaiDan.this, Vawk_ranInTihfaiDan_Phenol.class));
                        if(sound)
                            MainActivity.mediaPlayer.start();
                        Bungee.zoom(Vawk_ranInTihfaiDan.this);  //fire the zoom animation
                        break;
                    case 4:startActivity(new Intent(Vawk_ranInTihfaiDan.this, Vawk_ranInTihfaiDan_Sodium.class));
                        if(sound)
                            MainActivity.mediaPlayer.start();
                        Bungee.zoom(Vawk_ranInTihfaiDan.this);  //fire the zoom animation
                        break;
                    case 5:startActivity(new Intent(Vawk_ranInTihfaiDan.this, Vawk_ranInTihfaiDan_Bleaching.class));
                        if(sound)
                            MainActivity.mediaPlayer.start();
                        Bungee.zoom(Vawk_ranInTihfaiDan.this);  //fire the zoom animation
                        break;
                }
            }
        });
    }
    class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return vawkRanInList.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {

            convertView = getLayoutInflater().inflate(R.layout.custom_row, null);

            CircularImageView circularImageView;
            TextView textView;
            // imageView = convertView.findViewById(R.id.customRow_ImageView);
            circularImageView = convertView.findViewById(R.id.customRow_ImageView);
            textView = convertView.findViewById(R.id.customRow_TextView);

            circularImageView.setImageResource(vawkRanInPic[position]);
            textView.setText(vawkRanInList[position]);

            circularImageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                  //  Toast.makeText(getApplicationContext(),position,Toast.LENGTH_SHORT).show();
                    Log.i("TAGGGG",""+position);
                    switch(position){
                        case 0:startActivity(new Intent(Vawk_ranInTihfaiDan.this, img_vawk_ranin_soda.class));
                            if(sound)
                                MainActivity.mediaPlayer.start();
                            Bungee.zoom(Vawk_ranInTihfaiDan.this);  //fire the zoom animation
                            break;
                        case 1:startActivity(new Intent(Vawk_ranInTihfaiDan.this, img_vawk_ranin_chinai.class));
                            if(sound)
                                MainActivity.mediaPlayer.start();
                            Bungee.zoom(Vawk_ranInTihfaiDan.this);  //fire the zoom animation
                            break;
                        case 2:startActivity(new Intent(Vawk_ranInTihfaiDan.this, img_vawk_ranin_tuisen.class));
                            if(sound)
                                MainActivity.mediaPlayer.start();
                            Bungee.zoom(Vawk_ranInTihfaiDan.this);  //fire the zoom animation
                            break;
                        case 3:startActivity(new Intent(Vawk_ranInTihfaiDan.this, img_vawk_ranin_phenol.class));
                            if(sound)
                                MainActivity.mediaPlayer.start();
                            Bungee.zoom(Vawk_ranInTihfaiDan.this);  //fire the zoom animation
                            break;
                        case 4:startActivity(new Intent(Vawk_ranInTihfaiDan.this, img_vawk_ranin_sodium.class));
                            if(sound)
                                MainActivity.mediaPlayer.start();
                            Bungee.zoom(Vawk_ranInTihfaiDan.this);  //fire the zoom animation
                            break;
                        case 5:startActivity(new Intent(Vawk_ranInTihfaiDan.this, img_vawk_ranin_bleaching.class));
                            if(sound)
                                MainActivity.mediaPlayer.start();
                            Bungee.zoom(Vawk_ranInTihfaiDan.this);  //fire the zoom animation
                            break;
                    }
                }
            });


            return convertView;
        }
    }

}
