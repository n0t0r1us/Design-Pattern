package observer.CA5;

public class ATM {
    TaiKhoan taiKhoan;
    public void attach(TaiKhoan taiKhoanGD){
        taiKhoan = taiKhoanGD;
    }
    public void detach(TaiKhoan taiKhoanGD){
        if (taiKhoanGD == taiKhoan)
            taiKhoan = null;
    }
    public void rutTien(int tienRut){
        if (taiKhoan != null){
            taiKhoan.nhanThongBao(tienRut, taiKhoan.kiemTraSoDu(tienRut));
        }
        else
            System.out.println("chưa có thẻ!");

    }
    public static interface TaiKhoan{
        boolean kiemTraSoDu(int tienRut);
        void nhanThongBao(int tienRut, boolean thanhCong);
    }
}
