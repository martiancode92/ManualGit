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
    
    String login;
    String pass;
    boolean tipo;
    String direccecion;
    ArrayList<Mensaje> mensajes;
    Fecha fhoy;
    

    public Usuario(String login, String pass, boolean tipo, String direccion) {
        this.login = login;
        this.pass = pass;
        this.tipo = tipo;
        this.direccecion=direccion;
        mensajes = new ArrayList();
        fhoy= new Fecha();
        
    }
    
       public Usuario() {
   
    }
       
       
       public void enviarMensaje(String asunto, Fecha fmensaje,String contenido,String remitente){
       
           mensajes.add(new Mensaje(asunto, fmensaje,contenido,remitente));
       
       }
       
       
       

    public Usuario(String login, String pass) {
        this.login = login;
        this.pass = pass;
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

    public String getDireccion() {
        return direccecion;
    }

    public ArrayList<Mensaje> getMensajes() {
        return mensajes;
    }
    
    

    public boolean isTipo() {
        return tipo;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    public void setDireccecion(String direccecion) {
        this.direccecion = direccecion;
    }

    public void setMensajes(ArrayList<Mensaje> mensajes) {
        this.mensajes = mensajes;
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

    @Override
    public String toString() {
        return login;
    }

 


}
