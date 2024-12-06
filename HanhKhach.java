public class HanhKhach implements IHanhKhach{
    private String id;
    private String tenHanhKhach;
    private int namSinh;
    private String soHoChieu;
    private String idHangBay;
    private String maTheThanhVien;
    private double soDamTichLuy;
    private char hangTheThanhVien;
    private Ticket[] dsVeDaDat;
    private String diaChi;
    private int soVeToiDa = 5;
    public HanhKhach() {

    }

    public HanhKhach(String id, String tenHanhKhach, int namSinh, String soHoChieu) {
        this.id = id;
        this.tenHanhKhach = tenHanhKhach;
        this.namSinh = namSinh;
        this.soHoChieu = soHoChieu;
        this.soDamTichLuy = 0;
        dsVeDaDat = new Ticket[soVeToiDa];
    }
  

    @Override
    public void datVe(String maChuyenBay, char hangGhe) {
        
    }


    @Override
    public void huyVe(String maVe) {
        
    }

    @Override
    public void doiVe(String maVeCu, String maChuyenBaymoi) {
       
    }

    @Override
    public char checkTrangThai(String maVe) {
        return 'h';
    }

    @Override
    public void tichLuy(double khoangCach, char hangGhe) {
        soDamTichLuy+= khoangCach;
    }
    public double tinhToanDamBay() {
        
    }
    public void nangHangTheThanhVien() {

    }

    @Override
    public String toString() {
        return "HanhKhach [id=" + id + ", tenHanhKhach=" + tenHanhKhach + ", namSinh=" + namSinh + ", soHoChieu="
                + soHoChieu + ", idHangBay=" + idHangBay + ", maTheThanhVien=" + maTheThanhVien + ", soDamTichLuy="
                + soDamTichLuy + ", hangTheThanhVien=" + hangTheThanhVien + ", diaChi=" + diaChi + "]";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenHanhKhach() {
        return tenHanhKhach;
    }

    public void setTenHanhKhach(String tenHanhKhach) {
        this.tenHanhKhach = tenHanhKhach;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getSoHoChieu() {
        return soHoChieu;
    }

    public void setSoHoChieu(String soHoChieu) {
        this.soHoChieu = soHoChieu;
    }

    public String getIdHangBay() {
        return idHangBay;
    }

    public void setIdHangBay(String idHangBay) {
        this.idHangBay = idHangBay;
    }

    public String getMaTheThanhVien() {
        return maTheThanhVien;
    }

    public void setMaTheThanhVien(String maTheThanhVien) {
        this.maTheThanhVien = maTheThanhVien;
    }

    public double getSoDamTichLuy() {
        return soDamTichLuy;
    }

    public void setSoDamTichLuy(double soDamTichLuy) {
        this.soDamTichLuy = soDamTichLuy;
    }

    public char getHangTheThanhVien() {
        return hangTheThanhVien;
    }

    public void setHangTheThanhVien(char hangTheThanhVien) {
        this.hangTheThanhVien = hangTheThanhVien;
    }

    public Ticket[] getDsVeDaDat() {
        return dsVeDaDat;
    }

    public void setDsVeDaDat(Ticket[] dsVeDaDat) {
        this.dsVeDaDat = dsVeDaDat;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }


}
