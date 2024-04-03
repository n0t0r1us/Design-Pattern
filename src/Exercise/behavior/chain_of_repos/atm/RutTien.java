package behavior.chain_of_repos.atm;

public class RutTien implements ATM {
    int menhGia;
    ATM menhGiaThapHon =null;
    public RutTien(int menhGia) {
        this.menhGia = menhGia;

    }

    @Override
    public int rutTien(int soTien) {
        int soTo=0;
        soTo= soTien / menhGia;
        int tienDu = soTien % menhGia;
        if (soTo>0)
            System.out.println(menhGia + ": " + soTo);
        if (tienDu>0 && menhGiaThapHon !=null)
            menhGiaThapHon.rutTien(tienDu);

        return soTo;
    }

    @Override
    public ATM thietLapMenhGiaThapHon(ATM atm) {
        menhGiaThapHon = atm;
        return atm;
    }
}
