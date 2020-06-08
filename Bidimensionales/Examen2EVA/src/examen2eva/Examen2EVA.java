/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2eva;
import numero.Numero;
/**
 *
 * @author USUARIO
 */
public class Examen2EVA {


    public static void main(String[] args) {
        
        Empresa e = new Empresa(Numero.pedirNumero("Ingrese El numero de empleados", 1, 50));
        e.crearEmpleados();
        e.cargarDatos();
        e.Informe();
      
    }
    
}
