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
public class Biblioteca {
    
    ArrayList<Usuario> usuarios;
    ArrayList<Libro> libros;
    
    
    public Biblioteca(){
    
    
    this.usuarios=new ArrayList();
    this.libros= new ArrayList();
    
    }
    
    
    public void nuevoLibro(Libro l){
    
        libros.add(l);
        
    }
    
    public int nuevoUsuario(String nombre, String login, String pass){
    
        int pos= busqueda(nombre);
        
        if(pos==-1){
        
            usuarios.add(new Usuario(nombre, login, pass));
        
        }
        
        return pos;
        
        }
    
     public int busqueda( String nombre)
   {
       boolean encontrado=false;
       int pos=0;
       while(!encontrado && pos < usuarios.size())
         if( nombre.equalsIgnoreCase(usuarios.get(pos).getNombre()))  
             encontrado=true;
       else
             pos++;
       if( !encontrado)
           pos=-1;
       return pos;
  
   }
    
    
   

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }
    
    
    
    }
    

