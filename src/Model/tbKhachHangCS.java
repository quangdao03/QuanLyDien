
package Model;


public class tbKhachHangCS {
    String makh,hoten,diachi,ngaysinh,sdt;
    int mathang;

    public tbKhachHangCS(String makh, String hoten, String diachi, String ngaysinh, String sdt, int mathang) {
        this.makh = makh;
        this.hoten = hoten;
        this.diachi = diachi;
        this.ngaysinh = ngaysinh;
        this.sdt = sdt;
        this.mathang = mathang;
    }
    public tbKhachHangCS(){
        
    }

    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public int getMathang() {
        return mathang;
    }

    public void setMathang(int mathang) {
        this.mathang = mathang;
    }
    

    

    
    
}
