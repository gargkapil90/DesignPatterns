package Patterns.StructrualPattern.Decorator.Addons;

import Patterns.StructrualPattern.Decorator.Beverage;

public class Chocolate implements Addons{
    Beverage cb;

    public Chocolate(Beverage cb) {
        this.cb = cb;
    }

    @Override
    public float getCost() {
        return cb.getCost() + 15;
    }

    @Override
    public String getDescription() {
        return cb.getDescription() + " with chocolate";
    }
}
