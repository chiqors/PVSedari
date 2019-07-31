/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author bandi
 */
public class sessionAlur {
    private static String alur_id_transaksi;
    private static int alur_total_harga_menu;
    private static String alur_transaksi_tanggal;

    public static String getAlur_id_transaksi() {
        return alur_id_transaksi;
    }

    public static void setAlur_id_transaksi(String alur_id_transaksi) {
        sessionAlur.alur_id_transaksi = alur_id_transaksi;
    }

    public static int getAlur_total_harga_menu() {
        return alur_total_harga_menu;
    }

    public static void setAlur_total_harga_menu(int alur_total_harga_menu) {
        sessionAlur.alur_total_harga_menu = alur_total_harga_menu;
    }

    public static String getAlur_transaksi_tanggal() {
        return alur_transaksi_tanggal;
    }

    public static void setAlur_transaksi_tanggal(String alur_transaksi_tanggal) {
        sessionAlur.alur_transaksi_tanggal = alur_transaksi_tanggal;
    }
    
}
