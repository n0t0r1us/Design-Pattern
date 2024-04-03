package structural.decorator.hl_beverage;

public class HL_HouseBlend extends HL_Beverage {
    public HL_HouseBlend(String description){
        this.description = description;
    }
    public int cost(){
        return 10;
    }
}
