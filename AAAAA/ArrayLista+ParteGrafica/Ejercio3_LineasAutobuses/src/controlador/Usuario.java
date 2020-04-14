/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import modelo.Administrador;
import modelo.Standart;

public class Usuario {  
    
    /*
        De esta Clase Van a heredar Administrador y Standart
            es la clase PADRE.
    
    */

    private String usuario;
    private String pass;
    
    //Classe hijas usando como ArrayList 
    ArrayList<Administrador> admin;
    ArrayList<Standart> standart;

    
    //constructor inizializando las variables y los Conjuntos de almacenamiento dinamico
    
    public Usuario(String usuario, String pass) {
        this.usuario = usuario;
        this.pass = pass;

        admin = new ArrayList<>();
        standart = new ArrayList<>();

    }

    Usuario() {//constructor vacio
        
    }

//metod para crear Usuarios Administradores
    public void guardarAdmin(Administrador a) {

        for (int pos = 0; pos < admin.size(); pos++) {

            if (admin.get(pos).getUsuario().equalsIgnoreCase(null)) {

                a = new Administrador(usuario, pass);
                admin.add(a);

            }

        }
    }

    
    // metodo para crear Usuarios Estandar
    public void guardarStandart(Standart s) {

        for (int pos = 0; pos < standart.size(); pos++) {

            if (standart.get(pos).getUsuario().equalsIgnoreCase(null)) {

                s = new Standart(usuario, pass);

                standart.add(s);

            }
        }
    }

    
    //GETERS
    public String getUsuario() {
        return usuario;
    }

    public String getPass() {
        return pass;
    }

}
