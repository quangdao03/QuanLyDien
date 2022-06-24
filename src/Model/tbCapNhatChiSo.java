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
public class tbCapNhatChiSo {
    String maKH;
    int MaThang,chiSoMoi,chiSoCu ;

    public tbCapNhatChiSo() {
    }

    public tbCapNhatChiSo(String maKH, int MaThang, int chiSoMoi, int chiSoCu) {
        this.maKH = maKH;
        this.MaThang = MaThang;
        this.chiSoMoi = chiSoMoi;
        this.chiSoCu = chiSoCu;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public int getMaThang() {
        return MaThang;
    }

    public void setMaThang(int MaThang) {
        this.MaThang = MaThang;
    }

    public int getChiSoMoi() {
        return chiSoMoi;
    }

    public void setChiSoMoi(int chiSoMoi) {
        this.chiSoMoi = chiSoMoi;
    }

    public int getChiSoCu() {
        return chiSoCu;
    }

    public void setChiSoCu(int chiSoCu) {
        this.chiSoCu = chiSoCu;
    }
    
}
