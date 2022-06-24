
package Views;

import Controller.QLD_contro;
import Model.LoaiDien;
import Model.NhanVien;
import qldien.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import javax.swing.JTable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.TableModel;
public class QuanlyLD extends javax.swing.JInternalFrame {
     List<LoaiDien> arr = new ArrayList<>();
    DefaultTableModel tb= new DefaultTableModel();
    public String maLD, tenLD, giaB1, giaB2, giaB3, giaB4, giaB5, giaB6, macu;
    private static boolean ktthem;
    public QuanlyLD() {
        initComponents();
        tb = (DefaultTableModel) tbloaidien.getModel();
       //disignTable();
       khoamo(false);
       Laynguon();
    }
public void khoamo(boolean b)
    {
        btthem.setEnabled(!b);
        btsua.setEnabled(!b);
         
        btrs.setEnabled(b);
        btghi.setEnabled(b);
        btkghi.setEnabled(b);
        
        txtmld.setEditable(b); txttld.setEditable(b);
        txtg1.setEditable(b); txtg2.setEditable(b); txtg3.setEditable(b); 
        txtg4.setEditable(b); txtg5.setEditable(b); txtg6.setEditable(b);
        
        tbloaidien.setEnabled(!b);
    }
public void Laynguon(){
       arr = QLD_contro.laynguonLD();
       tb.setRowCount(0);//xóa trắng danh sách
       arr.forEach((p)->{
           tb.addRow(new Object[]
           {
               p.getMaLD(), p.getTenLD(), p.getGiaB1(), p.getGiaB2(), p.getGiaB3(),
               p.getGiaB4(), p.getGiaB5(), p.getGiaB6()
           });
       });
   }
   public void xoatrang()
    {
       txtmld.setText(""); txttld.setText(""); txtg1.setText("");
        txtg2.setText(""); txtg3.setText(""); txtg4.setText(""); txtg5.setText(""); txtg6.setText("");
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbloaidien = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btthem = new javax.swing.JButton();
        btsua = new javax.swing.JButton();
        btkghi = new javax.swing.JButton();
        btrs = new javax.swing.JButton();
        btghi = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtmld = new javax.swing.JTextField();
        txttld = new javax.swing.JTextField();
        txtg1 = new javax.swing.JTextField();
        txtg2 = new javax.swing.JTextField();
        txtg3 = new javax.swing.JTextField();
        txtg4 = new javax.swing.JTextField();
        txtg5 = new javax.swing.JTextField();
        txtg6 = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Quản Lý Loại Điện");
        setMaximumSize(new java.awt.Dimension(1614, 965));
        setMinimumSize(new java.awt.Dimension(1614, 965));
        setPreferredSize(new java.awt.Dimension(1614, 965));

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ LOẠI ĐIỆN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        tbloaidien.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        tbloaidien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã LD", "Tên LD", "Giá B1", "Giá B2", "Giá B3", "Giá B4", "Giá B5", "Giá B6"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbloaidien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbloaidienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbloaidien);
        if (tbloaidien.getColumnModel().getColumnCount() > 0) {
            tbloaidien.getColumnModel().getColumn(0).setResizable(false);
            tbloaidien.getColumnModel().getColumn(1).setResizable(false);
            tbloaidien.getColumnModel().getColumn(2).setResizable(false);
            tbloaidien.getColumnModel().getColumn(3).setResizable(false);
            tbloaidien.getColumnModel().getColumn(4).setResizable(false);
            tbloaidien.getColumnModel().getColumn(5).setResizable(false);
            tbloaidien.getColumnModel().getColumn(6).setResizable(false);
            tbloaidien.getColumnModel().getColumn(7).setResizable(false);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 973, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chức năng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(0, 0, 204))); // NOI18N

