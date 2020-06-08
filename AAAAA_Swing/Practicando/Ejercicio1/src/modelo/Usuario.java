/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class Usuario {
    
    String nombre;
    String apellidos;
    String login;
    String pass;
    
    private ArrayList<Libro> prestados;

    public Usuario(String nombre, String apellidos, String Login, String pass) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.login = Login;
        this.pass = pass;
        prestados=new ArrayList();
        
    }

    public Usuario(String log) {
        this.login=log;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getLogin() {
        return login;
    }

    public String getPass() {
        return pass;
    }

    public ArrayList<Libro> getPrestados() {
        return prestados;
    }
    
    public void nuevoLibro(Libro libro){
        prestados.add(libro);
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
