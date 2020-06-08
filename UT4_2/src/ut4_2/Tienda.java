/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut4_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tienda {

    TipoTerminal t1 = new TipoTerminal("Libre");
    TipoTerminal t2 = new TipoTerminal("no libre");

    public class venta {

        public void venta() {
            String tfno;
            String tipo;
            tfno = pedirTelefono();
            while (!tfno.equalsIgnoreCase("fin")) {
                tipo = pedirTipo();
                //actualizar(tfno, tipo);
                tfno = pedirTelefono();
            }
        }

    }

    public String pedirTelefono() {

        //teclado 
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        //variables
        String tfno = "";

        try {
            System.out.println("Introduce tipo -libre- o -no libre- <FIN=SALIR");
            tfno = teclado.readLine();

            while (!(tfno.equalsIgnoreCase("fin")
                    || tfno.equalsIgnoreCase(t1.getDenominacion())
                    || tfno.equalsIgnoreCase(t2.getDenominacion()))) {
                System.out.println("ESE Telefono NO EXISTE ");
                System.out.println("Introduce libro a comprar -libre- o -no libre- <FIN=SALIR");

                tfno = teclado.readLine();
            }

        } catch (IOException ex) {

        }

        return tfno;
    }

    private String pedirTipo() {
        InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader entrada = new BufferedReader(flujo);
        String tipo = "";
        try {
            System.out.println("Introduce TIPO de movil <contrato,prepago");
            tipo = entrada.readLine();

            while (tipo.compareToIgnoreCase("contrato") != 0
                    && tipo.compareToIgnoreCase("prepago") != 0) {
                System.out.println("ESE tipo de tfno NO EXISTE ");
                System.out.println("Introduce TIPO de movil <contrato,prepago");
                tipo = entrada.readLine();

            }

        } catch (IOException ex) {

        }
        return tipo;

    }
}



    /* public String pedirLetras(String mensaje1,  String denom1, String denom2) throws IOException {

        //teclado 
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        //variables
        String texto = "";
        boolean correcto = false;

        while (!correcto) {
            try {

                System.out.println(mensaje1);
                texto = teclado.readLine();

                if (texto.equals(denom1) || texto.equals(denom2)) {

                    correcto = true;

                } else {

                    System.out.println("No es correcto");

                }

            } catch (IOException ex) {

                System.out.println("No se permiten numeros");

            }
        }

        return texto;
    }*/
