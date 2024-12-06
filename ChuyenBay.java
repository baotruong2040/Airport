public class ChuyenBay {
    private String maChuyenBay, sanBayDi, sanBayDen;
    private String ngayBay;//dd-MM-yyyy
    private String gioBay;//HH:mm
    private int gheE;//20x6
    private int gheB;//10x4
    private int gheF;//05x2
    private Ghe[] dsGhe;
    private char trangThai;// Scheuduled; Delayed; Cancelled
    private Ticket[] dsVe;
    private double khoangCachBay;//km
    public ChuyenBay(String maChuyenBay, String sanBayDi, String sanBayDen, String ngayBay, String gioBay,
            char trangThai, double khoangCachBay) {
        this.maChuyenBay = maChuyenBay;
        this.sanBayDi = sanBayDi;
        this.sanBayDen = sanBayDen;
        this.ngayBay = ngayBay;
        this.gioBay = gioBay;
        this.trangThai = trangThai;
        this.khoangCachBay = khoangCachBay;
        dsVe = new Ticket[gheE+gheB+gheF];
        dsGhe = new Ghe[gheE+gheB+gheF];
        for (int i = 1; i<=6;i++) {
            for(int j = 0; i<gheE/6;i++) {
                dsGhe[j] = new Ghe("Y0"+(i*100+j+1), 'Y', false, 1000000);
            }
        }
        for (int i = 1; i<=4;i++) {
            for(int j = 0; i<gheB/4;i++) {
                dsGhe[j] = new Ghe("B0"+(i*100+j+1), 'Y', false, 3000000);
            }
        }
        for (int i = 1; i<=2;i++) {
            for(int j = 0; i<gheF/2;i++) {
                dsGhe[j] = new Ghe("F0"+(i*100+j+1), 'F', false, 5000000);
            }
        }
    }
    public String getMaChuyenBay() {
        return maChuyenBay;
    }
    public void setMaChuyenBay(String maChuyenBay) {
        this.maChuyenBay = maChuyenBay;
    }
    public String getSanBayDi() {
        return sanBayDi;
    }
    public void setSanBayDi(String sanBayDi) {
        this.sanBayDi = sanBayDi;
    }
    public String getSanBayDen() {
        return sanBayDen;
    }
    public void setSanBayDen(String sanBayDen) {
        this.sanBayDen = sanBayDen;
    }
    public String getNgayBay() {
        return ngayBay;
    }
    public void setNgayBay(String ngayBay) {
        this.ngayBay = ngayBay;
    }
    public String getGioBay() {
        return gioBay;
    }
    public void setGioBay(String gioBay) {
        this.gioBay = gioBay;
    }
    public int getGheE() {
        return gheE;
    }
    public void setGheE(int gheE) {
        this.gheE = gheE;
    }
    public int getGheB() {
        return gheB;
    }
    public void setGheB(int gheB) {
        this.gheB = gheB;
    }
    public int getGheF() {
        return gheF;
    }
    public void setGheF(int gheF) {
        this.gheF = gheF;
    }
    public char getTrangThai() {
        return trangThai;
    }
    public void setTrangThai(char trangThai) {
        this.trangThai = trangThai;
    }
    public double getKhoangCachBay() {
        return khoangCachBay;
    }
    public void setKhoangCachBay(double khoangCachBay) {
        this.khoangCachBay = khoangCachBay;
    }
    
    public int kiemTraGheTrong(char hangGhe) {
        int count = 0;
        for (Ghe ghe : dsGhe) {
            if (ghe.getHangGhe() == hangGhe && ghe.getTrangThai() == false) {
                count++;
            }
        }
        return count;
    }
    public void datGhe(String maGhe){
        for (Ghe ghe : dsGhe) {
            ghe.setTrangThai(true);
        }
        
    }
    public void huyGhe(String maGhe) {
        for (Ghe ghe : dsGhe) {
            ghe.setTrangThai(false);
        }
    }
}
