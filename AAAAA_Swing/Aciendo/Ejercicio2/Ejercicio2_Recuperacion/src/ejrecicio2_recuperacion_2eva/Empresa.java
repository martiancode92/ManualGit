/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejrecicio2_recuperacion_2eva;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import numero.Numero;

/**
 *
 * @author USUARIO
 */
public class Empresa {

    Cliente[] cliente;
    float limite[];
    int dias[];
    float descuento[][];

    public Empresa(int n) {

        cliente = new Cliente[n];

        dias = new int[]{30, 90, 120, 180, Integer.MAX_VALUE};// nos sirve de indice para saber a que fila acceder del bidimensional
        limite = new float[]{10000f, 15000f, 20000f, 25000f, Float.MAX_VALUE};// nos sirve de indice para saber a que columna acceder del bidimensional

        descuento = new float[][]{//esta tabla nos sirve para aplicar el descuento al cliente
            {10f, 12f, 18f, 22f, 35f},
            {8f, 10f, 16f, 21f, 30f},
            {6f, 8f, 14f, 19f, 25f},
            {4f, 5f, 12f, 17f, 21f},
            {3f, 4f, 10f, 15f, 20f}

        };

    }

    public String pedirString(String mensaje) throws IOException {

        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        String dato = "";
    try {
        System.out.println(mensaje);
        dato = teclado.readLine();

    

            while (dato.trim().equals("")) {

                System.out.println(mensaje);
                dato = teclado.readLine();
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
                fecha = pedirString(mensaje);
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

                }

            } while (!correcto);

        } catch (IOException ex) {

        }

        return falta;
    }

    public void cargarClientes() throws IOException {

        String cif;
        String nombre;
        Fecha fFactura;
        int diasVen;
        float importeFactura;

        for (int i = 0; i < cliente.length; i++) {

            cliente[i] = new Cliente();

            cif = pedirString("Ingrese el Cif del Cliente " + i );
            nombre = pedirString("Ingrese el Nombre del Cliente " + i );
            fFactura = pedirFecha("Ingrese la Fecha de la Factura del cliente " + nombre);
            diasVen = Numero.pedirNumero("Introduce los dias de vencimiento de la factura");
            importeFactura = (float) Numero.pedirNumeroReal("Introduce el Importe de la factura", 0, Float.MAX_VALUE);

            cliente[i].grabarCliente(cif, nombre, fFactura, diasVen, importeFactura);

        }

    }

    public int busquedaColumna(float importe) {

        boolean encontrado = false;
        int p = 0;
        while (p < limite.length && !encontrado) {

            if (limite[p] > importe) {
                encontrado = true;
            } else {
                p++;
            }
        }

        return p;
    }

    public int busquedaFila(int diasVencimiento) {

        boolean encontrado = false;
        int p = 0;
        while (p < dias.length && !encontrado) {

            if (dias[p] > diasVencimiento) {
                encontrado = true;
            } else {
                p++;
            }
        }

        return p;
    }
    
    

    public void Informe() {

        System.out.println("\t\t\t\t\t\t\t INFORME EMPLEADOS \n\n");
        System.out.println("\tCif \t\tNombre \t\tFechaVencimiento \t\tImporteFactura \t\tImporteNeto\n");

        int columna;
        int fila;
        int diasV;
        float porcent;
        float neto = 0;
        Fecha f ;
        float importeInf=9999;
        

        for (int i = 0; i < cliente.length; i++) {
            
             if (cliente[i].getImporteFactura()>importeInf) {
                 
            System.out.print("\t" + cliente[i].getCif());// cif del cliente
            System.out.print("\t\t" + cliente[i].getNombre() + "\t\t");// nombre cliente

            f = cliente[i].getfFactura();//aqui he creado un objeto que contiene la fecha de la factura
            diasV = cliente[i].getDiasVencimiento();//aqui la variable que contiene los dias de vencimiento

            System.out.print(f.sumarDias(diasV).visualizarMesLetra());//aqui el resultado de la fecha de vencimiento    

            columna = busquedaColumna(cliente[i].importeFactura);//
        
            fila = busquedaFila(diasV);
            porcent = descuento[fila][columna];

            System.out.print("\t\t" + cliente[i].getImporteFactura() + "\t\t");//importe de la factura
            float des = cliente[i].getImporteFactura() * porcent / 100;
            neto = cliente[i].getImporteFactura() - des;
            System.out.print("\t"+neto + "\n");// este es el importe aplicando el descuento                    
              
                        
            }else{
                 
            System.out.print("\t" + cliente[i].setCif());// cif del cliente
            System.out.print("\t" + cliente[i].setNombre());// nombre cliente
            System.out.print("\t"+"00/00/00"+ "\t\t");
            System.out.print("\t"+cliente[i].setImporte() + "\t\t");
            System.out.print("\t"+" importe inferior a 10.000€"+"\n");
          
           



          
        }//else
        }
    }

}
