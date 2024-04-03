package strategy.CC2;

public class Main {
    public static void main(String[] args) {
        QLSV qlsv = new QLSV();
        SinhVien sinhVien3 = new SinhVien("Ayy","19/02/2000", 9);
        SinhVien sinhvien1 = new SinhVien("Vu","20/01/2000" , 6);
        SinhVien sinhvien2 = new SinhVien("Du","25/11/2001" , 3);
        qlsv.addSV(sinhvien1);
        qlsv.addSV(sinhvien2);
        qlsv.addSV(sinhVien3);
        System.out.println("Danh sach sv: ");
        qlsv.inDS();
        ISoSanh<SinhVien> ss = new SoSanhTheoTen();
        ISoSanh<SinhVien> s= new SoSanhTheoDiem();
        qlsv.sapXep(new ISoSanh<SinhVien>() {
            @Override
            public int soSanh(SinhVien t1, SinhVien t2) {
                if (t1.diemTB> t2.diemTB)
                    return 1;
                if (t1.diemTB == t2.diemTB)
                    return 0;
                return -1;
            }
        });
        qlsv.sapXep(new SoSanhTheoDiem());
        System.out.println("Danh sach sv theo diem: ");
        qlsv.inDS();
        qlsv.sapXep(new SoSanhTheoTen());
        System.out.println("Danh sach sv theo ten: ");
        qlsv.inDS();
    }
}
