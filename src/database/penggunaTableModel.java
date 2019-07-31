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
public class penggunaTableModel extends AbstractTableModel {

    private ArrayList<pengguna> data;
    private String[] namaField = {"NIP", "Nama", "Username"};

    public void setData(ArrayList<pengguna> dt) {
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
        pengguna p = data.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return p.getNip();
            case 1:
                return p.getNama();
            case 2:
                return p.getUsername();
            default:
                return null;
        }
    }
}
