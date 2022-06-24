package Views;
import Controller.LoaiDien_Controller;
import Controller.QLBacDien_Controller;
import java.io.*;
import Controller.QLHoaDon_Controller;
import Model.tbBacDien;
import Model.tbDien;
import Model.tbHoaDon;
import Model.tbHoaDonsql;
import Model.tbLoaiDien;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.List;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperReport;
import static qldien.QLDIEN.dbURL;
import java.sql.DriverManager;
import java.sql.Connection;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
public class mdiQLHoaDon extends javax.swing.JInternalFrame {
    DefaultTableModel tblDanhSach;
    DefaultTableModel tblDanhSachHD;
    List<tbDien> arr = new ArrayList<>();
    List<tbHoaDon> arrHD = new ArrayList<>();
    List<tbLoaiDien> arrLD = new ArrayList<>();
    List<tbBacDien> arrBD = new ArrayList<>();
    public boolean ktThem;
    public String macu;
    String mahd,tenkh,ngaydau,ngaycuoi,csm,csc,csd,mald,ngaythanhtoan,tinhtrang,makh,manv;
    int chisomoi,chisocu,sodien,mathang;
    Float giab1,giab2,giab3,giab4,giab5,giab6;
    float tien,tongtien;
    String tiendien,thanhtien;
    public mdiQLHoaDon() {
        initComponents();
        tblDanhSach = (DefaultTableModel) DSGhiDien.getModel();
        tblDanhSachHD = (DefaultTableModel) DSHoaDon.getModel();
        LayNguon();
        LayNguonHD();
        LayNguonCBO();
    }
    public void LayNguon(){
        arr = QLHoaDon_Controller.LayNguon();
        tblDanhSach.setRowCount(0); //Xóa trắng danh sách
        arr.forEach(p->{
        tblDanhSach.addRow(new Object[]{
            p.getTenkh(), p.getNgaydau(), p.getNgaycuoi(),p.getChisomoi(), p.getChisocu(),p.getMaLD(),p.getMakh(),p.getMathang()
        });
    });
    }
    
    public void LayNguonHD(){
        arrHD = QLHoaDon_Controller.LayNguonHD();
        tblDanhSachHD.setRowCount(0); //Xóa trắng danh sách
        arrHD.forEach(p1->{
        tblDanhSachHD.addRow(new Object[]{
            p1.getMahd(), p1.getTenkh(), p1.getNgaydau(),p1.getNgaycuoi(), p1.getLuongdien(),p1.getThanhtien(),p1.getNgaythanhtoan(),p1.getTinhtrang()
        });
    });
    }
    
