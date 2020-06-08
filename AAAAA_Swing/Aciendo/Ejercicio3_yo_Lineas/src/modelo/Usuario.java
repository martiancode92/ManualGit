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
    
    private String login;
    private String pass;
    
    /**
     * boolean tipo
     */
    
    private boolean tipo;

    public Usuario(String login, String pass, boolean tipo) {
        this.login = login;
        this.pass = pass;
        this.tipo = tipo;
    }

    public Usuario(String login) {
        this.login = login;
        
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
        int hash = 3;
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
