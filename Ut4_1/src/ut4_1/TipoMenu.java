/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut4_1;

public class TipoMenu {
    
    private int denominacion;
    private int canapes;
    private int sandwiches;
    private int asistentes;

    public TipoMenu(int denominacion) {
        this.denominacion = denominacion;
    }

    public int getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(int denominacion) {
        this.denominacion = denominacion;
    }

    public int getCanapes() {
        return canapes;
    }

    public void setCanapes(int canapes) {
        this.canapes = canapes;
    }

    public int getSandwiches() {
        return sandwiches;
    }

    public void setSandwiches(int sandwiches) {
        this.sandwiches = sandwiches;
    }

    public int getAsistentes() {
        return asistentes;
    }

    public void setAsistentes(int asistentes) {
        this.asistentes = asistentes;
    }


    public void addMenu(int asis, int canapes, int sandwiches){
    
    this.asistentes=this.asistentes+asis;
    this.canapes=this.canapes+canapes;
    this.sandwiches=this.sandwiches+sandwiches;
    
    }
    
    
    
}