    public void LayNguonCBO(){
        arrLD =LoaiDien_Controller.LayNguon();
        for(int i=0;i<arrLD.size();i++){
            cbLoaiDien.addItem( arrLD.get(i).getTenld());
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txthtkh = new javax.swing.JTextField();
        txtthangd = new javax.swing.JTextField();
        txtldtt = new javax.swing.JTextField();
        txtttien = new javax.swing.JTextField();
        txtthangc = new javax.swing.JTextField();
        txtmaHD = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        TimKiemHD = new javax.swing.JTextField();
        btInHoaDon = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbLoaiDien = new javax.swing.JComboBox<>();
        TimKiemKH = new javax.swing.JTextField();
        btlaphoadon = new javax.swing.JButton();
        txtTenKH = new javax.swing.JTextField();
        txtNgayDau = new javax.swing.JTextField();
        txtSoDien = new javax.swing.JTextField();
        txtTienDien = new javax.swing.JTextField();
        txtThanhTien = new javax.swing.JTextField();
        txtNgayCuoi = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        DSGhiDien = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        DSHoaDon = new javax.swing.JTable();

        setClosable(true);
        setMaximumSize(new java.awt.Dimension(1614, 965));
        setMinimumSize(new java.awt.Dimension(1614, 965));
        setPreferredSize(new java.awt.Dimension(1614, 965));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin thanh toán", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(51, 51, 255))); // NOI18N
        jPanel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Họ tên KH:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Tháng:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Lượng điện tiêu thụ:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Thành tiền:");

        txthtkh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtthangd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtldtt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtttien.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtmaHD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtmaHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmaHDActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Mã HD:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10))
                .addGap(10, 10, 10)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtthangd, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                            .addComponent(txtldtt))
                        .addGap(121, 121, 121)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtmaHD))
                            .addComponent(txtthangc, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtttien)
                    .addComponent(txthtkh))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txthtkh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtthangd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtthangc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtldtt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmaHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtttien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TimKiemHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimKiemHDActionPerformed(evt);
            }
        });
        TimKiemHD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TimKiemHDKeyReleased(evt);
            }
        });

        btInHoaDon.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btInHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/Price list.png"))); // NOI18N
        btInHoaDon.setText("Thanh toán - In hóa đơn");
        btInHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInHoaDonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TimKiemHD, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btInHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TimKiemHD, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btInHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        jPanel3.setBackground(new java.awt.Color(0, 128, 128));

        jLabel1.setBackground(new java.awt.Color(255, 153, 51));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ HÓA ĐƠN - IN HÓA ĐƠN");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lập hóa đơn", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(51, 51, 255))); // NOI18N
        jPanel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Loại điện:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Họ tên KH:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Tháng:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Số điện:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Tiền điện:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Thành tiền(+10%VAT):");

        cbLoaiDien.setEnabled(false);

        TimKiemKH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TimKiemKHKeyReleased(evt);
            }
        });

        btlaphoadon.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btlaphoadon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/Notes.png"))); // NOI18N
        btlaphoadon.setText(" Lập Hóa Đơn");
        btlaphoadon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlaphoadonActionPerformed(evt);
            }
        });

        txtTenKH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtNgayDau.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNgayDau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNgayDauActionPerformed(evt);
            }
        });

        txtSoDien.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtSoDien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSoDienActionPerformed(evt);
            }
        });

        txtTienDien.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtThanhTien.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtThanhTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtThanhTienActionPerformed(evt);
            }
        });

        txtNgayCuoi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNgayCuoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNgayCuoiActionPerformed(evt);
            }
        });

        jLabel12.setText("/");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TimKiemKH)
                    .addComponent(btlaphoadon, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(130, 130, 130))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtSoDien, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTienDien)
                    .addComponent(txtThanhTien)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtNgayDau, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12)
                        .addGap(13, 13, 13)
                        .addComponent(txtNgayCuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtTenKH)
                    .addComponent(cbLoaiDien, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbLoaiDien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNgayDau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNgayCuoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSoDien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTienDien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtThanhTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(TimKiemKH, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btlaphoadon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2))
        );

        DSGhiDien.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        DSGhiDien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Tên KH", "Ngày Đầu", "Ngày Cuối", "Chỉ số mới", "Chỉ số cũ", "Mã loại điện", "MaKH", "MaThang"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        DSGhiDien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DSGhiDienMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(DSGhiDien);

        DSHoaDon.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        DSHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã Hóa Đơn", "Tên KH", "Ngày đầu", "Ngày cuối", "Lượng điện tiêu thụ", "Tổng tiền", "Ngày lập phiếu", "Thanh toán"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        DSHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DSHoaDonMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(DSHoaDon);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 976, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btlaphoadonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlaphoadonActionPerformed
    arrHD =QLHoaDon_Controller.LayNguonHD();
    int count = arrHD.size(); 
    String ma1 = "HD";
    int ma2;
    ma2 = count + 1;
    mahd = ma1 + String.valueOf(ma2);
  
    tenkh= txtTenKH.getText();
    ngaydau= txtNgayDau.getText();
    ngaycuoi= txtNgayCuoi.getText();
    
    sodien = Integer.parseInt(csd);
    
    thanhtien = txtThanhTien.getText();
    tongtien = Float.parseFloat(thanhtien);
    ngaythanhtoan= String.valueOf(java.time.LocalDate.now());
    
    tinhtrang = "Chưa thanh toán";
    tbHoaDonsql hds = new tbHoaDonsql(mahd,makh,manv,mald,ngaythanhtoan,tongtien,mathang,tinhtrang,sodien);
        QLHoaDon_Controller.ThemHDsql(hds);
        LayNguonHD();
        LayNguon();
    }//GEN-LAST:event_btlaphoadonActionPerformed

    private void txtNgayDauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNgayDauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgayDauActionPerformed

    private void txtSoDienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSoDienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSoDienActionPerformed

    private void DSGhiDienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DSGhiDienMouseClicked
    int index = DSGhiDien.getSelectedRow();
    
    TableModel model = DSGhiDien.getModel(); 
    
    txtTenKH.setText(model.getValueAt(index,0).toString());
    
    ngaydau=model.getValueAt(index,1).toString();
    txtNgayDau.setText(ngaydau);
    
    txtNgayCuoi.setText(model.getValueAt(index,2).toString());
    
    csm = model.getValueAt(index,3).toString();
    chisomoi=Integer.parseInt(csm);
    
    csc = model.getValueAt(index,4).toString();
    chisocu=Integer.parseInt(csc);
    
    sodien=chisomoi-chisocu;
    csd=  String.valueOf(sodien);
    txtSoDien.setText(csd);
    
    mald=model.getValueAt(index,5).toString();
    cbLoaiDien.setSelectedIndex(vtLoaiDien(mald));
    
   makh = model.getValueAt(index,6).toString();
   mathang=Integer.parseInt(model.getValueAt(index,7).toString());
   manv="NV01";
   
   arrBD = QLBacDien_Controller.LayNguonBD();
    float b1=0; float b2=0; float b3=0; float b4=0; float b5=0 ; float b6=0;
    for(int i=0;i<arrLD.size();i++){
    b1=sodien<=arrBD.get(0).getB1()?sodien:arrBD.get(0).getB1();
    b2=sodien<=arrBD.get(0).getB1()?0:(sodien<=(arrBD.get(0).getB1()+arrBD.get(0).getB2())?sodien-(arrBD.get(0).getB1()+arrBD.get(0).getB2()):arrBD.get(0).getB2());
    b3=sodien<=(arrBD.get(0).getB1()+arrBD.get(0).getB2())?0:(sodien<=(arrBD.get(0).getB1()+arrBD.get(0).getB2()+arrBD.get(0).getB3())?sodien-(arrBD.get(0).getB1()+arrBD.get(0).getB2()):arrBD.get(0).getB3());
    b4=sodien<=(arrBD.get(0).getB1()+arrBD.get(0).getB2()+arrBD.get(0).getB3())?0:(sodien<=(arrBD.get(0).getB1()+arrBD.get(0).getB2()+arrBD.get(0).getB3()+arrBD.get(0).getB4())?sodien-(arrBD.get(0).getB1()+arrBD.get(0).getB2()+arrBD.get(0).getB3()):arrBD.get(0).getB4());
    b5=sodien<=(arrBD.get(0).getB1()+arrBD.get(0).getB2()+arrBD.get(0).getB3()+arrBD.get(0).getB4())?0:(sodien<=(arrBD.get(0).getB1()+arrBD.get(0).getB2()+arrBD.get(0).getB3()+arrBD.get(0).getB4()+arrBD.get(0).getB5())?sodien-(arrBD.get(0).getB1()+arrBD.get(0).getB2()+arrBD.get(0).getB3()+arrBD.get(0).getB4()):arrBD.get(0).getB5()); 
    b6=sodien>(arrBD.get(0).getB1()+arrBD.get(0).getB2()+arrBD.get(0).getB3()+arrBD.get(0).getB4()+arrBD.get(0).getB5())?(sodien-(arrBD.get(0).getB1()+arrBD.get(0).getB2()+arrBD.get(0).getB3()+arrBD.get(0).getB4()+arrBD.get(0).getB5())):0;}
    
