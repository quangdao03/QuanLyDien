
package Controller;
import Model.tbKhachHangCS;
import Model.tbThang;
import java.util.List;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static qldien.QLDIEN.dbURL;
public class DanhSachThanhToan_Controller {
    public static Connection conn;
    public static Statement state;
    public static String sql;
        public static List<tbKhachHangCS> LayNguonCNSD(String MaThang){
        List<tbKhachHangCS> arr = new ArrayList<>();
        conn=null;
        state = null;
        
        try {
            conn=DriverManager.getConnection(dbURL);
            sql = "Select KhachHang.maKH,tenKH,diaChi,ngaySinh,sDT From KhachHang\n" +
                    " except\n" +
                    "Select KhachHang.maKH,tenKH,diaChi,ngaySinh,sDT From KhachHang inner join Thang inner join QLChiSo \n" +
                    " on Thang.maThang=QLChiSo.maThang \n" +
                    " on KhachHang.maKH=QLChiSo.maKH \n" +
                    " where Thang.maThang="+MaThang+" ";
            state = conn.createStatement();
            ResultSet rs =state.executeQuery(sql); 
            while(rs.next()){
              tbKhachHangCS tb= new tbKhachHangCS();
              tb.setMakh(rs.getString("maKH"));
              tb.setHoten(rs.getString("tenKH"));
              tb.setDiachi(rs.getString("diaChi"));
              tb.setNgaysinh(rs.getString("ngaySinh"));
              tb.setSdt(rs.getString("sDT"));
              arr.add(tb);
          }
            state.close();conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DanhSachThanhToan_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            if(state!=null)
                try {
                    state.close();
            } catch (SQLException ex) {
                Logger.getLogger(DanhSachThanhToan_Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(conn!=null)
                try {
                    conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(DanhSachThanhToan_Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return arr;
    }

    
    
    public static List<tbKhachHangCS> LayNguonCTT(String MaThang){
        List<tbKhachHangCS> arr = new ArrayList<>();
        conn=null;
        state = null;
        
        try {
            conn=DriverManager.getConnection(dbURL);
            sql = "select KhachHang.maKH,tenKH,diaChi,ngaySinh,sDT  from  HoaDon,Thang,KhachHang\n" +
"                 where Thang.maThang="+MaThang+" and tinhtrang = N'Chưa thanh toán'and HoaDon.maKH=KhachHang.maKH and HoaDon.maThang=Thang.maThang";
            state = conn.createStatement();
            ResultSet rs =state.executeQuery(sql); 
            while(rs.next()){
              tbKhachHangCS tb= new tbKhachHangCS();
              tb.setMakh(rs.getString("maKH"));
              tb.setHoten(rs.getString("tenKH"));
              tb.setDiachi(rs.getString("diaChi"));
              tb.setNgaysinh(rs.getString("ngaySinh"));
              tb.setSdt(rs.getString("sDT"));
              arr.add(tb);
          }
            state.close();conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DanhSachThanhToan_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            if(state!=null)
                try {
                    state.close();
            } catch (SQLException ex) {
                Logger.getLogger(DanhSachThanhToan_Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(conn!=null)
                try {
                    conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(DanhSachThanhToan_Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return arr;
    }
    
    public static List<tbKhachHangCS> LayNguonDTT(String MaThang){
        List<tbKhachHangCS> arr = new ArrayList<>();
        conn=null;
        state = null;
        
        try {
            conn=DriverManager.getConnection(dbURL);
            sql = "select KhachHang.maKH,tenKH,diaChi,ngaySinh,sDT  from  HoaDon,Thang,KhachHang\n" +
"                 where Thang.maThang="+MaThang+" and tinhtrang = N'Đã thanh toán'and HoaDon.maKH=KhachHang.maKH and HoaDon.maThang=Thang.maThang  ";
            state = conn.createStatement();
            ResultSet rs =state.executeQuery(sql); 
            while(rs.next()){
              tbKhachHangCS tb= new tbKhachHangCS();
              tb.setMakh(rs.getString("maKH"));
              tb.setHoten(rs.getString("tenKH"));
              tb.setDiachi(rs.getString("diaChi")); 
              tb.setNgaysinh(rs.getString("ngaySinh"));
              tb.setSdt(rs.getString("sDT"));
              arr.add(tb);
          }
            state.close();conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DanhSachThanhToan_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            if(state!=null)
                try {
                    state.close();
            } catch (SQLException ex) {
                Logger.getLogger(DanhSachThanhToan_Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(conn!=null)
                try {
                    conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(DanhSachThanhToan_Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return arr;
    }
    public static List<tbThang> LayNguonThang(){
        List<tbThang> arr = new ArrayList<>();
        conn=null;
        state = null;
        
        try {
            conn=DriverManager.getConnection(dbURL);
            sql = "Select *from Thang Order by maThang";
            state = conn.createStatement();
            ResultSet rs =state.executeQuery(sql); 
            while(rs.next()){
              tbThang tb =  new tbThang();
              tb.setMaThang(rs.getInt("maThang"));
              tb.setNgayDau(rs.getDate("NgayDau"));
              tb.setNgayCuoi(rs.getDate("NgayCuoi"));             
              arr.add(tb);
          }
            state.close();conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DanhSachThanhToan_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            if(state!=null)
                try {
                    state.close();
            } catch (SQLException ex) {
                Logger.getLogger(DanhSachThanhToan_Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(conn!=null)
                try {
                    conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(DanhSachThanhToan_Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return arr;
    }
}
