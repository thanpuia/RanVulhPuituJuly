package com.example.root.ranvulhpuitu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.mikhaellopez.circularimageview.CircularImageView;

import spencerstudios.com.bungeelib.Bungee;

import static com.example.root.ranvulhpuitu.MainActivity.mediaPlayerBack;
import static com.example.root.ranvulhpuitu.MainActivity.sound;

public class Vawk extends AppCompatActivity {

    ListView listView;
    CustomAdapter customAdapter;

    String[] vawkList;
    int[] vawkTitlePic;
    
    @Override
    public void onBackPressed() {
        if(sound)
            mediaPlayerBack.start();
        super.onBackPressed();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vawk);

        getSupportActionBar().setTitle(R.string.vawk);

        vawkList = new String[]{"Natna leh hri","Ran in tihfai dan","Hnimhring tûr neite"};
        vawkTitlePic = new int[]{R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher};


        listView = findViewById(R.id.list_item);
       //  arrayAdapter = new ArrayAdapter(this,R.layout.vawk_main_menu_list,vawkList);

        customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //
                switch(position){
                    case 0:startActivity(new Intent(Vawk.this, Vawk_natnaLehHri.class));
                        if(sound)
                            MainActivity.mediaPlayer.start();
                        Bungee.zoom(Vawk.this);  //fire the zoom animation
                        break;
                    case 1:startActivity(new Intent(Vawk.this, Vawk_ranInTihfaiDan.class));
                        if(sound)
                            MainActivity.mediaPlayer.start();
                        Bungee.zoom(Vawk.this);  //fire the zoom animation
                        break;
                    case 2:startActivity(new Intent(Vawk.this, Vawk_hnimhringTurNeite.class));
                        if(sound)
                            MainActivity.mediaPlayer.start();
                        Bungee.zoom(Vawk.this);  //fire the zoom animation
                        break;
                }
            }
        });
    }


    class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return vawkList.length;
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

            circularImageView.setImageResource(vawkTitlePic[position]);
            textView.setText(vawkList[position]);

            return convertView;
        }
    }
}
