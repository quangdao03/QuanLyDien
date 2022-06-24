/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controller.Connects;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import qldien.QLDIEN;
import Views.frmMain;
//import View.Login;
//import View.QuanLyDien;
//import View.QuanLyDien_NV;
public class frmDoiMatKhau extends javax.swing.JInternalFrame {
    public Connection conn = null;
    public Statement st = null;
    public ResultSet rs = null;
    //public String username, password;
    Connects cn = new Connects();
    
    String tenDangNhap, matKhauCu, matKhauMoi;
 
    public frmDoiMatKhau(String tenDangNhap) {
       this.tenDangNhap= tenDangNhap;
        initComponents();
        this.txttk.setText(tenDangNhap);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txttk = new javax.swing.JTextField();
        txtmkc = new javax.swing.JPasswordField();
        ckpa = new javax.swing.JCheckBox();
        btcap = new javax.swing.JButton();
        btthoat = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtmkm = new javax.swing.JPasswordField();
        txtnlmk = new javax.swing.JPasswordField();
        btlm = new javax.swing.JButton();

        setClosable(true);
        setTitle("Đổi mật khẩu");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("ĐỔI MẬT KHẨU");

        jLabel2.setText("Tài khoản");

        jLabel3.setText("Mật khẩu cũ:");

        jLabel4.setText("Nhập lại mật khẩu");

        txttk.setEditable(false);

        ckpa.setForeground(new java.awt.Color(51, 0, 255));
        ckpa.setText("Hiển thị mật khẩu");
        ckpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckpaActionPerformed(evt);
            }
        });

        btcap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/icons8_edit_property_20px.png"))); // NOI18N
        btcap.setText("Cập nhật");
        btcap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcapActionPerformed(evt);
            }
        });

        btthoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/icons8_exit_20px.png"))); // NOI18N
        btthoat.setText("Thoát");
        btthoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btthoatActionPerformed(evt);
            }
        });

        jLabel6.setText("Mật khẩu mới");

        btlm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/icons8_restart_20px.png"))); // NOI18N
        btlm.setText("Reset");
        btlm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtmkc, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                            .addComponent(txttk)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btcap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtmkm)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ckpa)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(btlm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btthoat, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtnlmk))))
                .addGap(10, 10, 10))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txttk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtmkc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtmkm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtnlmk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ckpa)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btcap)
                    .addComponent(btthoat)
                    .addComponent(btlm))
                .addGap(22, 22, 22))
        );

        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ckpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckpaActionPerformed
         if(ckpa.isSelected())
       {
           txtmkm.setEchoChar((char)0);
           txtmkc.setEchoChar((char)0);
           txtnlmk.setEchoChar((char)0);
       }else
       {
           txtmkm.setEchoChar('*');
           txtmkc.setEchoChar('*');
           txtnlmk.setEchoChar('*');
       }
    }//GEN-LAST:event_ckpaActionPerformed

    private void btcapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcapActionPerformed
   
 try {
            conn = DriverManager.getConnection(QLDIEN.dbURL);
            st = conn.createStatement();
            String query = "SELECT * FROM TaiKhoan WHERE tenDangNhap = '" + txttk.getText() + "'";
            rs = st.executeQuery(query);
            if(txttk.getText().isEmpty()){
                    JOptionPane.showMessageDialog(this, "Bạn chưa nhập tên truy cập","Thông báo", JOptionPane.WARNING_MESSAGE);
            }else{
                while(rs.next()){
                    String matKhauCu = rs.getString("matKhau");
                     if(txtmkc.getText().isEmpty()){
                        JOptionPane.showMessageDialog(this, "Bạn chưa nhập mật khẩu","Thông báo", JOptionPane.WARNING_MESSAGE);
                }else{
                     if(txtmkm.getText().isEmpty()){
                        JOptionPane.showMessageDialog(this, "Bạn chưa nhập mật khẩu mới","Thông báo", JOptionPane.WARNING_MESSAGE);
                }else{
                     if(txtnlmk.getText().isEmpty()){
                        JOptionPane.showMessageDialog(this, "Bạn chưa nhập lại mật khẩu mới","Thông báo", JOptionPane.WARNING_MESSAGE);
                }else{
                     if(!txtmkc.getText().equals(matKhauCu)){
                        JOptionPane.showMessageDialog(this, "Bạn nhập sai mật khẩu","Thông báo", JOptionPane.WARNING_MESSAGE); // so sanh pass cu voi pass cu trong database
                }else{
                     if(txtmkm.getText().equals(txtmkc.getText())){
                        JOptionPane.showMessageDialog(this, "Trùng mật khẩu cũ, mời bạn nhập lại!!!","Thông báo", JOptionPane.WARNING_MESSAGE);
                }else{
                     if(txtmkm.getText().equals(txtnlmk.getText())){
                        String query2 = "UPDATE TaiKhoan SET matKhau = '" + txtmkm.getText() + "' WHERE(tenDangNhap = '" + txttk.getText() + "' AND matKhau = '" + txtmkc.getText() + "')";
                        cn.MakeConnect(query2);
                        JOptionPane.showMessageDialog(this, "Bạn đã thay đổi mật khẩu thành công","Thông báo", JOptionPane.INFORMATION_MESSAGE);
                }else{
                        JOptionPane.showMessageDialog(this, "Bạn nhập lại mật khẩu không đúng","Thông báo", JOptionPane.WARNING_MESSAGE);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(frmDoiMatKhau.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }//GEN-LAST:event_btcapActionPerformed

    private void btthoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btthoatActionPerformed
       int result = JOptionPane.showConfirmDialog(this," Bạn có thật sự muốn thoát không","Thông báo",JOptionPane.YES_NO_OPTION);
        if(result==JOptionPane.YES_OPTION)
        dispose();
    }//GEN-LAST:event_btthoatActionPerformed

    private void btlmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlmActionPerformed
       txtmkc.setText("");
       txtmkm.setText("");
       txtnlmk.setText("");
    }//GEN-LAST:event_btlmActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btcap;
    private javax.swing.JButton btlm;
    private javax.swing.JButton btthoat;
    private javax.swing.JCheckBox ckpa;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtmkc;
    private javax.swing.JPasswordField txtmkm;
    private javax.swing.JPasswordField txtnlmk;
    private javax.swing.JTextField txttk;
    // End of variables declaration//GEN-END:variables

    
}
