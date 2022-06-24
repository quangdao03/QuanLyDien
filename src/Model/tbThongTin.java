
package Model;

public class tbThongTin {
    int num,sodien;
    float tien;
    public tbThongTin(){
        
    }

    public tbThongTin(int num, int sodien, float tien) {
        this.num = num;
        this.sodien = sodien;
        this.tien = tien;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getSodien() {
        return sodien;
    }

    public void setSodien(int sodien) {
        this.sodien = sodien;
    }

    public float getTien() {
        return tien;
    }

    public void setTien(float tien) {
        this.tien = tien;
    }
    
}
