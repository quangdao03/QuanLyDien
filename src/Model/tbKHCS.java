/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author 84396
 */
public class tbKHCS {
    String MaKH,HoTen,DiaChi, SDT;

    public tbKHCS() {
    }

    public tbKHCS(String MaKH, String HoTen, String DiaChi, String SDT) {
        this.MaKH = MaKH;
        this.HoTen = HoTen;
        this.DiaChi = DiaChi;
        this.SDT = SDT;
    }

    public String getMaKH() {
        return MaKH;
    }

    public String getHoTen() {
        return HoTen;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }
    
}
