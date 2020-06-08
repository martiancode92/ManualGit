/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import modelo.Empresa;
import modelo.Usuario;

/**
 *
 * @author USUARIO
 */
public class PanelBaja extends javax.swing.JPanel {

 
    Empresa miEmpresa;
    DefaultTableModel modeloTabla;
    Usuario usuarioValidado;
    public PanelBaja(Empresa miEmpresa, Usuario usuarioValidado) {
        initComponents();
        
        this.miEmpresa=miEmpresa;
        this.usuarioValidado=usuarioValidado;
        modeloTabla= new DefaultTableModel();
        
        String [] titulo={"Login","Direccion @"};
        modeloTabla.setColumnIdentifiers(titulo);
        tblBajaUsuario.setModel(modeloTabla);
        cargarUsuarios();
    
    }
    
    public void cargarUsuarios(){

        for(int i=0; i< miEmpresa.getUsuarios().size();i++){
    
            Vector v= new Vector();
            v.add(miEmpresa.getUsuarios().get(i));
            v.add(miEmpresa.getUsuarios().get(i));
            
            modeloTabla.addRow(v);
 
    }
    
    }
    
    

 
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblBajaUsuario = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        tblBajaUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblBajaUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBajaUsuarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBajaUsuario);

        jLabel1.setFont(new java.awt.Font("Dialog", 2, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Baja de Usuarios");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblBajaUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBajaUsuarioMouseClicked
        
        int pos= tblBajaUsuario.rowAtPoint(evt.getPoint());
   
        Usuario objetivo = (Usuario) modeloTabla.getValueAt(pos, 0);
        
        int posObjetivo=miEmpresa.getUsuarios().indexOf(objetivo);
        
        if(posObjetivo !=-1){
            
       int eliminar=JOptionPane.showConfirmDialog(this,"Quieres eliminar al usuario","Informacion", 
               JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE );
                    
          if(eliminar==0){
              
              
              miEmpresa.getUsuarios().remove(posObjetivo);
              modeloTabla.removeRow(posObjetivo);
              
              JOptionPane.showMessageDialog(this, "Usuario eliminado correctamente");
          
          }
        
        }
        
    }//GEN-LAST:event_tblBajaUsuarioMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBajaUsuario;
    // End of variables declaration//GEN-END:variables
}
