/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recu_2eva;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import numero.Numero;

/**
 *
 * @author USUARIO
 */
public class Empresa {

    Empleado[] emp;
    Categorias[] cate;
    float[][] tarifas;
    float[] descuento;

    public Empresa(int nempleados) {

        emp = new Empleado[nempleados];

        tarifas = new float[][]{
                                        /*columnas*/
                                        /*0---1*/
            /*Fila 0*/ /*operador*/     {6f, 7.5f},
            /*Fila 1*/ /*programador*/  {8f, 10.5f},
            /*Fila 2*/ /*analista*/     {10f, 15f},
            /*Fila 3*/ /*jefe*/          {14f, 20f}
        };

        //creo las difrentes categorias que existen en la empresa
        cate = new Categorias[]{new Categorias("Operador"),
            new Categorias("Programador"),
            new Categorias("Analista"),
            new Categorias("Jefe")};
        
        //este array es el que nos va a aplicar el descuento que necesitamos sobre el sueldoBruto
        descuento = new float[]{0.05f, 0.10f, 0.15f};

    }

    public String pedirString(String mensaje) throws IOException {

        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        String dato = "";

        System.out.println(mensaje);
        dato = teclado.readLine();

        try {

            while (dato.trim().equals("")) {

                System.out.println(mensaje);
                dato = teclado.readLine();
            }

        } catch (IOException ex) {

        }

        return dato;
    }

    public Fecha pedirFecha(String mensaje) {

        boolean correcto;
        Fecha fhoy = new Fecha();
        Fecha falta = new Fecha();
        String fecha;

        try {

            do {
                fecha = pedirString(mensaje);
                if (falta.comprobarFecha(fecha)) {
                    if (falta.compararFecha(fhoy) !=1) {
                        correcto = true;

                    } else {

                        correcto = false;
                        System.out.println("La fecha es superior a la de hoy");
                    }

                } else {

                    correcto = false;

                }

            } while (!correcto);

        } catch (IOException ex) {

        }

        return falta;
    }

    public void cargarEmpleados() throws IOException {

        String nombre;
        Fecha falta;
        int categoria;
        float nHoras;

        for (int nemp = 0; nemp < emp.length; nemp++) {

            emp[nemp] = new Empleado();

            nombre = pedirString("Nombre Empleado ; ");
            falta = pedirFecha("Introduce Fecha Empleado: \n\n 00/00/0000 ");
            categoria = Numero.pedirNumero("Introduce Nº Categoria", 1, 4) - 1;// le pongo "-1" para que cuente el array desde 0
            nHoras = Numero.pedirNumeroReal("Nº de Horas ", 1, (Float.MAX_VALUE));

            emp[nemp].grabarEmpleado(nombre, falta, categoria, nHoras);

        }

    }

    public void informe() {

        System.out.println("\t\t\t\t\t\t\t INFORME EMPLEADOS \n\n");
        System.out.println("\tNombre \t\tCategoria \t\tSalarioBruto \t\tDescuento \t\tSalarioNeto");

        int fila; // es la categoria del empleado
        float horas;// guardo las horas totales realizadas
        float xtras;// guardo las horas extras
        float sueldoXtra = 0;// total a percibir en extras
        float sueldoJornada = 0;// total a percibir por jornada sin extras
        float salarioBruto;//   //guardo el salario bruto
        int posDescuento = 0;// variable que me sirve para seleccionar la posicion del array para aplicar descuento
        float porDesc;//
        float salarioNeto;// total a percibir menos el descuento
        for (int nemp = 0; nemp < emp.length; nemp++) {

            System.out.print("\t" + emp[nemp].getNombre()); //haya el nombre del empleado
            System.out.print("\t\t" + cate[emp[nemp].getCategoria()].getDenominacion());//haya la categoria en txt

            fila = emp[nemp].getCategoria();// Variable resumida en la que guardo la categoria del empleado
            horas = emp[nemp].getnHoras();//Variable resumida en la que guardo las horas trabajadas del empleado

            /*
            Calculo primero las horas extras, por que de las horas totales quito 40 y asi obtengo las extras.
             */
           
            if (horas > 40) {//
                
                xtras = horas - 40;//guardo el total de horas extra

                sueldoXtra = tarifas[fila][1] * xtras;//el total a percibir de extras
                
                horas-=xtras;//guardo el total de horas semanal sin horas extra
                /*
                hago este apaño en el caso de que hubiera 1 hora de mas no computara en las horas
                 de la jornada semanal
                */
            }
                if (horas <= 40) {
                    
                    /*
                    
                    con las operaciones anteriores logro quitar las horas de mas y que calcule con el numero de horas
                    maximo que es 40 o menos
                    */

                    //entonces sabiendo que tengo dos posiciones calculo el sueldo sin horas Extras
                    //y  guardo en sueldoJornada el total a percibir la posicion 0 es para horas normales
                    sueldoJornada = tarifas[fila][0] * horas;

                }


              //aqui hayo el salrio bruto                  //entre parentesis hayo el trienio del empleado
            salarioBruto = sueldoXtra + sueldoJornada + (50 * (emp[nemp].getFalta().calculoNAnos() / 3));
            
            
            
            if (salarioBruto <= 300) {//

                posDescuento = 0;

            }
            if (salarioBruto > 300 && salarioBruto < 600) {

                posDescuento = 1;

            }
            if (salarioBruto >= 600) {

                posDescuento = 2;

            }

            porDesc = salarioBruto * descuento[posDescuento];

            System.out.print("\t\t" + salarioBruto+"\t");
            salarioNeto= salarioBruto-porDesc;
            System.out.print("\t\t" + porDesc+"\t");
            System.out.print("\t\t" + salarioNeto+"\n");
            
        }

    }
}
