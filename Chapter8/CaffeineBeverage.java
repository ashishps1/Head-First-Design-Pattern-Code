package Chapter8;

public abstract class CaffeineBeverage {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments()) {
           addCondiments();
        }
    }
    public abstract void brew();
    public abstract void addCondiments();
    void boilWater() {
        System.out.println("Boiling Water");
    }
    void pourInCup() {
        System.out.println("pouring into cup");
    }
    public boolean customerWantsCondiments() {
        return true;
    }
}
