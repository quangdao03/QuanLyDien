package Model;
public class tbDien {
    String makh,tenkh,ngaydau,ngaycuoi;
    int chisomoi,chisocu,mathang;
    String maLD;
    public tbDien() {
    }

    public tbDien(String makh, int mathang, String tenkh, String ngaydau, String ngaycuoi, int chisomoi, int chisocu, String maLD) {
        this.makh = makh;
        this.mathang = mathang;
        this.tenkh = tenkh;
        this.ngaydau = ngaydau;
        this.ngaycuoi = ngaycuoi;
        this.chisomoi = chisomoi;
        this.chisocu = chisocu;
        this.maLD = maLD;
    }


    public int getMathang() {
        return mathang;
    }

    public void setMathang(int mathang) {
        this.mathang = mathang;
    }
    

    public String getTenkh() {
        return tenkh;
    }

    public String getNgaydau() {
        return ngaydau;
    }

    public String getNgaycuoi() {
        return ngaycuoi;
    }

    public int getChisomoi() {
        return chisomoi;
    }

    public int getChisocu() {
        return chisocu;
    }

    public String getMaLD() {
        return maLD;
    }

    public String getMakh() {
        return makh;
    }
    
    
    public void setTenkh(String tenkh) {
        this.tenkh = tenkh;
    }

    public void setNgaydau(String ngaydau) {
        this.ngaydau = ngaydau;
    }

    public void setNgaycuoi(String ngaycuoi) {
        this.ngaycuoi = ngaycuoi;
    }

    public void setChisomoi(int chisomoi) {
        this.chisomoi = chisomoi;
    }

    public void setChisocu(int chisocu) {
        this.chisocu = chisocu;
    }

    public void setMaLD(String maLD) {
        this.maLD = maLD;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }
    
    
   
}
