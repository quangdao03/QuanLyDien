package Controller;
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
//import static quanlydien1.QuanLyDien.dbURL;
public class QLKhachHang_Controller {
    //1. lấy nguồn: dùng để lấy dữ liệu từ CSDL và đưa vào mảng ArayList<KhachHang>
    public static Connection conn;
    public static Statement state;
    public static String sql;
    public static List<tbKhachHang> LayNguon(){
        List<tbKhachHang> arr = new ArrayList<>();
       conn=null;
       state = null;
       try{
           conn=DriverManager.getConnection(dbURL);
           sql = "select * from KhachHang order by maKH";
           state = conn.createStatement();
           ResultSet rs = state.executeQuery(sql);
           while(rs.next()){
               tbKhachHang temp = new tbKhachHang();
               temp.setMakh(rs.getString("maKH"));
               temp.setTenkh(rs.getString("tenKH"));
               temp.setGt(rs.getString("gioiTinh"));
               temp.setNgaysinh(rs.getString("ngaySinh"));
               temp.setDiachi(rs.getString("diaChi"));
               temp.setMact(rs.getString("maCongTo"));
               temp.setSdt(rs.getString("sDT"));
               temp.setLoaidien(rs.getString("maLD"));
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
    
        public static  List<tbKhachHang> TimKiem(String name){
       List<tbKhachHang> arrTK = new ArrayList<>();
       conn=null;
       state = null;
       try{
           conn=DriverManager.getConnection(dbURL);
           sql = "select * from KhachHang where tenKH like N'%"+ name + "%'";
           state = conn.createStatement();
           ResultSet rs = state.executeQuery(sql);
           while(rs.next()){
               tbKhachHang temp1 = new tbKhachHang();
               temp1.setMakh(rs.getString("maKH"));
               temp1.setTenkh(rs.getString("tenKH"));
               temp1.setGt(rs.getString("gioiTinh"));
               temp1.setNgaysinh(rs.getString("ngaySinh"));
               temp1.setDiachi(rs.getString("diaChi"));
               temp1.setMact(rs.getString("maCongTo"));
               temp1.setSdt(rs.getString("sDT"));
               temp1.setLoaidien(rs.getString("maLD"));
               arrTK.add(temp1);
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
       return arrTK;
    }
    //2. Them moi 1 ban ghi
    public static void ThemKH(tbKhachHang kh){
        Connection conn=null;
        PreparedStatement state = null;
        try{
            conn=DriverManager.getConnection(dbURL);
  
            String sql= "INSERT INTO KhachHang(maKH,tenKH,gioiTinh,ngaySinh,diaChi,maCongTo,sDT,maLD) values(?,?,?,?,?,?,?,?)";
            state=conn.prepareStatement(sql);
            state.setString(1,kh.getMakh());
            state.setString(2,kh.getTenkh());
            state.setString(3,kh.getGt());
            state.setString(4,kh.getNgaysinh());
            state.setString(5,kh.getDiachi());
            state.setString(6,kh.getMact());
            state.setString(7,kh.getSdt());
            state.setString(8,kh.getLoaidien());
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
    //3. Cap nhat ban ghi
    public static void CapNhatKH(tbKhachHang kh, String macu){
        Connection conn=null;
        PreparedStatement state = null;
        try{
            conn=DriverManager.getConnection(dbURL);
            String sql= "UPDATE KhachHang set maKH=?,tenKH=?,gioiTinh=?,ngaySinh=?,diaChi=?,maCongTo=?,sDT=?,maLD=? where maKH=?";
            state=conn.prepareStatement(sql);
            state.setString(1,kh.getMakh());
            state.setString(2,kh.getTenkh());
            state.setString(3,kh.getGt());
            state.setString(4,kh.getNgaysinh());
            state.setString(5,kh.getDiachi());
            state.setString(6,kh.getMact());
            state.setString(7,kh.getSdt());
            state.setString(8,kh.getLoaidien());
            state.setString(9,macu);
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
    //4. Xoa ban ghi
    public static void XoaKH( String macu){
        Connection conn=null;
        PreparedStatement state = null;
        try{
            conn=DriverManager.getConnection(dbURL);
            String sql="DELETE from KhachHang where maKH=?";
            state=conn.prepareStatement(sql);
            state.setString(1,macu);
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
             if(conn!=null) {
             try{
                 conn.close();
             }
             catch(SQLException ex){                 
             }
         }
        }
    }
}
    //thu tuc kiem tra trung ma khi cap nhat(hoac them sua)
    public static boolean KiemTraTrungMa(String tenbang, String tentruong, String manhap, boolean ktThem, String macu){
        Connection con = null;
        Statement st = null;
        boolean kq = false;
        try {
            con = DriverManager.getConnection(dbURL);
            if (ktThem == true) {
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
                    //Logger.getLogger(QLD_contro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    //Logger.getLogger(QLD_contro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        return kq;
    }
    

} 
