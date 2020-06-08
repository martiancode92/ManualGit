/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut6_ejercico_3_bidemen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import numero.Numero;
import static numero.Numero.pedirNumero;

public class Empresa {

    Vendedor[] vende;
    float limites[];
    String zona[];
    float comi[][];
    Importe [] imp;

    public Empresa() {

        
        limites = new float[]{2000f, 5000f, 10000f, Float.MAX_VALUE};
        zona = new String[]{"Norte", "Sur", "Este", "Oeste"};
        comi = new float[][]{
                     //2k, 5k, 10k, +10k
            /*Norte*/{10f, 15f, 20f, 25f,},
            /*sur*/ {12f, 14f, 16f, 18f,},
            /*este*/ {5f, 7f, 10f, 15f,},
            /*oeste*/ {10f, 20f, 30f, 40f}

        };
            vende = new Vendedor[3];
            
    }
    
    public Fecha pedirFecha(String mensaje) throws IOException {

        boolean correcto;
        String fecha;
        Fecha fhoy = new Fecha();
        Fecha falta = new Fecha();
        do {
            fecha = pedirString(mensaje);
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

    

    public String pedirString(String mensaje) throws IOException {

        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        String dato = "";
        try {

   

            do {

                System.out.println(mensaje);
                dato = teclado.readLine();

            } while (dato.trim().equals(""));
        } catch (NumberFormatException ex) {

        }

        return dato;
    }

    public void cargarEmpleado() throws IOException {

        String nombre;
        int ubicacion=0;

        for (int i = 0; i < vende.length; i++) {

            vende[i] = new Vendedor();
            nombre = pedirString("Nombre Empleado ;");
            System.out.println("Introduce la zona del empleado"
                    + "\t  1- Norte \t  2- Sur \t 3-Este \t 4 - Oeste");
            ubicacion = pedirNumero("", 1, 4);

            vende[i].setNombre(nombre);
            vende[i].setZona(ubicacion);

        }

    }

    public void cargarVentas() throws IOException {
        
        float v;
        Fecha f;
        for (int i=0; i<vende.length; i++){
 
            v= Numero.pedirNumeroReal("Introduce las ventas del empleado "+vende[i].getNombre(), 1, Float.MAX_VALUE);
            f= pedirFecha("Introduce la fecha de la venta");
            vende[i].setImp(imp[i].setVenta(v);
        }

    }

}
