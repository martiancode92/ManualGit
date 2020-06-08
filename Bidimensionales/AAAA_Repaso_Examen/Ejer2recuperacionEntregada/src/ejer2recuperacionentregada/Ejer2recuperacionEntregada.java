/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer2recuperacionentregada;

import java.io.IOException;

/**
 *
 * @author USUARIO
 */
public class Ejer2recuperacionEntregada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        Empresa e=new Empresa(1);
        e.cargarClientes();
        e.Informe();
    }
    
}
