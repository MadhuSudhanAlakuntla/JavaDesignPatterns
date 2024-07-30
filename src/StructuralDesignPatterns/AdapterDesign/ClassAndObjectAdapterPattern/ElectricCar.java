package StructuralDesignPatterns.AdapterDesign.ClassAndObjectAdapterPattern;

// Adaptee class
public class ElectricCar {
    public void turnOn() {
        System.out.println("Electric car turned on");
    }

    public void speedUp() {
        System.out.println("Electric car is speeding up");
    }

    public void turnOff() {
        System.out.println("Electric car turned off");
    }
}