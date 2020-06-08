/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author USUARIO
 */
public class Usuario {
    
    String nombre;
    String login;
    String pass;
    
    ArrayList <Libro> prestados;

    public Usuario(String nombre, String login, String pass) {
        this.nombre = nombre;
        this.login = login;
        this.pass = pass;
        this.prestados = new ArrayList();
    }
    
    public Usuario(String nombre){
    
    this.nombre=nombre;
    
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

    public ArrayList<Libro> getLibros() {
        return prestados;
    }
    
    public void nuevoLibro(Libro l){
    
    prestados.add(l);
    
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
