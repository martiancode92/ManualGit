/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biut6ejercicio2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author dam
 */
public class Empresa {
    
    Empleado[]empleados;
    Zona[]zonas;
    String[]situaciones; //fila
    float[]limites; //primero doy la fila y luego la columna
    float[][]porcentajes;

    public Empresa(int nempleado) {
        empleados = new Empleado[nempleado];
	zonas = new Zona[] {new Zona("CyL", 2000f), 
            new Zona("andalucia", 2200f), 
            new Zona("levante", 2500f), 
            new Zona("madrid", 3000f)};
	situaciones = new String[] {"soltero", "casado", "otras"};
	limites = new float[] {3000f, 5000f, 10000f, Float.MAX_VALUE};
	porcentajes = new float[][]
		{
		{0.10f,0.15f,0.20f,0.25f},
		{0.12f,0.14f,0.16f,0.18f},
		{0.05f,0.07f,0.10f,0.15f}
                                        };
    }
    
    public void cargarDatos(){
        String nombre;
        int zona;
        int situacion;
        float[]v;
        Fecha fecha;
	for(int i = 0;i < empleados.length;i++){
            fecha = new Fecha();
            v = new float[6];
            nombre = pedirString("introduzca el nombre del empleado");
            visualizarZonas();
            //zona = pedirEntero();
            visualizarSituacion();
            //situacion = pedirEntero();
            fecha = pedirFecha("");
            for(int mes = 0;mes < v.length;mes++){
		//v[mes] = pedirNumeroReal("ventas" + mes);
            }
            //empleados[i].grabar(nombre, zona, situacion, fecha, v);
	}
    }
    
    public void informe(){
        float sumaVentas;
        float antiguedad;
        float sueldoBruto;
        float sueldoNeto;
        int fila;
        int columna;
        for(int nemp = 0;nemp < empleados.length;nemp++){
            System.out.print(empleados[nemp].getNombre() + "\t");
            System.out.print(zonas[empleados[nemp].getZona()].getNombre() + "\t");
            System.out.print(empleados[nemp].getFalta().visualizarLetra() + "\t");
            sumaVentas = empleados[nemp].calcularVentas();
            for(int mes = 0;mes < empleados[nemp].getVentas().length;mes++){
                System.out.println(empleados[nemp].getUnaVentas(mes) + "\t");
            }
            antiguedad = empleados[nemp].getFalta().calculoAnnos() / 5 * 10;
            sueldoBruto = sumaVentas * 0.10f + zonas[empleados[nemp].getZona()].getSueldoBase() + antiguedad;
            fila = empleados[nemp].getSituacion();
            columna = busqueda(sueldoBruto);
            sueldoNeto = sueldoBruto * (1 - porcentajes[fila][columna]); //sueldoBruto - sueldoBruto * porcentajes[fila][columna]);
            System.out.println(sueldoNeto);
        }
    }
    
    public Fecha pedirFecha(String mensaje){
        boolean correcto;
	String fecha;
	Fecha fhoy = new Fecha();
	Fecha falta = new Fecha();
	do{
            fecha = pedirString(mensaje);
            if(falta.comprobarFecha(fecha)){
		if(falta.compararFechas(fhoy) != 1){
                    correcto = true;
		}else{
                    correcto = false;
                    System.out.println("la fecha es superior a la de hoy");
		}
            }else{
		correcto = false;
                System.out.println("la fecha no tiene el formato correcto");
            }
        }while(!correcto);
        return falta;
    }
    
    public int busqueda(float sueldoBruto){
	int pos = 0;
        boolean encontrado = false;
        while(pos < limites.length && !encontrado){ //encontrado == false
            if(limites[pos] < sueldoBruto){
                pos++;
            }else{
		encontrado = true;
            }
        }
        return pos;
    }
    
    public void visualizarZonas(){
        int num = 0;
        for(int i = 0;i < zonas.length;i++){
            System.out.println(num + zonas[i].getNombre());
            num++;
        }
    }
    
    public void visualizarSituacion(){
        int num = 0;
        for(int i = 0;i < situaciones.length;i++){
            System.out.println(num + situaciones[i]);
            num++;
        }
    }
    
    private String pedirString(String mensaje) {
       InputStreamReader flujo = new InputStreamReader(System.in);
       BufferedReader entrada = new BufferedReader(flujo);
       String dato = ""; //puedo poner new string tambien
       try {
           System.out.println(mensaje);
           dato = entrada.readLine();
           while(dato.trim().isEmpty()){ //dato.trim().equals("")
               System.out.println("no es un tipo de curso valido");
               System.out.println(mensaje);
               dato = entrada.readLine();
           }
       }catch(IOException ex) {
           System.out.println("");
       }
       return dato;
    }
    
    public float pedirNumeroReal(String mensaje, float limiteInferior, float limiteSuperior) {
        InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader entrada = new BufferedReader(flujo);
        float numero = 0;
        boolean mal;
        try {
            mal = true;
            while (mal) {
                try {
                    System.out.println(mensaje);
                    numero = Float.parseFloat(entrada.readLine());
                    if (numero < limiteInferior || numero > limiteSuperior) {
                        System.out.println("No cumple las condiciones. Debe estar "
                                + "comprendido entre " + limiteInferior+ " y "+
                                limiteSuperior);
                    } else {
                        mal = false;
                    }
                } catch (NumberFormatException ex) {
                    System.out.println("No es un numero");
                }
            }
        } catch (IOException ex) {
        }
        return numero;
    }
}
