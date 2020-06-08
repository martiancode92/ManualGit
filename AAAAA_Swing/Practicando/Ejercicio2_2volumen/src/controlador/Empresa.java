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
    
    ArrayList<Cliente> cliente;
    ArrayList<Sala> sala;

    public Empresa() {
        
        this.cliente= new ArrayList();
        this.sala= new ArrayList();
        
        
    }

    public ArrayList<Cliente> getCliente() {
        return cliente;
    }

    public ArrayList<Sala> getSala() {
        return sala;
    }
    
    
    public void nuevaSala(String nombre, int capacidad){
    
        sala.add(new Sala(nombre, capacidad));
    
    }
    
    
        public boolean nuevoCliente( String cif, String nombre, String direccion,String poblacion)
    {
        Cliente c= new Cliente(cif,nombre,direccion,poblacion);
        boolean existe = cliente.contains(c);
        if (!existe)
            cliente.add(c);
        return existe;
    }
    
     public boolean nuevoCliente( Cliente c)
    {
        
        boolean existe = cliente.contains(c);
        if (!existe)
            cliente.add(c);
        return existe;
    }
     
    
          public Cliente buscarUnCliente(String cif){
         Cliente c=null;
         // indexOf busca en el arrayList de clientes un cliente cuyo cif sea el indicado
         // en el caso de encontrarlo devuelve la posición y si no devuelve -1
         // me creso un objeto de tipo Cliente para poder utilizar el indexOf,
         // sino tendría que hacer una búsqueda secuencial
         int posicion= this.cliente.indexOf(new Cliente(cif));
         if ( posicion!=-1)
             c=cliente.get(posicion);
         return c;
     }
    
}
