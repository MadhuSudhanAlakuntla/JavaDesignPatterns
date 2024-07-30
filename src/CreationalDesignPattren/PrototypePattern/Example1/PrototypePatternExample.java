package CreationalDesignPattren.PrototypePattern.Example1;


//Note similar to factory design pattern
// Client code
public class PrototypePatternExample {
    public static void main(String[] args) {
        Prototype rectangle = ShapePrototypeManager.getShape("rectangle");
        Prototype circle = ShapePrototypeManager.getShape("circle");

        ((Rectangle) rectangle).setWidth(20);
        ((Rectangle) rectangle).setHeight(10);

        ((Circle) circle).setRadius(5);

        ((Rectangle) rectangle).draw(); // Drawing a Rectangle with width 20 and height 10
        ((Circle) circle).draw(); // Drawing a Circle with radius 5
    }
}
