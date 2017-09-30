package com.example.android.celulares;

import java.util.ArrayList;

/**
 * Created by Android on 30/09/2017.
 */

public class Datos {

    private static ArrayList<Celular> celulares = new ArrayList<>();

    public static void agregarCelular(Celular c){
        celulares.add(c);
    }

    public static ArrayList<Celular> getCelulares(){
        return celulares;
    }

    public static ArrayList<Celular> get_samsung(){
        ArrayList<Celular> samsung = new ArrayList<>();
        for (int i = 0; i < celulares.size(); i++) {
            if (celulares.get(i).getMarca()==5 && celulares.get(i).getColor() == 0 && celulares.get(i).getOs() == 0){
                samsung.add(celulares.get(i));
            }
        }
        return samsung;
    }
}
