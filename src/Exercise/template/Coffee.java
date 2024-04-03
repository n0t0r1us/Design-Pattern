package template;

public class Coffee extends CaffeineBeverage  {
    public void prepareRecipe() {
        System.out.println("Coffee Prepare Recipe");
        boilWater();
        brew();
        pourlnCup();
        addCondiments();
        System.out.println("---------------------");
    }

    @Override
    void addCondiments() {
        System.out.println("Add Sugar And Milk");

    }

    @Override
    void brew() {
        System.out.println("Brew: Coffee Grinds");

    }

}
