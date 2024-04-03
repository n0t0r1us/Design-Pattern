package ThiGK;

public class MainDINHDU {
    public static void main(String[] args){
        KeHoachKyHocDINHDU monHoc1 = new MonHocDINHDU("MTK", "Mẫu Thiết Kế",
                3);
        KeHoachKyHocDINHDU monHoc2 = new MonHocDINHDU("A", "Lập trình di động Android",
                3);
        KeHoachKyHocDINHDU monHoc3 = new MonHocDINHDU("csdl1", "Cơ sở dữ liệu",
                3);
        KeHoachKyHocDINHDU sinhVienDINHDU = new SinhVienDINHDU(61131562,"Phan Nguyễn Đình Vũ ",
                "Nha Trang",
                "20/01/2001");
        System.out.println("Kỳ 1: \n"+"\tTên môn học sv đăng ký: "+monHoc1.getTenMHDINHDU()+" "
                +monHoc2.getTenMHDINHDU()+" "+monHoc3.getTenMHDINHDU()+ "\n\tThông tin SV: "+
                sinhVienDINHDU.getHoTenSVDINHDU()+" "+"MSSV: "+sinhVienDINHDU.getMaSVDINHDU());
    }
}
