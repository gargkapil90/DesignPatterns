package Patterns.Behavioural.ObserverPattern;

public class AvgStatsDisplay implements Observer, DisplayElement{
    private float temperature;

    private float pressure;

    private WeatherData weatherData;

    public AvgStatsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.subscribe(this);
    }

    @Override
    public void Display() {
        System.out.println("Average temp is " + this.temperature + " and pressure is " + this.pressure + " .");
    }

    @Override
    public void update() {
        this.temperature = this.weatherData.getTemperature();
        this.pressure = this.weatherData.getPressure();
        Display();
    }

    void SubscribeToSubject(){
        this.weatherData.subscribe(this);
    }

    void unSubscribeToSubject(){
        this.weatherData.unSubscribe(this);
    }
}
