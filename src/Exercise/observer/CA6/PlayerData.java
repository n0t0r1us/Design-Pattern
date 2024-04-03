package observer.CA6;

public class PlayerData extends Level{
    I_theoDoi theoDoi;

    public void attach(I_theoDoi playerData){
        theoDoi = playerData;
    }

    public void detach(I_theoDoi playerData){
        if(theoDoi == playerData)
         theoDoi = null;
    }

    public void capNhat(int thoiGian, int soLuot, int diemToiDa)
    {
        theoDoi.updateInfo(thoiGian,soLuot,diemToiDa);
    }

    @Override
    public void updateLevel(int thoiGian, int soLuot, int diemToiDa) {
        theoDoi.updateLevel(thoiGian,soLuot,diemToiDa);
    }

    public static interface I_theoDoi{
        public void updateInfo(int thoiGian, int soLuot, int diemToiDa);
        public void updateLevel(int thoiGian, int soLuot, int diemToiDa);
    }
}
