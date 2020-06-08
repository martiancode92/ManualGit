package ut6_ejer_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static numero.Numero.pedirNumero;

public class Empresa {

    Empleado[] emp;
    float incentivo[][];

    public Empresa() {

        emp = new Empleado[1];

        incentivo = new float[][]{
            {100f, 250f, 500f},
            {200f, 400f, 800f},
            {400f, 800f, 1600f},
            {600f, 1200f, 1400f}

        };

    }

    public String pedirString(String mensaje) {

        String dato = "";
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        try {

            do {
                System.out.println(mensaje);
                dato = teclado.readLine();

            } while (dato.trim().equals(""));

        } catch (IOException ex) {

        }

        return dato;
    }

    public Fecha pedirFecha(String mensaje) {

        Boolean correcto = false;
        Fecha fhoy = new Fecha();
        Fecha falta = new Fecha();
        String fecha;

        do {
            fecha = pedirString(mensaje);

            if (falta.comprobarFecha(fecha)) {
                if (falta.compararFecha(fhoy) != 1) {
                    correcto = true;

                } else {
                    correcto = false;
                    System.out.println("La fecha es superior a la de hoy");

                }

            } else {

                correcto = false;
                System.out.println("No cumple las condiciones "
                        + "\n por favor ingrese la fecha en el sigiente formato"
                        + "\n dd/mm/aaaa");

            }

        } while (!correcto);

        return falta;
    }

    public void cargarEmpleados() {

        String nombre;
        Fecha falta;
        int nhijos;

        for (int i = 0; i < emp.length; i++) {

            emp[i] = new Empleado();
            nombre = pedirString("Nombre Empleado :");
            falta = pedirFecha("Introduce la fecha de alta");
            nhijos = pedirNumero("Introduce el numero de hijos");

            emp[i] = new Empleado(nombre, falta, nhijos);

        }

    }

    public void cargarHijos() {

        Fecha fnac;
        boolean menor;

        for (int i = 0; i < emp.length; i++) {

            if (emp[i].getHijos() != null) {

                System.out.println("hijo/s de..." + emp[i].getNombre());
                    
             
                for (int h = 0; h < emp[i].getHijos().length; h++) {
                    System.out.println("hijo nº" + (h + 1));
                    fnac = pedirFecha("Introduce la fecha de nacimiento");
                    if (fnac.calculoNannos() < 18) {
                        menor = true;

                    } else {

                        menor = false;

                    }
 
                    emp[i].setUnHijo(h, new Hijo(fnac, menor));
                }

            }

        }

    }
    
    public void Informe(){
    
    int fila = 0;
    int columna = 0;
    String nombre;
    int nHijos = 0;
    int antiguo = 0;
    float bonificacion;
  
    
        System.out.println("\t\t\t\tINFORME ANUAL");
        
        System.out.println("Nombre\tNº Hijos \t fecha h1\t fecha h2 \t incentivo \t observaciones");
    
    for(int i=0; i<emp.length; i++){
        
        
        System.out.print(emp[i].getNombre());
        System.out.print("\t"+emp[i].sumarHijos());
        
        for(int x=0; x<emp[i].getHijos().length; x++){
            
            Hijo h=emp[i].getUnHijo(x);
            System.out.print("\t"+h.getFnacimiento().visualizarMesLetra());
            
            if(h.getFnacimiento().calculoNannos()<18){
            
            nHijos++;
            
            columna= nHijos;
            
            }else if(nHijos>3){
            
                columna=3;
            
            
            }
        
        
        }
        
        

          if(antiguo<5){
        
            fila =0;
        } else if( antiguo>5 && antiguo<10){
        
            fila=1;
            
        }else if( antiguo>10 && antiguo<20){
            
            fila=2;
        }else if(antiguo>20){
        
        
            fila=3;
        }
        
        bonificacion =incentivo[fila][columna];
    
        System.out.print("\t"+bonificacion);
 
        
   }
    
    
    }
    
  
    
    
  
    

}




/**
 * 
 * 
 */
