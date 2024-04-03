package structural.composite.ke_hoach_hoc_tap;

//component
public class MonHoc extends KeHoachHocTap {
    String tenMH;
    int soTC;
    int hocPhi;//hp tren 1 tc
    public MonHoc(String tenMH, int soTC, int hocPhi){
        this.tenMH = tenMH;
        this.soTC = soTC;
        this.hocPhi = hocPhi;
    }


    @Override
    void add(KeHoachHocTap keHoachHocTap) {

    }

    @Override
    void remove(KeHoachHocTap keHoachHocTap) {

    }

    @Override
    String getMonHocs() {
        return tenMH;
    }

    @Override
    int getStSoTC() {
        return soTC;
    }

    @Override
    int getHocPhi() {
        return hocPhi+soTC;
    }
}
