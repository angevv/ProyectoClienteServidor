/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Angel
 */
public class NodoCUsuario {
    private DatosRegistrarUsuario elemento;
    private NodoCUsuario siguiente;
    
    public NodoCUsuario(){
        this.siguiente=null;
    }

    public DatosRegistrarUsuario getElemento() {
        return elemento;
    }

    public void setElemento(DatosRegistrarUsuario elemento) {
        this.elemento = elemento;
    }

    public NodoCUsuario getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCUsuario siguiente) {
        this.siguiente = siguiente;
    }

    
    
}
