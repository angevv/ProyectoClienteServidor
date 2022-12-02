
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
public class EditarAsientos extends javax.swing.JFrame {

    /**
     * Creates new form CatalogoAsientos
     */
    public EditarAsientos() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Editar Asientos");
        menup.ldc.cargarCatalogoAsientos();
        menup.lsc.cargarEventos();
        llenarComboBox();
    }
    
    MenuPrincipal menup = new MenuPrincipal();
    
    public void limpiar() {
        opcionesCodigoArea.clearSelection();
        opcionesEstado.clearSelection(); 
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
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opcionesCodigoArea = new javax.swing.ButtonGroup();
        opcionesEstado = new javax.swing.ButtonGroup();
        CodigoArea1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCostoAsiento = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        rbLIB = new javax.swing.JRadioButton();
        rbOCU = new javax.swing.JRadioButton();
        lblEditarsientos = new javax.swing.JLabel();
        CodigoArea = new javax.swing.JLabel();
        rbPRE = new javax.swing.JRadioButton();
        btnRegresar = new javax.swing.JButton();
        rbNOR = new javax.swing.JRadioButton();
        lblBuscarEditarNumeroAsiento = new javax.swing.JLabel();
        txtBuscarNumeroAsiento = new javax.swing.JTextField();
        btnBuscarNumeroAsiento = new javax.swing.JButton();
        btnEditarAsientos = new javax.swing.JButton();
        btnInactivarAsientos = new javax.swing.JButton();
        rbInactivo = new javax.swing.JRadioButton();
        CodigoArea2 = new javax.swing.JLabel();
        cbEventos = new javax.swing.JComboBox<>();

        CodigoArea1.setText("Evento:");

        jComboBox1.setToolTipText("");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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

        lblEditarsientos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEditarsientos.setText("EDITAR O INACTIVAR ASIENTOS");

        CodigoArea.setText("Código de área:");

        opcionesCodigoArea.add(rbPRE);
        rbPRE.setText("PRE");

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        opcionesCodigoArea.add(rbNOR);
        rbNOR.setText("NOR");
        rbNOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNORActionPerformed(evt);
            }
        });

        lblBuscarEditarNumeroAsiento.setText("Ingrese el numero del asiento que desea editar:");

        btnBuscarNumeroAsiento.setText("Buscar");
        btnBuscarNumeroAsiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarNumeroAsientoActionPerformed(evt);
            }
        });

        btnEditarAsientos.setText("Editar");
        btnEditarAsientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarAsientosActionPerformed(evt);
            }
        });

        btnInactivarAsientos.setText("Inactivar");
        btnInactivarAsientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInactivarAsientosActionPerformed(evt);
            }
        });

        opcionesEstado.add(rbInactivo);
        rbInactivo.setText("INAC");

        CodigoArea2.setText("Evento:");

        cbEventos.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEditarsientos)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblBuscarEditarNumeroAsiento)
                        .addGap(78, 78, 78)
                        .addComponent(txtBuscarNumeroAsiento, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscarNumeroAsiento))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CodigoArea)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(CodigoArea2))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbLIB)
                            .addComponent(rbPRE)
                            .addComponent(rbOCU)
                            .addComponent(rbNOR)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnEditarAsientos, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnInactivarAsientos, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRegresar))
                            .addComponent(rbInactivo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cbEventos, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCostoAsiento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)))))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEditarsientos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBuscarEditarNumeroAsiento)
                    .addComponent(txtBuscarNumeroAsiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarNumeroAsiento))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CodigoArea2)
                    .addComponent(cbEventos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbPRE)
                    .addComponent(CodigoArea))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbNOR)
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCostoAsiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rbLIB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbOCU)
                .addGap(4, 4, 4)
                .addComponent(rbInactivo)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarAsientos)
                    .addComponent(btnRegresar)
                    .addComponent(btnInactivarAsientos))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbNORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNORActionPerformed
        
    }//GEN-LAST:event_rbNORActionPerformed

   
    private void rbOCUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbOCUActionPerformed
        
    }//GEN-LAST:event_rbOCUActionPerformed

   //REGRESAR
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed
    //BUSCAR
    private void btnBuscarNumeroAsientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarNumeroAsientoActionPerformed
        limpiar();
        txtBuscarNumeroAsiento.requestFocus();
        mostrarLDC();
    }//GEN-LAST:event_btnBuscarNumeroAsientoActionPerformed

    private void btnEditarAsientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarAsientosActionPerformed
        editar();
        JOptionPane.showMessageDialog(null, "¡El asiento se ha editado!",
                "Asiento Editado", JOptionPane.INFORMATION_MESSAGE);
        txtBuscarNumeroAsiento.setText("");
        limpiar();
        txtBuscarNumeroAsiento.requestFocus();
    }//GEN-LAST:event_btnEditarAsientosActionPerformed

    private void btnInactivarAsientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInactivarAsientosActionPerformed
        int numeroA = Integer.parseInt(txtBuscarNumeroAsiento.getText());
        inactivar(numeroA);
        JOptionPane.showMessageDialog(null, "¡El asiento fue inactivado!", "Asiento inactivado",
                            JOptionPane.INFORMATION_MESSAGE);
        limpiar();
    }//GEN-LAST:event_btnInactivarAsientosActionPerformed
    
    public void inactivar(int numeroA) {
       if(!menup.ldc.esVaciaDC()){
            NodoCatalogoAsientos aux=menup.ldc.inicio;
            if(numeroA==aux.getElemento().getNumeroAsiento()){
                aux.getElemento().setEstado("Inactivo");
                menup.ldc.inactivar(numeroA);
            }
            aux=aux.getSiguiente();
            while(aux!=menup.ldc.inicio){
                 if(numeroA==aux.getElemento().getNumeroAsiento()){
                    aux.getElemento().setEstado("Inactivo");
                    menup.ldc.inactivar(numeroA);
                 }
                  aux=aux.getSiguiente();
            }
           
        }
    }
    
    public void mostrarLDC() {
        int comprobar=0;
        if (!menup.ldc.esVaciaDC()) {
            int buscar = Integer.parseInt(txtBuscarNumeroAsiento.getText());
            NodoCatalogoAsientos aux = menup.ldc.inicio;
            if (aux.getElemento().getNumeroAsiento() == buscar) {
               cbEventos.setSelectedItem(aux.getElemento().getNombreEvento());
               String costoA = String.valueOf(aux.getElemento().getCostoVenta());
                txtCostoAsiento.setText(costoA);
                if (aux.getElemento().getEstado().equals("LIB")) {
                    rbLIB.setSelected(true);
                } else if (aux.getElemento().getEstado().equals("OCU")){
                    rbOCU.setSelected(true);
                }else{
                    rbInactivo.setSelected(true);
                }
                if (aux.getElemento().getCodigoArea().equals("PRE")) {
                    rbPRE.setSelected(true);
                } else {
                    rbNOR.setSelected(true);
                }
                comprobar = 1;
            }
            aux = aux.getSiguiente();
            while (aux != menup.ldc.inicio) {
                if (aux.getElemento().getNumeroAsiento() == buscar) {
                    cbEventos.setSelectedItem(aux.getElemento().getNombreEvento());
                    String costoA = String.valueOf(aux.getElemento().getCostoVenta());
                txtCostoAsiento.setText(costoA);
                if (aux.getElemento().getEstado().equals("LIB")) {
                    rbLIB.setSelected(true);
                } else if (aux.getElemento().getEstado().equals("OCU")){
                    rbOCU.setSelected(true);
                }else{
                    rbInactivo.setSelected(true);
                }
                if (aux.getElemento().getCodigoArea().equals("PRE")) {
                    rbPRE.setSelected(true);
                } else {
                    rbNOR.setSelected(true);
                }
                    comprobar = 1;
                }
                aux = aux.getSiguiente();
            }

            if (comprobar == 0) {
                JOptionPane.showMessageDialog(null, "¡Asiento no encontrado!",
                        "Error en la búsqueda", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "¡No se han registrado asientos!",
                        "Error en la búsqueda", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void editar() {
        int comprobar=0;
        if (!menup.ldc.esVaciaDC()) {
            int buscar = Integer.parseInt(txtBuscarNumeroAsiento.getText());
            NodoCatalogoAsientos aux = menup.ldc.inicio;
            if (aux.getElemento().getNumeroAsiento() == buscar) {
               float costoAsiento = Float.parseFloat(txtCostoAsiento.getText());
                aux.getElemento().setCostoVenta(costoAsiento);
               String nomEvento = cbEventos.getSelectedItem().toString();
               aux.getElemento().setNombreEvento(nomEvento);
                String codigoA = "";
                if (rbPRE.isSelected()) {
                    aux.getElemento().setCodigoArea(rbPRE.getText());
                    codigoA = rbPRE.getText();
                } else if(rbNOR.isSelected()){
                    aux.getElemento().setCodigoArea(rbNOR.getText());
                    codigoA = rbNOR.getText();
                }
                String estado = "";
                if (rbLIB.isSelected()) {
                    aux.getElemento().setEstado(rbLIB.getText());
                    estado = rbLIB.getText();
                } else if (rbOCU.isSelected()){
                    aux.getElemento().setEstado(rbOCU.getText());
                    estado = rbOCU.getText();
                }else{
                    aux.getElemento().setEstado(rbInactivo.getText());
                    estado = rbInactivo.getText();
                }
                menup.ldc.actualizarArchivo(buscar, nomEvento, codigoA, estado,costoAsiento);
                comprobar = 1;
            }
            aux = aux.getSiguiente();
            while (aux != menup.ldc.inicio) {
                if (aux.getElemento().getNumeroAsiento() == buscar) {
                    float costoAsiento = Float.parseFloat(txtCostoAsiento.getText());
                     aux.getElemento().setCostoVenta(costoAsiento);
                     String nomEvento = cbEventos.getSelectedItem().toString();
                      aux.getElemento().setNombreEvento(nomEvento);
                     String codigoA = "";
                     if (rbPRE.isSelected()) {
                         aux.getElemento().setCodigoArea(rbPRE.getText());
                         codigoA = rbPRE.getText();
                     } else {
                         aux.getElemento().setCodigoArea(rbNOR.getText());
                         codigoA = rbNOR.getText();
                     }
                    String estado = "";
                    if (rbLIB.isSelected()) {
                        aux.getElemento().setEstado(rbLIB.getText());
                        estado = rbLIB.getText();
                    } else if (rbOCU.isSelected()) {
                        aux.getElemento().setEstado(rbOCU.getText());
                        estado = rbOCU.getText();
                    } else {
                        aux.getElemento().setEstado(rbInactivo.getText());
                        estado = rbInactivo.getText();
                    }
                     
                    comprobar = 1;
                    menup.ldc.actualizarArchivo(buscar, nomEvento,codigoA, estado, costoAsiento);
                }
                aux = aux.getSiguiente();
            }

            if (comprobar == 0) {
                JOptionPane.showMessageDialog(null, "¡Asiento no encontrado!",
                        "Error en la búsqueda", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "¡No se han registrado asientos!",
                        "Error en la búsqueda", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
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
    private javax.swing.JLabel CodigoArea;
    private javax.swing.JLabel CodigoArea1;
    private javax.swing.JLabel CodigoArea2;
    private javax.swing.JButton btnBuscarNumeroAsiento;
    private javax.swing.JButton btnEditarAsientos;
    private javax.swing.JButton btnInactivarAsientos;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cbEventos;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBuscarEditarNumeroAsiento;
    private javax.swing.JLabel lblEditarsientos;
    private javax.swing.ButtonGroup opcionesCodigoArea;
    private javax.swing.ButtonGroup opcionesEstado;
    private javax.swing.JRadioButton rbInactivo;
    private javax.swing.JRadioButton rbLIB;
    private javax.swing.JRadioButton rbNOR;
    private javax.swing.JRadioButton rbOCU;
    private javax.swing.JRadioButton rbPRE;
    private javax.swing.JTextField txtBuscarNumeroAsiento;
    private javax.swing.JTextField txtCostoAsiento;
    // End of variables declaration//GEN-END:variables
}
