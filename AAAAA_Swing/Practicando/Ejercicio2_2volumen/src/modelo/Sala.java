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
    
    boolean ocupada;

    public Sala(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.ocupada= false;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return  nombre ;
    }
    
    
    
    
}
