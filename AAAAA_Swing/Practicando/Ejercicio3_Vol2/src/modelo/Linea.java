/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author USUARIO
 */
public class Linea {
    
    String codigo;
    String nombre;
    int frecuencia;
    String primeraParada;
    String ultimaParada;
    
    ArrayList<Parada> parada;

    public Linea(String codigo, String nombre, int frecuencia, String primeraParada, String ultimaParada, ArrayList<Parada> parada) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.frecuencia = frecuencia;
        this.primeraParada = primeraParada;
        this.ultimaParada = ultimaParada;
        this.parada = new ArrayList();
        
    }
    
    public Linea(String codigo){
    
    
        this.codigo=codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getFrecuencia() {
        return frecuencia;
    }

    public String getPrimeraParada() {
        return primeraParada;
    }

    public String getUltimaParada() {
        return ultimaParada;
    }

    public ArrayList<Parada> getParada() {
        return parada;
    }
    
    
    
      public void aniadirParada(Parada p){
        parada.add(p);
    }
 
    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Linea other = (Linea) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return  nombre ;
    }


 

    
    
    
}
