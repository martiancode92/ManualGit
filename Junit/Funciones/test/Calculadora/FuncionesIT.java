/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USUARIO
 */
public class FuncionesIT {
    

    @Test
    public void testSumar() {
        System.out.println("sumar");
        int a = 0;
        int b = 0;
        Funciones instance = new Funciones();
        int expResult = 0;
        int result = instance.sumar(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of restar method, of class Funciones.
     */
    @Test
    public void testRestar() {
        System.out.println("restar");
        int a = 5;
        int b = 2;
        Funciones instance = new Funciones();
        int expResult = 7;
        int result = instance.restar(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of dividir method, of class Funciones.
     */
    @Test
    public void testDividir() {
        System.out.println("dividir");
        int a = 6;
        int b = 3;
        Funciones instance = new Funciones();
        int expResult = 2;
        int result = instance.dividir(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of multiplicar method, of class Funciones.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        int a = 5;
        int b = 2;
        Funciones instance = new Funciones();
        int expResult = 10;
        int result = instance.multiplicar(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
