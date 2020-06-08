package ut6_ejercico_3_bidemen;

public class Vendedor {

    String nombre;
    int zona;
    Importe[] imp;
    
    

    public Vendedor(String nombre, int zona, Importe[] impo) {
        this.nombre = nombre;
        this.zona = zona;
        this.imp = impo;
  
    }

    public Vendedor(String nombre, int zona, int nImp) {

        this.nombre = nombre;
        this.zona = zona;
        if (nImp != 0) {

            imp = new Importe[nImp];

        }
    }

    public Vendedor() {
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public int getZona() {
        return zona;
    }

    public Importe[] getImp() {
        return imp;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setZona(int zona) {
        this.zona = zona;
    }

    public void setImp(Importe[] imp) {
        this.imp = imp;
    }
    
    public void  setUnImporte(int nImp, Importe impo){
    
    imp[nImp]= impo;
    
    }
    
    public Importe getUnImporte(int nImp){
    
    
    return imp[nImp];
    }

}
