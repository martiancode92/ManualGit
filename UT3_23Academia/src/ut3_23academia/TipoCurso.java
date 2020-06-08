
package ut3_23academia;


public class TipoCurso {
    

    private String nombre;
    private String denominacion;
    private int plazas;
    private int contador;
    private int recaudacion;
    private int precio;
    
    
    public TipoCurso(String denominacion, int plazas){
        
        this.denominacion=denominacion;    
        this.plazas=plazas;
        
    }
    
    //me dice la denominacion del curso
    public String getDenominacion() {
        return denominacion;
    }
    
    // establecer y devolver nombre 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getContador() {
        return contador;
    }

    public int getRecaudacion() {
        return recaudacion;
    }

    public int getPlazas() {
        return plazas;
    }
    
    
    public void actualizarPlazas(){
    
    this.plazas--;
    this.contador++;
    
    }
    
    public void recaudacion(){
    
    this.recaudacion=contador*precio;
    
    
    }
    
    
    
    
    
    
    
    
}
