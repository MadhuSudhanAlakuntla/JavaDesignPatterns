package StructuralDesignPatterns.AdapterDesign.example2;


//target class or Product
public class User {
    public static void main(String[] args) {
        Car regularCar = new Car();
        ElectricCar electricCar = new ElectricCar();
        Car electricCarAdapter = new ElectricCarAdapter(electricCar);

        System.out.println("Testing regular car:");
        regularCar.startEngine();
        regularCar.accelerate();
        regularCar.stopEngine();

//        System.out.println("\nTesting electric car without adapter:");
//
//        electricCar.turnOn();
//        electricCar.speedUp();
//        electricCar.turnOff();


        System.out.println("\nTesting electric car through adapter:");
        electricCarAdapter.startEngine();
        electricCarAdapter.accelerate();
        electricCarAdapter.stopEngine();
    }
}



/*

Existing Class (Adaptee): ElectricCar
Target Interface: Car
Adapter Class: ElectricCarAdapter
Client Code: Main
 */