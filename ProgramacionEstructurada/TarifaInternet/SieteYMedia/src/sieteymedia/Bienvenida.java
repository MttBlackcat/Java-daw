/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sieteymedia;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dav
 */
public class Bienvenida extends javax.swing.JFrame {

    int auxiliar;
    boolean encender = false;
    Hilo ejecutar = new Hilo();
    /**
     * Creates new form Bienvenida
     */
    public Bienvenida() {
        auxiliar = 0;
        initComponents();
        Bienvenida.this.getRootPane().setOpaque(false);
        Bienvenida.this.getContentPane().setBackground(new Color (0,0,0,0));
        Bienvenida.this.setBackground(new Color (0,0,0,0));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barra = new javax.swing.JProgressBar();
        salida = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barra.setMaximum(49);
        barra.setStringPainted(true);
        getContentPane().add(barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 200, -1));

        salida.setBackground(new java.awt.Color(251, 247, 243));
        salida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(salida, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 260, 20));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin nombre.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        if(encender==false)
        {
            encender = true;
            ejecutar.start();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bienvenida().setVisible(true);
            }
        });
    }
    private class Hilo extends Thread
    {
    @Override
    public void run()
            {
        try {
            while(true)
            {
                switch(auxiliar)
                {
                    case 0: 
                        salida.setText("Cargando...");
                        break;
                    case 50:
                        salida.setText("Iniciando");
                        VentanaPrincipal vp = new VentanaPrincipal();
                        vp.setVisible(true);
                        vp.setLocationRelativeTo(null);
                        Bienvenida.this.dispose();
                        break;
                }
                auxiliar++;
                barra.setValue(auxiliar);
                //repaint();
                //System.out.println("Hola");
            Thread.sleep(100);}
        } catch (InterruptedException ex) {
            Logger.getLogger(Bienvenida.class.getName()).log(Level.SEVERE, null, ex);
        }
            }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barra;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel salida;
    // End of variables declaration//GEN-END:variables
}