package com.example.gestioncontact;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Affiche extends AppCompatActivity {
    ListView lv_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_affiche);
        lv_list = findViewById(R.id.list_view);
        MyAdapter ad = new MyAdapter(Affiche.this, Accueil.data);
        lv_list.setAdapter(ad);


    }
}