package proyectoclienteservidor;

public class Factura extends Producto {
    private static int numeroFactura;
    private static String fecha;
    private static String hora;
    private static int cantidad; 
    private static Double precio;  
    private static Double total;
    public Factura(int numeroFactura,
                String fecha,
                String hora,
                String servicio,
                String nombre,            
                int cantidad,
                Double precio,
                Double total)  
       {
    super(servicio,nombre);
    this.numeroFactura = numeroFactura;
    this.fecha = fecha;
    this.hora=hora;
    this.cantidad = cantidad;
    this.precio = precio;
    this.total=total;
       }
    public Factura(){}
    public int getNumeroFactura(){return numeroFactura;}
    public String getFecha(){return fecha;}
    public String getHora(){return hora;}
    public int getCantidad(){return cantidad;}
    public Double getPrecio(){return precio;}
    public Double getTotal(){return total;}
}
