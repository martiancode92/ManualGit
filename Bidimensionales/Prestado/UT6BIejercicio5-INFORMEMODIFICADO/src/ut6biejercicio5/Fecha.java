/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut6biejercicio5;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Barbero
 */
public class Fecha {
    /**
     * atributos de la clase fecha 
     */
    private int dia;
    private int mes;
    private int anno;
    private int[]dias;
    final static private String[]meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", 
            "septiembre", "octubre", "noviembre", "diciembre"}; //las variables constantes se escriben en mayusculas
    /**
     * contructor de la clase fecha, para iniciar las fechas al dia de hoy
     */
    public Fecha(){
	Calendar fhoy = new GregorianCalendar(); //ligadura dinamica: lo creo como el nivel mas alto
        dia = fhoy.get(Calendar.DAY_OF_MONTH);
        mes = fhoy.get(Calendar.MONTH) + 1;
        anno = fhoy.get(Calendar.YEAR);
        dias = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};
        //meses = new String[];
    }
    /**
     * metodo para retornar el valor de la variable dia
     * @return retornamos el valor de la variable dia
     */
    public int getDia() {
        return dia;
    }
    /**
     * metodo para retornar el valor de la variable mes
     * @return retornamos el valor de la variable mes
     */
    public int getMes() {
        return mes;
    }
    /**
     * metodo para retornar el valor de la variable año
     * @return retornamos el valor de la variable año
     */
    public int getAnno() {
        return anno;
    }
    /**
     * metodo que comprueba si es una fecha correcta
     * @param fechaDada valor que se quiere comprobar
     * @return devuelve true si es correcta, en caso contrario devuelve falso 
     * y deja sin modificar las propiedades
     */
    public boolean comprobarFecha(String fechaDada){
        boolean correcto = false;
        String[]fechaDividida = fechaDada.split("/");
        if(fechaDividida.length == 3){
            try{
                dia = Integer.parseInt(fechaDividida[0]);
                mes = Integer.parseInt(fechaDividida[1]);
                anno = Integer.parseInt(fechaDividida[2]);
                if(anno > 1000 && anno < 3000){
                    dias[1] = bisiesto(); //aqui pasaria el anno para utilizar el otro metodo
                    if(mes >= 1 && mes <= 12){
                        if(dia >= 1 && dia <= dias[mes - 1]){
                            correcto = true;
                            this.anno = anno;
                            this.mes = mes;
                            this.dia = dia;
                        }
                    }
                }

            }catch(NumberFormatException ex){

            }
        }
        return correcto;
    }
    /**
     * metodo que calcula si el año es bisiesto o no
     * @return retornamos el 29 si es bisiesto, 28 sino lo es
     */
    public int bisiesto(){
        int ndias = 28;
        if(anno % 4 == 0 && anno % 100 != 0 || anno % 400 == 0){
            ndias = 29;
        }
        return ndias;
    }
    /**
     * metodo que calcula si el año es bisiesto o no
     * @param anno le pasamos el año
     * @return retornamos el 29 si es bisiesto, 28 sino lo es
     */
    public int bisiesto(int anno){
        int ndias = 28;
        if(anno % 4 == 0 && anno % 100 != 0 || anno % 400 == 0){
            ndias = 29;
        }
        return ndias;
    }
    /**
     * metodo para comparar dos fechas
     * @param fcomparar fecha que le pasamos para que compare
     * @return retonamos -1 si es mas pequeña la fecha que llama, 1
     * si la fecha que gana es mas grande y 0 si son iguales
     */
    public int compararFechas(Fecha fcomparar){
        int resultado = 0;
        if(anno < fcomparar.getAnno()){
           resultado = -1;
        }else{
            if(anno > fcomparar.getAnno()){
                resultado = 1;
            }else{
                if(mes < fcomparar.getMes()){
                    resultado = -1;
                }else{
                    if(mes > fcomparar.getMes()){
                        resultado = 1;
                    }else{
                        if(dia > fcomparar.getDia()){
                            resultado = 1;
                        }else{
                            if(dia < fcomparar.getDia()){
                                resultado = -1;
                            }else{
                                resultado = 0;
                            }
                        }
                    }
                }
            }
        }
        return resultado;
    }
    /**
     * metodo que vale para saber la diferencia de años entre dos fehcas
     * @return retornamos la diferencia de años
     */
    public int calculoAnnos(){
        int nannos;
        Fecha factual = new Fecha();
        nannos = factual.getAnno() - anno;
        if(mes > factual.getMes() || mes == factual.getMes() && dia > factual.getDia()){
            nannos--;
        }
        return nannos;
    }
    /**
     * metodo que vale para saber la diferencia de años entre dos fehcas
     * @param factual le pasamos la fecha con la que queremos saber la diferencia
     * @return retornamos la diferencia de años
     */
    public int calculoAnnos(Fecha factual){
        int nannos;
        nannos =  this.getAnno() - factual.getAnno();
        if(mes > factual.getMes() || mes == factual.getMes() && dia > factual.getDia()){
            nannos--;
        }
        return nannos;
    }
    /**
     * metodo que sirve para sacar por pantalla la fecha del empleado
     * @return retornamos la fecha
     */
    public String visualizarLetra(){
        return dia + "/" + meses[mes - 1] + "/" + anno;
    }
}
