/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1recuperacion;

/**
 *
 * @author Francisco Javier Alameda Díez
 */
public class Ejercicio1Recuperacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empresa miEmpresa = new Empresa(1);
        miEmpresa.cargarDatos();
        miEmpresa.informe();
    }
    
}