package Assignment_6;

import java.util.Random;

public class Bai2_Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Circle[] cirArr = new Circle[5];
        for (int i = 0; i < cirArr.length; i++) {
            // Random radius of circle in range [0.0, 100.0]
            cirArr[i] = new Circle(rand.nextDouble() * 100);
        }

        System.out.println("Before sort: ");
        for (int i = 0; i < cirArr.length; i++) {
            System.out.println("Circle[" + i + "]: Radius: " + cirArr[i].getRadius());
        }
        System.out.println("\nAfter sort by radius: ");

        SortCircle sc = new SortCircle(cirArr);
        sc.sortOrderAsc();
        sc.printInformation();

    }
}
