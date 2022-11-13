/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoclienteservidor;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Proveedores extends javax.swing.JFrame implements Catalogos {
    
    
    private ArrayList<DatosProveedores> proveedores = new ArrayList<DatosProveedores>();
    
    /**
     * Creates new form AgregarProveedor
     */
    public Proveedores() {
        initComponents();
        setTitle("Gestión de Proveedores");
        setLocationRelativeTo(null);
        setResizable(false);
        cargarProveedores();
    }

    public ArrayList<DatosProveedores> getProveedores() {
        return proveedores;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jToolBar1 = new javax.swing.JToolBar();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel1.setText("PROVEEDORES");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel2.setText("Identificación:");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel4.setText("Ciudad:");

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel5.setText("Dirección:");

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel6.setText("Correo electrónico:");

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel7.setText("Teléfono:");

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel8.setText("Estado:");

        jToolBar1.setRollover(true);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/add.png"))); // NOI18N
        jButton2.setToolTipText("Agrega un proveedor");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/edit.png"))); // NOI18N
        jButton5.setToolTipText("Modifica los datos de un proveedor");
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton5);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/asking.png"))); // NOI18N
        jButton6.setToolTipText("Consulta un proveedor");
        jButton6.setFocusable(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton6);

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/activar.png"))); // NOI18N
        jButton9.setToolTipText("Inactiva un proveedor");
        jButton9.setFocusable(false);
        jButton9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton9.setMaximumSize(new java.awt.Dimension(36, 36));
        jButton9.setMinimumSize(new java.awt.Dimension(33, 33));
        jButton9.setPreferredSize(new java.awt.Dimension(31, 31));
        jButton9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton9);

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/salir.png"))); // NOI18N
        jButton11.setToolTipText("Regresa al Menú Principal");
        jButton11.setFocusable(false);
        jButton11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton11.setMaximumSize(new java.awt.Dimension(36, 36));
        jButton11.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton11);

        jCheckBox1.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jCheckBox1.setText("Activo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 129, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(129, 129, 129))
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField4)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField2)
                                .addComponent(jLabel4)
                                .addComponent(jTextField3)
                                .addComponent(jLabel5)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jCheckBox1))))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7))
                        .addGap(8, 8, 8)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //VALIDACION DE CAMPOS 
        if (jTextField1.getText().equals("")){
            JOptionPane.showMessageDialog(null, "¡Se debe ingresar una identificación!",
                    "Error al agregar", JOptionPane.ERROR_MESSAGE);
            return;
        }
        agregar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (jTextField1.getText().equals("")){
            JOptionPane.showMessageDialog(null, "¡Se debe ingresar una identificación para editar!",
                    "Error al editar", JOptionPane.ERROR_MESSAGE);
            return;
        }
        editar();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if (jTextField1.getText().equals("")){
            JOptionPane.showMessageDialog(null, "¡Se debe ingresar una identificación para consultar!",
                    "Error al consultar", JOptionPane.ERROR_MESSAGE);
            return;
        }
        consultar();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if (jTextField1.getText().equals("")){
            JOptionPane.showMessageDialog(null, "¡Se debe ingresar una identificación para inactivar!",
                    "Error al inactivar", JOptionPane.ERROR_MESSAGE);
            return;
        }
        inactivar();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        //SE GUARDA EN EL ARCHIVO CADA VEZ QUE SE VUELVE AL MENÚ PRINCIPAL
        guardarArchivo();
        this.dispose();
    }//GEN-LAST:event_jButton11ActionPerformed

    @Override
    public void agregar() {
        
        int id = Integer.parseInt(jTextField1.getText());
        String nombre =  jTextField2.getText();
        boolean existe = buscar(id, nombre);
        
        if (existe){
            JOptionPane.showMessageDialog(null, "¡Datos ya existen!",
                        "Datos ya existen", JOptionPane.ERROR_MESSAGE);
            limpiar();
            return;
        }
        
        DatosProveedores proveedor = new DatosProveedores();
        proveedor.setIdentificacion(Integer.parseInt(jTextField1.getText()));
        proveedor.setNombre(jTextField2.getText());
        proveedor.setCiudad(jTextField3.getText());
        proveedor.setDireccion(jTextField4.getText());
        proveedor.setTelefono(jTextField5.getText());
        proveedor.setCorreoElectronico(jTextField6.getText());

        if (jCheckBox1.isSelected()) {
            proveedor.setEstado((byte) 1);
        } else {
            proveedor.setEstado((byte) 0);
        }

        proveedores.add(proveedor);
        limpiar();
        JOptionPane.showMessageDialog(null, "¡Datos agregados correctamente!",
                    "Datos agregados", JOptionPane.INFORMATION_MESSAGE);
          
    }

    @Override
    public void editar() {
        
        int identificacion = Integer.parseInt(jTextField1.getText());
        boolean noExiste = true;
        for(DatosProveedores proveedor : proveedores){
            if(proveedor.getIdentificacion() == identificacion){
                noExiste = false;
                proveedor.setNombre(jTextField2.getText());
                proveedor.setCiudad(jTextField3.getText());
                proveedor.setDireccion(jTextField4.getText());
                proveedor.setTelefono(jTextField5.getText());
                proveedor.setCorreoElectronico(jTextField6.getText());
                if (jCheckBox1.isSelected()) {
                    proveedor.setEstado((byte) 1);
                } else {
                    proveedor.setEstado((byte) 0);
                }

            }
        }

        if(noExiste){
            limpiar();
            JOptionPane.showMessageDialog(null, "¡No existe un proveedor con la identificacion ingresada!",
                "Error al editar", JOptionPane.ERROR_MESSAGE);
        }else{
            limpiar();
            JOptionPane.showMessageDialog(null, "¡Datos editados correctamente!",
                "Datos Editados", JOptionPane.INFORMATION_MESSAGE);                
        }

    }
    
    @Override 
    public void inactivar() {
        int identificacion = Integer.parseInt(jTextField1.getText());
        boolean noExiste = true;
        boolean relacionado = false;
        Servicios listaServicios = new Servicios();
        ArrayList<DatosServicios> servicios = listaServicios.getServicios();


        for(DatosProveedores proveedor : proveedores){
            if(proveedor.getIdentificacion() == identificacion){
                noExiste = false;
                for(DatosServicios servicio : servicios){
                    if(servicio.getProveedor().getIdentificacion() == identificacion){
                        relacionado = true; 
                    }                        
                }
                if (!relacionado){
                    proveedor.setEstado((byte)0);
                    limpiar();
                    JOptionPane.showMessageDialog(null, "¡Proveedor inactivado correctamente!",
                    "Inactivar proveedor", JOptionPane.INFORMATION_MESSAGE); 
                    return;
                }
            }
        }

        if(noExiste){
            limpiar();
            JOptionPane.showMessageDialog(null, "¡No existe un proveedor con la identificacion ingresada!",
                "Error al inactivar", JOptionPane.ERROR_MESSAGE);
        }else if(relacionado){
            limpiar();
            JOptionPane.showMessageDialog(null, "¡El proveedor está relacionado con un servicio!",
                "Error al inactivar", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    @Override
    public void consultar() {
        int identificacion = Integer.parseInt(jTextField1.getText());
        boolean noExiste = true;
        limpiar();
        for(DatosProveedores proveedor : proveedores){
            if(proveedor.getIdentificacion() == identificacion){
                noExiste = false;
                jTextField1.setText(Integer.toString(identificacion));
                jTextField2.setText(proveedor.getNombre());
                jTextField3.setText(proveedor.getCiudad());
                jTextField4.setText(proveedor.getDireccion());
                jTextField5.setText(proveedor.getTelefono());
                jTextField6.setText(proveedor.getCorreoElectronico());
                if (proveedor.getEstado() == 0) {
                        jCheckBox1.setSelected(false);
                }else {
                        jCheckBox1.setSelected(true);
                }
            }
        }

        if(noExiste){
            limpiar();
            JOptionPane.showMessageDialog(null, "¡No existe un proveedor con la identificacion ingresada!",
                "Error al consultar", JOptionPane.ERROR_MESSAGE);
        }

        
    }
    
    @Override
    public boolean buscar(int id, String nombre){
         for(DatosProveedores proveedor : proveedores){
             if(proveedor.getIdentificacion() == id || proveedor.getNombre() == nombre)
                 return true;
         }       
         return false;
    }
    
    @Override
    public void guardarArchivo(){
        try {
            DataOutputStream salida = new DataOutputStream(new FileOutputStream("proveedores.dat", false));
            for(DatosProveedores proveedor : proveedores){
                salida.writeInt(proveedor.getIdentificacion());
                salida.writeUTF(proveedor.getNombre());
                salida.writeUTF(proveedor.getCiudad());
                salida.writeUTF(proveedor.getDireccion());
                salida.writeUTF(proveedor.getTelefono());
                salida.writeUTF(proveedor.getCorreoElectronico());
                salida.writeByte(proveedor.getEstado());
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
    
    
    public void cargarProveedores(){
        try {
            DataInputStream entrada = new DataInputStream(new FileInputStream(
                    "proveedores.dat"));
            try {
                while (true) {
                    DatosProveedores dp = new DatosProveedores();
                    dp.setIdentificacion(entrada.readInt());
                    dp.setNombre(entrada.readUTF());
                    dp.setCiudad(entrada.readUTF());
                    dp.setDireccion(entrada.readUTF());
                    dp.setTelefono(entrada.readUTF());
                    dp.setCorreoElectronico(entrada.readUTF());
                    dp.setEstado(entrada.readByte());
                    
                    proveedores.add(dp);
                }
            } catch (EOFException eeof) {
                entrada.close();
            }
        } catch (IOException eioe) {
            JOptionPane.showMessageDialog(null, "¡Error en el dispositivo de almacenamiento!",
                    "Error en el dispositivo", JOptionPane.ERROR_MESSAGE);
        }
        
    }   

    public void limpiar(){
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jCheckBox1.setSelected(false);
        jTextField1.requestFocus();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables

}
