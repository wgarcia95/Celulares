package com.example.android.celulares;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class Listado extends AppCompatActivity {
    private TableLayout tabla;
    private ArrayList<Celular> celulares;
    private String marcas[], colores[], sisop[], capacidades[];
    private Resources res;
    private String flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado);
        tabla = (TableLayout)findViewById(R.id.tblCelulares);
        try {
            flag = getIntent().getExtras().getString("flag");
            celulares = Datos.get_samsung();
        }catch (Exception e){
            celulares = Datos.getCelulares();
        }
        res = this.getResources();
        marcas = res.getStringArray(R.array.marcas);
        colores = res.getStringArray(R.array.colores);
        sisop = res.getStringArray(R.array.sisop);
        capacidades = res.getStringArray(R.array.capacidades);

        for (int i = 0; i < celulares.size(); i++) {
            TableRow fila = new TableRow(this);
            TextView c1 = new TextView(this);
            TextView c2 = new TextView(this);
            TextView c3 = new TextView(this);
            TextView c4 = new TextView(this);
            TextView c5 = new TextView(this);

            Celular c = celulares.get(i);

            c1.setText(""+(i+1));
            c2.setText(marcas[c.getMarca()]);
            c3.setText(colores[c.getColor()]);
            c4.setText(capacidades[c.getCapacidad()]);
            c5.setText(""+c.getPrecio());

            fila.addView(c1);
            fila.addView(c2);
            fila.addView(c3);
            fila.addView(c4);
            fila.addView(c5);
            tabla.addView(fila);
        }
    }
}
