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
    private String contra;
    private boolean tipo;

    public Usuario(String login, String contra, boolean tipo) {
        this.login = login;
        this.contra = contra;
        this.tipo = tipo;
    }

    public Usuario(String login) {
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    public String getContra() {
        return contra;
    }

    public boolean isTipo() {
        return tipo;
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
