/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author ADMINMJ
 */
public class Sala {
    private String denominacion;
    /**
     * número de personas máximo que entran en la sala
     */
    private int capacidad;
    /**
     * Esta propiedad nos indica si la sala esta ocupada o no
     */
    private boolean ocupada;

    public Sala(String denominacion, int capacidad) {
        this.denominacion = denominacion;
        this.capacidad = capacidad;
        // inicialmente la sala está libre
        ocupada=false;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    @Override
    public String toString() {
        return  denominacion;
    }
    
    
    
}
