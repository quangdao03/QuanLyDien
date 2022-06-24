
package Controller;
import Model.tbDien;
import Model.tbHoaDon;
import Model.tbHoaDonsql;
import Model.tbKhachHang;
import java.util.List;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import static qldien.QLDIEN.dbURL;
import static qldien.QLDIEN.*;
public class QLHoaDon_Controller {
    public static Connection conn;
    public static Statement state;
    public static String sql,sql1;
    public static List<tbDien> LayNguon(){
        List<tbDien> arr = new ArrayList<>();
       conn=null;
       state = null;
       try{
           conn=DriverManager.getConnection(dbURL);
           sql = "SELECT QLChiSo.maKH,QLChiSo.maThang,tenKH,NgayDau,NgayCuoi,chisoMoi,chisoCu,KhachHang.maLD from QLChiSo,Thang,KhachHang where " +
                  "QLChiSo.MaThang=Thang.MaThang " +
                  "and QLChiSo.maKH=KhachHang.maKH " +
                  "EXCEPT " +
                  "SELECT QLChiSo.maKH,QLChiSo.maThang,tenKH,NgayDau,NgayCuoi,chisoMoi,chisoCu,KhachHang.maLD from QLChiSo,Thang,KhachHang,HoaDon where " +
                  "QLChiSo.MaThang=Thang.MaThang " +
                  "and QLChiSo.maKH=KhachHang.maKH " +
                  "and QLChiSo.maKH=HoaDon.maKH " +
                  "and QLChiSo.maThang=HoaDon.maThang";
           state = conn.createStatement();
           ResultSet rs = state.executeQuery(sql);
           while(rs.next()){
               tbDien temp = new tbDien();
               temp.setMakh(rs.getString("maKH"));
               temp.setMathang(rs.getInt("maThang"));          
               temp.setTenkh(rs.getString("tenKH"));
               temp.setNgaydau(rs.getString("NgayDau"));
               temp.setNgaycuoi(rs.getString("NgayCuoi"));
               temp.setChisomoi(rs.getInt("chisoMoi"));
               temp.setChisocu(rs.getInt("chisoCu"));
               temp.setMaLD(rs.getString("maLD"));
               arr.add(temp);
           }
           state.close(); conn.close();
       }
       catch(SQLException ex){
           
       }
       finally{
         if(state!=null) {
             try{
                 state.close();
             }
             catch(SQLException ex){                 
             }
         }
       }
       return arr;
    }
    
    public static List<tbDien> TimKiemKH(String name){
        List<tbDien> arr = new ArrayList<>();
       conn=null;
       state = null;
       try{
           conn=DriverManager.getConnection(dbURL);
           sql = "SELECT QLChiSo.maKH,QLChiSo.maThang,tenKH,NgayDau,NgayCuoi,chisoMoi,chisoCu,KhachHang.maLD from QLChiSo,Thang,KhachHang where " +
                  "QLChiSo.MaThang=Thang.MaThang " +
                  "and QLChiSo.maKH=KhachHang.maKH and tenKH like N'%"+ name + "%'" +
                  "EXCEPT " +
                  "SELECT QLChiSo.maKH,QLChiSo.maThang,tenKH,NgayDau,NgayCuoi,chisoMoi,chisoCu,KhachHang.maLD from QLChiSo,Thang,KhachHang,HoaDon where " +
                  "QLChiSo.MaThang=Thang.MaThang " +
                  "and QLChiSo.maKH=KhachHang.maKH " +
                  "and QLChiSo.maKH=HoaDon.maKH " +
                  "and QLChiSo.maThang=HoaDon.maThang and tenKH like N'%"+ name + "%'";
           state = conn.createStatement();
           ResultSet rs = state.executeQuery(sql);
           while(rs.next()){
               tbDien temp = new tbDien();
               temp.setMakh(rs.getString("maKH"));
               temp.setMathang(rs.getInt("maThang"));          
               temp.setTenkh(rs.getString("tenKH"));
               temp.setNgaydau(rs.getString("NgayDau"));
               temp.setNgaycuoi(rs.getString("NgayCuoi"));
               temp.setChisomoi(rs.getInt("chisoMoi"));
               temp.setChisocu(rs.getInt("chisoCu"));
               temp.setMaLD(rs.getString("maLD"));
               arr.add(temp);
           }
           state.close(); conn.close();
       }
       catch(SQLException ex){
           
       }
       finally{
         if(state!=null) {
             try{
                 state.close();
             }
             catch(SQLException ex){                 
             }
         }
       }
       return arr;
    }
    
    
    
