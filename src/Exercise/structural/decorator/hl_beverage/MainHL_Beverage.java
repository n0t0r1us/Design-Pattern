package structural.decorator.hl_beverage;

public class MainHL_Beverage {
    public static void main(String[] args) {
        HL_Beverage cafe = new HL_HouseBlend("Cafe House Blend Trung Nguyên ");
        cafe = new HL_Milk(cafe);
        cafe = new HL_Milk(cafe);
        System.out.println(cafe.getDescription());
        System.out.println("Giá: " + cafe.cost());
    }
}
