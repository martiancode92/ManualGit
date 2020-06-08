 


package ut6_ejercicio1;





public class Modelo {
    
    private String modelo;
    private int tipo;
    private Fecha fventa;

    public Modelo(String modelo, int tipo) {
        this.modelo = modelo;
        this.tipo = tipo;
       
    }
    
    public void setFVentas(){
    
    
    fventa= new Fecha();
    
    }
    

    public Modelo() {
    }

    public String getModelo() {
        return modelo;
    }

    public int getTipo() {
        return tipo;
    }

    public Fecha getFventa() {
        return fventa;
    }
    
    
}
