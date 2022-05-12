package Assignment_6;

public class Circle extends GeometricObject {
    private double radius;

    // Defaul constructor function
    public Circle() { }

    // Constructor function with 1 paramater (radius)
    public Circle(double radius) {
        this.radius = radius;
    }

    // Constructor function with 3 paramater (radius, color, filled)
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Compute Area of Circle
    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    // Compute Perimeter of Circle
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Compute Diameter of Circle
    public double getDiameter() {
        return 2 * radius;
    }

    // Get Information of Circle Object
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                ", dateCreated=" + dateCreated +
                '}';
    }
}
