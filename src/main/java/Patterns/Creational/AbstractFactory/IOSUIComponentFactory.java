package Patterns.Creational.AbstractFactory;

import Patterns.Creational.AbstractFactory.Component.Button.Button;
import Patterns.Creational.AbstractFactory.Component.Button.IOSButton;
import Patterns.Creational.AbstractFactory.Component.Dropdown.Dropdown;
import Patterns.Creational.AbstractFactory.Component.Dropdown.IOSDropdown;
import Patterns.Creational.AbstractFactory.UIComponentFactory;

public class IOSUIComponentFactory implements UIComponentFactory {
    @Override
    public Button CreateButton() {
        System.out.println("IOS button created");
        return new IOSButton();
    }

    @Override
    public Dropdown CreateDropdown() {
        System.out.println("IOS dropdown created");
        return new IOSDropdown();
    }
}
