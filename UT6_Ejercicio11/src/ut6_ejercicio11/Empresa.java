package ut6_ejercicio11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import fecha.Fecha;

public class Empresa {

    Empleado[] empleados;
    Categoria[] categorias;
    Venta[] ventas;

    public Empresa() {

        empleados = new Empleado[10];

    }

    public Empresa(int numtrabajadores) {

        empleados = new Empleado[numtrabajadores];
        categorias = new Categoria[]{new Categoria("Administrativo", 1000f), new Categoria("Operador", 1100f),
            new Categoria("Programador", 1500f), new Categoria("Analista", 2000f)};
        ventas = new Venta[]{new Venta(10000, 0.05f), new Venta(15000, 0.10f), new Venta(20000, 0.15f), new Venta(25000, 0.20f), new Venta(Float.MAX_VALUE, 0.25f),};

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
            if (falta.compararFecha()) {
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
    
}
