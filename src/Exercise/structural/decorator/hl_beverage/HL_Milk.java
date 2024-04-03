package structural.decorator.hl_beverage;

public class HL_Milk extends HL_CondimentDecorator{
    public HL_Milk(HL_Beverage component) {
        super(component);
    }

    @Override
    public int cost() {
        return component.cost() +4;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "+ Sữa ông Thọ ";
    }
}
