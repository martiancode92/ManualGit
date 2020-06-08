/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej.pkg4junit;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author AdriánHernando
 */
@RunWith (Parameterized.class)
public class EmpleadoTest {//class
    
    String tipoEmpleado;
    float ventaMes;
    float horasExtras;
    float sBruto;
    float sNeto;

    public EmpleadoTest(String tipoEmpleado, float ventaMes, float horasExtras, float sBruto, float sNeto) {
        this.tipoEmpleado = tipoEmpleado;
        this.ventaMes = ventaMes;
        this.horasExtras = horasExtras;
        this.sBruto = sBruto;
        this.sNeto = sNeto;
    }

    @Parameters
    public static Collection <Object[]> parametrizados() {
        return Arrays.asList(new Object[][] {
            {"Vendedor",1200f,10f,1000f,800f},
            {"Encargado",1500f,20f,1800f,1600f}
        });
    }
    
    @Test
    public void testCalculoBrutoYNetoParametrizadas() {
        Empleado instance = new Empleado();
        float result = instance.calculoSalarioBruto(tipoEmpleado, ventaMes, horasExtras);
        assertEquals(sBruto, result, 0.0);
        float result2 = instance.calculoSalarioNeto(sBruto);
        assertEquals("Resultado erroneo", result2, sNeto, 0.01);
    }    
    
    @Test
    public void testCalculoSalarioBruto() {
        System.out.println("----Test salario bruto----");
        String tipoEmpleado = "Vendedor";
        float ventaMes = 100F;
        float horasExtras = 10F;
        Empleado instance = new Empleado();
        float expResult = 1000F;
        float result = instance.calculoSalarioBruto(tipoEmpleado, ventaMes, horasExtras);
        assertEquals(expResult, result, 0.0);//lo que tiene que dar | lo que ha dado | y la precision(0 exacto).
    }

    @Test
    public void testCalculoSalarioNeto() {
        System.out.println("----Test salario neto----");
        float salarioBruto = 1200F;
        Empleado instance = new Empleado();
        float expResult = 1008F;
        float result = instance.calculoSalarioNeto(salarioBruto);
        assertEquals(expResult, result, 0.01);
    }
    
    @Test
    public void testCalculoBrutoYNeto() {
        System.out.println("----Test salario bruto y neto----");
        String tipoEmpleado = "Vendedor";
        float ventaMes = 100F;
        float horasExtras = 10F;
        Empleado instance = new Empleado();
        float expResult = 1000F;
        float expResult2 = 840F;
        float result = instance.calculoSalarioBruto(tipoEmpleado, ventaMes, horasExtras);
        assertEquals(expResult, result, 0.0);
        float result2 = instance.calculoSalarioNeto(result);
        assertEquals(result2, expResult2, 0.01);
    }    
    
    
}//class
