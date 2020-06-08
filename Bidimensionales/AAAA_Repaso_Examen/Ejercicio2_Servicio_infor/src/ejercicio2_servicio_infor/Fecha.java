/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2_servicio_infor;

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
    String []MESES;
    int []diasMes;

    public Fecha() {
        
        Calendar fhoy= new GregorianCalendar();
        
        dia= fhoy.get(Calendar.DAY_OF_MONTH);
        mes= fhoy.get(Calendar.MONTH)+1;
        anno= fhoy.get(Calendar.YEAR);
        
       MESES= new String[] {"ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO", "JULIO", "AGOSTO", "SEPTIEMBRE",
        "OCTUBRE", "NOVIEMBRE", "DICIEMBRE"};
       
       diasMes= new int[] {30, 28, 29, 30, 31, 30, 31, 31, 30, 31, 30, 31};
       
       
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
    
    int dia, mes , anno;    
    boolean correcto= false;
    String [] fechaDividida= fechaDada.trim().split("/");
    
    if(fechaDividida.length==3){
    
        
        dia= Integer.parseInt(fechaDividida[0]);
        mes=  Integer.parseInt(fechaDividida[1]);
        anno=  Integer.parseInt(fechaDividida[2]);

        
        if(anno>1500&& anno<=2020){
            if(mes>=1 && mes<=12){
                if(dia>=1 && dia<=12){
                    this.dia=dia;
                    this.mes=mes;
                    this.anno=anno;
                    correcto= true;

                }  
            }
        
        }
    
    }
    
    
    return correcto;
    
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
        
     public int calcularNAnnos(Fecha factual){
     
     int nAnnos= anno-factual.getAnno();
         
         if(mes>factual.getMes()|| mes==factual.getMes() && dia>=factual.getDia()){
         
         nAnnos--;
         
         }
     
     
     return nAnnos;
     }   

     public int calcularNAnnos(){
     
         Fecha factual = new Fecha();
     int nAnnos= anno-factual.getAnno();
         
         if(mes>factual.getMes()|| mes==factual.getMes() && dia>=factual.getDia()){
         
         nAnnos--;
         
         }
     
     
     return nAnnos;
     }   
     
     
     public String visualizarFecha(){
     
     String mensaje= dia +" de "+MESES[mes-1]+" de "+anno;
     
     
     return mensaje;
     }
     
     
     
   public Fecha sumarDias(int diasVen){
   
   dia=dia +diasVen;
   
   while(dia>diasMes[mes-1]){
   
       dia=dia-diasMes[mes-1];
           mes++;
        
       if(mes>12){
       
           mes=1;
           
           anno++;
       
       }
   }
   
   
   return this;
   }
        
    
}