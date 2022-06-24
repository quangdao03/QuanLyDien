/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;


import Controller.ChiSo_Controller;
import Controller.Thang_Controller;
import static Controller.Thang_Controller.KtraThangMoi;
import Model.tbCapNhatChiSo;
import Model.tbChiSo;
import Model.tbKHCS;
//import View.MainForm;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author 84396
 */
public class mdiChiSo extends javax.swing.JInternalFrame {

    DefaultTableModel tblDS;
    DefaultTableModel tblDSCS;
    List<tbKHCS> arr = new ArrayList<>();
    List<tbChiSo> arr1 = new ArrayList<>();
    boolean kt;
    String macu;
    public static String maKH,tenKH,soDT,diaChi;
    int CSoCu,CSoMoi;
    tbChiSo tb= new tbChiSo();
    int mT,CSM,CSC;
    
    
    public mdiChiSo() throws SQLException {
        initComponents();
        tblDS=(DefaultTableModel) dgDanhSach.getModel();
        tblDSCS=(DefaultTableModel) dgDanhSach1.getModel();
        LayNguon();
        DesignTable();
        DesignTableCSo();
       KhoaMo(true);
    }
    public void LayNguonThang() throws SQLException{
        
        
        tb = Thang_Controller.LayNguon(mdiChiSo.maKH);
        if(KtraThangMoi(tb.getMaThang()+1)==true){
            txtMaThang.setText(String.valueOf(tb.getMaThang()+1));
        }
        else{
            txtMaThang.setText("Chưa có tháng mới!");
            
        }
        txtCSC.setText(String.valueOf(tb.getCSMoi()));
    }
    
   public void LayNguon() throws SQLException{
        arr=ChiSo_Controller.LayNguonKH();
        tblDS.setRowCount(0);
        arr.forEach(p->{
            tblDS.addRow(new Object[]{
                p.getMaKH(),p.getHoTen(),p.getDiaChi(),p.getSDT()
            });
        });
    }
   public void DesignTable(){
        dgDanhSach.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        dgDanhSach.getColumnModel().getColumn(0).setPreferredWidth(250);
        dgDanhSach.getColumnModel().getColumn(1).setPreferredWidth(400);
        dgDanhSach.getColumnModel().getColumn(2).setPreferredWidth(550);
        dgDanhSach.getColumnModel().getColumn(3).setPreferredWidth(300);

    }
   
       public void LayNguonCS(String MaKH) throws SQLException{
              
        arr1=ChiSo_Controller.LayNguonCS(MaKH);
        tblDSCS.setRowCount(0);
        arr1.forEach(p->{
            tblDSCS.addRow(new Object[]{
                p.getMaThang(),p.getNgayDau(),p.getNgayCuoi(),p.getCSCu(),p.getCSMoi()
            });
        });
    }
        public void DesignTableCSo(){
        dgDanhSach1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        dgDanhSach1.getColumnModel().getColumn(0).setPreferredWidth(200);
        dgDanhSach1.getColumnModel().getColumn(1).setPreferredWidth(230);
        dgDanhSach1.getColumnModel().getColumn(2).setPreferredWidth(230);
        dgDanhSach1.getColumnModel().getColumn(3).setPreferredWidth(230);
        dgDanhSach1.getColumnModel().getColumn(4).setPreferredWidth(230);

    }
       public void KhoaMo(boolean b){
           btThemThang.setEnabled(b);
           btnGhiMoi.setEnabled(b);
           btGhi.setEnabled(!b);
           btHuy.setEnabled(!b);
           txtCSM.setEditable(!b);
           btReLoad.setEnabled(b);
           dgDanhSach.setEnabled(b);
           dgDanhSach1.setEnabled(b);
       }
       

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Desktop = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        txtMaKH = new javax.swing.JTextField();
        txtTenKH = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtDiaChi = new javax.swing.JTextArea();
        txtSDT = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTimKiem = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dgDanhSach1 = new javax.swing.JTable();
        btThemThang = new javax.swing.JButton();
        btnGhiMoi = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCSM = new javax.swing.JTextField();
        txtCSC = new javax.swing.JTextField();
        txtMaThang = new javax.swing.JTextField();
        btGhi = new javax.swing.JButton();
        btHuy = new javax.swing.JButton();
        btReLoad = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        dgDanhSach = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        setClosable(true);
        setMaximumSize(new java.awt.Dimension(1614, 965));
        setMinimumSize(new java.awt.Dimension(1614, 965));
        setPreferredSize(new java.awt.Dimension(1614, 965));

