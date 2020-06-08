/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import static java.awt.event.KeyEvent.VK_ENTER;
import javax.swing.JOptionPane;
import modelo.Empresa;
import modelo.Linea;

/**
 *
 * @author ADMINMJ
 */
public class PanelBaja extends javax.swing.JPanel {

    Empresa miEmpresa;

    /**
     * Creates new form PanelBaja
     */
    public PanelBaja(Empresa miEmpresa) {
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
        txtCodigo = new javax.swing.JTextField();
        lblDeno = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtFrecuencia = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPrimera = new javax.swing.JTextField();
        txtUltima = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();

        jLabel1.setText("CODIGO");

        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoKeyPressed(evt);
            }
        });

        jLabel3.setText("FRECUENCIA");

        txtFrecuencia.setEditable(false);

        jLabel4.setText("PRIMERA PARADA");

        txtPrimera.setEditable(false);

        txtUltima.setEditable(false);

        jLabel5.setText("ULTIMA PARADA");

        jLabel6.setText("minutos");

        btnEliminar.setText("ELIMINAR");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel5)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(lblDeno))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtFrecuencia, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6))
                    .addComponent(txtUltima, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                    .addComponent(txtPrimera))
                .addContainerGap(282, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnEliminar)
                .addGap(72, 72, 72))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDeno))
                .addGap(5, 5, 5)
                .addComponent(btnEliminar)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtFrecuencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPrimera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUltima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(57, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyPressed
        boolean resultado;
        if (evt.getKeyCode() == VK_ENTER) {
            // resultado = consultar();
            // if (!resultado) {
            int pos = consultar2();
            if (pos == -1) {

                txtCodigo.requestFocus();
                txtCodigo.setSelectionStart(0);
                txtCodigo.setSelectionEnd(txtCodigo.getText().length());
            }
        }
    }//GEN-LAST:event_txtCodigoKeyPressed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        int pos;

        pos = consultar2();
        if (pos != -1) {
            int confirmacion = JOptionPane.showConfirmDialog(this, "Desea eliminar la linea",
                    " borrado", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (confirmacion == 0) {
                miEmpresa.getLineas().remove(pos);
                JOptionPane.showMessageDialog(this, "Registro Eliminado", "Información", JOptionPane.INFORMATION_MESSAGE);
                limpiar();
                txtCodigo.setText("");
                txtCodigo.requestFocus();

            } else {
                JOptionPane.showMessageDialog(this, " Eliminación cancelada", "Información", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblDeno;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtFrecuencia;
    private javax.swing.JTextField txtPrimera;
    private javax.swing.JTextField txtUltima;
    // End of variables declaration//GEN-END:variables

    private void visualizar(Linea linea) {
        lblDeno.setText(linea.getDenominacion());
        // txtFrecuencia.setText(String.valueOf(linea.getFrecuencia()));
        txtFrecuencia.setText(linea.getFrecuencia().toString());
        txtPrimera.setText(linea.getPrimera().getDenominación());
        txtUltima.setText(linea.getUltima().getDenominación());
        btnEliminar.setEnabled(true);
    }

    private void limpiar() {
        lblDeno.setText("");
        txtFrecuencia.setText("");
        txtPrimera.setText("");
        txtUltima.setText("");
        btnEliminar.setEnabled(false);
    }

    private boolean consultar() {
        Linea linea;
        int codigo;
        int posicion;
        boolean resultado;

        try {
            codigo = Integer.parseInt(txtCodigo.getText());
            linea = new Linea(codigo);
            posicion = miEmpresa.getLineas().indexOf(linea);
            if (posicion != -1) {
                linea = miEmpresa.getLineas().get(posicion);
                visualizar(linea);
                resultado = true;

            } else {
                JOptionPane.showMessageDialog(this, "esa linea no existe");
                lblDeno.setText("*****************************");
                limpiar();
                resultado = false;

            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, " debe de ser un número");
            limpiar();
            resultado = false;
        }
        return resultado;
    }

    private int consultar2() {
        Linea linea;
        int codigo;
        int posicion;

        try {
            codigo = Integer.parseInt(txtCodigo.getText());
            linea = new Linea(codigo);
            posicion = miEmpresa.getLineas().indexOf(linea);
            if (posicion != -1) {
                linea = miEmpresa.getLineas().get(posicion);
                visualizar(linea);

            } else {
                JOptionPane.showMessageDialog(this, "esa linea no existe");
                lblDeno.setText("*****************************");
                limpiar();

            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, " debe de ser un número");
            limpiar();
            posicion = -1;
        }
        return posicion;
    }

}