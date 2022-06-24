
package Controller;

import Model.tbChiSo;
import Model.tbKHCS;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import static qldien.QLDIEN.dbURL;
import java.text.SimpleDateFormat;

public class ChiSo_Controller {
    public static Connection conn;
    public static Statement state;
    public static String sql;
    public static PreparedStatement pstate;
    public static ResultSet rs;
    public static List<tbKHCS> LayNguonKH(){
         List<tbKHCS> arr = new ArrayList<>();
         try{
          conn= DriverManager.getConnection (dbURL);  
          sql="Select maKH,tenKH,diaChi,sDT From KhachHang Order by MaKH";
          state=conn.createStatement();
          rs = state.executeQuery(sql);
          while(rs.next()){
              tbKHCS tb= new tbKHCS();
              tb.setMaKH(rs.getString("maKH"));
              tb.setHoTen(rs.getString("tenKH"));
              tb.setDiaChi(rs.getString("diaChi"));
              tb.setSDT(rs.getString("sDT"));
              arr.add(tb);
          }
          state.close();conn.close();
        }catch(SQLException e){
            Logger.getLogger(ChiSo_Controller.class.getName()).log(Level.SEVERE,null,e);
        }
        finally{
                if(state!=null){
                    try {
                        state.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(ChiSo_Controller.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if(conn!=null){
                    try {
                        conn.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(ChiSo_Controller.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        return arr;
    }
    public static List<tbChiSo> LayNguonCS(String MaKH){
         List<tbChiSo> arr = new ArrayList<>();
         try{
          conn= DriverManager.getConnection (dbURL);  
          sql="Select QlChiSo.MaThang,NgayDau,NgayCuoi,chiSoCu,chiSoMoi From QLChiSo"
                  + " inner join Thang on Thang.MaThang=QlChiSo.MaThang"
                  + " where maKH='"+MaKH+"'"
                  + " Order by MaThang";
          state=conn.createStatement();
          rs = state.executeQuery(sql);
          while(rs.next()){
              tbChiSo tb= new tbChiSo();
              tb.setMaThang(rs.getInt("MaThang"));
              tb.setNgayDau(rs.getDate("NgayDau"));
              tb.setNgayCuoi(rs.getDate("NgayCuoi"));
              tb.setCSCu(rs.getInt("chiSoCu"));
              tb.setCSMoi(rs.getInt("chiSoMoi"));
              arr.add(tb);
          }
          state.close();conn.close();
        }catch(SQLException e){
            Logger.getLogger(ChiSo_Controller.class.getName()).log(Level.SEVERE,null,e);
        }
        finally{
                if(state!=null){
                    try {
                        state.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(ChiSo_Controller.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if(conn!=null){
                    try {
                        conn.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(ChiSo_Controller.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        return arr;
    }
   public static  List<tbKHCS> TimKiem(String name){
       List<tbKHCS> arrKH = new ArrayList<>();
       conn=null;
       state = null;
       try{
           conn=DriverManager.getConnection(dbURL);
           sql = "select * from KhachHang where tenKH like N'%"+ name + "%' or diaChi like N'%"+ name + "%' or sDT like N'%"+ name + "%'";

           state = conn.createStatement();
           ResultSet rs = state.executeQuery(sql);
           while(rs.next()){
               tbKHCS temp1 = new tbKHCS();
               temp1.setMaKH(rs.getString("maKH"));
               temp1.setHoTen(rs.getString("tenKH"));
               temp1.setDiaChi(rs.getString("diaChi"));
               temp1.setSDT(rs.getString("sDT"));
               arrKH.add(temp1);
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
       return arrKH;
    }

}
