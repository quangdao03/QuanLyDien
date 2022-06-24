
package Views;


import Controller.QLD_contro;
import Model.TaiKhoan1;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class frmtaikhoan extends javax.swing.JInternalFrame {
    DefaultTableModel tbl;
    List<TaiKhoan1> ar = new ArrayList<>();
    String tenDangNhap, matKhau, loaiTaiKhoan;
    boolean ktthem;
    String macu;//dung de luu gia tri truong khoa(tendn)
    public frmtaikhoan() {
        initComponents();
        tbl = (DefaultTableModel) tbdtaikhoan.getModel();
        disignTable();
        khoamo(false);
            laynguonfrm();
        
    }
public void xoatrang(){
    txttdn.setText("");
    txtmk.setText("");
    
}
public void khoamo(boolean b){
    btthem.setEnabled(!b);
    btsua.setEnabled(!b);
    btxoa.setEnabled(!b);
    btghi.setEnabled(b);
    btkhong.setEnabled(b);
    btkt.setEnabled(!b);
    txtmk.setEditable(b);
    txttdn.setEditable(b);
    cbltkhoan.setEnabled(b);
    tbdtaikhoan.setEnabled(!b);
}
  public void laynguonfrm() {
      ar = QLD_contro.laynguonTK();
      tbl.setRowCount(0);//xóa trắng danh sách
      ar.forEach(p->{
        tbl.addRow(new Object[]{
            p.getTenDangNhap(), p.getMatKhau(), p.getLoaiTaiKhoan()
      });
      });
     
  }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txttdn = new javax.swing.JTextField();
        btthem = new javax.swing.JButton();
        btsua = new javax.swing.JButton();
        btxoa = new javax.swing.JButton();
        btghi = new javax.swing.JButton();
        btkhong = new javax.swing.JButton();
        btkt = new javax.swing.JButton();
        txtmk = new javax.swing.JPasswordField();
        cbltkhoan = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbdtaikhoan = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);
        setMaximumSize(new java.awt.Dimension(1614, 965));
        setMinimumSize(new java.awt.Dimension(1614, 965));
        setPreferredSize(new java.awt.Dimension(1614, 965));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông Tin Chi Tiết"));
        jPanel1.setToolTipText("Thông tin chi tiết");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Tên đăng nhập:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Mật Khẩu");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Loại tài khoản");

        txttdn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btthem.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btthem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/icons8_add_20px.png"))); // NOI18N
        btthem.setText("Thêm");
        btthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btthemActionPerformed(evt);
            }
        });

        btsua.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btsua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/icons8_edit_property_20px.png"))); // NOI18N
        btsua.setText("Sửa");
        btsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsuaActionPerformed(evt);
            }
        });

        btxoa.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btxoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/icons8_delete_20px.png"))); // NOI18N
        btxoa.setText("Xóa");
        btxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btxoaActionPerformed(evt);
            }
        });

        btghi.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btghi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/icons8_save_as_20px.png"))); // NOI18N
        btghi.setText("Ghi");
        btghi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btghiActionPerformed(evt);
            }
        });

        btkhong.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btkhong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/icons8_no_entry_20px.png"))); // NOI18N
        btkhong.setText("Không");
        btkhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btkhongActionPerformed(evt);
            }
        });

        btkt.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btkt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/icons8_exit_20px.png"))); // NOI18N
        btkt.setText("Kết Thúc");
        btkt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btktActionPerformed(evt);
            }
        });

        txtmk.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        cbltkhoan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "admin", "NV" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btghi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btthem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btkhong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btsua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btkt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btxoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(47, 47, 47))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(58, 58, 58)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(79, 79, 79)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txttdn)
                            .addComponent(txtmk, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                            .addComponent(cbltkhoan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txttdn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtmk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbltkhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(92, 92, 92)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btthem)
                    .addComponent(btsua)
                    .addComponent(btxoa))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btghi)
                    .addComponent(btkhong)
                    .addComponent(btkt))
                .addContainerGap(164, Short.MAX_VALUE))
        );

        tbdtaikhoan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên Đăng Nhập", "Mật Khẩu", "Loại Tài Khoản"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbdtaikhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbdtaikhoanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbdtaikhoan);
        if (tbdtaikhoan.getColumnModel().getColumnCount() > 0) {
            tbdtaikhoan.getColumnModel().getColumn(0).setResizable(false);
            tbdtaikhoan.getColumnModel().getColumn(1).setResizable(false);
            tbdtaikhoan.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel2.setBackground(new java.awt.Color(255, 153, 51));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("QUẢN LÝ TÀI KHOẢN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 906, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(212, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btghiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btghiActionPerformed
        if(txttdn.getText().length()<=0){
            JOptionPane.showMessageDialog(this,"bạn chưa nhập tên dăng nhập"," Thông báo", JOptionPane.ERROR_MESSAGE);
            txttdn.requestFocus();
            return;
        }
        
        if(txtmk.getText().length()<=0){
            JOptionPane.showMessageDialog(this,"bạn chưa nhập mật khẩu"," Thông báo", JOptionPane.ERROR_MESSAGE);
            txtmk.requestFocus();
            return;
        }
        
        
        if(QLD_contro.kttrungten("TaiKhoan", "tenDangNhap", txttdn.getText(), ktthem, tenDangNhap)==true){
            JOptionPane.showMessageDialog(this,"Tên đăng nhập đã tồn tại"," Thông báo", JOptionPane.ERROR_MESSAGE);
            txttdn.requestFocus();
            return;
        }
        tenDangNhap = txttdn.getText();
        matKhau = txtmk.getText();
        loaiTaiKhoan = cbltkhoan.getSelectedItem().toString();
        TaiKhoan1 tk = new TaiKhoan1(tenDangNhap, matKhau, loaiTaiKhoan);  
        if(ktthem==true)
         
             QLD_contro.themTK(tk);
       
        else{
               QLD_contro.suaTK(tk, macu);
            //laynguon();
           }
//         QLD_contro.themTK(tk);
       laynguonfrm();
        khoamo(false);
    }//GEN-LAST:event_btghiActionPerformed

    private void btthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btthemActionPerformed
        xoatrang();
        ktthem=true;
        khoamo(true);
        txttdn.requestFocus();
    }//GEN-LAST:event_btthemActionPerformed

    private void btsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsuaActionPerformed
        if(txttdn.getText().length()<=0)
            return;
        macu= txttdn.getText();
        ktthem = false;
        khoamo(true);
        txttdn.requestFocus();
    }//GEN-LAST:event_btsuaActionPerformed

    private void btkhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btkhongActionPerformed
        xoatrang();
        khoamo(false);
    }//GEN-LAST:event_btkhongActionPerformed

    private void btktActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btktActionPerformed
        dispose();
    }//GEN-LAST:event_btktActionPerformed

    private void tbdtaikhoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbdtaikhoanMouseClicked
       int id = tbdtaikhoan.getSelectedRow();
        TableModel md = tbdtaikhoan.getModel();
        tenDangNhap = md.getValueAt(id, 0).toString();
        matKhau= md.getValueAt(id, 1).toString();
        loaiTaiKhoan = md.getValueAt(id, 2).toString();
        
        
        txttdn.setText(tenDangNhap);
        txtmk.setText(matKhau);
         cbltkhoan.setSelectedItem(loaiTaiKhoan);
        
    }//GEN-LAST:event_tbdtaikhoanMouseClicked
