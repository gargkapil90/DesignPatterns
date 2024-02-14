package Patterns.Creational.AbstractFactory.Component.Button;

public class IOSButton implements Button{
    @Override
    public void SetSize() {
        System.out.println("IOS button size set");
    }
}
