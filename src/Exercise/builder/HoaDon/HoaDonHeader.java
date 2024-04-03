package builder.HoaDon;

import java.util.Date;

public class HoaDonHeader {
    String mahoadon;
    Date ngayban;
    String tenkhachhang;

    public HoaDonHeader(String mahoadon, Date ngayban, String tenkhachhang) {
        this.mahoadon = mahoadon;
        this.ngayban = ngayban;
        this.tenkhachhang = tenkhachhang;
    }
    public HoaDonHeader(){}

    public String getMahoadon() {
        return mahoadon;
    }

    public Date getNgayban() {
        return ngayban;
    }

    public String getTenkhachhang() {
        return tenkhachhang;
    }

    public void setMahoadon(String mahoadon) {
        this.mahoadon = mahoadon;
    }

    public void setNgayban(Date ngayban) {
        this.ngayban = ngayban;
    }

    public void setTenkhachhang(String tenkhachhang) {
        this.tenkhachhang = tenkhachhang;
    }

    @Override
    public String toString() {
        return "HoaDonHeader{" +
                "mahoadon=" + mahoadon +
                ", ngayban=" + ngayban +
                ", tenkhachhang=" + tenkhachhang + '}';
    }
}
