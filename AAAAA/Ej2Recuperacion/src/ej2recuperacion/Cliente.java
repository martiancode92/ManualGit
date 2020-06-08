/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2recuperacion;

/**
 *
 * @author Franciso Javier Alameda Díez
 */
public class Cliente {
   
    private String CIF;
    private String nombre;
    private Fecha fechaFactura;
    private int diasVencimiento;
    private float importeFactura;

    public Cliente() {
    }

    public Cliente(String CIF, String nombre, Fecha fechaFactura, int diasVencimiento, float importeFactura) {
        this.CIF = CIF;
        this.nombre = nombre;
        this.fechaFactura = fechaFactura;
        this.diasVencimiento = diasVencimiento;
        this.importeFactura = importeFactura;
    }
    
     public void guardarCliente(String CIF, String nombre, Fecha fechaFactura, int diasVencimiento, float importeFactura) {
        this.CIF = CIF;
        this.nombre = nombre;
        this.fechaFactura = fechaFactura;
        this.diasVencimiento = diasVencimiento;
        this.importeFactura = importeFactura;
    }

    public String getCIF() {
        return CIF;
    }

    public String getNombre() {
        return nombre;
    }

    public Fecha getFechaFactura() {
        return fechaFactura;
    }

    public int getDiasVencimiento() {
        return diasVencimiento;
    }

    public float getImporteFactura() {
        return importeFactura;
    }
    
    
    
}
