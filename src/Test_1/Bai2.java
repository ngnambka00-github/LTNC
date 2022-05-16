package Test_1;

import java.util.Random;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] a = new int[100];
        for (int i = 0; i < 100; i++) {
            a[i] = rand.nextInt(1000);
        }
        try {
            System.out.print("Enter index of array: ");
            int n = new Scanner(System.in).nextInt();
            System.out.print("Value A[" + n + "] = " +a[n]);
        } catch (Exception exception) {
            System.out.println("Chỉ số nằm ngoài phạm vi");
        }
    }
}
