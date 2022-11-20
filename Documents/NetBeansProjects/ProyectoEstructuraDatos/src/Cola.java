
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.text.JTextComponent;


public class Cola {
    public NodoCUsuario inicio;
    private NodoCUsuario fin;
    
    public Cola(){
        this.inicio=null;
        this.fin=null;
    }
    
    public boolean esVacia(){
        if(inicio==null){
            return true;
        }else{
            return false;
        }
    }
    
   public void agregar(String nom, String ap1, String ap2, String nickn, String contra, String estado){
        DatosRegistrarUsuario d = new DatosRegistrarUsuario();
        d.setNombre(nom);
        d.setPrimerApellido(ap1);
        d.setSegundoApellido(ap2);
        d.setUsuario(nickn);
        d.setPassword(contra);
        d.setEstado(estado);
        NodoCUsuario nuevo = new NodoCUsuario();
        nuevo.setElemento(d);
        if(esVacia()){
            inicio=nuevo;
            fin=nuevo;
        }else{
            fin.setSiguiente(nuevo);
            fin=nuevo;
        }
    }
   
   // Se guarda los datos de la cola en un archivo para que no se borren
   public void guardarArchivo(){
        try {
            DataOutputStream salida = new DataOutputStream(new FileOutputStream("usuarios.dat", false));
            if(!esVacia()){
                NodoCUsuario aux=inicio;
                while(aux!=null){
                    salida.writeUTF(aux.getElemento().getNombre());
                    salida.writeUTF(aux.getElemento().getPrimerApellido());
                    salida.writeUTF(aux.getElemento().getSegundoApellido());
                    salida.writeUTF(aux.getElemento().getUsuario());
                    salida.writeUTF(aux.getElemento().getPassword());
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
    
    
    public void cargarUsuario(){
        try {
            DataInputStream entrada = new DataInputStream(new FileInputStream(
                    "usuarios.dat"));
            try {
                while (true) {
                    DatosRegistrarUsuario ru = new DatosRegistrarUsuario();
                    ru.setNombre(entrada.readUTF());
                    ru.setPrimerApellido(entrada.readUTF());
                    ru.setSegundoApellido(entrada.readUTF());
                    ru.setUsuario(entrada.readUTF());
                    ru.setPassword(entrada.readUTF());
                    ru.setEstado(entrada.readUTF());
                    
                    agregar(ru.getNombre(),ru.getPrimerApellido(),ru.getSegundoApellido(),ru.getUsuario(),ru.getPassword(),ru.getEstado());
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
            DatosRegistrarUsuario ru = new DatosRegistrarUsuario();
            DataInputStream entrada = new DataInputStream(new FileInputStream(
                    "usuarios.dat"));
            DataOutputStream salida = new DataOutputStream(new FileOutputStream(
                    "temporal.dat"));
            try {
                while (true) {
                    ru.setNombre(entrada.readUTF());
                    ru.setPrimerApellido(entrada.readUTF());
                    ru.setSegundoApellido(entrada.readUTF());
                    ru.setUsuario(entrada.readUTF());
                    ru.setPassword(entrada.readUTF());
                    ru.setEstado(entrada.readUTF());
                    if (ru.getUsuario().equals(buscar)) {
                        ru.setNombre(ru.getNombre());
                        ru.setPrimerApellido(ru.getPrimerApellido());
                        ru.setSegundoApellido(ru.getSegundoApellido());
                        ru.setUsuario(ru.getUsuario());
                        ru.setPassword(ru.getPassword());
                        ru.setEstado("Inactivo");
                    }
                    salida.writeUTF(ru.getNombre());
                    salida.writeUTF(ru.getPrimerApellido());
                    salida.writeUTF(ru.getSegundoApellido());
                    salida.writeUTF(ru.getUsuario());
                    salida.writeUTF(ru.getPassword());
                    salida.writeUTF(ru.getEstado());    
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
            DatosRegistrarUsuario ru = new DatosRegistrarUsuario();
            DataInputStream entrada = new DataInputStream(new FileInputStream(
                    "temporal.dat"));
            DataOutputStream salida = new DataOutputStream(new FileOutputStream(
                    "usuarios.dat"));
            try {
                while (true) {
                    ru.setNombre(entrada.readUTF());
                    ru.setPrimerApellido(entrada.readUTF());
                    ru.setSegundoApellido(entrada.readUTF());
                    ru.setUsuario(entrada.readUTF());
                    ru.setPassword(entrada.readUTF());
                    ru.setEstado(entrada.readUTF());
                    salida.writeUTF(ru.getNombre());
                    salida.writeUTF(ru.getPrimerApellido());
                    salida.writeUTF(ru.getSegundoApellido());
                    salida.writeUTF(ru.getUsuario());
                    salida.writeUTF(ru.getPassword());
                    salida.writeUTF(ru.getEstado());
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
