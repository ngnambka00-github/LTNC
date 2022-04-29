package Assignment_5;

public class Bai3_Main {
    public static void main(String[] args) {
        MyRectangle2D r1 = new MyRectangle2D(1, 1, 10, 6);

        double x1 = 3, y1 = 3;
        MyRectangle2D r2 = new MyRectangle2D(-3, -2, 10, 5);

        System.out.println("Check 1: " + r1.contains(x1, y1));
        System.out.println("Check 2: " + r1.contains(r2));
    }
}
