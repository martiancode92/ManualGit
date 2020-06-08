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
public class Categoria {
    private String denominacion;
    private float tOrdinaria;
    private float tExtraordinaria;

    public Categoria(String denominacion, float tOrdinaria, float tExtraordinaria) {
        this.denominacion = denominacion;
        this.tOrdinaria = tOrdinaria;
        this.tExtraordinaria = tExtraordinaria;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public float gettOrdinaria() {
        return tOrdinaria;
    }

    public float gettExtraordinaria() {
        return tExtraordinaria;
    }
    
    
}
