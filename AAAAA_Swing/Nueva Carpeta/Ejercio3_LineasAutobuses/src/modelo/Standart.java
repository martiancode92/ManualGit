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
public class Standart extends Usuario {

    /**
     *
     * he Creado una Clase hija de Usuario, en este caso es un usuario Standart
     */

    ArrayList<Lineas> lineas;

    public Standart(String usuario, String pass) {
        super(usuario, pass);
        this.lineas = new ArrayList<>();
    }

    public Standart(ArrayList<Lineas> lineas, String usuario, String pass) {
        super(usuario, pass);
        this.lineas = lineas;
    }

    public String consultaDeLinea(Lineas l) {

        l = new Lineas();

        for (int i = 0; i < lineas.size(); i++) {// Aqui me surge la duda de si va a consultar todas las lineas 
                                                //como haria si solo quiero consultar en la que esta usando el usuario Standart
            l.getParadasIntermedias();
            l.infoStandart();

        }
        String cadena = " "+l.getParadasIntermedias() +" "+ l.infoStandart();

        return cadena;
    }

    //dado que este usuario no tiene mas privilegios  no necesito mas por el momento.

}
