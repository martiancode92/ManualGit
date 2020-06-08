/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4bidi;

import fecha.Fecha;

/**
 *
 * @author 203p21
 */
public class Empleado {
    private String nombre;
    private Fecha falta;
    private int categoria;
    private Hijo[] hijos;

    public Empleado(String nombre, Fecha falta, int categoria, Hijo[] hijos) {
        this.nombre = nombre;
        this.falta = falta;
        this.categoria = categoria;
        this.hijos = hijos;
    }
    public Empleado(String nombre, Fecha falta, int categoria, int nhijos) {
        this.nombre = nombre;
        this.falta = falta;
        this.categoria = categoria;
        if (nhijos!=0)
       
            hijos=new Hijo[nhijos];
        
    } 

    public String getNombre() {
        return nombre;
    }

    public Fecha getFalta() {
        return falta;
    }

    public int getCategoria() {
        return categoria;
    }

    public Hijo[] getHijos() {
        return hijos;
    }
    public Hijo getUnHijo(int nhijo){
        return hijos[nhijo];
    }

    public void setHijos(Hijo[] hijos) {
        this.hijos = hijos;
    }
      public void setUnHijo(int nhijo, Hijo hijo) {
        hijos[nhijo] = hijo;
    }
    
    
  
    
}
