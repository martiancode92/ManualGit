/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut6_ejer4;

import java.io.IOException;
import numero.Numero;


public class Principal {
    
    public static void main(String[]args) throws IOException{
    
        Empresa e= new Empresa(Numero.pedirNumero("Introduce el numeo de empleados"));
        e.cargarEmpleado();
        e.pedirHijos();
        e.informe();
    }
    
}
