/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut6_ejercico_3_bidemen;

/**
 *
 * @author USUARIO
 */
public class Importe {

    float venta;
    Fecha fven;

    public Importe(float venta, Fecha fven) {
        this.venta = venta;
        this.fven = fven;
    }

    public float getVenta() {
        return venta;
    }

    public Fecha getFven() {
        return fven;
    }

    public void setVenta(float venta) {
        this.venta = venta;
    }

    public void setFven(Fecha fven) {
        this.fven = fven;
    }
    
    public void grabar(float v, Fecha f){
    
    venta=v;
    fven=f;
    
    }
    

  





}
