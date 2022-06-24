
package Controller;
import Model.tbThongTin;
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

public class ThongTin_Controller {
    public static Connection conn;
    public static Statement state;
    public static PreparedStatement pstate;
    public static ResultSet rs;
    public static String sql;
    public static List<tbThongTin> LayNguon(){
        List<tbThongTin> arr = new ArrayList<>();
        conn=null;
        state=null;
        try {
            conn = DriverManager.getConnection(dbURL);
            sql = "   SELECT COUNT(maKH) as'soluong'\n" +
                    "  FROM KhachHang";
            state = conn.createStatement();
            ResultSet rs =state.executeQuery(sql);
            while(rs.next()){
                tbThongTin tb= new tbThongTin();
                tb.setNum(rs.getInt("soluong"));
                arr.add(tb);
            }
            state.close();conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ThongTin_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arr;
    }
}
