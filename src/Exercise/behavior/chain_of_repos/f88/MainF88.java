package behavior.chain_of_repos.f88;

public class MainF88 {
    public static void main(String[] args){
        IXuLyKhoanVay gacCong = new NhanVienF88("Tuyển", "Gác cổng", 1000000);
        IXuLyKhoanVay giuXe = new NhanVienF88("Tuấn", "Giữ xe", 10000000);
        IXuLyKhoanVay thuKy = new NhanVienF88("Kiều", "Thư ký", 300000000);
        IXuLyKhoanVay truongPhong = new NhanVienF88("vũ", "trưởng phòng", 50000000);
        IXuLyKhoanVay giamDoc = new GiamDocF88("Phương",  1000000000);
        gacCong.capCaoHon(giuXe)
                .capCaoHon(thuKy)
                .capCaoHon(truongPhong)
                .capCaoHon(giamDoc);
        System.out.println(gacCong.xuLyVay(250000000));
    }
}