public void disignTable()//độ rộng jtable
   {
       tbdtaikhoan.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
       tbdtaikhoan.getColumnModel().getColumn(0).setPreferredWidth(200);
       tbdtaikhoan.getColumnModel().getColumn(1).setPreferredWidth(100);
       tbdtaikhoan.getColumnModel().getColumn(2).setPreferredWidth(211);
       
   }
    private void btxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btxoaActionPerformed
       if(txttdn.getText().length()<=0)
          return;
      macu = txttdn.getText();
      for(int i=0;i<ar.size();i++){
          if(ar.get(i).getTenDangNhap().equals(macu)){
              int kq = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa tài khoản đang xem không?", "Thông báo", JOptionPane.YES_NO_OPTION);
              if(kq==JOptionPane.YES_OPTION){
                  QLD_contro.xoaTK(macu);
                  xoatrang();                
                      laynguonfrm();
              }
              return;
          }
      }
    }//GEN-LAST:event_btxoaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btghi;
    private javax.swing.JButton btkhong;
    private javax.swing.JButton btkt;
    private javax.swing.JButton btsua;
    private javax.swing.JButton btthem;
    private javax.swing.JButton btxoa;
    private javax.swing.JComboBox<String> cbltkhoan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbdtaikhoan;
    private javax.swing.JPasswordField txtmk;
    private javax.swing.JTextField txttdn;
    // End of variables declaration//GEN-END:variables
}
