package com.example.android.celulares;

/**
 * Created by Android on 30/09/2017.
 */

public class Celular {
    private int marca;
    private int color;
    private int os;
    private int capacidad;
    private int precio;


    public Celular(int marca, int color, int os, int capacidad, int precio) {
        this.marca = marca;
        this.color = color;
        this.os = os;
        this.capacidad = capacidad;
        this.precio = precio;
    }

    public int getMarca() {
        return marca;
    }

    public void setMarca(int marca) {
        this.marca = marca;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getOs() {
        return os;
    }

    public void setOs(int os) {
        this.os = os;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void guardar(){
        Datos.agregarCelular(this);
    }
}
