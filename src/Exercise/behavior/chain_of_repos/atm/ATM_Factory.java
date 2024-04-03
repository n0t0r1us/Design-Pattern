package behavior.chain_of_repos.atm;

public class ATM_Factory {
    ATM menhGia500 = new RutTien(500);
    ATM menhGia200 = new RutTien(200);
    ATM menhGia100 = new RutTien(100);
    ATM menhGia50 = new RutTien(50);

    ATM menhGia20 = new RutTien(20);
    ATM menhGia10 = new RutTien(10);
    ATM menhGia5 = new RutTien(5);
    ATM menhGia2 = new RutTien(2);
    ATM menhGia1 = new RutTien(1);
    public ATM_Factory(){
        menhGia500
                .thietLapMenhGiaThapHon(menhGia200)
                .thietLapMenhGiaThapHon(menhGia100)
                .thietLapMenhGiaThapHon(menhGia50)
                .thietLapMenhGiaThapHon(menhGia20)
                .thietLapMenhGiaThapHon(menhGia10)
                .thietLapMenhGiaThapHon(menhGia5)
                .thietLapMenhGiaThapHon(menhGia2)
                .thietLapMenhGiaThapHon(menhGia1);

    }
    ATM taoATM_TheoMenhGia(MenhGia menhGia){
        switch (menhGia){
            case M500 -> {
                return menhGia500;
            }
            case M200 -> {
                return menhGia200;
            }
            case M100 -> {
                return menhGia100;
            }
            case M50 -> {
                return menhGia50;
            }
        }
        return menhGia500;
    }
}
