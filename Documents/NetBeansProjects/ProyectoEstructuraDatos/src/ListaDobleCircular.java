
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JOptionPane;


/**
 *
 * @author andrescedeno
 */
public class ListaDobleCircular {
    
    public NodoCatalogoAsientos inicio;
    public NodoCatalogoAsientos fin;
    
    public ListaDobleCircular(){
        this.inicio=null;
        this.fin=null;
    }
    
    public boolean esVaciaDC(){
        if(inicio==null){
            return true;
        } else{
            return false;
        }
    }
    
    public void agregar(String codArea, int numAsiento, float costVenta, String estado){
        DatosCatalogoAsientos d = new DatosCatalogoAsientos();
        d.setCodigoArea(codArea);
        d.setNumeroAsiento(numAsiento);
        d.setCostoVenta(costVenta);
        d.setEstado(estado);
        
        NodoCatalogoAsientos nuevo = new NodoCatalogoAsientos();
        nuevo.setElemento(d);
        
        if(esVaciaDC()){
            inicio=nuevo;
            fin=nuevo;
            fin.setSiguiente(inicio);
            inicio.setAnterior(fin);
        } else if(d.getNumeroAsiento()<inicio.getElemento().getNumeroAsiento()){
            nuevo.setSiguiente(inicio); 
            inicio=nuevo;
            fin.setSiguiente(inicio);
            inicio.setAnterior(fin);
        } else if(d.getNumeroAsiento()>=fin.getElemento().getNumeroAsiento()){
            fin.setSiguiente(nuevo);
            fin=nuevo; 
            fin.setSiguiente(inicio);
            inicio.setAnterior(fin);
        } else{
            NodoCatalogoAsientos aux=inicio;
            while(aux.getSiguiente().getElemento().getNumeroAsiento()<d.getNumeroAsiento()){
               aux=aux.getSiguiente(); 
            }
            nuevo.setSiguiente(aux.getSiguiente());
            nuevo.setAnterior(aux);
            aux.setSiguiente(nuevo);
            nuevo.getSiguiente().setAnterior(nuevo);
        } 
    }
    
    public void guardarArchivo(){
        try {
            DataOutputStream salida = new DataOutputStream(new FileOutputStream("CatalogoAsientos.dat", false));
            if(!esVaciaDC()){
                NodoCatalogoAsientos aux=inicio;
                salida.writeUTF(aux.getElemento().getCodigoArea());
                salida.writeInt(aux.getElemento().getNumeroAsiento());
                salida.writeFloat(aux.getElemento().getCostoVenta());
                salida.writeUTF(aux.getElemento().getEstado());
                aux=aux.getSiguiente();
                while(aux!=inicio){
                    salida.writeUTF(aux.getElemento().getCodigoArea());
                    salida.writeInt(aux.getElemento().getNumeroAsiento());
                    salida.writeFloat(aux.getElemento().getCostoVenta());
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
    
    public void cargarCatalogoAsientos(){
        try {
            DataInputStream entrada = new DataInputStream(new FileInputStream(
                    "CatalogoAsientos.dat"));
            try {
                while (true) {
                    DatosCatalogoAsientos ca = new DatosCatalogoAsientos();
                    ca.setCodigoArea(entrada.readUTF());
                    ca.setNumeroAsiento(entrada.readInt());
                    ca.setCostoVenta(entrada.readFloat());
                    ca.setEstado(entrada.readUTF());
                    
                    agregar(ca.getCodigoArea(),ca.getNumeroAsiento(),ca.getCostoVenta(),ca.getEstado());
                }
            } catch (EOFException eeof) {
                entrada.close();
            }
        } catch (IOException eioe) {
            JOptionPane.showMessageDialog(null, "¡Error en el dispositivo de almacenamiento!",
                    "Error en el dispositivo", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    public void actualizarArchivo(int buscar, String codigo, String estado, float costoA) {
        try {
            DatosCatalogoAsientos ca = new DatosCatalogoAsientos();
            DataInputStream entrada = new DataInputStream(new FileInputStream(
                    "CatalogoAsientos.dat"));
            DataOutputStream salida = new DataOutputStream(new FileOutputStream(
                    "temporalAsientos.dat"));
            try {
                while (true) {
                    ca.setCodigoArea(entrada.readUTF());
                    ca.setNumeroAsiento(entrada.readInt());
                    ca.setCostoVenta(entrada.readFloat());
                    ca.setEstado(entrada.readUTF());
                    if (ca.getNumeroAsiento() == buscar) {
                        ca.setCodigoArea(codigo);
                        ca.setNumeroAsiento(ca.getNumeroAsiento());
                        ca.setCostoVenta(costoA);
                        ca.setEstado(estado);
                    }
                    salida.writeUTF(ca.getCodigoArea());
                    salida.writeInt(ca.getNumeroAsiento());
                    salida.writeFloat(ca.getCostoVenta());
                    salida.writeUTF(ca.getEstado());   
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
     
      public void eliminar(int buscar) {
        try {
            DatosCatalogoAsientos ca = new DatosCatalogoAsientos();
            DataInputStream entrada = new DataInputStream(new FileInputStream("CatalogoAsientos.dat"));
            DataOutputStream salida = new DataOutputStream(new FileOutputStream("temporalAsientos.dat"));
            try {
                while (true) {
                    ca.setCodigoArea(entrada.readUTF());
                    ca.setNumeroAsiento(entrada.readInt());
                    ca.setCostoVenta(entrada.readFloat());
                    ca.setEstado(entrada.readUTF());
                    if (ca.getNumeroAsiento() != buscar) {
                        salida.writeUTF(ca.getCodigoArea());
                        salida.writeInt(ca.getNumeroAsiento());
                        salida.writeFloat(ca.getCostoVenta());
                        salida.writeUTF(ca.getEstado());  
                    }
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
            DatosCatalogoAsientos ca = new DatosCatalogoAsientos();
            DataInputStream entrada = new DataInputStream(new FileInputStream(
                    "temporalAsientos.dat"));
            DataOutputStream salida = new DataOutputStream(new FileOutputStream(
                    "CatalogoAsientos.dat"));
            try {
                while (true) {
                    ca.setCodigoArea(entrada.readUTF());
                    ca.setNumeroAsiento(entrada.readInt());
                    ca.setCostoVenta(entrada.readFloat());
                    ca.setEstado(entrada.readUTF());
                    salida.writeUTF(ca.getCodigoArea());
                    salida.writeInt(ca.getNumeroAsiento());
                    salida.writeFloat(ca.getCostoVenta());
                    salida.writeUTF(ca.getEstado());
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
