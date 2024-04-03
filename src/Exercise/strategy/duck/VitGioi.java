package strategy.duck;

public class VitGioi extends DuckHL {
    @Override
    public void display() {
        System.out.println("Tôi là vịt giời");
        System.out.println(swim());
        System.out.println(performQuack());
        System.out.println(performFly());
    }
}
