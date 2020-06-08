/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

/**
 *
 * @author USUARIO
 */
public class Modelo { 
    
    String modelo;
    int tipo;
    Fecha fven;
    float precio;

    public Modelo(String modelo, int tipo ) {
        this.modelo = modelo;
        this.tipo = tipo;
  
        
    }

    public Modelo() {
   
    }

    public void setFven(Fecha fven) {
        this.fven = fven;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    
    
    

    public String getModelo() {
        return modelo;
    }

    public int getTipo() {
        return tipo;
    }

    
    public String getFecha(){
    
    
    String fecha= fven.visualizarFecha();
    
    return fecha;
    }
    
    public float getPrecio(){
    
    
    return precio;
    }
    
    
    public void grabar(String modelo, int tipo){
    
    this.modelo=modelo;
    this.tipo=tipo;
    
    
    }
    
}
