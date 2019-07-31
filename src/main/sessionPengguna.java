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
public class sessionPengguna {
    private static String s_nip;
    private static String s_nama;
    private static String s_username;

    public static String getS_nip() {
        return s_nip;
    }

    public static void setS_nip(String s_nip) {
        sessionPengguna.s_nip = s_nip;
    }

    public static String getS_nama() {
        return s_nama;
    }

    public static void setS_nama(String s_nama) {
        sessionPengguna.s_nama = s_nama;
    }

    public static String getS_username() {
        return s_username;
    }

    public static void setS_username(String s_username) {
        sessionPengguna.s_username = s_username;
    }
    
}
