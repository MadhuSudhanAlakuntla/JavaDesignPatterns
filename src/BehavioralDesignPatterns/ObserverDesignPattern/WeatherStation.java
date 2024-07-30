package BehavioralDesignPatterns.ObserverDesignPattern;

import java.util.Observable;

//First Let's create the WeatherStation class that extends Observable:
public class WeatherStation extends Observable {
    private int temperature;

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        setChanged(); // Marks this Observable object as having been changed
        notifyObservers(temperature); // If this object has changed, then notify all of its observers
    }

    public int getTemperature() {
        return temperature;
    }
}
