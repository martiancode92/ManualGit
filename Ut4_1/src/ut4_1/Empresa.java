-/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut4_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Empresa {

    TipoMenu m1 = new TipoMenu(1);
    TipoMenu m2 = new TipoMenu(2);
    TipoMenu m3 = new TipoMenu(3);

    public boolean pedirMenu() throws IOException {
        //variable
        boolean terminar = false;
        int menu = -1;
        int numeroAsistentes, canapes, sandwiches;

        while (menu != 0) {

            menu = pedirNumero("Elige un menu 1 y 3", 0, 3);

            if (menu != 0) {

                numeroAsistentes = pedirNumero("Introduzca numero de Asistentes", 1, 100);
                canapes = pedirNumero("Introduzca el numero de Canapes", 1, 1000);
                sandwiches = pedirNumero("Introduzca el numero de Sandwiches", 1, 1000);

                switch (menu) {

                    case 1:
                        m1.addMenu(numeroAsistentes, canapes, sandwiches);

                    case 2:
                        m2.addMenu(numeroAsistentes, canapes, sandwiches);

                    case 3:
                        m3.addMenu(numeroAsistentes, canapes, sandwiches);
                }
            }

        }
        
         

        terminar = true;

        return terminar;
    }

    public int pedirNumero(String mensaje, int limiteInf, int limiteSup) throws IOException {

        //teclado 
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        //variables 
        int numero = 0;
        boolean correcto = false;

        while (!correcto) {
            try {

                System.out.println(mensaje);
                numero = Integer.parseInt(teclado.readLine());

                if (numero >= limiteInf && numero <= limiteSup) {

                    correcto = true;

                } else {

                    System.out.println("No es correcto");

                }

            } catch (NumberFormatException ex) {

                System.out.println("Tiene que ser un numero");

            }
        }
        return numero;

    }

}
