/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
/**
 *
 * @author bandi
 */
public class Database {
    public final String driver = "com.mysql.jdbc.Driver";
    public final String url = "jdbc:mysql://localhost/pvsedari";
    public final String user = "root";
    public final String pass = "";

    //tampilkan semua data

    public ArrayList<pengguna> tampil_semua_pengguna() {
        ArrayList<pengguna> list = new ArrayList<pengguna>();
        Connection konek = null;
        Statement stmt = null;
        try {
            Class.forName(driver);
            konek = DriverManager.getConnection(url, user, pass);
            stmt = konek.createStatement();
            String sql;
            sql = "SELECT * FROM pengguna";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                list.add(new pengguna(rs.getString("nip"), rs.getString("nama"), 
                        rs.getString("username"), rs.getString("password")));
            }//endwhile
            rs.close();
        }//endtry
        catch (Exception a) {
            System.out.println("Error : " + a.getMessage());
        }//endcatch
        finally {
            try {
                stmt.close();
            } catch (Exception e) {
            }
            try {
                konek.close();
            } catch (Exception e) {
            }
        }
        return list;
    }

    //tambah data
    public void tambah_pengguna(pengguna p) {
        Connection konek = null;
        Statement stmt = null;
        try {
            Class.forName(driver);
            konek = DriverManager.getConnection(url, user, pass);
            stmt = konek.createStatement();
            String sql;
            sql = "INSERT INTO pengguna VALUES ('" + p.getNip()+ "','"
                    + p.getNama() + "','" + p.getUsername()+ "',MD5('" + p.getPassword()+ "'))";
            stmt.executeUpdate(sql);
        } catch (Exception a) {
            System.out.println("Error : " + a.getMessage());
        } finally {
            try {
                stmt.close();
            } catch (Exception e) {
            }
            try {
                konek.close();
            } catch (Exception e) {
            }
        }
    }

    public void hapusPengguna(String nip) {
        Connection konek = null;
        Statement stmt = null;
        try {
            Class.forName(driver);
            konek = DriverManager.getConnection(url, user, pass);
            stmt = konek.createStatement();
            String sql = "DELETE FROM pengguna WHERE nip='" + nip + "'";
            stmt.executeUpdate(sql);
        } catch (Exception a) {
            System.out.println("Error : " + a.getMessage());
        } finally {
            try {
                stmt.close();
            } catch (Exception e) {
                try {
                    konek.close();
                } catch (Exception b) {

                }
            }
        }
    }

    public void updatePengguna(pengguna p) {
        Connection konek = null;
        Statement stmt = null;
        try {
            Class.forName(driver);
            konek = DriverManager.getConnection(url, user, pass);
            stmt = konek.createStatement();
            String sql = "UPDATE pengguna SET nama = '" + p.getNama() + "'"
                    + ", username = '" + p.getUsername()+ "', password = MD5('"
                    + p.getPassword()+ "') WHERE nip = '" + p.getNip()+ "'";
            stmt.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        } finally {
            try {
                stmt.close();
            } catch (Exception e) {
            }
            try {
                konek.close();
            } catch (Exception e) {
            }
        }
    }

    public pengguna pilih_pengguna(String nip) {
        pengguna p = null;
        Connection konek = null;
        Statement stmt = null;
        try {
            Class.forName(driver);
            konek = DriverManager.getConnection(url, user, pass);
            stmt = konek.createStatement();
            String sql = "SELECT * FROM pengguna WHERE nip = '" + nip + "'";
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                p = new pengguna(rs.getString("nip"), rs.getString("nama"), rs.getString("username"),
                        rs.getString("password"));

            } else {
                p = null;
            }
            rs.close();
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        } finally {
            try {
                stmt.close();
            } catch (Exception e) {
            }
            try {
                konek.close();
            } catch (Exception e) {
            }
        }
        return p;
    }
    
    public ArrayList<pengguna> filter_pengguna(String keyword) {
        ArrayList<pengguna> list = new ArrayList<pengguna>();
        Connection konek = null;
        Statement stmt = null;
        try {
            Class.forName(driver);
            konek = DriverManager.getConnection(url, user, pass);
            stmt = konek.createStatement();
            String sql;
            sql = "SELECT * FROM pengguna where nama like '%"+keyword+"%'";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                list.add(new pengguna(rs.getString("nip"), rs.getString("nama"), rs.getString("username")
                        , rs.getString("password")));
            }//endwhile
            rs.close();
        }//endtry
        catch (Exception a) {
            System.out.println("Error : " + a.getMessage());
        }//endcatch
        finally {
            try {
                stmt.close();
            } catch (Exception e) {
            }
            try {
                konek.close();
            } catch (Exception e) {
            }
        }
        return list;
    }
}
