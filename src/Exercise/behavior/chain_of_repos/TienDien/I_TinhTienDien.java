package behavior.chain_of_repos.TienDien;

public interface I_TinhTienDien {
    I_TinhTienDien bacTiepTheo(I_TinhTienDien keTiep);
    int tienDien(int soKW);
}
