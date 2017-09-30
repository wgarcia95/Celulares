package com.example.android.celulares;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void numero_celulares_apple_correcto() throws Exception {
        Celular c1 = new Celular(2,0, 1, 3, 1950000);
        Celular c2 = new Celular(2,0, 1, 4, 2100000);
        Celular c3 = new Celular(2,0, 1, 2, 1400000);
        Celular c4 = new Celular(1,2, 1, 1, 800000);

        Celular Cel[] = {c1,c2,c3,c4};
        ArrayList<Celular> celulares = new ArrayList<>(Arrays.asList(Cel));
        assertEquals(3, Methods.contar_apple_negro(celulares));
    }

    @Test
    public void numero_celulares_apple_incorrecto() throws Exception {
        Celular c1 = new Celular(2,0, 1, 3, 1950000);
        Celular c2 = new Celular(2,0, 1, 4, 2100000);
        Celular c3 = new Celular(2,0, 1, 2, 1400000);
        Celular c4 = new Celular(1,2, 1, 1, 800000);

        Celular Cel[] = {c1,c2,c3,c4};
        ArrayList<Celular> celulares = new ArrayList<>(Arrays.asList(Cel));
        assertNotEquals(1, Methods.contar_apple_negro(celulares));
    }

    @Test
    public void precio_promedio_huawei_correcto() throws Exception {
        Celular c1 = new Celular(3,0, 1, 3, 800000);
        Celular c2 = new Celular(3,0, 1, 4, 1100000);
        Celular c3 = new Celular(2,0, 1, 2, 1400000);
        Celular c4 = new Celular(1,2, 1, 1, 800000);
        Celular Cel[] = {c1,c2};
        ArrayList<Celular> celulares = new ArrayList<>(Arrays.asList(Cel));
        assertEquals(950000, Methods.precio_promedio(celulares), 0);
    }

    @Test
    public void precio_promedio_huawei_incorrecto() throws Exception {
        Celular c1 = new Celular(3,0, 1, 3, 800000);
        Celular c2 = new Celular(3,0, 1, 4, 1100000);
        Celular c3 = new Celular(2,0, 1, 2, 1400000);
        Celular c4 = new Celular(1,2, 1, 1, 800000);
        Celular Cel[] = {c1,c2};
        ArrayList<Celular> celulares = new ArrayList<>(Arrays.asList(Cel));
        assertNotEquals(460000, Methods.precio_promedio(celulares), 0);
    }

    @Test
    public void precio_promedio_huawei_0_correcto() throws Exception {
        Celular c1 = new Celular(3,0, 1, 3, 0);
        Celular c2 = new Celular(3,0, 1, 4, 0);
        Celular c3 = new Celular(2,0, 1, 2, 1400000);
        Celular c4 = new Celular(1,2, 1, 1, 800000);
        Celular Cel[] = {c1,c2};
        ArrayList<Celular> celulares = new ArrayList<>(Arrays.asList(Cel));
        assertEquals(0, Methods.precio_promedio(celulares), 0);
    }

    @Test
    public void precio_promedio_huawei_0_incorrecto() throws Exception {
        Celular c1 = new Celular(3,0, 1, 3, 0);
        Celular c2 = new Celular(3,0, 1, 4, 0);
        Celular c3 = new Celular(2,0, 1, 2, 1400000);
        Celular c4 = new Celular(1,2, 1, 1, 800000);
        Celular Cel[] = {c1,c2};
        ArrayList<Celular> celulares = new ArrayList<>(Arrays.asList(Cel));
        assertNotEquals(10, Methods.precio_promedio(celulares), 0);
    }


}