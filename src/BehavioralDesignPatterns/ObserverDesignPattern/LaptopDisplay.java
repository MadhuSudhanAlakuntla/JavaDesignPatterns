package BehavioralDesignPatterns.ObserverDesignPattern;


import java.util.Observable;
import java.util.Observer;

public class LaptopDisplay implements Observer {
    private String displayId;

    public LaptopDisplay(String displayId) {
        this.displayId = displayId;
    }

    @Override
    public void update(Observable observable, Object arg) {
        if (observable instanceof WeatherStation) {
            int temperature = (int) arg;
            System.out.println("LaptopDisplay " + displayId + " updated with temperature: " + temperature);
        }
    }
}
