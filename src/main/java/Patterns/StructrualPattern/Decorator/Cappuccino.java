package Patterns.StructrualPattern.Decorator;

public class Cappuccino implements Beverage{
    @Override
    public float getCost() {
        return 20;
    }

    @Override
    public String getDescription() {
        return "Cappuccino coffee";
    }
}
