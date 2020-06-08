package controlador;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import modelo.Cliente;
import modelo.Cliente;
import modelo.Sala;
import modelo.Sala;

/**
 *
 * @author USUARIO
 */
public class Empresa {

    private ArrayList<Cliente> clientes;
    private ArrayList<Sala> salas;

    public Empresa() {
        clientes = new ArrayList<>();
        salas = new ArrayList<>();
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public ArrayList<Sala> getSalas() {
        return salas;
    }

    public void nuevaSala(String denominacion, int capacidad) {
        Sala s = new Sala(denominacion, capacidad);
        salas.add(s);
    }

    /**
     * Añadir un nuevo cliente. Antes de dar de alta un nuevo cliente,
     * comprobará si el cliente ya existe
     *
     * @param cif
     * @param nombre
     * @param direccion
     * @param poblacion
     * @return devuelve un dato de tipo boolean. falso en el caso de que si le
     * haya dado de alta y true en caso contrario
     */
    public boolean nuevoCliente(String cif, String nombre, String direccion, String poblacion) {
        Cliente cliente = new Cliente(cif, nombre, direccion, poblacion);
        boolean existe = clientes.contains(cliente);
        if (!existe) {
            clientes.add(cliente);
        }
        return existe;
    }

    public boolean nuevoCliente(Cliente cliente) {

        boolean existe = clientes.contains(cliente);
        if (!existe) {
            clientes.add(cliente);
        }
        return existe;

    }

     /**
    * búsqueda de un cliente
    * @param cif del cliente a buscar
    * @return devuelve la información del cliente en caso de existir y null en caso contrario
    * 
    */
     public Cliente buscarUnCliente(String cif){
         Cliente cliente=null;
         // indexOf busca en el arrayList de clientes un cliente cuyo cif sea el indicado
         // en el caso de encontrarlo devuelve la posición y si no devuelve -1
         // me creso un objeto de tipo Cliente para poder utilizar el indexOf,
         // sino tendría que hacer una búsqueda secuencial
         int posicion= this.clientes.indexOf(new Cliente(cif));
         if ( posicion!=-1)
             cliente=clientes.get(posicion);
         return cliente;
     }
   
     
    

}
