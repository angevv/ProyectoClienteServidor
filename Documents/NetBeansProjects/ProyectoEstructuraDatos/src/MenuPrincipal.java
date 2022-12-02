
import java.awt.Color;
import java.awt.Dimension;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.Image;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.plaf.basic.BasicMenuBarUI;
import javax.swing.plaf.basic.BasicMenuItemUI;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Angel
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    private int salir;
    public MenuPrincipal() {
        initComponents();
        setTitle("Multifiestas");
        setLocationRelativeTo(null);
        setExtendedState(MAXIMIZED_BOTH);
        Image home=new ImageIcon(getClass().getResource("iconos\\home.png")).getImage();   
        setIconImage(home);
        setResizable(false);
        
        ImageFondo image=new ImageFondo();
        image.setImage("imagenes\\fondo1.png");
        setContentPane(image);

        jMenuBar1.setUI(new BasicMenuBarUI(){});
        jMenuBar1.setBackground(Color.decode("#DEDEDE"));
        jMenu1.setForeground(Color.decode("#000000"));
        jMenu2.setForeground(Color.decode("#000000"));
        jMenu3.setForeground(Color.decode("#000000"));
        jMenu4.setForeground(Color.decode("#000000"));
        jMenu5.setForeground(Color.decode("#000000"));
       
        /*MenuRegistroUsuarios.setUI(new BasicMenuItemUI(){});
        MenuRegistroUsuarios.setBackground(Color.decode("#000000"));*/
    }
    
    //Estructuras
    Cola c = new Cola();
    Arbol a = new Arbol();
    ListaDobleCircular ldc = new ListaDobleCircular();
    ListaSimpleCircular lsc = new ListaSimpleCircular();
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuRegistroUsuarios = new javax.swing.JMenuItem();
        MenuConsultarUsuarios = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        MenuCatalogoEventos = new javax.swing.JMenuItem();
        EditarCatalogoEventos = new javax.swing.JMenuItem();
        MenuCatalogoAsientos = new javax.swing.JMenuItem();
        EditarCatalogoAsientos = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        MenuVentas = new javax.swing.JMenuItem();
        MenuConsultarVentas = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        MenuCajas = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 659, Short.MAX_VALUE)
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 232, Short.MAX_VALUE)
        );

        jTextField1.setText("jTextField1");

        jLabel1.setText("jLabel1");

        jMenuBar1.setBorder(null);
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setMaximumSize(new java.awt.Dimension(70, 70));
        jMenuBar1.setMinimumSize(new java.awt.Dimension(70, 70));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(70, 70));

        jMenu1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenu1.setText("Usuarios");
        jMenu1.setAlignmentX(0.8F);
        jMenu1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenu1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu1.setMargin(new java.awt.Insets(0, 300, 0, 300));
        jMenu1.setMaximumSize(new java.awt.Dimension(90, 70));
        jMenu1.setPreferredSize(new java.awt.Dimension(93, 41));
        jMenu1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jMenu1MouseMoved(evt);
            }
        });

        MenuRegistroUsuarios.setText("Registro");
        MenuRegistroUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuRegistroUsuariosActionPerformed(evt);
            }
        });
        jMenu1.add(MenuRegistroUsuarios);

        MenuConsultarUsuarios.setText("Consultar");
        MenuConsultarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuConsultarUsuariosActionPerformed(evt);
            }
        });
        jMenu1.add(MenuConsultarUsuarios);

        jMenuBar1.add(jMenu1);

        jMenu2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenu2.setText("Catálogos");
        jMenu2.setAlignmentX(0.8F);
        jMenu2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenu2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu2.setMargin(new java.awt.Insets(0, 300, 0, 300));
        jMenu2.setMaximumSize(new java.awt.Dimension(90, 70));
        jMenu2.setPreferredSize(new java.awt.Dimension(100, 100));

        MenuCatalogoEventos.setText("Eventos");
        MenuCatalogoEventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCatalogoEventosActionPerformed(evt);
            }
        });
        jMenu2.add(MenuCatalogoEventos);

        EditarCatalogoEventos.setText("   Editar o inactivar eventos");
        EditarCatalogoEventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarCatalogoEventosActionPerformed(evt);
            }
        });
        jMenu2.add(EditarCatalogoEventos);

        MenuCatalogoAsientos.setText("Asientos");
        MenuCatalogoAsientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCatalogoAsientosActionPerformed(evt);
            }
        });
        jMenu2.add(MenuCatalogoAsientos);

        EditarCatalogoAsientos.setText("   Editar o inactivar asientos");
        EditarCatalogoAsientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarCatalogoAsientosActionPerformed(evt);
            }
        });
        jMenu2.add(EditarCatalogoAsientos);

        jMenuBar1.add(jMenu2);

        jMenu3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenu3.setText("Ventas");
        jMenu3.setAlignmentX(0.8F);
        jMenu3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenu3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu3.setMargin(new java.awt.Insets(0, 300, 0, 300));
        jMenu3.setMaximumSize(new java.awt.Dimension(70, 70));

        MenuVentas.setText("Registrar Ventas");
        MenuVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuVentasActionPerformed(evt);
            }
        });
        jMenu3.add(MenuVentas);

        MenuConsultarVentas.setText("Consultar Ventas");
        MenuConsultarVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuConsultarVentasActionPerformed(evt);
            }
        });
        jMenu3.add(MenuConsultarVentas);

        jMenuBar1.add(jMenu3);

        jMenu4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenu4.setText("Cajas");
        jMenu4.setAlignmentX(0.8F);
        jMenu4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenu4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu4.setMargin(new java.awt.Insets(0, 300, 0, 300));
        jMenu4.setMaximumSize(new java.awt.Dimension(70, 70));

        MenuCajas.setText("Mostrar Listado");
        jMenu4.add(MenuCajas);

        jMenuBar1.add(jMenu4);

        jMenu5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenu5.setText("Salir");
        jMenu5.setAlignmentX(0.8F);
        jMenu5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenu5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu5.setMargin(new java.awt.Insets(0, 300, 0, 300));
        jMenu5.setMaximumSize(new java.awt.Dimension(70, 70));
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        jMenu6.setText("MULTIFIESTAS");
        jMenu6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jMenu6.setMaximumSize(new java.awt.Dimension(1000, 32767));
        jMenu6.setMinimumSize(new java.awt.Dimension(300, 29));
        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
         salir=JOptionPane.showConfirmDialog(null, "¿Seguro que desea salir?","Salir del sistema",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(salir==0){
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

    private void MenuRegistroUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuRegistroUsuariosActionPerformed
        // TODO add your handling code here:
        new RegistrarUsuarios().setVisible(true);
    }//GEN-LAST:event_MenuRegistroUsuariosActionPerformed

    private void MenuCatalogoEventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCatalogoEventosActionPerformed
        // TODO add your handling code here:
         new CatalogoEventos().setVisible(true);
    }//GEN-LAST:event_MenuCatalogoEventosActionPerformed

    private void MenuVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuVentasActionPerformed
        // TODO add your handling code here:
        new ModuloVentas().setVisible(true);
    }//GEN-LAST:event_MenuVentasActionPerformed

    private void MenuCatalogoAsientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCatalogoAsientosActionPerformed
        // TODO add your handling code here:
         new CatalogoAsientos().setVisible(true);
    }//GEN-LAST:event_MenuCatalogoAsientosActionPerformed

    private void MenuConsultarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuConsultarUsuariosActionPerformed
        // TODO add your handling code here:
      new ConsultarUsuarios().setVisible(true);
    }//GEN-LAST:event_MenuConsultarUsuariosActionPerformed

    private void EditarCatalogoEventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarCatalogoEventosActionPerformed
        // TODO add your handling code here:
        new EditarEventos().setVisible(true);
    }//GEN-LAST:event_EditarCatalogoEventosActionPerformed

    private void EditarCatalogoAsientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarCatalogoAsientosActionPerformed
        // TODO add your handling code here:
        new EditarAsientos().setVisible(true);
    }//GEN-LAST:event_EditarCatalogoAsientosActionPerformed

    private void MenuConsultarVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuConsultarVentasActionPerformed
        // TODO add your handling code here:
        new ConsultarVentas().setVisible(true);
    }//GEN-LAST:event_MenuConsultarVentasActionPerformed

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        // TODO add your handling code here:
         salir=JOptionPane.showConfirmDialog(null, "¿Seguro que desea salir?","Salir del sistema",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(salir==0){
            System.exit(0);
        }
    }//GEN-LAST:event_jMenu5MouseClicked

    private void jMenu1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1MouseMoved

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem EditarCatalogoAsientos;
    private javax.swing.JMenuItem EditarCatalogoEventos;
    private javax.swing.JMenuItem MenuCajas;
    private javax.swing.JMenuItem MenuCatalogoAsientos;
    private javax.swing.JMenuItem MenuCatalogoEventos;
    private javax.swing.JMenuItem MenuConsultarUsuarios;
    private javax.swing.JMenuItem MenuConsultarVentas;
    private javax.swing.JMenuItem MenuRegistroUsuarios;
    private javax.swing.JMenuItem MenuVentas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
