/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import controlador.Empresa;

/**
 *
 * @author ADMINMJ
 */
public class PanelAltaCliente extends javax.swing.JPanel {

    Empresa miEmpresa;

    /**
     * Creates new form PanelAltaCliente
     */
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnGrabar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtPoblacion = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtCif = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setText("ALTA CLIENTES");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("CIF");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("NOMBRE");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("DIRECCIÓN");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("POBLACIÓN");

        btnGrabar.setText("GRABAR");
        btnGrabar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });

        btnCancelar.setText("CANCELAR");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtPoblacion.setBackground(new java.awt.Color(46, 82, 180));
        txtPoblacion.setForeground(new java.awt.Color(255, 255, 255));
        txtPoblacion.setCaretColor(new java.awt.Color(255, 0, 0));
        txtPoblacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPoblacionKeyPressed(evt);
            }
        });

        txtDireccion.setBackground(new java.awt.Color(46, 82, 180));
        txtDireccion.setForeground(new java.awt.Color(255, 255, 255));
        txtDireccion.setCaretColor(new java.awt.Color(255, 0, 0));
        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDireccionKeyPressed(evt);
            }
        });

        txtNombre.setBackground(new java.awt.Color(46, 82, 180));
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setCaretColor(new java.awt.Color(255, 0, 0));
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreKeyPressed(evt);
            }
        });

        txtCif.setBackground(new java.awt.Color(46, 82, 180));
        txtCif.setForeground(new java.awt.Color(255, 255, 255));
        txtCif.setCaretColor(new java.awt.Color(255, 0, 0));
        txtCif.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtCif.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCifKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCif, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtPoblacion, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
                                .addComponent(txtDireccion)
                                .addComponent(txtNombre))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(btnGrabar)
                        .addGap(217, 217, 217)
                        .addComponent(btnCancelar)))
                .addContainerGap(104, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(275, 275, 275))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPoblacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGrabar)
                    .addComponent(btnCancelar))
                .addGap(32, 32, 32))
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
    /**
     * Metodo para comprobar si un cuadro de texto está vacio.
     *
     * @param campo Cuadro de texto a comprobar
     * @return true si esta vacío y false en caso contrario
     */
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

    /**
     * Inicializar los campos
     */
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtCif;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPoblacion;
    // End of variables declaration//GEN-END:variables
}