//    b1=sodien<=arrBD.get(i).getB1()?sodien:50;
//    b2=sodien<=50?0:(sodien<=100?sodien-100:50);
//    b3=sodien<=100?0:(sodien<=200?sodien-100:100);
//    b4=sodien<=200?0:(sodien<=300?sodien-200:100);
//    b5=sodien<=300?0:(sodien<=400?sodien-300:100); 
//    b6=sodien>400?(sodien-400):0;
    
        for(int i=0;i<arrLD.size();i++){
            if(arrLD.get(i).getMald().equals(model.getValueAt(index,5).toString())){
                giab1=b1*arrLD.get(i).getGiab1().floatValue();
                giab2=b2*arrLD.get(i).getGiab2().floatValue();
                giab3=b3*arrLD.get(i).getGiab3().floatValue();
                giab4=b4*arrLD.get(i).getGiab4().floatValue();
                giab5=b5*arrLD.get(i).getGiab5().floatValue();
                giab6=b6*arrLD.get(i).getGiab6().floatValue();
                tien=giab1+giab2+giab3+giab4+giab5+giab6;
                tongtien= tien + tien/10;
                tiendien=String.valueOf(tien);
                thanhtien=String.valueOf(tongtien);
                txtTienDien.setText(tiendien);
                txtThanhTien.setText(thanhtien);
                return;
            }
        }
    }//GEN-LAST:event_DSGhiDienMouseClicked
    
    public int vtLoaiDien(String mald){
        for(int i=0;i<arrLD.size();i++)
            if(arrLD.get(i).getMald().equals(mald))
                return i;
           return 0;   
    }
    
    private void txtNgayCuoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNgayCuoiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgayCuoiActionPerformed

    private void DSHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DSHoaDonMouseClicked
    int index = DSHoaDon.getSelectedRow();
    TableModel model = DSHoaDon.getModel(); 
    txtmaHD.setText(model.getValueAt(index,0).toString());
    txthtkh.setText(model.getValueAt(index,1).toString());
    txtthangd.setText(model.getValueAt(index,2).toString());
    txtthangc.setText(model.getValueAt(index,3).toString());
    txtldtt.setText(model.getValueAt(index,4).toString());
    txtttien.setText(model.getValueAt(index,5).toString());  
    }//GEN-LAST:event_DSHoaDonMouseClicked

    private void btInHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInHoaDonActionPerformed
