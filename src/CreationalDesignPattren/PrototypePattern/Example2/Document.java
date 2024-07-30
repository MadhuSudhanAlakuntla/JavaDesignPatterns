package CreationalDesignPattren.PrototypePattern.Example2;

//First, we'll define a common interface for all documents. This interface will include a clone method:
public interface Document extends Cloneable {
    Document clone();
    void display();
}
