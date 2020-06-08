/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import modelo.Linea;
import modelo.Parada;
import modelo.Usuario;

/**
 *
 * @author USUARIO
 */
public class Empresa {

    ArrayList<Linea> linea;
    ArrayList<Parada> parada;
    ArrayList<Usuario> usuario;

    public Empresa() {
        this.linea = new ArrayList();
        this.parada = new ArrayList();
        this.usuario = new ArrayList();
    }

    public int buscarUsuario(String login) {

        int us = 0;

        while (login.equalsIgnoreCase(usuario.get(us).getLogin()) && us == -1) {

            us++;

            if (us > usuario.size()) {

                us = -1;

            }

        }

        return us;
    }

    public void añadirParada(int deno, String cod) {

        parada.add(new Parada(deno, cod));
    }

    public void añadirUsuario(String login, String pass, boolean tipo) {

        usuario.add(new Usuario(login, pass, tipo));
    }

    public boolean tipoUsuario(int i) {

        boolean tipo = usuario.get(i).isTipo();

        return tipo;
    }

    public ArrayList<Linea> getLinea() {
        return linea;
    }

    public ArrayList<Parada> getParada() {
        return parada;
    }

    public ArrayList<Usuario> getUsuario() {
        return usuario;
    }

}