        btthem.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        btthem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/icons8_add_20px.png"))); // NOI18N
        btthem.setText("Thêm");
        btthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btthemActionPerformed(evt);
            }
        });

        btsua.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        btsua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/icons8_edit_property_20px.png"))); // NOI18N
        btsua.setText("Sửa");
        btsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsuaActionPerformed(evt);
            }
        });

        btkghi.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        btkghi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/icons8_no_entry_20px.png"))); // NOI18N
        btkghi.setText("Không");
        btkghi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btkghiActionPerformed(evt);
            }
        });

        btrs.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        btrs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/icons8_restart_20px.png"))); // NOI18N
        btrs.setText("Làm mới");
        btrs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btrsActionPerformed(evt);
            }
        });

        btghi.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        btghi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/icons8_save_as_20px.png"))); // NOI18N
        btghi.setText("Ghi");
        btghi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btghiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btthem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btsua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btrs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(46, 46, 46)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btkghi, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                    .addComponent(btghi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btghi)
                    .addComponent(btthem))
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btsua)
                    .addComponent(btkghi))
                .addGap(45, 45, 45)
                .addComponent(btrs)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin loại điện", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(0, 0, 204))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel2.setText("Mã LD");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel3.setText("Tên LD");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel4.setText("Giá B1");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel5.setText("Giá B2");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel6.setText("Giá B3");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel7.setText("Giá B4");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel8.setText("Giá B5");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel9.setText("Giá B6");

        txtmld.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N

        txttld.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N

        txtg1.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N

        txtg2.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N

        txtg3.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N

        txtg4.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N

        txtg5.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N

        txtg6.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtg3)
                    .addComponent(txtg2)
                    .addComponent(txtg1)
                    .addComponent(txttld)
                    .addComponent(txtmld, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtg4, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtg5, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtg6, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtmld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txttld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtg4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtg2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtg5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtg3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtg6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(97, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 137, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(218, 218, 218))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void btthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btthemActionPerformed
       ktthem =true;
        xoatrang(); khoamo(true);
        txtmld.requestFocus();
    }//GEN-LAST:event_btthemActionPerformed

    private void btsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsuaActionPerformed
         if(txtmld.getText().length()<=0)
        return;
        macu= txtmld.getText();
        ktthem=false; khoamo(true);
        txtmld.requestFocus();
    }//GEN-LAST:event_btsuaActionPerformed

    private void btkghiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btkghiActionPerformed
        xoatrang();
        khoamo(false);
    }//GEN-LAST:event_btkghiActionPerformed

    private void btrsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btrsActionPerformed
        txtmld.setText(""); txttld.setText(""); txtg1.setText(""); txtg2.setText("");
         txtg3.setText(""); txtg4.setText(""); txtg5.setText(""); txtg6.setText("");
    }//GEN-LAST:event_btrsActionPerformed

    private void btghiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btghiActionPerformed
            if(txtmld.getText().length()<=0){
            JOptionPane.showMessageDialog(this,"bạn chưa nhập mã loại điện"," Thông báo", JOptionPane.ERROR_MESSAGE);
            txtmld.requestFocus();
            return;
        }
       if(txttld.getText().length()<=0){
            JOptionPane.showMessageDialog(this,"bạn chưa nhập tên loại điện"," Thông báo", JOptionPane.ERROR_MESSAGE);
            txttld.requestFocus();
            return;
        }
       if(txtg1.getText().length()<=0){
            JOptionPane.showMessageDialog(this,"bạn chưa nhập giá điện bậc 1"," Thông báo", JOptionPane.ERROR_MESSAGE);
            txtg1.requestFocus();
            return;
        }
       if(txtg2.getText().length()<=0){
            JOptionPane.showMessageDialog(this,"bạn chưa nhập giá điện bậc 2"," Thông báo", JOptionPane.ERROR_MESSAGE);
            txtg2.requestFocus();
            return;
        }
       if(txtg3.getText().length()<=0){
            JOptionPane.showMessageDialog(this,"bạn chưa nhập giá điện bậc 3"," Thông báo", JOptionPane.ERROR_MESSAGE);
            txtg3.requestFocus();
            return;
        }
       if(txtg4.getText().length()<=0){
            JOptionPane.showMessageDialog(this,"bạn chưa nhập giá điện bậc 4"," Thông báo", JOptionPane.ERROR_MESSAGE);
            txtg4.requestFocus();
            return;
        }
       if(txtg5.getText().length()<=0){
            JOptionPane.showMessageDialog(this,"bạn chưa nhập giá điện bậc 5"," Thông báo", JOptionPane.ERROR_MESSAGE);
            txtg5.requestFocus();
            return;
        }
       if(txtg6.getText().length()<=0){
            JOptionPane.showMessageDialog(this,"bạn chưa nhập giá điện bậc 6"," Thông báo", JOptionPane.ERROR_MESSAGE);
            txtg6.requestFocus();
            return;
        }
        if(QLD_contro.kttrungma("LoaiDien", "maLD", txtmld.getText(), ktthem, macu)==true){
            JOptionPane.showMessageDialog(this,"Mã loại điện đã tồn tại"," Thông báo", JOptionPane.ERROR_MESSAGE);
            txtmld.requestFocus();
            return;
        }
        maLD = txtmld.getText();
        tenLD = txttld.getText();
        giaB1 = txtg1.getText();
        giaB2 = txtg2.getText();
        giaB3 = txtg3.getText();
        giaB4 = txtg4.getText();
        giaB5 = txtg5.getText();
        giaB6 = txtg6.getText();
        
        LoaiDien ld = new LoaiDien(maLD, tenLD, giaB1, giaB2, giaB3, giaB4, giaB5, giaB6);
        if(ktthem==true){
            QLD_contro.themLD(ld);
            Laynguon();
            khoamo(false);
        }else {
            QLD_contro.suaLD(ld, macu);
        Laynguon();
        khoamo(false);
        }
    }//GEN-LAST:event_btghiActionPerformed

    private void tbloaidienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbloaidienMouseClicked
        int id = tbloaidien.getSelectedRow();
        TableModel md = tbloaidien.getModel();
        maLD = md.getValueAt(id, 0).toString();
        tenLD =((String)(md.getValueAt(id, 1))); 
        giaB1 = md.getValueAt(id, 2).toString();
        giaB2 = md.getValueAt(id, 3).toString();
        giaB3= md.getValueAt(id, 4).toString();
        giaB4 = md.getValueAt(id, 5).toString();
        giaB5 = md.getValueAt(id, 6).toString();
        giaB6 = md.getValueAt(id, 7).toString();


        txtmld.setText(maLD);
        txttld.setText(tenLD);  
        txtg1.setText(giaB1);
        txtg2.setText(giaB2);
        txtg3.setText(giaB3);
        txtg4.setText(giaB4);
        txtg5.setText(giaB5);
        txtg6.setText(giaB6);
       
    }//GEN-LAST:event_tbloaidienMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btghi;
    private javax.swing.JButton btkghi;
    private javax.swing.JButton btrs;
    private javax.swing.JButton btsua;
    private javax.swing.JButton btthem;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbloaidien;
    private javax.swing.JTextField txtg1;
    private javax.swing.JTextField txtg2;
    private javax.swing.JTextField txtg3;
    private javax.swing.JTextField txtg4;
    private javax.swing.JTextField txtg5;
    private javax.swing.JTextField txtg6;
    private javax.swing.JTextField txtmld;
    private javax.swing.JTextField txttld;
    // End of variables declaration//GEN-END:variables
}
