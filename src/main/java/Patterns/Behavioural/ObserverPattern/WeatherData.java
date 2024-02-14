package Patterns.Behavioural.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{

    private float temperature;

    private float pressure;
    private List<Observer> observers;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
        System.out.println("Observer registered!!");
    }

    @Override
    public void unSubscribe(Observer observer) {
        observers.remove(observer);
        System.out.println("Observer de-registered!!");
    }

    @Override
    public void notifyObservers() {
        for(Observer ob : observers){
            ob.update();
        }
    }

    void setData(float temperature, float pressure){
        this.temperature = temperature;
        this.pressure = pressure;
        notifyObservers();
    }
}
