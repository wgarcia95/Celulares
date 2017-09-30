package com.example.android.celulares;

import java.util.ArrayList;

/**
 * Created by Android on 30/09/2017.
 */

public class Methods {

    public static int contar_apple_negro(ArrayList<Celular> celulares){
        int count = 0;
        for (int i = 0; i < celulares.size(); i++) {
            if (celulares.get(i).getMarca()== 2 && celulares.get(i).getColor() == 0){
                count = count +1;
            }
        }
        return count;
    }

    public static double precio_promedio (ArrayList<Celular> celulares){
        int suma = 0;
        int count = 0;

        for (int i = 0; i < celulares.size(); i++) {
            if (celulares.get(i).getMarca()== 3){
                suma = suma + celulares.get(i).getPrecio();
                count = count + 1;
            }
        }
        double promedio;
        if (count!=0) {
            promedio = suma / count;
        }else{
            promedio = 0;
        }
        return promedio;
    }

}
