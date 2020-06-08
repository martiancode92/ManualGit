/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junitejercicio2;

/**
 *
 * @author dam
 */
public class Alumno {
    
    String nombre;
    float asignatura1;
    float asignatura2;
    float asignatura3;

    public Alumno(float asignatura1, float asignatura2, float asignatura3) {
        this.asignatura1 = asignatura1;
        this.asignatura2 = asignatura2;
        this.asignatura3 = asignatura3;
    }

    public float calculoMedia(){
        float resultado;
        resultado = (asignatura1 + asignatura2 + asignatura3) / 3;
        return resultado;
    }
    
    public boolean derechoBeca(){
        boolean derecho = false;
        if(calculoMedia() > 5){
            if(asignatura1 >= 5 && asignatura2 >= 5 && asignatura3 >= 5){
                derecho = true;
            }
        }
        return derecho;
    }
    
}
