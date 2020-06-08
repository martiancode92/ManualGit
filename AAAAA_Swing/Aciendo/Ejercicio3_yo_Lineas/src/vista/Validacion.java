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
public class Validacion extends javax.swing.JFrame {

    
    Empresa miEmpresa;
    
    public Validacion() {
        initComponents();
        miEmpresa = new Empresa();
        crearUsuario();
        crearParadas();
        
        this.setLocationRelativeTo(null);
         
        
        
    }
    
    public Validacion(Empresa miEmpresa){
    
    initComponents();
    this.miEmpresa=miEmpresa;
    
    
    }
    
    public void crearUsuario(){
    
    miEmpresa.nuevoUsuario("admin","admin",true);
    miEmpresa.nuevoUsuario("usuario","usuario",false);
    
    
    }
    
    public void crearParadas(){
    
        miEmpresa.nuevaParada(1, "LocoPlaya");
        miEmpresa.nuevaParada(2,"FuentesBlancas");
        miEmpresa.nuevaParada(5,"ctra.Arcos");
        miEmpresa.nuevaParada(10, "Bro.Gimeno");
        
        miEmpresa.nuevaParada(3, "fco sarmiento 12");
        miEmpresa.nuevaParada(22, "avda vega 33");
        miEmpresa.nuevaParada(4, "condesa mencia 112");
        miEmpresa.nuevaParada(6, "plaza mayor 1");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        pwdContra = new javax.swing.JPasswordField();
        btnValidar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("CONTROL_DE_ACCESO");

        jLabel2.setText("LOGIN");

        jLabel3.setText("CONTRASEÑA");

        btnValidar.setText("VALIDAR");
        btnValidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidarActionPerformed(evt);
            }
        });

        btnCancelar.setText("CANCELAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtLogin)
                            .addComponent(pwdContra, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE))
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnValidar)
                            .addComponent(btnCancelar))))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnValidar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(pwdContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btnCancelar)))
                .addContainerGap(134, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidarActionPerformed
        
        String login= txtLogin.getText();
        String pass=new String(pwdContra.getPassword());
        
        Usuario u = new Usuario(login);
        
        int pos= miEmpresa.getUsuarios().indexOf(u);
        
        if(pos==-1){
        
            JOptionPane.showMessageDialog(this, " usuario inexistente", "error", JOptionPane.ERROR_MESSAGE);
            
            txtLogin.requestFocus();
            txtLogin.setSelectionStart(0);
            txtLogin.setSelectionEnd(login.length());
        
        }else{
        
         u = miEmpresa.getUsuarios().get(pos);
         
         if(u.getPass().equalsIgnoreCase(pass)){
         
             if(u.isTipo()){
             
                 new Administrador(miEmpresa).setVisible(true);
             
             }else{
             
             
                 new Estandar(miEmpresa).setVisible(true);
             
             }
             dispose();
             pack();
         
         
         }else{
      
             JOptionPane.showMessageDialog(this, " contraseña erronea", "error", JOptionPane.ERROR_MESSAGE);
             
             pwdContra.requestFocus();
             pwdContra.setSelectionStart(0);
             pwdContra.setSelectionEnd(pass.length());
         
         }
        
        }
        
        
    }//GEN-LAST:event_btnValidarActionPerformed

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
            java.util.logging.Logger.getLogger(Validacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Validacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Validacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Validacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Validacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnValidar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField pwdContra;
    private javax.swing.JTextField txtLogin;
    // End of variables declaration//GEN-END:variables
}
