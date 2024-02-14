package Patterns.Creational.AbstractFactory;

public class IOS implements Platform{
    @Override
    public void SetRefeshRate() {
        System.out.println("IOS refreshed.");
    }

    @Override
    public void SetTheme() {
        System.out.println("IOS theme updated");
    }

    @Override
    public UIComponentFactory createComponentFactory() {
        System.out.println("IOS UI component factory created.");
        return new IOSUIComponentFactory();
    }
}
