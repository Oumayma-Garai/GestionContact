package com.example.gestioncontact;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {
    Context con ;
    ArrayList<Contact> data ;

    public MyAdapter(Context con, ArrayList<Contact> data) {
        this.con = con;
        this.data = data;
    }

    @Override


    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inf = LayoutInflater.from(con);
        View v = inf.inflate(R.layout.viewcontact,null);
        TextView tv_nom=v.findViewById(R.id.tv_nom_view);
        TextView tv_prenom=v.findViewById(R.id.tv_numero_view);
        TextView tv_numero=v.findViewById(R.id.tv_prenom_view);
        tv_nom.setText(data.get(i).nom);
        tv_prenom.setText(data.get(i).prenom);
        tv_numero.setText(data.get(i).numero);
        return v;




    }
}
