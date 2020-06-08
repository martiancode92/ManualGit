/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2_servicio_infor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import numero.Numero;

/**
 *
 * @author USUARIO
 */
public class Empresa {
    
    Zona[] zonas;
    Empleado[] empleados;
    float[] limites;
    float[][] tarifa;
    String []situacion;
    
    public Empresa(int num) {
        

        tarifa = new float[][]{
            {0.10f, 0.15f, 0.20f, 0.25f},
            {0.12f, 0.14f, 0.16f, 0.18f},
            {0.05f, 0.07f, 0.10f, 0.15f}
        
        };
        
        empleados = new Empleado[num];
        
        limites = new float[]{3000f, 5000f, 10000f, Float.MAX_VALUE};
        
        zonas = new Zona[]{
            new Zona("Castilla y Leon", 2000),
            new Zona("Andalucia", 2200),
            new Zona("Levante", 2500),
            new Zona("Madrid", 3000)
        
        };
        
    }
    
    public String pedirString(String mensaje) {
        
        String dato = "";
        
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            do {
                
                System.out.println(mensaje);
                dato = teclado.readLine();
                
            } while (dato.trim().equals(""));
            
        } catch (IOException ex) {
            
            System.out.println("Sucedio algo inesperado");
        }
        
        return dato;
    }
    
    public Fecha pedirFecha(String mensaje) {
        
        boolean correcto=false;
        
        Fecha fhoy = new Fecha();
        Fecha falta = new Fecha();
        String fecha;
        
       
        
        do {
             fecha = pedirString("Introduce fecha de alta");
            if (falta.comprobarFecha(fecha)) {
                if (falta.compararFecha(fhoy) != 1) {//esto dice que la fecha no puede ser mayor
                    correcto = true;
                    
                } else {
                    correcto = false;
                    System.out.println("La fecha es superior a la de hoy");
                    
                }
                
            } else {
                correcto = false;
                 System.out.println("La fecha no cumple el formato 00/00/0000");
            }
        } while (!correcto);
        
        return falta;
    }
    
    public void cargarEmpleados() {
        
        String nombre;
        int zona;
        int situacion;
        Fecha falta;
        int nVenta;
 
        for (int i = 0; i < empleados.length; i++) {
            
            empleados[i] = new Empleado();
            
            nombre = pedirString("Introduce el nombre del empleado");
            zona = Numero.pedirNumero("Introduce la zona\n" + "1-CyL\n 2-Andalucia\n 3-Levante\n 4-Madrid", 1, 4) -1;
            situacion = Numero.pedirNumero("Introduce tu situacion\n 1-Soltero\n 2-Casado\n 3-Otras Situaciones");
            falta = pedirFecha("Introduce la fecha de alta");
            nVenta= Numero.pedirNumero("Introduce el importe de la venta");
            
            
            
            empleados[i].grabar(nombre, zona, situacion, falta, Ventas v,);
            
        }
        
    }
    
    
    public void cargarVentas(){
    
    
    
    
    
    }
    
    public int buscarColumna(float sueldo){
    
    boolean encontrado= false;
    
    int pos=0;
    
    while(pos<limites.length && !encontrado){
    
        if(limites[pos]>sueldo){
            encontrado=true;
        
        }else{
        
          pos++;  
        
        }
    
    
    }
    
    
    return pos;
    
    }
    public int contarVentas(float ventas){
        
       
        int count=0;
        
        
        
        
        
        count++;
        
        
        return count;
    }
    
    
    public void Informe(){
    
    
        String nombre;
        int zona;
        int situacion;
        Fecha falta;
        
        
        System.out.println("\t\t\t\tINFORME EMPLEADOS");
        System.out.println("Zona\t\tNombreEmpleado\t\tF.AltaVentas\tTotalVentas\tSueldoPercibir");
        
        for(int i=0; i<empleados.length;i++){
            System.out.print(zonas[empleados[i].getZona()].getDeno()+"\t");
            System.out.print("\t"+empleados[i].getNombre()+"\t");
            System.out.print("\t"+empleados[i].getFalta()+"\t");
        
        
        }
    
    }
    
}
