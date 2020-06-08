/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerexamenpreparacion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import numero.Numero;

/**
 *
 * @author USUARIO
 */
public class Empresa {

    Categoria[] cate;

    Empleado[] emp;

    public Empresa(int num) {

        cate = new Categoria[]{
            new Categoria("Operador", 6f, 7.5f),
            new Categoria("Programador", 8f, 10.5f),
            new Categoria("Analista", 10f, 15f),
            new Categoria("Jefe-Proyecto", 14f, 20f)

        };

        emp = new Empleado[num];
    }

    public String pedirString(String mensaje) {

        String dato = "";
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        try {

            do {
                System.out.println(mensaje);
                dato = teclado.readLine().trim();

            } while (dato.equals(""));

        } catch (IOException ex) {
        }

        return dato;
    }



    public void cargarEmpleados() {

        String nombre;
        Fecha falta;
        int categoria;
        float nHoras;

        for (int i = 0; i < emp.length; i++) {

            emp[i] = new Empleado();

            nombre = pedirString("nombre empleado: ");
            falta = pedirFecha("fecha alta: ");
            categoria = Numero.pedirNumero("introduce categoria del empleado\n 1-Operador\n 2-Programador\n 3-Analista\n 4-Jefe ");
            nHoras = Numero.pedirNumeroReal("Horas trabajadas", 0, Float.MAX_VALUE);

            emp[i].grabar(nombre, falta, categoria, nHoras);

        }

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
                    if (falta.comparar(fhoy) !=1) {
                        correcto = true;

                    } else {

                        correcto = false;
                        System.out.println("La fecha es superior a la de hoy");
                    }

                } else {

                    correcto = false;

                }

            } while (!correcto);

        } catch (NumberFormatException ex) {

        }

        return falta;
    }
     
     
     public void Informe(){
     
     
         System.out.println("NOMBRE\t\tCATEGORIA\t\tSALARIO\t\tDESCUENTO\t\tSALARIONETO");
         
         int columna=0;
         int fila;
         for(int i=0; i<emp.length;i++){
         
         System.out.print(emp[i].getNombre());
         System.out.print("\t"+cate[emp[i].getCate()].getCategoria()+"\t");
          fila=emp[i].getCate();
          
          
         
         
         if(emp[i].getnHoras()>40){
         
           float sueldo =emp[i].getnHoras* cate[fila][2]:
         
         }
         
         
         System.out.print("\t"+""+"\t");
         System.out.print("\t"+""+"\t");
         System.out.print("\t"+""+"\t");
         
         
         }
         
     
     
     
     
     }

    
    

}
