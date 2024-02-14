package Patterns.Behavioural.ObserverPattern;

public class Client {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentStatsDisplay currentStat = new CurrentStatsDisplay(weatherData);
        Observer avgStat = new AvgStatsDisplay(weatherData);

        weatherData.setData(34.8F, 23.9F);

        weatherData.setData(45.2F, 90.5F);

        currentStat.unSubscribeToSubject();

        weatherData.setData(90.4F, 56.8F);

        currentStat.SubscribeToSubject();
        weatherData.setData(76.3F, 97.4F);


    }
}
