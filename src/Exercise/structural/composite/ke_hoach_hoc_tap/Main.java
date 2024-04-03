package structural.composite.ke_hoach_hoc_tap;

public class Main {
    public static void main(String[] args){
        KeHoachHocTap khoaHoc = new KeHoachChung();
        KeHoachHocTap nam1 = new KeHoachChung();
        KeHoachHocTap nam2 = new KeHoachChung();
        KeHoachHocTap ky1 = new KeHoachChung();
        KeHoachHocTap ky2 = new KeHoachChung();
        KeHoachHocTap ky3 = new KeHoachChung();
        KeHoachHocTap ky4 = new KeHoachChung();
        KeHoachHocTap LichSuDang = new MonHoc("Lịch sử Đảng", 2, 300);
        nam1.add(ky1);
        nam1.add(ky2);
        ky1.add(LichSuDang);

        System.out.println("So tin chi" +nam1.getStSoTC());
        System.out.println("hoc phi" +nam1.getHocPhi());

    }
}
