/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parking;

import mcd.Numero;

/**
 *
 * @author 203p21
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Parking artesano;
        int opcion;
        Numero n = new Numero();
        artesano = new Parking(5);
        artesano.inicializarPlazas();
        menu();
        opcion = n.pedirNumero("", 1, 4);
        while (opcion != 4) {
            switch (opcion) {
                case 1:
                    artesano.entrada();
                    break;
                case 2:
                    break;
                case 3:
                    artesano.estadoParking();
            }
            menu();
            opcion = n.pedirNumero("", 1, 4);
        }

    }

    public static void menu() {
        System.out.println("\n\n1.ENTRADA");
        System.out.println("2. SALIDA");
        System.out.println("3.ESTADO DEL PARKING");
        System.out.println("4.FIN");
        System.out.println("OPCION :");
    }
}
