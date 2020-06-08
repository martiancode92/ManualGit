/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import modelo.Sala;
import modelo.Usuario;

/**
 *
 * @author USUARIO
 */
public class Centro {
    
ArrayList <Sala> sala;
    ArrayList <Usuario> usuario;

    public Centro() {
        this.sala = new ArrayList<>();
        this.usuario = new ArrayList<>();    
 
    }
    
    
     public void añadirSala(String nombre, int capacidad){
    
        Sala s=  new Sala(nombre,capacidad);
        sala.add(s);
    
    }
    
    
    public int guardarUsuario(int cif, String nombre, String direccion, String poblacion){
    
        Usuario u= new Usuario(cif, nombre, direccion, poblacion);
        usuario.add(u);
    
        int pos = busqueda(cif);
        if (pos == -1) {
            // Si devuelve -1 es que no hay un usuario con ese nombre. 
            usuario.add(new Usuario(cif,nombre, direccion,poblacion));
        }
        return pos;

    }
    
      public int busqueda(int cif) {

          boolean encontrado = false;
        int pos = 0;
        while (!encontrado && pos < usuario.size()) {
            if (cif==(usuario.get(pos).getCif())) {
                encontrado = true;
            } else {
                pos++;
                if (!encontrado) {
                    pos = -1;
                }
              

            }

        }
          return pos;
          
         }

 public ArrayList<Sala> getSala() {
        return sala;
    }

    public ArrayList<Usuario> getUsuario() {
        return usuario;
    }
    
    

      

    
}
