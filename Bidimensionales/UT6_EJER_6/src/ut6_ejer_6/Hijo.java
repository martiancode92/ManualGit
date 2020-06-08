/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut6_ejer_6;


public class Hijo {
    
    Fecha fnacimiento;
    boolean menor;

    public Hijo(Fecha fnacimiento, boolean menor) {
        this.fnacimiento = new Fecha();
        this.menor=menor;
    }

    public Fecha getFnacimiento() {
        return fnacimiento;
    }

    public boolean isMenor() {
        return menor;
    }
    

    
    
    
    
    
}
