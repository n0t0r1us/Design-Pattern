package structural.composite.ke_hoach_hoc_tap;

public abstract class KeHoachHocTap {
    //phuong thuc bat buoc
    abstract void add(KeHoachHocTap keHoachHocTap);
    abstract void remove(KeHoachHocTap keHoachHocTap);
    //end
    //cac phuong thuc theo yeu cau, trong mau goi la operation
    abstract String getMonHocs();
    abstract int getStSoTC();
    abstract int getHocPhi();
}
