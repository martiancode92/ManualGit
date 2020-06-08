

package modelo;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class Usuario {
    
    
    
        
    int cif;
    String nombre;
    String direccion;
    String poblacion;
    
    ArrayList <Sala> sala;

    
    public Usuario(int cif, String nombre, String direccion, String poblacion) {
        this.cif = cif;
        this.nombre = nombre;
        this.direccion = direccion;
        this.poblacion = poblacion;
        this.sala = new ArrayList<>();
    }


     public int getCif() {
        return cif;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public ArrayList<Sala> getSala() {
        return sala;
        
    }
    

}


    
    

