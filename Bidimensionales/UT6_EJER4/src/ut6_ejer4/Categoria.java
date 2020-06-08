/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut6_ejer4;


public class Categoria {
    
    
    String nombre;
    float sbase;

    public Categoria(String nombre, float sbase) {
        this.nombre = nombre;
        this.sbase = sbase;
    }

    public Categoria() {
    }
    

    public String getNombre() {
        return nombre;
    }

    public float getSbase() {
        return sbase;
    }
    
    
    
}
