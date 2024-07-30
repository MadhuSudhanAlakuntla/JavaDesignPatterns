package CreationalDesignPattren.BuilderDesign.Example2;

//Next, we'll define a builder interface that declares methods for
// constructing the parts of the House:

public interface HouseBuilder {
    void buildWalls();
    void buildRoof();
    void buildDoors();
    House getHouse();
}

