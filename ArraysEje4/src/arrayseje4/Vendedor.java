
package arrayseje4;


public class Vendedor {

    private String nombre;
    private float ventas;

    public Vendedor(String nombre) {
        this.nombre = nombre;
        
    }

    public String getNombre() {
        return nombre;
    }

    public float getVentas() {
        return ventas;
    }

    //Para calcular las ventas totales de cada empleado
        public void acumularVentas (float importe){
            ventas= ventas +importe;
        }


        
       
}
