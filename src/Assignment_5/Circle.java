package Assignment_5;

public class Circle extends GeometricObject {
    private double radius;

    // Hàm khởi tạo mặc định
    public Circle() { }

    // Hàm khởi tạo 1 tham số
    public Circle(double radius) {
        this.radius = radius;
    }

    // Hàm khởi tạo nhiều tham số
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Tính diện tích
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    // Tính chu vi
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Tính bán kính
    public double getDiameter() {
        return 2 * radius;
    }

    // Xem thông tin của đổi tượng Circle
    public void printColor() {
        String result = "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                ", dateCreated=" + dateCreated +
                '}';

        System.out.println("Thông tin Circle Object: " + result);
    }
}
