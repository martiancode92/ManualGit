package ut4_4;

public class TipoAutobus {

    String denom;
    String cliente;
    int plazas;
    int fumadores;
    
    int ocu;

    public TipoAutobus(String denom) {
        this.denom = denom;
    }

    //denominacion de autobus tambien se usa como destino
    public String getDenom() {
        return denom;
    }

    public void setDenom(String denom) {
        this.denom = denom;
    }

    //fumadores
    public int getFumadores() {
        return fumadores;
    }

    //cliente nombre
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getCliente() {
        return cliente;
    }

    public int plazasTotales() {
        return plazas;
    }

    public void plazas(int plazas) {
        this.plazas+=plazas;
        
        if(plazas >35 ){
        
            System.out.println("No quedan plazas normales");
            getFumadores();
        
        
        
        }

    }
    
    public void setPlazas(){
    
    this.plazas=35;
    }

   

   
    

    public void actualizarFumadores(int fumadores){
    
    this.fumadores+=fumadores;
    
    }
    
    
    
    
    


    public void plazasLibres() {

        plazas -= ocu;

        boolean libre;
        
        if (plazas < 1) {

            System.out.println("No Quedan plazas " + plazas);
            
            libre=false;
        } else {

            System.out.println("Quedan Plazas " + plazas);
        }

    }

    public void plazasOcupadas() {

        this.ocu = fumadores + plazas;

    }

    public void plazasFumadores() {

        this.fumadores = 20;
        this.fumadores -= fumadores;

        if (this.fumadores >= 20) {

            System.out.println("No hay plazas plazas para fumadores");

        } else {

            System.out.println("Hay " + fumadores + " de fumadores");

        }

    }

}
