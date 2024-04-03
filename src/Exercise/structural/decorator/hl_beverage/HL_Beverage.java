package structural.decorator.hl_beverage;

public abstract class HL_Beverage {
    String description;
    public abstract int cost();
    public String getDescription(){
        return description;
    }
}
