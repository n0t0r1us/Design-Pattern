package strategy.tinh;

public class Cong implements Tinh{
    @Override
    public float tinh(float a, float b) {
        float c = a +b;
        return c;
    }
}
