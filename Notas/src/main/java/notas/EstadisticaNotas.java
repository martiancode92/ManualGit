/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author USUARIO
 */
public class EstadisticaNotas {
    
    public static void main(String[]args) throws IOException{
    
        int contador=0, numero;
        
        Alumnos nota= new Alumnos();
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        numero = Integer.parseInt(teclado.readLine());
        numero = nota.pedirNota(0, 10,"Introduce nota del alumno");
        
        try{
        while(contador !=25){
            
         System.out.println("Introduce nota del ALumno");
         numero = Integer.parseInt(teclado.readLine());
        
        
        
        }
        }catch(NumberFormatException ex){
            System.out.println("Introduce numeros");
        }
        
        contador++;
        }
        
        
        
        
        
        
       
    
    
    
    }
    

