package ut3_23academia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Academia {

    TipoCurso guitarra;
    TipoCurso piano;

    public Academia() {

        guitarra = new TipoCurso("Guitarra", 100);
        piano = new TipoCurso("Piano", 20);

    }

    public void registro() throws IOException {

        String curso;
        String nombre="";

        System.out.println("Bienvenidos a la Academia Beethoven");
        
        while (!nombre.equalsIgnoreCase("Fin")) {

            curso = pedirCurso();
            nombre = pedirNombre();
            actualizar(curso, nombre);

        }

    }

    public String pedirCurso() throws IOException {

        String curso;
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        curso = teclado.readLine();

        while (!(curso.equalsIgnoreCase(guitarra.getDenominacion())
                || curso.equalsIgnoreCase(piano.getDenominacion()))) {

            System.out.println("\n");
            System.out.println("Por favor elija una de estas dos opciones \n -Guitarra\n "
                    + "\n -Piano ");

            curso = teclado.readLine();

        }

        return curso;
    }

    public String pedirNombre() throws IOException {

        String nombre = "";
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        if(!nombre.equalsIgnoreCase("Fin")) {

            System.out.println("Por favor ingrese su nombre");
            nombre = teclado.readLine();

        }

        return nombre;
    }

    public void actualizar(String curso, String nombre) {

        if (curso.equalsIgnoreCase(guitarra.getDenominacion())) {

            guitarra.setNombre(nombre);
            guitarra.actualizarPlazas();

        } else {

            if (curso.equalsIgnoreCase(piano.getDenominacion())) {

                piano.setNombre(nombre);
                piano.actualizarPlazas();

            }

        }

    }
    
    
    
    public void informe(){
    
    
        System.out.println("\t \t \t \t INFORME DE CURSOS");
        
        System.out.println("\t \t NºdeMatriculados\t Recaudacion \t Porcentaje de Ocupacion");
        System.out.print("\t"+"Curso de Guitarra\t"+ guitarra.getContador()+"\t"+"\t"+ (guitarra.getContador()*500)+ guitarra.getContador()*100/100);
        System.out.println("\t"+"Curso de piano   \t" + piano.getContador()+"\t"+"\t"+ piano.getContador()*1000+ piano.getContador()*20/100);
        
    
    
    
    
    
    
    }







}


