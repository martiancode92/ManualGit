/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejexamen;

import numero.Numero;

/**
 *
 * @author 203p21
 */
public class EjExamen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nempleados;
        Empresa miEmpresa;
        nempleados=Numero.pedirNumero("Numero Empleados",1,5);
        miEmpresa=new Empresa(nempleados);
        miEmpresa.pedirDatos();
        miEmpresa.informe();
        
    }
    
}
