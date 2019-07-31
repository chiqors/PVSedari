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
public class transaksi {
    private String id;
    private String tanggal;
    private int total_harga;
    private int bayar;
    private int kembalian;
    private String kasir;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public int getTotal_harga() {
        return total_harga;
    }

    public void setTotal_harga(int total_harga) {
        this.total_harga = total_harga;
    }

    public int getBayar() {
        return bayar;
    }

    public void setBayar(int bayar) {
        this.bayar = bayar;
    }

    public int getKembalian() {
        return kembalian;
    }

    public void setKembalian(int kembalian) {
        this.kembalian = kembalian;
    }

    public String getKasir() {
        return kasir;
    }

    public void setKasir(String kasir) {
        this.kasir = kasir;
    }
    
    public transaksi(String id, String tanggal, int total_harga, int bayar, int kembalian, String kasir) {
        setId(id);
        setTanggal(tanggal);
        setTotal_harga(total_harga);
        setBayar(bayar);
        setKembalian(kembalian);
        setKasir(kasir);
    }
    
}
