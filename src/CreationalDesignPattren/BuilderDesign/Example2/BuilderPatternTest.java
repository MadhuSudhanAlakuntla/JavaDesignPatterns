package CreationalDesignPattren.BuilderDesign.Example2;

//Finally, the client code uses the director to construct the house using the builder:

public class BuilderPatternTest {
    public static void main(String[] args) {
        HouseBuilder houseBuilder = new ConcreteHouseBuilder();
        HouseDirector houseDirector = new HouseDirector(houseBuilder);

        House house = houseDirector.constructHouse();
        System.out.println(house);
    }
}
