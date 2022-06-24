/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controller.QLD_contro;
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
import Model.TaiKhoan1;
import Views.frmtaikhoan;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.TableModel;
public class QuanLyNhanVien extends javax.swing.JInternalFrame {

    List<NhanVien> arr= new ArrayList<>();
    List<NhanVien> arrtim= new ArrayList<>();
     List<TaiKhoan1> ar = new ArrayList<>();
    DefaultTableModel tb= new DefaultTableModel();
    private String maNV, tenDangNhap, hoTen, ChucVu, gioiTinh, CCCD, soDT,ngaySinh, diaChi, macu;
    private String matKhau, loaiTaiKhoan;
    private static boolean ktthem;
    public static SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
    public static Date date;
    public QuanLyNhanVien() {
        initComponents();
         tb = (DefaultTableModel) tb2.getModel();
       disignTable();
       khoamo(false);
       khoamoTK(false);  
       khoamoten(false);
       Laynguon();
       
    }
public void khoamo(boolean b)
    {
        btthem.setEnabled(!b);
        btsua.setEnabled(!b);
        btxoa.setEnabled(!b);
        btrs.setEnabled(b);
        btghi.setEnabled(b);
        btkh.setEnabled(b);
        
        txtmnv.setEditable(b); txttnv.setEditable(b);cbcv.setEnabled(b);cbgt.setEnabled(b); txtsdt.setEditable(b);
        txtcccd.setEditable(b); txtns.setEnabled(b); txtdc.setEditable(b); txttk.setEditable(b);
        
        tb2.setEnabled(!b);
    }
public void khoamoTK(boolean a)
    {
        btttk.setEnabled(!a);
        btghitk.setEnabled(a);
        btkgh.setEnabled(a);
        
        txtttk.setEditable(a); txtpass.setEditable(a); cboltkhoan.setEnabled(a);
    }

public void khoamoten(boolean c)
{
    txttk.setEnabled(!c);
}
    public void xoatrang()
    {
        txtmnv.setText(""); txttnv.setText(""); txtsdt.setText(""); txttk.setText("");
        txtcccd.setText(""); txtdc.setText(""); 
    }
 
     public void xoatrangTK()
    {
        txtttk.setText(""); txtpass.setText(""); 
    }
 public void disignTable()//độ rộng jtable
   {
       tb2.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
       tb2.getColumnModel().getColumn(0).setPreferredWidth(100);
       tb2.getColumnModel().getColumn(1).setPreferredWidth(150);
       tb2.getColumnModel().getColumn(2).setPreferredWidth(200);
       tb2.getColumnModel().getColumn(3).setPreferredWidth(100);
       tb2.getColumnModel().getColumn(4).setPreferredWidth(80);
       tb2.getColumnModel().getColumn(5).setPreferredWidth(150);
       tb2.getColumnModel().getColumn(6).setPreferredWidth(100);
       tb2.getColumnModel().getColumn(7).setPreferredWidth(120);
       tb2.getColumnModel().getColumn(8).setPreferredWidth(150);
   }
   public void Laynguon(){
       arr = QLD_contro.laynguon();
       tb.setRowCount(0);//xóa trắng danh sách
       arr.forEach((p)->{
           tb.addRow(new Object[]
           {
               p.getMaNV(), p.getTenDangNhap(), p.getHoTen(), p.getChucVu(), p.getGioiTinh(),
               p.getCCCD(), p.getSoDT(), p.getNgaySinh(), p.getDiaChi()
           });
       });
   }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Desktop = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btthem = new javax.swing.JButton();
        btsua = new javax.swing.JButton();
        btxoa = new javax.swing.JButton();
        btrs = new javax.swing.JButton();
        txtmnv = new javax.swing.JTextField();
        txttnv = new javax.swing.JTextField();
        txttk = new javax.swing.JTextField();
        txtsdt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtcccd = new javax.swing.JTextField();
        btghi = new javax.swing.JButton();
        btkh = new javax.swing.JButton();
        cbgt = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtdc = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cbcv = new javax.swing.JComboBox<>();
        txtns = new com.toedter.calendar.JDateChooser();
        jPanel5 = new javax.swing.JPanel();
        tb1 = new javax.swing.JScrollPane();
        tb2 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtttk = new javax.swing.JTextField();
        txtpass = new javax.swing.JPasswordField();
        btttk = new javax.swing.JButton();
        btghitk = new javax.swing.JButton();
        btkgh = new javax.swing.JButton();
        cboltkhoan = new javax.swing.JComboBox<>();
        txtnhap = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Quản Lý Nhân Viên");
        setMaximumSize(new java.awt.Dimension(1614, 965));
        setMinimumSize(new java.awt.Dimension(1614, 965));
        setPreferredSize(new java.awt.Dimension(1614, 965));

