package Assignment_9;

import java.io.*;
import java.util.Random;

public class Ex3 {
    // Viết chương trình tạo tệp nhị phân có tên Ex3.dat nếu nó không tồn tại.
    // Ghi tiếp dữ liệu mới vào nó nếu nó đã tồn tại. Ghi 150 số nguyên được tạo ngẫu nhiên vào tệp bằng Binary I/O
    // (hay còn gọi là vào ra dạng Byte)
    public static void main(String[] args) {
        File file = new File("Ex3.dat");

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        int iterNum = 150;
        Random random = new Random();
        try (DataOutputStream output = new DataOutputStream(new FileOutputStream(file))) {
            for (int i = 0; i < iterNum; i++) {
                int randNum = random.nextInt();
                output.writeInt(randNum);
            }

            System.out.println("Writing Done !");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
