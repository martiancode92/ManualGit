/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4bidi;

/**
 *
 * @author 203p21
 */
public class Categoria {
    private String denominacion;
    private float sBase;

    public Categoria(String denominacion, float sBase) {
        this.denominacion = denominacion;
        this.sBase = sBase;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public float getsBase() {
        return sBase;
    }
    
    
}
