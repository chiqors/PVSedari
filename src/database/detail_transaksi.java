/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

/**
 *
 * @author bandi
 */
public class detail_transaksi {
    private String id;
    private String id_transaksi;
    private String id_menu;
    private int jumlah_beli;
    private int total_harga;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId_transaksi() {
        return id_transaksi;
    }

    public void setId_transaksi(String id_transaksi) {
        this.id_transaksi = id_transaksi;
    }

    public String getId_menu() {
        return id_menu;
    }

    public void setId_menu(String id_menu) {
        this.id_menu = id_menu;
    }

    public int getJumlah_beli() {
        return jumlah_beli;
    }

    public void setJumlah_beli(int jumlah_beli) {
        this.jumlah_beli = jumlah_beli;
    }

    public int getTotal_harga() {
        return total_harga;
    }

    public void setTotal_harga(int total_harga) {
        this.total_harga = total_harga;
    }

    public detail_transaksi(String id, String id_transaksi, String id_menu, int jumlah_beli, int total_harga) {
        setId(id);
        setId_transaksi(id_transaksi);
        setId_menu(id_menu);
        setJumlah_beli(jumlah_beli);
        setTotal_harga(total_harga);
    }
}
