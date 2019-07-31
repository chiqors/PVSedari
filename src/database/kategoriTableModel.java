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
public class kategoriTableModel extends AbstractTableModel {

    private ArrayList<kategori> data;
    private String[] namaField = {"ID", "Kategori"};

    public void setData(ArrayList<kategori> dt) {
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
        kategori k = data.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return k.getId();
            case 1:
                return k.getKategori();
            default:
                return null;
        }
    }
    
}
