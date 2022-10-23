
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

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
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuRegistroUsuarios = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        MenuCatalogoEventos = new javax.swing.JMenuItem();
        MenuCatalogoAsientos = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        MenuVentas = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        MenuCajas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jMenu1.setText("Usuarios");

        MenuRegistroUsuarios.setText("Registro");
        jMenu1.add(MenuRegistroUsuarios);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Catálogos");

        MenuCatalogoEventos.setText("Eventos");
        jMenu2.add(MenuCatalogoEventos);

        MenuCatalogoAsientos.setText("Asientos");
        jMenu2.add(MenuCatalogoAsientos);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Ventas");

        MenuVentas.setText("Registrar Ventas");
        jMenu3.add(MenuVentas);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Cajas");

        MenuCajas.setText("Mostrar Listado");
        jMenu4.add(MenuCajas);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
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
    private javax.swing.JMenuItem MenuCajas;
    private javax.swing.JMenuItem MenuCatalogoAsientos;
    private javax.swing.JMenuItem MenuCatalogoEventos;
    private javax.swing.JMenuItem MenuRegistroUsuarios;
    private javax.swing.JMenuItem MenuVentas;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}