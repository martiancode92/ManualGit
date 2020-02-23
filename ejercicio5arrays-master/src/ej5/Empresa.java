/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author 203p21
 */
public class Empresa {

    Trabajador[] trabajadores;
    float[] importeTrienios;

    public Empresa() {
        importeTrienios = new float[]{
            0, 100f, 250f, 500f, 600f, 1200f, 1500f};
        trabajadores = new Trabajador[10];

    }

    public Empresa(int ntrabajadores) {
        importeTrienios = new float[]{
            0, 100f, 250f, 500f, 600f, 1200f, 1500f};
        trabajadores = new Trabajador[ntrabajadores];

    }

    public String pedirString(String mensaje) {
        InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader entrada = new BufferedReader(flujo);
        String dato = "";
        try {
            System.out.println(mensaje);
            dato = entrada.readLine();
            while (dato.trim().equals("")) {
                System.out.println("Introduce nombre: ");
                dato = entrada.readLine();
            }
        } catch (IOException ex) {
        }
        return dato;
    }

    public Fecha pedirFecha() {
        boolean correcto;
        String fecha;
        Fecha fhoy = new Fecha();
        Fecha falta = new Fecha();

        do {

            fecha = pedirString("Fecha alta:");
            if (falta.comprobarFecha(fecha)) {
                if (falta.compararFecha(fhoy) != 1) {
                    correcto = true;
                } else {
                    correcto = false;
                }
            } else {
                correcto = false;
            }
        } while (!correcto);
        return falta;
    }

    public void pedirDatos() {
        String nombre;
        Fecha falta;
        for (int ntra = 0; ntra < trabajadores.length; ntra++) {
            trabajadores[ntra] = new Trabajador();
            nombre = pedirString("Nombre:");
            falta = pedirFecha();
            trabajadores[ntra].grabar(nombre, falta);
        }
    }

    public void informe() {
        System.out.println("LISTADO DE TRABAJADORES ");
        System.out.println("NOMBRE\t F. ALTA\t N. TRIENIOS\t IMPORT");
        int ntrienios;
        for (int ntra = 0; ntra < trabajadores.length; ntra++) {
            System.out.print(trabajadores[ntra].getNombre());
            System.out.print("\t"
                    + trabajadores[ntra].getFalta().visualizarMesLetra());
            ntrienios = trabajadores[ntra].getFalta().calculoNAnos() / 3;

            System.out.print("\t" + ntrienios);
            if (ntrienios >= importeTrienios.length) {
                System.out.println("\t" + 
                        importeTrienios[importeTrienios.length - 1]);
            } else {
                System.out.println("\t" + importeTrienios[ntrienios]);
            }
        }
    }

}
