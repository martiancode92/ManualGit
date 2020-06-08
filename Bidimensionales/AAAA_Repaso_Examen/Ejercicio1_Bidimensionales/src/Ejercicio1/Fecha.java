/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

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
    String[] MESES;
    int[] diasMes;

    public Fecha() {

        Calendar fhoy = new GregorianCalendar();

        dia = fhoy.get(Calendar.DAY_OF_MONTH);
        mes = fhoy.get(Calendar.MONTH) + 1;
        anno = fhoy.get(Calendar.YEAR);

        MESES = new String[]{"ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO", "JULIO", "AGOSTO",
            "SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE", "DICIEMBRE"};
        diasMes = new int[]{31, 28, 29, 30, 31, 31, 31, 31, 30, 31, 30, 31};

    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnno() {
        return anno;
    }

    public boolean comprobarFecha(String fechaDada) {

        boolean correcto = false;
        int dia, mes, anno;
        String[] fechaDividida = fechaDada.trim().split("/");
      try {
            if (fechaDividida.length == 3) {

        dia = Integer.parseInt(fechaDividida[0]);
        mes = Integer.parseInt(fechaDividida[1]);
        anno = Integer.parseInt(fechaDividida[2]);

        if (anno > 1500 && anno < 2021) {

            if (mes >= 1 && mes <= 12) {

                if (dia >= 1 && dia <= diasMes[mes - 1]) {
                    this.dia = dia;
                    this.mes = mes;
                    this.anno = anno;
                    correcto = true;

                }

            }

        }

        
           }

        } catch (NumberFormatException ex) {
        }
        return correcto;
    }

    public int compararFecha(Fecha factual) {

        int resultado = 0;

        if (anno > factual.getAnno()) {

            resultado = 1;

        } else if (anno < factual.getAnno()) {

            resultado = -1;
        }
        if (mes > factual.getAnno()) {

            resultado = 1;

        } else if (mes < factual.getAnno()) {

            resultado = -1;
        }
        if (dia > factual.getAnno()) {

            resultado = 1;

        } else if (dia < factual.getAnno()) {

            resultado = -1;
        }

        return resultado;
    }
    
  
    public int calcularAnnos(Fecha factual){
    
        int resultado = anno-factual.getAnno();
        
        if(mes>factual.getMes() || mes==factual.getMes() && dia>factual.getDia()){
        
        
            resultado--;
        
        }
    
    
    return resultado;
    }
    
     
    public int calcularAnnos(){
    
        
        Fecha factual= new Fecha();
        
        int resultado = anno-factual.getAnno();
        
        if(mes>factual.getMes() || mes==factual.getMes() && dia>factual.getDia()){
        
        
            resultado--;
        
        }
    
    
    return resultado;
    }
    
    public String visualizarFecha(){
        String fecha = dia+" de"+MESES[mes-1]+"de"+anno;
    return fecha;
    }

  
}
