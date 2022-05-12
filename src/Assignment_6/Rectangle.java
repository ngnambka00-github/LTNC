package Assignment_6;

public class Rectangle extends GeometricObject{
    private double width, height;

    // Default constructor function
    public Rectangle() {
        width = 0;
        height = 0;
    }

    // constructor function with 2 parameters (width, height)
    public Rectangle(double newWidth, double newHeight) {
        width = newWidth;
        height = newHeight;
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Compute Area of Rectangle
    @Override
    public double getArea() {
        return width * height;
    }

    // Compute Perimeter of Rectangle
    public double getPerimeter() {
        return 2 * (width + height);
    }

    // Get information of rectangle object
    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                ", dateCreated=" + dateCreated +
                '}';
    }
}
