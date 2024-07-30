package CreationalDesignPattren.FactoryDesign.Example2;

public class User {

    public static void main(String[] args) {

    Factory car=GetObject.createVehicle("car");
    Factory bike = GetObject.createVehicle("bike");

    car.engine();
    bike.tire();
    }
}
