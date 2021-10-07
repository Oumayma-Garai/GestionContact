package com.example.gestioncontact;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.apache.http.conn.ssl.StrictHostnameVerifier;


public class Ajout extends AppCompatActivity implements View.OnClickListener {

    EditText cnom,cprenom,cnumero ;
    Button btnAjouter , btnQuitter ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajout);
        cnom=findViewById(R.id.et_nom_ajout);
        cprenom=findViewById(R.id.et_prenom_ajout);
        cnumero=findViewById(R.id.et_numero_ajout);
        btnAjouter =findViewById(R.id.btn_val_ajout);
        btnAjouter.setOnClickListener(this);





    }

    @Override
    public void onClick(View view) {
        if(view==btnAjouter){
            String nom =cnom.getText().toString();
            String prenom =cprenom.getText().toString();
            String numero =cnumero.getText().toString();
            Contact c =new Contact (nom,prenom,numero) ;
            Accueil.data.add(c);
        }
    }
}