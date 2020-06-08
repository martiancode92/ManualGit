package ut4_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Empresa {

    TipoMenu menu1 = new TipoMenu(1);
    TipoMenu menu2 = new TipoMenu(2);
    TipoMenu menu3 = new TipoMenu(3);
    
    
    
    
    public int pedirMenu() throws IOException{
    
        int menu = -1;
        int asistentes,sandwiches,canapes;
        
        while(menu !=0){
        
        menu= pedirNumero("Elige un tipo de menu -1- -2- -3- ",1,3);
        
        
        if(menu !=0){
            
            
            asistentes = pedirNumero("Introduce el Nº de asistentes ",1,100);
            sandwiches = pedirNumero("Nº Sandwiches ",1,1000);
            canapes   = pedirNumero("Nº Canapes ",1,1000);  
            
           switch (menu){
           
               case 1:
                  menu1.addMenu(asistentes, sandwiches, canapes);
               case 2:
                 menu2.addMenu(menu, sandwiches, canapes);
               case 3:
                menu3.addMenu(menu, sandwiches, canapes);
           
           
           }
            
        
        
        
        
        
        }
        
        
        
        
        }
    
    
    
    
    return menu;
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
}
