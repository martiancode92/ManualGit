/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import modelo.Empresa;
import modelo.Usuario;

/**
 *
 * @author ADMINMJ
 */
public class Principal extends javax.swing.JFrame {
Empresa miEmpresa;
PanelAlta palta;
PanelConsulta pConsulta;
Usuario usuarioValidado;
    /**
     * Creates new form Principal
     */
    public Principal(Empresa miEmpresa, Usuario usuario) {
        initComponents();
        this.miEmpresa=miEmpresa;
        usuarioValidado=usuario;
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
        mnuConsulta = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuDesconectar = new javax.swing.JMenuItem();
        mnuSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.FlowLayout());

        jMenu1.setText("Operaciones");

        mnuAlta.setText("Alta de Noticias");
        mnuAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAltaActionPerformed(evt);
            }
        });
        jMenu1.add(mnuAlta);

        mnuConsulta.setText("Consulta de Noticias");
        mnuConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuConsultaActionPerformed(evt);
            }
        });
        jMenu1.add(mnuConsulta);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Salir");

        mnuDesconectar.setText("Desconectar");
        mnuDesconectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuDesconectarActionPerformed(evt);
            }
        });
        jMenu2.add(mnuDesconectar);

        mnuSalir.setText("SalirAplicación");
        mnuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSalirActionPerformed(evt);
            }
        });
        jMenu2.add(mnuSalir);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSalirActionPerformed
        System.exit(0);
        dispose();
        
    }//GEN-LAST:event_mnuSalirActionPerformed

    private void mnuDesconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDesconectarActionPerformed
      // Instancio una nueva ventana de validación
        new validacion(miEmpresa).setVisible(true);
        dispose();
        pack();
    }//GEN-LAST:event_mnuDesconectarActionPerformed

    private void mnuAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAltaActionPerformed
       // borramos el panel que se se estre mostnado
        eliminarPaneles();
        // Instanciamos un objeto de tipo panel y le pasamos la información que necesite
        palta=new PanelAlta(miEmpresa,usuarioValidado);
        // Obtenemos el panel actual y le añadimos el que acabamos
        // instanciar
        getContentPane().add(palta);
        pack();
        
    }//GEN-LAST:event_mnuAltaActionPerformed

    private void mnuConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuConsultaActionPerformed
     eliminarPaneles();
        pConsulta=new PanelConsulta(miEmpresa,usuarioValidado);
       getContentPane().add(pConsulta);
       pack();
    }//GEN-LAST:event_mnuConsultaActionPerformed

  private void eliminarPaneles()
  {
      try{
          remove(palta);
      }catch(Exception ex){}
       try{
          remove(pConsulta);
      }catch(Exception ex){} 
  }
       

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mnuAlta;
    private javax.swing.JMenuItem mnuConsulta;
    private javax.swing.JMenuItem mnuDesconectar;
    private javax.swing.JMenuItem mnuSalir;
    // End of variables declaration//GEN-END:variables
}
