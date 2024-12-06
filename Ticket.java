import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Ticket {
    private String maVe, maChuyenBay, maGhe;
    private char hangGhe;
    private double giaVe;
    private char trangThaiVe;
    private HanhKhach hanhKhach;
    private String ngayDatVe;
    public Ticket(String maVe, String maChuyenBay, String maGhe, char hangGhe, char trangThaiVe, HanhKhach hanhKhach) {
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        this.maVe = maVe;
        this.maChuyenBay = maChuyenBay;
        this.maGhe = maGhe;
        this.hangGhe = hangGhe;
        this.giaVe = tinhGiaVe();
        this.trangThaiVe = trangThaiVe;
        this.hanhKhach = hanhKhach;
        this.ngayDatVe = myDateObj.format(myFormatObj);
    }
    public String getMaVe() {
        return maVe;
    }
    public void setMaVe(String maVe) {
        this.maVe = maVe;
    }
    public String getMaChuyenBay() {
        return maChuyenBay;
    }
    public void setMaChuyenBay(String maChuyenBay) {
        this.maChuyenBay = maChuyenBay;
    }
    public String getMaGhe() {
        return maGhe;
    }
    public void setMaGhe(String maGhe) {
        this.maGhe = maGhe;
    }
    public char getHangGhe() {
        return hangGhe;
    }
    public void setHangGhe(char hangGhe) {
        this.hangGhe = hangGhe;
    }
    public double getGiaVe() {
        return giaVe;
    }
    public void setGiaVe(double giaVe) {
        this.giaVe = giaVe;
    }
    public char getTrangThaiVe() {
        return trangThaiVe;
    }
    public void setTrangThaiVe(char trangThaiVe) {
        this.trangThaiVe = trangThaiVe;
    }
    public HanhKhach getHanhKhach() {
        return hanhKhach;
    }
    public void setHanhKhach(HanhKhach hanhKhach) {
        this.hanhKhach = hanhKhach;
    }
    public String getNgayDatVe() {
        return ngayDatVe;
    }
    public void setNgayDatVe(String ngayDatVe) {
        this.ngayDatVe = ngayDatVe;
    }
    public double tinhGiaVe() {
        double giaCoBan = 0;
        switch (hangGhe) {
            case 'Y':
                giaCoBan = 1000000;
                break;
        
            case 'B':
                giaCoBan = 3000000;
                break;
            case 'F':
            giaCoBan = 5000000;
            break;
        }
        switch (hanhKhach.getHangTheThanhVien()) {
            case 'S':
                giaCoBan *= 0.95;

                break;
        
            case 'G':
                giaCoBan *= 0.90;
                break;
        }
        return giaCoBan;
    }
    @Override
    public String toString() {
        return "Ticket [maVe=" + maVe + ", maChuyenBay=" + maChuyenBay + ", maGhe=" + maGhe + ", hangGhe=" + hangGhe
                + ", giaVe=" + giaVe + ", trangThaiVe=" + trangThaiVe + ", hanhKhach=" + hanhKhach + ", ngayDatVe="
                + ngayDatVe + "]";
    }
    
    
}
