/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2recuperacion;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Franciso Javier Alameda Díez
 */
public class Fecha {

    private int dia;
    private int mes;
    private int anno;
    static int[] diasMes;
    static String[] meses;

    public Fecha(int dia, int mes, int anno) {
        this.dia = dia;
        this.mes = mes;
        this.anno = anno;
        diasMes = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        meses = new String[]{"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre",
            "noviembre", "diciembre"};
    }

    public Fecha() {
        Calendar fhoy = new GregorianCalendar();
        dia = fhoy.get(Calendar.DAY_OF_MONTH);
        mes = fhoy.get(Calendar.MONTH) + 1;
        anno = fhoy.get(Calendar.YEAR);
        diasMes = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        meses = new String[]{"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre",
            "noviembre", "diciembre"};
    }

    public Fecha(String fechaIntroducida) {
        String[] valor = fechaIntroducida.split("/");
        dia = Integer.parseInt(valor[0]);
        mes = Integer.parseInt(valor[1]);
        anno = Integer.parseInt(valor[2]);
        diasMes = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        meses = new String[]{"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
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
    
    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public boolean comprobarFecha(String fechaIntroducida) {
        String[] fecha;
        boolean correcto = false;
        fecha = fechaIntroducida.split("/");
        if (fecha.length == 3) {
            try {
                dia = Integer.parseInt(fecha[0]);
                mes = Integer.parseInt(fecha[1]);
                anno = Integer.parseInt(fecha[2]);

                if (anno > 1000 && anno < 3000) {
                    diasMes[1] = comprobarBisiesto();
                    if (mes >= 1 && mes <= 12) {
                        if (dia >= 1 && dia <= diasMes[mes - 1]) {
                            correcto = true;
                            this.dia = dia;
                            this.mes = mes;
                            this.anno = anno;
                        }
                    }
                }
            } catch (NumberFormatException ex) {
                System.err.println("Fecha incorrecta");
            }
        }
        return correcto;
    }

    public int comprobarBisiesto() {
        int ndias = 28;
        if (anno % 4 == 0 && anno % 100 != 0 || anno % 400 == 0) {
            ndias = 29;
        }
        return ndias;
    }
    
    public int comprobarBisiesto(int anno) {
        int ndias = 28;
        if (anno % 4 == 0 && anno % 100 != 0 || anno % 400 == 0) {
            ndias = 29;
        }
        return ndias;
    }

    public int compararFecha(Fecha fcomparar) {
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

    public int calculoAnnos() {
        int annos;
        Fecha fechaActual = new Fecha();
        annos = fechaActual.getAnno() - anno;
        if (fechaActual.getMes() < mes || fechaActual.getMes() == mes && fechaActual.getDia() < dia) {
            annos--;
        }
        return annos;
    }

    public String visualizarLetra() {
        String mensaje = dia + " de " + meses[mes - 1] + " de " + anno;
        return mensaje;
    }

    public Fecha sumarDias(int diasVencimiento) {
        dia = dia + diasVencimiento;
        while (dia > diasMes[mes - 1]) {
            dia = dia - diasMes[mes - 1];
            mes++;
            if (mes > 12) {
                mes = 1;
                anno++;
            }
        }
        return this;
    }

    
    
}
