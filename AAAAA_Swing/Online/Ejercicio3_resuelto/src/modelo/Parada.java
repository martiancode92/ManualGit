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
public class Parada {
    private int codigo;
    private String denominación;

    public Parada(int codigo, String denominación) {
        this.codigo = codigo;
        this.denominación = denominación;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDenominación() {
        return denominación;
    }

   
     @Override
    public String toString() {
        return denominación ;
    }
    
}
