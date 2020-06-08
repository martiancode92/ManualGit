/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author USUARIO
 */
public class Sala {
    
    
    
    String nombre;
    int capacidad;

    public Sala(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
    }

    public Sala() {
    }

   
    

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return  nombre ;
    }
    
    

    public int getCapacidad() {
        return capacidad;
    }

    
   
    
}
