/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut6_ejercicio1;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author USUARIO
 */
public class Fecha {

    int dia;
    int mes;
    int anno;
    String MESES[] = {"EENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO", "JULIO", "AGOSTO",
        "SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE", "DEICIEMBRE"};
    int diasMes[];

    public Fecha() {

        Calendar fhoy = new GregorianCalendar();

        dia = fhoy.get(Calendar.DAY_OF_MONTH);
        mes = fhoy.get(Calendar.MONTH) + 1;
        anno = fhoy.get(Calendar.YEAR);
        diasMes = new int[]{31, 28, 29, 30, 31, 31, 31, 31, 30, 31, 30, 31};

    }
    
    
    public int getDia(){
    
    return dia;
    }
    
    public int getMes(){
    
    return mes;
    }
    public int getAnno(){
    
    return anno;
    }
    
    
    
    
    /*
    
    *****************************************************
    
    */

    public boolean comprobarFecha(String fechaDada) {

        boolean correcto = false;
        int dia, mes, anno;

        String[] fechaDividida = fechaDada.split("/");
        try {
            if (fechaDividida.length == 3) {

                dia = Integer.parseInt(fechaDividida[0]);
                mes = Integer.parseInt(fechaDividida[1]);
                anno = Integer.parseInt(fechaDividida[2]);

                if (anno >= 1500 && anno <= 2100) {
                    if (mes >= 1 && mes <= 12) {
                        if (dia >= 1 && dia <= diasMes[mes - 1]) {
                            correcto = true;
                            this.dia = dia;
                            this.mes = mes;
                            this.anno = anno;

                        }

                    }

                }

            }

        } catch (NumberFormatException ex) {
        }
        return correcto;
    }
    
    public int compararFecha( Fecha fcomparar){
    
        int resultado=0;
    
        if (anno < fcomparar.getAnno()) {
            resultado = -1;
            
        } else if (anno > fcomparar.getAnno()) {
            resultado = 1;
            
        }else if (mes < fcomparar.getMes()) {
            resultado = -1;
            
        } else if (mes > fcomparar.getMes()) {
            resultado = 1;
            
        } else if (dia < fcomparar.getDia()) {
            resultado = -1;
            
        } else if (dia > fcomparar.getDia()) {
            resultado = 1;
            
        } else {
            resultado = 0;
        }

        return resultado;       

    }
    
    public int calcularAnnos(){
    
        int nAnnos;
        Fecha fcomparar= new Fecha();
        
        nAnnos= fcomparar.getAnno()-anno;
        
        if (mes> fcomparar.getMes() 
                || mes== fcomparar.getMes() && dia>= fcomparar.getDia()){
    
            nAnnos--;
    
    }
    
    return nAnnos;
    }

}
