package Assignment_10;

import java.util.Date;

abstract public class GeometricObject implements Comparable<GeometricObject> {
    protected String color = "white";
    protected boolean filled = false;
    protected Date dateCreated;

    // Default constructor function
    public GeometricObject() {
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

    public static void sort(GeometricObject[] array, boolean ascending) {
        // Implement Selection Sort algorithm
        int threshold = 0;
        if (ascending) {
            threshold = -1;
        } else {
            threshold = 1;
        }

        int n = array.length;
        for (int i = 0; i < n-1; i++)
        {
            int min_element = i;
            for (int j = i+1; j < n; j++)
                if (array[j].compareTo(array[min_element]) == threshold)
                    min_element = j;

                GeometricObject temp = array[min_element];
                array[min_element] = array[i];
                array[i] = temp;
        }
    }
}

