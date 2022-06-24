package Model;
public class tbHoaDonsql {
    String maHD,maKH,maNV,maLD,ngayThanhToan;
    float thanhTien;
    int maThang;
    String tinhTrang;
    int soDien;

    public tbHoaDonsql() {
    }

    public tbHoaDonsql(String maHD, String maKH, String maNV, String maLD, String ngayThanhToan, float thanhTien, int maThang, String tinhTrang, int soDien) {
        this.maHD = maHD;
        this.maKH = maKH;
        this.maNV = maNV;
        this.maLD = maLD;
        this.ngayThanhToan = ngayThanhToan;
        this.thanhTien = thanhTien;
        this.maThang = maThang;
        this.tinhTrang = tinhTrang;
        this.soDien = soDien;
    }

    public String getMaHD() {
        return maHD;
    }

    public String getMaKH() {
        return maKH;
    }

    public String getMaNV() {
        return maNV;
    }

    public String getMaLD() {
        return maLD;
    }

    public String getNgayThanhToan() {
        return ngayThanhToan;
    }

    public float getThanhTien() {
        return thanhTien;
    }

    public int getMaThang() {
        return maThang;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public int getSoDien() {
        return soDien;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public void setMaLD(String maLD) {
        this.maLD = maLD;
    }

    public void setNgayThanhToan(String ngayThanhToan) {
        this.ngayThanhToan = ngayThanhToan;
    }

    public void setThanhTien(float thanhTien) {
        this.thanhTien = thanhTien;
    }

    public void setMaThang(int maThang) {
        this.maThang = maThang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public void setSoDien(int soDien) {
        this.soDien = soDien;
    }
    
}
