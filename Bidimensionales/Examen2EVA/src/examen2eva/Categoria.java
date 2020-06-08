


package examen2eva;


public class Categoria {
    
    String denominacion;
    float sbase;
    float precioXtras;

    public Categoria() {
    }

    public Categoria(String denominacion, float sbase, float precioXtras) {
        this.denominacion = denominacion;
        this.sbase = sbase;
        this.precioXtras = precioXtras;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public float getSbase() {
        return sbase;
    }

    public float getPrecioXtras() {
        return precioXtras;
    }
    
    
    
}


