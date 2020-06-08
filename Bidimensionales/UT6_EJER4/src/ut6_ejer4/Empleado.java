




package ut6_ejer4;





public class Empleado {
    
    String nombre;
    Fecha falta;
    int cate;
    Hijo hijos[];

    public Empleado() {
    }

    public Empleado(String nombre, Fecha falta, int cate, Hijo[] hijos) {
        this.nombre = nombre;
        this.falta = falta;
        this.cate = cate;
        this.hijos = hijos;
        
    }
    
        public Empleado(String nombre, Fecha falta, int cate, int nhijos) {
        this.nombre = nombre;
        this.falta = falta;
        this.cate = cate;
        if (nhijos!=0)
       
            hijos=new Hijo[nhijos];         
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

    public Hijo[] getHijos() {
        return hijos;
    }
     
    public Hijo getUnHijo(int nhijo){
        return hijos[nhijo];
    }

    public void setHijos(Hijo[] hijos) {
        this.hijos = hijos;
    }
      public void setUnHijo(int nhijo, Hijo hijo) {
        hijos[nhijo] = hijo;
    }        

      
}
