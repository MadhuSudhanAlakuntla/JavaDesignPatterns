package CreationalDesignPattren.FactoryDesign.Example2;

public class Car implements Factory{


    @Override
    public void engine() {
        System.out.println("car engine");
    }

    @Override
    public void tire() {
        System.out.println("car tire");
    }
}
