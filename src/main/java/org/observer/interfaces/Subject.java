package main.java.org.observer.interfaces;

public interface Subject {

    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void setTemperature(int temperature);
    void notifyObservers();

}
