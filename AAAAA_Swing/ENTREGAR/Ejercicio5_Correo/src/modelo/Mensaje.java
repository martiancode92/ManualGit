/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author USUARIO
 */
public class Mensaje {
    
String asunto;
Fecha fmensaje;
String contenido;
String remitente;

    public Mensaje(String asunto, Fecha fmensaje, String contenido, String remitente) {
        this.asunto = asunto;
        this.fmensaje = new Fecha();
        this.contenido = contenido;
        this.remitente = remitente;
    }
    


    public String getAsunto() {
        return asunto;
    }

    public Fecha getFmensaje() {
        return fmensaje;
    }

    public String getContenido() {
        return contenido;
    }

    public String getRemitente() {
        return remitente;
    }

    @Override
    public String toString() {
        return "Fecha" + fmensaje ;
    }
    
    


    
    
    
}
