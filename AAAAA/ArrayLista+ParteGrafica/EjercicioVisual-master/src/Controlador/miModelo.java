/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dam
 */
public class miModelo extends DefaultTableModel{
    
    public boolean isCellEditable(int row,int column){ //este metodo existe en la clase del extends
        return false;
    }
    
}
