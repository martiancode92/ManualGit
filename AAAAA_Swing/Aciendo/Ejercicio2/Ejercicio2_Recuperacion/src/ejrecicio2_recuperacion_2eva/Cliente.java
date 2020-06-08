/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejrecicio2_recuperacion_2eva;

/**
 *
 * @author USUARIO
 */
public class Cliente {
    
    String cif;
    String nombre;
    Fecha fFactura;
    int diasVencimiento;
    float importeFactura;

    public Cliente(String cif, String nombre, Fecha fFactura, int diasVencimiento, float importeFactura) {
        this.cif = cif;
        this.nombre = nombre;
        this.fFactura = fFactura;
        this.diasVencimiento = diasVencimiento;
        this.importeFactura = importeFactura;
    }
    
    public void grabarCliente(String cif, String nombre, Fecha fFactura, int diasVencimiento, float importeFactura){
    
    this.cif = cif;
        this.nombre = nombre;
        this.fFactura = fFactura;
        this.diasVencimiento = diasVencimiento;
        this.importeFactura = importeFactura;
   
    }

    public Cliente() {
    }

    public String getCif() {
        return cif;
    }

    public String getNombre() {
        return nombre;
    }

    public Fecha getfFactura() {
        return fFactura;
    }
    

    public String getfFacturaLetra() {
       String mensaje=fFactura.visualizarMesLetra();
        return mensaje;
    }

    public int getDiasVencimiento() {
        return diasVencimiento;
    }

    public float getImporteFactura() {
        return importeFactura;
    }
    
    /**
     * Estos metodos de abajo los creo para ocultar los datos de los clientes 
     * que no superen un importe de 10.000 €
     * @return 
     */
    
    
    public String setCif(){
    
    this.cif="*********";
    
    return cif;
    }
    
    public String setNombre(){
    
    
    this.nombre="**********";
    
    return nombre;
    }
    
    public float setImporte(){
   
    return importeFactura=0;
    }
    

    }

