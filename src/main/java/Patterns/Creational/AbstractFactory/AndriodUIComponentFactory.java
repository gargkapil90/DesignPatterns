package Patterns.Creational.AbstractFactory;

import Patterns.Creational.AbstractFactory.Component.Button.AndroidButton;
import Patterns.Creational.AbstractFactory.Component.Button.Button;
import Patterns.Creational.AbstractFactory.Component.Dropdown.AndroidDropdown;
import Patterns.Creational.AbstractFactory.Component.Dropdown.Dropdown;

public class AndriodUIComponentFactory implements UIComponentFactory{
    @Override
    public Button CreateButton() {
        System.out.println("Android button created");
        return new AndroidButton();
    }

    @Override
    public Dropdown CreateDropdown() {
        System.out.println("Android dropdown created");
        return new AndroidDropdown();
    }
}
