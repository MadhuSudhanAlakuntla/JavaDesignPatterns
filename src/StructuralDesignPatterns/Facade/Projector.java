package StructuralDesignPatterns.Facade;

//the individual component
public class Projector {
    public void on() {
        System.out.println("Projector is ON");
    }

    public void off() {
        System.out.println("Projector is OFF");
    }
}
