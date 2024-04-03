package behavior.chain_of_repos.atm;

public class ATMMain {
    public static void main(String[] args) {
        ATM namtram = new RutTien(500);
        ATM mottram = new RutTien(100);
        ATM nammuoi = new RutTien(50);
        ATM muoi = new RutTien(10);
        ATM mot = new RutTien(1);
        namtram.thietLapMenhGiaThapHon(mottram)
                .thietLapMenhGiaThapHon(nammuoi)
                .thietLapMenhGiaThapHon(muoi)
                .thietLapMenhGiaThapHon(mot);
        System.out.println(namtram.rutTien(293));
//        ATM.rutTien(547);
        ATM_Factory factory = new ATM_Factory();
        System.out.println("Phan 2: ");
        factory.taoATM_TheoMenhGia(MenhGia.M50).rutTien(293);
    }
}
