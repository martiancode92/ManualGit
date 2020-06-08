
package ut4_11;

public class TipoMenu {
    
    int asistentes;
    int sandwiches;
    int canapes;
    int denominacion;

    public TipoMenu(int denominacion) {
        this.denominacion = denominacion;
    }

    public int getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(int denominacion) {
        this.denominacion = denominacion;
    }
    
    //getters

    public int getAsistentes() {
        return asistentes;
    }

    public int getSandwiches() {
        return sandwiches;
    }

    public int getCanapes() {
        return canapes;
    }
    
    //setters

    public void setAsistentes(int asistentes) {
        this.asistentes = asistentes;
    }

    public void setSandwiches(int sandwiches) {
        this.sandwiches = sandwiches;
    }

    public void setCanapes(int canapes) {
        this.canapes = canapes;
    }
    
    public void addMenu(int asis, int sandwiches, int canapes){
    
    
    this.asistentes+=asis;
    this.sandwiches=this.sandwiches+sandwiches;
    this.canapes+=canapes;
    
    
    
    
    }
    
    
    
    
    
    
}
