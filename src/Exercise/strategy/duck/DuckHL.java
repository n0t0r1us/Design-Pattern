package strategy.duck;

public abstract class DuckHL {
    IFlybehaviorHL fly;
    IQuackbehaviorHL quack;

    public void setFly(IFlybehaviorHL fly) {
        this.fly = fly;
    }

    public void setQuack(IQuackbehaviorHL quack) {
        this.quack = quack;
    }

    public abstract void display();
    public String performQuack() {
        return quack.quack();
    }
    public String performFly(){
        return fly.fly();
    }
    public String swim(){
        return "Đạp vịt";
    }
}
