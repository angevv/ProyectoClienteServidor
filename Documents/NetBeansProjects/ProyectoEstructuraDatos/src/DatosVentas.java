
public class DatosVentas {
    private int numVenta;
    private String evento;
    private String fecha;
    private String hora;
    private String nomUsuario;
    private int cantAsientos;
    private double montoPagar;
    
    public DatosVentas(){
        this.numVenta=0;
        this.evento="";
        this.fecha="";
        this.hora="";
        this.nomUsuario="";
        this.cantAsientos=0;
        this.montoPagar=0.00;
    }

    public int getNumVenta() {
        return numVenta;
    }

    public void setNumVenta(int numVenta) {
        this.numVenta = numVenta;
    }
    

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getNomUsuario() {
        return nomUsuario;
    }

    public void setNomUsuario(String nomUsuario) {
        this.nomUsuario = nomUsuario;
    }

    public int getCantAsientos() {
        return cantAsientos;
    }

    public void setCantAsientos(int cantAsientos) {
        this.cantAsientos = cantAsientos;
    }

    public double getMontoPagar() {
        return montoPagar;
    }

    public void setMontoPagar(double montoPagar) {
        this.montoPagar = montoPagar;
    }
    
    
}
