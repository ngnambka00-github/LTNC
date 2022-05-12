package Assignment_6;

import java.util.Date;

abstract public class GeometricObject implements Comparable<GeometricObject> {
    protected String color;
    protected boolean filled;
    protected Date dateCreated;

    // Default constructor function
    public GeometricObject() {
        color = "white";
        filled = false;
        dateCreated = new Date();
    }

    // Constructor function with 2 parameter (color, filled)
    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        dateCreated = new Date();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    // Get information of Geometric Object
    @Override
    public String toString() {
        return "GeometricObject{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", dateCreated=" + dateCreated +
                '}';
    }

    // Compute total of all geometric objects
    public static double sumArea(GeometricObject[] a) {
        double sum = 0;
        for (GeometricObject g : a) {
            sum += g.getArea();
        }
        return sum;
    }

    abstract  public double getArea();
    abstract public double getPerimeter();

    @Override
    public int compareTo(GeometricObject geometricObject) {
        return this.getArea() == geometricObject.getArea() ? 0 :
                this.getArea() > geometricObject.getArea() ? 1: -1;
    }

    // Get object has max area
    public static GeometricObject max(GeometricObject o1, GeometricObject o2) {
        if (o1.compareTo(o2) > 0)
            return o1;
        return o2;
    }
}

