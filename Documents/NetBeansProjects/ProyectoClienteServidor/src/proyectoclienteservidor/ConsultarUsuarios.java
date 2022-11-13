/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectoclienteservidor;

import java.awt.Dimension;
import javax.swing.JOptionPane;
import java.io.*;

/**
 *
 * @author Angel
 */
public class ConsultarUsuarios extends javax.swing.JFrame {
    
    private int encontrado;

    /**
     * Creates new form ConsultarUsuarios
     */
    public ConsultarUsuarios() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Consulta Usuarios");
        this.setSize(new Dimension(450, 360));
        this.setMinimumSize(new Dimension(450, 360));
    }

    public void limpiar(){
        txtNombreCompletoUsuario.setText("");
        txtNicknameUsuario.setText("");
        txtContrasenaUsuario.setText("");
        rbActivo.setSelected(false);
        rbInactivo.setSelected(false);
    }
    
    public void consultar() {
        encontrado=0;
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
                    if (txtBuscar.getText().equals(du.getUsuario())) {
                        encontrado=1;
                        txtNombreCompletoUsuario.setText(du.getNombre()+" "+du.getApellido1()+" "+du.getApellido2());
                        txtNicknameUsuario.setText(du.getUsuario());
                        txtContrasenaUsuario.setText(du.getContrasena());
                        if(du.getEstado().equals("Activo")){
                            rbActivo.setSelected(true);
                        }else{
                            rbInactivo.setSelected(true);
                        }
                    }
                }
            } catch (EOFException eeof) {
                entrada.close();
                if(encontrado==0){
                   JOptionPane.showMessageDialog(null, "¡Usuario no registrado!",
                        "Datos Inexistentes", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (FileNotFoundException fnfe) {
            JOptionPane.showMessageDialog(null, "¡Archivo no encontrado!", "Archivo no encontrado",
                    JOptionPane.ERROR_MESSAGE);
        } catch (IOException eioe) {
            JOptionPane.showMessageDialog(null, "¡Error en el dispositivo de almacenamiento!",
                    "Error en el dispositivo", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void inactivar() {
        try {
            DatosUsuarios du = new DatosUsuarios();
            DataInputStream entrada = new DataInputStream(new FileInputStream(
                    "usuarios.dat"));
            DataOutputStream salida = new DataOutputStream(new FileOutputStream(
                    "temporal.dat"));
            String usuarioInactivar = txtBuscar.getText();
            try {
                while (true) {
                    du.setNombre(entrada.readUTF());
                    du.setApellido1(entrada.readUTF());
                    du.setApellido2(entrada.readUTF());
                    du.setUsuario(entrada.readUTF());
                    du.setContrasena(entrada.readUTF());
                    du.setEstado(entrada.readUTF());
                    if (du.getUsuario().equals(usuarioInactivar)) {
                        du.setNombre(du.getNombre());
                        du.setApellido1(du.getApellido1());
                        du.setApellido2(du.getApellido2());
                        du.setUsuario(du.getUsuario());
                        du.setContrasena(du.getContrasena());
                        du.setEstado("Inactivo");
                    }
                    salida.writeUTF(du.getNombre());
                    salida.writeUTF(du.getApellido1());
                    salida.writeUTF(du.getApellido2());
                    salida.writeUTF(du.getUsuario());
                    salida.writeUTF(du.getContrasena());
                    salida.writeUTF(du.getEstado());    
                }
            } catch (EOFException eofe) {
                entrada.close();
                salida.close();
                mover();
                JOptionPane.showMessageDialog(null, "¡El usuario se ha inactivado!",
                        "Usuario Inactivo", JOptionPane.INFORMATION_MESSAGE);
                limpiar();
                txtBuscar.setText("");
                txtBuscar.requestFocus();
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
            DatosUsuarios du = new DatosUsuarios();
            DataInputStream entrada = new DataInputStream(new FileInputStream(
                    "temporal.dat"));
            DataOutputStream salida = new DataOutputStream(new FileOutputStream(
                    "usuarios.dat"));
            try {
                while (true) {
                    du.setNombre(entrada.readUTF());
                    du.setApellido1(entrada.readUTF());
                    du.setApellido2(entrada.readUTF());
                    du.setUsuario(entrada.readUTF());
                    du.setContrasena(entrada.readUTF());
                    du.setEstado(entrada.readUTF());
                    salida.writeUTF(du.getNombre());
                    salida.writeUTF(du.getApellido1());
                    salida.writeUTF(du.getApellido2());
                    salida.writeUTF(du.getUsuario());
                    salida.writeUTF(du.getContrasena());
                    salida.writeUTF(du.getEstado());
                }
            } catch (EOFException eofe) {
                entrada.close();
                salida.close();
                //mover();
                //JOptionPane.showMessageDialog(null, "¡Datos fueron modificados correctamente!","Datos modificados", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (FileNotFoundException fnfe) {
            JOptionPane.showMessageDialog(null, "¡Archivo no encontrado, revise!",
                    "Archivo no encontrado", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "¡Error desconocido, revise!",
                    "Error desconocido", JOptionPane.ERROR_MESSAGE);
        }
    }

   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        txtBuscar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNombreCompletoUsuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNicknameUsuario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtContrasenaUsuario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        rbActivo = new javax.swing.JRadioButton();
        rbInactivo = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        jButton6 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(444, 326));
        setSize(new java.awt.Dimension(444, 326));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 346, -1));
        jPanel2.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 107, -1));

        jLabel2.setText("Digite el usuario que desea consultar: ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 69, -1, -1));

        jLabel8.setText("Nombre Completo:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));
        jPanel2.add(txtNombreCompletoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 260, -1));

        jLabel5.setText("Usuario:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));
        jPanel2.add(txtNicknameUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 156, -1));

        jLabel6.setText("Contraseña:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));
        jPanel2.add(txtContrasenaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 156, -1));

        jLabel7.setText("Estado:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 236, -1, -1));

        rbActivo.setText("Activo");
        jPanel2.add(rbActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 91, -1));

        rbInactivo.setText("Inactivo");
        jPanel2.add(rbInactivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 91, -1));

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel9.setText("USUARIOS");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 420, 300));

        jToolBar1.setRollover(true);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/asking.png"))); // NOI18N
        jButton6.setToolTipText("Consulta un usuario");
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
        jButton9.setToolTipText("Inactiva un usuario");
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

        getContentPane().add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        limpiar();
        if (txtBuscar.getText().equals("")){
            JOptionPane.showMessageDialog(null, "¡Debe ingresar el usuario a buscar!",
                "Error al Consultar", JOptionPane.ERROR_MESSAGE);
            return;
        }
        consultar();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if (txtBuscar.getText().equals("")){
            JOptionPane.showMessageDialog(null, "¡Debe ingresar primero el usuario a inactivar!",
                "Error al Inactivar Usuario", JOptionPane.ERROR_MESSAGE);
            return;
        }
        inactivar();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        
        this.dispose();
    }//GEN-LAST:event_jButton11ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConsultarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JRadioButton rbActivo;
    private javax.swing.JRadioButton rbInactivo;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtContrasenaUsuario;
    private javax.swing.JTextField txtNicknameUsuario;
    private javax.swing.JTextField txtNombreCompletoUsuario;
    // End of variables declaration//GEN-END:variables
}
