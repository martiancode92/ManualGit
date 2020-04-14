/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import static java.awt.SystemColor.info;
import java.util.ArrayList;
import modelo.Administrador;
import modelo.Lineas;
import modelo.Standart;

public class GestiondeLineas {
    //Creo l obejto admin por que es el unico que puede crear lineas.
    Administrador admin;
    //Creo 1 objeto standart para hacer  la co
    Standart standart;
    //Aqui tengo el conjunto de lineas
    ArrayList<Lineas> lineas;
    
    //Aqui tengo el conjunto de Usuarios- Administradores & Usuarios
    ArrayList<Usuario> usuario;

// Constructor para inicializar el conjunto de datos dinamicos
    public GestiondeLineas() {
        lineas = new ArrayList<>();
        usuario = new ArrayList<>();
    }

    public void crearUsuarios() {
        //Como indica el ejercicio los usuarios ya deben estar creados
        Administrador a = new Administrador("admin", "contra");
        Standart s = new Standart("stan", "contra");

        for (int i = 0; i < usuario.size(); i++) {

            usuario.get(i).guardarAdmin(a);
            usuario.get(i).guardarStandart(s);

        }

    }

    public void crearLineas() {
        
        /*Aqui he creado un Objeto para poder guardarlo en ArrayList.
        *El ejerciio dice que el administrador es quien crea las Lineas.
        */
        Lineas l= new Lineas();

for(int i=0; i<usuario.size(); i++){// no estoy muy seguro de esta parte.
       
    
    admin.añadirLineas(l);
          
           lineas.add(l);

                    
                    }
    }

}
