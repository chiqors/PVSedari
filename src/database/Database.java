/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import main.sessionAlur;
import main.sessionPengguna;
/**
 *
 * @author bandi
 */
public class Database {
    public final String driver = "com.mysql.jdbc.Driver";
    public final String url = "jdbc:mysql://localhost/pvsedari";
    public final String user = "root";
    public final String pass = "";
    
    java.util.Date dt = new java.util.Date();
    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /*
    --------------------------------------------------------
    DATA TAMBAH ALUR TRANSAKSI
    --------------------------------------------------------
    */
    
    public String tambah_alur_persiapan_transaksi() {
        Connection konek = null;
        PreparedStatement stmt = null;
        String kasir = sessionPengguna.getS_nip();
        String id_transaksi = "";
        String currentTime = sdf.format(dt);
        sessionAlur.setAlur_transaksi_tanggal(currentTime);
        try {
            Class.forName(driver);
            konek = DriverManager.getConnection(url, user, pass);
            String sql = "INSERT INTO transaksi VALUES (NULL,'"+currentTime+"',NULL,NULL,NULL,'"+kasir+"')";
            stmt = konek.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stmt.executeUpdate();
            
            ResultSet rs = stmt.getGeneratedKeys();
            rs.next();
            id_transaksi = rs.getString(1);
            rs.close();
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
        return id_transaksi;
    }
    
    public void tambah_alur_detail_transaksi(detail_transaksi dt) {
        Connection konek = null;
        Statement stmt = null;
        try {
            Class.forName(driver);
            konek = DriverManager.getConnection(url, user, pass);
            stmt = konek.createStatement();
            String sql;
            sql = "INSERT INTO detail_transaksi VALUES (NULL,'" 
                    +dt.getId_transaksi()+ "','"+dt.getId_menu()+"'"
                    + ","+dt.getJumlah_beli()+","+dt.getTotal_harga()+")";
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
    
    public void final_update_alur_transaksi(transaksi t) {
        Connection konek = null;
        Statement stmt = null;
        try {
            Class.forName(driver);
            konek = DriverManager.getConnection(url, user, pass);
            stmt = konek.createStatement();
            String sql = "UPDATE transaksi SET tanggal = "
                    + "'"+t.getTanggal()+"',"
                    + "total_harga = '"+t.getTotal_harga()+"',"
                    + "bayar = "+t.getBayar()+","
                    + "kembalian = "+t.getBayar()+","
                    + "kasir = "+t.getKasir()+" "
                    + "WHERE id = '" + t.getId()+ "'";
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
    
    /*
    --------------------------------------------------------
    DATA DETAIL TRANSAKSI
    --------------------------------------------------------
    */
    
    //tampilkan semua data

    public ArrayList<detail_transaksi> tampil_semua_detail_transaksi(String id) {
        ArrayList<detail_transaksi> list = new ArrayList<detail_transaksi>();
        Connection konek = null;
        Statement stmt = null;
        try {
            Class.forName(driver);
            konek = DriverManager.getConnection(url, user, pass);
            stmt = konek.createStatement();
            String sql;
            sql = "SELECT * FROM detail_transaksi WHERE id_transaksi = "+id+"";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                list.add(new detail_transaksi(
                        rs.getString("id"), 
                        rs.getString("id_transaksi"),
                        rs.getString("id_menu"),
                        Integer.parseInt(rs.getString("jumlah_beli")),
                        Integer.parseInt(rs.getString("total_harga"))
                ));
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
    public void tambah_detail_transaksi(detail_transaksi dt) {
        Connection konek = null;
        Statement stmt = null;
        try {
            Class.forName(driver);
            konek = DriverManager.getConnection(url, user, pass);
            stmt = konek.createStatement();
            String sql;
            sql = "INSERT INTO detail_transaksi VALUES (NULL,'" 
                    +dt.getId_transaksi()+ "','"+dt.getId_menu()+"'"
                    + ","+dt.getJumlah_beli()+","+dt.getTotal_harga()+")";
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

    public void hapusDetail_transaksi(String id) {
        Connection konek = null;
        Statement stmt = null;
        try {
            Class.forName(driver);
            konek = DriverManager.getConnection(url, user, pass);
            stmt = konek.createStatement();
            String sql = "DELETE FROM detail_transaksi WHERE id='" + id + "'";
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

    public void updateDetail_transaksi(detail_transaksi dt) {
        Connection konek = null;
        Statement stmt = null;
        try {
            Class.forName(driver);
            konek = DriverManager.getConnection(url, user, pass);
            stmt = konek.createStatement();
            String sql = "UPDATE detail_transaksi SET id_transaksi = "
                    + "'"+dt.getId_transaksi()+"',"
                    + "id_menu = '"+dt.getId_menu()+"',"
                    + "jumlah_beli = "+dt.getJumlah_beli()+","
                    + "total_harga = "+dt.getTotal_harga()+" "
                    + "WHERE id = '" + dt.getId()+ "'";
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

    public detail_transaksi pilih_detail_transaksi(String id) {
        detail_transaksi dt = null;
        Connection konek = null;
        Statement stmt = null;
        try {
            Class.forName(driver);
            konek = DriverManager.getConnection(url, user, pass);
            stmt = konek.createStatement();
            String sql = "SELECT * FROM detail_transaksi WHERE id = '" + id + "'";
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                dt = new detail_transaksi(
                    rs.getString("id"), 
                    rs.getString("id_transaksi"),
                    rs.getString("id_menu"),
                    Integer.parseInt(rs.getString("jumlah_beli")),
                    Integer.parseInt(rs.getString("total_harga"))
                );
            } else {
                dt = null;
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
        return dt;
    }
    
    public ArrayList<detail_transaksi> filter_detail_transaksi(String keyword, String id) {
        ArrayList<detail_transaksi> list = new ArrayList<detail_transaksi>();
        Connection konek = null;
        Statement stmt = null;
        try {
            Class.forName(driver);
            konek = DriverManager.getConnection(url, user, pass);
            stmt = konek.createStatement();
            String sql;
            sql = "SELECT * FROM detail_transaksi where id_menu like '%"+keyword+"%' AND id_transaksi = '"+id+"' ";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                list.add(new detail_transaksi(
                        rs.getString("id"), 
                        rs.getString("id_transaksi"),
                        rs.getString("id_menu"),
                        Integer.parseInt(rs.getString("jumlah_beli")),
                        Integer.parseInt(rs.getString("total_harga"))
                ));
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
    
    /*
    --------------------------------------------------------
    DATA TRANSAKSI
    --------------------------------------------------------
    */
    
    //tampilkan semua data

    public ArrayList<transaksi> tampil_semua_transaksi() {
        ArrayList<transaksi> list = new ArrayList<transaksi>();
        Connection konek = null;
        Statement stmt = null;
        try {
            Class.forName(driver);
            konek = DriverManager.getConnection(url, user, pass);
            stmt = konek.createStatement();
            String sql;
            sql = "SELECT * FROM transaksi";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                list.add(new transaksi(
                        rs.getString("id"), 
                        rs.getString("tanggal"),
                        Integer.parseInt(rs.getString("total_harga")),
                        Integer.parseInt(rs.getString("bayar")),
                        Integer.parseInt(rs.getString("kembalian")),
                        rs.getString("kasir")
                ));
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
    public void tambah_transaksi(transaksi t) {
        Connection konek = null;
        Statement stmt = null;
        try {
            Class.forName(driver);
            konek = DriverManager.getConnection(url, user, pass);
            stmt = konek.createStatement();
            String sql;
            sql = "INSERT INTO transaksi VALUES (NULL,'" 
                    +t.getTanggal()+ "','"+t.getTotal_harga()+"'"
                    + ","+t.getBayar()+","+t.getKembalian()+""
                    + ","+t.getKasir()+")";
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

    public void hapusTransaksi(String id) {
        Connection konek = null;
        Statement stmt1 = null;
        Statement stmt2 = null;
        try {
            Class.forName(driver);
            konek = DriverManager.getConnection(url, user, pass);
            // QUERY 1
            stmt1 = konek.createStatement();
            String sql1 = "DELETE FROM detail_transaksi WHERE id_transaksi='" + id + "'";
            stmt1.executeUpdate(sql1);
            // QUERY 2
            stmt2 = konek.createStatement();
            String sql2 = "DELETE FROM transaksi WHERE id='" + id + "'";
            stmt2.executeUpdate(sql2);
        } catch (Exception a) {
            System.out.println("Error : " + a.getMessage());
        } finally {
            try {
                stmt1.close();
                stmt2.close();
            } catch (Exception e) {
                try {
                    konek.close();
                } catch (Exception b) {

                }
            }
        }
    }

    public transaksi pilih_transaksi(String id) {
        transaksi t = null;
        Connection konek = null;
        Statement stmt = null;
        try {
            Class.forName(driver);
            konek = DriverManager.getConnection(url, user, pass);
            stmt = konek.createStatement();
            String sql = "SELECT * FROM transaksi WHERE id = '" + id + "'";
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                t = new transaksi(
                    rs.getString("id"), 
                    rs.getString("tanggal"),
                    Integer.parseInt(rs.getString("total_harga")),
                    Integer.parseInt(rs.getString("bayar")),
                    Integer.parseInt(rs.getString("kembalian")),
                    rs.getString("kasir")
                );

            } else {
                t = null;
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
        return t;
    }
    
    public ArrayList<transaksi> filter_transaksi(String keyword) {
        ArrayList<transaksi> list = new ArrayList<transaksi>();
        Connection konek = null;
        Statement stmt = null;
        try {
            Class.forName(driver);
            konek = DriverManager.getConnection(url, user, pass);
            stmt = konek.createStatement();
            String sql;
            sql = "SELECT * FROM transaksi where tanggal like '%"+keyword+"%'";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                list.add(new transaksi(
                        rs.getString("id"), 
                        rs.getString("tanggal"),
                        Integer.parseInt(rs.getString("total_harga")),
                        Integer.parseInt(rs.getString("bayar")),
                        Integer.parseInt(rs.getString("kembalian")),
                        rs.getString("kasir")
                ));
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
    
    /*
    --------------------------------------------------------
    DATA MENU
    --------------------------------------------------------
    */
    
    //tampilkan semua data

    public ArrayList<menu> tampil_semua_menu() {
        ArrayList<menu> list = new ArrayList<menu>();
        Connection konek = null;
        Statement stmt = null;
        try {
            Class.forName(driver);
            konek = DriverManager.getConnection(url, user, pass);
            stmt = konek.createStatement();
            String sql;
            sql = "SELECT * FROM menu";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                list.add(new menu(
                        rs.getString("id"), 
                        rs.getString("id_kategori"),
                        rs.getString("nama_menu"),
                        Integer.parseInt(rs.getString("harga")),
                        Integer.parseInt(rs.getString("stok"))
                ));
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
    public void tambah_menu(menu m) {
        Connection konek = null;
        Statement stmt = null;
        try {
            Class.forName(driver);
            konek = DriverManager.getConnection(url, user, pass);
            stmt = konek.createStatement();
            String sql;
            sql = "INSERT INTO menu VALUES (NULL,'" 
                    +m.getId_kategori()+ "','"+m.getNama_menu()+"'"
                    + ","+m.getHarga()+","+m.getStok()+")";
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

    public void hapusMenu(String id) {
        Connection konek = null;
        Statement stmt = null;
        try {
            Class.forName(driver);
            konek = DriverManager.getConnection(url, user, pass);
            stmt = konek.createStatement();
            String sql = "DELETE FROM menu WHERE id='" + id + "'";
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

    public void updateMenu(menu m) {
        Connection konek = null;
        Statement stmt = null;
        try {
            Class.forName(driver);
            konek = DriverManager.getConnection(url, user, pass);
            stmt = konek.createStatement();
            String sql = "UPDATE menu SET id_kategori = "
                    + "'"+m.getId_kategori()+"',"
                    + "nama_menu = '"+m.getNama_menu()+"',"
                    + "harga = "+m.getHarga()+","
                    + "stok = "+m.getStok()+" "
                    + "WHERE id = '" + m.getId()+ "'";
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

    public menu pilih_menu(String id) {
        menu m = null;
        Connection konek = null;
        Statement stmt = null;
        try {
            Class.forName(driver);
            konek = DriverManager.getConnection(url, user, pass);
            stmt = konek.createStatement();
            String sql = "SELECT * FROM menu WHERE id = '" + id + "'";
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                m = new menu(
                    rs.getString("id"), 
                    rs.getString("id_kategori"),
                    rs.getString("nama_menu"),
                    Integer.parseInt(rs.getString("harga")),
                    Integer.parseInt(rs.getString("stok"))
                );

            } else {
                m = null;
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
        return m;
    }
    
    public ArrayList<menu> filter_menu(String keyword) {
        ArrayList<menu> list = new ArrayList<menu>();
        Connection konek = null;
        Statement stmt = null;
        try {
            Class.forName(driver);
            konek = DriverManager.getConnection(url, user, pass);
            stmt = konek.createStatement();
            String sql;
            sql = "SELECT * FROM menu where nama_menu like '%"+keyword+"%'";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                list.add(new menu(
                        rs.getString("id"), 
                        rs.getString("id_kategori"),
                        rs.getString("nama_menu"),
                        Integer.parseInt(rs.getString("harga")),
                        Integer.parseInt(rs.getString("stok"))
                ));
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
    
    /*
    --------------------------------------------------------
    DATA KATEGORI MENU
    --------------------------------------------------------
    */
    
    //tampilkan semua data

    public ArrayList<kategori> tampil_semua_kategori() {
        ArrayList<kategori> list = new ArrayList<kategori>();
        Connection konek = null;
        Statement stmt = null;
        try {
            Class.forName(driver);
            konek = DriverManager.getConnection(url, user, pass);
            stmt = konek.createStatement();
            String sql;
            sql = "SELECT * FROM kategori";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                list.add(new kategori(rs.getString("id"), 
                        rs.getString("kategori")));
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
    public void tambah_kategori(kategori k) {
        Connection konek = null;
        Statement stmt = null;
        try {
            Class.forName(driver);
            konek = DriverManager.getConnection(url, user, pass);
            stmt = konek.createStatement();
            String sql;
            sql = "INSERT INTO kategori VALUES (NULL,'" +k.getKategori()+ "')";
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

    public void hapusKategori(String id) {
        Connection konek = null;
        Statement stmt = null;
        try {
            Class.forName(driver);
            konek = DriverManager.getConnection(url, user, pass);
            stmt = konek.createStatement();
            String sql = "DELETE FROM kategori WHERE id='" + id + "'";
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

    public void updateKategori(kategori k) {
        Connection konek = null;
        Statement stmt = null;
        try {
            Class.forName(driver);
            konek = DriverManager.getConnection(url, user, pass);
            stmt = konek.createStatement();
            String sql = "UPDATE kategori SET kategori = '" + k.getKategori()+ "' "
                    + "WHERE id = '" + k.getId()+ "'";
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

    public kategori pilih_kategori(String id) {
        kategori k = null;
        Connection konek = null;
        Statement stmt = null;
        try {
            Class.forName(driver);
            konek = DriverManager.getConnection(url, user, pass);
            stmt = konek.createStatement();
            String sql = "SELECT * FROM kategori WHERE id = '" + id + "'";
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                k = new kategori(rs.getString("id"), rs.getString("kategori"));

            } else {
                k = null;
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
        return k;
    }
    
    public ArrayList<kategori> filter_kategori(String keyword) {
        ArrayList<kategori> list = new ArrayList<kategori>();
        Connection konek = null;
        Statement stmt = null;
        try {
            Class.forName(driver);
            konek = DriverManager.getConnection(url, user, pass);
            stmt = konek.createStatement();
            String sql;
            sql = "SELECT * FROM kategori where kategori like '%"+keyword+"%'";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                list.add(new kategori(rs.getString("id"), 
                        rs.getString("kategori")));
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
    
    /*
    --------------------------------------------------------
    DATA PENGGUNA
    --------------------------------------------------------
    */
    
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
    
    /*
    --------------------------------------------------------
    DATA LOGIN
    --------------------------------------------------------
    */
    
    public pengguna login(String username, String password) {
        pengguna p = null;
        Connection konek = null;
        Statement stmt = null;
        try {
            Class.forName(driver);
            konek = DriverManager.getConnection(url, user, pass);
            stmt = konek.createStatement();
            String sql = "SELECT * FROM pengguna WHERE username = '" + username + "' AND password = MD5('" + password + "')";
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                p = new pengguna(
                        rs.getString("nip"),
                        rs.getString("nama"),
                        rs.getString("username"),
                        rs.getString("password")
                );
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
}
