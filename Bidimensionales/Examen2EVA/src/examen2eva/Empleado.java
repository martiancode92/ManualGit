
package examen2eva;


public class Empleado {
    
    String nombre;
    Fecha falta;
    int cate;
    float xtras;
    
    public Empleado(){

    }

    public Empleado(String nombre, Fecha falta, int cate, float xtras) {
        this.nombre = nombre;
        this.falta = falta;
        this.cate = cate;
        this.xtras = xtras;
    }

    public String getNombre() {
        return nombre;
    }

    public Fecha getFalta() {
        return falta;
    }

    public int getCate() {
        return cate;
    }

    public float getXtras() {
        return xtras;
    }
    
    
}
