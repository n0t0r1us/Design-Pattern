package behavior.chain_of_repos.TienDien;

public class Main {
    public static void main(String[] args) {
        TienDienBacN bac1 = new TienDienBacN(0, 50, 1678);
        TienDienBacN bac2 = new TienDienBacN(50, 100, 1734);
        TienDienBacN bac3 = new TienDienBacN(100, 200, 2014);
        TienDienBacN bac4 = new TienDienBacN(200, 300, 2536);
        TienDienBacN bac5 = new TienDienBacN(300, 400, 2834);
        TienDienBacN bac6 = new TienDienBacN(400, Integer.MAX_VALUE,2927 );
        bac1.bacTiepTheo(bac2).bacTiepTheo(bac3).bacTiepTheo(bac4).bacTiepTheo(bac5).bacTiepTheo(bac6);
        System.out.println("Tong tien dien la: " +bac1.tienDien(270));
    }
}
