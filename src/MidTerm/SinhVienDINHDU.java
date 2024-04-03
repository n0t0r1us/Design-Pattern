package ThiGK;

public class SinhVienDINHDU extends KeHoachKyHocDINHDU {
    int maSVDINHDU;
    String hoTenSVDINHDU;
    String queQuan;
    String ngaySinh;

    public SinhVienDINHDU(int maSVDINHDU, String hoTenSVDINHDU, String queQuan, String ngaySinh){
        this.maSVDINHDU = maSVDINHDU;
        this.hoTenSVDINHDU = hoTenSVDINHDU;
        this.queQuan = queQuan;
        this.ngaySinh = ngaySinh;
    }

    @Override
    void add(KeHoachKyHocDINHDU keHoachKyHocDINHDU) {

    }

    @Override
    void remove(KeHoachKyHocDINHDU keHoachKyHocDINHDU) {

    }

    @Override
    int getSoTCDINHDU() {
        return 0;
    }

    @Override
    String getTenMHDINHDU() {
        return null;
    }

    @Override
    int getMaSVDINHDU() {
        return maSVDINHDU;
    }


    @Override
    String getHoTenSVDINHDU() {
        return hoTenSVDINHDU;
    }

    }






