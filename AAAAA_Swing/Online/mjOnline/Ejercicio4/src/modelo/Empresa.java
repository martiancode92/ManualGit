/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author ADMINMJ
 */
public class Empresa {
    private ArrayList<Usuario> usuarios;
    private ArrayList <Categoria>categorias;
    ArrayList<Noticia>noticias;
    public Empresa() {
        usuarios =new ArrayList<>();
        categorias=new ArrayList<>();
        noticias=new ArrayList<>();
        
    }
    public void nuevoUsuario(String login, String contrasena,String nombre)
    {
        usuarios.add(new Usuario(login, contrasena,nombre));
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }
    public void nuevaCategoria( String denominacion){
        categorias.add(new Categoria(denominacion));
    }

    public ArrayList <Categoria> getCategorias() {
        return categorias;
    }

    public ArrayList<Noticia> getNoticias() {
        return noticias;
    }
  public boolean nuevaNoticia(Noticia noticia)  {
      boolean nuevo;
      nuevo= noticias.contains(noticia);
      if (!nuevo){
          noticias.add(noticia);
      }
      return nuevo;
      
  }
    
    
    
}
