/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2eva;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class Fecha {
    
    int dia;
    int mes;
    int anno;
    String [] MESES ={"ENERO","FEBRERO","MARZO","ABRIL","MAYO","JUNIO"
            ,"JULIO","AGOSTO","SEPTIEMBRE","OCTUBRE","NOVIEMBRE","DICIEMBRE"};
    int [] diasMes ={31,28,29,30,31,31,31,31,30,31,30,31};  

    public Fecha() {
        
        Calendar fhoy= new GregorianCalendar();
        
        dia= fhoy.get(Calendar.DAY_OF_MONTH);
        mes= fhoy.get(Calendar.MONTH)+1;
        anno= fhoy.get(Calendar.YEAR);
        
        
        
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
    
    public boolean comprobarFecha(String fechaDada){
    
    boolean correcto = false;
    int dia = 0, mes = 0, anno = 0;
    String [] fechaDividida= fechaDada.split("/");
    
    if(fechaDividida.length==3){
    
        try{
             dia= Integer.parseInt(fechaDividida[0]);
             mes= Integer.parseInt(fechaDividida[1]);
             anno= Integer.parseInt(fechaDividida[2]);

        }catch(NumberFormatException ex){}
    
        
        if(anno>=1500 && anno<= 2100){
            
            if(mes>=1 && mes<=12){
                
                if(dia>=1 && dia<= diasMes[mes-1] ){
                
                    correcto= true;
                    this.dia=dia;
                    this.mes=mes;
                    this.anno=anno;
                
                }else{System.out.println("El dia no coincide con los Nº de dias por MES");}
            
            
            }else{System.out.println("El mes no coincide con los Nº de meses por AÑO");}
        }else{System.out.println("El año no coincide con los Nº de AÑOS MARCADO EN EL CALENDAIO ");}
        
    }
    
    return correcto;
    }
    
    public int compararFecha(Fecha fcomparar){
    int resultado = 0;
    
        if (anno< fcomparar.getAnno()){
            
            resultado=-1;
        }else if(anno> fcomparar.getAnno()){
        
             resultado=1;
        }else if(mes< fcomparar.getMes()){
        
             resultado=-1;
        
        }else if (mes> fcomparar.getMes()){
        
             resultado=1;
        }else if (dia< fcomparar.getDia()){
        
             resultado=-1;
        }else if(dia> fcomparar.getDia()){
        
             resultado=1;
        }
    
    
    return resultado;
    }
    
    public int calcularAnnos(){
    int annos = 0;
    String fecha;
    Fecha factual= new Fecha();
    
    
    annos= factual.getAnno()-anno;
    
    if (mes> factual.getMes()||
            mes== factual.getMes() && dia>= factual.getDia()){
    
        annos--;
    }
    
        
    return annos;
     
    }
    
        public String visualizarLetra(){
            
        return dia + "/" + MESES[mes - 1] + "/" + anno;
    }
    
    
    
}


