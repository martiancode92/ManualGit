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
        this.parada = new ArrayList();

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

    public boolean crearParadas(Parada p) {//recibe un objeto parada y comprueba si existe, si no lo guarda

        boolean existe = parada.contains(p);
        if (!existe) {
            parada.add(p);
        }
        return existe;

    }
    
    

    public boolean crearLinea(Linea l) {//recibe un objeto linea, comprueba si existe, si no lo guarda

        boolean existe = linea.contains(l);

        if (!existe) {

            linea.add(l);

        }
        return existe;
    }

        //Cumple la misma funcion que el metodo de abajo la diferencia resisde en los parametros 

    public boolean nuevoUsuario(String login, String pass,boolean t) {

        Usuario u = new Usuario(login, pass ,t);

        boolean existe = usuario.contains(u);

        if (!existe) {

            usuario.add(u);

        }

        return existe;
    }

    public Usuario nuevoUsuario(Usuario u) {//le paso un objeto por parametro
    //Con el metodo contains compruevo si existe un usuario antes de añadirlo

        boolean existe = usuario.contains(u);

        if (!existe) {

            usuario.add(u);

        }

        return u;
    }
    
         public Usuario buscarUnCliente(String log){
         Usuario u=null;
         // indexOf busca en el arrayList de clientes un cliente cuyo cif sea el indicado
         // en el caso de encontrarlo devuelve la posición y si no devuelve -1
         // me creso un objeto de tipo Cliente para poder utilizar el indexOf,
         // sino tendría que hacer una búsqueda secuencial
         int posicion= this.usuario.indexOf(new Usuario(log));
         if ( posicion!=-1)
             u=usuario.get(posicion);
         return u;
     }

}
