/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4bidi;

import numero.Numero;

/**
 *
 * @author 203p21
 */
public class Ej4Bidi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nempleados;
        Empresa miEmpresa;
        nempleados = Numero.pedirNumero("Introduce número de empleados", 0, Integer.MAX_VALUE);
        miEmpresa = new Empresa(nempleados);
        miEmpresa.cargarEmpleados();
        miEmpresa.pedirHijos();
        miEmpresa.informe();
    }
}
