/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class Linea {
    
    int codigo;
    String denominacion;
    Integer frecuencia;
    Parada primera;
    Parada ultima;
     
     
    ArrayList<Parada> paradasIntermedias;
    
    public Linea(){
    
    paradasIntermedias= new ArrayList();
    
    }
      
    public Linea(int codigo){
    
    this.codigo=codigo;
    }
    

    public Linea(int codigo, String denominacion, Integer frecuencia, Parada primera, Parada ultima, ArrayList<Parada> paradas) {
        this.codigo = codigo;
        this.denominacion = denominacion;
        this.frecuencia = frecuencia;
        this.primera = primera;
        this.ultima = ultima;
        this.paradasIntermedias = paradas;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public Integer getFrecuencia() {
        return frecuencia;
    }

    public Parada getPrimera() {
        return primera;
    }

    public Parada getUltima() {
        return ultima;
    }

    public ArrayList<Parada> getParadasIntermedias() {
        return paradasIntermedias;
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
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return  codigo+"-> "+ denominacion;
    }
 
  
    

    
    
}
