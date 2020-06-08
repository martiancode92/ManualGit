/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3libreria;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author USUARIO
 */
public class Fecha {

    int dia, mes, anno;

    String[] MESES = {"ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO", "JUULIO",
        "AGOSTO", "SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE", "DICIEMBRE"};
    int diasMes[] = {31, 28, 29, 30, 31, 31, 31, 31, 30, 31, 30, 31};

    public Fecha() {

        Calendar fhoy = new GregorianCalendar();

        dia = fhoy.get(Calendar.DAY_OF_MONTH);
        mes = fhoy.get(Calendar.MONTH) + 1;
        anno = fhoy.get(Calendar.YEAR);

    }

    public boolean comprobarFecha(String fechaDada) {

        boolean correcto = false;
        int dia, mes, anno;
        String[] fechaDividida = fechaDada.trim().split("/");

        if (fechaDividida.length == 3) {

            dia = Integer.parseInt(fechaDividida[0]);
            mes = Integer.parseInt(fechaDividida[1]);
            anno = Integer.parseInt(fechaDividida[2]);

            if (anno > 1800 && anno <= 2020) {
                if (mes >= 1 && mes <= 12) {
                    if (dia >= 1 && dia <= diasMes[mes - 1]) {
                        this.dia = dia;
                        this.mes = mes;
                        this.anno = anno;
                        correcto = correcto;

                    }

                }

            }

        }

        return correcto;
    }
    
    
    public int compararFecha(Fecha fComparar){
    
    int resultado =0;
    
    if(anno>fComparar.getAnno()){
    
        resultado=1;
    }else if(anno< fComparar.getAnno()){
    
        resultado=-1;
    }if(mes>fComparar.getMes()){
    
        resultado=1;
    }else if(mes< fComparar.getMes()){
    
        resultado=-1;
    }if(dia>fComparar.getDia()){
    
        resultado=1;
    }else if(dia< fComparar.getDia()){
    
        resultado=-1;
    }
    
     
    return resultado;
 }

    public int getDia() {
        return dia;
    }

    public int getAnno() {
        return anno;
    }

    public int getMes() {
        return mes;
    }
    
    public String visualizarFecha(){
    
       String mensaje=dia+"/"+MESES+"/"+anno;
    
    
    return mensaje;
    }
    
    
    public Fecha sumarDias(int diasVen){
        
        dia= dia+diasVen;
        
        while(dia>diasMes[mes-1]){
        
            dia= dia-diasMes[mes-1];
            
            mes++;
            
            if(mes>12){
                mes=1;
                
                anno++;
               
            }

        }
        return this;    
    }
    

    
}








