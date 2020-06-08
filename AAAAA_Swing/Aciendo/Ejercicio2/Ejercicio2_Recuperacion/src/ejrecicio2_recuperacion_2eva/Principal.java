/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejrecicio2_recuperacion_2eva;

import java.io.IOException;
import numero.Numero;
/**
 *
 * @author USUARIO
 */
public class Principal {
    
    public static void main(String []args) throws IOException{
    
    Empresa e= new Empresa(Numero.pedirNumero("Ingresa el numero de clientes"));//Utilidad Jar para pedir numero de clientes
    e.cargarClientes();//llama al metodo que contiene empresas, y empieza a cargar los clientes
    e.Informe();// llama al metodo que contiene empresa,  visualiza las operaciones resultantes.
    
    
    }
    
}
