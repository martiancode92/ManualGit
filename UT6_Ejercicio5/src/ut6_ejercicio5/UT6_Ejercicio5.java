/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut6_ejercicio5;

/**
 *
 * @author dam
 */
public class UT6_Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Fecha fintroducida = new Fecha();
        Fecha fcomprar = new Fecha ();
        fintroducida.comprobarFecha("30/06/2020");
        fintroducida.compararFechas(fcomprar);
        
    }
    
}
