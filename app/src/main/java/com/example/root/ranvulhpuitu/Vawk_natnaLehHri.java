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
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.mikhaellopez.circularimageview.CircularImageView;

import java.util.Collections;

import spencerstudios.com.bungeelib.Bungee;

public class Vawk_natnaLehHri extends AppCompatActivity {


    ListView listView;
    //ArrayAdapter arrayAdapter;
    CustomAdapter customAdapter;
   // int[] vawkNatnaList;
    String[] vawkNatnaList;
    int[] vawkNatnaPic;
   public TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vawk_natna_leh_hri);

        getSupportActionBar().setTitle(R.string.natnaLehHri);

        vawkNatnaList = new String[]{"Vawk Pul Hri","PRRS","Vawk Phar","Sakawr Ek Hrik Natna","Rulhut","Vawkpui tlusawp"};
        vawkNatnaPic = new int[]{R.mipmap.ic_launcher_round,R.mipmap.ic_launcher_round,R.mipmap.ic_launcher_round,R.mipmap.ic_launcher_round,R.mipmap.ic_launcher_round,R.mipmap.ic_launcher_round};


        listView = findViewById(R.id.list_item);
     //   arrayAdapter = new ArrayAdapter(this,R.layout.vawk_main_menu_list,vawkNatnaList);
        customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //
                Toast.makeText(getApplication(),""+position,Toast.LENGTH_SHORT).show();
                switch(position){
                    case 0:startActivity(new Intent(Vawk_natnaLehHri.this, Vawk_natnaLehHri_VawkPulHri.class));
                        Bungee.zoom(Vawk_natnaLehHri.this);  //fire the zoom animation
                        break;
                    case 1:startActivity(new Intent(Vawk_natnaLehHri.this, Vawk_natnaLehHri_PRRS.class));
                        Bungee.zoom(Vawk_natnaLehHri.this);  //fire the zoom animation
                        break;
                    case 2:startActivity(new Intent(Vawk_natnaLehHri.this, Vawk_natnaLehHri_VawkPhar.class));
                        Bungee.zoom(Vawk_natnaLehHri.this);  //fire the zoom animation
                        break;
                    case 3:startActivity(new Intent(Vawk_natnaLehHri.this, Vawk_natnaLehHri_SakawrEkHrikNatna.class));
                        Bungee.zoom(Vawk_natnaLehHri.this);  //fire the zoom animation
                        break;
                    case 4:startActivity(new Intent(Vawk_natnaLehHri.this, Vawk_natnaLehHri_Rulhut.class));
                        Bungee.zoom(Vawk_natnaLehHri.this);  //fire the zoom animation
                        break;
                    case 5:startActivity(new Intent(Vawk_natnaLehHri.this, Vawk_natnaLehHri_VawkpuiTlusawp.class));
                        Bungee.zoom(Vawk_natnaLehHri.this);  //fire the zoom animation
                        break;
                }

            }
        });
    }

    class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return vawkNatnaList.length;
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

            circularImageView.setImageResource(vawkNatnaPic[position]);
            textView.setText(vawkNatnaList[position]);


            return convertView;
        }
    }
}
