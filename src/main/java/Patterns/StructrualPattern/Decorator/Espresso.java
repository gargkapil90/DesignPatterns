package Patterns.StructrualPattern.Decorator;

public class Espresso implements Beverage{
    @Override
    public float getCost() {
        return 10;
    }

    @Override
    public String getDescription() {
        return "Espresso coffee";
    }
}
