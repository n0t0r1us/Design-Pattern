package behavior.chain_of_repos.TienDien;

public class TienDienBacN implements I_TinhTienDien{
    int min, max, gia;
    I_TinhTienDien keTiep;

    public TienDienBacN(int min, int max, int gia) {
        this.min = min;
        this.max = max;
        this.gia = gia;
    }

    @Override
    public I_TinhTienDien bacTiepTheo(I_TinhTienDien keTiep) {
        this.keTiep = keTiep;
        return keTiep;
    }

    @Override
    public int tienDien(int soKW) {
        if(soKW<= max - min) {
            System.out.println("Bac: "+(min+1)+"--> " +max+": "+ soKW+"x"+gia+" = "+ soKW*gia);

            return soKW * gia;
        }
        int conLai = soKW - (max - min);
        System.out.println("Bac: "+(min+1)+"--> " +max+": "+ (max-min)+"x"+gia+" = "+ (max-min)*gia);
        return (max - min)*gia +keTiep.tienDien(conLai);
    }
}
