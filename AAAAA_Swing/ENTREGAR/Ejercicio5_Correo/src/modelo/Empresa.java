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

    public Empresa() {

        usuarios = new ArrayList();

    }

    public void nuevoUsuario(Usuario u) {

        usuarios.add(u);

    }

    public void nuevoUsuario(String login, String pass, boolean tipo, String direccion) {

        usuarios.add(new Usuario(login, pass, tipo, direccion));

    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public int cambiarContraseña(String pass) {

        boolean correcto = false;
        int pos = 0;

        while (!correcto && pos < usuarios.size()) {

            if (pass.equalsIgnoreCase(usuarios.get(pos).getPass())) {

                correcto = true;
            } else {

                correcto = false;
                pos++;

            }

        }

        return pos;
    }
    
        public int buscarCorreo(String correo){
        boolean encontrado = false;
        int pos = 0;
        while(pos < usuarios.size() && !encontrado){
            if(correo.equalsIgnoreCase(usuarios.get(pos).getDireccion())){
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
