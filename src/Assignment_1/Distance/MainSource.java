package Assignment_1.Distance;

import java.util.Scanner;

public class MainSource {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap toa do diem thu 1: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.println("Nhap toa do diem thu 2: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        Point p1 = new Point(x1, y1, "P1");
        Point p2 = new Point(x2, y2, "P2");

        System.out.println("Khoang cach 2 diem " + p1 + " va " + p2 + " la: " + p1.getDistance(p2));
    }
}
