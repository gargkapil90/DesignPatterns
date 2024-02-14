package Patterns.Creational.AbstractFactory;

public class Android implements Platform{
    @Override
    public void SetRefeshRate() {
        System.out.println("Android refreshed");
    }

    @Override
    public void SetTheme() {
        System.out.println("Android theme updated");
    }

    @Override
    public UIComponentFactory createComponentFactory() {
        System.out.println("Android UI component factory created.");
        return new AndriodUIComponentFactory();
    }
}
