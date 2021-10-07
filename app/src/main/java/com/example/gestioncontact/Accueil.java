package com.example.gestioncontact;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class Accueil extends AppCompatActivity implements View.OnClickListener {

    Button btnAjout , btnAffiche;
    TextView tv_user ;
    public static ArrayList <Contact> data =new ArrayList <Contact>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);
        tv_user=findViewById(R.id.tv_user);

        btnAjout =findViewById(R.id.btn_ajout_accueil);
        btnAffiche =findViewById(R.id.btn_affiche_accueil);
        btnAjout.setOnClickListener(this);
        btnAffiche.setOnClickListener(this);
        btnAffiche=findViewById(R.id.btn_affiche_accueil);
        Intent x = this.getIntent();
        Bundle b = x.getExtras();
        String a = b.getString("user");
        tv_user.setText("Acceuil de "+a);

    }

    @Override
    public void onClick(View view) {
        if (view == btnAjout) {
            Intent i = new Intent(this, Ajout.class);
            this.startActivity(i);
        }
        if(view == btnAffiche){
            Intent i = new Intent(this,Affiche.class);
            this.startActivity(i);
        }
    }

}