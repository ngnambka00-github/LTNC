package Assignment_10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EX1 {
    // Bài 1:
    // Viết chương trình đọc các từ từ tệp văn bản và hiển thị tất cả các từ (được phép trùng lặp)
    // theo thứ tự bảng chữ cái tăng dần và giảm dần.
    public static void main(String[] args) {
        File file = new File("src/Assignment_10/Text_Ex1.txt");
        // check file whether it is existed
        if (!file.exists()){
            System.out.println("File is not existed");
            System.exit(0);
            return;
        }

        List<String> listWord = new ArrayList<>();
        try(Scanner input = new Scanner(file)) {
            // Reading word from file
            while (input.hasNext()) {
                String word = input.next();
                if (word.length() > 0) {
                    listWord.add(word);
                }
            }

            // Print ascending list
            Collections.sort(listWord);
            System.out.println("Ascending list: ");
            for (String item : listWord) {
                System.out.printf("%s ", item);
            }

            // Print descending list
            Collections.sort(listWord, Collections.reverseOrder());
            System.out.println("\n\nDescending list: ");
            for (String item : listWord) {
                System.out.printf("%s ", item);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
