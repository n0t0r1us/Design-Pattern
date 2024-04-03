package observer.CA5;

public class TaiKhoan implements ATM.TaiKhoan{
    String ten;
    int soDu;
    ATM atm;

    public TaiKhoan(String ten, int soDu, ATM atm) {
        this.ten = ten;
        this.soDu = soDu;
        this.atm = atm;
    }

    public void duaTheVaoATM(){
        atm.attach(this);
    }
    public void rutTheKhoiATM(){
        atm.detach(this);
    }

    @Override
    public boolean kiemTraSoDu(int tienRut) {
        return soDu -tienRut>=50;
    }

    @Override
    public void nhanThongBao(int tienRut, boolean thanhCong) {
        System.out.println("Chào "+ten);
        if (thanhCong==true){
            System.out.println("Số dư: "+soDu);
            System.out.println("Số tiền rút "+tienRut);
            soDu -= tienRut;
            System.out.println("\n Số dư còn lại"+ soDu);
        }
        else {
            System.out.println("\n Số dư: "+ soDu);
            System.out.println("Rút tiền thất bại");
        }

    }
}
