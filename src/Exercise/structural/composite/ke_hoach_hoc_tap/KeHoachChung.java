package structural.composite.ke_hoach_hoc_tap;

import java.util.ArrayList;
import java.util.List;

//composite
public class KeHoachChung extends KeHoachHocTap {
    List<KeHoachHocTap> list = new ArrayList<>();

    @Override
    void add(KeHoachHocTap keHoachHocTap) {
        list.add(keHoachHocTap);

    }

    @Override
    void remove(KeHoachHocTap keHoachHocTap) {
        list.remove(keHoachHocTap);

    }

    @Override
    String getMonHocs() {
        return null;
    }

    @Override
    int getStSoTC() {
        int tong = 0;
        for(KeHoachHocTap k: list)
            tong += k.getStSoTC();
        return tong;
    }

    @Override
    int getHocPhi() {
        int HocPhi = 0;
        for(KeHoachHocTap k: list) {
            HocPhi += k.getHocPhi();
        }
        return HocPhi;
    }
}
