/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parking;

import numero.Numero;

/**
 *
 * @author 203p21
 */
public class Parking {

  String[] plazas;

    public Parking() {
        plazas = new String[100];
    }

    public Parking(int numeroPlazas) {
       plazas = new String[numeroPlazas];
    }

    public void inicializarPlazas() {
        for (int nplaza = 0; nplaza < plazas.length; nplaza++) {
            plazas[nplaza] = "LIBRE";
        }

    }

    public void estadoParking() {
        int nplaza;
      
        System.out.println("Nº Plaza  Estado");
        for( nplaza=0; nplaza< plazas.length; nplaza++)
        {
            System.out.println(nplaza+" - "+ plazas[nplaza]);
        }

   
    /**
     * busqueda Secuencial. encuentar el primer valor igual a libre
     * @return  posicion donde se encuentra el primer valor igual a libre,
     * -1 en caso contrario
     */
    public int busquedaSecuencial()
    {
        int nplaza;
        boolean encontrado;
        nplaza=0;
        encontrado=false;
        while ( !encontrado && nplaza<plazas.length)
        {
            if (plazas[nplaza].equalsIgnoreCase("libre"))
            {
                encontrado=true;
            }
            else{
                nplaza++;
            }
        }
        if( !encontrado)
        {
            nplaza=-1;
        }
        return nplaza;
    }
    public void entrada(){
        int nplaza;
       nplaza=busquedaSecuencial();
       if (nplaza==-1)
       {
           System.out.println("PARKING COMPLETO");
       }
       else{
           plazas[nplaza]="OCUPADO";
           System.out.println("LA PLAZA ASIGNADA ES:"+nplaza);
       }
           
      
    }
    
    public void salida(){
        int nplaza;
        Numero n= new Numero();
        nplaza=n.pedirNumero("Plaza a dejar Libre:", 0, plazas.length);
        if ( plazas[nplaza].equalsIgnoreCase("OCUPADO"))
        {
            System.out.println("Plaza liberada");
            plazas[nplaza]="LIBRE";
        }
        else
        {
            System.out.println("Esa plaza ya esta libre");
        }
    }
    
    

}
