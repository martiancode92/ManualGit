/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author USUARIO
 */
public class Usuario {
    
    String login;
    String pass;
    
    /*
    boolean tipo; indica el tipo de usuario
    */
    boolean tipo;

    public Usuario(String login, String pass, boolean tipo) {
        this.login = login;
        this.pass = pass;
        this.tipo = tipo;
    }

    public String getLogin() {
        return login;
    }

    public String getPass() {
        return pass;
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }
    
    
    
}