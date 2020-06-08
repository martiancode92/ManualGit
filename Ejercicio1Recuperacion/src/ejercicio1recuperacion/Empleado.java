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
    private Categoria categoria;
    private int horasTrabajadas;

    public Empleado() {
    }

    public Empleado(String nombre, Fecha fechaAlta, Categoria categoria, int horasTrabajadas) {
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

    public Categoria getCategoria() {
        return categoria;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int calculoTrienios() {
        int trienios = fechaAlta.calculoAnnos() / 3;
        return trienios;
    }

    public float calcularSueldo() {
        float sueldoBruto;
        if (horasTrabajadas > 40) {
            sueldoBruto = 40 * categoria.getTarifaOrdinaria() + (horasTrabajadas - 40) * categoria.getTarifaExtraordinaria();
        } else {
            sueldoBruto = horasTrabajadas * categoria.getTarifaOrdinaria();
        }
        sueldoBruto = sueldoBruto + calculoTrienios() + 50;
        return sueldoBruto;
    }

}
