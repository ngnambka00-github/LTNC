package Assignment_10;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

public class Ex3 {
    // Bài 3:
    // Viết chương trình đọc N số nguyên và hiển thị chúng theo thứ tự ngược lại với thứ tự mà chúng đã được đọc.
    // Nếu hai số liên tiếp giống nhau thì chỉ hiển thị một trong số chúng.
    // Triển khai chương trình chỉ bằng cách sử dụng ngăn xếp chứ không phải mảng hoặc hàng đợi.
    public static void main(String[] args) {
        Stack<Integer> intStack = new Stack<>();

        int N = 6;
        for (int i = 0; i < N; i++) {
            try {
                System.out.printf("Enter new number[%d]: ", (i + 1));
                int number = new Scanner(System.in).nextInt();
                if (intStack.empty()) {
                    intStack.push(number);
                }
                else if (intStack.peek() != number) {
                    intStack.push(number);
                }
            } catch (InputMismatchException ex) {
                System.out.println("Please enter again valid !\n");
                i -= 1;
            }
        }

        // loop stack
        System.out.println("\nPrint array: ");
        while (!intStack.empty()) {
            System.out.printf("%d ", intStack.pop());
        }
    }
}
