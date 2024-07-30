package StructuralDesignPatterns.Facade;

//the individual component
public class DVDPlayer {
    public void on() {
        System.out.println("DVD Player is ON");
    }

    public void play(String movie) {
        System.out.println("Playing movie: " + movie);
    }

    public void stop() {
        System.out.println("Stopping movie");
    }

    public void off() {
        System.out.println("DVD Player is OFF");
    }
}
