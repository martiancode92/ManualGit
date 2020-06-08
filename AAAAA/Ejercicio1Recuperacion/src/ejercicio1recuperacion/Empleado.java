/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1recuperacion;

/**
 *
 * @author Francisco Javier Alameda Díez
 */
public class Empleado {

    private String nombre;
    private Fecha fechaAlta;
    private int categoria;
    private int horasTrabajadas;

    public Empleado() {
    }

    public Empleado(String nombre, Fecha fechaAlta, int categoria, int horasTrabajadas) {
        this.nombre = nombre;
        this.fechaAlta = fechaAlta;
        this.categoria = categoria;
        this.horasTrabajadas = horasTrabajadas;
    }

    public String getNombre() {
        return nombre;
    }

    public Fecha getFechaAlta() {
        return fechaAlta;
    }

    public int getCategoria() {
        return categoria;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }
    
    
     public void guardarEmpleado(String nombre, Fecha fechaAlta, int categoria, int horasTrabajadas) {
        this.nombre = nombre;
        this.fechaAlta = fechaAlta;
        this.categoria = categoria;
        this.horasTrabajadas = horasTrabajadas;
    }
 


}
