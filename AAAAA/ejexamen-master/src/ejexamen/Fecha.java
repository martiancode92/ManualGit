package ejexamen;


import java.util.Calendar;
import java.util.GregorianCalendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 203p21
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

    public int comprobarFecha(String fdada) {
        int correcto;
        String[] datos = fdada.split("/");
        if (datos.length == 3) {
            try {
                dia = Integer.parseInt(datos[0]);
                mes = Integer.parseInt(datos[1]);
                anno = Integer.parseInt(datos[2]);
                if (anno > 1000 && anno < 3000) {
                    if (mes >= 1 && mes <= 12) {
                        if (dia > 01 && dia <= diasMes[mes - 1]) {
                            correcto = 0;// esta bien
                        } else {
                            correcto = 1;//dia
                        }
                    } else {
                        correcto = 2; //mes
                    }
                } else {
                    correcto = 3;//ano
                }
            } catch (NumberFormatException ex) {
                correcto = 4; //no son numero
            }
        } else {
            correcto = 5; //formato
        }
        return correcto;
    }

    public int comparar() {
        int resultado;
        Fecha fhoy = new Fecha();
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
        } else {
            resultado = 0;
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
