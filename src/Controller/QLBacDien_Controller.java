package Controller;
import Model.tbBacDien;
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
public class QLBacDien_Controller {
    public static Connection conn;
    public static Statement state;
    public static String sql;
    public static List<tbBacDien> LayNguonBD(){
        List<tbBacDien> arr = new ArrayList<>();
       conn=null;
       state = null;
       try{
           conn=DriverManager.getConnection(dbURL);
           sql = "select bac1,bac2,bac3,bac4,bac5 from QuanLiBac";
           state = conn.createStatement();
           ResultSet rs = state.executeQuery(sql);
           while(rs.next()){
               tbBacDien temp = new tbBacDien();
               temp.setB1(rs.getInt("bac1"));
               temp.setB2(rs.getInt("bac2"));
               temp.setB3(rs.getInt("bac3"));
               temp.setB4(rs.getInt("bac4"));
               temp.setB5(rs.getInt("bac5"));
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
    public static void ThemHD(tbBacDien bd){
        Connection conn=null;
        PreparedStatement state = null;
        try{
            conn=DriverManager.getConnection(dbURL);
            String sql= "INSERT INTO QuanLiBac(bac1,bac2,bac3,bac4,bac5) values(?,?,?,?,?)";
            state=conn.prepareStatement(sql);
            state.setInt(1,bd.getB1());
            state.setInt(2,bd.getB2());
            state.setInt(3,bd.getB3());
            state.setInt(4,bd.getB4());
            state.setInt(5,bd.getB5());  
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
    
     public static void CapNhatBD(tbBacDien bd){
        Connection conn=null;
        PreparedStatement state = null;
        try{
            conn=DriverManager.getConnection(dbURL);
            String sql= "UPDATE QuanLiBac set bac1=?,bac2=?,bac3=?,bac4=?,bac5=?";
            state=conn.prepareStatement(sql);
            state.setInt(1,bd.getB1());
            state.setInt(2,bd.getB2());
            state.setInt(3,bd.getB3());
            state.setInt(4,bd.getB4());
            state.setInt(5,bd.getB5());
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
}
