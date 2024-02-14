package Patterns.Creational.AbstractFactory.Component.Button;

public class AndroidButton implements Button{
    @Override
    public void SetSize() {
        System.out.println("Android button size set");
    }
}