    public static List<tbHoaDon> LayNguonHD(){
        List<tbHoaDon> arr1 = new ArrayList<>();
       conn=null;
       state = null;
       try{
           conn=DriverManager.getConnection(dbURL);
           sql1 = "select maHD,tenKH,NgayDau,NgayCuoi,soDien,thanhTien,ngayThanhToan,tinhTrang from HoaDon,Thang,KhachHang"
                   + " where HoaDon.maKH=KhachHang.maKH and HoaDon.maThang=Thang.maThang";
         //  System.out.print(sql1);
           state = conn.createStatement();
           ResultSet rs = state.executeQuery(sql1);
           while(rs.next()){
               tbHoaDon temp = new tbHoaDon();
               temp.setMahd(rs.getString("maHD"));
               temp.setTenkh(rs.getString("tenKH"));
               temp.setNgaydau(rs.getString("NgayDau"));
               temp.setNgaycuoi(rs.getString("NgayCuoi"));
               temp.setLuongdien(rs.getInt("soDien"));
               temp.setThanhtien(rs.getFloat("thanhTien"));
               temp.setNgaythanhtoan(rs.getString("ngayThanhToan"));
               temp.setTinhtrang(rs.getString("tinhTrang"));
               arr1.add(temp);
           }
           state.close(); conn.close();
       }
       catch(SQLException ex){
           
       }
       finally{
         if(state!=null) {
             try{
                 state.close();
             }
             catch(SQLException ex){                 
             }
         }
       }
       return arr1;
    }
    
    
    
    public static void ThemHD(tbHoaDon hd, tbDien d){
        Connection conn=null;
        PreparedStatement state = null;
        try{
            conn=DriverManager.getConnection(dbURL);
  
            String sql= "INSERT INTO HoaDon(maHD,maKH,maNV,maLD,ngayThanhToan,thanhTien,maThang,tinhTrang) values(?,?,?,?,?,?,?,?)";
            state=conn.prepareStatement(sql);
            state.setString(1,hd.getMahd());
            state.setString(2,d.getMakh());
            state.setString(3,maNV);//xong
            state.setString(4,d.getMaLD());
            state.setString(5,hd.getNgaythanhtoan());
            state.setFloat(6,hd.getThanhtien());
            state.setInt(7,d.getMathang());
            state.setString(8,hd.getTinhtrang());
            state.execute();
            state.close(); conn.close();
        }catch(SQLException ex ){
            ex.printStackTrace();
        }
        finally{
            if(state!=null) {
             try{
                 state.close();
             }
             catch(SQLException ex){                 
             }
         }
        }
    }
    
    public static void ThemHDsql(tbHoaDonsql hds){
        Connection conn=null;
        PreparedStatement state = null;
        try{
            conn=DriverManager.getConnection(dbURL);
  
            String sql= "INSERT INTO HoaDon(maHD,maKH,maNV,maLD,ngayThanhToan,thanhTien,maThang,tinhTrang,soDien) values(?,?,?,?,?,?,?,?,?)";
            state=conn.prepareStatement(sql);
            state.setString(1,hds.getMaHD());
            state.setString(2,hds.getMaKH());
            state.setString(3,hds.getMaNV());//xong
            state.setString(4,hds.getMaLD());
            state.setString(5,hds.getNgayThanhToan());
            state.setFloat(6,hds.getThanhTien());
            state.setInt(7,hds.getMaThang());
            state.setString(8,hds.getTinhTrang());
            state.setInt(9,hds.getSoDien());
            state.execute();
            state.close(); conn.close();
        }catch(SQLException ex ){
            ex.printStackTrace();
        }
        finally{
            if(state!=null) {
             try{
                 state.close();
             }
             catch(SQLException ex){                 
             }
         }
        }
    }
    
    public static void Update(String mahd){
        Connection conn=null;
        PreparedStatement state = null;
        try{
            conn=DriverManager.getConnection(dbURL); 
            String sql= "UPDATE HoaDon SET tinhTrang = N'Đã thanh toán' WHERE maHD='"+ mahd + "'";   
            state=conn.prepareStatement(sql);
            state.execute();
            state.close(); conn.close();
        }catch(SQLException ex ){
            ex.printStackTrace();
        }
        finally{
            if(state!=null) {
             try{
                 state.close();
             }
             catch(SQLException ex){                 
             }
         }
        }
    }
    
    public static List<tbHoaDon> TimKiemHD(String ma){
        List<tbHoaDon> arr1 = new ArrayList<>();
       conn=null;
       state = null;
       try{
           conn=DriverManager.getConnection(dbURL);
           sql1 = "select maHD,tenKH,NgayDau,NgayCuoi,soDien,thanhTien,ngayThanhToan,tinhTrang from HoaDon,Thang,KhachHang"
                   + " where HoaDon.maKH=KhachHang.maKH and HoaDon.maThang=Thang.maThang and (maHD like N'%"+ ma + "%' or tenKH like N'%"+ ma + "%')";
         //  System.out.print(sql1);
           state = conn.createStatement();
           ResultSet rs = state.executeQuery(sql1);
           while(rs.next()){
               tbHoaDon temp = new tbHoaDon();
               temp.setMahd(rs.getString("maHD"));
               temp.setTenkh(rs.getString("tenKH"));
               temp.setNgaydau(rs.getString("NgayDau"));
               temp.setNgaycuoi(rs.getString("NgayCuoi"));
               temp.setLuongdien(rs.getInt("soDien"));
               temp.setThanhtien(rs.getFloat("thanhTien"));
               temp.setNgaythanhtoan(rs.getString("ngayThanhToan"));
               temp.setTinhtrang(rs.getString("tinhTrang"));
               arr1.add(temp);
           }
           state.close(); conn.close();
       }
       catch(SQLException ex){
           
       }
       finally{
         if(state!=null) {
             try{
                 state.close();
             }
             catch(SQLException ex){                 
             }
         }
       }
       return arr1;
    }
}
