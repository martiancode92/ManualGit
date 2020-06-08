/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer2evarecu;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USUARIO
 */
public class EmpleadoIT {
    
    public EmpleadoIT() {
    }
    


    /**
     * Test of calcularSueldoBruto method, of class Empleado.
     */
    @Test
    public void testCalcularSueldoBruto() {
        System.out.println("calcularSueldoBruto");
        Empleado instance = null;
        float expResult = 0.0F;
        float result = instance.calcularSueldoBruto();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularSalarioNeto method, of class Empleado.
     */
    @Test
    public void testCalcularSalarioNeto() {
        System.out.println("calcularSalarioNeto");
        Empleado instance = null;
        float expResult = 0.0F;
        float result = instance.calcularSalarioNeto();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
