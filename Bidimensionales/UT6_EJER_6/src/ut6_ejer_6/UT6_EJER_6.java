/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut6_ejer_6;

/**
 *
 * @author USUARIO
 */
public class UT6_EJER_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Empresa e= new Empresa();
        
        e.cargarEmpleados();
        e.cargarHijos();
        e.Informe();
    }
    
}
