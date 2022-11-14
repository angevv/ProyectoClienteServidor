
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author andrescedeno
 */
public class InactivarEventos extends javax.swing.JFrame {

    /**
     * Creates new form CatalogoEventos
     */
    public InactivarEventos() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Inactivar Eventos");
        //Lista Simple Circular
        this.inicio=null;
        this.fin=null;
    }
    
    //Lista Simple Circular
    private NodoCatalogoEvento inicio;
    private NodoCatalogoEvento fin;
    
    public boolean esVaciaSC(){
        if(inicio==null){
            return true;
        }else{
            return false;
        }
    }
    
    public void limpiar() {
        txtNombreEvento.setText("");
        txtFechaEvento.setText("");
        OpcionesLugarEvento.clearSelection();
        txtCiudad.setText("");
        txtDireccion.setText("");
        txtEstado.setText("");
        txtNombreEvento.requestFocus();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OpcionesLugarEvento = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txtFechaEvento = new javax.swing.JTextField();
        Ciudad = new javax.swing.JLabel();
        Direccion = new javax.swing.JLabel();
        CatalogoEvento = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        NombreEvento = new javax.swing.JLabel();
        txtCiudad = new javax.swing.JTextField();
        fechaEvento = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        rbEstadio = new javax.swing.JRadioButton();
        txtEstado = new javax.swing.JTextField();
        LugarEvento = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        rbAnfiteatro = new javax.swing.JRadioButton();
        btnCancelar = new javax.swing.JButton();
        rbTeatro = new javax.swing.JRadioButton();
        btnRegresar = new javax.swing.JButton();
        txtNombreEvento = new javax.swing.JTextField();
        lblBuscarInactivarNombreEvento = new javax.swing.JLabel();
        txtBuscarNombreInactivarEvento = new javax.swing.JTextField();
        tbnBuscarInactivarNombreEvento = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtFechaEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaEventoActionPerformed(evt);
            }
        });

        Ciudad.setText("Ciudad:");

        Direccion.setText("Dirección:");

        CatalogoEvento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CatalogoEvento.setText("INACTIVAR EVENTOS");

        jLabel1.setText("Estado:");

        NombreEvento.setText("Nombre:");

        txtCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCiudadActionPerformed(evt);
            }
        });

        fechaEvento.setText("Fecha:");

        OpcionesLugarEvento.add(rbEstadio);
        rbEstadio.setText("Estadio");
        rbEstadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEstadioActionPerformed(evt);
            }
        });

        LugarEvento.setText("Lugar:");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        OpcionesLugarEvento.add(rbAnfiteatro);
        rbAnfiteatro.setText("Anfiteatro");
        rbAnfiteatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAnfiteatroActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        OpcionesLugarEvento.add(rbTeatro);
        rbTeatro.setText("Teatro");

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        txtNombreEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreEventoActionPerformed(evt);
            }
        });

        lblBuscarInactivarNombreEvento.setText("Ingrese el nombre del evento que desea inactivar:");

        tbnBuscarInactivarNombreEvento.setText("Buscar");
        tbnBuscarInactivarNombreEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnBuscarInactivarNombreEventoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CatalogoEvento)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btnAgregar)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(btnRegresar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fechaEvento)
                            .addComponent(jLabel1)
                            .addComponent(Direccion)
                            .addComponent(Ciudad)
                            .addComponent(LugarEvento)
                            .addComponent(NombreEvento))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rbEstadio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbAnfiteatro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbTeatro))
                            .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFechaEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblBuscarInactivarNombreEvento)
                        .addGap(39, 39, 39)
                        .addComponent(txtBuscarNombreInactivarEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tbnBuscarInactivarNombreEvento)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(CatalogoEvento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBuscarInactivarNombreEvento)
                    .addComponent(txtBuscarNombreInactivarEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbnBuscarInactivarNombreEvento))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NombreEvento, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNombreEvento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFechaEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechaEvento))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LugarEvento)
                    .addComponent(rbEstadio)
                    .addComponent(rbAnfiteatro)
                    .addComponent(rbTeatro))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ciudad)
                    .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Direccion)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnCancelar)
                    .addComponent(btnRegresar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbAnfiteatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAnfiteatroActionPerformed
        
    }//GEN-LAST:event_rbAnfiteatroActionPerformed

    private void txtNombreEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreEventoActionPerformed
        
    }//GEN-LAST:event_txtNombreEventoActionPerformed

    private void txtFechaEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaEventoActionPerformed
        
    }//GEN-LAST:event_txtFechaEventoActionPerformed

    private void txtCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCiudadActionPerformed
        
    }//GEN-LAST:event_txtCiudadActionPerformed

    private void rbEstadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEstadioActionPerformed
        
    }//GEN-LAST:event_rbEstadioActionPerformed
    //AGREGAR
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        DatosCatalogoEvento d = new DatosCatalogoEvento();
        d.setNombreEvento(txtNombreEvento.getText());
        d.setFechaEvento(txtFechaEvento.getText());
        d.setCiudad(txtCiudad.getText());
        d.setDireccion(txtDireccion.getText());
        d.setEstado(txtEstado.getText());
        if(rbEstadio.isSelected()){
            d.setLugar(rbEstadio.getText());
        }
        if(rbAnfiteatro.isSelected()){
            d.setLugar(rbAnfiteatro.getText());
        }
        if(rbTeatro.isSelected()){
            d.setLugar(rbTeatro.getText());
        }
        
        NodoCatalogoEvento nuevo = new NodoCatalogoEvento();
        nuevo.setElemento(d);
        if(esVaciaSC()){
           inicio=nuevo;
           fin=nuevo;
           fin.setSiguiente(inicio); 
        } else if (d.getNombreEvento().compareTo(inicio.getElemento().getNombreEvento())<0){ 
           nuevo.setSiguiente(inicio); 
           inicio=nuevo;
           fin.setSiguiente(inicio);
       } else if (d.getNombreEvento().compareTo(fin.getElemento().getNombreEvento())>=0){ 
           fin.setSiguiente(nuevo);
           fin = nuevo;
           fin.setSiguiente(inicio); 
       } else { 
           NodoCatalogoEvento aux=inicio;
           while(aux.getSiguiente().getElemento().getNombreEvento().compareTo(d.getNombreEvento())<0){
               aux=aux.getSiguiente();
           }
           nuevo.setSiguiente(aux.getSiguiente()); 
           aux.setSiguiente(nuevo); 
       }
        JOptionPane.showMessageDialog(null, "¡Datos agregados correctamente!",
                        "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);
        limpiar();
    }//GEN-LAST:event_btnAgregarActionPerformed
    //CANCELAR
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        JOptionPane.showMessageDialog(null, "¡Datos no guardados!",
                "Registro cancelado", JOptionPane.INFORMATION_MESSAGE);
        limpiar();
    }//GEN-LAST:event_btnCancelarActionPerformed
    //REGRESAR
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed
    //BUSCAR
    private void tbnBuscarInactivarNombreEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnBuscarInactivarNombreEventoActionPerformed
        // TODO add your handling code here:
          if(!esVaciaSC()){
           String s ="";
           NodoCatalogoEvento aux=inicio;
           s=s+aux.getElemento().getNombreEvento()+"--"+aux.getElemento().getFechaEvento()+"--"+aux.getElemento().getCiudad()+"--"+aux.getElemento().getDireccion()+"--"+aux.getElemento().getEstado()+"-->";
           aux=aux.getSiguiente();
           while(aux!=inicio){
               s=s+aux.getElemento().getNombreEvento()+"--"+aux.getElemento().getFechaEvento()+"--"+aux.getElemento().getCiudad()+"--"+aux.getElemento().getDireccion()+"--"+aux.getElemento().getEstado()+"-->";
               aux=aux.getSiguiente();
           }
           JOptionPane.showMessageDialog(null, "La lista contiene: \n"+s);
       } else {
           JOptionPane.showMessageDialog(null,"No se puede extraer, lista vacía");
       }
    }//GEN-LAST:event_tbnBuscarInactivarNombreEventoActionPerformed

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
            java.util.logging.Logger.getLogger(CatalogoEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CatalogoEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CatalogoEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CatalogoEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CatalogoEventos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CatalogoEvento;
    private javax.swing.JLabel Ciudad;
    private javax.swing.JLabel Direccion;
    private javax.swing.JLabel LugarEvento;
    private javax.swing.JLabel NombreEvento;
    private javax.swing.ButtonGroup OpcionesLugarEvento;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel fechaEvento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBuscarInactivarNombreEvento;
    private javax.swing.JRadioButton rbAnfiteatro;
    private javax.swing.JRadioButton rbEstadio;
    private javax.swing.JRadioButton rbTeatro;
    private javax.swing.JButton tbnBuscarInactivarNombreEvento;
    private javax.swing.JTextField txtBuscarNombreInactivarEvento;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtFechaEvento;
    private javax.swing.JTextField txtNombreEvento;
    // End of variables declaration//GEN-END:variables
}
