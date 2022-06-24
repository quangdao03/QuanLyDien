package Controller;

//import Model.LoaiDien;
import Model.LoaiDien;
import Model.NhanVien;
import Model.TaiKhoan1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import qldien.QLDIEN;

public class QLD_contro {

    public static Connection con;
    public static Statement st;
    public static String sql;
//    public List<NhanVien> nvlist = new ArrayList<>();
//    public List<NhanVien> Nvlist = new ArrayList<>();
//    public static SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
//    public static Date date;
    public static void themNv(NhanVien nv) {
        con = null;
        PreparedStatement st = null;
        try {
            con = DriverManager.getConnection(QLDIEN.dbURL);
            if(nv.getTenDangNhap().equals("Null")){
                sql = "insert into NhanVien (maNV, tenDangNhap, hoTen, ChucVu, gioiTinh, CCCD, soDT, ngaySinh, diaChi)"
                    + "values('"+nv.getMaNV()+"',NULL,N'"+nv.getHoTen()+"',N'"+nv.getChucVu()+"',N'"+nv.getGioiTinh()+"',"
                    + "'"+nv.getCCCD()+"','"+nv.getSoDT()+"','"+ nv.getNgaySinh()+"',N'"+nv.getDiaChi()+"')";
                st = con.prepareStatement(sql);
            }else{
                sql = "insert into NhanVien (maNV, tenDangNhap, hoTen, ChucVu, gioiTinh, CCCD, soDT, ngaySinh, diaChi)"
                    + "values(?,?,?,?,?,?,?,?,?)"; 
                st = con.prepareStatement(sql);
            st.setString(1, nv.getMaNV());
            st.setString(2, nv.getTenDangNhap());
            st.setString(3, nv.getHoTen());
            st.setString(4, nv.getChucVu());
            st.setString(5, nv.getGioiTinh());
            st.setString(6, nv.getCCCD());
            st.setString(7, nv.getSoDT());
            st.setString(8, nv.getNgaySinh());
            st.setString(9, nv.getDiaChi());
            }
          
//            System.out.println(nv.getMaNV());
//            System.out.println( nv.getTenDangNhap());
//            System.out.println(nv.getHoTen());
//            System.out.println( nv.getChucVu());
//            System.out.println(nv.getGioiTinh());
//            System.out.println( nv.getCCCD());
//            System.out.println( nv.getSoDT());
//            System.out.println(nv.getNgaySinh());
//            System.out.println( nv.getDiaChi());
//            
//            System.out.println(sql);
//            
            
            st.execute();
            st.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(QLD_contro.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    Logger.getLogger(QLD_contro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(QLD_contro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public static void suaNV(NhanVien nv, String maNV) {
        con = null;
        PreparedStatement st = null;
        try {
            con = DriverManager.getConnection(QLDIEN.dbURL);
            if(nv.getTenDangNhap().equals("Null")){
                sql = "update NhanVien set tenDangNhap=NULL, hoTen=N'"+nv.getHoTen()+"', "
                        + "ChucVu= N'"+nv.getChucVu()+"', gioiTinh= N'"+nv.getGioiTinh()+"'"
                        + ", CCCD= '"+nv.getCCCD()+"', soDT='"+nv.getSoDT()+"', ngaySinh='"+ nv.getNgaySinh()+"'"
                        + ", diaChi=N'"+nv.getDiaChi()+"' "
                        +"where maNV='"+nv.getMaNV()+"'";
                st = con.prepareStatement(sql);
            }else{
                sql = "Update NhanVien set tenDangNhap=?, hoTen=?, ChucVu=?, gioiTinh=?, CCCD=?, soDT=?, ngaySinh=?, diaChi=? where maNV=?";
                    
                st = con.prepareStatement(sql);
            
            st.setString(1, nv.getTenDangNhap());
            st.setString(2, nv.getHoTen());
            st.setString(3, nv.getChucVu());
            st.setString(4, nv.getGioiTinh());
            st.setString(5, nv.getCCCD());
            st.setString(6, nv.getSoDT());
            st.setString(7, nv.getNgaySinh());
            st.setString(8, nv.getDiaChi());
            st.setString(9, maNV);
            }
        System.out.println(sql);
            st.execute();
            st.close();
            con.close();
        } catch (SQLException ex) {

        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    Logger.getLogger(QLD_contro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(QLD_contro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public static void xoaNv(String macu) {
        con = null;
        PreparedStatement st = null;
        try {
            con = DriverManager.getConnection(QLDIEN.dbURL);
            sql = "delete from NhanVien where maNV = ?";
            st = con.prepareStatement(sql);
            st.setString(1, macu);
            st.execute();
            st.close();
            con.close();
        } catch (SQLException ex) {

        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    Logger.getLogger(QLD_contro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(QLD_contro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    

    public static List<NhanVien> laynguon() {
        List<NhanVien> arr = new ArrayList<>();
        con = null;
        st = null;

        try {
            con = DriverManager.getConnection(QLDIEN.dbURL);
            sql = "select * from NhanVien";
//            if(smaNV.equals("")==false)
//            sql += " where maNV = '" + smaNV+ "'";
//            sql += " Order by hoTen";
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                NhanVien temp = new NhanVien();
                temp.setMaNV(rs.getString("maNV"));
                temp.setTenDangNhap(rs.getString("tenDangNhap"));
                temp.setHoTen(rs.getString("hoTen"));
                temp.setChucVu(rs.getString("ChucVu"));
                temp.setGioiTinh(rs.getString("gioiTinh"));
                temp.setCCCD(rs.getString("CCCD"));
                temp.setSoDT(rs.getString("soDT"));
                temp.setNgaySinh(rs.getString("ngaySinh"));
                temp.setDiaChi(rs.getString("diaChi"));

                arr.add(temp);
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(QLD_contro.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    Logger.getLogger(QLD_contro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(QLD_contro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        return arr;
    }
     
    public static List<NhanVien> TimKiem(String name){
       List<NhanVien> arr = new ArrayList<>();
       con=null;
       st = null;
       try{
           con=DriverManager.getConnection(QLDIEN.dbURL);
           sql = "select * from NhanVien where hoTen like N'%"+ name + "%'";
           st = con.createStatement();
           ResultSet rs = st.executeQuery(sql);
          while (rs.next()) {
                NhanVien temp = new NhanVien();
                temp.setMaNV(rs.getString("maNV"));
                temp.setTenDangNhap(rs.getString("tenDangNhap"));
                temp.setHoTen(rs.getString("hoTen"));
                temp.setChucVu(rs.getString("ChucVu"));
                temp.setGioiTinh(rs.getString("gioiTinh"));
                temp.setCCCD(rs.getString("CCCD"));
                temp.setSoDT(rs.getString("soDT"));
                temp.setNgaySinh(rs.getString("ngaySinh"));
                temp.setDiaChi(rs.getString("diaChi"));

                arr.add(temp);
            }
           st.close(); con.close();
       }
       catch(SQLException ex){
           
       }
       finally{
         if(st!=null) {
             try{
                 st.close();
             }
             catch(SQLException ex){                 
             }
         }
       }
       return arr;
    }
    //Tài Khoản
   public static List<TaiKhoan1> laynguonTK() {
        List<TaiKhoan1> arr = new ArrayList<>();
        con = null;
        st = null;

        try {
            con = DriverManager.getConnection(QLDIEN.dbURL);
            sql = "select * from TaiKhoan";
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                TaiKhoan1 temp = new TaiKhoan1();
                temp.setTenDangNhap(rs.getString("tenDangNhap"));
                temp.setMatKhau(rs.getString("matKhau"));
                temp.setLoaiTaiKhoan(rs.getString("loaiTaiKhoan"));

                arr.add(temp);
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(QLD_contro.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    Logger.getLogger(QLD_contro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(QLD_contro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        return arr;
    }
    //2.insert.themtaikhoan
    public static void themTK(TaiKhoan1 tk) {
        PreparedStatement st = null;
        try {
            con = DriverManager.getConnection(QLDIEN.dbURL);
            sql = "insert into TaiKhoan ( tenDangNhap, matKhau, loaiTaiKhoan) values (?,?,?)";
            st = con.prepareStatement(sql);
            st.setString(1, tk.getTenDangNhap());
            st.setString(2, tk.getMatKhau());
            st.setString(3, tk.getLoaiTaiKhoan());
            st.execute();
            st.close();
            con.close();
        } catch (SQLException ex) {

        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    Logger.getLogger(QLD_contro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(QLD_contro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    //3.update
    public static void suaTK(TaiKhoan1 tk, String tenDangNhap) {
        con = null;
        PreparedStatement st = null;
        try {
            con = DriverManager.getConnection(QLDIEN.dbURL);
            sql = "update TaiKhoan set tenDangNhap=?, loaiTaiKhoan=? where tenDangNhap=?";
            st = con.prepareStatement(sql);
            st.setString(1, tk.getTenDangNhap());
            //st.setString(2, tk.getMatKhau());
            st.setString(2, tk.getLoaiTaiKhoan());
            st.setString(3, tenDangNhap);
            st.execute();
            st.close();
            con.close();
        } catch (SQLException ex) {

        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    Logger.getLogger(QLD_contro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(QLD_contro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
 //xoa
    public static void xoaTK(String macu) {
        con = null;
        PreparedStatement st = null;
        try {
            con = DriverManager.getConnection(QLDIEN.dbURL);
            sql = "delete from TaiKhoan where tenDangNhap = ?";
            st = con.prepareStatement(sql);
            st.setString(1, macu);
            st.execute();
            st.close();
            con.close();
        } catch (SQLException ex) {

        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    Logger.getLogger(QLD_contro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(QLD_contro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
 
    
    
         //loại điện
   public static List<LoaiDien> laynguonLD() {
        List<LoaiDien> arLD = new ArrayList<>();
        con = null;
        st = null;

        try {
            con = DriverManager.getConnection(QLDIEN.dbURL);
            sql = "select * from LoaiDien";
//            if(smaNV.equals("")==false)
//            sql += " where maNV = '" + smaNV+ "'";
//            sql += " Order by hoTen";
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                LoaiDien temp = new LoaiDien();
                temp.setMaLD(rs.getString("maLD"));
                temp.setTenLD(rs.getString("tenLD"));
                temp.setGiaB1(rs.getString("giaB1"));
                temp.setGiaB2(rs.getString("giaB2"));
                temp.setGiaB3(rs.getString("giaB3"));
                temp.setGiaB4(rs.getString("giaB4"));
                temp.setGiaB5(rs.getString("giaB5"));
                temp.setGiaB6(rs.getString("giaB6"));
                arLD.add(temp);
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(QLD_contro.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    Logger.getLogger(QLD_contro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(QLD_contro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        return arLD;
    }
    //2.insert.themtaikhoan
    public static void themLD(LoaiDien ld) {
        PreparedStatement st = null;
        try {
            con = DriverManager.getConnection(QLDIEN.dbURL);
            sql = "insert into LoaiDien (maLD, tenLD, giaB1, giaB2, giaB3, giaB4, giaB5, giaB6) values (?,?,?,?,?,?,?,?)";
            st = con.prepareStatement(sql);
            st.setString(1, ld.getMaLD());
            st.setString(2, ld.getTenLD());
            st.setString(3, ld.getGiaB1());       
            st.setString(4, ld.getGiaB2());
            st.setString(5, ld.getGiaB3());
            st.setString(6, ld.getGiaB4());
            st.setString(7, ld.getGiaB5());
            st.setString(8, ld.getGiaB6());

            st.execute();
            st.close();
            con.close();
        } catch (SQLException ex) {

        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    Logger.getLogger(QLD_contro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(QLD_contro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    //3.update
    public static void suaLD(LoaiDien ld, String maLD) {
        con = null;
        PreparedStatement st = null;
        try {
            con = DriverManager.getConnection(QLDIEN.dbURL);
            sql = "update LoaiDien set maLD=?, tenLD=?, giaB1=?, giaB2=?, giaB3=?, giaB4=?, giaB5=?, giaB6=? where maLD=?";
            st = con.prepareStatement(sql);
            st.setString(1, ld.getMaLD());
            st.setString(2, ld.getTenLD());
            st.setString(3, ld.getGiaB1());
            st.setString(4, ld.getGiaB2());
            st.setString(5, ld.getGiaB3());
            st.setString(6, ld.getGiaB4());
            st.setString(7, ld.getGiaB5());
            st.setString(8, ld.getGiaB6());
            st.setString(9, maLD);
            st.execute();
            st.close();
            con.close();
        } catch (SQLException ex) {

        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    Logger.getLogger(QLD_contro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(QLD_contro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }


    

  public static boolean kttrungma(String tenbang, String tentruong, String manhap, boolean ktthem, String macu) {
        Connection con = null;
        Statement st = null;
        boolean kq = false;
        try {
            con = DriverManager.getConnection(QLDIEN.dbURL);
            if (ktthem == true) {
                sql = "select * from " + tenbang + " where " + tentruong + " = '" + manhap + "'";
            }else{ 
                sql = "select * from " + tenbang + " where " + tentruong + " = '" + manhap + "' and " + tentruong + "<>'" + macu + "'";
            }
            st=con.createStatement();
            ResultSet rs= st.executeQuery(sql);
            if(rs.next()){
                st.close();
                con.close();
               kq=true; 
            }
            else 
            {
                st.close();
                con.close();
                kq= false;
            }
        } catch (SQLException ex) {
        }finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    Logger.getLogger(QLD_contro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(QLD_contro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        return kq;
    }
    
    public static boolean kttrungten(String tenbang, String tentruong, String manhap, boolean ktthem, String tenDangNhap) {
        Connection con = null;
        Statement st = null;
        boolean kq = false;
        try {
            con = DriverManager.getConnection(QLDIEN.dbURL);
            if (ktthem == true) {
                sql = "select * from " + tenbang + " where " + tentruong + " = '" + manhap + "'";
            }else{ 
                sql = "select * from " + tenbang + " where " + tentruong + " = '" + manhap + "' and " + tentruong + "<>'" + tenDangNhap+ "'";
            }
            st=con.createStatement();
            ResultSet rs= st.executeQuery(sql);
            if(rs.next()){
                st.close();
                con.close();
               kq=true; 
            }
            else 
            {
                st.close();
                con.close();
                kq= false;
            }
        } catch (SQLException ex) {
        }finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    Logger.getLogger(QLD_contro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(QLD_contro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        return kq;
    }  
    
}
