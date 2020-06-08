/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author ADMINMJ
 */
public class Usuario {
    private String nombre;
    private String login;
    private String pass;
    /**
     * libros que tiene en su poder ese usuario
     */
    private ArrayList<Libro> prestados;

    public Usuario(String nombre, String login, String pass) {
        this.nombre = nombre;
        this.login = login;
        this.pass=pass;
        prestados=new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getLogin() {
        return login;
    }

    public String getPass() {
        return pass;
    }
/**
 * Conjunto de libros prestados a ese usuario
 * @return 
 */
    public ArrayList<Libro> getPrestados() {
        return prestados;
    }
    /**
     * Nuevo libro prestado a ese usuario
     * @param libro 
     */
    public void nuevoLibro(Libro libro){
        prestados.add(libro);
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
   
        
}
