/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut6biejercicio5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Barbero
 */
public class Empresa {
    
    Empleado[]empleados;
    String[]categorias;
    Float[][]pagos;
    Descuento[]descuentos;

    public Empresa() {
        empleados = new Empleado[10];
        categorias = new String[] {"operados", "programador", "analista", "jefe proyecto"};
        descuentos = new Descuento[] {
            new Descuento(300f,0.05f), 
            new Descuento(600f,0.10f),
            new Descuento(Float.MAX_VALUE,0.15f)
        };
        pagos = new Float[][] {
            {6f,7.5f},
            {8f,10.5f},
            {10f,15f},
            {14f,20f}
        };
        crearTrabajadores();
    }
    
    public Empresa(int nemple) {
        empleados = new Empleado[nemple];
        categorias = new String[] {"operador", "programador", "analista", "jefe proyecto"};
        descuentos = new Descuento[] {
            new Descuento(300f,0.05f), 
            new Descuento(600f,0.10f),
            new Descuento(Float.MAX_VALUE,0.15f)
        };
        pagos = new Float[][] {
            {6f,7.5f},
            {8f,10.5f},
            {10f,15f},
            {14f,20f}
        };
        crearTrabajadores();
    }
    
    public void crearTrabajadores(){
        for(int i = 0;i < empleados.length;i++){
            empleados[i] = new Empleado();
        }
    }
    
    public void cargarDatos(){
        String nombre;
        Fecha falta;
        int categoria;
        int nhoras;
        for(int i = 0;i < empleados.length;i++){
            nombre = pedirNombre("introduzca el nombre del empleado");
            falta = pedirFecha("introduzca la fecha de alta del empleado");
            visualizarCategorias();
            categoria = pedirNumero("introduzca la categoria",0,3);
            nhoras = pedirNumero("introduzca el numero de horas",0,Integer.MAX_VALUE);
            empleados[i].grabar(nombre, falta, categoria, nhoras);
        }
    }
    
    public void informe(){
        float salarioBruto;
        float descuento;
        int porDescuento;
        float salarioNeto, salarioTotal = 0, media;
        System.out.println("\t\t\tINFORME DE EMPLEADOS");
        System.out.println("NOMBRE \tCATEGORIA \tSALARIO BRUTO \tDESCUENTO \tSALARIO NETO");
        media = calcularMedia() / empleados.length;
        for(int i = 0;i < empleados.length;i++){
            if(empleados[i].getHoras() <= 40){
                salarioBruto = empleados[i].getHoras() * pagos[empleados[i].getCategoria()][0]
                    + 50 * (empleados[i].getFalta().calculoAnnos() / 3);
            }else{
                salarioBruto = 40 * pagos[empleados[i].getCategoria()][0] 
                    + (empleados[i].getHoras() - 40)* pagos[empleados[i].getCategoria()][1] 
                    + 50 * (empleados[i].getFalta().calculoAnnos() / 3);
            }
            porDescuento = busquedaDescuento(salarioBruto);
            descuento = salarioBruto * descuentos[porDescuento].getDescuento();
            salarioNeto = salarioBruto - descuento;
            if(salarioNeto > media){
                System.out.println(empleados[i].getNombre() + "  \t" + empleados[i].getCategoria() 
                        + "        \t" + salarioBruto + "  \t" + descuento + "          \t" + salarioNeto); //340 1200
            }
        }
    }
    
    public float calcularMedia(){
        float salarioBruto;
        float descuento;
        int porDescuento;
        float salarioNeto, salarioTotal = 0;
         for(int i = 0;i < empleados.length;i++){ //for (Empleado empleado : empleados)
            if(empleados[i].getHoras() <= 40){
                salarioBruto = empleados[i].getHoras() * pagos[empleados[i].getCategoria()][0]
                    + 50 * (empleados[i].getFalta().calculoAnnos() / 3);
            }else{
                salarioBruto = 40 * pagos[empleados[i].getCategoria()][0] 
                    + (empleados[i].getHoras() - 40)* pagos[empleados[i].getCategoria()][1] 
                    + 50 * (empleados[i].getFalta().calculoAnnos() / 3);
            }
            porDescuento = busquedaDescuento(salarioBruto);
            descuento = salarioBruto * descuentos[porDescuento].getDescuento();
            salarioNeto = salarioBruto - descuento;
            salarioTotal = salarioTotal + salarioNeto;
            //System.out.println(salarioBruto);
            //System.out.println(porDescuento);
        }
         return salarioTotal;
    }
    
    public void visualizarCategorias(){
        for(int i = 0;i < categorias.length;i++){
            System.out.println(i + " " + categorias[i]);
        }
    }
    
    public int busquedaDescuento(float salarioBruto){
        int cate = 0;
        boolean encontrado = false;
        while(cate < descuentos.length && !encontrado){ //encontrado == false
            if(salarioBruto <= descuentos[cate].getLimite()){
		encontrado = true;
            }else{
		cate++;
            }
        }
        return cate;
    }
    
    public Fecha pedirFecha(String mensaje){
        boolean correcto;
	String fecha;
	Fecha fhoy = new Fecha();
	Fecha falta = new Fecha();
	do{
            fecha = pedirNombre(mensaje);
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
    
     private String pedirNombre(String mensaje) {
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
     
     public int pedirNumero(String mensaje, int limiteInferior, int limiteSuperior) {
        InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader entrada = new BufferedReader(flujo);
        int numero = 0;
        boolean mal;
        try {
            mal = true;
            while (mal) {
                try {
                    System.out.println(mensaje);
                    numero = Integer.parseInt(entrada.readLine());
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
