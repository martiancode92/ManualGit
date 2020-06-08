
package ut4_2;


public class TipoTerminal {
    
    String denominacion;
    int prepago;
    int contrato;
    int contador;

    public TipoTerminal(String denominacion) {
        this.denominacion = denominacion;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }
    
    //getters

    public int getPrepago() {
        return prepago;
    }

    public int getContrato() {
        return contrato;
    }
    
    //setters

    public void actualizarPrepago() {
        this.prepago++;
    }

    public void actualizarContrato() {
        this.contrato++;
        
    }

    public void totalVendidos() {
        // vendidos por contrato mas vendidos por prepago igual a total de venta de cada denominacion
        
        this.contador=this.contrato+this.prepago;
    }
    
    
    
    
    
    
    
}
