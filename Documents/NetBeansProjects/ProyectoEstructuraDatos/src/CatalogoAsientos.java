
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
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
        menup.lsc.cargarEventos();
        llenarComboBox();
        
    }
    
    //Lista Doble Circular
     MenuPrincipal menup = new MenuPrincipal();

    public void limpiar() {
        opcionesCodigoArea.clearSelection();
        opcionesEstado.clearSelection();
        txtNumeroAsiento.setText("");
        txtCostoAsiento.setText("");
    }
    
     public void llenarComboBox() {
         if(!menup.lsc.esVaciaSC()){
            NodoCatalogoEvento aux=menup.lsc.inicio;
            cbEventos.addItem(aux.getElemento().getNombreEvento());
            aux=aux.getSiguiente();
            while(aux!=menup.lsc.inicio){
                 cbEventos.addItem(aux.getElemento().getNombreEvento());
                 aux=aux.getSiguiente();
            }
        }
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
        CodigoArea1 = new javax.swing.JLabel();
        cbEventos = new javax.swing.JComboBox<>();
        rbInactivo = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        CatalogoAsientos.setText("Cat??logo de Asientos");

        CodigoArea.setText("C??digo de ??rea:");

        opcionesCodigoArea.add(rbPRE);
        rbPRE.setText("PRE");

        opcionesCodigoArea.add(rbNOR);
        rbNOR.setText("NOR");
        rbNOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNORActionPerformed(evt);
            }
        });

        jLabel1.setText("N??mero de asiento:");

        jLabel2.setText("Costo de venta:");

        jLabel3.setText("Estado:");

        opcionesEstado.add(rbLIB);
        rbLIB.setText("LIB");
        rbLIB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbLIBActionPerformed(evt);
            }
        });

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

        CodigoArea1.setText("Evento:");

        cbEventos.setToolTipText("");

        opcionesEstado.add(rbInactivo);
        rbInactivo.setText("INAC");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CatalogoAsientos)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CodigoArea)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(CodigoArea1))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbInactivo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(rbLIB)
                                .addComponent(rbNOR)
                                .addComponent(rbPRE)
                                .addComponent(txtNumeroAsiento)
                                .addComponent(txtCostoAsiento, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                                .addComponent(rbOCU)
                                .addComponent(cbEventos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addComponent(btnAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegresar)
                .addGap(62, 62, 62))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(CatalogoAsientos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CodigoArea1)
                    .addComponent(cbEventos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbInactivo)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnCancelar)
                    .addComponent(btnRegresar))
                .addGap(21, 21, 21))
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
       
       String nomEvento = cbEventos.getSelectedItem().toString();
       
       String estado = "";
       if(rbLIB.isSelected()){
           estado = rbLIB.getText();
       } else if(rbOCU.isSelected()){
           estado = rbOCU.getText();
       }else{
           estado = rbInactivo.getText();
       }
       menup.ldc.agregar(nomEvento,codigoArea, numA, costoA, estado);
       
       JOptionPane.showMessageDialog(null, "??Datos agregados correctamente!",
                "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);
        limpiar();
        
    }//GEN-LAST:event_btnAgregarActionPerformed
    
    private void rbOCUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbOCUActionPerformed
        
    }//GEN-LAST:event_rbOCUActionPerformed
    //CANCELAR
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        JOptionPane.showMessageDialog(null, "??Datos no guardados!",
                "Registro cancelado", JOptionPane.INFORMATION_MESSAGE);
        limpiar();
    }//GEN-LAST:event_btnCancelarActionPerformed
    //REGRESAR
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        menup.ldc.guardarArchivo();
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void rbLIBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbLIBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbLIBActionPerformed

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
    private javax.swing.JLabel CodigoArea1;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cbEventos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.ButtonGroup opcionesCodigoArea;
    private javax.swing.ButtonGroup opcionesEstado;
    private javax.swing.JRadioButton rbInactivo;
    private javax.swing.JRadioButton rbLIB;
    private javax.swing.JRadioButton rbNOR;
    private javax.swing.JRadioButton rbOCU;
    private javax.swing.JRadioButton rbPRE;
    private javax.swing.JTextField txtCostoAsiento;
    private javax.swing.JTextField txtNumeroAsiento;
    // End of variables declaration//GEN-END:variables
}
