package proyectoclienteservidor;

public class Factura {
    private int numeroFactura;
    private String fecha;
    private String hora;
    private String descipcionServicios;
    private String cliente;
    private int cantidad; 
    private Double precio;  
    private Double total;
    
    public Factura(){
        
    }
    
   public Factura(int numeroFactura, String fecha, String hora, String descipcionServicios, String cliente, int cantidad, Double precio, Double total ){
       this.numeroFactura=numeroFactura;
       this.fecha=fecha;
       this.hora=hora;
       this.descipcionServicios=descipcionServicios;
       this.cliente=cliente;
       this.cantidad=cantidad;
       this.precio=precio;
       this.total=total;
   }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
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

    public String getDescipcionServicios() {
        return descipcionServicios;
    }

    public void setDescipcionServicios(String descipcionServicios) {
        this.descipcionServicios = descipcionServicios;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
   
   
}
