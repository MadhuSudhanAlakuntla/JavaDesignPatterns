package StructuralDesignPatterns.AdapterDesign.example2;


//  new class or (product) now it becomes existing
// now we need to make it adjust with or work with target one  , so we will use adapter
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
