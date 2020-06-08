package ut6_ejer2_bidi;

public class Empleado {

    String nombre;
    int zona;
    int situacion;
    Fecha falta;
    float ventas;

    public Empleado() {
    }

    public Empleado(String nombre, int zona, int situacion, Fecha falta, float ventas) {
        this.nombre = nombre;
        this.zona = zona;
        this.situacion = situacion;
        this.falta = new Fecha();
        this.ventas = ventas;
    }

    public String getNombre() {
        return nombre;
    }

    public int getZona() {
        return zona;
    }

    public int getSituacion() {
        return situacion;
    }

    public Fecha getFalta() {
        return falta;
    }

    public float getVentas() {
        return ventas;
    }
    
    /*
    public Fecha calcuarQinquenio(Fecha recibida){
    
        Fecha quin = null;
            
        quin= recibida.calculoAnnos()/5;
            
        return quin;     
    }
    */
    
    
}
