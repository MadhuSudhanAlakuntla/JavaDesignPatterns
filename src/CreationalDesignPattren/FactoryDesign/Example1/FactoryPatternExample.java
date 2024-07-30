package CreationalDesignPattren.FactoryDesign.Example1;
// Product interface
interface Shape {
    void draw();
}

// Concrete product classes
class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Square");
    }
}

// Factory class
class ShapeFactory {
    // Factory method to create objects based on given type
    public static Shape createShape(String type) {
        if (type.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (type.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        } else if (type.equalsIgnoreCase("square")) {
            return new Square();
        } else {
            throw new IllegalArgumentException("Invalid shape type: " + type);
        }
    }
}

// Client code
public class FactoryPatternExample {
    public static void main(String[] args) {
        // Create objects using the factory
        Shape circle = ShapeFactory.createShape("circle");
        Shape rectangle = ShapeFactory.createShape("rectangle");
        Shape square = ShapeFactory.createShape("square");

        // Draw shapes
        circle.draw();
        rectangle.draw();
        square.draw();
    }
}