        jPanel2.setBackground(new java.awt.Color(255, 153, 102));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ NHÂN VIÊN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin nhân viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(0, 0, 255))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Mã NV");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Tên NV");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("SĐT");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Tài khoản");

        btthem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btthem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/icons8_add_20px.png"))); // NOI18N
        btthem.setText("Thêm");
        btthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btthemActionPerformed(evt);
            }
        });

        btsua.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btsua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/icons8_edit_property_20px.png"))); // NOI18N
        btsua.setText("Sửa");
        btsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsuaActionPerformed(evt);
            }
        });

        btxoa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btxoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/icons8_delete_20px.png"))); // NOI18N
        btxoa.setText("Xóa");
        btxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btxoaActionPerformed(evt);
            }
        });

        btrs.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btrs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/icons8_restart_20px.png"))); // NOI18N
        btrs.setText("Làm mới");
        btrs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btrsActionPerformed(evt);
            }
        });

        txtmnv.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txttnv.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txttk.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtsdt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("CCCD");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Ngày sinh");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Địa chỉ");

        txtcccd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btghi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btghi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/icons8_save_as_20px.png"))); // NOI18N
        btghi.setText("Ghi");
        btghi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btghiActionPerformed(evt);
            }
        });

        btkh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btkh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/icons8_no_entry_20px.png"))); // NOI18N
        btkh.setText("Không");
        btkh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btkhActionPerformed(evt);
            }
        });

        cbgt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbgt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Giới tính");

        txtdc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Chức vụ");
        jLabel8.setRequestFocusEnabled(false);

        cbcv.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbcv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GĐ", "PGĐ", "NVN", "QL", "Thợ điện" }));

        txtns.setForeground(new java.awt.Color(51, 153, 255));
        txtns.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txttk)
                    .addComponent(cbcv, 0, 194, Short.MAX_VALUE)
                    .addComponent(cbgt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txttnv)
                    .addComponent(txtcccd)
                    .addComponent(txtns, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                    .addComponent(txtdc)
                    .addComponent(txtsdt)))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtmnv, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btghi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btthem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(btxoa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btrs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btsua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btkh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtmnv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttnv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbcv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcccd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(cbgt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(txtns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(txtdc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btthem)
                    .addComponent(btsua))
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btxoa)
                    .addComponent(btrs))
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btghi)
                    .addComponent(btkh))
                .addContainerGap(205, Short.MAX_VALUE))
        );

        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });

        tb2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tb2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã NV", "Tên đăng nhập", "Họ tên", "Chức vụ", "Giới tính", "CCCD", "SĐT", "Ngày sinh", "Địa chỉ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb2MouseClicked(evt);
            }
        });
        tb1.setViewportView(tb2);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thêm tài khoản", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(51, 51, 255))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 255));
        jLabel9.setText("THÊM TÀI KHOẢN");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Tài khoản");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Mật khẩu");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Loại tài khoản");

        txtttk.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtpass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btttk.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btttk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/icons8_add_20px.png"))); // NOI18N
        btttk.setText("Thêm");
        btttk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btttkActionPerformed(evt);
            }
        });

        btghitk.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btghitk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/icons8_save_as_20px.png"))); // NOI18N
        btghitk.setText("Ghi");
        btghitk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btghitkActionPerformed(evt);
            }
        });

        btkgh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btkgh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/icons8_no_entry_20px.png"))); // NOI18N
        btkgh.setText("Không");
        btkgh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btkghActionPerformed(evt);
            }
        });

        cboltkhoan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "admin", "NV" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(20, 20, 20)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtttk, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                            .addComponent(txtpass)
                            .addComponent(cboltkhoan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btttk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btghitk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btkgh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtttk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btttk))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btghitk))
                        .addGap(0, 46, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btkgh)
                            .addComponent(cboltkhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tb1, javax.swing.GroupLayout.PREFERRED_SIZE, 1184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tb1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtnhap.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtnhap.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtnhapInputMethodTextChanged(evt);
            }
        });
        txtnhap.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnhapKeyReleased(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 255));
        jLabel16.setText("TÌM KIẾM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(419, 419, 419)
                        .addComponent(txtnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        Desktop.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
        Desktop.setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btthemActionPerformed

        ktthem =true;
        xoatrang(); khoamo(true);
        txtmnv.requestFocus();

    }//GEN-LAST:event_btthemActionPerformed

    private void btsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsuaActionPerformed

        if(txtmnv.getText().length()<=0)
        return;
        macu= txtmnv.getText();
        ktthem=false; khoamo(true);
        txtmnv.requestFocus();
    }//GEN-LAST:event_btsuaActionPerformed

    private void btxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btxoaActionPerformed

        if(txtmnv.getText().length()<=0)
        return;
        macu = txtmnv.getText();
        for(int i=0;i<arr.size();i++){
            if(arr.get(i).getMaNV().equals(macu)){
                int kq = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa nhân viên đang xem không?", "Thông báo", JOptionPane.YES_NO_OPTION);
                if(kq==JOptionPane.YES_OPTION){
                    QLD_contro.xoaNv(macu);
                    xoatrang();
                    Laynguon();
                }
                return;
            }
        }
    }//GEN-LAST:event_btxoaActionPerformed

    private void btrsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btrsActionPerformed
        //khoamo(true);
        txtmnv.setText(""); txttnv.setText(""); txtsdt.setText(""); txttk.setText("");
        txtcccd.setText(""); txtdc.setText("");

    }//GEN-LAST:event_btrsActionPerformed

    private void btghiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btghiActionPerformed
        
        if(txtmnv.getText().length()<=0){
            JOptionPane.showMessageDialog(this,"bạn chưa nhập mã nhân viên"," Thông báo", JOptionPane.ERROR_MESSAGE);
            txtmnv.requestFocus();
            return;
        }
        if(cbcv.getSelectedItem().equals("GĐ") || cbcv.getSelectedItem().equals("PGĐ") || cbcv.getSelectedItem().equals("QL") || cbcv.getSelectedItem().equals("NVN") )
        {
            if(txttk.getText().length()<=0){
                JOptionPane.showMessageDialog(this,"bạn chưa nhập tài khoản"," Thông báo", JOptionPane.ERROR_MESSAGE);
                txttk.requestFocus();
                return;
            }
             if(QLD_contro.kttrungma("TaiKhoan", "tenDangNhap", txttk.getText(), ktthem, macu)==false){
            JOptionPane.showMessageDialog(this,"Chưa tồn tại tài khoản"," Thông báo", JOptionPane.ERROR_MESSAGE);
            txttk.requestFocus();
            return;
        }
             if(QLD_contro.kttrungten("NhanVien", "tenDangNhap", txttk.getText(), ktthem, tenDangNhap)==true){
            JOptionPane.showMessageDialog(this,"Tên đăng nhập đã tồn tại"," Thông báo", JOptionPane.ERROR_MESSAGE);
            txttk.requestFocus();
            return;

        }
            
        }
