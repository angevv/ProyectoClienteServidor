/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoclienteservidor;

public class DatosServicios {
    
    private int identificacion;
    private String descripcion;
    private DatosProveedores proveedor;
    private int duracion; // dias 
    private double costo; 
    private byte estado;
    
    public DatosServicios() {
    }

    public DatosServicios(int identificacion, String descripcion, DatosProveedores proveedor, int duracion, double costo, byte estado) {
        this.identificacion = identificacion;
        this.descripcion = descripcion;
        this.proveedor = proveedor;
        this.duracion = duracion;
        this.costo = costo;
        this.estado = estado;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public DatosProveedores getProveedor() {
        return proveedor;
    }

    public int getDuracion() {
        return duracion;
    }

    public double getCosto() {
        return costo;
    }

    public byte getEstado() {
        return estado;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setProveedor(DatosProveedores proveedor) {
        this.proveedor = proveedor;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public void setEstado(byte estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "DatosServicios{" + "descripcion=" + descripcion + '}';
    }
    

    
    
    
    
    
    
}
