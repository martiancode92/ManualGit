/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author USUARIO
 */
public class Cliente {


    private String cif;
    private String nombre;
    private String direccion;
    private String poblacion;
    /**
     * Contiene las salas que tiene alquiladas ese client
     */
    private ArrayList<Sala> alquiladas;

    /**
     * Constructor
     * @param cif
     * @param nombre
     * @param direccion
     * @param poblacion 
     */
    public Cliente(String cif, String nombre, String direccion, String poblacion) {
        this.cif = cif;
        this.nombre = nombre;
        this.direccion = direccion;
        this.poblacion = poblacion;
        alquiladas=new ArrayList<>();
        // instanciado alquiladas. El tamaño del arrayList es 0.
    }
    
    
    public Cliente(String cif) {
        this.cif = cif;
    }
    

    public String getCif() {
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

    public ArrayList<Sala> getAlquiladas() {
        return alquiladas;
    }
    
    
        /**
  * el cliente alquila una nueva sala
  * @param s  Sala alquilada
  */
    public void guardar(Sala sala){
        alquiladas.add(sala);
    }
 
    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }
    
     @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.cif, other.cif)) {
            return false;
        }
        return true;
    }

     @Override
    public String toString() {
        return  nombre ;
    }
    
}
