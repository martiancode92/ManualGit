/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Dimension;
import java.awt.Event;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import static java.awt.event.KeyEvent.VK_ENTER;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import modelo.Empresa;
import modelo.Usuario;

/**
 *
 * @author USUARIO
 */
public class PanelAlta extends javax.swing.JPanel {

    Usuario usuarioValidado;
    Empresa miEmpresa;

    public PanelAlta(Empresa miEmpresa, Usuario usuarioValidado) {
        initComponents();

        this.miEmpresa = miEmpresa;
        this.usuarioValidado = usuarioValidado;
        

      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupAdmin = new javax.swing.ButtonGroup();
        txtLogin = new javax.swing.JTextField();
        rbtnNo = new javax.swing.JRadioButton();
        rbtnSi = new javax.swing.JRadioButton();
        pwdPass1 = new javax.swing.JPasswordField();
        pwdPass2 = new javax.swing.JPasswordField();
        txtDireccion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnCandelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        txtLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLoginKeyPressed(evt);
            }
        });

        btnGroupAdmin.add(rbtnNo);
        rbtnNo.setText("NO");
        rbtnNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rbtnNoKeyPressed(evt);
            }
        });

        btnGroupAdmin.add(rbtnSi);
        rbtnSi.setText("SI");
        rbtnSi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rbtnSiKeyPressed(evt);
            }
        });

        pwdPass1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pwdPass1KeyPressed(evt);
            }
        });

        pwdPass2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pwdPass2KeyPressed(evt);
            }
        });

        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDireccionKeyPressed(evt);
            }
        });

        jLabel6.setText("Direccion_@");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        btnGuardar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnGuardarKeyPressed(evt);
            }
        });

        btnCandelar.setText("Cancelar");
        btnCandelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCandelarActionPerformed(evt);
            }
        });

        jLabel2.setText("Login");

        jLabel3.setText("Contaseña");

        jLabel5.setText("Administrador");

        jLabel4.setText("Repite_Contraseña");

        jLabel1.setFont(new java.awt.Font("Arial", 2, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Alta Usuario");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(64, 64, 64)
                                .addComponent(rbtnSi)
                                .addGap(77, 77, 77)
                                .addComponent(rbtnNo))
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(146, 146, 146)
                                        .addComponent(jLabel1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(62, 62, 62)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(pwdPass1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(26, 26, 26)
                                                .addComponent(jLabel4)
                                                .addGap(18, 18, 18)
                                                .addComponent(pwdPass2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtLogin)
                                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(btnGuardar)
                        .addGap(78, 78, 78)
                        .addComponent(btnCandelar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(pwdPass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(pwdPass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rbtnSi)
                    .addComponent(rbtnNo))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnCandelar))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        String login = txtLogin.getText();
        String pass1 = new String(pwdPass1.getPassword());
        String pass2 = new String(pwdPass2.getPassword());
        boolean tipo = false;
        int posUsuario;
        int posCorreo;
        boolean selected = false;

        String direccion = txtDireccion.getText();

        if (!login.equals("")) {// si el login no esta vacio continua
            if (!pass1.equals("")) {// si la contraseña no esta vacia continua

                //creo el usuario y le paso un login al constructor de su clase
                // este usuario buscara en el ArrayList si hay alguno que contenga ese usuario
                Usuario nuevo = new Usuario(login);

                //en una variable guardo la posicion que me devuelve el array
                //será -1 si no exixte
                posUsuario = miEmpresa.getUsuarios().indexOf(nuevo);
                // si no existe ese usuario continua con los demas if´s anidados
                if (posUsuario == -1) {

                    //compruebo que los campos son iguales para asegurarme de que el usuario
                    // metio bien la contraseña
                    if (pass1.equalsIgnoreCase(pass2)) {

                        //obligo al Usuario a que me seleccion un tipo de Perfil
                        if (!selected && rbtnSi.isSelected() || rbtnNo.isSelected() ) {


                                if (rbtnSi.isSelected()) {// el usuario sera admin

                                    tipo = true;

                                } else if (rbtnNo.isSelected()) {//el usuari sera estandar

                                    tipo = false;

                                }

                                selected = true;

                            
                            if (!direccion.isEmpty()) {

                                // le paso la direccion del nuevo usuario, si no existe devolvera -1
                                // y la guardo en esa variable
                                posCorreo = miEmpresa.buscarCorreo(direccion);

                                // si no existe añado el usuario
                                if (posCorreo == -1) {

                                    miEmpresa.nuevoUsuario(login, pass2, tipo, direccion);

                                    if (tipo == false) {// es complementario para sacar un mensaje del tipo agregado

                                        JOptionPane.showMessageDialog(this, "Añadio un usuario Estandar", "Informacion!", JOptionPane.INFORMATION_MESSAGE);
                                        limpiar();
                                    } else if (tipo == true) {

                                        JOptionPane.showMessageDialog(this, "Añadio un usuario Administrador", "Informacion!", JOptionPane.INFORMATION_MESSAGE);
                                        limpiar();
                                    }

                                } else {

                                    JOptionPane.showMessageDialog(this, "Ese Correo ya existe", "Informacion!", JOptionPane.ERROR_MESSAGE);
                                    txtDireccion.setText("");
                                    txtDireccion.requestFocus();
                                }

                            } else {

                                JOptionPane.showMessageDialog(this, "La Direccion de correo esta vacia", "Informacion!", JOptionPane.ERROR_MESSAGE);
                                txtDireccion.requestFocus();

                            }

                        } else {

                            JOptionPane.showMessageDialog(this, "Debe seleccionar un tipo de Usuario", "Informacion!", JOptionPane.ERROR_MESSAGE);
                            rbtnNo.requestFocus();

                        }

                    } else {

                        JOptionPane.showMessageDialog(this, "Las contraseñas no coinciden", "Informacion!", JOptionPane.ERROR_MESSAGE);
                        pwdPass1.setText("");
                        pwdPass2.setText("");
                        pwdPass1.requestFocus();
                    }

                } else {

                    JOptionPane.showMessageDialog(this, "El usuario ya exsiste", "Informacion!", JOptionPane.ERROR_MESSAGE);
                    txtLogin.setText("");
                    txtLogin.requestFocus();

                }

            }

        } else {

            JOptionPane.showMessageDialog(this, "El Campo Login esta vacio");
            txtLogin.requestFocus();
        }


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCandelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCandelarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnCandelarActionPerformed

    private void btnGuardarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnGuardarKeyPressed

        // metodo keyEvent si pulso enter sobr btnGuardar
        if (evt.getKeyCode() == VK_ENTER) {
            
            
        String login = txtLogin.getText();
        String pass1 = new String(pwdPass1.getPassword());
        String pass2 = new String(pwdPass2.getPassword());
        boolean tipo = false;
        int posUsuario;
        int posCorreo;
        boolean selected = false;

        String direccion = txtDireccion.getText();

        if (!login.equals("")) {// si el login no esta vacio
            if (!pass1.equals("")) {// si la contraseña no esta vacia continua

                //creo el usuario y le paso un login al constructor de su clase
                // este usuario buscara en el ArrayList si hay alguno que contenga ese usuario
                Usuario nuevo = new Usuario(login);

                //en una variable guardo la posicion que me devuelve el array
                //será -1 si no exixte
                posUsuario = miEmpresa.getUsuarios().indexOf(nuevo);
                // si no existe ese usuario continua con los demas if´s anidados
                if (posUsuario == -1) {

                    //compruebo que los campos son iguales para asegurarme de que el usuario
                    // metio bien la contraseña
                    if (pass1.equalsIgnoreCase(pass2)) {

                        //obligo al Usuario a que me seleccion un tipo de Perfil
                        if (!selected && rbtnSi.isSelected() || rbtnNo.isSelected() ) {


                                if (rbtnSi.isSelected()) {// el usuario sera admin

                                    tipo = true;

                                } else if (rbtnNo.isSelected()) {//el usuari sera estandar

                                    tipo = false;

                                }

                                selected = true;

                            
                            if (!direccion.isEmpty()) {

                                // le paso la direccion del nuevo usuario, si no existe devolvera -1
                                // y la guardo en esa variable
                                posCorreo = miEmpresa.buscarCorreo(direccion);

                                // si no existe añado el usuario
                                if (posCorreo == -1) {

                                    miEmpresa.nuevoUsuario(login, pass2, tipo, direccion);

                                    if (tipo == false) {// es complementario para sacar un mensaje del tipo agregado

                                        JOptionPane.showMessageDialog(this, "Añadio un usuario Estandar", "Informacion!", JOptionPane.INFORMATION_MESSAGE);
                                        limpiar();
                                    } else if (tipo == true) {

                                        JOptionPane.showMessageDialog(this, "Añadio un usuario Administrador", "Informacion!", JOptionPane.INFORMATION_MESSAGE);
                                        limpiar();
                                    }

                                } else {

                                    JOptionPane.showMessageDialog(this, "Ese Correo ya existe", "Informacion!", JOptionPane.ERROR_MESSAGE);
                                    txtDireccion.setText("");
                                    txtDireccion.requestFocus();
                                }

                            } else {

                                JOptionPane.showMessageDialog(this, "La Direccion de correo esta vacia", "Informacion!", JOptionPane.ERROR_MESSAGE);
                                txtDireccion.requestFocus();

                            }

                        } else {

                            JOptionPane.showMessageDialog(this, "Debe seleccionar un tipo de Usuario", "Informacion!", JOptionPane.ERROR_MESSAGE);
                            rbtnNo.requestFocus();

                        }

                    } else {

                        JOptionPane.showMessageDialog(this, "Las contraseñas no coinciden", "Informacion!", JOptionPane.ERROR_MESSAGE);
                        pwdPass1.setText("");
                        pwdPass2.setText("");
                        pwdPass1.requestFocus();
                    }

                } else {

                    JOptionPane.showMessageDialog(this, "El usuario ya exsiste", "Informacion!", JOptionPane.ERROR_MESSAGE);
                    txtLogin.setText("");
                    txtLogin.requestFocus();

                }

            }

        } else {

            JOptionPane.showMessageDialog(this, "El Campo Login esta vacio");
            txtLogin.requestFocus();
        }


            
            
        }


    }//GEN-LAST:event_btnGuardarKeyPressed

    private void txtLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLoginKeyPressed

        switch (evt.getKeyCode()) {

            case KeyEvent.VK_ENTER:
                pwdPass1.requestFocus();
                break;
            case KeyEvent.VK_DELETE:
                txtLogin.setText("");
                break;

        }
    }//GEN-LAST:event_txtLoginKeyPressed

  
    
    private void pwdPass2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwdPass2KeyPressed

        switch (evt.getKeyCode()) {

            case KeyEvent.VK_F1:
                rbtnSi.requestFocus();

                break;

            case KeyEvent.VK_F2:
                rbtnNo.requestFocus();

                break;

            case KeyEvent.VK_DELETE:
                pwdPass2.setText("");
                break;

        }

    }//GEN-LAST:event_pwdPass2KeyPressed

    private void txtDireccionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyPressed

        switch (evt.getKeyCode()) {

            case KeyEvent.VK_ENTER:
                btnGuardar.requestFocus();
                break;

            case KeyEvent.VK_DELETE:
                pwdPass2.setText("");
                break;
        }


    }//GEN-LAST:event_txtDireccionKeyPressed

    private void rbtnSiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rbtnSiKeyPressed

        switch (evt.getKeyCode()) {

            case KeyEvent.VK_ESCAPE:
                rbtnSi.isSelected();//
                break;

            case KeyEvent.VK_ENTER:
                txtDireccion.requestFocus();
                break;
        }

    }//GEN-LAST:event_rbtnSiKeyPressed

    private void rbtnNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rbtnNoKeyPressed

        switch (evt.getKeyCode()) {

            case KeyEvent.VK_ESCAPE:
                rbtnNo.isSelected();
                break;
            case KeyEvent.VK_ENTER:
                txtDireccion.requestFocus();
                break;
        }
    }//GEN-LAST:event_rbtnNoKeyPressed

    private void pwdPass1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwdPass1KeyPressed

        switch (evt.getKeyCode()) {

            case KeyEvent.VK_ENTER:
            pwdPass2.requestFocus();
            break;
            case KeyEvent.VK_DELETE:
            pwdPass1.setText("");
            break;
        }
    }//GEN-LAST:event_pwdPass1KeyPressed

    

    public void limpiar() {

        txtLogin.setText("");
        pwdPass1.setText("");
        pwdPass2.setText("");
        txtDireccion.setText("");

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCandelar;
    private javax.swing.ButtonGroup btnGroupAdmin;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField pwdPass1;
    private javax.swing.JPasswordField pwdPass2;
    private javax.swing.JRadioButton rbtnNo;
    private javax.swing.JRadioButton rbtnSi;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtLogin;
    // End of variables declaration//GEN-END:variables
}
