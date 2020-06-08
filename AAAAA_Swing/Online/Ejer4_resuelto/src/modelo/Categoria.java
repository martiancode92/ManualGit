/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author ADMINMJ
 */
public class Categoria {
    private String denominacion;

    public Categoria(String denominacion) {
        this.denominacion = denominacion;
    }

    public String getDenominacion() {
        return denominacion;
    }

    @Override
    public String toString() {
        return denominacion;
    }
    
    
}
