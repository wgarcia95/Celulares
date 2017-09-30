package com.example.android.celulares;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Principal extends AppCompatActivity {
    private ListView lstOpciones;
    private Resources res;
    private String opc[];
    private Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        lstOpciones = (ListView)findViewById(R.id.lstOpciones);
        res = this.getResources();

        opc = res.getStringArray(R.array.opciones);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, opc);
        lstOpciones.setAdapter(adapter);

        lstOpciones.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l) {
                switch (pos){
                    case 0:
                        i = new Intent(Principal.this, Crear_Celular.class);
                        startActivity(i);
                        break;
                    case 1:
                        i = new Intent(Principal.this, Listado.class);
                        startActivity(i);
                        break;
                    case 2:
                        celulares_apple(view);
                    case 3:
                         precios_nokia(view);
                    case 4:
                        Bundle b = new Bundle();
                        b.putBoolean("flag", true);
                        i = new Intent(Principal.this, Listado.class);
                        i.putExtra("flag", b);
                        startActivity(i);
                        break;
                }
            }
        });
    }

    public void celulares_apple(View v){
        int count = Methods.contar_apple_negro(Datos.getCelulares());
        Toast.makeText(this, ("Celulares Apple negro: "+count), Toast.LENGTH_SHORT).show();
    }

    public void precios_nokia(View v){
        double count = Methods.precio_promedio(Datos.getCelulares());
        Toast.makeText(this, "$"+String.format("%.0f", count), Toast.LENGTH_SHORT).show();
    }
}