//    String thongtin;
//    thongtin = "HÓA ĐƠN GTGT (TIỀN ĐIỆN)";
//    MessageFormat header = new MessageFormat(thongtin);
//    MessageFormat footer = new MessageFormat("Trang (0,number,integer)");
//        try {
//            DSHoaDon.print(JTable.PrintMode.FIT_WIDTH, header, footer);
//        } catch (PrinterException ex) {
//            Logger.getLogger(mdiQLHoaDon.class.getName()).log(Level.SEVERE, null, ex);
//        }
    if (txtmaHD.getText().length()<=0)
        JOptionPane.showMessageDialog(this,"Bạn chưa chọn hóa đơn để thanh toán!","Thông báo",JOptionPane.WARNING_MESSAGE);
    else try {
            Hashtable map = new Hashtable();
            JasperReport rpt = JasperCompileManager.compileReport("src/Report/rptHoaDon.jrxml");
            map.put("smaHD", txtmaHD.getText());
            Connection conn = DriverManager.getConnection(dbURL);
            JasperPrint p= JasperFillManager.fillReport(rpt,map,conn);
            JasperViewer.viewReport(p,false);
            QLHoaDon_Controller.Update(txtmaHD.getText());
            LayNguonHD();
        } catch (JRException ex) {
            Logger.getLogger(mdiQLHoaDon.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(mdiQLHoaDon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btInHoaDonActionPerformed

    private void txtThanhTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtThanhTienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtThanhTienActionPerformed

    private void TimKiemHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimKiemHDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TimKiemHDActionPerformed

    private void txtmaHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmaHDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmaHDActionPerformed

    private void TimKiemKHKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TimKiemKHKeyReleased
    if(TimKiemKH.getText().length()<=0){
        LayNguon();
        return;
    }
    else{
        String tk=TimKiemKH.getText();
        arr=QLHoaDon_Controller.TimKiemKH(tk);
        tblDanhSach.setRowCount(0); //Xóa trắng danh sách
        arr.forEach(p->{
        tblDanhSach.addRow(new Object[]{
            p.getTenkh(), p.getNgaydau(), p.getNgaycuoi(),p.getChisomoi(), p.getChisocu(),p.getMaLD(),p.getMakh(),p.getMathang()
        });
    });
    }
    }//GEN-LAST:event_TimKiemKHKeyReleased

    private void TimKiemHDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TimKiemHDKeyReleased
    if(TimKiemHD.getText().length()<=0){
        LayNguonHD();
        return;
    }
    else{
        String hd=TimKiemHD.getText();
        arrHD=QLHoaDon_Controller.TimKiemHD(hd);
        tblDanhSachHD.setRowCount(0); //Xóa trắng danh sách
        arrHD.forEach(p1->{
        tblDanhSachHD.addRow(new Object[]{
            p1.getMahd(), p1.getTenkh(), p1.getNgaydau(),p1.getNgaycuoi(), p1.getLuongdien(),p1.getThanhtien(),p1.getNgaythanhtoan(),p1.getTinhtrang()
        });
    });
    }
    }//GEN-LAST:event_TimKiemHDKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DSGhiDien;
    private javax.swing.JTable DSHoaDon;
    private javax.swing.JTextField TimKiemHD;
    private javax.swing.JTextField TimKiemKH;
    private javax.swing.JButton btInHoaDon;
    private javax.swing.JButton btlaphoadon;
    private javax.swing.JComboBox<String> cbLoaiDien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtNgayCuoi;
    private javax.swing.JTextField txtNgayDau;
    private javax.swing.JTextField txtSoDien;
    private javax.swing.JTextField txtTenKH;
    private javax.swing.JTextField txtThanhTien;
    private javax.swing.JTextField txtTienDien;
    private javax.swing.JTextField txthtkh;
    private javax.swing.JTextField txtldtt;
    private javax.swing.JTextField txtmaHD;
    private javax.swing.JTextField txtthangc;
    private javax.swing.JTextField txtthangd;
    private javax.swing.JTextField txtttien;
    // End of variables declaration//GEN-END:variables
}
