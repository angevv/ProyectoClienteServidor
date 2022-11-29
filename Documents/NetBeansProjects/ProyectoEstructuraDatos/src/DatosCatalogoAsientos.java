

/**
 *
 * @author andrescedno
 */
public class DatosCatalogoAsientos {
    private String nombreEvento;
    private String codigoArea;
    private int numeroAsiento;
    private float costoVenta;
    private String estado;
    
    public DatosCatalogoAsientos(){
        this.nombreEvento="";
        this.codigoArea="";
        this.numeroAsiento=0;
        this.costoVenta=0;
        this.estado="";
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }
    
    

    public String getCodigoArea() {
        return codigoArea;
    }

    public void setCodigoArea(String codigoArea) {
        this.codigoArea = codigoArea;
    }

    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public float getCostoVenta() {
        return costoVenta;
    }

    public void setCostoVenta(float costoVenta) {
        this.costoVenta = costoVenta;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    } 
}
