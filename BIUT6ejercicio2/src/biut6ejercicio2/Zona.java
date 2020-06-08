/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biut6ejercicio2;

/**
 *
 * @author dam
 */
public class Zona {
    
    private String nombre;
    private float sueldoBase;

    public Zona(String nombre, float sueldoBase) {
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
    }

    public String getNombre() {
        return nombre;
    }

    public float getSueldoBase() {
        return sueldoBase;
    }
    
}
