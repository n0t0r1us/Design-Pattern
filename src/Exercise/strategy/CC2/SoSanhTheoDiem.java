package strategy.CC2;

public class SoSanhTheoDiem implements ISoSanh<SinhVien> {
    @Override
    public int soSanh(SinhVien t1, SinhVien t2) {
        if (t1.getDiemTB() == t2.getDiemTB()) {
            return 0;
        }
        else {
            if (t1.getDiemTB() > t2.getDiemTB()){
                return -1;
        }
    }
        return -1;
    }
}
