package Assignment_9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex6 {
    // Giả sử một tệp văn bản chứa các điểm của một học sinh, được phân tách bởi dấu cách.
    // Viết chương trình nhắc người dùng nhập tên tệp cần xử lý.
    // Nếu tệp không tồn tại thì dừng chương trình.
    // Hãy đọc điểm từ tệp và hiển thị tổng số điểm, điểm trung bình của học sinh đó.
    public static void main(String[] args) {
        String fileName = null;
        try {
            System.out.print("Enter file's name: ");
            fileName = new Scanner(System.in).nextLine();

            Scanner input = new Scanner(new File(fileName));
            int count = 0;
            double totalScore = 0;
            while (input.hasNext()) {
                double score = input.nextDouble();
                totalScore += score;
                count += 1;
            }
            double averageScore = totalScore / count;

            System.out.println("Total score: " + totalScore);
            System.out.println("Average score: " + averageScore);
        } catch (FileNotFoundException ex) {
            System.out.println("File " + fileName + " not found !");
        }
    }
}
