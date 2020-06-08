/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import numero.Numero;

/**
 *
 * @author USUARIO
 */
public class Empresa {

    Modelo[] modelo;
    float[] limite;
    int [] fila;
    float[][] tarifas;

    public Empresa(int nCoches) {

        modelo = new Modelo[nCoches];

        limite = new float[]{1500f, 30000f, 50000f, 100000f, Float.MAX_VALUE};
        fila= new int[]{};
        tarifas = new float[][]{
            {0.15f, 10f, 0.10f, 0.18f, 0.06f},
            {0.18f, 12f, 0.14f, 0.20f, 0.08f},
            {0.21f, 0.14f, 0.16f, 0.22f, 0.10f}

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

            System.out.print("debe Introducir datos");
        }
        return dato;
    }

    public Fecha pedirFecha(String mensaje) {

        boolean correcto = false;
        Fecha falta = new Fecha();
        Fecha fhoy = new Fecha();

        String fecha = pedirString(mensaje);

        do {
            if (falta.comprobarFecha(fecha)) {
                if (falta.compararFecha(fhoy) != 1) {//la fecha de alta no puede ser superior a la de hoy
                    correcto = true;

                } else {
                    correcto=false;
                    pedirString("La fecha es superiror a la de hoy");
                }
            } else {
                correcto=false;
                pedirString("La fecha no respeta el formato");

            }
        } while (!correcto);

        return falta;
    }
    
    
    public int buscarColumna(float precio){
    
        int pos=0;
        boolean encontrado= false;
        while(pos<limite.length && !encontrado){
        
            if(limite[pos]>precio){
            
                encontrado= true;
            
            }
        
        }
    
    
        return pos;
    }
    
    public void cargarModelo(){
        
        String model;
        int tipo;
        
        for(int i=0;i<modelo.length;i++){
        
            modelo[i]=new Modelo();
            
            model=pedirString("Introduce el modelo del coche ");
            tipo=Numero.pedirNumero("Introduce el tipo de coche\n"+ "1-Turismo:\n"+ "2-Deportivo:\n"+ "2-Todo_Terreno:\n");
            modelo[i].grabar(model, tipo);
        }
      
    }
    
    public void cargarVentas(){
    
    Fecha fven;   
    float precio;
    
    for(int i=0; i<modelo.length;i++){
    
        fven=pedirFecha("Asignar fecha de venta al coche con modelo"+modelo[i].getModelo());
        precio= Numero.pedirNumero("Asignar precio al coche con modelo"+modelo[i].getModelo());
             modelo[i].setFven(fven);
             modelo[i].setPrecio(precio);
    
    }
    
    
    
    }
}
