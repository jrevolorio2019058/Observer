package main.java.org.observer.observer;

import main.java.org.observer.interfaces.Observer;

public class WeatherWarning implements Observer {

    @Override
    public void update(int temperature){

        if(temperature >= 35){

            System.out.println("ADVERTENCIA | Temperatura muy alta: " + temperature);

        }else if(temperature <= 0){

            System.out.println("ADVERTENCIA | Temperatura muy baja" + temperature);

        }else{

            System.out.println("Temperatura Segura");

        }

    }

}
