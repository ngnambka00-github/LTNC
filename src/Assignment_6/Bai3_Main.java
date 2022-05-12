package Assignment_6;

public class Bai3_Main {
    public static void main(String[] args) {
        GeometricObject c1 = new Circle(10.2);
        GeometricObject c2 = new Circle(9.4);

        Circle circleMax = (Circle) GeometricObject.max(c1, c2);

        System.out.println("Geometric has area max: ");
        System.out.println(circleMax);
    }
}
