import java.util.ArrayList;

public class HangBay {
    private String id;
    private String tenHangBay;
    private ArrayList<ChuyenBay> dsChuyenBay;
    private ArrayList<HanhKhach> dsHanhKhach;
    private double[] bangGiaCoBan = {1000000, 3000000, 5000000};
    public HangBay(String id, String tenHangBay) {
        this.id = id;
        this.tenHangBay = tenHangBay;
        dsChuyenBay = new ArrayList<>();
        dsHanhKhach = new ArrayList<>();
        
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getTenHangBay() {
        return tenHangBay;
    }
    public void setTenHangBay(String tenHangBay) {
        this.tenHangBay = tenHangBay;
    }
    public double[] getBangGiaCoBan() {
        return bangGiaCoBan;
    }
    public void setBangGiaCoBan(double[] bangGiaCoBan) {
        this.bangGiaCoBan = bangGiaCoBan;
    }
    
    public ChuyenBay timChuyenBay(String maChuyenBay) {
        for (ChuyenBay chuyenBay : dsChuyenBay) {
            if (chuyenBay.getMaChuyenBay() == maChuyenBay) {
                return chuyenBay;
            }
        }
        return null;
    }
    public void themChuyenBay(ChuyenBay chuyenbay) {
        dsChuyenBay.add(chuyenbay);
    }
    public void xoaChuyenBay(String maChuyenBay) {
        ChuyenBay chuyenBay = timChuyenBay(maChuyenBay);
        if (chuyenBay != null) {
            dsChuyenBay.remove(chuyenBay);
        } 
    }
    public HanhKhach timHanhKhach(String id) {
        for (HanhKhach hanhKhach : dsHanhKhach) {
            if (hanhKhach.getId() == id) {
                return hanhKhach;
            }
        }
        return null;
    }
    public void themHanhKhach(HanhKhach hanhKhach) {
        dsHanhKhach.add(hanhKhach);
    }
    public void xoaHanhKhach(String id) {
        HanhKhach hanhKhach = timHanhKhach(id);

        if (hanhKhach.getDsVeDaDat() != null) {
            dsHanhKhach.remove(hanhKhach);
        }else {
            System.out.println("Khong the xoa hanh khach vi con chuyen bay");
        }
    }

    /*public double tinhTongDoanhThu() {
        sleep
    }*/
}
