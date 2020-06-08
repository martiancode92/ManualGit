/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import modelo.Libro;
import modelo.Usuario;

/**
 *
 * @author USUARIO
 */
public class Biblioteca {

    ArrayList<Usuario> usuario;
    ArrayList<Libro> libro;

    public Biblioteca() {
        this.usuario = new ArrayList();
        this.libro = new ArrayList();
    }

    public void nuevoLibro(String isbn, String titulo, String autor, String editorial) {

        Libro l = new Libro(isbn, titulo, autor, editorial);

        libro.add(l);

    }

    /*
    public boolean nuevolibro(String isbn, String titulo, String autor, String editorial) {
        Libro libros = new Libro(isbn, titulo, autor, editorial);
        boolean existe = libro.contains(libros);
        if (!existe) {
            libro.add(libros);
        }
        return existe;
    }
     */
    public int nuevoUsuario(String nombre, String apell, String login, String contra) {

        // No puede haber dos usuarios en la biblioteca con el mismo nombre
        int pos = busqueda(nombre);
        if (pos == -1) {
            // Si devuelve -1 es que no hay un usuario con ese nombre.
            usuario.add(new Usuario(nombre, apell, login, contra));
        }
        return pos;

    }

    public Usuario buscarUnCliente(String log) {
        Usuario u = null;
        // indexOf busca en el arrayList de clientes un cliente cuyo cif sea el indicado
        // en el caso de encontrarlo devuelve la posición y si no devuelve -1
        // me creso un objeto de tipo Cliente para poder utilizar el indexOf,
        // sino tendría que hacer una búsqueda secuencial
        int posicion = this.usuario.indexOf(new Usuario(log));
        if (posicion != -1) {
            u = usuario.get(posicion);
        }
        return u;
    }

    public int busqueda(String nombre) {
        boolean encontrado = false;
        int pos = 0;
        while (!encontrado && pos < usuario.size()) {
            if (nombre.equalsIgnoreCase(usuario.get(pos).getNombre())) {
                encontrado = true;
            } else {
                pos++;
            }
        }
        if (!encontrado) {
            pos = -1;
        }
        return pos;

    }

    public ArrayList<Usuario> getUsuario() {
        return usuario;
    }

    public ArrayList<Libro> getLibro() {
        return libro;
    }

}
