package Patterns.StructrualPattern.Decorator.Addons;

import Patterns.StructrualPattern.Decorator.Beverage;

public class Milk implements Addons{

    Beverage cb;

    public Milk(Beverage cb) {
        this.cb = cb;
    }

    @Override
    public float getCost() {
        return 10 + cb.getCost();
    }

    @Override
    public String getDescription() {
        return cb.getDescription() + " with milk";
    }
}
