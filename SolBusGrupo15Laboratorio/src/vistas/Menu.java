package vistas;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(screenSize.width, screenSize.height);
        this.setLocation(0, 0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icono=new ImageIcon(getClass().getResource("/imagenes/sol-min.jpg"));
        Image image=icono.getImage();
        JDPEscritorio = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        jMenuBar1 = new javax.swing.JMenuBar();
        JMPasaje = new javax.swing.JMenu();
        JMCompraPasaje = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        JMCargarPasajero = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        JMCargarColectiov = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        JMCargarHorario = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        JMCargarRuta = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout JDPEscritorioLayout = new javax.swing.GroupLayout(JDPEscritorio);
        JDPEscritorio.setLayout(JDPEscritorioLayout);
        JDPEscritorioLayout.setHorizontalGroup(
            JDPEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        JDPEscritorioLayout.setVerticalGroup(
            JDPEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        JMPasaje.setText("Pasaje");

        JMCompraPasaje.setText("Comprar Pasaje");
        JMCompraPasaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMCompraPasajeActionPerformed(evt);
            }
        });
        JMPasaje.add(JMCompraPasaje);

        jMenuBar1.add(JMPasaje);

        jMenu2.setText("Pasajero");

        JMCargarPasajero.setText("Cargar Pasajero");
        JMCargarPasajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMCargarPasajeroActionPerformed(evt);
            }
        });
        jMenu2.add(JMCargarPasajero);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Colectivo");

        JMCargarColectiov.setText("Cargar Colectivo");
        JMCargarColectiov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMCargarColectiovActionPerformed(evt);
            }
        });
        jMenu3.add(JMCargarColectiov);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Horario");

        JMCargarHorario.setText("Cargar Horario");
        JMCargarHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMCargarHorarioActionPerformed(evt);
            }
        });
        jMenu4.add(JMCargarHorario);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Ruta");

        JMCargarRuta.setText("Cargar Ruta");
        JMCargarRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMCargarRutaActionPerformed(evt);
            }
        });
        jMenu5.add(JMCargarRuta);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Salir");
        jMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu6MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JDPEscritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JDPEscritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JMCompraPasajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMCompraPasajeActionPerformed
        JDPEscritorio.removeAll();
        JDPEscritorio.repaint();
        CompraPasaje compraPasaje = new CompraPasaje();
        compraPasaje.setVisible(true);
        JDPEscritorio.add(compraPasaje);
        JDPEscritorio.moveToFront(compraPasaje);
        Dimension tamañoEscritorio = JDPEscritorio.getSize();
        Dimension tamañoFormulario = compraPasaje.getSize();
        int x = (tamañoEscritorio.width - tamañoFormulario.width) / 2;
        int y = (tamañoEscritorio.height - tamañoFormulario.height) / 2;
        compraPasaje.setLocation(x, y);
    }//GEN-LAST:event_JMCompraPasajeActionPerformed

    private void JMCargarPasajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMCargarPasajeroActionPerformed
        JDPEscritorio.removeAll();
        JDPEscritorio.repaint();
        GestionPasajero GPasajero = new GestionPasajero();
        GPasajero.setVisible(true);
        JDPEscritorio.add(GPasajero);
        JDPEscritorio.moveToFront(GPasajero);
        Dimension tamañoEscritorio = JDPEscritorio.getSize();
        Dimension tamañoFormulario = GPasajero.getSize();
        int x = (tamañoEscritorio.width - tamañoFormulario.width) / 2;
        int y = (tamañoEscritorio.height - tamañoFormulario.height) / 2;
        GPasajero.setLocation(x, y);
    }//GEN-LAST:event_JMCargarPasajeroActionPerformed

    private void JMCargarColectiovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMCargarColectiovActionPerformed
        JDPEscritorio.removeAll();
        JDPEscritorio.repaint();
        GestionColectivo GColectivo = new GestionColectivo();
        GColectivo.setVisible(true);
        JDPEscritorio.add(GColectivo);
        JDPEscritorio.moveToFront(GColectivo);
        Dimension tamañoEscritorio = JDPEscritorio.getSize();
        Dimension tamañoFormulario = GColectivo.getSize();
        int x = (tamañoEscritorio.width - tamañoFormulario.width) / 2;
        int y = (tamañoEscritorio.height - tamañoFormulario.height) / 2;
        GColectivo.setLocation(x, y);
    }//GEN-LAST:event_JMCargarColectiovActionPerformed

    private void JMCargarHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMCargarHorarioActionPerformed
        JDPEscritorio.removeAll();
        JDPEscritorio.repaint();
        GestionHorario GHorario = new GestionHorario();
        GHorario.setVisible(true);
        JDPEscritorio.add(GHorario);
        JDPEscritorio.moveToFront(GHorario);
        Dimension tamañoEscritorio = JDPEscritorio.getSize();
        Dimension tamañoFormulario = GHorario.getSize();
        int x = (tamañoEscritorio.width - tamañoFormulario.width) / 2;
        int y = (tamañoEscritorio.height - tamañoFormulario.height) / 2;
        GHorario.setLocation(x, y);
    }//GEN-LAST:event_JMCargarHorarioActionPerformed

    private void JMCargarRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMCargarRutaActionPerformed
        JDPEscritorio.removeAll();
        JDPEscritorio.repaint();
        GestionRuta GRuta = new GestionRuta();
        GRuta.setVisible(true);
        JDPEscritorio.add(GRuta);
        JDPEscritorio.moveToFront(GRuta);
        Dimension tamañoEscritorio = JDPEscritorio.getSize();
        Dimension tamañoFormulario = GRuta.getSize();
        int x = (tamañoEscritorio.width - tamañoFormulario.width) / 2;
        int y = (tamañoEscritorio.height - tamañoFormulario.height) / 2;
        GRuta.setLocation(x, y);
    }//GEN-LAST:event_JMCargarRutaActionPerformed

    private void jMenu6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MouseClicked
        dispose();
    }//GEN-LAST:event_jMenu6MouseClicked

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane JDPEscritorio;
    private javax.swing.JMenuItem JMCargarColectiov;
    private javax.swing.JMenuItem JMCargarHorario;
    private javax.swing.JMenuItem JMCargarPasajero;
    private javax.swing.JMenuItem JMCargarRuta;
    private javax.swing.JMenuItem JMCompraPasaje;
    private javax.swing.JMenu JMPasaje;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
