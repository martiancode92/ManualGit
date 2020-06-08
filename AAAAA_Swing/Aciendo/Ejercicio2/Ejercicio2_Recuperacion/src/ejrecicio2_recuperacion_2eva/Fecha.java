/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejrecicio2_recuperacion_2eva;

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
    String[] MESES = {"ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO", "JULIO", "AGOSTO", "SEPTIEMBRE",
        "OCTUBRE", "NOVIEMBRE", "DICIEMBRE"};

    int[] diasMes;

    public Fecha() {

        Calendar fhoy = new GregorianCalendar();

        dia = fhoy.get(Calendar.DAY_OF_MONTH);
        mes = fhoy.get(Calendar.MONTH + 1);
        anno = fhoy.get(Calendar.YEAR);
        diasMes = new int[]{30, 28, 29, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    }

    public boolean comprobarFecha(String fechaDada) {

        boolean correcto = false;

        int dia, mes, anno;

        String[] fechaDividida = fechaDada.split("/");

        if (fechaDividida.length == 3) {

            dia = Integer.parseInt(fechaDividida[0]);
            mes = Integer.parseInt(fechaDividida[1]);
            anno = Integer.parseInt(fechaDividida[2]);

            if (anno >= 1500 && anno <= 2100) {
                if (mes >= 1 && mes <= 12) {
                    if (dia >= 1 && dia <= diasMes[mes - 1]);
                    correcto = true;
                    this.dia = dia;
                    this.mes = mes;
                    this.anno = anno;
                }

            }

        }

        return correcto;
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

    public int compararFecha(Fecha fcomparar) {

        int resultado = 0;

        if (anno < fcomparar.getAnno()) {

            resultado = -1;

        } else if (anno > fcomparar.getAnno()) {

            resultado = 1;

        } else if (mes < fcomparar.getMes()) {

            resultado = -1;

        } else if (mes > fcomparar.getMes()) {

            resultado = 1;

        } else if (dia < fcomparar.getDia()) {

            resultado = -1;

        } else if (dia > fcomparar.getAnno()) {

            resultado = 1;

        }

        return resultado;
    }

    public int calculoNAnos() {
        int nAnos;
        Fecha factual = new Fecha();
        nAnos = factual.getAnno() - anno;
        if (mes > factual.getMes()
                || mes == factual.getMes() && dia > factual.getDia()) {
            nAnos--;
        }
        return nAnos;
    }

    public String visualizarMesLetra() {
        String mensaje;
        mensaje = dia + " de " + MESES[mes - 1] + " de " + anno;
        return mensaje;
    }
    
      public String visualizarMesLetra(int d, int m , int anio) {
        String mensaje;
        
        this.dia=d;
        this.mes=m;
        this.anno=anio;
        
        mensaje = dia + " de " + MESES[mes - 1] + " de " + anno;
        return mensaje;
    }
    
    public Fecha sumarDias(int diaVen){
    
        dia= dia+diaVen;
        
        while(dia> diasMes[mes-1]){
        
            dia= dia-diasMes[mes-1];
            mes++;
            
            if(mes>12){
            
                mes=1;
                
                anno++;
            
            }
        
        }
    
    return this;
    } 
    
    
    public void vaciarFecha(){
    
    
        this.dia=00;
        this.mes=00;
        this.anno=00;
    
    
    }

}
