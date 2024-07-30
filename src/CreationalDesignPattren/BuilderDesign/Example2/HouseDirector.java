package CreationalDesignPattren.BuilderDesign.Example2;

//The director class is responsible for constructing the object using the builder interface.
// It defines the order in which to call the construction steps:

public class HouseDirector {
    private HouseBuilder houseBuilder;

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House constructHouse() {
        houseBuilder.buildWalls();
        houseBuilder.buildRoof();
        houseBuilder.buildDoors();
        return houseBuilder.getHouse();
    }
}
