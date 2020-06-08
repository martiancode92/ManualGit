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
    
    ArrayList<Cliente>clientes;
    ArrayList<Sala>salas;

    public Empresa() {
        
        this.clientes= new ArrayList();
        this.salas= new ArrayList();
        
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public ArrayList<Sala> getSalas() {
        return salas;
    }
    
    
    public void nuevaSala(String denominacion, int capacidad){
    
    Sala s= new Sala(denominacion, capacidad);
    salas.add(s);
    
    }
    
    public boolean nuevoCliente(String cif, String nombre, String direccion, String poblacion){
    
        Cliente cliente= new Cliente(cif, nombre, direccion, poblacion);
        boolean existe= clientes.contains(cliente);
        
        if(!existe){
        
            clientes.add(cliente);
        }
    
        return existe;
    }
    
    
    public boolean nuevoCliente(Cliente cliente){
        
        boolean existe= clientes.contains(cliente);
    
        if(!existe){
        
            clientes.add(cliente);
        }
        
        return existe;
    }
    
    public Cliente buscarUnCliente(String cif){
    
    Cliente cliente= null;
    
         // indexOf busca en el arrayList de clientes un cliente cuyo cif sea el indicado
         // en el caso de encontrarlo devuelve la posición y si no devuelve -1
         // me creso un objeto de tipo Cliente para poder utilizar el indexOf,
         // sino tendría que hacer una búsqueda secuencial
    int posicion= this.clientes.indexOf(new Cliente(cif));
        
    if(posicion!=-1);
        cliente= clientes.get(posicion);
         return cliente;
    }
}
