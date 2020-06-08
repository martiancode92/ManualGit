/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut6_ejercico_3_bidemen;

import java.io.IOException;

/**
 *
 * @author USUARIO
 */
public class UT6_Ejercico_3_Bidemen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
      
        Empresa e= new Empresa();
        e.cargarEmpleado();
        e.cargarVentas();
    }
    
}
