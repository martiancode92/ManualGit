/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type;

/**
 *
 * @author USUARIO
 */
public final class Lineas {

    private String codigo;
    private String denominacion;
    private String frecuencia;
    private String primeraParada;
    private String ultimaParada;
    private String paradasIntermedias;
    
    

    public Lineas(String codigo, String denominacion, String frecuencia, String primeraParada, String ultimaParada, String paraInter) {
        this.codigo = codigo;
        this.denominacion = denominacion;
        this.frecuencia = frecuencia;
        this.primeraParada = primeraParada;
        this.ultimaParada = ultimaParada;
        this.paradasIntermedias= paraInter;

    }

    public Lineas() {
    }



    public void crearLinea(String codigo, String denominacion, String frecuencia, String primeraParada, String ultimaParada, String paraInter) {

        this.codigo = codigo;
        this.denominacion = denominacion;
        this.frecuencia = frecuencia;
        this.primeraParada = primeraParada;
        this.ultimaParada = ultimaParada;
       this.paradasIntermedias= paraInter;
    }

  public void elminiarLinea(){
  
         this.codigo = "";
        this.denominacion = "";
        this.frecuencia = "";
        this.primeraParada = "";
        this.ultimaParada = "";
  
  
  }
    
    


    public String getCodigo() {
        return codigo;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public String getFrecuencia() {
        return frecuencia;
    }

    public String getPrimeraParada() {
        return primeraParada;
    }

    public String getUltimaParada() {
        return ultimaParada;
    }
    
    
    
    
    
    

    public String getParadasIntermedias() {
        return paradasIntermedias;
    }


 public String infoStandart(){/// esta la info estandar que reoge el usuario estandar
 
     String info;
     
     info=  getPrimeraParada() + getUltimaParada()+getFrecuencia();
 
 return info ;
 }

    
    
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }

    public void setPrimeraParada(String primeraParada) {
        this.primeraParada = primeraParada;
    }

    public void setUltimaParada(String ultimaParada) {
        this.ultimaParada = ultimaParada;
    }

    public void setParadasIntermedias(String paradasIntermedias) {
        this.paradasIntermedias = paradasIntermedias;
    }
  
  

}
