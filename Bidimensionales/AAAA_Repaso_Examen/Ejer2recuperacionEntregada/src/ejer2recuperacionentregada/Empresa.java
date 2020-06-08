/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer2recuperacionentregada;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import numero.Numero;

/**
 *
 * @author USUARIO
 */
public class Empresa {

    float[] limite;
    int[] diasV;

    Cliente[] clientes;

    float[][] tarifa;

    public Empresa(int num) {

        clientes = new Cliente[num];
        limite = new float[]{10000f, 15000f, 20000f, 25000f, Float.MAX_VALUE};
        diasV = new int[]{30, 90, 120, 180, Integer.MAX_VALUE};

        tarifa = new float[][]{//esta tabla nos sirve para aplicar el descuento al cliente
            {10f, 12f, 18f, 22f, 35f},
            {8f, 10f, 16f, 21f, 30f},
            {6f, 8f, 14f, 19f, 25f},
            {4f, 5f, 12f, 17f, 21f},
            {3f, 4f, 10f, 15f, 20f}

        };

    }

    public String pedirString(String mensaje) throws IOException {

        String dato = "";

BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
 
           
        try {
                       System.out.println(mensaje);
            dato = teclado.readLine().trim();

            while (dato.equals("")) {

                System.out.println(mensaje);
                dato = teclado.readLine().trim();
            }

        } catch (IOException ex) {

        }
        return dato;

    }

    public Fecha pedirFecha(String mensaje) {

        boolean correcto;
        Fecha fhoy = new Fecha();
        Fecha falta = new Fecha();
        String fecha;

        try {
            fecha = pedirString(mensaje).trim();
            do {
                if (falta.comprobarFecha(fecha)) {
                    if (falta.compararFecha(fhoy) != 1) {

                        correcto = true;

                    } else {
                        correcto = false;
                        System.out.println("La fecha es superior a la de hoy");

                    }

                } else {

                    correcto = false;
                    System.out.println("La fecha no respeta el formato00/00/0000");

                }
               

            } while (!correcto);

        } catch (IOException ex) {

        }
        return falta;
    }
    
    
    public void cargarClientes() throws IOException{
    
    
    String cif;
    String nombre;
    Fecha fFactura;
    int diasVencimiento;
    float importeFactura;
    
    for(int i=0; i<clientes.length;i++){
    
        clientes[i]= new Cliente();
        
        cif=pedirString("Introduce el cif del cliente: ");
        nombre= pedirString("Introdue el nombre del cliente: " );
        fFactura=pedirFecha("Introduce la fecha de la factura");
        diasVencimiento= Numero.pedirNumero("Introduce los dias de vencimiento");
        importeFactura= Numero.pedirNumeroReal("Introduce la cuantía", 0, Float.MAX_VALUE);
        
    
        clientes[i].grabarCliente(cif, nombre, fFactura, diasVencimiento, importeFactura);
    }
    
    
    
    }
    
    public void Informe(){
        
            System.out.println("\t\t\t\t\t\t\t INFORME EMPLEADOS \n\n");
        System.out.println("\tCif \t\tNombre \t\tFechaVencimiento \t\tImporteFactura \t\tImporteNeto\n");
        
        
        
        
        
        float irpf;
        int columna;
        int fila;
        float neto;
        
        for(int i=0; i<clientes.length;i++){
            
            System.out.print(clientes[i].getCif()+"\t");
            System.out.print("\t\t" +clientes[i].getNombre()+"\t");
            System.out.print("\t\t" +clientes[i].getfFactura()+"\t");
            fila= buscarDias(clientes[i].getDiasVencimiento());
            columna= buscarTarifa(clientes[i].getImporteFactura());
        
            irpf= tarifa[fila][columna];
            
            System.out.print(clientes[i].getImporteFactura());
           
            float des=  clientes[i].getImporteFactura() * irpf / 100;
            neto= clientes[i].getImporteFactura()-des;
            System.out.print("\t"+neto);
        }
    
    
    
    
    }
    
    public int buscarDias(int dias){
    
    boolean encontrado=false;
    
        int p=0;
        
        while(p<diasV.length && !encontrado){
        
        if(diasV[p]>dias){
            encontrado= true;
        
        
        }else{
        
           p++; }
        
        
        }
    
    return p;
    }
    
    public int buscarTarifa(Float sueldo){
    
    boolean encontrado= false;
    
    int p=0;
    
    while(p<limite.length && !encontrado){
    
        if(limite[p]>sueldo){
            encontrado=true;
        
        
        }else{
        
        p++;
        }
    
    }
    
    
    return p;
    }

}
