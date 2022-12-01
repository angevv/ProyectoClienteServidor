/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoclienteservidor;


public class DatosClientes {
    
    private int identificacion;
    private String Cliente;
    private String ciudad;
    private String direccion;
    private String telefono;
    private String correoElectronico;
    private byte estado;

    public DatosClientes() {
    }

    public DatosClientes(int identificacion, String Cliente, String ciudad, String dirección, String telefono, String correoElectronico, byte estado) {
        this.identificacion = identificacion;
        this.Cliente = Cliente;
        this.ciudad = ciudad;
        this.direccion = dirección;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.estado = estado;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public String getCliente() {
        return Cliente;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public byte getEstado() {
        return estado;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public void setEstado(byte estado) {
        this.estado = estado;
    }
    
    
}
