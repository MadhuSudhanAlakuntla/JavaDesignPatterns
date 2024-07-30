package CreationalDesignPattren.PrototypePattern.Example1;

import java.util.HashMap;
import java.util.Map;

// Prototype manager
class ShapePrototypeManager {
    private static Map<String, Prototype> shapeMap = new HashMap<>();

    static {
        shapeMap.put("rectangle", new Rectangle(10, 5));
        shapeMap.put("circle", new Circle(3));
    }

    public static Prototype getShape(String type) {
        return shapeMap.get(type).clone();
    }
}