//        else if(cbcv.getSelectedItem().equals("Thợ điện"))
//        { 
//            txttk.requestFocus();
//            //khoamoten(true);
//             // continue;
//        }
        //System.out.println("ÁDFGHJKL;'");
        if(txttnv.getText().length()<=0){
            JOptionPane.showMessageDialog(this,"bạn chưa nhập tên nhân viên"," Thông báo", JOptionPane.ERROR_MESSAGE);
            txttnv.requestFocus();
            return;
        }

        if(txtcccd.getText().length()<=0){
            JOptionPane.showMessageDialog(this,"bạn chưa nhập CCCD"," Thông báo", JOptionPane.ERROR_MESSAGE);
            txtcccd.requestFocus();
            return;
        }
        if(txtsdt.getText().length()<=0){
            JOptionPane.showMessageDialog(this,"bạn chưa nhập số điện thoại"," Thông báo", JOptionPane.ERROR_MESSAGE);
            txtsdt.requestFocus();
            return;
        }
        
//        if(txtns.getDate().length()<=0){
//            JOptionPane.showMessageDialog(this,"bạn chưa nhập ngày sinh"," Thông báo", JOptionPane.ERROR_MESSAGE);
//            txtns.requestFocus();
//            return;
//        }
        if(txtdc.getText().length()<=0){
            JOptionPane.showMessageDialog(this,"bạn chưa nhập địa chỉ"," Thông báo", JOptionPane.ERROR_MESSAGE);
            txtdc.requestFocus();
            return;
        }

        if(QLD_contro.kttrungma("NhanVien", "maNV", txtmnv.getText(), ktthem, macu)==true){
            JOptionPane.showMessageDialog(this,"Mã nhân viên đã tồn tại"," Thông báo", JOptionPane.ERROR_MESSAGE);
            txtmnv.requestFocus();
            return;
        }
         
        

        maNV = txtmnv.getText();
        tenDangNhap = txttk.getText();
        hoTen = txttnv.getText();
        ChucVu = cbcv.getSelectedItem().toString();
        gioiTinh = cbgt.getSelectedItem().toString();
        CCCD = txtcccd.getText();
        soDT = txtsdt.getText();
        ngaySinh = df.format(txtns.getDate());
        diaChi = txtdc.getText();
        //System.out.println("1234567890-");
        NhanVien nv1 = new NhanVien(maNV,tenDangNhap,hoTen, ChucVu,gioiTinh,CCCD,soDT,ngaySinh,diaChi);
        if(ktthem==true)
        {
            if(cbcv.getSelectedItem().equals("GĐ") || cbcv.getSelectedItem().equals("PGĐ") || cbcv.getSelectedItem().equals("QL") || cbcv.getSelectedItem().equals("NVN"))
            {
               QLD_contro.themNv(nv1);  
                Laynguon();
                khoamo(false);
                        
            }else {
                tenDangNhap = "Null";
                NhanVien nv2 = new NhanVien(maNV,tenDangNhap,hoTen, ChucVu,gioiTinh,CCCD,soDT,ngaySinh,diaChi);
                QLD_contro.themNv(nv2);
            Laynguon();
            khoamo(false);
            }
            
        }
        else{
            if(cbcv.getSelectedItem().equals("GĐ") || cbcv.getSelectedItem().equals("PGĐ") || cbcv.getSelectedItem().equals("QL") || cbcv.getSelectedItem().equals("NVN"))
            {
               QLD_contro.suaNV(nv1, macu);
                Laynguon();
                khoamo(false);
                        
            }else {
                tenDangNhap = "Null";
                NhanVien nv2 = new NhanVien(maNV,tenDangNhap,hoTen, ChucVu,gioiTinh,CCCD,soDT,ngaySinh,diaChi);
                QLD_contro.suaNV(nv2, macu);
            Laynguon();
            khoamo(false);
            }
        }
        

        Laynguon();
        khoamo(false);
              
         //kiểm tra tồn tại
    }//GEN-LAST:event_btghiActionPerformed

    
   
    
    private void btkhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btkhActionPerformed
        xoatrang();
        khoamo(false);
    }//GEN-LAST:event_btkhActionPerformed

    private void tb2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb2MouseClicked
        int id = tb2.getSelectedRow();
        TableModel md = tb2.getModel();
        maNV = md.getValueAt(id, 0).toString();
        tenDangNhap =((String)(md.getValueAt(id, 1))); 
        hoTen = md.getValueAt(id, 2).toString();
        ChucVu = md.getValueAt(id, 3).toString();
        gioiTinh=md.getValueAt(id, 4).toString();
        CCCD = md.getValueAt(id, 5).toString();
        soDT = md.getValueAt(id, 6).toString();
        ngaySinh = md.getValueAt(id, 7).toString();
        diaChi = md.getValueAt(id, 8).toString();

        txtmnv.setText(maNV);
        txttk.setText(tenDangNhap);  
        txttnv.setText(hoTen);
        cbcv.setSelectedItem(ChucVu);
        cbgt.setSelectedIndex(gioiTinh.toUpperCase().equals("NAM")?0:1);;
        txtcccd.setText(CCCD);
        txtsdt.setText(soDT);
        try {
            date = df.parse(ngaySinh);
           txtns.setDate(date);
        } catch (ParseException ex) {
            Logger.getLogger(QuanLyNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        txtdc.setText(diaChi);

        // khoamo(false);
    }//GEN-LAST:event_tb2MouseClicked

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel5MouseClicked

    private void txtnhapInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtnhapInputMethodTextChanged

    }//GEN-LAST:event_txtnhapInputMethodTextChanged

    private void btttkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btttkActionPerformed
       
        ktthem =true;
        xoatrangTK(); khoamoTK(true);
        txtttk.requestFocus();
    }//GEN-LAST:event_btttkActionPerformed

    private void btkghActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btkghActionPerformed
         xoatrangTK();
        khoamoTK(false);
    }//GEN-LAST:event_btkghActionPerformed

    private void btghitkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btghitkActionPerformed

           if(txtttk.getText().length()<=0){
            JOptionPane.showMessageDialog(this,"bạn chưa nhập tài khoản"," Thông báo", JOptionPane.ERROR_MESSAGE);
            txtttk.requestFocus();
            return;
        }
        if(txtpass.getText().length()<=0){
            JOptionPane.showMessageDialog(this,"bạn chưa nhập mật khẩu"," Thông báo", JOptionPane.ERROR_MESSAGE);
            txtpass.requestFocus();
            return;
        }
      
         if(QLD_contro.kttrungten("NhanVien", "tenDangNhap", txtttk.getText(), ktthem, tenDangNhap)==true){
            JOptionPane.showMessageDialog(this,"Tên đăng nhập đã tồn tại"," Thông báo", JOptionPane.ERROR_MESSAGE);
            txtttk.requestFocus();
            return;

        }
        tenDangNhap = txtttk.getText();
        matKhau = txtpass.getText();
        loaiTaiKhoan = cboltkhoan.getSelectedItem().toString();
        TaiKhoan1 tk = new TaiKhoan1(tenDangNhap, matKhau, loaiTaiKhoan);  
        if(ktthem==true){
             QLD_contro.themTK(tk);
             JOptionPane.showMessageDialog(this,"Thêm thành công","Thông báo",JOptionPane.INFORMATION_MESSAGE);
             xoatrangTK();
        }
             
        else{
               //QLD_contro.suaTK(tk, macu);
            //laynguon();
                JOptionPane.showMessageDialog(this,"Thêm không thành công","Thông báo",JOptionPane.ERROR_MESSAGE);
            //txtnhap.requestFocus();
           }

        khoamoTK(false);
    }//GEN-LAST:event_btghitkActionPerformed

    private void txtnhapKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnhapKeyReleased
         if(txtnhap.getText().length()<=0){
//            JOptionPane.showMessageDialog(this,"Bạn chưa nhập tên muốn tìm kiếm","Thông báo",JOptionPane.ERROR_MESSAGE);
//            txtnhap.requestFocus();
            Laynguon();
            return;
        }
        else{
            String tk=txtnhap.getText();
            arr=QLD_contro.TimKiem(tk);
            tb.setRowCount(0); //Xóa trắng danh sách
            arr.forEach(p->{
                tb.addRow(new Object[]{
                    p.getMaNV(), p.getTenDangNhap(), p.getHoTen(), p.getChucVu(), p.getGioiTinh(),
                    p.getCCCD(), p.getSoDT(), p.getNgaySinh(), p.getDiaChi()
                });
            });
        }
    }//GEN-LAST:event_txtnhapKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Desktop;
    private javax.swing.JButton btghi;
    private javax.swing.JButton btghitk;
    private javax.swing.JButton btkgh;
    private javax.swing.JButton btkh;
    private javax.swing.JButton btrs;
    private javax.swing.JButton btsua;
    private javax.swing.JButton btthem;
    private javax.swing.JButton btttk;
    private javax.swing.JButton btxoa;
    private javax.swing.JComboBox<String> cbcv;
    private javax.swing.JComboBox<Object> cbgt;
    private javax.swing.JComboBox<String> cboltkhoan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane tb1;
    private javax.swing.JTable tb2;
    private javax.swing.JTextField txtcccd;
    private javax.swing.JTextField txtdc;
    private javax.swing.JTextField txtmnv;
    private javax.swing.JTextField txtnhap;
    private com.toedter.calendar.JDateChooser txtns;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtsdt;
    private javax.swing.JTextField txttk;
    private javax.swing.JTextField txttnv;
    private javax.swing.JTextField txtttk;
    // End of variables declaration//GEN-END:variables

   
}
