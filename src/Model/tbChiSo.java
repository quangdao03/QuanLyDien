
package Model;

import java.util.Date;

public class tbChiSo {
    int MaThang;
    Date NgayDau,NgayCuoi;
    int CSMoi,CSCu;

    public tbChiSo() {
    }

    public tbChiSo(int MaThang, Date NgayDau, Date NgayCuoi, int CSMoi, int CSCu) {
        this.MaThang = MaThang;
        this.NgayDau = NgayDau;
        this.NgayCuoi = NgayCuoi;
        this.CSMoi = CSMoi;
        this.CSCu = CSCu;
    }

    public int getMaThang() {
        return MaThang;
    }

    public void setMaThang(int MaThang) {
        this.MaThang = MaThang;
    }

    public Date getNgayDau() {
        return NgayDau;
    }

    public void setNgayDau(Date NgayDau) {
        this.NgayDau = NgayDau;
    }

    public Date getNgayCuoi() {
        return NgayCuoi;
    }

    public void setNgayCuoi(Date NgayCuoi) {
        this.NgayCuoi = NgayCuoi;
    }

    public int getCSMoi() {
        return CSMoi;
    }

    public void setCSMoi(int CSMoi) {
        this.CSMoi = CSMoi;
    }

    public int getCSCu() {
        return CSCu;
    }

    public void setCSCu(int CSCu) {
        this.CSCu = CSCu;
    }

       }

    