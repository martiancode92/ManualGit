/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerexamenpreparacion;

/**
 *
 * @author USUARIO
 */
public class Categoria {
    
    String Categoria;
    float tOrdinaria;
    float tExtra;

    public Categoria(String Categoria, float tOrdinaria, float tExtra) {
        this.Categoria = Categoria;
        this.tOrdinaria = tOrdinaria;
        this.tExtra = tExtra;
    }

    public String getCategoria() {
        return Categoria;
    }

    public float gettOrdinaria() {
        return tOrdinaria;
    }

    public float gettExtra() {
        return tExtra;
    }
    
    
    
}
