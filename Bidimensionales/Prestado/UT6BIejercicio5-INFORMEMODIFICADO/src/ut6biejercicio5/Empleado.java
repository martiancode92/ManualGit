/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut6biejercicio5;

/**
 *
 * @author Barbero
 */
public class Empleado {
    
    private String nombre;
    private Fecha Falta;
    private int categoria;
    private int horas;

    public Empleado() {
        Falta = new Fecha();
    }

    public void grabar(String nombre, Fecha Falta, int categoria, int horas) {
        this.nombre = nombre;
        this.Falta = Falta;
        this.categoria = categoria;
        this.horas = horas;
    }

    public String getNombre() {
        return nombre;
    }

    public Fecha getFalta() {
        return Falta;
    }

    public int getCategoria() {
        return categoria;
    }

    public int getHoras() {
        return horas;
    }
    
}
