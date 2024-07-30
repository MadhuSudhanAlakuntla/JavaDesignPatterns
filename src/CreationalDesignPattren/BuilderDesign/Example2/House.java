package CreationalDesignPattren.BuilderDesign.Example2;

//First, we'll define the House class, which represents the complex object to be built:
public class House {
    private String walls;
    private String roof;
    private String doors;

    public void setWalls(String walls) {
        this.walls = walls;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public void setDoors(String doors) {
        this.doors = doors;
    }

    @Override
    public String toString() {
        return "House [walls=" + walls + ", roof=" + roof + ", doors=" + doors + "]";
    }
}
