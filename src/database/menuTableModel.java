/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author bandi
 */
public class menuTableModel extends AbstractTableModel {

    private ArrayList<menu> data;
    private String[] namaField = {"ID", "ID Kategori", "Nama Menu", "Harga", "Stok"};

    public void setData(ArrayList<menu> dt) {
        this.data = dt;
    }

    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return namaField.length;
    }

    @Override
    public String getColumnName(int column) {
        return namaField[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        menu m = data.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return m.getId();
            case 1:
                return m.getId_kategori();
            case 2:
                return m.getNama_menu();
            case 3:
                return m.getHarga();
            case 4:
                return m.getStok();
            default:
                return null;
        }
    }
    
}
