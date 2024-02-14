package Patterns.Behavioural.ObserverPattern;

public interface Subject {
    void subscribe(Observer observer);

    void unSubscribe(Observer observer);

    void notifyObservers();
}
