
package Controller;


import Model.tbBaoCaoTK;
import Model.tbThang;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import static qldien.QLDIEN.dbURL;

public class BaoCaoTK_Controller {
    public static Connection conn;
    public static Statement state;
    public static PreparedStatement pstate;
    public static ResultSet rs;
    public static String sql;
    public static List<tbBaoCaoTK> LayNguon(){
        List<tbBaoCaoTK> arr = new ArrayList<>();
        conn=null;
        state=null;
        try {
            conn = DriverManager.getConnection(dbURL);
            sql = "select Thang.maThang, NgayDau, NgayCuoi , sum(soDien) as tongsodientieuthutrongthang, sum(thanhTien) as tongtientrongthang \n" +
                   "from Thang inner join HoaDon on Thang.maThang = HoaDon.maThang\n" +
                   "group by Thang.maThang, NgayDau,NgayCuoi";
            state = conn.createStatement();
            ResultSet rs =state.executeQuery(sql);
            while(rs.next()){
              tbBaoCaoTK tb= new tbBaoCaoTK();
              tb.setMathang(rs.getInt("maThang"));
              tb.setNgaydau(rs.getDate("NgayDau"));          
              tb.setNgaycuoi(rs.getDate("NgayCuoi"));
              tb.setTongsodien(rs.getInt("tongsodientieuthutrongthang"));
              tb.setTongtiendien(rs.getInt("tongtientrongthang"));
              arr.add(tb);
          }
            state.close();conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(BaoCaoTK_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
        if(state!=null)
            try {
                state.close();
            } catch (SQLException ex) {
            Logger.getLogger(BaoCaoTK_Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        if(conn!=null)
            try {
                conn.close();
            } catch (SQLException ex) {
            Logger.getLogger(BaoCaoTK_Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        return arr;
    }
    
}