        Desktop.setPreferredSize(new java.awt.Dimension(1143, 645));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông Tin Chi Tiết", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(51, 51, 255))); // NOI18N

        txtMaKH.setEditable(false);

        txtTenKH.setEditable(false);

        txtDiaChi.setEditable(false);
        txtDiaChi.setColumns(20);
        txtDiaChi.setRows(5);
        jScrollPane3.setViewportView(txtDiaChi);

        txtSDT.setEditable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Mã Khách Hàng");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Tên Khách Hàng");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Địa Chỉ");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("SĐT");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Tìm Kiếm");

        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSDT)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                    .addComponent(txtTenKH, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtMaKH, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTimKiem))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông Tin Sử Dụng Chi Tiết", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 255))); // NOI18N

        dgDanhSach1.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        dgDanhSach1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Tháng", "Ngày Đầu", "Ngày Cuối", "Chỉ Số Cũ", "Chỉ Số Mới"
            }
        ));
        jScrollPane1.setViewportView(dgDanhSach1);

        btThemThang.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btThemThang.setText("Thêm Tháng Mới");
        btThemThang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemThangActionPerformed(evt);
            }
        });

        btnGhiMoi.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnGhiMoi.setText("Ghi Mới");
        btnGhiMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGhiMoiActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Mã Tháng: ");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Chỉ Số Cũ: ");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("Chỉ Số Mới:");

        txtCSC.setEditable(false);

        txtMaThang.setEditable(false);

        btGhi.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btGhi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/icons8_edit_property_20px.png"))); // NOI18N
        btGhi.setText("Ghi");
        btGhi.setToolTipText("");
        btGhi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGhiActionPerformed(evt);
            }
        });

        btHuy.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btHuy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/icons8_no_entry_20px.png"))); // NOI18N
        btHuy.setText("Không");
        btHuy.setToolTipText("");
        btHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHuyActionPerformed(evt);
            }
        });

        btReLoad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/Refresh.png"))); // NOI18N
        btReLoad.setText("....");
        btReLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btReLoadActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtCSM, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtCSC, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtMaThang, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btGhi, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btHuy, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btReLoad, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMaThang, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCSC, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCSM, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btGhi, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btHuy)
                .addGap(26, 26, 26)
                .addComponent(btReLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(176, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCSM, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btGhi, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCSC, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(btReLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMaThang, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGhiMoi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btThemThang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btThemThang, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGhiMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Khách Hàng"));

        dgDanhSach.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        dgDanhSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Khách Hàng", "Họ Tên", "Địa Chỉ", "Số Điện Thoại"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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
        jScrollPane2.setViewportView(dgDanhSach);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1522, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(0, 153, 255));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("CẬP NHẬT CHỈ SỐ ĐIỆN");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel9)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        Desktop.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desktop.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desktop.setLayer(jPanel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desktop.setLayer(jPanel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
        Desktop.setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DesktopLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DesktopLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DesktopLayout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 1598, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Desktop, javax.swing.GroupLayout.PREFERRED_SIZE, 943, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dgDanhSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dgDanhSachMouseClicked
         int index = dgDanhSach.getSelectedRow();
        TableModel model = dgDanhSach.getModel();
        maKH=model.getValueAt(index, 0).toString();
        tenKH=model.getValueAt(index, 1).toString();
        diaChi=model.getValueAt(index, 2).toString();
        soDT=model.getValueAt(index, 3).toString();
        
        txtMaKH.setText(maKH);
        txtTenKH.setText(tenKH);
        txtDiaChi.setText(diaChi);
        txtSDT.setText(soDT);
        
        try {
            
            LayNguonCS(maKH);
            LayNguonThang();
            
        } catch (SQLException ex) {
            Logger.getLogger(mdiChiSo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dgDanhSachMouseClicked

    private void btnGhiMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGhiMoiActionPerformed
        if(txtMaThang.getText().length()==0){
                KhoaMo(true);
                JOptionPane.showMessageDialog(this," Chưa chọn khách hàng để ghi mới!","Thông Báo",JOptionPane.WARNING_MESSAGE);
                txtCSM.requestFocus();
                return;
        }
        if(txtMaThang.getText().toString().equals("Chưa có tháng mới!")||txtMaThang.getText().length()==0){
                KhoaMo(true);
                JOptionPane.showMessageDialog(this," Chưa có tháng mới vui lòng thêm tháng mới trước!","Thông Báo",JOptionPane.WARNING_MESSAGE);
                txtCSM.requestFocus();
                return;
        }else{
           KhoaMo(false);
      }
       
        
    }//GEN-LAST:event_btnGhiMoiActionPerformed

    private void btThemThangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemThangActionPerformed
        try {
            mdiThemThang frm = new mdiThemThang();
            Desktop.add(frm);
            frm.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(mdiChiSo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btThemThangActionPerformed
    public static boolean isNumeric(String str) { 
         for (char c : str.toCharArray())
    {
        if (!Character.isDigit(c)) return false;
    }
    return true; 
}
    private void btGhiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGhiActionPerformed
        try {
            
            if(isNumeric(txtCSM.getText().toString())==false) {
                JOptionPane.showMessageDialog(this," Chỉ số mới phải là số !","Thông Báo",JOptionPane.WARNING_MESSAGE);
                txtCSM.requestFocus();
                return;
            }    
            if(txtCSM.getText().length()==0){
                JOptionPane.showMessageDialog(this," Vui lòng nhập Chỉ số mới của tháng này trước!","Thông Báo",JOptionPane.WARNING_MESSAGE);
                txtCSM.requestFocus();
                return;
            }
            if(Integer.parseInt(txtCSM.getText())<=Integer.parseInt(txtCSC.getText()) ){
                JOptionPane.showMessageDialog(this," Chỉ số mới lỗi do bé hơn chỉ số cũ!","Thông Báo",JOptionPane.WARNING_MESSAGE);
                txtCSM.requestFocus();
                return;
            }
            
            mT=Integer.parseInt(txtMaThang.getText());
            CSM=Integer.parseInt(txtCSM.getText());
            CSC=Integer.parseInt(txtCSC.getText());
            
            tbCapNhatChiSo tbCB = new tbCapNhatChiSo(maKH,mT,CSM,CSC);
            Thang_Controller.ThemMoi(tbCB);
            KhoaMo(true);
            txtCSM.setText("");
            LayNguonCS(maKH);
            LayNguonThang();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(mdiChiSo.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }//GEN-LAST:event_btGhiActionPerformed

    private void btHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHuyActionPerformed
        KhoaMo(true); 
        txtCSM.setText("");
    }//GEN-LAST:event_btHuyActionPerformed

    private void txtTimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyReleased
        if(txtTimKiem.getText().length()<=0){
         try {
             LayNguon();
             return;
         } catch (SQLException ex) {
             Logger.getLogger(mdiChiSo.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    else{
        String tk=txtTimKiem.getText();
        arr=ChiSo_Controller.TimKiem(tk);
        tblDS.setRowCount(0); //Xóa trắng danh sách
        arr.forEach(p->{
        tblDS.addRow(new Object[]{
         p.getMaKH(),p.getHoTen(),p.getDiaChi(),p.getSDT()   
        });
    });
    }
    }//GEN-LAST:event_txtTimKiemKeyReleased

    private void btReLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btReLoadActionPerformed
        if(txtMaKH.getText().length()>0){
            try {
                LayNguonCS(txtMaKH.getText());
                LayNguonThang();
            } catch (SQLException ex) {
                Logger.getLogger(mdiChiSo.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
    }//GEN-LAST:event_btReLoadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Desktop;
    private javax.swing.JButton btGhi;
    private javax.swing.JButton btHuy;
    private javax.swing.JButton btReLoad;
    private javax.swing.JButton btThemThang;
    private javax.swing.JButton btnGhiMoi;
    private javax.swing.JTable dgDanhSach;
    private javax.swing.JTable dgDanhSach1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField txtCSC;
    private javax.swing.JTextField txtCSM;
    private javax.swing.JTextArea txtDiaChi;
    private javax.swing.JTextField txtMaKH;
    private javax.swing.JTextField txtMaThang;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTenKH;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
