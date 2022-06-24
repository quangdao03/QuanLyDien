
package Model;

import java.sql.Date;


public class tbThang {
    int MaThang;
    Date NgayDau,NgayCuoi;

    public tbThang() {
    }

    public tbThang(int MaThang, Date NgayDau, Date NgayCuoi) {
        this.MaThang = MaThang;
        this.NgayDau = NgayDau;
        this.NgayCuoi = NgayCuoi;
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
    
}
