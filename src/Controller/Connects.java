
package Controller;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JComboBox;
import Model.TaiKhoan1;
import qldien.QLDIEN;


public class Connects {
    Connection conn = null;
    Statement st = null;
    ResultSet rs = null;
    
    public void MakeConnect(String query) throws SQLException{
        try{
            conn = DriverManager.getConnection(QLDIEN.dbURL);
            st = conn.createStatement();
            rs = st.executeQuery(query);
            rs.close();
        conn.close();
        }catch(SQLException e){
            
        }finally {
            if (st != null) {
                conn.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }
    
//    public boolean Exitsted(String input, String query) throws SQLException{ //Kiem tra trung lap hay ko
//            conn = DriverManager.getConnection(QuanLyDien1.dbURL);
//            st = conn.createStatement();
//            rs = st.executeQuery(query);
//            boolean check = false;
//            while(rs.next()){
//                if(rs.getString(1).equals(input)){
//                    check = true; //neu bi trung se tra ve true
//                }
//            }
//            st.close();
//            rs.close();
//            conn.close();
//            return check;
//    }
//    
//    public void loadcombobox(JComboBox cb, String query, int cot) throws SQLException
//        {
//            conn = DriverManager.getConnection(QuanLyDien1.dbURL);
//            st = conn.createStatement();
//            rs = st.executeQuery(query);
//            while (rs.next()){
//                cb.addItem(rs.getString(cot));
//            }
//            st.close();
//            rs.close();
//            conn.close();
//        }
    
}
