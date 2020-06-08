/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author dam
 */
public class Usuario {
    
    private String login;
    private String pass;
    private String nombre;

    public Usuario(String login, String pass, String nombre) {
        this.login = login;
        this.pass = pass;
        this.nombre = nombre;
    }

    public String getLogin() {
        return login;
    }

    public String getPass() {
        return pass;
    }

    public String getNombre() {
        return nombre;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
