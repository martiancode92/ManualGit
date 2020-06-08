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

    ArrayList<Parada> parada;

    public Linea(String codigo, String denominacion, int frecuencia, String primeraParada, String ultimaParada) {
        this.codigo = codigo;
        this.denominacion = denominacion;
        this.frecuencia = frecuencia;
        this.primeraParada = primeraParada;
        this.ultimaParada = ultimaParada;
        this.parada = new ArrayList();
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

    public ArrayList<Parada> getParada() {
        return parada;
    }

    public boolean nuevaParada(int codigo, String denominacion) {

        Parada p = new Parada(codigo, denominacion);

        boolean existe = parada.contains(p);

        if (!existe) {

            parada.add(p);

        }
        return existe;
    }

    public boolean nuevaParada(Parada p) {

        boolean existe = parada.contains(p);

        if (!existe) {

            parada.add(p);

        }

        return existe;
    }

}
