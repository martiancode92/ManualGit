/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import modelo.Cliente;
import modelo.Sala;

/**
 *
 * @author USUARIO
 */
public class Empresa {
        
        ArrayList <Cliente> clientes;
        ArrayList <Sala> salas;
    
        public Empresa(){
        
            this.clientes= new ArrayList();
            this.salas= new ArrayList();
        }
        
    public void nuevaSala(String denominacion, int capacidad){
    
        Sala s= new Sala(denominacion, capacidad);
    
       salas.add(s);
       
       
    } 
    
    public boolean nuevoCliente(String cif,String nombre, String apellido, String direccion){
    
    boolean existe;
    
        existe=clientes.contains(new Cliente(cif, nombre, apellido, direccion));
        
        if(!existe){
        
            clientes.add(new Cliente(cif, nombre, apellido, direccion));
        }
        return existe;
    }
    
    
    public boolean nuevoCliente(Cliente cliente){
    
        boolean resultado= clientes.contains(cliente);
        
        if(!resultado){
        
            clientes.add(cliente);
        }
    
    
        return resultado;
    }
    
    
    
    public Cliente buscarCliente(String cif){
    
        Cliente c= null;
        
        
        int posicion= clientes.indexOf(new Cliente(cif));
    
        if(posicion!=-1){
        
            c=clientes.get(posicion);
        }
        
        return c;
    }
        
        
}
