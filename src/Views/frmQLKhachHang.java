package Views;
import Controller.LoaiDien_Controller;
import java.io.*;
import Controller.QLKhachHang_Controller;
import Model.tbKhachHang;
import Model.tbLoaiDien;
import static Views.QuanLyNhanVien.df;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
public class frmQLKhachHang extends javax.swing.JInternalFrame {
    DefaultTableModel tblDanhSach;
    List<tbKhachHang> arr = new ArrayList<>();
    List<tbLoaiDien> arrLD = new ArrayList<>();
    public boolean ktThem;
    public String macu;
    public String makh, tenkh,ns,sdt, mact, diachi,loaidien;
    public String gt;
    public static SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
    public static Date date;
    
    public frmQLKhachHang() {
        initComponents();
        tblDanhSach = (DefaultTableModel) dgDanhSach.getModel();
        KhoaMo(false);
        LayNguon();
        LayNguonCBO();
    }
    
    public void KhoaMo(boolean b){
        btThem.setEnabled(!b);
        btSua.setEnabled(!b);
        
        btKetThuc.setEnabled(!b);
        btGhi.setEnabled(b);
        btKhong.setEnabled(b);

        dgDanhSach.setEnabled(!b);
        
        txtMaKH.setEditable(b);
        txtTenKH.setEditable(b);
        txtDiaChi.setEditable(b);
        jdatengaysinh.setEnabled(b);
        txtSDT.setEditable(b);
        txtMaCT.setEditable(b);
        cbLoaiDien.setEditable(b);
    }
    
    public void XoaTrang(){
        txtMaKH.setText("");
        txtTenKH.setText("");
        txtDiaChi.setText("");
        
        txtSDT.setText("");
        txtMaCT.setText("");
    }
     
    public void LayNguonCBO(){
        arrLD =LoaiDien_Controller.LayNguon();
        for(int i=0;i<arrLD.size();i++){
            cbLoaiDien.addItem( arrLD.get(i).getTenld());
        }
        
    }
    
