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
    
    public Empresa(int nempleados) {
        empleados = new Empleado[nempleados];
        categorias = new Categoria[]{
            new Categoria("Operador", 6f, 7.5f),
            new Categoria("Programador", 8f, 10.5f),
            new Categoria("Analista", 10f, 15f),
            new Categoria("Jefe Proyecto", 14f, 20f)
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
     
     private Fecha pedirFecha() {
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
     
    public float calculoMedia() {
        float salarioBruto, salarioNeto, descuento, media = 0;
        int fila, trienios, pos;
        for(int emp = 0; emp < empleados.length; emp++) {
            fila = empleados[emp].getCategoria();
            trienios = empleados[emp].getFechaAlta().calculoAnnos() / 3;
            salarioBruto = empleados[emp].horasOrdinarias() * importes[fila][0] + 
                    empleados[emp].horasExtra() * importes[fila][1] +
                    50f * trienios;
            pos = busquedaDes(salarioBruto);
            descuento = salarioBruto * descuentos[pos].getPorcentaje();
            salarioNeto = salarioBruto - descuento;
            media = media + salarioNeto;
        }
        media = media / empleados.length;
        return media;
    }
    
    public void cargarDatos() {
        String nombre;
        Fecha fechaAlta;
        Categoria categoria;
        int horasTrabajadas;
        int codCategoria;
        for (int nempleado = 0; nempleado < empleados.length; nempleado++) {
            empleados[nempleado] = new Empleado();
            nombre = pedirString("NOMBRE DEL EMPLEADO");
            fechaAlta = pedirFecha();
            visualizarCategoria();
            horasTrabajadas = Numero.pedirNumero("NÚMERO DE HORAS", 0, Integer.MAX_VALUE);
            codCategoria = Numero.pedirNumero("INTRODUCE CÓDIGO DE LA CATEGORIA", 0, categorias.length);
            empleados[nempleado] = new Empleado(nombre, fechaAlta, categorias[codCategoria], horasTrabajadas);
        }
    }
    
    public void informe() {
        float salarioBruto, descuento, salarioNeto;
        int fila, trienios, pos;
        System.out.println("INFORME EMPLEADOS");
        System.out.println("NOMBRE\t CATEGORIA\t SALARIO BRUTO\t DESCUENTO\t SALARIO NETO\t");
        for (int nemp = 0; nemp < empleados.length; nemp++) {
            fila = empleados[emp].getCategoria();
            trienios = empleados[emp].getFalta().calculoNAnos() / 3;
            salarioBruto = empleados[nemp].calcularSueldo();
            salarioBruto = empleados[emp].horasOrdinarias() * importes[fila][0] + empleados[emp].horasExtra() * importes[fila][1] + 50f * trienios;
            pos = busquedaDes(salarioBruto);
            descuento = salarioBruto * descuentos[pos].getPorcentaje();
            salarioNeto = salarioBruto - descuento;
            if(salarioNeto > calculoMedia()){
            System.out.println(empleados[nemp].getNombre());
            System.out.print("\t" + empleados[nemp].getCategoria().getDenominacion());
            System.out.print("\t" + salarioBruto + "€");
            System.out.print("\t" + descuento + "€");
            System.out.println("\t" + salarioNeto + "€");
            }
        }
    }
       
}
