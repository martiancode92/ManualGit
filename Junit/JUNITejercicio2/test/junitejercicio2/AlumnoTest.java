/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junitejercicio2;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author dam
 */
@RunWith (Parameterized.class)
public class AlumnoTest {
    
    float nota1;
    float nota2;
    float nota3;
    float media;
    boolean beca;

    public AlumnoTest(float nota1, float nota2, float nota3, float media, boolean beca) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.media = media;
        this.beca = beca;
    }
    
    @Parameters
    public static Collection <Object[]> datos(){
        return Arrays.asList(new Object[][]{
            {10,2,2,4.6f,false},
            {7,2,3,4,false}
        });
    }

    @Test
    public void testCalculoMedia() {
        System.out.println("calculoMedia");
        Alumno instance = new Alumno(7f,2f,3f);
        float expResult = 4F;
        float result = instance.calculoMedia();
        assertEquals(expResult, result, 0.0); //0.0 es la precision de los decimales del resultado
    }
    
    @Test
    public void testCalculoMedia2() {
        System.out.println("calculoMedia");
        Alumno instance = new Alumno(nota1,nota2,nota3);
        float result = instance.calculoMedia();
        assertEquals("", media, result, 0.1); //0.0 es la precision de los decimales del resultado
    }

    @Test
    public void testDerechoBeca() {
        System.out.println("derechoBeca");
        Alumno instance = new Alumno(nota1,nota2,nota3);
        //boolean expResult = false;
        boolean result = instance.derechoBeca();
        assertEquals(beca, result);
    }
    
}
