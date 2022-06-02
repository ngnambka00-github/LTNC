package Assignment_9;

import java.io.*;
import java.util.Random;

public class Ex4 {
    // Tạo một tệp dữ liệu nhị phân có tên là Ex4.dat.
    // Ghi vào tệp 100 số double bằng cách sử dụng phương thức writeDouble (double) trong DataOutputStream.
    // Hiển thị ra màn hình giá trị trung bình của các số trong tệp
    public static void main(String[] args) {
        File file = new File("Ex4.dat");

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        int iterNum = 100;
        Random random = new Random();
        double total = 0.0;
        try (DataOutputStream output = new DataOutputStream(new FileOutputStream(file))) {
            for (int i = 0; i < iterNum; i++) {
                double randNum = random.nextDouble();
                total += randNum;
                output.writeDouble(randNum);
            }

            System.out.println("Writing Done !");
            System.out.println("Average: " + total / iterNum);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
