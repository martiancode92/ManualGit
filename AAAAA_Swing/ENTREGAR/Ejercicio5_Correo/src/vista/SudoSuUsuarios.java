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
public class SudoSuUsuarios extends javax.swing.JPanel {

    Empresa miEmpresa;
    Usuario usuarioValidado;

    public SudoSuUsuarios(Empresa e, Usuario u) {
        initComponents();
        miEmpresa = e;
        usuarioValidado = u;
        lblUsuario.setText(usuarioValidado.getLogin());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        btnCambiaar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        pwdPass = new javax.swing.JPasswordField();
        lblUsuario = new javax.swing.JLabel();

        jLabel1.setText("Login");

        jLabel2.setText("Cambiar_Contraseña");

        btnCambiaar.setText("Cambiar");
        btnCambiaar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiaarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lblUsuario.setFont(new java.awt.Font("Dialog", 2, 36)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 0, 51));
        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuario.setText("Admin");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(btnCambiaar)
                        .addGap(51, 51, 51)
                        .addComponent(btnCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(pwdPass)))))
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pwdPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCambiaar)
                    .addComponent(btnCancelar))
                .addGap(49, 49, 49))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCambiaarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiaarActionPerformed

        String login = txtLogin.getText();
        String pass = new String(pwdPass.getPassword());
        Usuario u = new Usuario(login);
        int pos = miEmpresa.getUsuarios().indexOf(u);

        if (!login.isEmpty()) {//para continuar pongo como condicion que no este vacio el campo
            if (pos != -1) {//pregunto por la posicion del login si no existiera devolveria -1

                if (!pass.isEmpty()) {//para continuar pongo como condicion que no este vacio el campo

                    miEmpresa.getUsuarios().get(pos).setPass(pass);
                    JOptionPane.showMessageDialog(this, "El cambio se realizo correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
                    limpiar();

                } else {

                    JOptionPane.showMessageDialog(this, "No has ingresado una contraseña", "Información", JOptionPane.ERROR_MESSAGE);
                     pwdPass.requestFocus();
                }

            } else {

                JOptionPane.showMessageDialog(this, "El Campo Login esta vacio", "Información", JOptionPane.ERROR_MESSAGE);
                 txtLogin.requestFocus();
            }

        } else {

            JOptionPane.showMessageDialog(this, "El Login ingresado no Consta en el Sistema","Información", JOptionPane.INFORMATION_MESSAGE);
            txtLogin.setText("");
            txtLogin.requestFocus();
        }
    }//GEN-LAST:event_btnCambiaarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
              limpiar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void limpiar() {

        txtLogin.setText("");
        pwdPass.setText("");

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCambiaar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField pwdPass;
    private javax.swing.JTextField txtLogin;
    // End of variables declaration//GEN-END:variables
}
