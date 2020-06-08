/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import modelo.Usuario;

/**
 *
 * @author Barbero
 */
public class Empresa {
    
    private ArrayList<Usuario>usuarios;

    public Empresa() {
        usuarios = new ArrayList<>();
    }
    
    public void nuevoUsuario(String login, String contra, boolean tipo, String correo){
        usuarios.add(new Usuario(login,contra,tipo,correo));
    }
    
    public void nuevoUsuario(Usuario u){
        usuarios.add(u);
    }
    
    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }
    
    public int buscarPosicionUsuario(String contra){
        boolean encontrado = false;
        int pos = 0;
        while(pos < usuarios.size() && !encontrado){
            if(contra.equalsIgnoreCase(usuarios.get(pos).getContra())){
                encontrado = true;
            }else{
                pos++;
            }
        }
        if(!encontrado){
            pos = -1;
        }
        return pos;
    }
    
    public int buscarCorreo(String correo){
        boolean encontrado = false;
        int pos = 0;
        while(pos < usuarios.size() && !encontrado){
            if(correo.equalsIgnoreCase(usuarios.get(pos).getCorreo())){
                encontrado = true;
            }else{
                pos++;
            }
        }
        if(!encontrado){
            pos = -1;
        }
        return pos;
    }
}
