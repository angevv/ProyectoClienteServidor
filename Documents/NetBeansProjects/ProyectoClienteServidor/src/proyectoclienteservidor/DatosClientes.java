/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoclienteservidor;


public class DatosClientes {
    
    //SE DEBE EXTENDER DE LA CLASE USUARIO
    private int identificacion;
    private String ciudad;
    private String dirección;
    private String telefono;
    private String correoElectronico;
    private byte estado;

    public DatosClientes() {
    }

    public DatosClientes(int identificacion, String ciudad, String dirección, String telefono, String correoElectronico, byte estado) {
        this.identificacion = identificacion;
        this.ciudad = ciudad;
        this.dirección = dirección;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.estado = estado;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getDirección() {
        return dirección;
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

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
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
