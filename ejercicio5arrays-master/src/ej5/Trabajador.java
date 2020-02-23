/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej5;

/**
 *
 * @author 203p21
 */
public class Trabajador {

    private String nombre;
    private Fecha falta;

    public Trabajador() {
        falta = new Fecha();
    }

    public String getNombre() {
        return nombre;
    }

    public Fecha getFalta() {
        return falta;
    }
    public void grabar( String nombre, Fecha falta)
    {
        this.nombre=nombre;
        this.falta=falta;
    }

}
