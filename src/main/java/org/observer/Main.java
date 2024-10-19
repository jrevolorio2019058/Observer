package main.java.org.observer;

import main.java.org.observer.observer.TemperatureDisplay;
import main.java.org.observer.observer.WeatherWarning;
import main.java.org.observer.subject.WeatherStation;

public class Main {
    public static void main(String[] args) {

        WeatherStation station = new WeatherStation();

        TemperatureDisplay temperatureDisplay = new TemperatureDisplay();
        WeatherWarning weatherWarning = new WeatherWarning();

        station.addObserver(temperatureDisplay);
        station.addObserver(weatherWarning);

        System.out.println("Se agregan los observadores");

        System.out.println("");

        station.setTemperature(40);

        System.out.println("");

        station.setTemperature(-15);

        System.out.println("");

        station.setTemperature(14);

        System.out.println("");

        System.out.println("Se borro el observador TemperatureDisplay");

        System.out.println("");

        station.removeObserver(temperatureDisplay);

        station.setTemperature(16);

    }
}