/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerexamenpreparacion;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author USUARIO
 */
public class Fecha {
    
private int dia;
    private int mes;
    private int anno;
    static int[] diasMes;

    public Fecha() {
        Calendar fhoy = new GregorianCalendar();
        mes = fhoy.get(Calendar.MONTH) + 1;
        anno = fhoy.get(Calendar.YEAR);
        dia = fhoy.get(Calendar.DAY_OF_MONTH);
        diasMes = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    }

    public Fecha(int dia, int mes, int anno) {
        this.dia = dia;
        this.mes = mes;
        this.anno = anno;
        diasMes = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    }

    public Fecha(String fechaDada) {
        String[] valor = fechaDada.split("/");
        dia = Integer.parseInt(valor[0]);
        mes = Integer.parseInt(valor[1]);
        anno = Integer.parseInt(valor[2]);
        diasMes = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
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

    public boolean comprobarFecha(String fdada) {
        boolean correcto= false;
        String[] datos = fdada.split("/");
        if (datos.length == 3) {
            try {
                dia = Integer.parseInt(datos[0]);
                mes = Integer.parseInt(datos[1]);
                anno = Integer.parseInt(datos[2]);
                if (anno > 1000 && anno < 3000) {
                    if (mes >= 1 && mes <= 12) {
                        if (dia > 01 && dia <= diasMes[mes - 1]) {
                            correcto = true;
                        }
                    } 
                } 
            }catch(NumberFormatException ex){
            
            
            
            }
        }
        return correcto;
    }

    public int comparar(Fecha fhoy) {
        int resultado=0;
     
        if (anno > fhoy.getAnno()) {
            resultado = 1;
        } else if (anno < fhoy.getAnno()) {
            resultado = -1;
        } else if (mes > fhoy.getMes()) {
            resultado = 1;
        } else if (mes < fhoy.getMes()) {
            resultado = -1;
        } else if (dia < fhoy.getDia()) {
            resultado = -1;
        } else if (dia > fhoy.getDia()) {
            resultado = 1;
        }
        return resultado;

    }
    public int calculoAnnos()
    {
        Fecha fhoy=new Fecha();
        int annos=fhoy.getAnno()-anno;
        if ( fhoy.getMes()< mes || fhoy.getMes()==mes && fhoy.getDia()<dia)
            annos--;
        return annos;
    }

}

