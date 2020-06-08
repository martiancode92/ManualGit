/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recu_2eva;

/**
 *
 * @author USUARIO
 */
public class Empleado {
    
    private String nombre;
    private Fecha falta;
    private int categoria;
    float nHoras;

    public Empleado(String nombre, Fecha falta, int categoria, float nHoras) {
        this.nombre = nombre;
        this.falta = new Fecha();
        this.categoria = categoria;
        this.nHoras = nHoras;
    }

    public Empleado() {
    }
    
    
    
    public void grabarEmpleado( String nombre, Fecha fecha, int categoria, float nHoras){

        this.nombre= nombre;
        this.falta= fecha;
        this.categoria= categoria;
        this.nHoras= nHoras;

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

    public float getnHoras() {
        return nHoras;
    }
    
    
    
    
    
}
