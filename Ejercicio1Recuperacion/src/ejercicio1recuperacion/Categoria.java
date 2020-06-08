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
public class Categoria {
    private String denominacion;
    private float tarifaOrdinaria;
    private float tarifaExtraordinaria;

    public Categoria() {
    }
    
    public Categoria(String denominacion, float tarifaOrdinaria, float tarifaExtraordrinaria) {
        this.denominacion = denominacion;
        this.tarifaOrdinaria = tarifaOrdinaria;
        this.tarifaExtraordinaria = tarifaExtraordinaria;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public float getTarifaOrdinaria() {
        return tarifaOrdinaria;
    }

    public float getTarifaExtraordinaria() {
        return tarifaExtraordinaria;
    }
    
}
