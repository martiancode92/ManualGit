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
public class AlterPassEstandar extends javax.swing.JPanel {

    Empresa miEmpresa;
    Usuario usuarioValidado;

    public AlterPassEstandar(Empresa e, Usuario u) {
        initComponents();
        this.miEmpresa = e;
        this.usuarioValidado = u;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        pwdPassActual = new javax.swing.JPasswordField();
        pwdPass1 = new javax.swing.JPasswordField();
        pwdPass2 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnCambiar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        jLabel1.setText("Login");

        jLabel2.setText("Pass_Actual");

        jLabel3.setText("Nueva_Pass");

        jLabel4.setText("Repite_Pass");

        btnCambiar.setText("Cambiar");
        btnCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pwdPass1)
                            .addComponent(pwdPassActual)
                            .addComponent(pwdPass2)
                            .addComponent(txtLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(btnCambiar)
                        .addGap(53, 53, 53)
                        .addComponent(btnCancelar)))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtLogin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(pwdPassActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(pwdPass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(pwdPass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCambiar)
                            .addComponent(btnCancelar))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarActionPerformed
        String login = txtLogin.getText();
        String passActual = new String(pwdPassActual.getPassword());
        String vieja = passActual;
        String pass1 = new String(pwdPass1.getPassword());
        String pass2 = new String(pwdPass2.getPassword());

        int pos = miEmpresa.getUsuarios().indexOf(usuarioValidado);

        if (!login.isEmpty()) {
            if (login.equalsIgnoreCase(usuarioValidado.getLogin())) {
                if (usuarioValidado.getPass().equalsIgnoreCase(passActual)) {

                    if (!pass1.equals(vieja)) {

                        if (pass1.equals(pass2)) {
                            miEmpresa.getUsuarios().get(pos).setPass(pass2);
                            JOptionPane.showMessageDialog(this, "Se cambio la contraseña con exito", "Informacion", JOptionPane.INFORMATION_MESSAGE);
                            limpiar();
                            
                        } else {

                            JOptionPane.showMessageDialog(this, "Al realizar el cambio las contraseñas no coinciden", "Informacion", JOptionPane.ERROR_MESSAGE);
                            pwdPass1.setText("");
                            pwdPass2.setText("");
                            pwdPass1.requestFocus();
                        }

                    } else {

                        JOptionPane.showMessageDialog(this, "Por seguridad si quiere realizar un cambio efectivo, no ponga un contraseña que ya usó", "Informacion", JOptionPane.ERROR_MESSAGE);
                        pwdPass1.setText("");
                        pwdPass2.setText("");
                        pwdPass1.requestFocus();

                    }

                } else {

                    JOptionPane.showMessageDialog(this, "Contreseña Actual Incorrecta", "Informacion", JOptionPane.ERROR_MESSAGE);
                    pwdPassActual.setText("");
                    pwdPassActual.requestFocus();

                }

            } else {

                JOptionPane.showMessageDialog(this, "No puede cambiar la contraseña de otro usuario", "Informacion", JOptionPane.ERROR_MESSAGE);
                txtLogin.setText("");
                txtLogin.requestFocus();

            }

        } else {
            JOptionPane.showMessageDialog(this, "Campo Login: `Vacio´", "Informacion", JOptionPane.ERROR_MESSAGE);
            txtLogin.setText("");
            txtLogin.requestFocus();

        }

    }//GEN-LAST:event_btnCambiarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void limpiar() {
        txtLogin.setText("");
        pwdPassActual.setText("");
        pwdPass1.setText("");
        pwdPass2.setText("");

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCambiar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField pwdPass1;
    private javax.swing.JPasswordField pwdPass2;
    private javax.swing.JPasswordField pwdPassActual;
    private javax.swing.JTextField txtLogin;
    // End of variables declaration//GEN-END:variables
}
