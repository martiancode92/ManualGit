/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Objects;

/**
 *
 * @author ADMINMJ
 */
public class Usuario {
    private String login;
    private String contrasena;
    private String nombre;

    public Usuario(String login, String contrasena,String nombre) {
        this.login = login;
        this.contrasena = contrasena;
        this.nombre=nombre;
    }

    public Usuario(String login, String contrasena) {
        this.login = login;
        this.contrasena = contrasena;
    }
    
    public String getContrasena() {
        return contrasena;
    }

  
    public String getLogin() {
        return login;
    }
    public String getNombre() {
        return nombre;
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
        if (!Objects.equals(this.login, other.login)) {
            return false;
        }
        if (!Objects.equals(this.contrasena, other.contrasena)) {
            return false;
        }
        return true;
    }

    
    
}
