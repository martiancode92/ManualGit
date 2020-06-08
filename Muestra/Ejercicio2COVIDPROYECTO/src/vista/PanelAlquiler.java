/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import modelo.Cliente;
import controlador.Empresa;
import modelo.Sala;

/**
 *
 * @author ADMINMJ
 */
public class PanelAlquiler extends javax.swing.JPanel {

    Empresa miEmpresa;
    DefaultComboBoxModel modelo;

    /**
     * Creates new form PanelAlquiler
     */
    public PanelAlquiler(Empresa miEmpresa) {
        initComponents();
        this.miEmpresa = miEmpresa;
        modelo = new DefaultComboBoxModel();
        cargarSalas();
        // Asigno al jcombo el modelo.
        cmbSalas.setModel(modelo);
        // compruebo si tengo salas libres
        habilitar();

    }

    private void habilitar() {

        if (modelo.getSize() == 0) {
            //No hay ninguna sala disponible
            // deshabilitar botones
            btnAlquilar.setEnabled(false);
            btnCancelar.setEnabled(false);
            txtCif.setEditable(false);
            JOptionPane.showMessageDialog(this, " No hay disponibilidad de salas",
                    "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void buscarCliente(String cif) {
        Cliente c = miEmpresa.buscarUnCliente(cif);
        if (c != null) {
            lblNombre.setText(c.getNombre());
        } else {
            lblNombre.setText("***************");
        }
    }

    private void cargarSalas() {
        // Primero limpio el modelo.
        modelo.removeAllElements();
        // Recupero las salas que hay en la empresa
        ArrayList<Sala> salas = miEmpresa.getSalas();
        for (int i = 0; i < salas.size(); i++) {
            // compruebo si esta disponible.
            if (!salas.get(i).isOcupada()) {
                modelo.addElement(salas.get(i));
            }
        }
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
        cmbSalas = new javax.swing.JComboBox<>();
        txtCif = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        btnAlquilar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText("ALQUILER SALAS");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Salas");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Cliente");

        cmbSalas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbSalas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbSalasKeyPressed(evt);
            }
        });

        txtCif.setBackground(new java.awt.Color(46, 82, 180));
        txtCif.setForeground(new java.awt.Color(255, 255, 255));
        txtCif.setCaretColor(new java.awt.Color(255, 51, 0));
        txtCif.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCifFocusLost(evt);
            }
        });
        txtCif.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCifKeyPressed(evt);
            }
        });

        lblNombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblNombre.setText("*****************************************");

        btnAlquilar.setText("ALQUILAR");
        btnAlquilar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlquilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlquilarActionPerformed(evt);
            }
        });

        btnCancelar.setText("CANCELAR");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(256, 256, 256))
            .addGroup(layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtCif, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(44, 44, 44)
                        .addComponent(cmbSalas, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAlquilar)
                    .addComponent(btnCancelar))
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbSalas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlquilar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtCif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombre)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(btnCancelar)))
                .addContainerGap(243, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
/**
     * El usuario ha pulsado una tecla, nosotros controlaremos el Escape y el
     * Enter.
     *
     * @param evt
     */
    private void txtCifKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCifKeyPressed
        if (KeyEvent.VK_ENTER == evt.getKeyCode()) {
            // Aquí no hace falta llamar a buscarEmpresa , porque pierde
            // el foco al ir al botón Alquilar.
            btnAlquilar.requestFocus();
        } else {
            if (KeyEvent.VK_ESCAPE == evt.getKeyCode()) {
                txtCif.setText("");
            }
        }

    }//GEN-LAST:event_txtCifKeyPressed
    /**
     * el usuario pierde el foco del cuadro de texto txtCif
     *
     * @param evt
     */
    private void txtCifFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCifFocusLost
        // TODO add your handling code here:
        buscarCliente(txtCif.getText());
    }//GEN-LAST:event_txtCifFocusLost

    private void btnAlquilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlquilarActionPerformed
        Cliente c = miEmpresa.buscarUnCliente(txtCif.getText());

        //int posicion = cmbSalas.getSelectedIndex();// posicion del elemento seleccionado en el JCombo
        //Sala s = (Sala) modelo.getElementAt(posicion);// objeto de esa poscion
        // las dos lineas anteriores tambien lo podemos poner 
        Sala s= (Sala)cmbSalas.getSelectedItem();
        if (c != null) {
            // Actualizamos la sala
            s.setOcupada(true);
            // Se la añadimos al cliente
            c.guardar(s);
            limpiar();

        } else {
            JOptionPane.showMessageDialog(this, "El cliente no existe",
                    "Información", JOptionPane.ERROR_MESSAGE);
            lblNombre.setText("********************");
            txtCif.requestFocus();
            txtCif.setSelectionStart(0);
            txtCif.setSelectionEnd(txtCif.getText().length());
        }
    }//GEN-LAST:event_btnAlquilarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void cmbSalasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbSalasKeyPressed

        if (KeyEvent.VK_F1 == evt.getKeyCode()) {
            int posicion = cmbSalas.getSelectedIndex();
            if (posicion != -1) {
                Sala s = (Sala) cmbSalas.getSelectedItem();

                JOptionPane.showMessageDialog(this, s.getDenominacion() + " tiene una capacidad de " + s.getCapacidad() + " personas",
                        "Información ", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_cmbSalasKeyPressed
    private void limpiar() {
        txtCif.setText("");
        lblNombre.setText("*************");
        cargarSalas();
        habilitar();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlquilar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> cmbSalas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTextField txtCif;
    // End of variables declaration//GEN-END:variables
}
