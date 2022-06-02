package Assignment_9;

import java.io.*;
import java.util.Date;
import java.util.Random;

public class Ex5 {
    // Viết chương trình lưu một mảng gồm năm giá trị int 1, 2, 3, 4 và 5, một đối tượng Date cho thời điểm hiện tại
    // và giá trị double 5.5 vào tệp có tên là Ex5.dat
    public static void main(String[] args) {
        File file = new File("Ex5.dat");

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(file))) {
            for (int i = 1; i <= 5; i++) {
                output.writeInt(i);
            }
            output.writeObject(new Date());
            output.writeDouble(5.5);

            System.out.println("Writing Done !");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
