/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejexamen;

/**
 *
 * @author 203p21
 */
public class Empleado {

    private String nombre;
    private Fecha falta;
    private Categoria categoria;
    private int horas;
    private int nhijos;

    public Empleado() {
    }

    public Empleado(String nombre, Fecha falta, Categoria categoria,
            int horas, int nhijos) {
        this.nombre = nombre;
        this.falta = falta;
        this.categoria = categoria;
        this.horas = horas;
        this.nhijos = nhijos;
    }

    public void grabar(String nombre, Fecha falta, Categoria categoria,
            int horas, int nhijos) {
        this.nombre = nombre;
        this.falta = falta;
        this.categoria = categoria;
        this.horas = horas;
        this.nhijos = nhijos;
    }

    public String getNombre() {
        return nombre;
    }

    public Fecha getFalta() {
        return falta;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public int getHoras() {
        return horas;
    }

    public int getNhijos() {
        return nhijos;
    }

    public int calculoTrienios() {
        int trienios = falta.calculoAnnos() / 3;
        return trienios;
    }

    public float calcularSueldo() {
        float sbruto;

        if (horas > 40) {
            sbruto = 40 * categoria.gettOrdinaria()
                    + (horas - 40) * categoria.gettExtraordinaria();
        } else {
            sbruto = horas * categoria.gettOrdinaria();

        }
        sbruto=sbruto+calculoTrienios()+50;
        return sbruto;
    }

}
