package Controller;
import Model.tbLoaiDien;
import java.util.List;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import static qldien.QLDIEN.dbURL;
public class LoaiDien_Controller {
    public static Connection conn;
    public static Statement state;
    public static String sql;
    public static List<tbLoaiDien> LayNguon(){
        List<tbLoaiDien> arr = new ArrayList<>();
       conn=null;
       state = null;
       try{
           conn=DriverManager.getConnection(dbURL);
           sql = "select * from LoaiDien order by maLD";
           state = conn.createStatement();
           ResultSet rs = state.executeQuery(sql);
           while(rs.next()){
               tbLoaiDien temp = new tbLoaiDien();
               temp.setMald(rs.getString("maLD"));
               temp.setTenld(rs.getString("tenLD"));
               temp.setGiab1(rs.getFloat("giaB1"));
               temp.setGiab2(rs.getFloat("giaB2"));
               temp.setGiab3(rs.getFloat("giaB3"));
               temp.setGiab4(rs.getFloat("giaB4"));
               temp.setGiab5(rs.getFloat("giaB5"));
               temp.setGiab6(rs.getFloat("giaB6"));
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
    
    public static List<tbLoaiDien> LayGia(String mald){
        List<tbLoaiDien> arr = new ArrayList<>();
       conn=null;
       state = null;
       try{
           conn=DriverManager.getConnection(dbURL);
           sql = "select * from LoaiDien where mald = '"+mald+"'";
           state = conn.createStatement();
           ResultSet rs = state.executeQuery(sql);
           while(rs.next()){
               tbLoaiDien temp = new tbLoaiDien();
               temp.setMald(rs.getString("maLD"));
               temp.setTenld(rs.getString("tenLD"));
               temp.setGiab1(rs.getFloat("giaB1"));
               temp.setGiab2(rs.getFloat("giaB2"));
               temp.setGiab3(rs.getFloat("giaB3"));
               temp.setGiab4(rs.getFloat("giaB4"));
               temp.setGiab5(rs.getFloat("giaB5"));
               temp.setGiab6(rs.getFloat("giaB6"));
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
}
