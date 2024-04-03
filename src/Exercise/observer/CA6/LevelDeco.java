package observer.CA6;

public class LevelDeco extends Level {
    Level level;

    public LevelDeco(Level level) {
        this.level = level;
    }

    @Override
    public void updateLevel(int thoiGian, int soLuot, int diemToiDa) {
        this.updateLevel(20,5,10);
    }
}

