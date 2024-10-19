package main.java.org.observer.subject;

import main.java.org.observer.interfaces.Observer;
import main.java.org.observer.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {

    private List<Observer> observers;
    private int temperature;

    public WeatherStation() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {

        observers.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {

        observers.remove(observer);

    }

    @Override
    public void notifyObservers() {

        for (Observer observer : observers) {

            observer.update(temperature);

        }

    }

    @Override
    public void setTemperature(int temperature) {

        this.temperature = temperature;
        notifyObservers();

    }


}
