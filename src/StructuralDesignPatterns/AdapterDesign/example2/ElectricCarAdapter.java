package StructuralDesignPatterns.AdapterDesign.example2;


// when you call the feature of the electric car internally the target car methods are called
// we are just mapping all the methods in car to electric care and using
// because the  system we are using is not accepting the new electric car, so we are using adapter
public class ElectricCarAdapter extends Car{

    private final ElectricCar electricCar;

    public ElectricCarAdapter(ElectricCar electricCar) {
        this.electricCar = electricCar;
    }

    @Override
    public void startEngine() {
        electricCar.turnOn();
    }

    @Override
    public void accelerate() {
        electricCar.speedUp();
    }

    @Override
    public void stopEngine() {
        electricCar.turnOff();
    }

}
