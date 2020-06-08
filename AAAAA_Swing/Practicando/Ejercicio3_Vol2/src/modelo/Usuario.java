/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Objects;

/**
 *
 * @author USUARIO
 */
public class Usuario {
    
    String login;
    String pass;
    
    boolean tipo;

    public Usuario(String login, String pass, boolean t) {
        this.login = login;
        this.pass = pass;
        this.tipo=t;
  
    }
    public Usuario(String login,String pass){
        /*
        Lo uso para validar el usuario
        sin pasarle el boleano de si es 
        admin o estandart
        */
    
        this.login=login;
        this.pass=pass;
    }
    
    public Usuario(String Login){
    //lo uso para la busqueda desde empresa,
    //para comprobar si algun objeto contiene
    //el cif que le pase por parametro
    
        this.login =login;
    
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
        return true;
    }


    
    
    
    
    
    
}
