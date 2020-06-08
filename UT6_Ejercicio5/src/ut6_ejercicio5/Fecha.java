/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut6_ejercicio5;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fecha {

    int dia;
    int mes;
    int anno;
    int[] dias;

    public Fecha() {

        Calendar fhoy = new GregorianCalendar();
        dia = fhoy.get(Calendar.DAY_OF_MONTH);
        mes = fhoy.get(Calendar.MONDAY);
        anno = fhoy.get(Calendar.YEAR);
        dias = new int[]{31, 28, 29, 30, 31, 31, 31, 31, 30, 31, 30, 31};

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
     * @param fechaDada es la cadena que pasamos desde fuera para comprobar:
     * @param Valor que se quiere comprobrar
     * @return Devuelvet true si es correcta y modifica las propiedades de la
     * fecha en caso contrario devueltve false y deja sin modificar las
     * propiedades.
     */
    public boolean comprobarFecha(String fechaDada) {

        boolean correcto = false;

        String[] fechaDividida = fechaDada.split("/");

        if (fechaDividida.length == 3) {

            try {

                dia = Integer.parseInt(fechaDividida[0]);
                mes = Integer.parseInt(fechaDividida[1]);
                anno = Integer.parseInt(fechaDividida[2]);

                if (anno > 1000 && anno < 3000) {

                    dias[1] = bisiesto();

                    if (mes >= 1 && mes <= 12) {

                        if (dia > 1 && dia <= dias[mes - 1]) {

                            correcto = true;

                        }

                    }

                }

            } catch (NumberFormatException ex) {

            }

        }

        return false;
    }

    public int bisiesto() {

        int ndias = 28;

        if (anno % 4 == 0 && anno % 100 != 0 || anno % 400 == 0) {

            ndias = 29;

        }

        return ndias;
    }

    public int compararFechas(Fecha fcomparar) {

        int resultado = 0;

        if (this.anno < fcomparar.getAnno()) {

            resultado = -1;

        } else if (this.anno > fcomparar.getAnno()) {

            resultado = 1;

        } else if (this.mes < fcomparar.getMes()) {
            resultado = -1;

        } else if (this.mes > fcomparar.getMes()) {
            resultado = 1;

        } else if (this.dia < fcomparar.getDia()) {

            resultado = -1;
        } else if (this.dia > fcomparar.getDia()) {

            resultado = 1;
        } else {

            resultado = 0;

        }

        return resultado;
    }

    public int calculoAnnos() {

        int nannos;
        Fecha factual = new Fecha();
        nannos = factual.getAnno();

        if (mes > factual.getMes() || mes == factual.getMes() && dia > factual.getDia()) {

            nannos--;

        }

        return nannos--;

    }
    
    
        public int calculoAnnos(int factual) {

        int nannos;
        Fecha factual = new Fecha();
        nannos = factual.getAnno();

        if (mes > factual.getMes() || mes == factual.getMes() && dia > factual.getDia()) {

            nannos--;

        }

        return nannos--;

    }
        
        
        public void grabar(String nombre, Fecha Falta){
        
        
            this.nombre= nombre;
            
        
        }

}
