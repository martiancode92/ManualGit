/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author 203p21
 */
@RunWith(Parameterized.class)
public class VueloTest {

    Vuelo vantes;
    Vuelo vdespues;
    boolean resultado;
    int nbilletes;
    int tipo;

    public VueloTest(Vuelo vantes, Vuelo vdespues, boolean resultado,
            int tipo,int nbilletes ) {
        this.vantes = vantes;
        this.vdespues = vdespues;
        this.resultado = resultado;
        this.nbilletes = nbilletes;
        this.tipo = tipo;
    }

   

    @Test
    public void testVentaBilletes() {
        System.out.println("ventaBilletes");
        int numBilletes = 2;
        int tipoPlaza = 1;
        Vuelo instance = new Vuelo(10, 2, 50,30);
        boolean resultado = instance.ventaBilletes(numBilletes, tipoPlaza);

        assertEquals("venta mal hecha", resultado, true);
        assertEquals("mal totales turista", instance.totTur, 10);
        assertEquals("mal ocupadas turista", instance.ocuTur, 4);
        assertEquals("mal totales turista", instance.totBus, 50);
        assertEquals("mal ocupadas turista", instance.ocuBus, 30);

    }

    @Parameters
    public static Collection<Object[]> datos() {
        return Arrays.asList(new Object[][]{
            {new Vuelo(10, 2, 50, 30), new Vuelo(10, 4, 50, 30), true, 1, 2},
            {new Vuelo(10, 2, 50, 30), new Vuelo(10, 2, 50, 30), false, 1, 200},
            {new Vuelo(10, 2, 50, 30), new Vuelo(10, 2, 50, 32), true, 2, 2},
            {new Vuelo(10, 2, 50, 30), new Vuelo(10, 2, 50, 30), false, 2, 200}
        });

    }

    @Test
    public void testVentaBilletesPara() {

        boolean resultado2 = vantes.ventaBilletes(nbilletes, tipo);
        assertEquals("venta mal hecha", resultado, resultado2);
        assertEquals("mal totales turista", vantes.totTur, vdespues.totTur);
        assertEquals("mal ocupadas turista", vantes.ocuTur, vdespues.ocuTur);
        assertEquals("mal totalesbussines", vantes.totBus, vdespues.totBus);
        assertEquals("mal ocupadas bussnines", vantes.ocuBus, vdespues.ocuBus);

    }

}
