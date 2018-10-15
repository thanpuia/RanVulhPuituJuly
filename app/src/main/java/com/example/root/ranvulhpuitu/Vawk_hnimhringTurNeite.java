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

public class Vawk_hnimhringTurNeite extends AppCompatActivity {

    ListView listView;
    CustomAdapter customAdapter;
    String[] hnimHringTurNeiList;
    int[] hnimHringTurNeiPic;

    @Override
    public void onBackPressed() {
        if(sound)
            mediaPlayerBack.start();
        super.onBackPressed();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vawk_hnimhring_tur_neite);

        getSupportActionBar().setTitle(R.string.hnimhringTurNei);


        hnimHringTurNeiList = new String[]{"Sava Mit","Katchat","Mutih",
                "Tawtawrawt Par (A Var)","Tawtawrawt Par (A Pawl)","Shillong Tlangsam","Kanaan Par"};
        hnimHringTurNeiPic = new int[]{R.mipmap.ic_launcher_round,R.mipmap.ic_launcher_round,R.mipmap.ic_launcher_round,
                                     R.mipmap.ic_launcher_round,R.mipmap.ic_launcher_round,R.mipmap.ic_launcher_round,
                R.mipmap.ic_launcher_round};

        listView= findViewById(R.id.vawkHnimHringTurNeiList);
        customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //
               // Toast.makeText(getApplication(),""+position,Toast.LENGTH_SHORT).show();
                switch(position){
                    case 0:startActivity(new Intent(Vawk_hnimhringTurNeite.this, Vawk_hnimHringTurNei_savaMit.class));
                        if(sound)
                            MainActivity.mediaPlayer.start();
                        Bungee.zoom(Vawk_hnimhringTurNeite.this);  //fire the zoom animation
                        break;
                    case 1:startActivity(new Intent(Vawk_hnimhringTurNeite.this, Vawk_hnimHringTurNei_Katchat.class));
                        if(sound)
                            MainActivity.mediaPlayer.start();
                        Bungee.zoom(Vawk_hnimhringTurNeite.this);  //fire the zoom animation
                        break;
                    case 2:startActivity(new Intent(Vawk_hnimhringTurNeite.this, Vawk_hnimHringTurNei_Mutih.class));
                        if(sound)
                            MainActivity.mediaPlayer.start();
                        Bungee.zoom(Vawk_hnimhringTurNeite.this);  //fire the zoom animation
                        break;
                    case 3:startActivity(new Intent(Vawk_hnimhringTurNeite.this, Vawk_hnimHringTurNei_TawtawrawtVar.class));
                        if(sound)
                            MainActivity.mediaPlayer.start();
                        Bungee.zoom(Vawk_hnimhringTurNeite.this);  //fire the zoom animation
                        break;
                    case 4:startActivity(new Intent(Vawk_hnimhringTurNeite.this, Vawk_hnimHringTurNei_Vawk_hnimHringTurNei_TawtawrawtPawl.class));
                        if(sound)
                            MainActivity.mediaPlayer.start();
                        Bungee.zoom(Vawk_hnimhringTurNeite.this);  //fire the zoom animation
                        break;
                    case 5:startActivity(new Intent(Vawk_hnimhringTurNeite.this, Vawk_hnimHringTurNei_Shillong.class));
                        if(sound)
                            MainActivity.mediaPlayer.start();
                        Bungee.zoom(Vawk_hnimhringTurNeite.this);  //fire the zoom animation
                        break;
                    case 6:startActivity(new Intent(Vawk_hnimhringTurNeite.this, Vawk_hnimHringTurNei_kanaan.class));
                        if(sound)
                            MainActivity.mediaPlayer.start();
                        Bungee.zoom(Vawk_hnimhringTurNeite.this);  //fire the zoom animation
                        break;
                }
            }
        });
    }

    class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return hnimHringTurNeiList.length;
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
        public View getView(int position, View convertView, ViewGroup parent) {

            convertView = getLayoutInflater().inflate(R.layout.custom_row, null);

            CircularImageView circularImageView;
            TextView textView;
            // imageView = convertView.findViewById(R.id.customRow_ImageView);
            circularImageView = convertView.findViewById(R.id.customRow_ImageView);
            textView = convertView.findViewById(R.id.customRow_TextView);

            circularImageView.setImageResource(hnimHringTurNeiPic[position]);

            textView.setText(hnimHringTurNeiList[position]);
Log.i("tag",""+hnimHringTurNeiList[position]);

            return convertView;
        }
    }
}
