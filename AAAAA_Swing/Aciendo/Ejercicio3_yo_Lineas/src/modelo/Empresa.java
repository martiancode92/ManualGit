/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class Empresa {
    
    ArrayList<Usuario> usuarios;
    ArrayList<Parada> paradas;
    ArrayList<Linea> lineas;

public Empresa(){


    usuarios= new ArrayList();
    paradas= new ArrayList();
    lineas= new ArrayList();
    
}


public void nuevoUsuario(String login, String pass, boolean tipo){


    usuarios.add(new Usuario(login, pass, tipo));

}

public void nuevaLinea(Linea l){

    lineas.add(l);


}

public void nuevoUsuario(Usuario u){

     usuarios.add(u);   
    
}


public void nuevaParada(int codigo , String denominacion){

    paradas.add(new Parada(codigo, denominacion));

}

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public ArrayList<Parada> getParadas() {
        return paradas;
    }

    public ArrayList<Linea> getLineas() {
        return lineas;
    }

    
    
}