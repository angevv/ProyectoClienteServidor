
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Kou
 */
public class ListaSimpleCircular {

    public NodoCatalogoEvento inicio;
    private NodoCatalogoEvento fin;

    public ListaSimpleCircular() {
        this.inicio = null;
        this.fin = null;
    }

    public boolean esVaciaSC() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

   /* public boolean noExiste(String lugar, String nombre, String fecha) {
        if (!esVaciaSC()) {
            NodoCatalogoEvento aux = inicio;
            if (!aux.getElemento().getNombreEvento().equals(nombre)) {
                if (aux.getElemento().getLugar().equals(lugar) || aux.getElemento().getFechaEvento().equals(fecha)) {
                    return false;
                } else {
                    return true;
                }
            } else if (aux.getElemento().getNombreEvento().equals(nombre)) {
                return false;
            } 
            aux = aux.getSiguiente();
            while (aux != inicio) {
                if (!aux.getElemento().getNombreEvento().equals(nombre)) {
                    if (aux.getElemento().getLugar().equals(lugar) || aux.getElemento().getFechaEvento().equals(fecha)) {
                        return false;
                    } else {
                        return true;
                    }
                } else if (aux.getElemento().getNombreEvento().equals(nombre)) {
                    return false;
                }
                aux = aux.getSiguiente();
            }
        }
        return true;
    }*/

    public void agregar(String nombre, String fecha, String lugar,String ciudad, String direccion, String estado){
        DatosCatalogoEvento d = new DatosCatalogoEvento();
        d.setNombreEvento(nombre);
        d.setFechaEvento(fecha);
        d.setLugar(lugar);
        d.setCiudad(ciudad);
        d.setDireccion(direccion);
        d.setEstado(estado);
    
        NodoCatalogoEvento nuevo = new NodoCatalogoEvento();
        nuevo.setElemento(d);
        
        if(esVaciaSC()){
           inicio=nuevo;
           fin=nuevo;
           fin.setSiguiente(inicio); 
        } else if (d.getNombreEvento().compareTo(inicio.getElemento().getNombreEvento())<0 ){ 
           nuevo.setSiguiente(inicio); 
           inicio=nuevo;
           fin.setSiguiente(inicio);
       } else if (d.getNombreEvento().compareTo(fin.getElemento().getNombreEvento())>=0){ 
           fin.setSiguiente(nuevo);
           fin = nuevo;
           fin.setSiguiente(inicio); 
       } else { 
           NodoCatalogoEvento aux=inicio;
           while(aux.getSiguiente().getElemento().getNombreEvento().compareTo(d.getNombreEvento())<0){
               aux=aux.getSiguiente();
           }
           nuevo.setSiguiente(aux.getSiguiente()); 
           aux.setSiguiente(nuevo); 
       }
    }
    
