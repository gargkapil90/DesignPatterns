package Patterns.Creational.AbstractFactory;

public interface Platform {
    void SetRefeshRate();

    void SetTheme();

    UIComponentFactory createComponentFactory();
}
