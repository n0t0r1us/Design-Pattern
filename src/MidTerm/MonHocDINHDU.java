package ThiGK;

public class MonHocDINHDU extends KeHoachKyHocDINHDU {
    String maMHDINHDU;
    String tenMHDINHDU;
    int soTCDINHDU;

    public MonHocDINHDU(String maMHDINHDU, String tenMHDINHDU, int soTCDINHDU){
        this.maMHDINHDU = maMHDINHDU;
        this.tenMHDINHDU = tenMHDINHDU;
        this.soTCDINHDU = soTCDINHDU;
    }
@Override
    void add(KeHoachKyHocDINHDU keHoachKyHocDINHDU){

}
@Override
    void remove(KeHoachKyHocDINHDU keHoachKyHocDINHDU){

}

@Override
    int getSoTCDINHDU(){

        return soTCDINHDU;
}
@Override
    String getTenMHDINHDU(){
        return tenMHDINHDU;
}

    @Override
    int getMaSVDINHDU() {
        return 0;
    }

    @Override
    String getHoTenSVDINHDU() {
        return null;
    }

}

