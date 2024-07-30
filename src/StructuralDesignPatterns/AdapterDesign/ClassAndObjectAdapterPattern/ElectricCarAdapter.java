package StructuralDesignPatterns.AdapterDesign.ClassAndObjectAdapterPattern;





/*

//Inheritance-based Adapter -> Class Adapter pattern
// Class Adapter
public class ElectricCarAdapter extends ElectricCar implements Car {
    @Override
    public void startEngine() {
        turnOn();
    }

    @Override
    public void accelerate() {
        speedUp();
    }

    @Override
    public void stopEngine() {
        turnOff();
    }
}
*/

//Composition-based Adapte -> Object Adapter pattern
// Class Adapter (Preferred implementation)
public class ElectricCarAdapter  implements Car {

    ElectricCar electricCar= new ElectricCar();

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