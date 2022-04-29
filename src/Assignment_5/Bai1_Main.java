package Assignment_5;

public class Bai1_Main {
    public static void main(String[] args) {
        Circle c = new Circle();

        c.setRadius(5.4);
        c.setColor("Blue");
        c.setFilled(true);

        double area = c.getArea();
        double perimeter = c.getPerimeter();
        double diameter = c.getDiameter();

        // Xem thông tin Circle Object
        c.printColor();
        System.out.println("Đường kính: " + diameter);
        System.out.println("Chu vi: " + perimeter);
        System.out.println("Diện tích: " + area);
    }
}
