package BehavioralDesignPatterns.ObserverDesignPattern;

import java.util.Observer;

public class ObserverPatternTest {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        Observer phoneDisplay1 = new PhoneDisplay("1");
        Observer phoneDisplay2 = new PhoneDisplay("2");
        Observer laptopDisplay1 = new LaptopDisplay("1");

        weatherStation.addObserver(phoneDisplay1);
        weatherStation.addObserver(phoneDisplay2);
        weatherStation.addObserver(laptopDisplay1);

        weatherStation.setTemperature(25);
        weatherStation.setTemperature(30);

        weatherStation.deleteObserver(phoneDisplay1);
        weatherStation.setTemperature(35);
    }
}
