/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut4_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Agencia {

    TipoAutobus bus1 = new TipoAutobus("Tarragona");
    TipoAutobus bus2 = new TipoAutobus("Zaragoza");

    public void ventaBilletes() throws IOException {

        int plazas;
        int fumador;
        
        String nombre =""; 
        String destino="";
        
        while((nombre.equalsIgnoreCase("*"))){
        
                nombre=pedirNombre("");
                destino=pedirDestino("");
                
                
                
        
        
        
        
        
        }
        
        
        
        
      
        
        
        

    }
    
    public Boolean fumador(){
        
    
    
    
    
    
    
    
    
    return true;
    }

    public String pedirDestino(String destino) throws IOException {

        //teclado
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Elige un Destino -Zaragoza-  -Tarragona-");
        //Variables ya declare Variable String como entrada de dato

        destino = teclado.readLine();

        while (!(destino.equalsIgnoreCase(bus1.getDenom())
                || destino.equalsIgnoreCase(bus2.getDenom()))) {

            System.out.println("El destino Ingresado No es  Zaragoza ni Tarragona");

            destino = teclado.readLine();

        }

        return destino;
    }
    
    

    public int pedirPlazas() throws IOException {

        int plazas = 0;

        try {
            plazas = pedirNumero("Cuantas plazas deseas", 1, 55);

            while ( !(plazas >0)) {

                System.out.println("Por favor ingresa un numero de plazas");

            }

        } catch (NumberFormatException ex) {

            System.out.println("Tienque ser un numero");

        }

        return plazas;
    }

    public String pedirNombre(String nombre) throws IOException {

        //teclado
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Nombre de Cliente ");
        //Variables ya declare Variable String como entrada de dato

         nombre = teclado.readLine();

       
        
        while ((nombre.equalsIgnoreCase(""))) {

            System.out.println("Ingrese un nombre por favor");

            
            nombre = teclado.readLine();

        }

        return nombre;
    }

    public int pedirNumero(String mensaje, int limiteInf, int limiteSup) throws IOException {

        //teclado
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        //variable
        int numero = 0;
        boolean correcto = false;

        while (!correcto) {
            try {
                System.out.println(mensaje);
                numero = Integer.parseInt(teclado.readLine());

                if (numero >= limiteInf && numero <= limiteSup) {

                    correcto = true;

                } else {

                    System.out.println("El numero introducido no es correcto");

                }

            } catch (NumberFormatException e) {

                System.out.println("Tiene que ser un numero");

            }

        }

        return numero;
    }

    public void actualizarDatos(String nombre, String destino, int plazas, boolean fuma, int fumador) {

        if (destino.equalsIgnoreCase(bus1.getDenom())) {
            fuma = true;

            bus1.setCliente(nombre);
            bus1.setDenom(destino);
            if (!fuma) {

                bus1.plazas(plazas);

            } else {

                bus1.actualizarFumadores(fumador);

            }

        } else {

            if (destino.equalsIgnoreCase(bus2.getDenom())) {

                fuma = true;

                bus2.setCliente(nombre);
                bus2.setDenom(destino);
                if (!fuma) {

                    bus2.plazas(plazas);

                } else {

                    bus2.actualizarFumadores(fumador);

                }

            }

        }

    }

}
