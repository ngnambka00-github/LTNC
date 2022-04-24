package Assignment_1.Circle;

public class Point {
    private double x, y;

    public Point() {
        x = y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
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
        return "P(" +  x  + ", " + y + ")";
    }
}