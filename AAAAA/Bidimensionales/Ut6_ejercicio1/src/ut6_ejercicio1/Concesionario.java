/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut6_ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import numero.Numero;

/**
 *
 * @author USUARIO
 */
public class Concesionario {

    Modelo[] model;
    float limites[];

    float beneficio[][];

    public Concesionario(int nmodel) {

        model = new Modelo[nmodel];

        limites = new float[]{1500f, 30000f, 50000, 100000, Float.MAX_VALUE};

        beneficio = new float[][]{
            {0.15f, 0.10f, 0.10f, 0.18f, 0.6f},
            {0.18f, 0.12f, 0.14f, 0.20f, 0.8f},
            {0.21f, 0.14f, 0.16f, 0.22f, 0.10f}

        };

    }

    public String pedirString(String mensaje) {

        String dato = "";
        boolean mal = false;
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        try {

            System.out.println(mensaje);
            dato = teclado.readLine();
            do {

                if (dato.trim().equalsIgnoreCase("")) {

                    System.out.println(mensaje);
                    dato = teclado.readLine();

                }

            } while (!mal);

        } catch (IOException ex) {

        }
        return dato;
    }

    public Fecha pedirFecha(String mensaje) {

        Boolean correcto = false;
        Fecha fhoy = new Fecha();
        Fecha falta = new Fecha();
        String fecha;

        do {
            fecha = pedirString(mensaje);

            if (falta.comprobarFecha(fecha)) {
                if (falta.compararFecha(fhoy) != 1) {
                    correcto = true;

                } else {
                    correcto = false;
                    System.out.println("La fecha es superior a la de hoy");

                }

            } else {

                correcto = false;
                System.out.println("No cumple las condiciones "
                        + "\n por favor ingrese la fecha en el sigiente formato"
                        + "\n dd/mm/aaaa");

            }

        } while (!correcto);

        return falta;
    }

    public void cargarModelos() {

        String nombre;
        int tipo;

        for (int i = 0; i < model.length; i++) {

            nombre = pedirString("Modelo del Choche :");
            tipo = Numero.pedirNumero("Ingrese el tipo \n 1- Turismo \n 2- Deportivo \n 3- 4X4", 1, 3);

            model[i] = new Modelo(nombre, tipo);

        }

    }
    
    public void cargarVentas(){
    
    Fecha fventa;
    
    for(int i =0; i< model.length;i++){
    
        fventa= pedirFecha("Fecha de venta de"+model[i].getModelo());
        model[i].setFVentas();
    
    }
    
    
    }

}
