
package Model;
public class tbKhachHang {
    String  makh, tenkh,  ngaysinh, diachi, mact, sdt;
    String gt,loaidien;
    public tbKhachHang() {
    }

    public tbKhachHang(String makh, String tenkh, String gt, String ngaysinh, String diachi, String mact, String sdt,String loaidien) {
        this.makh = makh;
        this.tenkh = tenkh;
        this.gt = gt;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
        this.mact = mact;
        this.sdt = sdt;
        this.loaidien = loaidien;
    }

    public String getLoaidien() {
        return loaidien;
    }

    
    public String getMakh() {
        return makh;
    }

    public String getTenkh() {
        return tenkh;
    }

    public String getGt() {
        return gt;
    }

        public String getNgaysinh() {
        return ngaysinh;
    }
        
    public String getDiachi() {
        return diachi;
    }

    public String getMact() {
        return mact;
    }
    
    
    public String getSdt() {
        return sdt;
    }

    public void setLoaidien(String loaidien) {
        this.loaidien = loaidien;
    }


    public void setMakh(String makh) {
        this.makh = makh;
    }

    public void setTenkh(String tenkh) {
        this.tenkh = tenkh;
    }

    public void setGt(String gt) {
        this.gt = gt;
    }

        public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }
        
    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

        public void setMact(String mact) {
        this.mact = mact;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }


    
    
}
