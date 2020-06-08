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
public class Noticia {
    private String titulo;
    private Categoria categoria;
    private Usuario usuario;
    private String fecha;

    public Noticia(String titulo, Categoria categoria, Usuario usuario, String fecha) {
        this.titulo = titulo;
        this.categoria = categoria;
        this.usuario = usuario;
        this.fecha = fecha;
    }

    public Noticia(String titulo) {
        this.titulo = titulo;
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
        final Noticia other = (Noticia) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        return true;
    }

    public String getTitulo() {
        return titulo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String getFecha() {
        return fecha;
    }
    
    
    
}
