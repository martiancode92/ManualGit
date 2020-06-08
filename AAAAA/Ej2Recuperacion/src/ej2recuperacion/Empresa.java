/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2recuperacion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import numero.Numero;

/**
 *
 * @author Franciso Javier Alameda Díez
 */
public class Empresa {

    Cliente[] clientes;
    int[] diasVencimiento;
    float[] limites;
    float[][] descuento;

    public Empresa(int nClientes) {
        clientes = new Cliente[nClientes];
        diasVencimiento = new int[]{30, 90, 120, 180, Integer.MAX_VALUE};;
        limites = new float[]{10000f, 15000f, 20000f, 25000f, Float.MAX_VALUE};;
        descuento = new float[][]{
            {10f, 12f, 18f, 22f, 35f},
            {8f, 10f, 16f, 21f, 30f},
            {6f, 8f, 14f, 19f, 25f},
            {4f, 5f, 12f, 17f, 21f},
            {3f, 4f, 10f, 15f, 20f}
        };
    }

    public String pedirString(String mensaje) {
        InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(flujo);
        String dato = "";
        try {
            System.out.print(mensaje);
            dato = teclado.readLine();
            while (dato.trim().equals("")) {
                System.out.print(mensaje);
                dato = teclado.readLine();
            }
        } catch (IOException es) {
        }
        return dato;
    }

    public Fecha pedirFecha(String mensaje) {

        boolean correcto;
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
            }
        } while (!correcto);
        return falta;
    }

    public int busquedaColumna(float importe) {
        boolean encontrado = false;
        int p = 0;
        while (p < limites.length && !encontrado) {
            if (limites[p] > importe) {
                encontrado = true;
            } else {
                p++;
            }
        }
        return p;
    }

    public int busquedaFila(int diasV) {
        boolean encontrado = false;
        int p = 0;
        while (p < diasVencimiento.length && !encontrado) {
            if (diasVencimiento[p] > diasV) {
                encontrado = true;
            } else {
                p++;
            }
        }
        return p;
    }

    public void cargarDatos() {
        InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(flujo);
        String CIF;
        String nombre;
        Fecha fechaFactura;
        int diasVencimiento;
        float importeFactura;
        for (int nclientes = 0; nclientes < clientes.length; nclientes++) {
            
         
            clientes[nclientes] = new Cliente();
            
            
            CIF = pedirString("Introduce CIF: ");
            nombre = pedirString("Introduce nombre: ");
            fechaFactura = pedirFecha("Introduce fecha de la facutra: ");
            diasVencimiento = Numero.pedirNumero("Introduce los dias de vencimiento de la factura");
            importeFactura = (float) Numero.pedirNumeroReal("Introduce el Importe de la factura", 0, Float.MAX_VALUE);
                clientes[nclientes].guardarCliente(CIF, nombre, fechaFactura, diasVencimiento, importeFactura);
        }
    }

    public void informe() {
        System.out.println("\t\t\t\t\t\t\t INFORME EMPLEADOS \n\n");
        System.out.println("\tCIF \t\tNombre \t\tFecha de Vencimiento \t\tImporte de Factura \t\tImporte Neto");
        
        int columna;
        int fila;
        int diasVencimiento;
        float porcentaje;
        float importeNeto;
        Fecha fechaFactura;
        for (int nclientes = 0; nclientes < clientes.length; nclientes++) {
            System.out.print("\t" + clientes[nclientes].getCIF());
            System.out.print("\t\t" + clientes[nclientes].getNombre() + "\t\t");
            fechaFactura = clientes[nclientes].getFechaFactura();
            diasVencimiento = clientes[nclientes].getDiasVencimiento();
            System.out.print(fechaFactura.sumarDias(diasVencimiento).visualizarLetra());
            columna = busquedaColumna(clientes[nclientes].getImporteFactura());
            fila = busquedaFila(diasVencimiento);
            porcentaje = descuento[fila][columna];
            System.out.print("\t\t" + clientes[nclientes].getImporteFactura() + "\t\t\t");
            float des = clientes[nclientes].getImporteFactura() * porcentaje / 100;
            System.out.print(clientes[nclientes].getImporteFactura() - des + "\n");
        }
    }

}
