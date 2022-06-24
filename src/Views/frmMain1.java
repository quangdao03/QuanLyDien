
package Views;


import Controller.ThongTin_Controller;
import Model.tbThongTin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import qldien.*;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

public class frmMain1 extends javax.swing.JFrame {
    String tenDangNhap, matKhau;
    public Timer timer;
    public frmMain1(String tenDangNhap) {
        initComponents();
        this.tenDangNhap= frmLogin.UN;
        txttnd.setText(tenDangNhap);
        timer();
        setIconImage(java.awt.Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/iconapp.png")));
    }
   
    
    
    private frmMain1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public void timer() {
        this.timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                java.util.Calendar c = java.util.Calendar.getInstance();
                c.setTime(new java.util.Date());
                String data = c.get(java.util.Calendar.DAY_OF_MONTH) + "/" + (c.get(java.util.Calendar.MONTH) + 1) + "/" + c.get(java.util.Calendar.YEAR);
                String t = c.get(java.util.Calendar.HOUR) + " : " + c.get(java.util.Calendar.MINUTE) ;
                txtTimer.setText(t);
                txtDay.setText(data);
            }
        });
        this.timer.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnQuanLyTienDien = new javax.swing.JButton();
        btnQuanLyHoTieuThu = new javax.swing.JButton();
        btnCapNhatCSDien = new javax.swing.JButton();
        btnDanhSachThanhToan = new javax.swing.JButton();
        btnQuanLyHoaDon = new javax.swing.JButton();
        btnBaoCaoThongKe = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnLoaiDien = new javax.swing.JButton();
        btnBacDien = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        Desktop = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtTimer = new javax.swing.JLabel();
        txtDay = new javax.swing.JLabel();
        txttnd = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jpnKhachHang1 = new javax.swing.JPanel();
        jlbDetail1 = new javax.swing.JLabel();
        jlbNum1 = new javax.swing.JLabel();
        jlbKhachHangIcon3 = new javax.swing.JLabel();
        jpnKhachHang = new javax.swing.JPanel();
        jlbKhachHangIcon = new javax.swing.JLabel();
        jlbDetail = new javax.swing.JLabel();
        txtNumber = new javax.swing.JLabel();
        jpnKhachHang2 = new javax.swing.JPanel();
        jlbKhachHangIcon2 = new javax.swing.JLabel();
        jlbDetail2 = new javax.swing.JLabel();
        jlbNum2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        mnuHeThong = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuDoiMatKhau = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnuDangXuat = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        mnuThoat = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        mnuTroGiup = new javax.swing.JMenu();
        mnuPhimtat = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mnuThongTin = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý Điện");
        setMinimumSize(new java.awt.Dimension(1920, 1080));

        jPanel1.setBackground(new java.awt.Color(82, 83, 81));

        btnQuanLyTienDien.setBackground(new java.awt.Color(255, 153, 51));
        btnQuanLyTienDien.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnQuanLyTienDien.setForeground(new java.awt.Color(255, 255, 255));
        btnQuanLyTienDien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/electricity-bill.png"))); // NOI18N
        btnQuanLyTienDien.setText("QUẢN LÝ TIỀN ĐIỆN");
        btnQuanLyTienDien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanLyTienDienActionPerformed(evt);
            }
        });

        btnQuanLyHoTieuThu.setBackground(new java.awt.Color(226, 125, 96));
        btnQuanLyHoTieuThu.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnQuanLyHoTieuThu.setForeground(new java.awt.Color(255, 255, 255));
        btnQuanLyHoTieuThu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon ho tieu thu.png"))); // NOI18N
        btnQuanLyHoTieuThu.setText("Quản Lý Hộ Tiêu Thụ");
        btnQuanLyHoTieuThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanLyHoTieuThuActionPerformed(evt);
            }
        });

        btnCapNhatCSDien.setBackground(new java.awt.Color(0, 179, 134));
        btnCapNhatCSDien.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnCapNhatCSDien.setForeground(new java.awt.Color(255, 255, 255));
        btnCapNhatCSDien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon cap nhat.png"))); // NOI18N
        btnCapNhatCSDien.setText("Cập Nhật Chỉ Số Điện");
        btnCapNhatCSDien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatCSDienActionPerformed(evt);
            }
        });

        btnDanhSachThanhToan.setBackground(new java.awt.Color(0, 179, 134));
        btnDanhSachThanhToan.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnDanhSachThanhToan.setForeground(new java.awt.Color(255, 255, 255));
        btnDanhSachThanhToan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon danh sach.png"))); // NOI18N
        btnDanhSachThanhToan.setText("Danh Sách Thanh Toán");
        btnDanhSachThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDanhSachThanhToanActionPerformed(evt);
            }
        });

        btnQuanLyHoaDon.setBackground(new java.awt.Color(0, 179, 134));
        btnQuanLyHoaDon.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnQuanLyHoaDon.setForeground(new java.awt.Color(255, 255, 255));
        btnQuanLyHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon hoa don.png"))); // NOI18N
        btnQuanLyHoaDon.setText("Quản Lý Hóa Đơn");
        btnQuanLyHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanLyHoaDonActionPerformed(evt);
            }
        });

        btnBaoCaoThongKe.setBackground(new java.awt.Color(0, 179, 134));
        btnBaoCaoThongKe.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnBaoCaoThongKe.setForeground(new java.awt.Color(255, 255, 255));
        btnBaoCaoThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon thong ke.png"))); // NOI18N
        btnBaoCaoThongKe.setText("Báo Cáo - Thống Kê");
        btnBaoCaoThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBaoCaoThongKeActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("@Nhóm 7 Java - 70DCTT23");

        btnLoaiDien.setBackground(new java.awt.Color(0, 179, 134));
        btnLoaiDien.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnLoaiDien.setForeground(new java.awt.Color(255, 255, 255));
        btnLoaiDien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/outline_tungsten_white_24dp.png"))); // NOI18N
        btnLoaiDien.setText("Quản Lý Loại Điện");
        btnLoaiDien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoaiDienActionPerformed(evt);
            }
        });

        btnBacDien.setBackground(new java.awt.Color(0, 179, 134));
        btnBacDien.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnBacDien.setForeground(new java.awt.Color(255, 255, 255));
        btnBacDien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/outline_published_with_changes_white_24dp.png"))); // NOI18N
        btnBacDien.setText("Quản Lý Bậc Điện");
        btnBacDien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBacDienActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnQuanLyTienDien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnQuanLyHoTieuThu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCapNhatCSDien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDanhSachThanhToan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnQuanLyHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBaoCaoThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLoaiDien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBacDien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnQuanLyTienDien, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnQuanLyHoTieuThu, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCapNhatCSDien, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDanhSachThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnQuanLyHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBaoCaoThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLoaiDien, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBacDien, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jLabel2)
                .addContainerGap(148, Short.MAX_VALUE))
        );

        Desktop.setBackground(new java.awt.Color(240, 240, 240));

        jPanel2.setBackground(new java.awt.Color(255, 204, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/account.png"))); // NOI18N

        txtTimer.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtTimer.setForeground(new java.awt.Color(255, 255, 255));

        txtDay.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtDay.setForeground(new java.awt.Color(255, 255, 255));

        txttnd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txttnd.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDay, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txttnd, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txttnd)
                        .addGap(18, 18, 18)
                        .addComponent(txtTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtDay, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logoEVNHome.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jpnKhachHang1.setBackground(new java.awt.Color(103, 196, 241));

        jlbDetail1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlbDetail1.setForeground(new java.awt.Color(255, 255, 255));
        jlbDetail1.setText("KwH");

        jlbNum1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlbNum1.setForeground(new java.awt.Color(255, 255, 255));
        jlbNum1.setText("65486465");

        jlbKhachHangIcon3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbKhachHangIcon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/electric.png"))); // NOI18N

        javax.swing.GroupLayout jpnKhachHang1Layout = new javax.swing.GroupLayout(jpnKhachHang1);
        jpnKhachHang1.setLayout(jpnKhachHang1Layout);
        jpnKhachHang1Layout.setHorizontalGroup(
            jpnKhachHang1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnKhachHang1Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addGroup(jpnKhachHang1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlbNum1)
                    .addComponent(jlbDetail1))
                .addGap(50, 50, 50))
            .addGroup(jpnKhachHang1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpnKhachHang1Layout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addComponent(jlbKhachHangIcon3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(181, Short.MAX_VALUE)))
        );
        jpnKhachHang1Layout.setVerticalGroup(
            jpnKhachHang1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnKhachHang1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jlbNum1)
                .addGap(53, 53, 53)
                .addComponent(jlbDetail1)
                .addGap(58, 58, 58))
            .addGroup(jpnKhachHang1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnKhachHang1Layout.createSequentialGroup()
                    .addContainerGap(50, Short.MAX_VALUE)
                    .addComponent(jlbKhachHangIcon3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(39, 39, 39)))
        );

        jpnKhachHang.setBackground(new java.awt.Color(255, 85, 85));

        jlbKhachHangIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbKhachHangIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/account.png"))); // NOI18N

        jlbDetail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlbDetail.setForeground(new java.awt.Color(255, 255, 255));
        jlbDetail.setText("Khách Hàng");

        txtNumber.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtNumber.setForeground(new java.awt.Color(255, 255, 255));
        txtNumber.setText("123");

        javax.swing.GroupLayout jpnKhachHangLayout = new javax.swing.GroupLayout(jpnKhachHang);
        jpnKhachHang.setLayout(jpnKhachHangLayout);
        jpnKhachHangLayout.setHorizontalGroup(
            jpnKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnKhachHangLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jlbKhachHangIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jpnKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbDetail)
                    .addComponent(txtNumber, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(55, 55, 55))
        );
        jpnKhachHangLayout.setVerticalGroup(
            jpnKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnKhachHangLayout.createSequentialGroup()
                .addGroup(jpnKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnKhachHangLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(txtNumber)
                        .addGap(52, 52, 52)
                        .addComponent(jlbDetail))
                    .addGroup(jpnKhachHangLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jlbKhachHangIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49))
        );

        jpnKhachHang2.setBackground(new java.awt.Color(121, 195, 70));

        jlbKhachHangIcon2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbKhachHangIcon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dolar.png"))); // NOI18N

        jlbDetail2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlbDetail2.setForeground(new java.awt.Color(255, 255, 255));
        jlbDetail2.setText("Doanh Thu");

        jlbNum2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlbNum2.setForeground(new java.awt.Color(255, 255, 255));
        jlbNum2.setText("8 tỷ VNĐ");

        javax.swing.GroupLayout jpnKhachHang2Layout = new javax.swing.GroupLayout(jpnKhachHang2);
        jpnKhachHang2.setLayout(jpnKhachHang2Layout);
        jpnKhachHang2Layout.setHorizontalGroup(
            jpnKhachHang2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnKhachHang2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jlbKhachHangIcon2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jpnKhachHang2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlbDetail2)
                    .addComponent(jlbNum2))
                .addGap(55, 55, 55))
        );
        jpnKhachHang2Layout.setVerticalGroup(
            jpnKhachHang2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnKhachHang2Layout.createSequentialGroup()
                .addGroup(jpnKhachHang2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnKhachHang2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jlbNum2)
                        .addGap(59, 59, 59)
                        .addComponent(jlbDetail2))
                    .addGroup(jpnKhachHang2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jlbKhachHangIcon2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49))
        );

        jLabel4.setForeground(new java.awt.Color(122, 122, 243));
        jLabel4.setText("  NHỮNG CON SỐ CHỈ MANH TÍNH CHẤT MINH HOẠ (~_~)");

        Desktop.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desktop.setLayer(jPanel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desktop.setLayer(jpnKhachHang1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desktop.setLayer(jpnKhachHang, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desktop.setLayer(jpnKhachHang2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desktop.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
        Desktop.setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DesktopLayout.createSequentialGroup()
                .addGroup(DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DesktopLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(DesktopLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addGroup(DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DesktopLayout.createSequentialGroup()
                        .addComponent(jpnKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(194, 194, 194)
                        .addComponent(jpnKhachHang1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DesktopLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(4, 4, 4)))
                .addGap(194, 194, 194)
                .addComponent(jpnKhachHang2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DesktopLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpnKhachHang1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpnKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpnKhachHang2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 392, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(Desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        mnuHeThong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/setting den.png"))); // NOI18N
        mnuHeThong.setText("Hệ Thống");
        mnuHeThong.add(jSeparator1);

        mnuDoiMatKhau.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuDoiMatKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_password_24px.png"))); // NOI18N
        mnuDoiMatKhau.setText("Đổi Mật Khẩu");
        mnuDoiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuDoiMatKhauActionPerformed(evt);
            }
        });
        mnuHeThong.add(mnuDoiMatKhau);
        mnuHeThong.add(jSeparator2);

        mnuDangXuat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_SPACE, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_logout_rounded_left_24px.png"))); // NOI18N
        mnuDangXuat.setText("Đăng xuất");
        mnuDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuDangXuatActionPerformed(evt);
            }
        });
        mnuHeThong.add(mnuDangXuat);
        mnuHeThong.add(jSeparator4);

        mnuThoat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_close_sign_24px.png"))); // NOI18N
        mnuThoat.setText("Thoát");
        mnuThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuThoatActionPerformed(evt);
            }
        });
        mnuHeThong.add(mnuThoat);
        mnuHeThong.add(jSeparator5);

        jMenuBar2.add(mnuHeThong);

        mnuTroGiup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trogiup.png"))); // NOI18N
        mnuTroGiup.setText("Trợ Giúp");

        mnuPhimtat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuPhimtat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_about_24px.png"))); // NOI18N
        mnuPhimtat.setText("Phím tắt");
        mnuPhimtat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPhimtatActionPerformed(evt);
            }
        });
        mnuTroGiup.add(mnuPhimtat);
        mnuTroGiup.add(jSeparator3);

        mnuThongTin.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuThongTin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_info_24px_1.png"))); // NOI18N
        mnuThongTin.setText("Thông tin");
        mnuThongTin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuThongTinActionPerformed(evt);
            }
        });
        mnuTroGiup.add(mnuThongTin);

        jMenuBar2.add(mnuTroGiup);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuanLyHoTieuThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLyHoTieuThuActionPerformed
        frmQLKhachHang frm = new frmQLKhachHang();
        Desktop.add(frm);
        frm.setVisible(true);
        Main.playSound("soundbutton.wav");
    }//GEN-LAST:event_btnQuanLyHoTieuThuActionPerformed

    private void btnCapNhatCSDienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatCSDienActionPerformed
        try {
            mdiChiSo frm = new mdiChiSo();
            Desktop.add(frm);
            frm.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(frmMain1.class.getName()).log(Level.SEVERE, null, ex);
        }
        Main.playSound("soundbutton.wav");
    }//GEN-LAST:event_btnCapNhatCSDienActionPerformed

    private void btnQuanLyHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLyHoaDonActionPerformed
        mdiQLHoaDon frm = new mdiQLHoaDon();
        Desktop.add(frm);
        frm.setVisible(true);
        Main.playSound("soundbutton.wav");
    }//GEN-LAST:event_btnQuanLyHoaDonActionPerformed

    private void btnQuanLyTienDienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLyTienDienActionPerformed
        
    }//GEN-LAST:event_btnQuanLyTienDienActionPerformed

    private void btnDanhSachThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDanhSachThanhToanActionPerformed
        frmDanhSachThanhToan frm = new frmDanhSachThanhToan();
        Desktop.add(frm);
        
        frm.setVisible(true);
        Main.playSound("soundbutton.wav");
    }//GEN-LAST:event_btnDanhSachThanhToanActionPerformed

    private void btnBaoCaoThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBaoCaoThongKeActionPerformed
        frmBaoCaoTK frm = new frmBaoCaoTK();
        Desktop.add(frm);
        frm.setVisible(true);
        Main.playSound("soundbutton.wav");
    }//GEN-LAST:event_btnBaoCaoThongKeActionPerformed

    private void mnuDoiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDoiMatKhauActionPerformed
        frmDoiMatKhau frm = new frmDoiMatKhau(txttnd.getText());
        Desktop.add(frm);
        frm.setLocation((Desktop.getWidth()-frm.getWidth())/8,(Desktop.getHeight()-frm.getHeight())/2);
        frm.setVisible(true);
        Main.playSound("soundbutton.wav");
    }//GEN-LAST:event_mnuDoiMatKhauActionPerformed

    private void mnuThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuThoatActionPerformed
        dispose();
        Main.playSound("soundbutton.wav");
    }//GEN-LAST:event_mnuThoatActionPerformed

    private void mnuPhimtatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPhimtatActionPerformed
        frmPhimTat1 frm = new frmPhimTat1();
        Desktop.add(frm);
        frm.setLocation((Desktop.getWidth()-frm.getWidth())/2,(Desktop.getHeight()-frm.getHeight())/2);
        frm.setVisible(true);
        Main.playSound("soundbutton.wav");
    }//GEN-LAST:event_mnuPhimtatActionPerformed

    private void mnuDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDangXuatActionPerformed
        int kq = JOptionPane.showConfirmDialog(this, "Bạn có muốn đăng xuất không?", "Thông báo", JOptionPane.YES_NO_OPTION);
        if (kq == JOptionPane.YES_OPTION) {
            dispose();
             frmLogin frm = new frmLogin(); 
            frm.setVisible(true);
            
        }
        Main.playSound("soundbutton.wav");
    }//GEN-LAST:event_mnuDangXuatActionPerformed

    private void mnuThongTinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuThongTinActionPerformed
        frmThongTin frm = new frmThongTin();
        Desktop.add(frm);
        frm.setLocation((Desktop.getWidth()-frm.getWidth())/2,(Desktop.getHeight()-frm.getHeight())/2);
        frm.setVisible(true);
        Main.playSound("soundbutton.wav");
    }//GEN-LAST:event_mnuThongTinActionPerformed

    private void btnLoaiDienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoaiDienActionPerformed
        QuanlyLD frm = new QuanlyLD();
        Desktop.add(frm);
