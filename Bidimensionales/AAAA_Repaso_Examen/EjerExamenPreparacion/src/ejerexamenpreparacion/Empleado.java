/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerexamenpreparacion;

/**
 *
 * @author USUARIO
 */
public class Empleado {
    
    
    String nombre;
    Fecha falta;
    int cate;
    float nHoras;
    Categoria categorias;

    public Empleado(String nombre, Fecha falta, int cate, float nHoras) {
        this.nombre = nombre;
        this.falta = falta;
        this.cate = cate;
        this.nHoras = nHoras;
    }

    public Empleado() {
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public Fecha getFalta() {
        return falta;
    }

    public int getCate() {
        return cate;
    }

    public float getnHoras() {
        return nHoras;
    }
    
    public void grabar(String nombre, Fecha falta, int cate, float horas){
    
this.nombre= nombre;
this.falta=falta;
this.cate= cate;
this.nHoras=horas;
        
    
    }
    
      
    
    
    
    
    
    
    
}
