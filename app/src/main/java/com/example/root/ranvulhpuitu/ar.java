package com.example.root.ranvulhpuitu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.root.ranvulhpuitu.R;
import com.mikhaellopez.circularimageview.CircularImageView;

import spencerstudios.com.bungeelib.Bungee;

import static com.example.root.ranvulhpuitu.MainActivity.mediaPlayerBack;
import static com.example.root.ranvulhpuitu.MainActivity.sound;

public class ar extends AppCompatActivity {
    ListView lv;
    Integer[] images;
    int[] text;
    //public ImageView imageView;
    public CircularImageView circularImageView;
    public TextView textView;

     @Override
    public void onBackPressed() {
        if(sound)
            mediaPlayerBack.start();
        super.onBackPressed();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ar);

        getSupportActionBar().setTitle(R.string.ar);
        //images = new Integer[]{R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,};
        images = new Integer[]{R.drawable.markel,R.drawable.ibd,R.drawable.egg_drop,R.drawable.fowl_cholera1,
                R.drawable.fowl_pox1, R.drawable.newcastle,
                R.drawable.ib1,R.drawable.avian1,R.drawable.ic1,
                R.drawable.il1, R.drawable.pullorum1,R.drawable.botulism,
                R.drawable.staphy};

        text = new int[]{R.string.mareks_disease,R.string.ibd,R.string.egg_drop_syndrome,
                R.string.fowl_cholera,R.string.fowl_pox,R.string.newcastle_disease,R.string.infectious_bronchitis,
                R.string.avian_influenza,R.string.infectious_coryza,R.string.infectious_laryngotracheitis,R.string.pullorum,
                R.string.botulism,R.string.staphylococcus};
        CustomAdapter customAdapter = new CustomAdapter();
        lv = findViewById(R.id.list_item);

        lv.setAdapter(customAdapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                //Toast.makeText(getApplication(),""+position,Toast.LENGTH_SHORT).show();
                switch (position){
                    case 0:
                        if(sound)
                            MainActivity.mediaPlayer.start();
                        startActivity(new Intent(ar.this, Ar_MarekDisease.class));
                        Bungee.zoom(ar.this);  //fire the zoom animation
                        ;break;
                    case 1:
                        if(sound)
                            MainActivity.mediaPlayer.start();
                        startActivity(new Intent(ar.this, Ar_InfectiousBursalDiseases.class));
                        Bungee.zoom(ar.this);  //fire the zoom animation
                        ;break;
                    case 2:
                        if(sound)
                            MainActivity.mediaPlayer.start();
                        startActivity(new Intent(ar.this, Ar_EggDropSyndrome.class));
                        Bungee.zoom(ar.this);  //fire the zoom animation
                        ;break;
                    case 3:
                        startActivity(new Intent(ar.this, Ar_FowlCholera.class));
                        Bungee.zoom(ar.this);  //fire the zoom animation
                        ;break;
                    case 4:
                        if(sound)
                            MainActivity.mediaPlayer.start();
                        startActivity(new Intent(ar.this, Ar_FowlPox.class));
                        Bungee.zoom(ar.this);  //fire the zoom animation
                        ;break;
                    case 5:
                        if(sound)
                            MainActivity.mediaPlayer.start();
                        startActivity(new Intent(ar.this, Ar_NewcastleDisease.class));
                        Bungee.zoom(ar.this);  //fire the zoom animation
                        ;break;
                    case 6:
                        if(sound)
                            MainActivity.mediaPlayer.start();
                        startActivity(new Intent(ar.this, Ar_InfectiousBronchitis.class));
                         Bungee.zoom(ar.this);  //fire the zoom animation
                         ;break;
                    case 7:
                        if(sound)
                            MainActivity.mediaPlayer.start();
                        startActivity(new Intent(ar.this, Ar_AvianInfluenza.class));
                        Bungee.zoom(ar.this);  //fire the zoom animation
                        ;break;
                    case 8:
                        if(sound)
                            MainActivity.mediaPlayer.start();
                        startActivity(new Intent(ar.this, Ar_InfectiousCoryza.class));
                        Bungee.zoom(ar.this);  //fire the zoom animation
                        ;break;
                    case 9:
                        if(sound)
                            MainActivity.mediaPlayer.start();
                        startActivity(new Intent(ar.this, Ar_InfectiousLaryngotracheitis.class));
                        Bungee.zoom(ar.this);  //fire the zoom animation
                        ;break;
                    case 10:
                        if(sound)
                            MainActivity.mediaPlayer.start();
                        startActivity(new Intent(ar.this, Ar_Pullorum.class));
                        Bungee.zoom(ar.this);  //fire the zoom animation
                        ;break;
                    case 11:
                        if(sound)
                            MainActivity.mediaPlayer.start();
                        startActivity(new Intent(ar.this, Ar_Botulism.class));
                        Bungee.zoom(ar.this);  //fire the zoom animation
                        ;break;
                    case 12:
                        if(sound)
                            MainActivity.mediaPlayer.start();
                        startActivity(new Intent(ar.this, Ar_Staphylococcus.class));
                        Bungee.zoom(ar.this);  //fire the zoom animation
                        ;break;
                }
            }
        });

    }

class CustomAdapter extends BaseAdapter {

    @Override
    public int getCount() {
        return images.length;
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

       // imageView = convertView.findViewById(R.id.customRow_ImageView);
        circularImageView = convertView.findViewById(R.id.customRow_ImageView);
        textView = convertView.findViewById(R.id.customRow_TextView);

        circularImageView.setImageResource(images[position]);
        textView.setText(text[position]);

        circularImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(ar.this, img_ar_zoomGrouping.class).putExtra("position",String.valueOf(position)));

                if(sound)
                    MainActivity.mediaPlayer.start();
                Bungee.zoom(ar.this);  //fire the zoom animation
            }
        });
        return convertView;
    }
}
}