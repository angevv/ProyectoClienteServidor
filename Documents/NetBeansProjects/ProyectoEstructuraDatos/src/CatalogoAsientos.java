
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author andrescedeno
 */
public class CatalogoAsientos extends javax.swing.JFrame {

    /**
     * Creates new form CatalogoAsientos
     */
    public CatalogoAsientos() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Catalogo de Asientos");
        menup.ldc.cargarCatalogoAsientos();
        
    }
    
    //Lista Doble Circular
     MenuPrincipal menup = new MenuPrincipal();

    public void limpiar() {
        opcionesCodigoArea.clearSelection();
        opcionesEstado.clearSelection();
        txtNumeroAsiento.setText("");
        txtCostoAsiento.setText("");
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opcionesCodigoArea = new javax.swing.ButtonGroup();
        opcionesEstado = new javax.swing.ButtonGroup();
        CatalogoAsientos = new javax.swing.JLabel();
        CodigoArea = new javax.swing.JLabel();
        rbPRE = new javax.swing.JRadioButton();
        rbNOR = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        txtNumeroAsiento = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCostoAsiento = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        rbLIB = new javax.swing.JRadioButton();
        rbOCU = new javax.swing.JRadioButton();
        btnAgregar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CatalogoAsientos.setText("Catálogo de Asientos");

        CodigoArea.setText("Código de área:");

        opcionesCodigoArea.add(rbPRE);
        rbPRE.setText("PRE");

        opcionesCodigoArea.add(rbNOR);
        rbNOR.setText("NOR");
        rbNOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNORActionPerformed(evt);
            }
        });

        jLabel1.setText("Número de asiento:");

        jLabel2.setText("Costo de venta:");

        jLabel3.setText("Estado:");

        opcionesEstado.add(rbLIB);
        rbLIB.setText("LIB");

        opcionesEstado.add(rbOCU);
        rbOCU.setText("OCU");
        rbOCU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbOCUActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CatalogoAsientos)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CodigoArea)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbLIB)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(rbNOR)
                                        .addComponent(rbPRE)
                                        .addComponent(txtNumeroAsiento)
                                        .addComponent(txtCostoAsiento, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
                                    .addComponent(rbOCU)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(btnAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRegresar)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(CatalogoAsientos)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CodigoArea)
                    .addComponent(rbPRE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbNOR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNumeroAsiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCostoAsiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rbLIB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbOCU)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnCancelar)
                    .addComponent(btnRegresar))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbNORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNORActionPerformed
        
    }//GEN-LAST:event_rbNORActionPerformed
    //AGREGAR
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
       int numA = Integer.parseInt(txtNumeroAsiento.getText());
       float costoA = Float.parseFloat(txtCostoAsiento.getText());
       String codigoArea = "";
       if(rbPRE.isSelected()){
           codigoArea = rbPRE.getText();
       } else {
           codigoArea = rbNOR.getText();
       }
       
       String estado = "";
       if(rbLIB.isSelected()){
           codigoArea = rbLIB.getText();
       } else {
           codigoArea = rbOCU.getText();
       }
       menup.ldc.agregar(codigoArea, numA, costoA, estado);
       
       JOptionPane.showMessageDialog(null, "¡Datos agregados correctamente!",
                "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);
        limpiar();
        
    }//GEN-LAST:event_btnAgregarActionPerformed
    
    private void rbOCUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbOCUActionPerformed
        
    }//GEN-LAST:event_rbOCUActionPerformed
    //CANCELAR
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        JOptionPane.showMessageDialog(null, "¡Datos no guardados!",
                "Registro cancelado", JOptionPane.INFORMATION_MESSAGE);
        limpiar();
    }//GEN-LAST:event_btnCancelarActionPerformed
    //REGRESAR
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        menup.ldc.guardarArchivo();
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(CatalogoAsientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CatalogoAsientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CatalogoAsientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CatalogoAsientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CatalogoAsientos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CatalogoAsientos;
    private javax.swing.JLabel CodigoArea;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.ButtonGroup opcionesCodigoArea;
    private javax.swing.ButtonGroup opcionesEstado;
    private javax.swing.JRadioButton rbLIB;
    private javax.swing.JRadioButton rbNOR;
    private javax.swing.JRadioButton rbOCU;
    private javax.swing.JRadioButton rbPRE;
    private javax.swing.JTextField txtCostoAsiento;
    private javax.swing.JTextField txtNumeroAsiento;
    // End of variables declaration//GEN-END:variables
}
