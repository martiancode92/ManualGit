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
    
    String codigo;
    String denominacion;
    int frecuencia;
    String primeraParada;
    String ultimaParada;
    ArrayList<Parada> paradasIntermedias;

    public Linea(String codigo, String denominacion, int frecuencia, String primeraParada, String ultimaParada) {
        this.codigo = codigo;
        this.denominacion = denominacion;
        this.frecuencia = frecuencia;
        this.primeraParada = primeraParada;
        this.ultimaParada = ultimaParada;
        this.paradasIntermedias = new ArrayList();
        
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDenominacion() {
        return denominacion;
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

    public ArrayList<Parada> getParadasIntermedias() {
        return paradasIntermedias;
    }
    
    
    
    
    
}
