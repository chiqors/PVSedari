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
public class detail_transaksiTableModel extends AbstractTableModel {
    
    private ArrayList<detail_transaksi> data;
    private String[] namaField = {"ID", "ID Transaksi", "ID Menu", "Jumlah Beli", "Total Harga"};

    public void setData(ArrayList<detail_transaksi> dt) {
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
        detail_transaksi dt = data.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return dt.getId();
            case 1:
                return dt.getId_transaksi();
            case 2:
                return dt.getId_menu();
            case 3:
                return dt.getJumlah_beli();
            case 4:
                return dt.getTotal_harga();
            default:
                return null;
        }
    }
    
}
