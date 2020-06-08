/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notas;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Alumnos {

    private int nota;

    public Alumnos() {
        

    }

    public int pedirNota(int notaMax, int notaMin, String mensaje) {
        int nota= 0;
        boolean mal;
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        try {
            mal = false;
            try {
                while (nota < 0 && nota > 10) {
                    mal=true;
                    nota = Integer.parseInt(teclado.readLine());
                    System.out.println("La nota introducida no esta entre 0 y 10");

                }

            } catch (NumberFormatException ex) {

                System.out.println("Por favor introduce solo numeros");

            }

        } catch (IOException ex) {

        }

        return nota;
    }

}
