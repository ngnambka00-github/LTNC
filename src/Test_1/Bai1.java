package Test_1;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {

        while (true) {
            try {
                System.out.print("Enter the first integer number: ");
                int num1 = new Scanner(System.in).nextInt();

                System.out.print("Enter the second integer number: ");
                int num2 = new Scanner(System.in).nextInt();
                System.out.print("Sum of two integer numbers: " + String.valueOf(num1 + num2));

                break;
            } catch (Exception e){
                System.out.println("Please Enter Valid Integer Input Again ...\n");
            }
        }
    }
}
