package template;

public class Tea extends CaffeineBeverage  {
    public void prepareRecipe() {
        System.out.println("Tea Prepare Recipe");
        boilWater();
        brew();
        pourlnCup();
        addCondiments();
        System.out.println("---------------------");
    }

    @Override
    void addCondiments() {
        System.out.println("Add Lemon");

    }

    @Override
    void brew() {
        System.out.println("Brew: Steep Tea Bag");

    }

}