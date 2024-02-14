package Patterns.Creational.AbstractFactory;

import Patterns.Creational.AbstractFactory.Component.Button.Button;
import Patterns.Creational.AbstractFactory.Component.Dropdown.Dropdown;

public interface UIComponentFactory {
    Button CreateButton();

    Dropdown CreateDropdown();
}
