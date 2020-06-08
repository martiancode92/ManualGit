/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import modelo.Usuario;

/**
 *
 * @author dam
 */
public class Empresa {
    
    private Usuario[]usuarios;

    public Empresa() {
        usuarios = new Usuario[10];
    }
    
    public boolean buscarUsuario(String login, String contra){
        boolean encontrado = false;
        int pos = 0;
        while(pos < usuarios.length && !encontrado){
            if(usuarios[pos] != null){
                if(login.equalsIgnoreCase(usuarios[pos].getLogin())
                        || contra.equalsIgnoreCase(usuarios[pos].getPass())){
                    encontrado = true;
                }else{
                    pos++;
                }
            }else{
                pos = usuarios.length;
            }
        }
        return encontrado;
    }
    
    public int nuevoUsuario(String login, String pass, String nombre){
        int pos = buscarPosicion();
        if(pos == usuarios.length){
            pos = -1; //no tengo espacio
        }else{
            if(buscarUsuario(login,pass)){
                pos = -2; //tengo espacio, pero ya existe
            }else{
                usuarios[pos] = new Usuario(login, pass, nombre);
                pos = 0; //cuando lo e podido hacer
            }
        }
        return pos;
    }
    
    public int buscarPosicion(){
        boolean encontrado = false;
        int pos = 0;
        while(pos < usuarios.length && !encontrado){
            if(usuarios[pos] == null){
                encontrado = true;
            }else{
                pos++;
            }
        }
        return pos;
    }

    public Usuario[] getUsuarios() {
        return usuarios;
    }
    
    public int numeroElementos(){
        return usuarios.length;
    }
}


