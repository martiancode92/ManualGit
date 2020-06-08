



package ut6_ejer4;

import java.util.Calendar;
import java.util.GregorianCalendar;





public class Fecha {

    int dia;
    int mes;
    int anno;
    int[] diasMes;
    String[] MESES = {"ENERO", "FEBRERO", "MARZO", "ABRIL",
        "MAYO", "JUNIO", "JULIO", "AGOSTO", "SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE", "DICIEMBRE"};

    public Fecha() {

        Calendar fhoy = new GregorianCalendar();

        dia = fhoy.get(Calendar.DAY_OF_MONTH);
        mes = fhoy.get(Calendar.MONTH) + 1;
        anno = fhoy.get(Calendar.YEAR);

        diasMes = new int[]{31, 28, 29, 30, 31, 31, 31, 31, 30, 31, 30, 31};
    }

    public int getDia() {

        return dia;
    }

    public int getMes() {

        return mes;

    }

    public int getAnno() {

        return anno;

    }

    public boolean comprobarFecha(String fechaDada) {

        boolean correcto = false;

        int dia, mes, anno;

        String[] fechaDividida = fechaDada.split("/");

        try {

            if (fechaDividida.length == 3) {

                dia = Integer.parseInt(fechaDividida[0]);
                mes = Integer.parseInt(fechaDividida[1]);
                anno = Integer.parseInt(fechaDividida[2]);

                if (anno >= 1500 && anno <= 2100) {
                    if (mes >= 1 && mes <= 12) {
                        if (dia >= 1 && dia <= diasMes[mes - 1]) {

                            correcto = true;
                            this.dia = dia;
                            this.mes = mes;
                            this.anno = anno;

                        }

                    }

                }

            }

        } catch (NumberFormatException ex) {

        }
        return correcto;
    }

    public int compararFecha(Fecha factual) {

        int resultado = 0;

        if (anno < factual.getAnno()) {
            resultado = -1;
        } else if (anno > factual.getAnno()) {
            resultado = 1;
        } else if (mes < factual.getMes()) {
            resultado = -1;
        } else if (mes > factual.getMes()) {
            resultado = 1;
        } else if (dia < factual.getDia()) {
            resultado = -1;
        } else if (dia > factual.getDia()) {
            resultado = 1;

        }
        return resultado;
    }

    public int calculoNannos() {

        int Nannos;

        Fecha factual = new Fecha();

        Nannos = factual.getAnno() - anno;
        if (mes > factual.getMes()
                || mes == factual.getMes() && dia > factual.getDia()) {

            Nannos--;
        }

        return Nannos;
    }
    
    
        public int calculoNannos(Fecha factual) {

        int Nannos;
        Nannos = factual.getAnno() - anno;
        if (mes > factual.getMes()
                || mes == factual.getMes() && dia > factual.getDia()) {

            Nannos--;
        }

        return Nannos;
    }
        
        public String visualizarMesLetra(){
        String mensaje;
        mensaje=dia+" de "+ MESES[mes-1]+" de "+ anno;
        return mensaje;
    }
        
        
}

