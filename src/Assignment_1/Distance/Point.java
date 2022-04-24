package Assignment_1.Distance;

public class Point {

    private double x, y;
    private String name;

    public Point() {
        x = y = 0;
        name = "P";
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
        name = "P";
    }

    public Point(double x, double y, String name) {
        this.x = x;
        this.y = y;
        this.name = name;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getDistance(Point p) {
        double t = Math.pow(x - p.getX(), 2) + Math.pow(y - p.getY(), 2);
        return Math.sqrt(t);
    }

    @Override
    public String toString() {
        return name + "(" +  x  + ", " + y + ")";
    }
}