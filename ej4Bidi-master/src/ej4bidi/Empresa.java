/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4bidi;

import fecha.Fecha;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import numero.Numero;

/**
 *
 * @author 203p21
 */
public class Empresa {

    Empleado[] empleados;
    Categoria[] categorias;
    Float[] limites;
    Float[][] irpf;

    public Empresa(int nempleados) {
        empleados = new Empleado[nempleados];
        categorias = new Categoria[]{new Categoria("Administrativo ", 1000f),
            new Categoria("Programador ", 1200f),
            new Categoria("Analista ", 1500f),
            new Categoria("Analista-Programador ", 1800f),
            new Categoria("JefeJunior ", 2100f),
            new Categoria("Jefe Senior ", 2200f)
        };
        limites = new Float[]{1000f, 1300f, 1600f, 2000f, Float.MAX_VALUE};
        irpf = new Float[][]{
            {0.08f, 0.1f, 0.16f, 0.21f, 0.3f},
            {0.06f, 0.08f, 0.14f, 0.19f, 0.25f},
            {0.04f, 0.05f, 0.12f, 0.17f, 0.21f},
            {0.03f, 0.04f, 0.1f, 0.15f, 0.2f}};
    }

    public void cargarEmpleados() {

        String nombre;
        int codCategoria;
        Fecha falta;
        int nhijos;
        //Hijo[] hijos;

        for (int nemp = 0; nemp < empleados.length; nemp++) {
            nombre = pedirString("INTRODUCE EL NOMBRE EMPLEADO");
            falta = pedirFecha();
            visualizarCategorias();
            codCategoria = Numero.pedirNumero("CÓDIGO CATEGORIA EMPLEADO", 0, categorias.length);
            nhijos = Numero.pedirNumero("NÚMERO HIJOS DEL EMPLEADO", 0, Integer.MAX_VALUE);
            empleados[nemp] = new Empleado(nombre, falta, codCategoria, nhijos);
//            if (nhijos == 0) {
//                hijos = null;
//            } else{
//                hijos=new Hijo[nhijos];
//            }
//              empleados[nemp]=new Empleado(nombre,falta,codCategoria,hijos);
        }
    }

    public void pedirHijos() {
        Fecha fnac;
        float ingresos;
        boolean tiene;
        for (int nemp = 0; nemp < empleados.length; nemp++) {
            if (empleados[nemp].getHijos() != null) {
                System.out.println("Hijos de " + empleados[nemp].getNombre());
                for (int h = 0; h < empleados[nemp].getHijos().length; h++) {
                    System.out.println("Hijo nº" + (h + 1));
                    fnac = pedirFecha();
                    ingresos = Numero.pedirNumeroReal("introduce los ingresos", 0, Float.MAX_VALUE);
                    if (ingresos > 8000) {
                        tiene = true;
                    } else {
                        tiene = false;
                    }
                    empleados[nemp].setUnHijo(h, new Hijo(fnac, tiene));
                    //empleados[nemp].setUnHijo(h,fnac,tiene);
                }
            }
       }
    }

    public Fecha pedirFecha() {
        String fintro;
        Fecha fecha = new Fecha();
        int valor;
        do {
            fintro = pedirString("Introduzca una fecha con el formato dd/mm/aaaa");
            if (fecha.comprobar(fintro)) {
                valor = fecha.compararFecha(new Fecha());
            } else {
                valor = 1;
            }

        } while (valor == 1);
        return fecha;
    }

    public String pedirString(String mensaje) {
        InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader entrada = new BufferedReader(flujo);
        String cadena = "";
        try {
            System.out.println(mensaje);
            cadena = entrada.readLine();
            while (cadena.trim().equals("")) {
                System.out.println("Cadena vacia");
                cadena = entrada.readLine();
            }

        } catch (IOException ex) {
        }
        return cadena;
    }
    public void visualizarCategorias(){
        for (int nCat=0; nCat<categorias.length;nCat++)
        {
            System.out.println(nCat+ "  "+ categorias[nCat].getDenominacion());
        }
    }
    public void informe(){
        int fila=0;
        int nhijos;
        int columna;
        float pirf;
        float sn;
        for( int nemp=0;nemp< empleados.length; nemp++)
        {
            System.out.println(empleados[nemp].getNombre());
            System.out.print("\t"+ empleados[nemp].getFalta().visualizar());
            if ( empleados[nemp].getHijos()!=null)
            {
               nhijos=0;
               for(int x=0;x<empleados[nemp].getHijos().length;x++)
               {
                   Hijo h=empleados[nemp].getUnHijo(x);
                   if ( h.getFnac().calculoNAnos()<25 && !h.isIngresos()){
                       nhijos++;
                   }
               }
               if( nhijos>=3)
               {
                   fila=3;
               }
               else{
                   fila=nhijos;
               }
            }
            columna=busqueda(categorias[empleados[nemp].getCategoria()].getsBase());
            pirf=irpf[fila][columna];
            sn=categorias[empleados[nemp].getCategoria()].getsBase()*(1-pirf);
            System.out.println("\t"+categorias[empleados[nemp].getCategoria()].getsBase()
            +"\t"+ sn);
        }
    }
    public int busqueda (float importe){
        boolean encontrado=false;
        int p=0;
        while (p<limites.length && !encontrado){
            if ( limites[p]> importe)
                encontrado=true;
            else
                p++;
        }
        return p;
    }
    
 
}