    public void guardarArchivo(){
        try {
            DataOutputStream salida = new DataOutputStream(new FileOutputStream("CatalogoEventos.dat", false));
            if(!esVaciaSC()){
                NodoCatalogoEvento aux=inicio;
                salida.writeUTF(aux.getElemento().getNombreEvento());
                salida.writeUTF(aux.getElemento().getFechaEvento());
                salida.writeUTF(aux.getElemento().getLugar());
                salida.writeUTF(aux.getElemento().getCiudad());
                salida.writeUTF(aux.getElemento().getDireccion());
                salida.writeUTF(aux.getElemento().getEstado());
                aux=aux.getSiguiente();
                while(aux!=inicio){
                    salida.writeUTF(aux.getElemento().getNombreEvento());
                    salida.writeUTF(aux.getElemento().getFechaEvento());
                    salida.writeUTF(aux.getElemento().getLugar());
                    salida.writeUTF(aux.getElemento().getCiudad());
                    salida.writeUTF(aux.getElemento().getDireccion());
                    salida.writeUTF(aux.getElemento().getEstado());
                    aux=aux.getSiguiente();
                }
            }
            salida.close();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "¡Ocurrió un error al guardar!",
                    "Error al guardar", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "¡Ocurrió un error al guardar!",
                    "Error al guardar", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void cargarEventos(){
        try {
            DataInputStream entrada = new DataInputStream(new FileInputStream(
                    "CatalogoEventos.dat"));
            try {
                while (true) {
                    DatosCatalogoEvento ce = new DatosCatalogoEvento();
                    ce.setNombreEvento(entrada.readUTF());
                    ce.setFechaEvento(entrada.readUTF());
                    ce.setLugar(entrada.readUTF());
                    ce.setCiudad(entrada.readUTF());
                    ce.setDireccion(entrada.readUTF());
                    ce.setEstado(entrada.readUTF());
                    
                    agregar(ce.getNombreEvento(),ce.getFechaEvento(),ce.getLugar(),ce.getCiudad(),ce.getDireccion(),ce.getEstado());
                }
            } catch (EOFException eeof) {
                entrada.close();
            }
        } catch (IOException eioe) {
            JOptionPane.showMessageDialog(null, "¡Error en el dispositivo de almacenamiento!",
                    "Error en el dispositivo", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
     public void actualizarArchivo(String buscar) {
        try {
            DatosCatalogoEvento ce = new DatosCatalogoEvento();
            DataInputStream entrada = new DataInputStream(new FileInputStream(
                    "CatalogoEventos.dat"));
            DataOutputStream salida = new DataOutputStream(new FileOutputStream(
                    "temporalEventos.dat"));
            try {
                while (true) {
                    ce.setNombreEvento(entrada.readUTF());
                    ce.setFechaEvento(entrada.readUTF());
                    ce.setCiudad(entrada.readUTF());
                    ce.setDireccion(entrada.readUTF());
                    ce.setEstado(entrada.readUTF());
                    if (ce.getNombreEvento().equals(buscar)) {
                        ce.setNombreEvento(ce.getNombreEvento());
                        ce.setFechaEvento(ce.getFechaEvento());
                        ce.setCiudad(ce.getCiudad());
                        ce.setDireccion(ce.getEstado());
                        ce.setEstado("Estadio");
                    }
                    salida.writeUTF(ce.getNombreEvento());
                    salida.writeUTF(ce.getFechaEvento());
                    salida.writeUTF(ce.getCiudad());
                    salida.writeUTF(ce.getDireccion());
                    salida.writeUTF(ce.getEstado());   
                }
            } catch (EOFException eofe) {
                entrada.close();
                salida.close();
                mover();
            }
        } catch (FileNotFoundException fnfe) {
            JOptionPane.showMessageDialog(null, "¡Archivo no encontrado, revise!",
                    "Archivo no encontrado", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "¡Error desconocido, revise!",
                    "Error desconocido", JOptionPane.ERROR_MESSAGE);
        }
    }
     
       public void mover() {
        try {
            DatosCatalogoEvento ce = new DatosCatalogoEvento();
            DataInputStream entrada = new DataInputStream(new FileInputStream(
                    "temporalEventos.dat"));
            DataOutputStream salida = new DataOutputStream(new FileOutputStream(
                    "temporalEventos.dat"));
            try {
                while (true) {
                    ce.setNombreEvento(entrada.readUTF());
                    ce.setFechaEvento(entrada.readUTF());
                    ce.setCiudad(entrada.readUTF());
                    ce.setDireccion(entrada.readUTF());
                    ce.setEstado(entrada.readUTF());
                    salida.writeUTF(ce.getNombreEvento());
                    salida.writeUTF(ce.getFechaEvento());
                    salida.writeUTF(ce.getCiudad());
                    salida.writeUTF(ce.getDireccion());
                    salida.writeUTF(ce.getEstado());
                }
            } catch (EOFException eofe) {
                entrada.close();
                salida.close();
            }
        } catch (FileNotFoundException fnfe) {
            JOptionPane.showMessageDialog(null, "¡Archivo no encontrado, revise!",
                    "Archivo no encontrado", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "¡Error desconocido, revise!",
                    "Error desconocido", JOptionPane.ERROR_MESSAGE);
        }
    }
}
