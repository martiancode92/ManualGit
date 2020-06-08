/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2_servicio_infor;

/**
 *
 * @author USUARIO
 */
public class Empleado {

    String nombre;
    int zona;
    int situacion;
    Fecha falta;
    Ventas[] ventas;

    public Empleado(String nombre, int zona, int situacion, Fecha falta, Ventas[] ventas) {
        this.nombre = nombre;
        this.zona = zona;
        this.situacion = situacion;
        this.falta = falta;
        this.ventas = ventas;
    }

    public Empleado(String nombre, int zona, int situacion, Fecha falta, int venta) {
        this.nombre = nombre;
        this.zona = zona;
        this.situacion = situacion;
        this.falta = falta;

        if (venta != 0) {
            this.ventas = new Ventas[venta];
        }

    }

    public Empleado(String nombre, int zona, int situacion, Fecha falta) {
        this.nombre = nombre;
        this.zona = zona;
        this.situacion = situacion;
        this.falta = falta;
    }
    
    

    public Empleado() {
    }

    public String getNombre() {
        return nombre;
    }

    public int getZona() {
        return zona;
    }

    public int getSituacion() {
        return situacion;
    }

    public String getFalta() {

        String mensaje = falta.visualizarFecha();

        return mensaje;
    }

    public Ventas[] getVentas() {
        return ventas;
    }

    public Ventas getUnaVenta(int venta) {

        return ventas[venta];
    }

    public void setVentas(Ventas[] ventas) {

        this.ventas = ventas;

    }
    
    public void setUnaVenta(int venta, Ventas ventas){
    
        this.ventas[venta]=ventas;
    
    }

    public void grabar(String nombre, int zona, int situacion, Fecha falta, Ventas[] ventas, int nVenta) {

        this.nombre = nombre;
        this.zona = zona;
        this.situacion = situacion;
        this.falta = falta;
        this.ventas = ventas[nVenta];

    }

}
