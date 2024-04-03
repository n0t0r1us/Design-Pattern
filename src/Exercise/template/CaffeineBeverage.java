package template;

public abstract class CaffeineBeverage {
    public void prepareRecipe() {
        boilWater();
        brew();
        pourlnCup();
        addCondiments();

    }
    void boilWater() {
        System.out.println("Boil Water");
    }

    void pourlnCup() {
        System.out.println("Pour in Cup");
    }

    abstract void addCondiments();

    abstract void brew();

}
