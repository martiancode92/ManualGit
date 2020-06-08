/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Empresa;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author USUARIO
 */
public class PanelAltaCliente extends javax.swing.JPanel {

    Empresa miEmpresa;
    
    public PanelAltaCliente(Empresa miEmpresa) {
        initComponents();
         this.miEmpresa = miEmpresa;
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
        lblCif = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblPoblacion = new javax.swing.JLabel();
        txtCif = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtPoblacion = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        btnGrabar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ALTA CLIENTES");

        lblCif.setText("CIF");

        lblNombre.setText("NOMBRE-APELLIDOS");

        lblDireccion.setText("DIRECCION");

        lblPoblacion.setText("POBLACION");

        txtCif.setBackground(new java.awt.Color(0, 153, 102));
        txtCif.setForeground(new java.awt.Color(255, 255, 255));
        txtCif.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCifKeyPressed(evt);
            }
        });

        txtNombre.setBackground(new java.awt.Color(0, 153, 102));
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreKeyPressed(evt);
            }
        });

        txtPoblacion.setBackground(new java.awt.Color(0, 153, 102));
        txtPoblacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPoblacionKeyPressed(evt);
            }
        });

        txtDireccion.setBackground(new java.awt.Color(0, 153, 102));
        txtDireccion.setForeground(new java.awt.Color(255, 255, 255));
        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDireccionKeyPressed(evt);
            }
        });

        btnGrabar.setText("GRABAR");
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });

        btnCancelar.setText("CANCELAR");
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
                        .addGap(207, 207, 207)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                .addComponent(lblDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblPoblacion, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblCif, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnGrabar))
                        .addGap(184, 184, 184)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCancelar)
                            .addComponent(txtCif, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPoblacion, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCif)
                            .addComponent(txtCif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addComponent(lblNombre))
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDireccion)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPoblacion)
                    .addComponent(txtPoblacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGrabar)
                    .addComponent(btnCancelar))
                .addGap(71, 71, 71))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCifKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCifKeyPressed
        
    // vemos el código de la tecla pulsada                            
        switch (evt.getKeyCode()) {
            case KeyEvent.VK_ENTER:
                // ha pulsado la tecla enter por lo que pasamos el foco al siguiente elemento
                txtNombre.requestFocus();
                break;
            case KeyEvent.VK_ESCAPE: // ha pulsado escape , por lo que lo inicializamos
                txtCif.setText("");
        }
        
    }//GEN-LAST:event_txtCifKeyPressed

    private void txtNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyPressed

        switch (evt.getKeyCode()) {
            case KeyEvent.VK_ENTER:
                // ha pulsado la tecla enter por lo que pasamos el foco al siguiente elemento
                txtDireccion.requestFocus();
                break;
            case KeyEvent.VK_ESCAPE: // ha pulsado escape , por lo que lo inicializamos
                txtNombre.setText("");
        }        
    }//GEN-LAST:event_txtNombreKeyPressed

    private void txtDireccionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyPressed

     switch (evt.getKeyCode()) {
            case KeyEvent.VK_ENTER:
                // ha pulsado la tecla enter por lo que pasamos el foco al siguiente elemento
                txtPoblacion.requestFocus();
                break;
            case KeyEvent.VK_ESCAPE: // ha pulsado escape , por lo que lo inicializamos
                txtDireccion.setText("");
        }        
        
    }//GEN-LAST:event_txtDireccionKeyPressed

    private void txtPoblacionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPoblacionKeyPressed
    
        switch (evt.getKeyCode()) {
            case KeyEvent.VK_ENTER:
                // ha pulsado la tecla enter por lo que pasamos el foco al siguiente elemento
                btnGrabar.requestFocus();
                break;
            case KeyEvent.VK_ESCAPE: // ha pulsado escape , por lo que lo inicializamos
                txtPoblacion.setText("");
        }        
    }//GEN-LAST:event_txtPoblacionKeyPressed

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed

 String cif, nombre, direccion, poblacion;
        boolean resultado;
        if (!comprobarBlancos(txtCif) && !comprobarBlancos(txtNombre) && !comprobarBlancos(txtDireccion)
                && !comprobarBlancos(txtPoblacion)) {
            cif = txtCif.getText();
            nombre = txtNombre.getText();
            direccion = txtDireccion.getText();
            poblacion = txtPoblacion.getText();
            resultado = miEmpresa.nuevoCliente(cif, nombre, direccion, poblacion);
            if (!resultado) {
                // se ha dado de alta el cliente
                JOptionPane.showMessageDialog(this, "Nuevo cliente", "Alta", JOptionPane.INFORMATION_MESSAGE);
                limpiar();
            } else {
                // ya existe un cliente con ese cif.
                JOptionPane.showMessageDialog(this, "Ya existe un cliente con ese CIF",
                        "Alta", JOptionPane.ERROR_MESSAGE);
                // envio el foco al cif
                txtCif.requestFocus();
                // selecciono el texto introducido
                txtCif.setSelectionStart(0);// comienzo de la selección
                txtCif.setSelectionEnd(txtCif.getText().length());// fin de la seleccion
            }
        }        
        
        
    }//GEN-LAST:event_btnGrabarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
          limpiar();
    }//GEN-LAST:event_btnCancelarActionPerformed

        private boolean comprobarBlancos(JTextField campo) {
        boolean resultado;
        // elimino los espacios que haya en el texto al principio y al final.
        // y a continuación compruebo si es una cadena vacia
        resultado = campo.getText().trim().isEmpty();
        if (resultado) {
            JOptionPane.showMessageDialog(this, " Campo Requerido", " Validación ", JOptionPane.ERROR_MESSAGE);
            campo.requestFocus();
        }
        return resultado;

    }
        
    private void limpiar() {
       
        txtCif.setText("");
        txtNombre.setText("");
        txtPoblacion.setText("");
        txtDireccion.setText(""); 
        
    }
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCif;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPoblacion;
    private javax.swing.JTextField txtCif;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPoblacion;
    // End of variables declaration//GEN-END:variables
}
