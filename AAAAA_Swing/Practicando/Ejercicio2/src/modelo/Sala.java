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
    
    private String denominacion;
    
    private int capacidad;
    
    private boolean ocupada;
    
    public Sala(String denomincion, int capacidad){
    
    
        this.denominacion=denominacion;
        this.capacidad= capacidad;
        //la inicio falsa == a libre
        ocupada= false;
    
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }
    
    
    @Override
    public String toString(){
    
    return denominacion;
    }
    
    
    
    
}
