package Patterns.Behavioural.ObserverPattern;

public class CurrentStatsDisplay implements DisplayElement, Observer{

    private float temperature;

    private float pressure;

    private Subject weatherData;

    public CurrentStatsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.subscribe(this);
    }

    @Override
    public void Display() {
        System.out.println("Current temp is " + this.temperature + " and pressure is " + this.pressure + " .");
    }

    @Override
    public void update() {
        WeatherData wd = (WeatherData)this.weatherData;
        this.temperature = wd.getTemperature();
        this.pressure = wd.getPressure();
        Display();
    }

    void SubscribeToSubject(){
        this.weatherData.subscribe(this);
    }

    void unSubscribeToSubject(){
        this.weatherData.unSubscribe(this);
    }


}
