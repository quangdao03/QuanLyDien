
package Model;


import java.util.Date;



public class tbBaoCaoTK {
    int mathang,tongsodien,tongtiendien;
    Date ngaydau,ngaycuoi;
    public tbBaoCaoTK(){
        
    }

    public tbBaoCaoTK(int mathang, int tongsodien, int tongtiendien, Date ngaydau, Date ngaycuoi) {
        this.mathang = mathang;
        this.tongsodien = tongsodien;
        this.tongtiendien = tongtiendien;
        this.ngaydau = ngaydau;
        this.ngaycuoi = ngaycuoi;
    }

    public int getMathang() {
        return mathang;
    }

    public void setMathang(int mathang) {
        this.mathang = mathang;
    }

    public int getTongsodien() {
        return tongsodien;
    }

    public void setTongsodien(int tongsodien) {
        this.tongsodien = tongsodien;
    }

    public int getTongtiendien() {
        return tongtiendien;
    }

    public void setTongtiendien(int tongtiendien) {
        this.tongtiendien = tongtiendien;
    }

    public Date getNgaydau() {
        return ngaydau;
    }

    public void setNgaydau(Date ngaydau) {
        this.ngaydau = ngaydau;
    }

    public Date getNgaycuoi() {
        return ngaycuoi;
    }

    public void setNgaycuoi(Date ngaycuoi) {
        this.ngaycuoi = ngaycuoi;
    }

   

    
    

   
}