//        frm.setLocation((Desktop.getWidth()-frm.getWidth())/2,(Desktop.getHeight()-frm.getHeight())/2);
        frm.setVisible(true);
        Main.playSound("soundbutton.wav");
    }//GEN-LAST:event_btnLoaiDienActionPerformed

    private void btnBacDienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBacDienActionPerformed
        mdiQLBacDien frm = new mdiQLBacDien();
        Desktop.add(frm);
        frm.setVisible(true);
        Main.playSound("soundbutton.wav");
    }//GEN-LAST:event_btnBacDienActionPerformed

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
            java.util.logging.Logger.getLogger(frmMain1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Desktop;
    private javax.swing.JButton btnBacDien;
    private javax.swing.JButton btnBaoCaoThongKe;
    private javax.swing.JButton btnCapNhatCSDien;
    private javax.swing.JButton btnDanhSachThanhToan;
    private javax.swing.JButton btnLoaiDien;
    private javax.swing.JButton btnQuanLyHoTieuThu;
    private javax.swing.JButton btnQuanLyHoaDon;
    private javax.swing.JButton btnQuanLyTienDien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JLabel jlbDetail;
    private javax.swing.JLabel jlbDetail1;
    private javax.swing.JLabel jlbDetail2;
    private javax.swing.JLabel jlbKhachHangIcon;
    private javax.swing.JLabel jlbKhachHangIcon2;
    private javax.swing.JLabel jlbKhachHangIcon3;
    private javax.swing.JLabel jlbNum1;
    private javax.swing.JLabel jlbNum2;
    private javax.swing.JPanel jpnKhachHang;
    private javax.swing.JPanel jpnKhachHang1;
    private javax.swing.JPanel jpnKhachHang2;
    private javax.swing.JMenuItem mnuDangXuat;
    private javax.swing.JMenuItem mnuDoiMatKhau;
    private javax.swing.JMenu mnuHeThong;
    private javax.swing.JMenuItem mnuPhimtat;
    private javax.swing.JMenuItem mnuThoat;
    private javax.swing.JMenuItem mnuThongTin;
    private javax.swing.JMenu mnuTroGiup;
    private javax.swing.JLabel txtDay;
    private javax.swing.JLabel txtNumber;
    private javax.swing.JLabel txtTimer;
    private javax.swing.JLabel txttnd;
    // End of variables declaration//GEN-END:variables
}
