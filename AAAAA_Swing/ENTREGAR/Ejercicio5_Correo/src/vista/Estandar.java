/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JOptionPane;
import modelo.Empresa;
import modelo.Usuario;

/**
 *
 * @author USUARIO
 */
public class Estandar extends javax.swing.JFrame {

 Empresa miEmpresa;
 Usuario usuarioValidado;
 PanelEnviar pEnviar;
 PanelEntrada pEntrada;
 AlterPassEstandar alterEstandar;

    Estandar(Empresa miEmpresa, Usuario usuarioEstandar) {
        initComponents();
        this.miEmpresa= miEmpresa;
        usuarioValidado=usuarioEstandar;
        this.setSize(400, 300);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuPerfil = new javax.swing.JMenu();
        mnuCambiarPass = new javax.swing.JMenuItem();
        mnuMensaje = new javax.swing.JMenu();
        mnuEnviarMensaje = new javax.swing.JMenuItem();
        mnuBandeja = new javax.swing.JMenuItem();
        mnuSali = new javax.swing.JMenu();
        mnuDesconectar = new javax.swing.JMenuItem();
        mnuFinAplicacion = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new java.awt.FlowLayout());

        mnuPerfil.setText("Perfil");

        mnuCambiarPass.setText("Cambiar_Contraseña");
        mnuCambiarPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCambiarPassActionPerformed(evt);
            }
        });
        mnuPerfil.add(mnuCambiarPass);

        jMenuBar1.add(mnuPerfil);

        mnuMensaje.setText("Mensaje");

        mnuEnviarMensaje.setText("Enviar_Mensaje");
        mnuEnviarMensaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuEnviarMensajeActionPerformed(evt);
            }
        });
        mnuMensaje.add(mnuEnviarMensaje);

        mnuBandeja.setText("Bandeja_de_Entrada");
        mnuBandeja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuBandejaActionPerformed(evt);
            }
        });
        mnuMensaje.add(mnuBandeja);

        jMenuBar1.add(mnuMensaje);

        mnuSali.setText("Salir");

        mnuDesconectar.setText("Desconectar");
        mnuDesconectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuDesconectarActionPerformed(evt);
            }
        });
        mnuSali.add(mnuDesconectar);

        mnuFinAplicacion.setText("Fin_de_Aplicacion");
        mnuFinAplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFinAplicacionActionPerformed(evt);
            }
        });
        mnuSali.add(mnuFinAplicacion);

        jMenuBar1.add(mnuSali);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
            int eleccion;
            
            eleccion= JOptionPane.showConfirmDialog(this,"¿Desea cerrar la vebtana?",
                    "Cerrar Ventana",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            
            if(eleccion== JOptionPane.YES_OPTION){
            
                dispose();
                System.exit(0);
            }
    }//GEN-LAST:event_formWindowClosing

    private void mnuEnviarMensajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuEnviarMensajeActionPerformed
          eliminarPaneles();
        pEnviar= new PanelEnviar(miEmpresa, usuarioValidado);
        getContentPane().add(pEnviar);
        pack();
    }//GEN-LAST:event_mnuEnviarMensajeActionPerformed

    private void mnuBandejaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuBandejaActionPerformed
          eliminarPaneles();
        pEntrada= new PanelEntrada(miEmpresa, usuarioValidado);
        getContentPane().add(pEntrada);
        pack();
    }//GEN-LAST:event_mnuBandejaActionPerformed

    private void mnuFinAplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFinAplicacionActionPerformed
        
            int eleccion;
            
            eleccion= JOptionPane.showConfirmDialog(this,"¿Desea cerrar la vebtana?",
                    "Cerrar Ventana",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            
            if(eleccion== JOptionPane.YES_OPTION){
            
                dispose();
                System.exit(0);
            }
    }//GEN-LAST:event_mnuFinAplicacionActionPerformed

    private void mnuDesconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDesconectarActionPerformed
            eliminarPaneles();
        
        new Validacion(miEmpresa).setVisible(true);
            dispose();
            pack();
    }//GEN-LAST:event_mnuDesconectarActionPerformed

    private void mnuCambiarPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCambiarPassActionPerformed
    
        eliminarPaneles();
        alterEstandar= new AlterPassEstandar(miEmpresa,usuarioValidado);
        getContentPane().add(alterEstandar);
        pack();
    }//GEN-LAST:event_mnuCambiarPassActionPerformed

      private void eliminarPaneles(){
        try{
            getContentPane().remove(alterEstandar);
        }catch(Exception ex){}
        
      
        try{
         getContentPane().remove(pEnviar);
        }catch(Exception ex){}
        
        try{
         getContentPane().remove(pEntrada);
        }catch(Exception ex){}
    
      }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem mnuBandeja;
    private javax.swing.JMenuItem mnuCambiarPass;
    private javax.swing.JMenuItem mnuDesconectar;
    private javax.swing.JMenuItem mnuEnviarMensaje;
    private javax.swing.JMenuItem mnuFinAplicacion;
    private javax.swing.JMenu mnuMensaje;
    private javax.swing.JMenu mnuPerfil;
    private javax.swing.JMenu mnuSali;
    // End of variables declaration//GEN-END:variables
}