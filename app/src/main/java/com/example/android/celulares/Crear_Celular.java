package com.example.android.celulares;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Crear_Celular extends AppCompatActivity {
    private Spinner cajamarca, cajacolor, cajaos, cajacapacidad;
    private EditText cajaprecio;
    private String marcas[], colores[], sisop[], capacidad[];
    private Resources res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_celular);
        cajamarca = (Spinner)findViewById(R.id.spnMarca);
        cajacolor = (Spinner)findViewById(R.id.spnColor);
        cajaos = (Spinner)findViewById(R.id.spnOs);
        cajacapacidad = (Spinner)findViewById(R.id.spnCapacidad);
        cajaprecio = (EditText)findViewById(R.id.txtPrecio);
        res = this.getResources();

        marcas = res.getStringArray(R.array.marcas);
        ArrayAdapter<String> adapter_marca = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, marcas);

        colores = res.getStringArray(R.array.colores);
        ArrayAdapter<String> adapter_colores = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, colores);

        sisop = res.getStringArray(R.array.sisop);
        ArrayAdapter<String> adapter_os = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, sisop);

        capacidad = res.getStringArray(R.array.capacidades);
        ArrayAdapter<String> adapter_capacidad = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, capacidad);

        cajamarca.setAdapter(adapter_marca);
        cajacolor.setAdapter(adapter_colores);
        cajaos.setAdapter(adapter_os);
        cajacapacidad.setAdapter(adapter_capacidad);
    }

    public void crear(View v){
        int marca, color, os, capacidad, precio;
        if(validar()) {
            marca = cajamarca.getSelectedItemPosition();
            color = cajacolor.getSelectedItemPosition();
            os = cajacolor.getSelectedItemPosition();
            capacidad = cajacapacidad.getSelectedItemPosition();
            precio = Integer.parseInt(cajaprecio.getText().toString());

            Celular c = new Celular(marca, color, os, capacidad, precio);
            c.guardar();

            Toast.makeText(this, res.getString(R.string.agregado), Toast.LENGTH_SHORT).show();
            Limpiar(v);
        }
    }

    public void Limpiar(View v){
        limpiar();
    }

    private void limpiar(){
        cajamarca.setSelection(0);
        cajacolor.setSelection(0);
        cajaos.setSelection(0);
        cajacapacidad.setSelection(0);
        cajaprecio.setText("");
        cajaprecio.requestFocus();
    }

    private boolean validar(){
        if(cajaprecio.getText().toString().isEmpty() || Integer.parseInt(cajaprecio.getText().toString()) == 0){
            cajaprecio.setError(res.getString(R.string.error_precio));
            cajaprecio.requestFocus();
            return false;
        }
        return true;
    }
}
