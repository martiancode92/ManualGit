
package ut_bi_ejer1;

import java.util.Calendar;
import java.util.GregorianCalendar;



public class Fecha {
    
    int dia;
    int mes;
    int anno;
    int diasMes[];
    String MESES[]= {"ENERO", "FEBRERO", "MARZO", "ABRIL",
        "MAYO", "JUNIO", "JULIO", "AGOSTO", "SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE", "DICIEMBRE"};

    public Fecha() {
        
        Calendar fhoy = new GregorianCalendar();
        
        dia= fhoy.get(Calendar.DAY_OF_MONTH);
        mes= fhoy.get(Calendar.MONTH)+1;
        anno=fhoy.get(Calendar.YEAR);
        diasMes= new int[]{31,28,29,30,31,31,31,31,30,31,30,31};
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
    
        boolean correcto= false;
        int dia = 0, mes = 0, anno = 0;
        String [] fechaDividida= fechaDada.split("/");
        
        if(fechaDividida.length==3){
        
        try{
            
            dia = Integer.parseInt(fechaDividida[0]);
            mes =  Integer.parseInt(fechaDividida[1]);
            anno =  Integer.parseInt(fechaDividida[2]);
        
        }catch(NumberFormatException ex){}
        
            if(anno>=1500 && anno<=3000){
                if(mes>=1 && mes<=12 ){
                    if(dia>=1 && dia<= diasMes[mes-1]){
                        correcto= true;
                    }
                
                }
            
            
            }
        
        }
 
    return correcto;
    }
    
    public int compararFecha(Fecha fcomparar){
    
        int resultado=0;
    
        if(anno< fcomparar.getAnno()){
        
            resultado=-1;
        }else if(anno> fcomparar.getAnno()){
        
            resultado=1;
        }else if(mes< fcomparar.getMes()){
        
            resultado=-1;
        }else if (mes>fcomparar.getMes()){
        
            resultado=1;
        }else if(dia<fcomparar.getDia()){
        
            resultado=-1;
        }else if (dia > fcomparar.getDia()){
        
            resultado=1;
        }
        
    return resultado;
    }
    
    public int calcularAnnos(Fecha fcomparar){
    
    int nAnnos = 0;
        
        nAnnos= fcomparar.getAnno()-anno;
        
        if(mes> fcomparar.getMes() || mes== fcomparar.getMes()
                && dia>fcomparar.getDia()){
        
        nAnnos--;
        
        }
    
    return nAnnos;
    }
    
    
          
    
}
