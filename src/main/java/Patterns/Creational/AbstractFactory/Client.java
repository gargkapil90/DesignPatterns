package Patterns.Creational.AbstractFactory;

import Patterns.Creational.AbstractFactory.Component.Button.Button;

public class Client {
    public static void main(String[] args) {
        Platform p = new Android();
        UIComponentFactory uiComponentFactory = p.createComponentFactory();
        Button b = uiComponentFactory.CreateButton();
        b.SetSize();
    }
}
