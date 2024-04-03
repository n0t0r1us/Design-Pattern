package structural.decorator.hl_beverage;

public abstract class HL_CondimentDecorator extends HL_Beverage {
    HL_Beverage component;
    public HL_CondimentDecorator(HL_Beverage component) {
        this.component = component;
    }
    public String getDescription(){
        return component.getDescription();
    }
}
