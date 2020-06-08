package examen2eva;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import numero.Numero;

public class Empresa {

    Empleado[] emp;
    Categoria[] cate;
    float irpf[][];
    float limites[];

    public Empresa(int nempleados) {

        emp = new Empleado[nempleados];

        cate = new Categoria[]{
            new Categoria("Administrativo", 1000f, 20f),
            new Categoria("Programador", 1200f, 30f),
            new Categoria("Analista", 1500f, 50f),
            new Categoria("Analista-Programador", 2000f, 100f),};
        
        limites= new float[]{1000f,2000f,3000f, Float.MAX_VALUE};

        irpf = new float[][]{
            {10f, 15f, 20f, 25f},
            {12f, 14f, 16f, 18f,},
            {5f, 7f, 10f, 15f,},
            {10f, 20f, 30f, 40f}

        };

    }

    public Empresa() {

        emp = new Empleado[5];

        cate = new Categoria[]{
            new Categoria("Administrativo", 1000f, 20.0f),
            new Categoria("Programador", 1200f, 30.0f),
            new Categoria("Analista", 1500f, 50.0f),
            new Categoria("Analista-Programador", 2000f, 100.0f),};
        
         limites= new float[]{1000f,2000f,3000f, Float.MAX_VALUE};


        irpf = new float[][]{
            {0.10f, 0.15f, 0.20f, 0.25f},
            {0.12f, 0.14f, 0.16f, 0.18f,},
            {0.5f, 0.7f, 0.10f, 0.15f,},
            {0.10f, 0.20f, 0.30f, 0.40f}

        };

    }

    public String pedirString(String mensaje) {
        String dato = "";
        boolean correcto = false;

        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        try {

            System.out.println(mensaje);
            dato = teclado.readLine();

            do {

                if (dato.trim().equalsIgnoreCase("")) {

                    System.out.println(mensaje);
                    dato = teclado.readLine();
                    correcto = false;

                } else {

                    correcto = true;

                }

            } while (!correcto);

        } catch (IOException ex) {
        }

        return dato;
    }

    public Fecha pedirFecha(String mensaje) {
        boolean correcto = false;
        String fecha = "";
        Fecha fhoy = new Fecha();
        Fecha falta = new Fecha();

       

        try {
            
            
            System.out.println(mensaje);
            fecha = pedirString("");

            do {

                if (falta.comprobarFecha(fecha)) {
                    if (falta.compararFecha(fhoy) == 1) {
                        correcto = false;
                        System.out.println(mensaje);
                        fecha = pedirString("");

                    } else {
                      correcto=true;
                    }

                } else {
                    System.out.println("El formato a de ser dd/mm/aaaa");
                }


            }while (!correcto);

        }  catch (NumberFormatException ex) {
            }

        return falta;
    }

    public void crearEmpleados() {

        for (int i = 0; i < emp.length; i++) {

            emp[i] = new Empleado();

        }
    }

    public void cargarDatos() {

        String nombre;
        Fecha falta;
        int categoria;
        float extras;

        for (int i = 0; i < emp.length; i++) {

            nombre = pedirString("Nombre del Empleado");
            falta = pedirFecha("Fecha de alta del Empleado");
            categoria = Numero.pedirNumero("Introduce nº Categoria del empleado \n 1- admin"
                    + " \n 2- programador " + " \n 3- analista  " + " \n 4- Analista-programador ", 1, 4);
            extras = Numero.pedirNumeroReal("Introduce horas Xtrass", 0, Float.MAX_VALUE);
            
            emp[i]= new Empleado(nombre,falta,categoria-1, extras);
        }

    }
    
    public void Informe(){
    
  
    
    float xtras;
    float sbase;
    float precio;
    int trienio;
    float sbruto;
    int columna;
    int fila;
    float pirpf;
    float sn;
   
    
    
        System.out.println("\t\t\t INFORME");
        System.out.println("\t CATEGORIA \tNOMBRE \t SUELDO(A PERCIBIR) ");
        
       for (int i=0; i< emp.length; i++){
           
           
            System.out.print("\t" +cate[emp[i].getCate()].getDenominacion());
            System.out.print("\t" +emp[i].getNombre());
            
            columna= emp[i].getCate();
            
            sbase= cate[emp[i].getCate()].getSbase();
            xtras= emp[i].getXtras();
            precio=cate[emp[i].getCate()].getPrecioXtras();
            
            trienio=  emp[i].getFalta().calcularAnnos()/3;
            sbruto= sbase+(xtras*precio)+(trienio*50);
            
            
           fila= busqueda(sbruto);
           
           pirpf=irpf[fila][columna];
           
           float iva=sbruto*(1-pirpf);
           
           sn=sbruto-iva;
           
           System.out.println("\t"+sn);
           
           
           
           
       }
    
    
    
    }

        public int busqueda (float sbruto){
        boolean encontrado=false;
        int p=0;
        while (p<limites.length && !encontrado){
            if ( limites[p]> sbruto)
                encontrado=true;
            else
                p++;
        }
        return p;
    }
    
    

}
