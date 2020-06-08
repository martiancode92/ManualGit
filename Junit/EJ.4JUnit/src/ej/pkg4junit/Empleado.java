/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej.pkg4junit;

/**
 *
 * @author AdriánHernando
 */
public class Empleado {//class
    
    public float calculoSalarioBruto (String tipoEmpleado, float ventaMes, float horasExtras) {
        float sBruto;
        if(tipoEmpleado.equalsIgnoreCase("Vendedor")) {
            sBruto = 800;
        } else  {
            sBruto = 1500;
        }
        if(ventaMes >  1500) {
            sBruto = sBruto + 100;
        }
        sBruto = sBruto + 20 * horasExtras;
        return sBruto;
        }
    
    public float calculoSalarioNeto (float sBruto) {
        float sNeto;
        if(sBruto < 1000) {
            sNeto = sBruto;
        } else {
            if(sBruto < 1500) {
                sNeto = sBruto * (1 - 0.16f);
            } else {
                sNeto = sBruto * (1 - 0.18f);
            }
        }
        return sNeto;
    }
    
}//class
