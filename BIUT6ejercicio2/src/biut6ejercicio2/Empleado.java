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
public class Empleado {
    
    private String nombre;
    private int zona;
    private int situacion;
    private Fecha Falta;
    private Float[]ventas; //empleados[nemple].getVentas()[2]
    
    public Empleado(){
	ventas = new Float[6];
	Falta = new Fecha();
    }

    public void grabar(String nombre, int zona, int situacion, Fecha Falta, Float[]ventas) {
        this.nombre = nombre;
        this.zona = zona;
        this.situacion = situacion;
        this.Falta = Falta;
        this.ventas = ventas;
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

    public Fecha getFalta() {
        return Falta;
    }

    public Float[] getVentas() {
        return ventas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setZona(int zona) {
        this.zona = zona;
    }

    public void setSituacion(int situacion) {
        this.situacion = situacion;
    }

    public void setFalta(Fecha Falta) {
        this.Falta = Falta;
    }

    public void setVentas(Float[] ventas) {
        this.ventas = ventas;
    }
    
    public float getUnaVentas(int pos){ //empleados[nemple].getVentas(2)
	return ventas[pos];
    }
    
    public void setUnaVentas(int pos, float valor){
        ventas[pos] = valor;
    }
    
    public float calcularVentas(){
	float suma = 0;
	for(int mes = 0;mes < ventas.length;mes++){
		suma = suma + ventas[mes];
	}
	return suma;
    }
}
