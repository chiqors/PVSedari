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
public class transaksiTableModel extends AbstractTableModel {

    private ArrayList<transaksi> data;
    private String[] namaField = {"ID", "Tanggal", "Total Harga", "Bayar", "Kembalian", "Kasir"};

    public void setData(ArrayList<transaksi> dt) {
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
        transaksi t = data.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return t.getId();
            case 1:
                return t.getTanggal();
            case 2:
                return t.getTotal_harga();
            case 3:
                return t.getBayar();
            case 4:
                return t.getKembalian();
            case 5:
                return t.getKasir();
            default:
                return null;
        }
    }
    
}
