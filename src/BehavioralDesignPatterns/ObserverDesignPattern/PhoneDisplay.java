package BehavioralDesignPatterns.ObserverDesignPattern;

import java.util.Observable;
import java.util.Observer;

//Next, we'll create concrete observers that implement the Observer interface:
public class PhoneDisplay implements Observer {
    private String displayId;

    public PhoneDisplay(String displayId) {
        this.displayId = displayId;
    }

    @Override
    public void update(Observable observable, Object arg) {
        if (observable instanceof WeatherStation) {
            int temperature = (int) arg;
            System.out.println("PhoneDisplay " + displayId + " updated with temperature: " + temperature);
        }
    }
}
