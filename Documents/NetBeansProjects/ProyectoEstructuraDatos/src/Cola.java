
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Angel
 */
public class Cola {
    private NodoCUsuario inicio;
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
        JOptionPane.showMessageDialog(null, "¡Datos agregados correctamente!",
                        "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);
    }
   
   public void mostrar(){
        if(!esVacia()){
            String s="";
            NodoCUsuario aux=inicio;
            while(aux!=null){
                s=s+aux.getElemento().getNombre()+" - "+aux.getElemento().getPrimerApellido()+" - "+aux.getElemento().getSegundoApellido()+" - "+aux.getElemento().getUsuario()+" - "+aux.getElemento().getPassword()+" - "+aux.getElemento().getEstado()+" - "+"\n";
                aux=aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, "La cola contiene: \n"+s);
        }else{
            JOptionPane.showMessageDialog(null, "Cola vacia");
        } 
   }
}
