/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import modelo.Categoria;
import modelo.Usuario;

/**
 *
 * @author USUARIO
 */
public class Empresa {
    
    ArrayList<Usuario> usuarios;
           private ArrayList<Categoria> categorias;

    public Empresa(){
    
        usuarios = new ArrayList<>();
        categorias= new ArrayList<>();
    
    }
    
    public void nuevaCategoria(String denominacion){
    
    categorias.add(new Categoria("denominacion"));
    
    }
    
    public void nuevoUsuario(String login, String contraseña){
    
    
        usuarios.add(new Usuario(login, contraseña));
    
    
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }
    
}

