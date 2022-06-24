
package Model;



public class NhanVien {
        public String maNV, tenDangNhap, hoTen,ChucVu, gioiTinh, CCCD, soDT, ngaySinh, diaChi;
        
        public NhanVien(){
        }

    public NhanVien(String maNV, String tenDangNhap, String hoTen, String ChucVu, String gioiTinh, String CCCD, String soDT, String ngaySinh, String diaChi ) {
        this.maNV = maNV;
        this.tenDangNhap = tenDangNhap;
        this.hoTen = hoTen;
        this.ChucVu = ChucVu;
        this.gioiTinh = gioiTinh;
        this.CCCD = CCCD;
        this.soDT = soDT;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getChucVu() {
        return ChucVu;
    }

    public void setChucVu(String ChucVu) {
        this.ChucVu = ChucVu;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "maNV=" + maNV + ", tenDangNhap=" + tenDangNhap + ", hoTen=" + hoTen + ", ChucVu=" + ChucVu + ", gioiTinh=" + gioiTinh + ", CCCD=" + CCCD + ", soDT=" + soDT + ", ngaySinh=" + ngaySinh + ", diaChi=" + diaChi + '}';
    }

    
    
}
