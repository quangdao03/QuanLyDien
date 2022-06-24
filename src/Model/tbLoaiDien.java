
package Model;
public class tbLoaiDien {
    String mald,tenld;
    Float giab1,giab2,giab3,giab4,giab5,giab6;

    public tbLoaiDien() {
    }

    public tbLoaiDien(String mald, String tenld, Float giab1, Float giab2, Float giab3, Float giab4, Float giab5, Float giab6) {
        this.mald = mald;
        this.tenld = tenld;
        this.giab1 = giab1;
        this.giab2 = giab2;
        this.giab3 = giab3;
        this.giab4 = giab4;
        this.giab5 = giab5;
        this.giab6 = giab6;
    }

    public String getMald() {
        return mald;
    }

    public String getTenld() {
        return tenld;
    }

    public Float getGiab1() {
        return giab1;
    }

    public Float getGiab2() {
        return giab2;
    }

    public Float getGiab3() {
        return giab3;
    }

    public Float getGiab4() {
        return giab4;
    }

    public Float getGiab5() {
        return giab5;
    }

    public Float getGiab6() {
        return giab6;
    }

    public void setMald(String mald) {
        this.mald = mald;
    }

    public void setTenld(String tenld) {
        this.tenld = tenld;
    }

    public void setGiab1(Float giab1) {
        this.giab1 = giab1;
    }

    public void setGiab2(Float giab2) {
        this.giab2 = giab2;
    }

    public void setGiab3(Float giab3) {
        this.giab3 = giab3;
    }

    public void setGiab4(Float giab4) {
        this.giab4 = giab4;
    }

    public void setGiab5(Float giab5) {
        this.giab5 = giab5;
    }

    public void setGiab6(Float giab6) {
        this.giab6 = giab6;
    }
    
}
