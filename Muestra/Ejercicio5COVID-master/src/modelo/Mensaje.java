/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Barbero
 */
public class Mensaje {
    
    private String fecha;
    private String asunto;
    private String contenido;
    private String emisor;

    public Mensaje(String fecha, String asunto, String contenido, String emisor) {
        this.fecha = fecha;
        this.asunto = asunto;
        this.contenido = contenido;
        this.emisor = emisor;
    }

    public String getFecha() {
        return fecha;
    }

    public String getAsunto() {
        return asunto;
    }

    public String getContenido() {
        return contenido;
    }

    public String getEmisor() {
        return emisor;
    }
    
}
