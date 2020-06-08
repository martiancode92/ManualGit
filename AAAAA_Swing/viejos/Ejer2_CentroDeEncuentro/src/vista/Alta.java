/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Centro;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class Alta extends javax.swing.JPanel {

    /**
     * Creates new form Alta
     */
    public Alta() {
        initComponents();
        setVisible(true);
        setSize(800, 600);
    }

    Alta(Centro miCentro) {
        
          initComponents();
          setVisible(true);
        setSize(800, 600);
    }

    private boolean validarCampo(String valor) {
        boolean resultado = false;
        if (valor.equals("")) {
            resultado = true;
        }
        return resultado;
    }
    
    
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblCif = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblPoblacion = new javax.swing.JLabel();
        txtCif = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtPoblacion = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(800, 600));

        lblTitulo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Alta_Usuario");

        lblCif.setText("Cif:");

        lblNombre.setText("Nombre_Apellidos:");

        lblDireccion.setText("Dirección:");

        lblPoblacion.setText("Población:");

        txtCif.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCifKeyPressed(evt);
            }
        });

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreKeyPressed(evt);
            }
        });

        txtPoblacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPoblacionKeyPressed(evt);
            }
        });

        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDireccionKeyPressed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
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
                .addGap(278, 278, 278)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(158, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPoblacion)
                    .addComponent(lblDireccion)
                    .addComponent(lblNombre)
                    .addComponent(lblCif, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar))
                .addGap(152, 152, 152)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelar)
                    .addComponent(txtCif, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPoblacion, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(199, 199, 199))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCif)
                    .addComponent(txtCif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDireccion))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPoblacion)
                    .addComponent(txtPoblacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar))
                .addContainerGap(79, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
    
               Centro miCentro = new Centro();

        //Esta variable solo la uso para capturar los datos JtxtField
        String cif = txtCif.getText();

        //estas variables las paso al constructor de usuario para guardarlo
        String nombre = txtNombre.getText();
        String direccion = txtDireccion.getText();
        String poblacion = txtPoblacion.getText();

        //esta es la variable que le paso al constructor
        //para eso he apañado este Casting
        int e = Integer.parseInt(cif);

        miCentro.guardarUsuario(e, nombre, direccion, poblacion);

        cif = txtCif.getText().trim();

        if (validarCampo(cif)) { // EL CAMPO ESTA VACÍO POR LO QUE SE ABRE UN VENTANA DE DIALOGO 
            //Y A CONTINUACIÓN COLOCAMOS EL CURSOR EN EL CAMPO REQUERIDO. 
            JOptionPane.showMessageDialog(this, " CIF Requerido ", " Información", JOptionPane.ERROR_MESSAGE);
            txtCif.requestFocus();
        } else {

            nombre = txtNombre.getText().trim();
            if (validarCampo(nombre)) {
                JOptionPane.showMessageDialog(this, " Nombre Requerido ", " Información", JOptionPane.ERROR_MESSAGE);
                txtNombre.requestFocus();
            } else {

            }

            direccion = txtDireccion.getText().trim();
            if (validarCampo(direccion)) {
                JOptionPane.showMessageDialog(this, " Direccion Requerida ", " Información", JOptionPane.ERROR_MESSAGE);
                txtDireccion.requestFocus();

            } else {

                poblacion = txtPoblacion.getText().trim();
            }
            if (validarCampo(poblacion)) {
                JOptionPane.showMessageDialog(this, " Poblacion Requerida ", " Información", JOptionPane.ERROR_MESSAGE);
                txtPoblacion.requestFocus();

            } else {

                int resultado = miCentro.guardarUsuario(e, nombre, direccion, poblacion);

                if (resultado == -1) {

                    JOptionPane.showMessageDialog(this, " Usuario Añadido", " Alta Usuarios", JOptionPane.INFORMATION_MESSAGE);
                    limpiar();

                } else {// YA EXISE UN USUARIO CON ESE CIF.
                    JOptionPane.showMessageDialog(this, " Usuario existente con el CIF indicado", " Error ", JOptionPane.ERROR_MESSAGE);

                    // Limpiamos el campo
                    txtCif.setText("");
                    // Colocamos el cursor en el campo CIF
                    txtCif.requestFocus();
                }

            }

        }

        
        
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtCifKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCifKeyPressed
        // TODO add your handling code here:
        
        String i= txtCif.getText() ;

        switch (evt.getKeyCode()) {
            case KeyEvent.VK_F1:
                // el usuario ha presionado la tecla F1, por lo que debe             
                // mostrar que información hay que introducir en ese campo.              
                JOptionPane.showMessageDialog(this, "Cif del Usuario :"+i, "Informacion del campo", JOptionPane.INFORMATION_MESSAGE);
                break;
            case KeyEvent.VK_ENTER:
                // el usuario ha presionado la tecla enter
                txtNombre.requestFocus();// coloca el cursor en el siguiente campo
                break;
            case KeyEvent.VK_ESCAPE:
                // el usuario ha presionado escape                
                txtCif.setText(""); // borrar lo que hay en ese campo.
        }
        
    }//GEN-LAST:event_txtCifKeyPressed

    private void txtNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyPressed
        // TODO add your handling code here:
        
        String i= txtNombre.getText() ;
        
        switch (evt.getKeyCode()) {
            case KeyEvent.VK_F1:
                // el usuario ha presionado la tecla F1, por lo que debe             
                // mostrar que información hay que introducir en ese campo.              
                JOptionPane.showMessageDialog(this, " Nombre del Usuario :"+i, "Información del campo", JOptionPane.INFORMATION_MESSAGE);
                break;
            case KeyEvent.VK_ENTER:
                // el usuario ha presionado la tecla enter
                txtDireccion.requestFocus();// coloca el cursor en el siguiente campo
                break;
            case KeyEvent.VK_ESCAPE:
                // el usuario ha presionado escape                
                txtNombre.setText(""); // borrar lo que hay en ese campo.
        }
    }//GEN-LAST:event_txtNombreKeyPressed

    private void txtDireccionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyPressed
        // TODO add your handling code here:
        
        String i= txtDireccion.getText() ;
        
        switch (evt.getKeyCode()) {
            case KeyEvent.VK_F1:
                // el usuario ha presionado la tecla F1, por lo que debe             
                // mostrar que información hay que introducir en ese campo.              
                JOptionPane.showMessageDialog(this, " Dirección del Usuario :"+i, "Información del campo", JOptionPane.INFORMATION_MESSAGE);
                break;
            case KeyEvent.VK_ENTER:
                // el usuario ha presionado la tecla enter
                txtPoblacion.requestFocus();// coloca el cursor en el siguiente campo
                break;
            case KeyEvent.VK_ESCAPE:
                // el usuario ha presionado escape                
                txtDireccion.setText(""); // borrar lo que hay en ese campo.
        }

    }//GEN-LAST:event_txtDireccionKeyPressed

    private void txtPoblacionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPoblacionKeyPressed
        
        String i= txtPoblacion.getText() ;
        
        switch (evt.getKeyCode()) {
            case KeyEvent.VK_F1:
                // el usuario ha presionado la tecla F1, por lo que debe             
                // mostrar que información hay que introducir en ese campo.              
                JOptionPane.showMessageDialog(this, " Población del Usuario :"+i, "Información del campo", JOptionPane.INFORMATION_MESSAGE);
                break;
            case KeyEvent.VK_ENTER:
                // el usuario ha presionado la tecla enter
                txtCif.requestFocus();// coloca el cursor en el siguiente campo
                break;
            case KeyEvent.VK_ESCAPE:
                // el usuario ha presionado escape                
                txtPoblacion.setText(""); // borrar lo que hay en ese campo.
        }

    }//GEN-LAST:event_txtPoblacionKeyPressed

    
     public void limpiar() {

        // Vamos a borrar las cajas de texto despues de guardar
        txtCif.setText("");
        txtNombre.setText("");
        txtDireccion.setText("");
        txtPoblacion.setText("");

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel lblCif;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPoblacion;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtCif;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPoblacion;
    // End of variables declaration//GEN-END:variables
}
