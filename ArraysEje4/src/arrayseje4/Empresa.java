
package arrayseje4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import numero.Numero;


public class Empresa {

    Vendedor[] vendedores;
    Comision[] tabla;

    public Empresa() { // constructor que no recibe nada
        // tengo que inicializar la tabla. 

        //Constructor para probar con 5 vendedores
        tabla = new Comision[]{
            new Comision(10000f, 0.05f),
            new Comision(15000f, 0.10f),
            new Comision(20000f, 0.15f),
            new Comision(25000f, 0.20f),
            new Comision(Float.MAX_VALUE, 0.25f)
        };

        vendedores = new Vendedor[5];

    }

    public Empresa(int numeroVendedores) {
        // Constructor al que le indicamos el número de vendedores con el que vamos a trabajar. 

        tabla = new Comision[]{
            new Comision(10000f, 0.05f),
            new Comision(15000f, 0.10f),
            new Comision(20000f, 0.15f),
            new Comision(25000f, 0.20f),
            new Comision(Float.MAX_VALUE, 0.25f)
        };

        vendedores = new Vendedor[numeroVendedores];
    }
    
    public void informe ()
    {
        int posComi = 0;
        float impComi = 0;
        System.out.println("NOMBRE VENDEDOR \t IMPORTE VENTAS \t IMPORTE COMISION");
        for (int nven=0; nven<vendedores.length; nven++)
        {
            System.out.println(vendedores[nven].getNombre());
            System.out.println("\t"+ vendedores[nven].getVentas());
            posComi= busquedaComision (vendedores[nven].getVentas()*tabla[posComi].getPorcentaje());
            System.out.println("\t" +impComi);
        }
    }

    public void crearVendedores() {
        //este método crea los vendedores y guarda su nombre. 
        InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader entrada = new BufferedReader(flujo);
        String nombre;
        try {
            for (int nVendedor = 0; nVendedor < vendedores.length; nVendedor++) {
                System.out.println("INTRODUCE EL NOMBRE DEL VENDEDOR " + nVendedor);
                nombre = entrada.readLine();
                vendedores[nVendedor] = new Vendedor(nombre);
            }
        } catch (IOException ex) {
        }
    }

    public void cargarVentas() {
        int nVendedor;
        float importe;
        nVendedor = Numero.pedirNumero("Introduce el código del vendedor ", 0, vendedores.length - 1);
        while (nVendedor != -1) {
            // Del vendedor que esta en la posicion nVendedor dime su nombre.
            importe = Numero.pedirNumeroReal("Introduce las ventas  " + vendedores[nVendedor].getNombre(),
                    0, Float.MAX_VALUE);
            vendedores[nVendedor].acumularVentas(importe);
            nVendedor = Numero.pedirNumero("INTRODUCE EL CODIGO VENDEDOR ", -1, vendedores.length - 1);
        }
    }
/** 
 * 
 * @param importeVentas le paso el importe de ventas de cada empleado concreto
 * @return me devuelve la posición de la tabla de ventas.
 */
    public int busquedaComision(float importeVentas) {
        int pos = 0;
        boolean encontrado = false;
        while (!encontrado && pos < tabla.length) {
            if (importeVentas > tabla[pos].getImporte()) {
                pos++;
            } else {
                encontrado = true;
            }
        }
        return pos;
    
}
    
}
