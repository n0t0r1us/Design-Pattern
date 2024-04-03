package strategy.duck;

public class Main {
    public static void main(String[] args) {
        DuckHL vitGioi = new VitGioi();
        vitGioi.setFly(new FlyWithWings());
        vitGioi.setQuack(new SQuack());
        vitGioi.display();
    }
}
