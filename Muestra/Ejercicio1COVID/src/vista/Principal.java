package vista;

import javax.swing.JOptionPane;
import modelo.Biblioteca;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ADMINMJ
 */
public class Principal extends javax.swing.JFrame {

    Biblioteca miBiblio;
// Nos tenemos que definir tantas propiedades como paneles distintos vamos a utilizar
    PanelAlta pAlta;
    PanelPrestamo pPrestamo;
    PanelConsulta pConsulta;

    /**
     * Creates new form Principal
     */
    public Principal() {
        miBiblio = new Biblioteca();
        initComponents();
        this.setSize(800, 600);// tamaño de la ventana
        this.setResizable(false);// bloquear para que la ventana no se pueda
        // redimensionar.
        crearLibros();

    }

    private void crearLibros() {
        miBiblio.nuevoLibro("1234", "Programación1", "Pepe Martínez", "Vicens-vives");
        miBiblio.nuevoLibro("1234", "Entornos de Desarrollo", "María Pardo", "Edelvives");
        miBiblio.nuevoLibro("1234", "Lenguaje de Marcas", "Fernando Alcarrz", "SM");
        miBiblio.nuevoLibro("1234", "Sistemas Informáticos", "Paco Ureña", "Paraninfo");
        miBiblio.nuevoLibro("1234", "Bases de Datos", "Guillermo Delgado", "Mc-Graw HIll");
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
        mnuAlta = new javax.swing.JMenuItem();
        mnuPrestamo = new javax.swing.JMenuItem();
        mnuConsulta = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Gestión de Alquileres");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new java.awt.FlowLayout());

        jMenu1.setText("Operaciones");

        mnuAlta.setText("Alta Usuarios");
        mnuAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAltaActionPerformed(evt);
            }
        });
        jMenu1.add(mnuAlta);

        mnuPrestamo.setText("Préstamo de Libros");
        mnuPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPrestamoActionPerformed(evt);
            }
        });
        jMenu1.add(mnuPrestamo);

        mnuConsulta.setText("Consulta de Prestamos/Usuario");
        mnuConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuConsultaActionPerformed(evt);
            }
        });
        jMenu1.add(mnuConsulta);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        String[] botones = {"Cerrar", "Cancelar"};
        int eleccion;
        eleccion = JOptionPane.showOptionDialog(this, " ¿ Realmente desea salir", "Cerrar Aplicacion",
                 0, 0, null, botones, this);
        if (eleccion == JOptionPane.YES_OPTION) {
            dispose();
            System.exit(0);

        } else {
            JOptionPane.showMessageDialog(this, " Proceso de cierre cancelado", "Cerrar Aplicación", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_formWindowClosing

    private void mnuAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAltaActionPerformed
        // El usuario ha seleccionado la opción de alta
        //primero eliminamos el panel que se este mostrando
        eliminarPaneles();
        // A continuación instanciamos el panel que queremos mostrar
        pAlta = new PanelAlta(miBiblio);
        // y por ultimo se lo agregamos a nuestra ventana
        getContentPane().add(pAlta);
        pack();
    }//GEN-LAST:event_mnuAltaActionPerformed

    private void mnuPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPrestamoActionPerformed
        eliminarPaneles();
        // A continuación instanciamos el panel que queremos mostrar
        pPrestamo = new PanelPrestamo(miBiblio);
        // y por ultimo se lo agregamos a nuestra ventana
        getContentPane().add(pPrestamo);
        pack();
    }//GEN-LAST:event_mnuPrestamoActionPerformed

    private void mnuConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuConsultaActionPerformed
        // TODO add your handling code here:
        eliminarPaneles();
        // A continuación instanciamos el panel que queremos mostrar
        pConsulta = new PanelConsulta(miBiblio);
        // y por ultimo se lo agregamos a nuestra ventana
        getContentPane().add(pConsulta);
        pack();
    }//GEN-LAST:event_mnuConsultaActionPerformed

    /**
     * Método para eliminar los paneles
     */
    private void eliminarPaneles() {
        try {
            this.remove(pAlta);
        } catch (Exception ex) {
        }
        try {
            this.remove(pPrestamo);
        } catch (Exception ex) {
        }
        try {
            this.remove(pConsulta);
        } catch (Exception ex) {
        }
    }

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mnuAlta;
    private javax.swing.JMenuItem mnuConsulta;
    private javax.swing.JMenuItem mnuPrestamo;
    // End of variables declaration//GEN-END:variables
}
