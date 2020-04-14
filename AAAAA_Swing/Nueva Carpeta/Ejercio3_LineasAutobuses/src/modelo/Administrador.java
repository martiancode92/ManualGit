/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controlador.Usuario;
import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class Administrador extends Usuario {//Clase Hija de Usuario como marca en la cabezera

    /*He creado dentro del administrador un conjunto Dinamico
        ya que el AMINISTRADOR tiene permisos para modificar 
        las diferentes lineas
      
     */
    ArrayList<Lineas> lineas;

    public Administrador(String usuario, String pass) {
        super(usuario, pass);

        this.lineas = new ArrayList<>();

    }

    public Administrador(ArrayList<Lineas> lineas, String usuario, String pass) {
        super(usuario, pass);
        this.lineas = lineas;
    }



    public void añadirLineas(Lineas l) {

        l = new Lineas();

        lineas.add(l);

    }

    public boolean eleminarLineas(int n) {
        boolean mal = false;

        //Creo un objeto para operar
        Lineas l = new Lineas();
        //creo estas dos variables con las que voy a capturar del Buffer de entrada
        String s = "";
        n = Integer.parseInt(s);

        //le pongo un booleano para dar la opcion de ver el los datos de la linea
        //si tecleo -1 se borrara la linea
        while ((!mal) || n != 0) {
            if (n == 0) {

                mostrarDatosLinea();

                if (n == -1) {
                    mal = true;

                    lineas.remove(l);
                }

            }

        }
        return mal;
    }

    public void mostrarDatosLinea() {

        Lineas l = new Lineas();

        String codigo = l.getCodigo();
        String denominacion = l.getDenominacion();
        String frecuencia = l.getFrecuencia();
        String primeraP = l.getPrimeraParada();
        String ultimap = l.getUltimaParada();

    }

    public ArrayList<Lineas>  getLineas() {
        return lineas;
    }

    public void setLineas(ArrayList<Lineas> lineas) {
        this.lineas = lineas;
    }

}
