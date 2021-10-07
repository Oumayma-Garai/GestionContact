package com.example.gestioncontact;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
  Button btnval,btnquit;
  EditText ednom,edmp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnval =findViewById(R.id.btn_val_auth);
        btnquit=findViewById(R.id.btn_quit_auth);
        ednom=findViewById(R.id.et_nom_main);
        edmp=findViewById(R.id.et_password_main);
        btnquit.setOnClickListener(this);
        btnval.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view==btnquit){
            this.finish();
        }
        if(view==btnval)
        {
            String nom =ednom.getText().toString();
            String password =edmp.getText().toString();
            if(nom.equals("issat") && password.equals("000")){
                Intent i =new Intent(this,Accueil.class );

                i.putExtra("user",nom) ;
                this.startActivity(i);
            }
        }
    }
}