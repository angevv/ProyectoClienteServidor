
import java.awt.Dimension;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Angel
 */
public class RegistrarUsuariosCopia extends javax.swing.JFrame {

    /**
     * Creates new form RegistrarUsuarios
     */
    public RegistrarUsuariosCopia() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
       /* this.setSize(new Dimension(470, 390));
        this.setMinimumSize(new Dimension(470, 390));*/
        //Cola
       // this.inicio=null;
       // this.fin=null;
        //public jPanel1;
       /* btnBuscar.setEnabled(false);
        txtBuscar.setEnabled(false);
        jLabel8.setEnabled(false);
        jLabel10.setEnabled(false);
        jLabel11.setEnabled(false);
        jLabel12.setEnabled(false);
        jLabel13.setEnabled(false);
        jLabel14.setEnabled(false);
        jLabel15.setEnabled(false);
        txtNombreUsuario2.setEnabled(false);
        txtApellido1Usuario1.setEnabled(false);
        txtApellido2Usuario1.setEnabled(false);
        txtContrasenaUsuario1.setEnabled(false);
        rbActivo1.setEnabled(false);
        rbInactivo1.setEnabled(false);
        btnActualizar.setEnabled(false);*/
       /* jPanel2.setVisible(false);
       this.setSize(new Dimension(470, 390));
       this.setMinimumSize(new Dimension(470, 390));*/
    }
    
    //Cola 
    Cola c = new Cola();
   /* private NodoCUsuario inicio;
    private NodoCUsuario fin;
    
    public boolean esVacia(){
        if(inicio==null){
            return true;
        }else{
            return false;
        }
    }*/
    
     public void limpiar() {
        txtNombreUsuario.setText("");
        txtApellido1Usuario.setText("");
        txtApellido2Usuario.setText("");
        txtNicknameUsuario.setText("");
        txtContrasenaUsuario.setText("");;
        buttonGroup1.clearSelection();
        txtNombreUsuario.requestFocus();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txtNicknameUsuario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rbActivo = new javax.swing.JRadioButton();
        rbInactivo = new javax.swing.JRadioButton();
        btnAgregar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombreUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtApellido1Usuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtApellido2Usuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtContrasenaUsuario = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtNombreUsuario2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtApellido1Usuario1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtApellido2Usuario1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtContrasenaUsuario1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        rbActivo1 = new javax.swing.JRadioButton();
        rbInactivo1 = new javax.swing.JRadioButton();
        btnActualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setText("Contraseña:");

        jLabel7.setText("Estado:");

        buttonGroup1.add(rbActivo);
        rbActivo.setText("Activo");

        buttonGroup1.add(rbInactivo);
        rbInactivo.setText("Inactivo");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        jLabel1.setText("Registro de Usuarios");

        jLabel2.setText("Nombre: ");

        jLabel3.setText("Primer Apellido: ");

        jLabel4.setText("Segundo Apellido: ");

        jLabel5.setText("Nickname:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(69, 69, 69)
                        .addComponent(rbActivo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(rbInactivo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNicknameUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addComponent(txtContrasenaUsuario)))
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(61, 61, 61)
                        .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(25, 25, 25)
                        .addComponent(txtApellido1Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(12, 12, 12)
                        .addComponent(txtApellido2Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel2))
                    .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel3))
                    .addComponent(txtApellido1Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel4))
                    .addComponent(txtApellido2Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNicknameUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtContrasenaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel7))
                    .addComponent(rbActivo)
                    .addComponent(rbInactivo))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregar)
                    .addComponent(btnCancelar)
                    .addComponent(btnRegresar))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setText("Inactivar Usuario");

        jLabel10.setText("Ingrese el nickname del usuario que desea buscar:");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel11.setText("Nombre: ");

        jLabel12.setText("Primer Apellido: ");

        jLabel13.setText("Segundo Apellido: ");

        jLabel14.setText("Contraseña:");

        jLabel15.setText("Estado:");

        rbActivo1.setText("Activo");

        rbInactivo1.setText("Inactivo");

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(61, 61, 61)
                        .addComponent(txtNombreUsuario2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(25, 25, 25)
                        .addComponent(txtApellido1Usuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(45, 45, 45)
                        .addComponent(txtContrasenaUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(69, 69, 69)
                        .addComponent(rbActivo1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(rbInactivo1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(12, 12, 12)
                        .addComponent(txtApellido2Usuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel11))
                    .addComponent(txtNombreUsuario2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel12))
                    .addComponent(txtApellido1Usuario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel13))
                    .addComponent(txtApellido2Usuario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel14))
                    .addComponent(txtContrasenaUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel15))
                    .addComponent(rbActivo1)
                    .addComponent(rbInactivo1))
                .addGap(26, 26, 26)
                .addComponent(btnActualizar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
       // c.agregar(txtNombreUsuario.getText(), txtApellido1Usuario.getText(), txtApellido2Usuario.getText(), txtNicknameUsuario.getText(),txtContrasenaUsuario.getText(),rbActivo.getText());
       /* DatosRegistrarUsuario d = new DatosRegistrarUsuario();
        d.setNombre(txtNombreUsuario.getText());
        d.setPrimerApellido(txtApellido1Usuario.getText());
        d.setSegundoApellido(txtApellido2Usuario.getText());
        d.setUsuario(txtNicknameUsuario.getText());
        d.setPassword(txtContrasenaUsuario.getText());*/
        if(rbActivo.isSelected()){
            c.agregar(txtNombreUsuario.getText(), txtApellido1Usuario.getText(), txtApellido2Usuario.getText(), txtNicknameUsuario.getText(),txtContrasenaUsuario.getText(),rbActivo.getText());
        }else{
            c.agregar(txtNombreUsuario.getText(), txtApellido1Usuario.getText(), txtApellido2Usuario.getText(), txtNicknameUsuario.getText(),txtContrasenaUsuario.getText(),rbInactivo.getText());
        }
       /* NodoCUsuario nuevo = new NodoCUsuario();
        nuevo.setElemento(d);
        if(esVacia()){
            inicio=nuevo;
            fin=nuevo;
        }else{
            fin.setSiguiente(nuevo);
            fin=nuevo;
        }
        JOptionPane.showMessageDialog(null, "¡Datos agregados correctamente!",
                        "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);*/
        limpiar();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        c.mostrar();
        JOptionPane.showMessageDialog(null, "¡Datos no guardados!",
                        "Registro cancelado", JOptionPane.INFORMATION_MESSAGE);
        limpiar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
/*        if(!esVacia()){
            NodoCUsuario aux=inicio;
            while(aux!=null && txtBuscar.getText().compareTo(aux.getElemento().getUsuario())!=0){
                aux=aux.getSiguiente();
            }
            txtNombreUsuario2.setText(aux.getElemento().getNombre());
            txtApellido1Usuario1.setText(aux.getElemento().getPrimerApellido());
            txtApellido2Usuario1.setText(aux.getElemento().getSegundoApellido());
            txtContrasenaUsuario1.setText(aux.getElemento().getPassword());
            if(aux.getElemento().getEstado()=="Activo"){
                rbActivo1.setSelected(true);
            }else{
                rbInactivo1.setSelected(true);
            }
        }else{
            JOptionPane.showMessageDialog(null, "¡Usuario no encontrado!",
                "Error en actualización", JOptionPane.INFORMATION_MESSAGE);
            limpiar();
        } */
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
      /*  if(!esVacia()){
            NodoCUsuario aux=inicio;
            while(aux!=null && txtBuscar.getText()!=aux.getElemento().getUsuario()){
                aux=aux.getSiguiente();
            }
            aux.getElemento().setNombre(txtNombreUsuario.getText());
            aux.getElemento().setPrimerApellido(txtApellido1Usuario.getText());
            aux.getElemento().setSegundoApellido(txtApellido2Usuario.getText());
            aux.getElemento().setPassword(txtContrasenaUsuario.getText());
            if(rbActivo.isSelected()){
                aux.getElemento().setEstado(rbActivo.getText());
            }else{
                aux.getElemento().setEstado(rbInactivo.getText());
            }

            txtNombreUsuario.setText(aux.getElemento().getNombre());
            txtApellido1Usuario.setText(aux.getElemento().getPrimerApellido());
            txtApellido2Usuario.setText(aux.getElemento().getSegundoApellido());
            txtContrasenaUsuario.setText(aux.getElemento().getPassword());
            if(aux.getElemento().getEstado()=="Activo"){
                rbActivo.setSelected(true);
            }else{
                rbInactivo.setSelected(true);
            }
        }
        JOptionPane.showMessageDialog(null, "¡Datos actualizados correctamente!",
            "Actualización exitosa", JOptionPane.INFORMATION_MESSAGE);
        limpiar();*/
    }//GEN-LAST:event_btnActualizarActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton rbActivo;
    private javax.swing.JRadioButton rbActivo1;
    private javax.swing.JRadioButton rbInactivo;
    private javax.swing.JRadioButton rbInactivo1;
    private javax.swing.JTextField txtApellido1Usuario;
    private javax.swing.JTextField txtApellido1Usuario1;
    private javax.swing.JTextField txtApellido2Usuario;
    private javax.swing.JTextField txtApellido2Usuario1;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JPasswordField txtContrasenaUsuario;
    private javax.swing.JTextField txtContrasenaUsuario1;
    private javax.swing.JTextField txtNicknameUsuario;
    private javax.swing.JTextField txtNombreUsuario;
    private javax.swing.JTextField txtNombreUsuario2;
    // End of variables declaration//GEN-END:variables
}
