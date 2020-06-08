


package ut6_ejer_6;


public class Empleado {
    
    String nombre;
    Fecha falta;
    Hijo []hijo;
    
    public Empleado(String nombre, Fecha falta, Hijo [] hijo){
        
        this.nombre= nombre;
        this.falta= new Fecha();
        this.hijo= hijo;

        }
    
     public Empleado(String nombre, Fecha falta, int nHijos){
        
            this.nombre= nombre;
            this.falta= new Fecha();
            if(nHijos !=0)
                
                hijo= new Hijo[nHijos];
    
    }

    public Empleado() {
    }
     
     
     
     public String getNombre(){
     
     
         return nombre;
     }
     
     public Fecha getFecha(){
     
     
         return falta;
     }

     public void setNombre(String nombre){
     
     this.nombre=nombre;
     
     }
     
     public void setFalta(Fecha falta){
     
         this.falta=falta;
     }
     
     
     
     
    public Hijo [] getHijos(){
     
     
     return hijo;
     }
    public Hijo getUnHijo(int hi){
    
    return hijo[hi];
    
    }
     
     
     public void setHijos(Hijo[] hijos){
     
         this.hijo= hijos;
     
     }
     
     public void setUnHijo(int nHijo, Hijo hijos){
     
     
     hijo[nHijo]= hijos;
     
     }
     
     public int sumarHijos(){
         int total;
         
        return  total=hijo.length;
     
    
     }
    
    
}
