/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoclienteservidor;

import java.util.ArrayList;

public class DatosPaquetesEspeciales {
    
    private int identificacion;
    private String descripcion;
    private ArrayList<DatosServicios> servicios = new ArrayList<DatosServicios>();
    private byte estado;

    public DatosPaquetesEspeciales() {
    }

    public DatosPaquetesEspeciales(int identificacion, String descripcion, byte estado) {
        this.identificacion = identificacion;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public ArrayList<DatosServicios> getServicios() {
        return servicios;
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

    public void setServicios(ArrayList<DatosServicios> servicios) {
        this.servicios = servicios;
    }

    public void setEstado(byte estado) {
        this.estado = estado;
    }
    
    
}
