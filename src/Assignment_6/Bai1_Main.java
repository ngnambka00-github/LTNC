package Assignment_6;

public class Bai1_Main {
    public static void main(String[] args) {
        GeometricObject[] geoArr = new GeometricObject[3];
        geoArr[0] = new Circle(10);
        geoArr[1] = new Rectangle(10, 20);
        geoArr[2] = new Square(12);

        double sumArea = GeometricObject.sumArea(geoArr);
        System.out.println("Sum area: " + sumArea);

        System.out.println("\nAll information of a geometric array: ");
        for (GeometricObject geo : geoArr) {
            System.out.println(geo.toString());
        }
    }
}
