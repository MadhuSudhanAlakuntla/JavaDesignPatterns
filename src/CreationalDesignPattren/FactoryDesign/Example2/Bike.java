package CreationalDesignPattren.FactoryDesign.Example2;

public class Bike implements Factory{
    @Override
    public void engine() {
        System.out.println("bike engine");
    }

    @Override
    public void tire() {
        System.out.println("bike tire");
    }
}
