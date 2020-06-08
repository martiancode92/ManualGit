/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Empresa;
import controlador.ModeloTabla;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import modelo.Cliente;
import modelo.Sala;

/**
 *
 * @author USUARIO
 */
public class PanelConsulta extends javax.swing.JPanel {

    Empresa miEmpresa;
    DefaultComboBoxModel modelo;
    ModeloTabla modeloTabla;
    
    public PanelConsulta(Empresa empresa) {
        initComponents();

        miEmpresa=empresa;
        modelo = new DefaultComboBoxModel(); 
        cmbConsulta.setModel(modelo);
        modeloTabla = new ModeloTabla();
         String [] titulo= {"Denominación","Capaciadad"};
           modeloTabla.setColumnIdentifiers(titulo);
           jtblConsulta.setModel(modeloTabla);
           cargarClientes();
           cargarSalas();
           
            this.setSize(700, 500);
    }
    
    
    public void cargarClientes(){
    
        ArrayList<Cliente> clientes= miEmpresa.getCliente();
        
        for(int i=0; i< clientes.size(); i++){
        
            if(clientes.get(i).getAlquiladas().size()!=0){
            
            
                modelo.addElement(clientes.get(i));
             
            
            }
        
        }
    
    
    }
    
    
    
    public void cargarSalas(){
   
        
    
    int filas= modeloTabla.getRowCount();
    for(int fila=0; fila<filas; fila++)
    modeloTabla.removeRow(0);// siempre borramos por que va subiendo
    
     Cliente c= (Cliente)modelo.getSelectedItem();
     
            
        // compruebo que realmente haya algún cliente seleccionado
        if ( c!=null){
            for ( int i=0; i< c.getAlquiladas().size(); i++){
                Sala s= c.getAlquiladas().get(i);// salas que el cliente tiene alquiladas
                Vector v=new Vector();
                v.add(s.getNombre());
                v.add(s.getCapacidad());
                modeloTabla.addRow(v);
                        
            
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
        cmbConsulta = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblConsulta = new javax.swing.JTable();
        lblSeguntoTitulo = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Arial", 2, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Consulta de Alquileres");

        jLabel2.setText("Cliente:");

        cmbConsulta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbConsulta.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbConsultaItemStateChanged(evt);
            }
        });

        jtblConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtblConsulta);

        lblSeguntoTitulo.setText("Salas_Alquiladas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel2)
                        .addGap(87, 87, 87)
                        .addComponent(cmbConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(lblSeguntoTitulo)))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(lblSeguntoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmbConsultaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbConsultaItemStateChanged
        cargarSalas();
    }//GEN-LAST:event_cmbConsultaItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbConsulta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtblConsulta;
    private javax.swing.JLabel lblSeguntoTitulo;
    // End of variables declaration//GEN-END:variables
}