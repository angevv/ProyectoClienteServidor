
/**
 *
 * @author andrescedeno
 */
public class DatosCatalogoEvento {
    private String nombreEvento;
    private String fechaEvento;
    private String lugar;
    private String ciudad;
    private String direccion;
    private String estado;
    
    public DatosCatalogoEvento() {
        this.nombreEvento="";
        this.fechaEvento="";
        this.lugar="";
        this.ciudad="";
        this.direccion="";
        this.estado="";
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    public String getFechaEvento() {
        return fechaEvento;
    }

    public void setFechaEvento(String fechaEvento) {
        this.fechaEvento = fechaEvento;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    } 
}
