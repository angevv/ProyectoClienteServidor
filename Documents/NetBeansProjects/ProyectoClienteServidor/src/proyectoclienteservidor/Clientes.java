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

public class Clientes extends javax.swing.JFrame implements Catalogos {

    public ArrayList<DatosClientes> clientes = new ArrayList<DatosClientes>();
    
    
    public Clientes() {
        initComponents();
        setTitle("Gestión de Clientes");
        setLocationRelativeTo(null);
        setResizable(false); 
        llenarComboBox();
        cargarClientes();
    }

    public void llenarComboBox() {
        try {
            DataInputStream entrada = new DataInputStream(new FileInputStream(
                    "usuarios.dat"));
            try {
                DatosUsuarios du = new DatosUsuarios();
                while (true) {
                    du.setNombre(entrada.readUTF());
                    du.setApellido1(entrada.readUTF());
                    du.setApellido2(entrada.readUTF());
                    du.setUsuario(entrada.readUTF());
                    du.setContrasena(entrada.readUTF());
                    du.setEstado(entrada.readUTF());
                    jComboBox1.addItem(du.getNombre()+" "+du.getApellido1()+" "+du.getApellido2());
                }
            } catch (EOFException eeof) {
                entrada.close();
            }
        } catch (FileNotFoundException fnfe) {
            JOptionPane.showMessageDialog(null, "¡Archivo no encontrado!", "Archivo no encontrado",
                    JOptionPane.ERROR_MESSAGE);
        } catch (IOException eioe) {
            JOptionPane.showMessageDialog(null, "¡Error en el dispositivo de almacenamiento!",
                    "Error en el dispositivo", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAgregar = new javax.swing.JButton();
        txtNombreUsuario = new javax.swing.JTextField();
        txtNombreUsuario1 = new javax.swing.JTextField();
        txtNombreUsuario2 = new javax.swing.JTextField();
        txtNombreUsuario3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombreUsuario4 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombreUsuario5 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        rbActivo = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        rbActivo1 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        paquetesEspeciales1 = new proyectoclienteservidor.PaquetesEspeciales();
        jToolBar1 = new javax.swing.JToolBar();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        btnAgregar.setText("Agregar");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel2.setText("Identificación:");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel4.setText("Ciudad:");

        rbActivo.setText("Activo");

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel5.setText("Descripcion:");

        rbActivo1.setText("Activo");
        rbActivo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbActivo1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel6.setText("Correo electrónico:");

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel7.setText("Teléfono:");

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel8.setText("Estado:");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jToolBar1.setRollover(true);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/add.png"))); // NOI18N
        jButton2.setToolTipText("Agrega un cliente");
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
        jButton5.setToolTipText("Modifica los datos de un cliente");
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
        jButton6.setToolTipText("Consulta un cliente");
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
        jButton9.setToolTipText("Inactiva un cliente");
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

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel1.setText("CLIENTES");

        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel16.setText("Identificación:");

        jLabel17.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel17.setText("Usuario:");

        jLabel18.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel18.setText("Ciudad:");

        jLabel19.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel19.setText("Dirección:");

        jLabel20.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel20.setText("Correo electrónico:");

        jLabel21.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel21.setText("Teléfono:");

        jLabel22.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel22.setText("Estado:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField4)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18)
                            .addComponent(jLabel17)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel22)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(jCheckBox1)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(51, 51, 51))
            .addGroup(layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel22))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbActivo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbActivo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbActivo1ActionPerformed

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

    public void agregar() {
        
        int id = Integer.parseInt(jTextField1.getText());
        String nombre =  jComboBox1.getSelectedItem().toString();
        boolean existe = buscar(id, nombre);
        
        if (existe){
            JOptionPane.showMessageDialog(null, "¡Datos ya existen!",
                        "Datos ya existen", JOptionPane.ERROR_MESSAGE);
            limpiar();
            return;
        }
        
        DatosClientes cliente = new DatosClientes();
        cliente.setIdentificacion(id);
        cliente.setCliente(nombre);
        cliente.setCiudad(jTextField3.getText());
        cliente.setDireccion(jTextField4.getText());
        cliente.setTelefono(jTextField5.getText());
        cliente.setCorreoElectronico(jTextField6.getText());

        if (jCheckBox1.isSelected()) {
            cliente.setEstado((byte) 1);
        } else {
            cliente.setEstado((byte) 0);
        }

        clientes.add(cliente);
        limpiar();
        JOptionPane.showMessageDialog(null, "¡Datos agregados correctamente!",
                    "Datos agregados", JOptionPane.INFORMATION_MESSAGE);
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar() {
        int identificacion = Integer.parseInt(jTextField1.getText());
        boolean noExiste = true;
        for(DatosClientes cliente : clientes){
            if(cliente.getIdentificacion() == identificacion){
                noExiste = false;
                cliente.setCliente(jComboBox1.getSelectedItem().toString());
                cliente.setCiudad(jTextField3.getText());
                cliente.setDireccion(jTextField4.getText());
                cliente.setTelefono(jTextField5.getText());
                cliente.setCorreoElectronico(jTextField6.getText());
                if (jCheckBox1.isSelected()) {
                    cliente.setEstado((byte) 1);
                } else {
                    cliente.setEstado((byte) 0);
                }

            }
        }

        if(noExiste){
            limpiar();
            JOptionPane.showMessageDialog(null, "¡No existe un cliente con la identificacion ingresada!",
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

        for(DatosClientes cliente : clientes){
            if(cliente.getIdentificacion() == identificacion){
                noExiste = false;
                cliente.setEstado((byte)0);
                limpiar();
                JOptionPane.showMessageDialog(null, "¡Cliente inactivado correctamente!",
                "Inactivar cliente", JOptionPane.INFORMATION_MESSAGE); 
                return;

            }
        }
        if(noExiste){
            limpiar();
            JOptionPane.showMessageDialog(null, "¡No existe un cliente con la identificacion ingresada!",
                "Error al inactivar", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    @Override
    public void consultar() {
        int identificacion = Integer.parseInt(jTextField1.getText());
        boolean noExiste = true;
        limpiar();
        for(DatosClientes cliente : clientes){
            if(cliente.getIdentificacion() == identificacion){
                noExiste = false;
                jTextField1.setText(Integer.toString(identificacion));
                jComboBox1.setSelectedItem(cliente.getCliente());
                jTextField3.setText(cliente.getCiudad());
                jTextField4.setText(cliente.getDireccion());
                jTextField5.setText(cliente.getTelefono());
                jTextField6.setText(cliente.getCorreoElectronico());
                if (cliente.getEstado() == 0) {
                        jCheckBox1.setSelected(false);
                }else {
                        jCheckBox1.setSelected(true);
                }
            }
        }

        if(noExiste){
            limpiar();
            JOptionPane.showMessageDialog(null, "¡No existe un cliente con la identificacion ingresada!",
                "Error al consultar", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    @Override
    public boolean buscar(int id, String nombre) {
        for(DatosClientes cliente : clientes){
             if(cliente.getIdentificacion() == id || cliente.getCliente() == nombre)
                 return true;
         }       
         return false;
    }

    @Override
    public void guardarArchivo() {
        try {
            DataOutputStream salida = new DataOutputStream(new FileOutputStream("clientes.dat", false));
            for(DatosClientes cliente : clientes){
                salida.writeInt(cliente.getIdentificacion());
                salida.writeUTF(cliente.getCliente());
                salida.writeUTF(cliente.getCiudad());
                salida.writeUTF(cliente.getDireccion());
                salida.writeUTF(cliente.getTelefono());
                salida.writeUTF(cliente.getCorreoElectronico());
                salida.writeByte(cliente.getEstado());
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
    
    public void cargarClientes(){
        try {
            DataInputStream entrada = new DataInputStream(new FileInputStream(
                    "clientes.dat"));
            try {
                while (true) {
                    DatosClientes dc = new DatosClientes();
                    dc.setIdentificacion(entrada.readInt());
                    dc.setCliente(entrada.readUTF());
                    dc.setCiudad(entrada.readUTF());
                    dc.setDireccion(entrada.readUTF());
                    dc.setTelefono(entrada.readUTF());
                    dc.setCorreoElectronico(entrada.readUTF());
                    dc.setEstado(entrada.readByte());
                    
                    clientes.add(dc);
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
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jCheckBox1.setSelected(false);
        jComboBox1.setSelectedIndex(0);
        jTextField1.requestFocus();
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JToolBar jToolBar1;
    private proyectoclienteservidor.PaquetesEspeciales paquetesEspeciales1;
    private javax.swing.JRadioButton rbActivo;
    private javax.swing.JRadioButton rbActivo1;
    private javax.swing.JTextField txtNombreUsuario;
    private javax.swing.JTextField txtNombreUsuario1;
    private javax.swing.JTextField txtNombreUsuario2;
    private javax.swing.JTextField txtNombreUsuario3;
    private javax.swing.JTextField txtNombreUsuario4;
    private javax.swing.JTextField txtNombreUsuario5;
    // End of variables declaration//GEN-END:variables

}
