package observer.CA6;

public class Level1 extends LevelDeco{
    public Level1(Level level) {
        super(level);
    }

    @Override
    public void updateLevel(int thoiGian, int soLuot, int diemToiDa) {
        super.updateLevel(10,30,10);
    }
}

