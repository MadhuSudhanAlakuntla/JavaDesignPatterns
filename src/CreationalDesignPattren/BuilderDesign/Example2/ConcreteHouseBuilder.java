package CreationalDesignPattren.BuilderDesign.Example2;

//Now, we'll create a concrete builder class that implements the HouseBuilder interface:

public class ConcreteHouseBuilder implements HouseBuilder {
    private House house;

    public ConcreteHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildWalls() {
        house.setWalls("Brick walls");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Tile roof");
    }

    @Override
    public void buildDoors() {
        house.setDoors("Wooden doors");
    }

    @Override
    public House getHouse() {
        return this.house;
    }
}
