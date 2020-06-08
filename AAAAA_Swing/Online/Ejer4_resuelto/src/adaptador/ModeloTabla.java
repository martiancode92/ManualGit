/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adaptador;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMINMJ
 */
public class ModeloTabla  extends DefaultTableModel{

    @Override
    public boolean isCellEditable(int fila, int columna) {
       // boolean [] valores={true, false};
       // return valores[columna];
       return false;
    }
    
    
}
