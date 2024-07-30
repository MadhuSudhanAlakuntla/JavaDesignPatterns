package CreationalDesignPattren.FactoryDesign.Example2;

public class GetObject {

    public static Factory createVehicle(String type) {
        if (type.equalsIgnoreCase("car")) {
            return new Car();
        } else if (type.equalsIgnoreCase("bike")) {
            return new Bike();
        }else {
            throw new IllegalArgumentException("Invalid vehicle type: " + type);
        }
    }

}
