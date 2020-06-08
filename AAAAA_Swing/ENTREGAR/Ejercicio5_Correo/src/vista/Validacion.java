/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import modelo.Empresa;
import modelo.Usuario;

/**
 *
 * @author USUARIO
 */
public class Validacion extends javax.swing.JFrame {

    Empresa miEmpresa;
    Usuario u;

    public Validacion() {
        initComponents();
        this.miEmpresa = new Empresa();
        this.u= new Usuario();
        crearUsuario();
     
        this.setLocationRelativeTo(null);
        
    }

    Validacion(Empresa miEmpresa) {
        initComponents();
        this.miEmpresa = miEmpresa;

    }

    public void crearUsuario() {

        miEmpresa.nuevoUsuario(new Usuario("adil", "adil", true, "adil@artesano.es"));
        miEmpresa.nuevoUsuario(new Usuario("carmen", "carmen", false, "carmen@artesano.es"));
        miEmpresa.nuevoUsuario(new Usuario("jennie", "jennie", true, "jennie@artesano.es"));
        miEmpresa.nuevoUsuario(new Usuario("hector", "hector", false, "hector@artesano.es"));
         miEmpresa.nuevoUsuario(new Usuario("1", "1", false, "aaaa"));
    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        pwdPass = new javax.swing.JPasswordField();
        btnValidar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("Identificate");

        jLabel2.setText("Login");

        jLabel3.setText("Password");

        txtLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLoginKeyPressed(evt);
            }
        });

        pwdPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pwdPassKeyPressed(evt);
            }
        });

        btnValidar.setText("Validar");
        btnValidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(273, 273, 273)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pwdPass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(136, 136, 136))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(btnValidar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar)
                        .addGap(193, 193, 193))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(pwdPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnValidar)
                    .addComponent(btnCancelar))
                .addContainerGap(102, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidarActionPerformed

        String login = txtLogin.getText();
        String pass = new String(pwdPass.getPassword());

        Usuario u = new Usuario(login);
        int pos = miEmpresa.getUsuarios().indexOf(u);
        //pregunto por la posicion del objeto que contiene el texto introducido en el login

        if (!login.isEmpty()) {
            if (!pass.isEmpty()) {

                if (pos == -1) {

                    JOptionPane.showMessageDialog(this, "Usuario no existe");
                    txtLogin.requestFocus();
                    txtLogin.setSelectionStart(0);
                    txtLogin.setSelectionEnd(login.length());

                } else {

                    u = miEmpresa.getUsuarios().get(pos);

                    if (u.getPass().trim().equalsIgnoreCase(pass.trim())) {//ledigo que me elimine los espacios en blanco
                        //si supero este condicional es que la contraseña esta bien 
                        //ahora en funcion del tipo de usuario debo indicar que ventana abrir si admin o estandar
                        //por lo tanto uso al usuario y pregunto por el tipo

                        if (u.isTipo()) {
                            // le paso la empresa y la visualizo por que es un frame
                            //Jframe Administrador  contiene las operaciones que puede realizar ese usuario
                            // y la empresa contiene los datos con los que puede operar

                            Usuario usuarioAdmin = miEmpresa.getUsuarios().get(pos);
                            new Administrador(miEmpresa, usuarioAdmin).setVisible(true);

                        } else {
                            // le paso la empresa y la visualizo por que es un frame
                            //Jframe Estandar  contiene las operaciones que puede realizar ese usuario
                            // y la empresa contiene los datos con los que puede operar
                            Usuario usuarioEstandar = miEmpresa.getUsuarios().get(pos);
                            new Estandar(miEmpresa, usuarioEstandar).setVisible(true);

                        }

                        /*
                    libero los recursos asignados al usuario, con dispose y pack para ajustar el tamaño de la ventana
                         */
                        dispose();
                        pack();

                    } else {
                        //introdujo mal la contraseña

                        JOptionPane.showMessageDialog(this, "Introdujo mal la contraseña");
                        //lo vuelvo a mandar caja de texto para que vuelva a introducir la contraseña
                        pwdPass.requestFocus();
                        //le indico la posicion para la lectura de la contraseña
                        pwdPass.setSelectionStart(0);
                        //le indico el fin de la posicion de la lectura, usando la variable que utilize para capturar la contraseña
                        pwdPass.setSelectionEnd(pass.length());

                    }
                    
                       }

                }else{JOptionPane.showConfirmDialog(this,"El campo contraseña esta vacio","INFORMACION",JOptionPane.ERROR_MESSAGE);}

            } else {
                JOptionPane.showConfirmDialog(this, "El campo Login esta vacio", "INFORMACION", JOptionPane.ERROR_MESSAGE);
         

        }

    }//GEN-LAST:event_btnValidarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int eleccion;

        eleccion = JOptionPane.showConfirmDialog(this, "¿Desea cerrar la vebtana?",
                "Cerrar Ventana", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (eleccion == JOptionPane.YES_OPTION) {

            dispose();
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

    private void txtLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLoginKeyPressed

        switch (evt.getKeyCode()) {

            case KeyEvent.VK_ENTER:
                pwdPass.requestFocus();
                break;

        }
    }//GEN-LAST:event_txtLoginKeyPressed

    private void pwdPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwdPassKeyPressed

        switch (evt.getKeyCode()) {

            case KeyEvent.VK_ENTER:
                btnValidar.requestFocus();
                break;

        }

    }//GEN-LAST:event_pwdPassKeyPressed

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
    private javax.swing.JPasswordField pwdPass;
    private javax.swing.JTextField txtLogin;
    // End of variables declaration//GEN-END:variables

    private Object Estandar(Empresa miEmpresa, Usuario usuarioEstandar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
