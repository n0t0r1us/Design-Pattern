package strategy.duck;

public class SQuack implements IQuackbehaviorHL {
    @Override
    public String quack() {
        return "Quack quack";
    }
}
