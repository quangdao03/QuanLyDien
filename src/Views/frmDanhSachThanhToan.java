
package Views;
import Controller.DanhSachThanhToan_Controller;

import Model.tbKhachHangCS;
import java.awt.Color;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JTable;
import Model.tbChiSo;
import Model.tbThang;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.print.PrinterException;
import java.text.MessageFormat;


public class frmDanhSachThanhToan extends javax.swing.JInternalFrame {
    
    DefaultTableModel tblDanhSachCNSD;
    DefaultTableModel tblDanhSachCTT;
    DefaultTableModel tblDanhSachDTT;
    List<tbKhachHangCS> arr = new ArrayList<>();
    public static String makh,hoten,diachi,sdt,mathang;
    
    List<tbThang> arr1 = new ArrayList<>();
     
    public frmDanhSachThanhToan() {
        initComponents();
        tblDanhSachCNSD=(DefaultTableModel) dgDanhSach.getModel();
        tblDanhSachCTT=(DefaultTableModel) dgDanhSachCTT.getModel();
        tblDanhSachDTT=(DefaultTableModel) dgDanhSachDTT.getModel();
        LayNguon(mathang);
        LayNguonCTT(mathang);
        LayNguonDTT(mathang);
        LayNguonCBO();
        cboThang.setSelectedIndex(-1);
       
        cboThang.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED){
                    LayNguon(cboThang.getSelectedItem().toString());
                    LayNguonCTT(cboThang.getSelectedItem().toString());
                    LayNguonDTT(cboThang.getSelectedItem().toString());
                }
            }
            
        });
        
    }
    
   
    public void LayNguon(String MaThang){
        arr = DanhSachThanhToan_Controller.LayNguonCNSD(MaThang);
        tblDanhSachCNSD.setRowCount(0);
        arr.forEach(p->{
            tblDanhSachCNSD.addRow(new Object[]{
                p.getMakh(),p.getHoten(),p.getDiachi(),p.getNgaysinh(),p.getSdt()
            });
        });
    }
    
    
    public void LayNguonCTT(String MaThang){
        arr = DanhSachThanhToan_Controller.LayNguonCTT(MaThang);
        tblDanhSachCTT.setRowCount(0);
        arr.forEach(p->{
            tblDanhSachCTT.addRow(new Object[]{
                p.getMakh(),p.getHoten(),p.getDiachi(),p.getNgaysinh(),p.getSdt()
            });
        });
    }
    public void LayNguonDTT(String MaThang){
        arr = DanhSachThanhToan_Controller.LayNguonDTT(MaThang);
        tblDanhSachDTT.setRowCount(0);
        arr.forEach(p->{
            tblDanhSachDTT.addRow(new Object[]{
                p.getMakh(),p.getHoten(),p.getDiachi(),p.getNgaysinh(),p.getSdt()
            });
        });
    }
    public void LayNguonCBO(){
        arr1 = DanhSachThanhToan_Controller.LayNguonThang();
        for(int i=0;i<arr1.size();i++){
            cboThang.addItem(String.valueOf(arr1.get(i).getMaThang()));
        }        
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        dgDanhSach = new javax.swing.JTable();
        btnIndanhsach = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        dgDanhSachCTT = new javax.swing.JTable();
        btnIndanhsach1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        dgDanhSachDTT = new javax.swing.JTable();
        btnIndanhsach2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cboThang = new javax.swing.JComboBox<>();

        setClosable(true);
        setTitle("Danh Sách Thanh Toán");
        setMaximumSize(new java.awt.Dimension(1614, 965));
        setMinimumSize(new java.awt.Dimension(1614, 965));
        setPreferredSize(new java.awt.Dimension(1614, 965));

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DANH SÁCH HỘ TIÊU THỤ NỘP - CHƯA NỘP TIỀN ĐIỆN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1588, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jTabbedPane4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        dgDanhSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã khách hàng", "Họ tên", "Địa chỉ", "Ngày sinh", "Số điện thoại"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(dgDanhSach);

        btnIndanhsach.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnIndanhsach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_print_20px.png"))); // NOI18N
        btnIndanhsach.setText("In danh sách");
        btnIndanhsach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIndanhsachActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1528, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnIndanhsach)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnIndanhsach)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane4.addTab("Danh Sách Hộ Chưa Nhập Số Điện", jPanel3);

        dgDanhSachCTT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã khách hàng", "Họ tên", "Địa chỉ", "Ngày sinh", "Số điện thoại"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(dgDanhSachCTT);

        btnIndanhsach1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnIndanhsach1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_print_20px.png"))); // NOI18N
        btnIndanhsach1.setText("In danh sách");
        btnIndanhsach1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIndanhsach1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 1528, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnIndanhsach1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnIndanhsach1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane4.addTab("Danh Sách Hộ Chưa Thanh Toán Trong Tháng", jPanel4);

        dgDanhSachDTT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã khách hàng", "Họ tên", "Địa chỉ", "Ngày sinh", "Số điện thoại"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(dgDanhSachDTT);

        btnIndanhsach2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnIndanhsach2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_print_20px.png"))); // NOI18N
        btnIndanhsach2.setText("In danh sách");
        btnIndanhsach2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIndanhsach2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 1528, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnIndanhsach2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnIndanhsach2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane4.addTab("Danh Sách Hộ Đã Thanh Toán Trong Tháng", jPanel5);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Tháng:");

        cboThang.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboThang, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1553, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cboThang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIndanhsachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIndanhsachActionPerformed
            
                //in danh sách chưa nhập số điện
                String thongtin;
                thongtin = "Danh Sách Hộ Chưa Nhập Số Điện Tháng " + arr1.get(cboThang.getSelectedIndex()).getMaThang();
                 MessageFormat header = new MessageFormat(thongtin);
                 MessageFormat footer = new MessageFormat("Trang (0,number,integer)");
                try {
                    dgDanhSach.print(JTable.PrintMode.FIT_WIDTH, header, footer);
                } catch (PrinterException ex) {
                    java.util.logging.Logger.getLogger(frmDanhSachThanhToan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                
                      
        
    }//GEN-LAST:event_btnIndanhsachActionPerformed

    private void btnIndanhsach1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIndanhsach1ActionPerformed
         // in danh sách ctt
                String thongtin1;            
                thongtin1 = "Danh Sách Hộ Chưa Thanh Toán Tháng " + arr1.get(cboThang.getSelectedIndex()).getMaThang();
                 MessageFormat header1 = new MessageFormat(thongtin1);
                 MessageFormat footer1 = new MessageFormat("Trang (0,number,integer)");
                try {
                    dgDanhSachCTT.print(JTable.PrintMode.FIT_WIDTH, header1, footer1);
                } catch (PrinterException ex) {
                    java.util.logging.Logger.getLogger(frmDanhSachThanhToan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }     
    }//GEN-LAST:event_btnIndanhsach1ActionPerformed

    private void btnIndanhsach2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIndanhsach2ActionPerformed
        // in danh sách dtt
                String thongtin1;            
                thongtin1 = "Danh Sách Hộ Đã Thanh Toán Tháng " + arr1.get(cboThang.getSelectedIndex()).getMaThang();
                 MessageFormat header2 = new MessageFormat(thongtin1);
                 MessageFormat footer2 = new MessageFormat("Trang (0,number,integer)");
                try {
                    dgDanhSachDTT.print(JTable.PrintMode.FIT_WIDTH, header2, footer2);
                } catch (PrinterException ex) {
                    java.util.logging.Logger.getLogger(frmDanhSachThanhToan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }  
    }//GEN-LAST:event_btnIndanhsach2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIndanhsach;
    private javax.swing.JButton btnIndanhsach1;
    private javax.swing.JButton btnIndanhsach2;
    private javax.swing.JComboBox<String> cboThang;
    private javax.swing.JTable dgDanhSach;
    private javax.swing.JTable dgDanhSachCTT;
    private javax.swing.JTable dgDanhSachDTT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane4;
    // End of variables declaration//GEN-END:variables
}
