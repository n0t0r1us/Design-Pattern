package builder.HoaDon;

public class CTHD {

    String tenSP;
    int giaSP;
    double chietKhau;
    int soLuong;

    public CTHD(String tenSP, int giaSP, double chietKhau, int soLuong) {
        this.tenSP = tenSP;
        this.giaSP = giaSP;
        this.chietKhau = chietKhau;
        this.soLuong = soLuong;
    }

    public String gettenSP() {
        return tenSP;
    }

    public int getgiaSP() {
        return giaSP;
    }

    public double getchietKhau() {
        return chietKhau;
    }

    public int getsoLuongSP() {
        return soLuong;
    }

}