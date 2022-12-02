
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JOptionPane;


public class Arbol {
    private NodoA raiz;
    
    public Arbol(){
        this.raiz=null;
    }
    
    public boolean esVacioArbol(){
        if(raiz==null){
            return true;
        }else{
            return false;
        }
    }
    
    public void inserta(int numVenta, String nomEvento, String fecha, String hora, String nomUsuario, int cantAsientos, Double monto){
        DatosVentas d = new DatosVentas();
        d.setNumVenta(numVenta);
        d.setEvento(nomEvento);
        d.setFecha(fecha);
        d.setHora(hora);
        d.setNomUsuario(nomUsuario);
        d.setCantAsientos(cantAsientos);
        d.setMontoPagar(monto);
        NodoA nuevo = new NodoA();
        nuevo.setElemento(d);
        if(esVacioArbol()){
            raiz=nuevo;
        }else{
            insertarNuevo(raiz, nuevo);
        }
    }
    
    public void insertarNuevo(NodoA raiz, NodoA nuevo){
        if(nuevo.getElemento().getNumVenta()<=raiz.getElemento().getNumVenta()){
            if(raiz.getEnlaceIzq()==null){
                raiz.setEnlaceIzq(nuevo);
            }else{
                insertarNuevo(raiz.getEnlaceIzq(),nuevo);
            }
        }else{
            if(raiz.getEnlaceDer()==null){
                raiz.setEnlaceDer(nuevo);
            }else{
                insertarNuevo(raiz.getEnlaceDer(),nuevo);
            }
        }
    }
    
   /* public void guardarRaiz(){
        if(!esVacioArbol()){
            guardarArchivo(raiz);
        }else{
            JOptionPane.showMessageDialog(null, "Arbol vacio");
        }
    }
    
    public void guardarArchivo(NodoA raiz){
        if(raiz!=null){
            guardarArchivo(raiz.getEnlaceIzq());
            System.out.print(raiz.getElemento().getNumVenta()+"-"+raiz.getElemento().getEvento()+"-"+raiz.getElemento().getNomUsuario()+"-"+raiz.getElemento().getFecha()+"-"+raiz.getElemento().getHora()+"-"+raiz.getElemento().getCantAsientos()+"-"+raiz.getElemento().getMontoPagar());
            guardarArchivo(raiz.getEnlaceDer());   
        }
    }*/
   
    public void guardarArchivo(){
        try {
            DataOutputStream salida = new DataOutputStream(new FileOutputStream("ventas.dat", false));
            if(!esVacioArbol()){
                while(raiz!=null){
                    salida.writeInt(raiz.getElemento().getNumVenta());
                    salida.writeUTF(raiz.getElemento().getEvento());
                    salida.writeUTF(raiz.getElemento().getFecha());
                    salida.writeUTF(raiz.getElemento().getHora());
                    salida.writeUTF(raiz.getElemento().getNomUsuario());
                    salida.writeInt(raiz.getElemento().getCantAsientos());
                    salida.writeDouble(raiz.getElemento().getMontoPagar());
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
    
    public void cargarDatosArbol(){
        try {
            DataInputStream entrada = new DataInputStream(new FileInputStream(
                    "ventas.dat"));
            try {
                while (true) {
                    DatosVentas v = new DatosVentas();
                    v.setNumVenta(entrada.readInt());
                    v.setEvento(entrada.readUTF());
                    v.setFecha(entrada.readUTF());
                    v.setHora(entrada.readUTF());
                    v.setNomUsuario(entrada.readUTF());
                    v.setCantAsientos(entrada.readInt());
                    v.setMontoPagar(entrada.readDouble());                    
                    inserta(v.getNumVenta(),v.getEvento(),v.getFecha(),v.getHora(),v.getNomUsuario(),v.getCantAsientos(),v.getMontoPagar());
                }
            } catch (EOFException eeof) {
                entrada.close();
            }
        } catch (IOException eioe) {
            JOptionPane.showMessageDialog(null, "¡Error en el dispositivo de almacenamiento!",
                    "Error en el dispositivo", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
     /* public void mostrarRaiz(){
        if(!esVacioArbol()){
            mostrarNodo(raiz);
        }else{
            JOptionPane.showMessageDialog(null, "Arbol vacio");
        }
    }
    
    public void mostrarNodo(NodoA raiz){
        if(raiz!=null){
            mostrarNodo(raiz.getEnlaceIzq());
            System.out.print(raiz.getElemento().getNumVenta()+"-"+raiz.getElemento().getEvento()+"-"+raiz.getElemento().getNomUsuario()+"-"+raiz.getElemento().getFecha()+"-"+raiz.getElemento().getHora()+"-"+raiz.getElemento().getCantAsientos()+"-"+raiz.getElemento().getMontoPagar());
            mostrarNodo(raiz.getEnlaceDer());
            
        }
    }*/
    
    //public NodoA modificarNodo(NodoA r){
        
    //}
}