    public void LayNguon(){
        arr = QLKhachHang_Controller.LayNguon();
        tblDanhSach.setRowCount(0); //Xóa trắng danh sách
        arr.forEach(p->{
        tblDanhSach.addRow(new Object[]{
            p.getMakh(), p.getTenkh(), p.getGt(),p.getNgaysinh(), p.getDiachi(), p.getMact(), p.getSdt(),p.getLoaidien()
        });
    });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lbTenKH = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btThem = new javax.swing.JButton();
        txtMaKH = new javax.swing.JTextField();
        txtTenKH = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        txtMaCT = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        btSua = new javax.swing.JButton();
        btGhi = new javax.swing.JButton();
        btKhong = new javax.swing.JButton();
        btKetThuc = new javax.swing.JButton();
        TimKiem = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        dgDanhSach = new javax.swing.JTable();
        cbGioiTinh = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbLoaiDien = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jdatengaysinh = new com.toedter.calendar.JDateChooser();

        setClosable(true);
        setTitle("Quản Lý Hộ Tiêu Thụ");
        setMaximumSize(new java.awt.Dimension(1614, 965));
        setMinimumSize(new java.awt.Dimension(1614, 965));
        setPreferredSize(new java.awt.Dimension(1614, 965));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Mã khách hàng:");

        lbTenKH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbTenKH.setText("Tên khách hàng:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Giới tính:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Ngày sinh:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Địa chỉ:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Mã công tơ:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Số điện thoại:");

        btThem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/icons8_add_20px.png"))); // NOI18N
        btThem.setText("Thêm");
        btThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemActionPerformed(evt);
            }
        });

        txtMaKH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMaKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaKHActionPerformed(evt);
            }
        });

        txtTenKH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtSDT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtMaCT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtDiaChi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDiaChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiaChiActionPerformed(evt);
            }
        });

        btSua.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/icons8_edit_property_20px.png"))); // NOI18N
        btSua.setText("Sửa");
        btSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuaActionPerformed(evt);
            }
        });

        btGhi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btGhi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/icons8_save_as_20px.png"))); // NOI18N
        btGhi.setText("Ghi");
        btGhi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGhiActionPerformed(evt);
            }
        });

        btKhong.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btKhong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/icons8_no_entry_20px.png"))); // NOI18N
        btKhong.setText("Không");
        btKhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btKhongActionPerformed(evt);
            }
        });

        btKetThuc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btKetThuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/icons8_exit_20px.png"))); // NOI18N
        btKetThuc.setText("Kết thúc");
        btKetThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btKetThucActionPerformed(evt);
            }
        });

        TimKiem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TimKiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TimKiemMouseClicked(evt);
            }
        });
        TimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimKiemActionPerformed(evt);
            }
        });
        TimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TimKiemKeyReleased(evt);
            }
        });

        dgDanhSach.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dgDanhSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã KH", "Tên KH", "Giới tính", "Ngày sinh", "Địa chỉ", "Mã công tơ", "Số điện thoại", "Loại điện"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        dgDanhSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dgDanhSachMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dgDanhSach);

        cbGioiTinh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbGioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nhập tên khách hàng tìm kiếm:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Loại điện:");

        cbLoaiDien.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("QUẢN LÝ HỘ TIÊU THỤ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel9)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btThem, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbTenKH)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cbGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTenKH)
                                            .addComponent(txtDiaChi)
                                            .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(69, 69, 69)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel8))
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbLoaiDien, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSDT)
                                    .addComponent(txtMaCT, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                                    .addComponent(jdatengaysinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(btSua, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135)
                .addComponent(btGhi, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btKhong)
                .addGap(18, 18, 18)
                .addComponent(btKetThuc)
                .addGap(49, 49, 49))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1570, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdatengaysinh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel1)
                        .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTenKH)
                    .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMaCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cbLoaiDien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btThem)
                    .addComponent(TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSua)
                    .addComponent(btGhi)
                    .addComponent(btKhong)
                    .addComponent(btKetThuc))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDiaChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaChiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaChiActionPerformed

    private void txtMaKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaKHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaKHActionPerformed

    private void btGhiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGhiActionPerformed
    //1. Kiểm tra dữ liệu nhập chưa
    if(txtMaKH.getText().length()<=0){
        JOptionPane.showMessageDialog(this,"Bạn chưa nhập mã khách hàng","Thông báo",JOptionPane.ERROR_MESSAGE);
        txtMaKH.requestFocus();
        return;
    }
    if(txtTenKH.getText().length()<=0){
        JOptionPane.showMessageDialog(this,"Bạn chưa nhập tên khách hàng","Thông báo",JOptionPane.ERROR_MESSAGE);
        txtTenKH.requestFocus();
        return;
    }
    
    if(txtDiaChi.getText().length()<=0){
        JOptionPane.showMessageDialog(this,"Bạn chưa nhập địa chỉ","Thông báo",JOptionPane.ERROR_MESSAGE);
        txtDiaChi.requestFocus();
        return;
    }
    if(txtSDT.getText().length()<=0){
        JOptionPane.showMessageDialog(this,"Bạn chưa nhập số điện thoại","Thông báo",JOptionPane.ERROR_MESSAGE);
        txtSDT.requestFocus();
        return;
    }
    if(txtMaCT.getText().length()<=0){
        JOptionPane.showMessageDialog(this,"Bạn chưa nhập mã công tơ điện","Thông báo",JOptionPane.ERROR_MESSAGE);
        txtMaCT.requestFocus();
        return;
    }
    
    //2. Kiểm tra trùng dữ liệu
    if(QLKhachHang_Controller.KiemTraTrungMa("KhachHang", "maKH",txtMaKH.getText(), ktThem, macu)==true){
        JOptionPane.showMessageDialog(this,"Mã khách hàng đã tồn tại trong CSDL","Thông báo",JOptionPane.ERROR_MESSAGE);
        txtMaKH.requestFocus();
        return;
    }
    //3. Ghi
    makh= txtMaKH.getText();
    tenkh= txtTenKH.getText();
    gt= cbGioiTinh.getSelectedItem().toString();
    ns = df.format(jdatengaysinh.getDate());
    diachi= txtDiaChi.getText();
    mact= txtMaCT.getText();
    sdt= txtSDT.getText();
    loaidien=arrLD.get(cbLoaiDien.getSelectedIndex()).getMald();
    tbKhachHang kh = new tbKhachHang(makh,tenkh,gt,ns,diachi,mact,sdt,loaidien);
    if(ktThem==true)
        QLKhachHang_Controller.ThemKH(kh);
    else
        QLKhachHang_Controller.CapNhatKH(kh, macu);
        LayNguon();
        KhoaMo(false);
        XoaTrang();
    }//GEN-LAST:event_btGhiActionPerformed

    private void btKhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btKhongActionPerformed
    XoaTrang();
    KhoaMo(false);
    }//GEN-LAST:event_btKhongActionPerformed

    private void dgDanhSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dgDanhSachMouseClicked

    int index = dgDanhSach.getSelectedRow();
    TableModel model = dgDanhSach.getModel(); 
    //gt=Boolean.parseBoolean(model.getValueAt(index,2).toString());
    gt=model.getValueAt(index, 2).toString();
    txtMaKH.setText(model.getValueAt(index,0).toString());
    txtTenKH.setText(model.getValueAt(index,1).toString());   
    //cbGioiTinh.setSelectedIndex(gt==true?0:1);
    cbGioiTinh.setSelectedIndex(gt.toUpperCase().equals("NAM")?0:1);
    txtDiaChi.setText(model.getValueAt(index,4).toString());
    ns=model.getValueAt(index,3).toString();
    txtMaCT.setText(model.getValueAt(index,5).toString());
    txtSDT.setText(model.getValueAt(index,6).toString());
    loaidien=model.getValueAt(index,7).toString();
    cbLoaiDien.setSelectedIndex(vtLoaiDien(loaidien));
    
        try {
            date = df.parse(ns);
        } catch (ParseException ex) {
            java.util.logging.Logger.getLogger(frmQLKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
           jdatengaysinh.setDate(date);
    }//GEN-LAST:event_dgDanhSachMouseClicked
    
    public int vtLoaiDien(String mald){
        for(int i=0;i<arrLD.size();i++)
            if(arrLD.get(i).getMald().equals(mald))
                return i;
           return 0;   
    }
    
    private void btThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemActionPerformed
    ktThem=true;
    macu="";
    KhoaMo(true);
    XoaTrang();
    txtMaKH.requestFocus();
    }//GEN-LAST:event_btThemActionPerformed

    private void TimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TimKiemActionPerformed

    private void btKetThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btKetThucActionPerformed
    int result = JOptionPane.showConfirmDialog(this," Bạn có muốn kết thúc không","Thông báo",JOptionPane.YES_NO_OPTION);
        if(result==JOptionPane.YES_OPTION)
        dispose();            
    }//GEN-LAST:event_btKetThucActionPerformed

    private void btSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuaActionPerformed
    if(txtMaKH.getText().length()<=0)
        return;
    ktThem=false; macu=txtMaKH.getText();
    KhoaMo(true);
    txtMaKH.requestFocus();
    }//GEN-LAST:event_btSuaActionPerformed

    private void TimKiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TimKiemMouseClicked

    }//GEN-LAST:event_TimKiemMouseClicked

    private void TimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TimKiemKeyReleased
        if(TimKiem.getText().length()<=0){
        //JOptionPane.showMessageDialog(this,"Bạn chưa nhập tên muốn tìm kiếm","Thông báo",JOptionPane.ERROR_MESSAGE);
        //TimKiem.requestFocus();
        LayNguon();
        return;
    }
    else{
        String tk=TimKiem.getText();
        arr=QLKhachHang_Controller.TimKiem(tk);
        tblDanhSach.setRowCount(0); //Xóa trắng danh sách
        arr.forEach(p->{
        tblDanhSach.addRow(new Object[]{
            p.getMakh(), p.getTenkh(), p.getGt(),p.getNgaysinh(), p.getDiachi(), p.getMact(), p.getSdt()
        });
    });
    }
    }//GEN-LAST:event_TimKiemKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TimKiem;
    private javax.swing.JButton btGhi;
    private javax.swing.JButton btKetThuc;
    private javax.swing.JButton btKhong;
    private javax.swing.JButton btSua;
    private javax.swing.JButton btThem;
    private javax.swing.JComboBox<String> cbGioiTinh;
    private javax.swing.JComboBox<String> cbLoaiDien;
    private javax.swing.JTable dgDanhSach;
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
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdatengaysinh;
    private javax.swing.JLabel lbTenKH;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtMaCT;
    private javax.swing.JTextField txtMaKH;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTenKH;
    // End of variables declaration//GEN-END:variables
}
