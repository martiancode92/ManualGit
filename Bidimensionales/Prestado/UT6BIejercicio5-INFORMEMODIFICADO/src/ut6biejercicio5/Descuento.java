/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut6biejercicio5;

/**
 *
 * @author dam
 */
public class Descuento {
    
    private float limite;
    private float descuento;

    public Descuento(float limite, float descuento) {
        this.limite = limite;
        this.descuento = descuento;
    }

    public float getLimite() {
        return limite;
    }

    public float getDescuento() {
        return descuento;
    }
}
