/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejexamen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import numero.Numero;

/**
 *
 * @author 203p21
 */
public class Empresa {

    Categoria[] categorias;
    Empleado[] empleados;
    Float limites[];
    Float irpf[][];

    public Empresa(int nempleados) {
        empleados = new Empleado[nempleados];
        categorias = new Categoria[]{new Categoria("Administrativo", 6f, 7.5f),
            new Categoria("Programador", 8f, 10.5f)};
        limites = new Float[]{1000f, 1300f,1600f,2000f,Float.MAX_VALUE};
        irpf = new Float[][]{
            {0.08f, 0.10f, 0.16f, 0.21f, 0.3f},
            {0.06f, 0.08f, 0.14f, 0.19f, 0.25f}};

    }

    public void pedirDatos() {
        String nombre;
        Fecha falta;
        Categoria c;
        int horas;
        int hijos;
        for (int nemp = 0; nemp < empleados.length; nemp++) {
            empleados[nemp] = new Empleado();
            nombre = pedirString("Nombre del empleado");
            falta = pedirFecha();
            c = pedirCategoria();
            horas = Numero.pedirNumero("Numero horas", 0, Integer.MAX_VALUE);
            hijos = Numero.pedirNumero("Numero hijos", 0, Integer.MAX_VALUE);
            empleados[nemp].grabar(nombre, falta, c, horas, hijos);

        }
    }

    private String pedirString(String mensaje) {
        String dato="";
        InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(flujo);
        try {
            System.out.print(mensaje);
            dato = teclado.readLine();
            while (dato.trim().equals("")) {
                System.out.print(mensaje);
                dato = teclado.readLine();
            }
        }catch(IOException es){}
        return dato;
    }
    private Fecha pedirFecha(){
        Fecha falta=new Fecha();
        String fecha;
        int resultado=1;
        while (resultado==1){
            fecha=pedirString("Fecha de alta:");
            if( falta.comprobarFecha(fecha)==0)
            {
                resultado=falta.comparar();
            }
            else{
                resultado=1;
            }
        }
        return falta;
    }
    private Categoria pedirCategoria(){
        int codigo;
        codigo=Numero.pedirNumero("Categoria del empleado", 0, categorias.length-1);
        return categorias[codigo];
    }
    public void informe(){
        float sbruto,descuento,sneto;
        int fila;
        int columna;
        for(int nemp=0; nemp<empleados.length;nemp++)
        {
            System.out.println(empleados[nemp].getNombre());
            System.out.print("\t"+empleados[nemp].getCategoria().getDenominacion());
            sbruto=empleados[nemp].calcularSueldo();
            System.out.print("\t"+sbruto);
            fila=empleados[nemp].getNhijos();
            if (fila>2)
                fila=3;
            columna=buscar(sbruto);
            descuento=sbruto*irpf[fila][columna];
            sneto=sbruto-descuento;
            System.out.print("\t"+descuento);
            System.out.println("\t"+sneto);
        }
    }
    
    
    private int buscar(float sueldo){
        boolean encontrado=false;
        int pos=0;
        while (pos <limites.length && !encontrado)
        {
            if (sueldo> limites[pos])
                pos++;
            else
                encontrado=true;
        }
        return pos;
    }
}
