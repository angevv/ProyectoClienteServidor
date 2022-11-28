
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author andrescedeno
 */
public class CatalogoEventos extends javax.swing.JFrame {

    /**
     * Creates new form CatalogoEventos
     */
    public CatalogoEventos() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Catalogo de Eventos");
        menupr.lsc.cargarEventos();

    }

    //Lista Simple Circular
    MenuPrincipal menupr = new MenuPrincipal();

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
        CatalogoEvento = new javax.swing.JLabel();
        NombreEvento = new javax.swing.JLabel();
        fechaEvento = new javax.swing.JLabel();
        rbEstadio = new javax.swing.JRadioButton();
        LugarEvento = new javax.swing.JLabel();
        rbAnfiteatro = new javax.swing.JRadioButton();
        rbTeatro = new javax.swing.JRadioButton();
        txtNombreEvento = new javax.swing.JTextField();
        txtFechaEvento = new javax.swing.JTextField();
        Ciudad = new javax.swing.JLabel();
        Direccion = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtCiudad = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        CatalogoEvento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CatalogoEvento.setText("CATÁLOGO DE EVENTOS");

        NombreEvento.setText("Nombre:");

        fechaEvento.setText("Fecha:");

        OpcionesLugarEvento.add(rbEstadio);
        rbEstadio.setText("Estadio");
        rbEstadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEstadioActionPerformed(evt);
            }
        });

        LugarEvento.setText("Lugar:");

        OpcionesLugarEvento.add(rbAnfiteatro);
        rbAnfiteatro.setText("Anfiteatro");
        rbAnfiteatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAnfiteatroActionPerformed(evt);
            }
        });

        OpcionesLugarEvento.add(rbTeatro);
        rbTeatro.setText("Teatro");

        txtNombreEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreEventoActionPerformed(evt);
            }
        });

        txtFechaEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaEventoActionPerformed(evt);
            }
        });

        Ciudad.setText("Ciudad:");

        Direccion.setText("Dirección:");

        jLabel1.setText("Estado:");

        txtCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCiudadActionPerformed(evt);
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
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CatalogoEvento)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fechaEvento)
                            .addComponent(LugarEvento)
                            .addComponent(Ciudad)
                            .addComponent(NombreEvento)
                            .addComponent(Direccion)
                            .addComponent(jLabel1))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtFechaEvento)
                                .addComponent(txtCiudad)
                                .addComponent(txtDireccion)
                                .addComponent(txtEstado)
                                .addComponent(txtNombreEvento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbEstadio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbAnfiteatro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbTeatro))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btnAgregar)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(btnRegresar)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(CatalogoEvento)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreEvento)
                    .addComponent(txtNombreEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFechaEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechaEvento))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LugarEvento)
                    .addComponent(rbEstadio)
                    .addComponent(rbAnfiteatro)
                    .addComponent(rbTeatro))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ciudad))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Direccion)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnCancelar)
                    .addComponent(btnRegresar))
                .addGap(23, 23, 23))
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
       // int verificar=0;
        String lugar = "";
        if (rbEstadio.isSelected()) {
            lugar = rbEstadio.getText();
        } else if (rbAnfiteatro.isSelected()) {
            lugar = rbAnfiteatro.getText();
        } else {
            lugar = rbTeatro.getText();
        }

        if (menupr.lsc.existe(lugar, txtNombreEvento.getText(), txtFechaEvento.getText())) {
            menupr.lsc.agregar(txtNombreEvento.getText(), txtFechaEvento.getText(), lugar, txtCiudad.getText(), txtDireccion.getText(), txtEstado.getText());
            JOptionPane.showMessageDialog(null, "¡Datos agregados correctamente!",
                    "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "¡Datos ya existen!",
                    "Registro Fallido", JOptionPane.INFORMATION_MESSAGE);
        }
       /* if(!menupr.lsc.esVaciaSC()){
            NodoCatalogoEvento aux=menupr.lsc.inicio;
             if(!aux.getElemento().getNombreEvento().equals(txtNombreEvento.getText())){
                if (aux.getElemento().getLugar().equals(lugar) && aux.getElemento().getFechaEvento().equals(txtFechaEvento.getText())) {
                     JOptionPane.showMessageDialog(null, "¡El lugar ya tiene un evento registrado a la misma hora!",
                     "Registro Fallido", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    menupr.lsc.agregar(txtNombreEvento.getText(), txtFechaEvento.getText(), lugar, txtCiudad.getText(), txtDireccion.getText(), txtEstado.getText());
                    JOptionPane.showMessageDialog(null, "¡Datos agregados correctamente!",
                        "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);
                }
                verificar=1;
               }
            aux=aux.getSiguiente();
            while(aux!=menupr.lsc.inicio){
                if(!aux.getElemento().getNombreEvento().equals(txtNombreEvento.getText())){
                    if (aux.getElemento().getLugar().equals(lugar) && aux.getElemento().getFechaEvento().equals(txtFechaEvento.getText())) {
                         JOptionPane.showMessageDialog(null, "¡El lugar ya tiene un evento registrado a la misma hora!",
                         "Registro Fallido", JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        menupr.lsc.agregar(txtNombreEvento.getText(), txtFechaEvento.getText(), lugar, txtCiudad.getText(), txtDireccion.getText(), txtEstado.getText());
                        JOptionPane.showMessageDialog(null, "¡Datos agregados correctamente!",
                            "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);
                    }
                    verificar=1;
               }
                aux=aux.getSiguiente();
            } 
            if(verificar==0){
                JOptionPane.showMessageDialog(null, "¡El evento ya existe!",
                    "Registro Fallido", JOptionPane.INFORMATION_MESSAGE);
            }
        }else{
            menupr.lsc.agregar(txtNombreEvento.getText(), txtFechaEvento.getText(), lugar, txtCiudad.getText(), txtDireccion.getText(), txtEstado.getText());
                JOptionPane.showMessageDialog(null, "¡Datos agregados correctamente!",
                        "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);
        }/*
       /* if (!menupr.lsc.esVaciaSC()) {
            String s = "";
            NodoCatalogoEvento aux = menupr.lsc.inicio;
            if (!aux.getElemento().getNombreEvento().equals(txtNombreEvento.getText())) {
                verificarN = 1;
            } else {
                verificarN = 0;
            }
            if (!aux.getElemento().getLugar().equals(lugar) || !aux.getElemento().getFechaEvento().equals(txtFechaEvento.getText())) {
                verificarF = 1;
            } else {
                verificarF = 0;
            }
            if (verificarN == 1 && verificarF == 1) {
                menupr.lsc.agregar(txtNombreEvento.getText(), txtFechaEvento.getText(), lugar, txtCiudad.getText(), txtDireccion.getText(), txtEstado.getText());
                JOptionPane.showMessageDialog(null, "¡Datos agregados correctamente!",
                        "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);
            }
            aux = aux.getSiguiente();
            while (aux != menupr.lsc.inicio) {
                if (!aux.getElemento().getNombreEvento().equals(txtNombreEvento.getText())) {
                    verificarN = 1;
                } else {
                    verificarN = 0;
                }
                if (!aux.getElemento().getLugar().equals(lugar) || !aux.getElemento().getFechaEvento().equals(txtFechaEvento.getText())) {
                    verificarF = 1;
                } else {
                    verificarF = 0;
                }
                if (verificarN == 1 && verificarF == 1) {
                    menupr.lsc.agregar(txtNombreEvento.getText(), txtFechaEvento.getText(), lugar, txtCiudad.getText(), txtDireccion.getText(), txtEstado.getText());
                    JOptionPane.showMessageDialog(null, "¡Datos agregados correctamente!",
                            "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);
                }
                aux = aux.getSiguiente();
            }
        } else {
            menupr.lsc.agregar(txtNombreEvento.getText(), txtFechaEvento.getText(), lugar, txtCiudad.getText(), txtDireccion.getText(), txtEstado.getText());
            JOptionPane.showMessageDialog(null, "¡Datos agregados correctamente!",
                    "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);
            verificarN = 1;
            verificarF = 1;
        }
        if (verificarN == 0) {
            JOptionPane.showMessageDialog(null, "¡El evento ya está registrado!",
                    "Registro Fallido", JOptionPane.INFORMATION_MESSAGE);
        }
        if (verificarF == 0) {
            JOptionPane.showMessageDialog(null, "¡El lugar ya tiene un evento para esa fecha!",
                    "Registro Fallido", JOptionPane.INFORMATION_MESSAGE);
        }*/
        limpiar();
    }//GEN-LAST:event_btnAgregarActionPerformed
    //CANCELAR
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        JOptionPane.showMessageDialog(null, "¡Datos no guardados!",
                "Registro cancelado", JOptionPane.INFORMATION_MESSAGE);
         if(!menupr.lsc.esVaciaSC()){
            String s="";
            NodoCatalogoEvento aux=menupr.lsc.inicio;
            s=s+aux.getElemento().getNombreEvento()+" "+aux.getElemento().getFechaEvento()+" "+aux.getElemento().getLugar()+"-->";
            aux=aux.getSiguiente();
            while(aux!=menupr.lsc.inicio){
               s=s+aux.getElemento().getNombreEvento()+" "+aux.getElemento().getFechaEvento()+" "+aux.getElemento().getLugar()+"-->";
                aux=aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, "La lista contiene:\n"+s);
        }else{
            JOptionPane.showMessageDialog(null, "Lista vacia");
        }
        limpiar();
    }//GEN-LAST:event_btnCancelarActionPerformed
    //REGRESAR
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        menupr.lsc.guardarArchivo();
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
    private javax.swing.JRadioButton rbAnfiteatro;
    private javax.swing.JRadioButton rbEstadio;
    private javax.swing.JRadioButton rbTeatro;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtFechaEvento;
    private javax.swing.JTextField txtNombreEvento;
    // End of variables declaration//GEN-END:variables
}
