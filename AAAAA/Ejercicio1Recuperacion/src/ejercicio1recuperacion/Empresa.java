/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1recuperacion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import numero.Numero;

/**
 *
 * @author Francisco Javier Alameda Díez
 */
public class Empresa {

    Empleado[] empleados;
    Categoria[] categorias;
    float[][] tarifas;
    float[] descuento;

    public Empresa(int nempleados) {
        empleados = new Empleado[nempleados];

        categorias = new Categoria[]{new Categoria("Operador"),
            new Categoria("Programador"),
            new Categoria("Analista"),
            new Categoria("Jefe")};

        descuento = new float[]{0.05f, 0.10f, 0.15f};

        tarifas = new float[][]{
            /*columnas*/
            /*0---1*/
            /*Fila 0*/ /*operador*/{6f, 7.5f},
            /*Fila 1*/ /*programador*/ {8f, 10.5f},
            /*Fila 2*/ /*analista*/ {10f, 15f},
            /*Fila 3*/ /*jefe*/ {14f, 20f}
        };

    }

    private String pedirString(String mensaje) {
        String dato = "";
        InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(flujo);
        try {
            System.out.print(mensaje);
            dato = teclado.readLine();
            while (dato.trim().equals("")) {
                System.out.print(mensaje);
                dato = teclado.readLine();
            }
        } catch (IOException es) {
        }
        return dato;
    }

    public void visualizarCategoria() {
        for (int pos = 0; pos < categorias.length; pos++) {
            System.out.println(pos + " ->" + categorias[pos].getDenominacion());
        }
    }

    private Fecha pedirFecha(String mensaje) {
        Fecha falta = new Fecha();
        String fecha;
        int resultado = 1;
        while (resultado == 1) {
            fecha = pedirString("Fecha de alta:");
            if (falta.comprobarFecha(fecha) == 0) {
                resultado = falta.comparar();
            } else {
                resultado = 1;
            }
        }
        return falta;
    }

    public void cargarDatos() {
        String nombre;
        Fecha fechaAlta;
        int cate;
        int horasTrabajadas;

        for (int nempleado = 0; nempleado < empleados.length; nempleado++) {
            empleados[nempleado] = new Empleado();

            nombre = pedirString("NOMBRE DEL EMPLEADO");
            fechaAlta = pedirFecha("Introducir fecha de alta");
            cate = Numero.pedirNumero("Introduce la categoria del empleado") - 1;//para que empieze a contar desde zero
            horasTrabajadas = Numero.pedirNumero("NÚMERO DE HORAS", 0, Integer.MAX_VALUE);

            empleados[nempleado].guardarEmpleado(nombre, fechaAlta, cate, horasTrabajadas);
        }
    }



    public void informe() {
        float salarioBruto;
        float porDesc;
        int pos = 0;
        float neto = 0;
        int fila;
        float horas;
        float xtras;

        System.out.println("INFORME EMPLEADOS");
        System.out.println("NOMBRE\t CATEGORIA\t SALARIO BRUTO\t DESCUENTO\t SALARIO NETO\t");
        for (int nemp = 0; nemp < empleados.length; nemp++) {
            //variables resumidas para capturar cateogoria y horas trabajadas
            fila = empleados[nemp].getCategoria();
            horas = empleados[nemp].getHorasTrabajadas();
            
            xtras= horas -40;//guardo las horas extras
            horas= horas-xtras;//guardo las horas ordinarias
            
            
            System.out.print(empleados[nemp].getNombre());//haya el nombre del empleado
            System.out.print("\t" + categorias[empleados[nemp].getCategoria()].getDenominacion());//haya la categoria

            salarioBruto
                    = xtras * tarifas[fila][1]//numero de horas Xtra por tarifa extra
                    + horas * tarifas[fila][0]//numero de horas ordinarias por tarifa normal
                    + (50 * empleados[nemp].getFechaAlta().calculoAnnos() / 3); //calculo trienio

            System.out.print("\t" + salarioBruto + "€");//salarioBruto

            if (salarioBruto <= 300) {//

                pos = 0;

            }
            if (salarioBruto > 300 && salarioBruto < 600) {

                pos = 1;

            }
            if (salarioBruto >= 600) {

                pos = 2;

            }
            porDesc = salarioBruto * descuento[pos];

            System.out.print("\t\t" + porDesc + "€");// porcenta de descuento

            neto = salarioBruto - porDesc;

            System.out.println("\t\t" + neto + "€");//sueldo neto

        }
    }

    public int busquedaFila(int fila) {
        boolean encontrado = false;
        int p = 0;
        while (p < descuento.length && !encontrado) {
            if (descuento[p] > fila) {
                encontrado = true;
            } else {
                p++;
            }
        }
        return p;
    }

}
