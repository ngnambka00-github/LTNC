package Assignment_6;

public class Square extends GeometricObject{
    private double site;

    // Default constructor function
    public Square() {
        site = 0;
    }

    // Constructor function with 1 parameter (site)
    public Square(double site) {
        this.site = site;
    }

    // Constructor function with 3 parameter (site, color, filled)
    public Square(double site, String color, boolean filled) {
        super(color, filled);
        this.site = site;
    }

    public double getSite() {
        return site;
    }

    public void setSite(double site) {
        this.site = site;
    }

    // Compute Perimeter of square
    public double getPerimeter() {
        return 4 * site;
    }

    // Compute Area of square
    @Override
    public double getArea() {
        return Math.pow(site, 2);
    }

    // Get information of Square Object
    @Override
    public String toString() {
        return "Square{" +
                "site=" + site +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                ", dateCreated=" + dateCreated +
                '}';
    }
}
