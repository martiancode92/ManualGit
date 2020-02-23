/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author 203p21
 */
public class Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        //System.out.println("Ingrese el numero de Empleados");
       // int n=0;
        //BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        
        //n= Integer.parseInt(teclado.readLine());
        
        Empresa miEmpresa = new Empresa();
        miEmpresa.pedirDatos();
        miEmpresa.informe();
    }

}
