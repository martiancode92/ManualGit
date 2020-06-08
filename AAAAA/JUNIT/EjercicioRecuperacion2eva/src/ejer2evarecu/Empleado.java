/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer2evarecu;

/**
 *
 * @author USUARIO
 */
public class Empleado {

    String nombre;
    boolean tipo;
    float ventasRealizadas;
    float horasXtras;
    final float precioHoras = 20;

    public Empleado(String nombre, boolean tipo, float ventasRealizadas, float horasXtras) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.ventasRealizadas = ventasRealizadas;
        this.horasXtras = horasXtras;
    }

    public float calcularSueldoBruto() {

        float sBruto;
        float ventas = 0;

        if (tipo == false) {

            sBruto = 800;
            ventas += ventasRealizadas * 0.05;
            horasXtras += horasXtras * precioHoras;
            sBruto += ventas + horasXtras;

        } else {

            sBruto = 1500;
            ventas += ventasRealizadas * 0.05;
            horasXtras += horasXtras * precioHoras;
            sBruto += ventas + horasXtras;

        }

        return sBruto;
    }

    public float calcularSalarioNeto() {

        float sBruto = calcularSueldoBruto();

        if (sBruto > 1000) {

            sBruto -= sBruto * 0.15f;

        }

        return sBruto;
    }
}
