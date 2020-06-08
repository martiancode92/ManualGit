/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author 203p21
 */
public class Numero {

    public static int pedirNumero() {
        InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader entrada = new BufferedReader(flujo);
        int numero = 0;
        boolean mal;
        try {
            mal = true;
            while (mal) {
                try {
                    System.out.println("Introduce un numero");
                    numero = Integer.parseInt(entrada.readLine());
                    if (numero < 0) {
                        System.out.println("No cumple las condiciones");
                    } else {
                        mal = false;
                    }
                } catch (NumberFormatException ex) {
                    System.out.println("No es un numero");
                }
            }
        } catch (IOException ex) {
        }
        return numero;

    }
 public static  int pedirNumero(String mensaje) {
        InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader entrada = new BufferedReader(flujo);
        int numero = 0;
        boolean mal;
        try {
            mal = true;
            while (mal) {
                try {
                    System.out.println(mensaje);
                    numero = Integer.parseInt(entrada.readLine());
                    if (numero < 0) {
                        System.out.println("No cumple las condiciones");
                    } else {
                        mal = false;
                    }
                } catch (NumberFormatException ex) {
                    System.out.println("No es un numero");
                }
            }
        } catch (IOException ex) {
        }
        return numero;

    }
 public static  int pedirNumero(String mensaje,int limiteInferior, int limiteSuperior) {
        InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader entrada = new BufferedReader(flujo);
        int numero = 0;
        boolean mal;
        try {
            mal = true;
            while (mal) {
                try {
                    System.out.println(mensaje);
                    numero = Integer.parseInt(entrada.readLine());
                    if (numero < limiteInferior ||numero>limiteSuperior) {
                        System.out.println("No cumple las condiciones. Debe estar "
                                + "comprendido entre " + limiteInferior+ " y "+
                                limiteSuperior);
                    } else {
                        mal = false;
                    }
                } catch (NumberFormatException ex) {
                    System.out.println("No es un numero");
                }
            }
        } catch (IOException ex) {
        }
        return numero;

    }
 public static float pedirNumeroReal(String mensaje,float limiteInferior, float limiteSuperior) {
        InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader entrada = new BufferedReader(flujo);
        float numero = 0;
        boolean mal;
        try {
            mal = true;
            while (mal) {
                try {
                    System.out.println(mensaje);
                    numero = Float.parseFloat(entrada.readLine());
                    if (numero < limiteInferior ||numero>limiteSuperior) {
                        System.out.println("No cumple las condiciones. Debe estar "
                                + "comprendido entre " + limiteInferior+ " y "+
                                limiteSuperior);
                    } else {
                        mal = false;
                    }
                } catch (NumberFormatException ex) {
                    System.out.println("No es un numero");
                }
            }
        } catch (IOException ex) {
        }
        return numero;

    }

}
