/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import Model.tbCapNhatChiSo;
import Model.tbChiSo;
import Model.tbThang;
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

/**
 *
 * @author 84396
 */
public class Thang_Controller {
    public static Connection conn;
    public static Statement state;
    public static String sql;
    public static PreparedStatement pstate;
    public static ResultSet rs;
        public static tbChiSo LayNguon(String MaKH){
            tbChiSo tb= new tbChiSo();
         try{
          conn= DriverManager.getConnection (dbURL);  
          sql="Select QlChiSo.MaThang,NgayDau,NgayCuoi,chiSoCu,chiSoMoi From QLChiSo"
                  + " inner join Thang on Thang.MaThang=QlChiSo.MaThang"
                  + " where maKH='"+MaKH+"'"
                  + " Order by MaThang";
                  
          state=conn.createStatement();
          rs = state.executeQuery(sql);
          while(rs.next()){
              
              tb.setMaThang(rs.getInt("MaThang"));
              tb.setNgayDau(rs.getDate("NgayDau"));
              tb.setNgayCuoi(rs.getDate("NgayCuoi"));
              tb.setCSCu(rs.getInt("chiSoCu"));
              tb.setCSMoi(rs.getInt("chiSoMoi"));

          }
          state.close();conn.close();
        }catch(SQLException e){
            Logger.getLogger(Thang_Controller.class.getName()).log(Level.SEVERE,null,e);
        }
        finally{
                if(state!=null){
                    try {
                        state.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(Thang_Controller.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if(conn!=null){
                    try {
                        conn.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(Thang_Controller.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        return tb;
    }
        public static boolean KtraThangMoi(int MaThangNew){
            tbChiSo tb= new tbChiSo();
         try{
          conn= DriverManager.getConnection (dbURL);  
          sql="Select * From Thang"
                  + " where maThang='"+MaThangNew+"'";
                 
                  
          state=conn.createStatement();
          rs = state.executeQuery(sql);
          if(rs.next()){
              return true;
              
          }
          state.close();conn.close();
        }catch(SQLException e){
            Logger.getLogger(Thang_Controller.class.getName()).log(Level.SEVERE,null,e);
        }
        finally{
                if(state!=null){
                    try {
                        state.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(Thang_Controller.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if(conn!=null){
                    try {
                        conn.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(Thang_Controller.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        return false;
    }
        public static void ThemMoi(tbCapNhatChiSo tb){
        conn=null;
        pstate=null;
        try{
          conn= DriverManager.getConnection (dbURL);  
          sql="Insert Into QLChiSo (maKH,MaThang,chiSoMoi,chiSoCu) Values (?,?,?,?)";
          pstate=conn.prepareStatement(sql);
          pstate.setString(1, tb.getMaKH());
          pstate.setInt(2, tb.getMaThang());
          pstate.setInt(3, tb.getChiSoMoi());
          pstate.setInt(4, tb.getChiSoCu());
          
          pstate.execute();
          
          pstate.close();conn.close();
        }catch(SQLException e){
            Logger.getLogger(Thang_Controller.class.getName()).log(Level.SEVERE,null,e);
        }
        finally{
                if(pstate!=null){
                    try {
                        pstate.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(Thang_Controller.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if(conn!=null){
                    try {
                        conn.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(Thang_Controller.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
    }
        
        public static List<tbThang> LayNguonThang(){
            List<tbThang> arr= new ArrayList<>();
         try{
          conn= DriverManager.getConnection (dbURL);  
          sql="Select * From Thang";
                  
          state=conn.createStatement();
          rs = state.executeQuery(sql);
          while(rs.next()){
              tbThang tb = new tbThang();
              tb.setMaThang(rs.getInt("MaThang"));
              tb.setNgayDau(rs.getDate("NgayDau"));
              tb.setNgayCuoi(rs.getDate("NgayCuoi"));
              arr.add(tb);

          }
          state.close();conn.close();
        }catch(SQLException e){
            Logger.getLogger(Thang_Controller.class.getName()).log(Level.SEVERE,null,e);
        }
        finally{
                if(state!=null){
                    try {
                        state.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(Thang_Controller.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if(conn!=null){
                    try {
                        conn.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(Thang_Controller.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        return arr;
    }
    public static void ThemMoiThang(tbThang tb){
        conn=null;
        pstate=null;
        try{
          conn= DriverManager.getConnection (dbURL);  
          sql="Insert Into Thang (MaThang, NgayDau, NgayCuoi) Values (?,?,?);";
          pstate=conn.prepareStatement(sql);
          pstate.setInt(1, tb.getMaThang());
          pstate.setDate(2,tb.getNgayDau());
          pstate.setDate(3,tb.getNgayCuoi());
          pstate.execute();
          
          pstate.close();conn.close();
        }catch(SQLException e){
            Logger.getLogger(Thang_Controller.class.getName()).log(Level.SEVERE,null,e);
        }
        finally{
                if(pstate!=null){
                    try {
                        pstate.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(Thang_Controller.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if(conn!=null){
                    try {
                        conn.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(Thang_Controller.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
    }
}

