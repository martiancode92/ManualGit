/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import modelo.Empresa;

/**
 *
 * @author ADMINMJ
 */
public class Estandard extends javax.swing.JFrame {
Empresa miEmpresa;

PanelConsulta pConsulta;
    /**
     * Creates new form Estandard
     */
    public Estandard(Empresa miEmpresa) {
        initComponents();
       this.miEmpresa=miEmpresa;
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
        mnuConsulta = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuDesconectar = new javax.swing.JMenuItem();
        mnuFin = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.FlowLayout());

        jMenu1.setText("Linea");

        mnuConsulta.setText("Consulta");
        mnuConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuConsultaActionPerformed(evt);
            }
        });
        jMenu1.add(mnuConsulta);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Fin");

        mnuDesconectar.setText("Desconectar");
        jMenu2.add(mnuDesconectar);

        mnuFin.setText("Fin Aplicacion");
        jMenu2.add(mnuFin);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuConsultaActionPerformed
        
        pConsulta = new PanelConsulta(miEmpresa);
        getContentPane().add(pConsulta);
        pack();
    }//GEN-LAST:event_mnuConsultaActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mnuConsulta;
    private javax.swing.JMenuItem mnuDesconectar;
    private javax.swing.JMenuItem mnuFin;
    // End of variables declaration//GEN-END:variables
}
