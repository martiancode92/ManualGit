/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut6_ejer4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import numero.Numero;

public class Empresa {

    Empleado[] emp;
    Categoria[] cate;
    Float[] limites;
    Float[][] irpf;

    public Empresa(int nemp) {

        emp = new Empleado[nemp];

        cate = new Categoria[]{
            new Categoria("Administrativo", 1000f),
            new Categoria("Programador", 1200f),
            new Categoria("Analista", 1500f),
            new Categoria("Analista-Programador", 1800f),
            new Categoria("Jefe-Junior", 2100f),
            new Categoria("Jefe-Senior", 2200f)
        };

        limites = new Float[]{1000f, 1300f, 1600f, 2000f, Float.MAX_VALUE};

        irpf = new Float[][]{
            {0.08f, 0.1f, 0.16f, 0.21f, 0.3f},
            {0.06f, 0.08f, 0.14f, 0.19f, 0.25f},
            {0.04f, 0.05f, 0.12f, 0.17f, 0.21f},
            {0.03f, 0.04f, 0.1f, 0.15f, 0.2f}};
    }

    public void cargarEmpleado() throws IOException {

        String nombre;
        Fecha falta;
        int categoria;
        int nhijos;

        for (int i = 0; i < emp.length; i++) {

            emp = new Empleado[i];

            nombre = pedirString("Nombre Empleado");
            falta = pedirFecha();
            System.out.print("\n 1- Administrativo \n 2- Programador\n 3- Analista"
                    + "\n 4- Analista-Programador \n 5- Jefe-Junior \n 6- Jefe-Senior");
            categoria = Numero.pedirNumero("Introduce Nº categoria", 1, 6);
            nhijos = Numero.pedirNumero("Numero de Hijos");
            
            
        }

    }

    public void pedirHijos() throws IOException {

        Fecha fnac;
        float ingresos;
        boolean tiene;

        for (int nemp = 0; nemp < emp.length; nemp++) {

            if (emp[nemp].getHijos() != null) {

                System.out.println("Hijo/s de " + emp[nemp].getNombre());
                for (int h = 0; h < emp[nemp].getHijos().length; h++) {
                    System.out.println("Hijo nº" + (h + 1));
                    fnac = pedirFecha();
                    ingresos = Numero.pedirNumero();
                    if (ingresos > 8000) {

                        tiene = true;
                    } else {

                        tiene = false;
                    }
                    emp[nemp].setUnHijo(h, new Hijo(fnac, tiene));
                }

            }

        }

    }

    public String pedirString(String mensaje) throws IOException {

        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        String dato = "";

        System.out.println(mensaje);
        dato = teclado.readLine();
        try {

            System.out.println(mensaje);
            dato = teclado.readLine();

        } catch (IOException ex) {
        }

        return dato;
    }

    public Fecha pedirFecha() throws IOException {

        String fintro;
        Fecha fecha = new Fecha();
        int valor = 0;

        do {
            fintro = pedirString("Introduzca una fecha con el formato dd/mm/aaaa");

            if (fecha.comprobarFecha(fintro)) {
                valor = fecha.compararFecha(new Fecha());

            } else {

                valor = 1;
            }

        } while (valor == 1);

        return fecha;
    }

    public void visualizarCategorias() {
        for (int nCat = 0; nCat < cate.length; nCat++) {
            System.out.println(nCat + "  " + cate[nCat].getNombre());
        }
    }

    public int busqueda(float importe) {

        boolean encontrado = false;
        int p = 0;
        while (p < limites.length && !encontrado) {

            if (limites[p] > importe) {
                encontrado = true;
            } else {
                p++;
            }
        }

        return p;
    }

    public void informe() {

        int fila = 0;
        int nhijos;
        int columna;
        float pirf;
        float sn;

        for (int nemp = 0; nemp < emp.length; nemp++) {

            System.out.println(emp[nemp].getNombre());
            System.out.println("\t" + emp[nemp].getCate());
            if (emp[nemp].getHijos() != null) {

                nhijos = 0;
                for (int x = 0; x < emp[nemp].getHijos().length; x++) {

                    Hijo h;
                    h = emp[nemp].getUnHijo(x);
                    if(h.getFnacimiento().calculoNannos()<25 && !h.isTiene()){
                    
                        nhijos++;

                    }
                    if(nhijos>=3)
                    {
                        fila=3;
                    
                    }
                    else{
                    
                        fila=nhijos;
                    }
                }

            }
            columna= busqueda(cate[emp[nemp].getCate()].sbase);
            pirf= irpf[fila][columna];
            sn=cate[emp[nemp].getCate()].getSbase()*(1-pirf);
            System.out.print("\t"+cate[emp[nemp].getCate()].getSbase()
            +"\t"+sn);
        }

    }
}
