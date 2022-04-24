package Assignment_1.Circle;

import java.util.Scanner;

public class MainSource {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhap thong tin Circle thu 1
        System.out.println("Nhap thong tin circle thu 1: ");
        System.out.println("Nhap toa do tam: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.println("Nhap ban kinh: ");
        double r1 = scanner.nextDouble();

        Circle c1 = new Circle(new Point(x1, y1), r1);

        // Nhap thong tin Circle thu 2
        System.out.println("Nhap thong tin circle thu 2: ");
        System.out.println("Nhap toa do tam: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        System.out.println("Nhap ban kinh: ");
        double r2 = scanner.nextDouble();

        Circle c2 = new Circle(new Point(x2, y2), r2);

        Feature feature = c1.getFeature(c2);

        String result = "";
        switch (feature) {
            case GIAO_NHAU:
                result = "2 hinh tron giao nhau";
                break;
            case KHONG_GIAO:
                result = "2 hinh tron khong giao nhau";
                break;
            case NAM_TRONG:
                result = "2 hinh tron nam trong nhau";
                break;
        }

        System.out.println("Ket qua: " + result);
    }
}
