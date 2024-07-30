package StructuralDesignPatterns.AdapterDesign.example2;

//Target class or (Product)
public class Car {
    public void startEngine() {
        System.out.println("Engine started");
    }

    public void accelerate() {
        System.out.println("Car is accelerating");
    }

    public void stopEngine() {
        System.out.println("Engine stopped");
    }
}