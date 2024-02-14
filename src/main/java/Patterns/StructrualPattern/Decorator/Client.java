package Patterns.StructrualPattern.Decorator;

import Patterns.StructrualPattern.Decorator.Addons.Chocolate;
import Patterns.StructrualPattern.Decorator.Addons.Milk;

public class Client {
    public static void main(String[] args) {
        Beverage es = new Espresso();
        es = new Milk(es);
        es = new Chocolate(es);
        System.out.println(es.getCost());
        System.out.println(es.getDescription());
    }
}
