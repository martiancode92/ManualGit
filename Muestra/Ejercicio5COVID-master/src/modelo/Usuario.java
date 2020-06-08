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
 * @author Barbero
 */
public class Usuario {
    
    private String usuario;
    private String contra;
    private boolean admin;
    private String correo;
    private ArrayList<Mensaje>mensajes;

    public Usuario(String usuario, String contra, boolean admin, String correo) {
        this.usuario = usuario;
        this.contra = contra;
        this.admin = admin;
        this.correo = correo;
        mensajes = new ArrayList<>();
        //nuevoMensaje("hola","sdaf","asdf","asdf");
    }
    
    public void nuevoMensaje(String fecha, String asunto, String contenido, String emisor){
        mensajes.add(new Mensaje(fecha,asunto,contenido,emisor));
    }

    public Usuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContra() {
        return contra;
    }

    public boolean isAdmin() {
        return admin;
    }

    public String getCorreo() {
        return correo;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
     public ArrayList<Mensaje> getMensajes() {
        return mensajes;
    }
     
    public void setMensajes(ArrayList<Mensaje> mensajes) {
        this.mensajes = mensajes;
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
        if (!Objects.equals(this.usuario, other.usuario)) {
            return false;
        }
        return true;
    }
}
