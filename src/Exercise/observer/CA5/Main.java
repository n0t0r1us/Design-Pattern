package observer.CA5;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        TaiKhoan du = new TaiKhoan("Dũ",6900000,atm);
        du.duaTheVaoATM();
        atm.rutTien(100);
        atm.rutTien(200);
        du.rutTheKhoiATM();
        atm.rutTien(500);
    }
}
