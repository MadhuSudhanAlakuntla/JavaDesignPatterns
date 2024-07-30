package CreationalDesignPattren.PrototypePattern.Example1;

 class Circle implements Prototype {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    // Copy constructor
    public Circle(Circle circle) {
        this.radius = circle.radius;
    }

    @Override
    public Prototype clone() {
        return new Circle(this);
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Drawing a Circle with radius " + radius);
    }

}
