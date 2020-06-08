/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut6_ejercicio5;

/**
 *
 * @author dam
 */
public class Empresa {
    
    Trabajador[] trabajadores;
    float [] importeTrieneios;
    
    
    
    public Empresa(){
    
    importeTrieneios = new float[]{
     0,100f,250f,500f,600,1200f,1500f};
    
    
    trabajadores = new Trabajador[10];

    }
    
      public Empresa(int ntrabajadores){
    
    importeTrieneios = new float[]{
     0,100f,250f,500f,600,1200f,1500f};
    
    
    trabajadores = new Trabajador[ntrabajadores];

    }
}
