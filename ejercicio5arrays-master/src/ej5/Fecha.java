/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej5;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author 203p21
 */
public class Fecha {

    private int dia;
    private int mes;
    private int anno;
    int[] dias;
    final static String []MESES={"enero","febrero","marzo","abril","mayo",
            "junio","julio","agosto","septiembre","octubre","noviembre","diciembre"
        };

    public Fecha() {
        Calendar fhoy = new GregorianCalendar();
        dia = fhoy.get(Calendar.DAY_OF_MONTH);
        mes = fhoy.get(Calendar.MONTH) + 1;
        anno = fhoy.get(Calendar.YEAR);
        dias = new int[]{31, 28, 29, 30, 31, 31, 31, 31, 30, 31, 30, 31};
//        meses=new String[]{"enero","febrero","marzo","abril","mayo",
//            "junio","julio","agosto","septiembre","octubre","noviembre","diciembre"
//        };
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

    /**
     * Metodo que comprueba si es una fecha correcta.
     *
     * @param fechaDada valor que se quiere comprobar
     * @return devuelve true si es correcta y modifica las propiedades de la
     * fecha en caso contrario devuelve false y deja sin modificar las
     * propiedades.
     */
    public boolean comprobarFecha(String fechaDada) {
        boolean correcto = false;
        int dia, mes, anno;
        String[] fechaDividida = fechaDada.split("/");
        if (fechaDividida.length == 3) {
            try {
                dia = Integer.parseInt(fechaDividida[0]);
                mes = Integer.parseInt(fechaDividida[1]);
                anno = Integer.parseInt(fechaDividida[2]);
                if (anno > 1000 && anno < 3000) {
                    dias[1] = bisiesto(anno);
                    if (mes >= 1 && mes <= 12) {
                        if (dia >= 1 && dia <= dias[mes - 1]) {
                            correcto = true;
                            this.dia = dia;
                            this.mes = mes;
                            this.anno = anno;
                        }
                    }
                }

            } catch (NumberFormatException ex) {

            }
        }
        return correcto;
    }

    public int bisiesto() {
        int ndias = 28;
        if (anno % 4 == 0 && anno % 100 != 0 || anno % 400 == 0) {
            ndias = 29;
        }
        return ndias;
    }

    public int bisiesto(int anno) {
        int ndias = 28;
        if (anno % 4 == 0 && anno % 100 != 0 || anno % 400 == 0) {
            ndias = 29;
        }
        return ndias;
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
        } else if (dia > fcomparar.getDia()) {
            resultado = 1;
        } else if (dia < fcomparar.getDia()) {
            resultado = -1;
        } else {
            resultado = 0;
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

    public int calculoNAnos(Fecha factual) {
        int nAnos;
        nAnos = factual.getAnno() - anno;
        if (mes > factual.getMes()
                || mes == factual.getMes() && dia > factual.getDia()) {
            nAnos--;
        }
        return nAnos;
    }
    public String visualizarMesLetra(){
        String mensaje;
        mensaje=dia+" de "+ MESES[mes-1]+" de "+ anno;
        return mensaje;
    }
}
