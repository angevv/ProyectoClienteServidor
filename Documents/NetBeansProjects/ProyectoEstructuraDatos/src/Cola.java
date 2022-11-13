
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
    
   /* public void agregar(String nom){
        DatosRegistrarUsuario d = new DatosRegistrarUsuario();
        d.setNombre(nom);
        d.setPrimerApellido(txtApellido1Usuario.getText());
        d.setSegundoApellido(txtApellido2Usuario.getText());
        d.setUsuario(txtNicknameUsuario.getText());
        d.setPassword(txtContrasenaUsuario.getText());
        if(rbActivo.isSelected()){
            d.setEstado(rbActivo.getText());
        }else{
            d.setEstado(rbInactivo.getText());
        }
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
    }*/
}
