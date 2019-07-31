/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import main.desktopPaneBG;
import main.sessionPengguna;
import views.detail_transaksiViews;
import views.homeViews;
import views.kategoriViews;
import views.menuViews;
import views.penggunaViews;
import views.tambahAlurDetailTransaksiViews;
import views.tambahAlurTransaksiViews;
import views.transaksiViews;

/**
 *
 * @author bandi
 */
public class mainFrame extends javax.swing.JFrame {

    /**
     * Creates new form mainFrame
     */
    
    // Session
    String username = sessionPengguna.getS_username();
    
    homeViews home = new homeViews();
    menuViews menu = new menuViews();
    transaksiViews transaksi = new transaksiViews();
    penggunaViews pengguna = new penggunaViews();
    kategoriViews kategori = new kategoriViews();
    
    public mainFrame() {
        initComponents();
        lblSessionUsername.setText(username);
        
        desktopPane.add(home);
        desktopPane.add(menu);
        desktopPane.add(transaksi);
        desktopPane.add(pengguna);
        desktopPane.add(kategori);
        
        //Hide Visible
        menu.setVisible(false);
        transaksi.setVisible(false);
        pengguna.setVisible(false);
        kategori.setVisible(false);
        //Show Visible
        home.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        desktopPane = new javax.swing.JDesktopPane();
        btnMenuKategoriMenu = new javax.swing.JButton();
        btnMenuMenu = new javax.swing.JButton();
        btnMenuPengguna = new javax.swing.JButton();
        btnMenuTransaksi = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblSessionUsername = new javax.swing.JLabel();
        btnHome = new javax.swing.JButton();
        btnTentang = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPane.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 736, Short.MAX_VALUE)
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 579, Short.MAX_VALUE)
        );

        btnMenuKategoriMenu.setText("Kategori Menu");
        btnMenuKategoriMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuKategoriMenuActionPerformed(evt);
            }
        });

        btnMenuMenu.setText("Menu");
        btnMenuMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuMenuActionPerformed(evt);
            }
        });

        btnMenuPengguna.setText("Pengguna");
        btnMenuPengguna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuPenggunaActionPerformed(evt);
            }
        });

        btnMenuTransaksi.setText("Transaksi");
        btnMenuTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuTransaksiActionPerformed(evt);
            }
        });

        jLabel1.setText("Selamat Datang,");

        lblSessionUsername.setText("-");

        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnTentang.setText("Tentang");
        btnTentang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTentangActionPerformed(evt);
            }
        });

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnMenuKategoriMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMenuMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMenuPengguna, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMenuTransaksi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTentang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblSessionUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLogout))
                    .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblSessionUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogout))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnHome)
                        .addGap(18, 18, 18)
                        .addComponent(btnMenuKategoriMenu)
                        .addGap(18, 18, 18)
                        .addComponent(btnMenuMenu)
                        .addGap(23, 23, 23)
                        .addComponent(btnMenuTransaksi)
                        .addGap(26, 26, 26)
                        .addComponent(btnMenuPengguna)
                        .addGap(297, 297, 297)
                        .addComponent(btnTentang))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        //Hide Visible
        menu.setVisible(false);
        transaksi.setVisible(false);
        pengguna.setVisible(false);
        kategori.setVisible(false);
        //Show Visible
        home.setVisible(true);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnMenuKategoriMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuKategoriMenuActionPerformed
        // TODO add your handling code here:
        //Hide Visible
        home.setVisible(false);
        transaksi.setVisible(false);
        pengguna.setVisible(false);
        menu.setVisible(false);
        //Show Visible
        kategori.setVisible(true);
    }//GEN-LAST:event_btnMenuKategoriMenuActionPerformed

    private void btnMenuMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuMenuActionPerformed
        // TODO add your handling code here:
        //Hide Visible
        home.setVisible(false);
        transaksi.setVisible(false);
        pengguna.setVisible(false);
        kategori.setVisible(false);
        //Show Visible
        menu.setVisible(true);
    }//GEN-LAST:event_btnMenuMenuActionPerformed

    private void btnMenuTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuTransaksiActionPerformed
        // TODO add your handling code here:
        //Hide Visible
        menu.setVisible(false);
        home.setVisible(false);
        pengguna.setVisible(false);
        kategori.setVisible(false);
        //Show Visible
        transaksi.setVisible(true);
    }//GEN-LAST:event_btnMenuTransaksiActionPerformed

    private void btnMenuPenggunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuPenggunaActionPerformed
        // TODO add your handling code here:
        //Hide Visible
        menu.setVisible(false);
        transaksi.setVisible(false);
        home.setVisible(false);
        kategori.setVisible(false);
        //Show Visible
        pengguna.setVisible(true);
    }//GEN-LAST:event_btnMenuPenggunaActionPerformed

    private void btnTentangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTentangActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "Dibuat oleh: Chiqo, Geo, Yusrizal (IF-2)");
    }//GEN-LAST:event_btnTentangActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        sessionPengguna.setS_nip(null);
        sessionPengguna.setS_nama(null);
        sessionPengguna.setS_username(null);
        authFrame auth = new authFrame();
        auth.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMenuKategoriMenu;
    private javax.swing.JButton btnMenuMenu;
    private javax.swing.JButton btnMenuPengguna;
    private javax.swing.JButton btnMenuTransaksi;
    private javax.swing.JButton btnTentang;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JLabel lblSessionUsername;
    // End of variables declaration//GEN-END:variables

    public JDesktopPane getDesktopPane() {
        return desktopPane;
    }

    public void setDesktopPane(JDesktopPane desktopPane) {
        this.desktopPane = desktopPane;
    }
}
