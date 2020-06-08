/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author ADMINMJ
 */
public class Libro {
    private String isbn;
    private String titulo;
    private String autor;
    private String editorial;
    /**
     * true si el libro se encuentra prestado y falso en caso contrario.
     */
    private boolean prestado;

    public Libro(String isbn, String titulo, String autor, String editorial) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        prestado=false;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public boolean isPrestado() {
        return prestado;
    }
// Cambia el estado de un libro de prestado a no prestado o viceversa
    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    @Override
    public String toString() {
        return titulo;
    }
    
    
    
}
