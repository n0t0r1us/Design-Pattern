package strategy.CC2;


public class SinhVien {
    String hoTen, ngaySinh;
    float diemTB;
    public SinhVien(String hoTen, String ngaySinh, float diemTB){
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diemTB = diemTB;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }

    public void create_list() {
        System.out.println("Ho ten cua sinh vien:= " +hoTen);
        System.out.println("Ngay sinh cua sinh vien:= " +ngaySinh);
        System.out.println("Diem trung binh cua sinh vien:= "+diemTB + "\n");
    }
}
