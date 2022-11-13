/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoclienteservidor;

interface Catalogos {
// SE TUVO QUE CREAR UNA INTERFAZ YA QUE JAVA NO ACEPTA HERENCIA MULTIPLE Y YA
// LAS CLASES EXTENDIAN DE javax.swing.JFrame
    
    public void agregar();
    public void editar();
    public void inactivar();
    public void consultar();
    public boolean buscar(int id, String nombreODescripcion);
    public void guardarArchivo();
}
